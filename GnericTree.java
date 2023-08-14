package tree;

import java.util.ArrayList;

public class GnericTree <T>{
T data;
ArrayList<GnericTree<T>>children;
public GnericTree(T data ){
	this.data=data;
	this.children=new ArrayList<>() ;
}
}
