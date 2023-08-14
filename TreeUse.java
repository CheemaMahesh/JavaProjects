package tree;

public class TreeUse {

	public static void main(String[] args) {
		GnericTree<Integer>root=new GnericTree<>(20);
		GnericTree<Integer>node1=new GnericTree<>(3);
		GnericTree<Integer>node2=new GnericTree<>(2);
		GnericTree<Integer>node3=new GnericTree<>(1);
		GnericTree<Integer>node4=new GnericTree<>(5);
		GnericTree<Integer>node5=new GnericTree<>(4);
root.children.add(node1);
root.children.add(node2);
root.children.add(node3);
	
	node2.children.add(node4);
	node2.children.add(node5);
print(root);
System.out.println("count of nodes: "+counts(root));
System.out.println("sum of nodes: "+ rootsum(root));
	}
	public static void print(GnericTree<Integer>root) {
		if(root==null) {
			return;
		}
		System.out.print(root.data+": ");
		for(int i=0;i<root.children.size();i++) {
			System.out.print(root.children.get(i).data+" ");
		}
		System.out.println();
for(int i=0;i<root.children.size();i++) {
	GnericTree<Integer>child=root.children.get(i);
	print(child);
}
	
	}
	public static int counts(GnericTree<Integer>root) {
		int count=1;
		for(int i=0;i<root.children.size();i++) {
			int scount=counts(root.children.get(i));
			count+=scount;
		}
		return count;
	}
	public static int rootsum(GnericTree<Integer>root) {
		int sum=root.data;
		for(int i=0;i<root.children.size();i++) {
			int ssum=rootsum(root.children.get(i));
			sum+=ssum;
		}
		return sum;
	}

}
