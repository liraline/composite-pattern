package aps;

public class App {
    public static void main(String[] args) throws Exception {
        /* 
         * all products (leaves) and boxes (composites) as well as 
         * the tree elements arrangement will follow the Complex Order
         * example shown on activity doc
         */


         
        /* left subtree */
        BoxComposite leftBox = new BoxComposite();
        ProductLeaf hammer = new ProductLeaf(35.5);
        leftBox.addProduct(hammer);


        /* middle subtree */
        BoxComposite middleBox = new BoxComposite();
        BoxComposite middleInnerLeftBox = new BoxComposite();
        BoxComposite middleInnerRightBox = new BoxComposite();

        ProductLeaf phone = new ProductLeaf(1200);
        ProductLeaf earPhone = new ProductLeaf(70);
        ProductLeaf charger = new ProductLeaf(130);

        middleInnerLeftBox.addProduct(phone);
        middleInnerLeftBox.addProduct(earPhone);
        middleInnerRightBox.addProduct(charger);

        middleBox.addProduct(middleInnerLeftBox);
        middleBox.addProduct(middleInnerRightBox);


        /* right subtree */
        ProductLeaf recipt = new ProductLeaf(0);


        /* root */
        BoxComposite rootBox = new BoxComposite();
        rootBox.addProduct(leftBox);
        rootBox.addProduct(middleBox);
        rootBox.addProduct(recipt);


        System.out.println("Total price of products: " + rootBox.getPrice());
    }
}
