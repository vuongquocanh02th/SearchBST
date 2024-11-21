public class BinarySearchTree {
    Node root;

    public BinarySearchTree() {
        root = null;
    }

    // Phương thức thêm phần tử vào cây
    public void insert(int data) {
        root = insertRec(root, data);
    }

    private Node insertRec(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }

        if (data < root.data) {
            root.left = insertRec(root.left, data);
        } else if (data > root.data) {
            root.right = insertRec(root.right, data);
        }

        return root;
    }

    // Phương thức tìm kiếm phần tử trong BST
    public boolean search(int data) {
        return searchRec(root, data);
    }

    // Phương thức đệ quy thực hiện tìm kiếm
    private boolean searchRec(Node root, int data) {
        // Nếu root là null, tức là không tìm thấy phần tử
        if (root == null) {
            return false;
        }

        // Nếu phần tử tìm thấy
        if (data == root.data) {
            return true;
        }

        // Nếu phần tử cần tìm nhỏ hơn root.data, tìm trong cây con bên trái
        if (data < root.data) {
            return searchRec(root.left, data);
        }

        // Nếu phần tử cần tìm lớn hơn root.data, tìm trong cây con bên phải
        return searchRec(root.right, data);
    }

    // Phương thức duyệt cây theo thứ tự In-order để hiển thị cây
    public void inOrder() {
        inOrderRec(root);
    }

    private void inOrderRec(Node root) {
        if (root != null) {
            inOrderRec(root.left);
            System.out.print(root.data + " ");
            inOrderRec(root.right);
        }
    }
}
