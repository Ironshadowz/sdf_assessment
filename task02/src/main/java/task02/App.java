package task02;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.print.attribute.standard.QueuedJobCount;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
         //String dirpath = args[0];
                // I don't know how to open from another directory
                //I put the two folder in this directory instead
        File currentDir = new File(".");
        File parentDir = currentDir.getParentFile();
        File newfile = new File("frost");
        
        File[] fileList = newfile.listFiles();
        for(File f : fileList)
        {
            String text = "";
            FileReader readfile = new FileReader(f);
            BufferedReader br = new BufferedReader(readfile);
            String line = "";
            while((line=br.readLine())!=null)
            {
                text = text.concat(line+" ");
            }
            //System.out.println(text);
            br.close();
            readfile.close();
            String[] words = text.replaceAll("\\p{Punct}", "").toLowerCase().trim().split("\\s+");
            // for(int j = 0; j<words.length; j++)
            // {
            //     System.out.print(words[j]);
            // }
            
            Map<String, Map<String, Integer>> data = new HashMap<>();
            Map<String, Integer> wordCount = new HashMap<>();
           
            // data.put(words[0], new HashMap<>());
            // data.get(words[0]).put(words[1], 1);
            
            for(int i = 0; i<words.length; i++)
            {   
                try
                {
                if(data.get(words[i])==null && words[i+1]!=null)
                {                    
                    data.put(words[i], new HashMap<>());
                    data.get(words[i]).put(words[i+1], 1);
                } else
                {
                    try
                    {
                        Integer p = data.get(words[i]).get(words[i+1]);
                        
                        data.get(words[i]).put(words[i+1], p+1);     
                    } catch(Exception e)
                    {

                    }      
                }
                } catch(Exception e)
                {

                }
            }
            for(int i = 0; i<words.length; i++)
            {   
                
                Integer o = wordCount.get(words[i]);
                if(o==null)
                {
                    wordCount.put(words[i], 1);
                } else
                {
                    wordCount.put(words[i], o+1);
                }

            }
            for(String d : wordCount.keySet())
            {
               try
               {
                 for(String l : data.get(d).keySet())
                {
                    double dd = data.get(d).get(l) / wordCount.get(l);
                    if(dd==0)
                    {
                        continue;
                    }
                    System.out.println(" Key:"+d+"\n value:"+data.get(d).keySet()+" "+dd);
                }
               } catch(Exception e)
               {

               }
            }
        }
        File newfile2 = new File("seuss");
        
        File[] fileList2 = newfile.listFiles();
        for(File f : fileList)
        {
            String text = "";
            FileReader readfile = new FileReader(f);
            BufferedReader br = new BufferedReader(readfile);
            String line = "";
            while((line=br.readLine())!=null)
            {
                text = text.concat(line+" ");
            }
            //System.out.println(text);
            br.close();
            readfile.close();
            String[] words = text.replaceAll("\\p{Punct}", "").toLowerCase().trim().split("\\s+");
            // for(int j = 0; j<words.length; j++)
            // {
            //     System.out.print(words[j]);
            // }
            
            Map<String, Map<String, Integer>> data = new HashMap<>();
            Map<String, Integer> wordCount = new HashMap<>();
           
            // data.put(words[0], new HashMap<>());
            // data.get(words[0]).put(words[1], 1);
            
            for(int i = 0; i<words.length; i++)
            {   
                try
                {
                if(data.get(words[i])==null && words[i+1]!=null)
                {                    
                    data.put(words[i], new HashMap<>());
                    data.get(words[i]).put(words[i+1], 1);
                } else
                {
                    try
                    {
                        Integer p = data.get(words[i]).get(words[i+1]);
                        
                        data.get(words[i]).put(words[i+1], p+1);     
                    } catch(Exception e)
                    {

                    }      
                }
                } catch(Exception e)
                {

                }
            }
            for(int i = 0; i<words.length; i++)
            {   
                
                Integer o = wordCount.get(words[i]);
                if(o==null)
                {
                    wordCount.put(words[i], 1);
                } else
                {
                    wordCount.put(words[i], o+1);
                }

            }
            for(String d : wordCount.keySet())
            {
               try
               {
                 for(String l : data.get(d).keySet())
                {
                    double dd = data.get(d).get(l) / wordCount.get(l);
                    if(dd==0)
                    {
                        continue;
                    }
                    System.out.println(" Key:"+d+"\n value:"+data.get(d).keySet()+" "+dd);
                }
               } catch(Exception e)
               {

               }
            }
        }
           
        
    }
}
