package ac.uk.susx.tag.freebase;

import java.io.InputStream;

import com.hp.hpl.jena.graph.Graph;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.util.FileManager;

public class Reader {
	
	
	private final String freebaseLoc;
	
	
	public Reader(String freebaseLoc){
		this.freebaseLoc = freebaseLoc;
	}
	
	public void testReader(){
		Model model = ModelFactory.createDefaultModel();
		InputStream is = FileManager.get().open(freebaseLoc);
		model.read(is,null);
		Graph mg = model.getGraph();
		System.err.println(mg.size());
	}
	
	public static void main(String[] args){
		Reader r = new Reader("/Volumes/External/Freebase/freebase-rdf-2013-02-10-00-00");
		r.testReader();
	}

}
