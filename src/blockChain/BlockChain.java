package blockChain;

import java.util.ArrayList;

public class BlockChain {
	
	static ArrayList<Block> blockchain = new ArrayList<Block>();

	public static void main(String[] args) {	
		Block genesisBlock = new Block("Hi im the first block", "0") ;
		Block secondBlock = new Block("Yo im the second block",genesisBlock.hash) ;
		Block thirdBlock = new Block("Hey im the third block",secondBlock.hash) ;
		
		blockchain.add(genesisBlock);
		blockchain.add(secondBlock);
		blockchain.add(thirdBlock);
		
		String blockchainJson = StringUtil.getJson(blockchain);
		
		System.out.println("the number of blocks in the blockchain : "+blockchain.size());
		System.out.println(blockchainJson);
		
		
	}

}

