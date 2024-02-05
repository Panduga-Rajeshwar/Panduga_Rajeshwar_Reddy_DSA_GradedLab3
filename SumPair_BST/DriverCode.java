package SumPair;

import java.util.ArrayList;
import java.util.Scanner;

public class DriverCode {

	static ArrayList<Integer> nodeList=new ArrayList<>();
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root=null;
		Node newNode;
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Number of Nodes");
		int size=in.nextInt();
		int i;
		int data;
		for(i=1;i<=size;i++)
		{
			System.out.println("Enter Data for Node "+i+" : ");
			data=in.nextInt();
			newNode=new Node(data);
			if(root==null)
			{
				root=newNode;
			}
			else
			{								
				insert(root,newNode);			
			}								
		}
		
		inOrder(root);
		System.out.println(nodeList);
		
		System.out.println("Enter Sum");
		int sum=in.nextInt(); 
		
		int n1;
		int n2;
		int flag=0;
		for(int j=nodeList.size()-1;j>=0;j--)
		{
			n1=nodeList.get(j);   
			n2=sum-n1;           
					if(nodeList.contains(n2))
					{
					System.out.println("Pair is ("+n2+","+n1+")");
					flag=1;
					break;
					}	
		}
		if(flag==0)
			System.out.println("Pair Nodes are not found");
		
	}
	
	static void inOrder(Node root) 
	{
		if(root!=null)
		{
		inOrder(root.left);
		nodeList.add(root.data);
		inOrder(root.right);
		}
	}
	
	private static void insert(Node root, Node nn) 
	{
		if(nn.data>root.data) 
		{
			if(root.right==null)  
			{
				root.right=nn;
			}
			else
			{
				insert(root.right,nn);
			}
		}
		else				  
		{
			if(root.left==null)  
			{
				root.left=nn;
			}
			else
			{
				insert(root.left,nn);
			}
		}
		
	}
	
}
