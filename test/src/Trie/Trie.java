package Trie;

/**
 * @Auther: liuyi
 * @Date: 2019/7/24 17:19
 * @Description: 字典树
 */

class TrieNode {
    private boolean isEnd;
    private final int size = 26;
    private TrieNode[] trieNum;

    public TrieNode(){
        trieNum = new TrieNode[size];
    }

    public boolean getIsEnd(){
        return isEnd;
    }

    public void setEnd(){
        isEnd=true;
    }

    public boolean containsKey(Character ch){
        return trieNum[ch-'a']!=null;
    }

    public void put(Character ch,TrieNode node){
        trieNum[ch-'a']=node;
    }

    public TrieNode get(Character ch){
        return trieNum[ch-'a'];
    }


}



public class Trie {

    private TrieNode root;

    /** Initialize your data structure here. */
    public Trie() {
        root=new TrieNode();
    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        TrieNode node = root;
        for(int i=0;i<word.length();i++){
            Character ch = word.charAt(i);
            if(!node.containsKey(ch)){
                node.put(ch,new TrieNode());
            }
            node=node.get(ch);
        }
        node.setEnd();
    }

    public TrieNode searchPrefix(String word){
        TrieNode node = root;
        for(int i=0;i<word.length();i++){
            Character ch=word.charAt(i);
            if(node.containsKey(ch)){
                node=node.get(ch);
            }else{
                return null;
            }
        }
        return node;
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        TrieNode node = searchPrefix(word);
        return node!=null && node.getIsEnd();
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        TrieNode node=searchPrefix(prefix);
        return node!=null;
    }
}




