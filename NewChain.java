import java.util.ArrayList;

public class NewChain {
	public static ArrayList<BlockchainHeader> blockchain = new ArrayList<BlockchainHeader>();
	//public static int difficulty = 1;
	
	public static void main(String[] args) {
			//String difficulty = "00ffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff";
			int difficulty = 1;
			for (int i = 0; i < 5; i++) {
				blockchain.add(new BlockchainHeader("first block", "0"));
				//System.out.println("Trying to mine block 1 ");
				blockchain.get(0).mineBlock(difficulty);
				System.out.println(blockchain.get(0).getTime());
			
				blockchain.add(new BlockchainHeader("second block", blockchain.get(blockchain.size()-1).hash));
				//System.out.println("Trying to mine block 2 ");
				blockchain.get(1).mineBlock(difficulty);
				System.out.println(blockchain.get(1).getTime());
			
				blockchain.add(new BlockchainHeader("third block", blockchain.get(blockchain.size()-1).hash));
				//System.out.println("Trying to mine block 3 ");
				blockchain.get(2).mineBlock(difficulty);
				System.out.println(blockchain.get(2).getTime());
			
				blockchain.add(new BlockchainHeader("fourth block", blockchain.get(blockchain.size()-1).hash));
				//System.out.println("Trying to mine block 4 ");
				blockchain.get(3).mineBlock(difficulty);
				System.out.println(blockchain.get(3).getTime());
			
				blockchain.add(new BlockchainHeader("fifth block", blockchain.get(blockchain.size()-1).hash));
				//System.out.println("Trying to mine block 5 ");
				blockchain.get(4).mineBlock(difficulty);
				System.out.println(blockchain.get(4).getTime());
			
				blockchain.add(new BlockchainHeader("sixth block", blockchain.get(blockchain.size()-1).hash));
				//System.out.println("Trying to mine block 6 ");
				blockchain.get(5).mineBlock(difficulty);
				System.out.println(blockchain.get(5).getTime());
				
				blockchain.add(new BlockchainHeader("seventh block", blockchain.get(blockchain.size()-1).hash));
				//System.out.println("Trying to mine block 7 ");
				blockchain.get(6).mineBlock(difficulty);
				System.out.println(blockchain.get(6).getTime());
			
				blockchain.add(new BlockchainHeader("eigth block", blockchain.get(blockchain.size()-1).hash));
				//System.out.println("Trying to mine block 8 ");
				blockchain.get(7).mineBlock(difficulty);
				System.out.println(blockchain.get(7).getTime());
			
				blockchain.add(new BlockchainHeader("ninth block", blockchain.get(blockchain.size()-1).hash));
				//System.out.println("Trying to mine block 9 ");
				blockchain.get(8).mineBlock(difficulty);
				System.out.println(blockchain.get(8).getTime());
			
				blockchain.add(new BlockchainHeader("tenth block", blockchain.get(blockchain.size()-1).hash));
				//System.out.println("Trying to mine block 10 ");
				blockchain.get(9).mineBlock(difficulty);
				System.out.println(blockchain.get(9).getTime());
				
				blockchain.add(new BlockchainHeader("eleventh block", blockchain.get(blockchain.size()-1).hash));
				//System.out.println("Trying to mine block 1 ");
				blockchain.get(10).mineBlock(difficulty);
				System.out.println(blockchain.get(10).getTime());
			
				blockchain.add(new BlockchainHeader("twelfth block", blockchain.get(blockchain.size()-1).hash));
				//System.out.println("Trying to mine block 2 ");
				blockchain.get(11).mineBlock(difficulty);
				System.out.println(blockchain.get(11).getTime());
			
				blockchain.add(new BlockchainHeader("13 block", blockchain.get(blockchain.size()-1).hash));
				//System.out.println("Trying to mine block 3 ");
				blockchain.get(12).mineBlock(difficulty);
				System.out.println(blockchain.get(12).getTime());
			
				blockchain.add(new BlockchainHeader("14 block", blockchain.get(blockchain.size()-1).hash));
				//System.out.println("Trying to mine block 4 ");
				blockchain.get(13).mineBlock(difficulty);
				System.out.println(blockchain.get(13).getTime());
			
				blockchain.add(new BlockchainHeader("15 block", blockchain.get(blockchain.size()-1).hash));
				//System.out.println("Trying to mine block 5 ");
				blockchain.get(14).mineBlock(difficulty);
				System.out.println(blockchain.get(14).getTime());
			
				blockchain.add(new BlockchainHeader("16 block", blockchain.get(blockchain.size()-1).hash));
				//System.out.println("Trying to mine block 6 ");
				blockchain.get(15).mineBlock(difficulty);
				System.out.println(blockchain.get(15).getTime());
				
				blockchain.add(new BlockchainHeader("17 block", blockchain.get(blockchain.size()-1).hash));
				//System.out.println("Trying to mine block 7 ");
				blockchain.get(16).mineBlock(difficulty);
				System.out.println(blockchain.get(16).getTime());
			
				blockchain.add(new BlockchainHeader("18 block", blockchain.get(blockchain.size()-1).hash));
				//System.out.println("Trying to mine block 8 ");
				blockchain.get(17).mineBlock(difficulty);
				System.out.println(blockchain.get(17).getTime());
			
				blockchain.add(new BlockchainHeader("19 block", blockchain.get(blockchain.size()-1).hash));
				//System.out.println("Trying to mine block 9 ");
				blockchain.get(18).mineBlock(difficulty);
				System.out.println(blockchain.get(18).getTime());
			
				blockchain.add(new BlockchainHeader("20 block", blockchain.get(blockchain.size()-1).hash));
				//System.out.println("Trying to mine block 10 ");
				blockchain.get(19).mineBlock(difficulty);
				System.out.println(blockchain.get(19).getTime());
				difficulty++;
			}
			
			
	}

}
