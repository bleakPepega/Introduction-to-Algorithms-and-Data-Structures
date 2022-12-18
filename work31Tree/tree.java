import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

class Processor {
  public int key;
  public String name;
  public double clockFrequency;
  public int cacheSize;
  public double systemBusFrequency;
  public int specintResult;
  public int specfpResult;
  public Processor(String line) {
    String[] fields = line.split(",");
    this.key = Integer.parseInt(fields[0]);
    this.name = fields[1];
    this.clockFrequency = Double.parseDouble(fields[2]);
    this.cacheSize = Integer.parseInt(fields[3]);
    this.systemBusFrequency = Double.parseDouble(fields[4]);
    this.specintResult = Integer.parseInt(fields[5]);
    this.specfpResult = Integer.parseInt(fields[6]);
  }

  public void print() {
    System.out.println("Key: " + this.key);
    System.out.println("Name: " + this.name);
    System.out.println("Clock Frequency: " + this.clockFrequency);
    System.out.println("Cache Size: " + this.cacheSize);
    System.out.println("System Bus Frequency: " + this.systemBusFrequency);
    System.out.println("SPECint Result: " + this.specintResult);
    System.out.println("SPECfp Result: " + this.specfpResult);
  }
}

class TwoThreeTreeNode {
  public Processor data1;
  public Processor data2;
  public TwoThreeTreeNode left;
  public TwoThreeTreeNode middle;
  public TwoThreeTreeNode right;
  public TwoThreeTreeNode(Processor data) {
    this.data1 = data;
  }
  public TwoThreeTreeNode(Processor data1, Processor data2) {
    this.data1 = data1;
    this.data2 = data2;
  }
  public void print(String indent) {
    if (this.data2 == null) {
      this.data1.print();
    } else {
      this.middle.print(indent + "  ");
      this.data1.print();
      this.right.print(indent + "  ");
      this.data2.print();
      this.left.print(indent + "  ");
    }
}

public class TwoThreeTree {
  public TwoThreeTreeNode root;

  public void insert(Processor data) {
    if (this.root == null) {
      this.root = new TwoThreeTreeNode(data);
      return;
    }

    TwoThreeTreeNode current = this.root;
    while (true) {
      if (current.data2 == null) {
        break;
      }

      if (data.key < current.data1.key) {
        current = current.left;
      } else if (current.data2 == null || data.key < current.data2.key) {
        current = current.middle;
      } else {
        current = current.right;
      }
    }

    if (current.data1 == null) {
      current.data1 = data;
    } else {
      current.data2 = data;
    }

    this.split(current);
  }

  public void split(TwoThreeTreeNode node) {
    if (node.data2 == null) {
      return;
    }

    TwoThreeTreeNode left = new TwoThreeTreeNode(node.data1);
    TwoThreeTreeNode right = new TwoThreeTreeNode(node.data2);

    node.data1 = node.data2;
    node.data2 = null;
    node.left = left;
    node.middle = right;
    node.right = null;
    if (node.parent != null) {
      this.split(node.parent);
    } else {
      TwoThreeTreeNode newRoot = new TwoThreeTreeNode(node.data1);
      newRoot.left = node;
      newRoot.middle = node.middle;
      newRoot.right = null;
      node.parent = newRoot;
      this.root = newRoot;
    }
  }

  public void find(int key) {
    TwoThreeTreeNode current = this.root;
    while (current != null) {
      if (current.data2 == null) {
        if (current.data1.key == key) {
          current.data1.print();
          return;
        } else {
          System.out.println("Key not found.");
          return;
        }
      }

      if (key < current.data1.key) {
        current = current.left;
      } else if (current.data2 == null || key < current.data2.key) {
        current = current.middle;
      } else {
        current = current.right;
      }
    }
  }

  public void print() {
    if (this.root != null) {
      this.root.print("");
    }
  }
}

public class Main {
  public static void main(String[] args) {
    TwoThreeTree tree = new TwoThreeTree();
    try (BufferedReader reader = new BufferedReader(new FileReader("PROCS.TXT"))) {
      String line;
      while ((line = reader.readLine()) != null) {
        Processor proc = new Processor(line);
        tree.insert(proc);
      }
    } catch (IOException e) {
      e.printStackTrace();
      return;
    }

    Scanner scanner = new Scanner(System.in);
    while (true) {
      System.out.print("Enter command: ");
      String command = scanner.nextLine();
      if (command.startsWith("FIND")) {
        int key = Integer.parseInt(command.substring(5));
        tree.find(key);
      } else if (command.equals("PRINT")) {
        tree.print();
      } else if (command.equals("EXIT")) {
        break;
      } else {
        System.out.println("Invalid command.");
      }
    }
  }
}


