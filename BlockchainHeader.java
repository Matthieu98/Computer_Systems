import java.util.Date;

public class BlockchainHeader {
	public String index;
	public String prev;
	private String data;
	private long startTimeStamp;
	private long endTimeStamp;
	private int nonce;
	public String hash;
	private long timestamp; 
	
	public BlockchainHeader(String data, String prev){ //block constructor
		this.data = data;
		this.prev = prev;
		this.timestamp = new Date().getTime();
		this.hash = calculateNewHash();
	}
	
	public String calculateNewHash() {
		String calchash = StringUtil.applySha256(prev + Long.toString(this.timestamp) + Integer.toString(nonce) + data);
		return calchash;
	}
	public long getTime() {
		return (this.endTimeStamp-this.startTimeStamp);
	}
	public void mineBlock(int diff) {
		this.startTimeStamp = System.currentTimeMillis();
		String target = new String(new char[diff]).replace('\0', '0');
		while(!hash.substring(0,diff).equals(target)) {
			nonce++;
			hash = calculateNewHash();
		}
		this.endTimeStamp = System.currentTimeMillis();
		//System.out.println("Block mined : " + hash);
	}
}
