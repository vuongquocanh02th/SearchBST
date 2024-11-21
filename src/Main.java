public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        // Thêm các phần tử vào cây
        bst.insert(50);
        bst.insert(30);
        bst.insert(20);
        bst.insert(40);
        bst.insert(70);
        bst.insert(60);
        bst.insert(80);

        // Hiển thị cây theo thứ tự In-order
        System.out.println("In-order traversal of the BST:");
        bst.inOrder();
        System.out.println();

        // Kiểm tra tìm kiếm một số phần tử
        int searchElement = 40;
        if (bst.search(searchElement)) {
            System.out.println("Element " + searchElement + " found in the tree.");
        } else {
            System.out.println("Element " + searchElement + " not found in the tree.");
        }

        searchElement = 90;
        if (bst.search(searchElement)) {
            System.out.println("Element " + searchElement + " found in the tree.");
        } else {
            System.out.println("Element " + searchElement + " not found in the tree.");
        }
    }
}