package qukuailian;

import java.util.ArrayList;

import com.google.gson.GsonBuilder;

public class NodeChain {
	
	public static ArrayList<Block> blocks = new ArrayList<>();
	public static int difficult = 6;
	
	public static void main(String[] args) {
		blocks.add(new Block("hi first block", "0"));
		System.out.println("Trying to Mine block 1.....");
		blocks.get(0).mineBlock(difficult);
		
		blocks.add(new Block("hi second block", blocks.get(blocks.size()-1).hash));
		System.out.println("Trying to Mine block 2.....");
		blocks.get(1).mineBlock(difficult);
		
		blocks.add(new Block("hi third block", blocks.get(blocks.size()-1).hash));
		System.out.println("Trying to Mine block 3.....");
		blocks.get(2).mineBlock(difficult);
		
		System.out.println("\nBlockChain is Valid: " + isChainValid());
		
		String json = new GsonBuilder().setPrettyPrinting().create().toJson(blocks);
		System.out.println(json);
	}
	
	
	public static Boolean isChainValid() {
		Block currentBlock;
		Block previousBlock;
		String hashTarget = new String(new char[difficult]).replace('\0', '0');
		
		for (int i = 1; i < blocks.size(); i++) {
			currentBlock = blocks.get(i);
			previousBlock = blocks.get(i-1);
			
			if(!currentBlock.hash.equals(currentBlock.calculateHash())) {
				System.out.println("current hash not equal");
				return false;
			}
			if(!previousBlock.hash.equals(currentBlock.previousHash)) {
				System.out.println("previous hash not equal");
				return false;
			}
			if(!currentBlock.hash.substring(0, difficult).equals(hashTarget)) {
				System.out.println("This block hasn't been mined");
				return false;
			}
		}
		return true;
	}
}











