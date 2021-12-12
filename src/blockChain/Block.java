package blockChain;

import java.sql.Timestamp;

public class Block {
	
	// Attributes
	public String hash; 		// digital signature
	public String previousHash; // previous block
	public String data; 		// block data
	public long timeStamp; 		// 1/1/1970
	
	
	// Constructor
	public Block(String data, String previousHash) {
		this.previousHash = previousHash;
		this.data = data;
		this.timeStamp = (new Timestamp(System.currentTimeMillis())).getTime();
		
		this.hash = StringUtil.applySha256( data + previousHash + timeStamp);
		
	}
	
}



