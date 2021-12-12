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
		
		Timestamp timeStampMil = new Timestamp(System.currentTimeMillis());
		this.timeStamp = timeStampMil.getTime();
		
		this.hash = calculatedHash();
			
		
		
		
	}

	
	public String calculatedHash() {
	
		
		String calculatedhash = StringUtil.applySha256( 
				data + previousHash + timeStamp
				);
		
		
	
		return calculatedhash;
		
	}
	
	
	
	
	
	
	
	
	
	
	public String getHash() {
		return hash;
	}

	

	public void setHash(String hash) {
		this.hash = hash;
	}

	public String getPreviousHash() {
		return previousHash;
	}

	public void setPreviousHash(String previousHash) {
		this.previousHash = previousHash;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
	
}



