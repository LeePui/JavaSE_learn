package qukuailian;

import java.util.ArrayList;

import com.google.gson.GsonBuilder;

public class NodeChain {
	
	public static ArrayList<Block> blocks = new ArrayList<>();
	
	public static void main(String[] args) {
		blocks.add(new Block("hi first block", "0"));
		blocks.add(new Block("hi second block", blocks.get(blocks.size()-1).hash));
		blocks.add(new Block("hi third block", blocks.get(blocks.size()-1).hash));
		
		String json = new GsonBuilder().setPrettyPrinting().create().toJson(blocks);
		System.out.println(json);
	}

}
