package blockChain;

import java.util.ArrayList;

public class BlockChain {
	
	static ArrayList<Block> blockchain = new ArrayList<Block>();

	public static void main(String[] args) {	
		// Instatiate 3 Blocks
		Block genesisBlock = new Block("Hi im the first block", "0") ;
		Block secondBlock = new Block("Yo im the second block",genesisBlock.hash) ;
		Block thirdBlock = new Block("Hey im the third block",secondBlock.hash) ;
		
		// Create a chain
		blockchain.add(genesisBlock);
		blockchain.add(secondBlock);
		blockchain.add(thirdBlock);
		
		// System.out.println(blockchain);

		String blockchainJson = StringUtil.getJson(blockchain);
		System.out.println(blockchainJson);
		
		System.out.println("the number of blocks in the blockchain : "+blockchain.size());
		
		
	}

}

