/**
* <ul>
* Android Tutorial, An <strong>Android2EE</strong>'s project.</br>
* Produced by <strong>Dr. Mathias SEGUY</strong> with the smart contribution of <strong>Julien PAPUT</strong>.</br>
* Delivered by <strong>http://android2ee.com/</strong></br>
* Belongs to <strong>Mathias Seguy</strong></br>
* ****************************************************************************************************************</br>
* This code is free for any usage but can't be distribute.</br>
* The distribution is reserved to the site <strong>http://android2ee.com</strong>.</br>
* The intelectual property belongs to <strong>Mathias Seguy</strong>.</br>
* <em>http://mathias-seguy.developpez.com/</em></br>
* </br>
* For any information (Advice, Expertise, J2EE or Android Training, Rates, Business):</br>
* <em>mathias.seguy.it@gmail.com</em></br>
* *****************************************************************************************************************</br>
* Ce code est libre de toute utilisation mais n'est pas distribuable.</br>
* Sa distribution est reservée au site <strong>http://android2ee.com</strong>.</br>
* Sa propriété intellectuelle appartient à <strong>Mathias Séguy</strong>.</br>
* <em>http://mathias-seguy.developpez.com/</em></br>
* </br>
* Pour tous renseignements (Conseil, Expertise, Formations J2EE ou Android, Prestations, Forfaits):</br>
* <em>mathias.seguy.it@gmail.com</em></br>
* *****************************************************************************************************************</br>
* Merci à vous d'avoir confiance en Android2EE les Ebooks de programmation Android.
* N'hésitez pas à nous suivre sur twitter: http://fr.twitter.com/#!/android2ee
* N'hésitez pas à suivre le blog Android2ee sur Developpez.com : http://blog.developpez.com/android2ee-mathias-seguy/
* *****************************************************************************************************************</br>
* com.android2ee.android.tuto</br>
* 25 mars 2011</br>
*/
package com.android2ee.android.tuto.gui.menu;

import android.app.Activity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

/**
 * @author (Julien PAPUT sous la direction du Dr. Mathias Séguy)
 * @goals This class aims to:
 *        <ul>
 *        <li>An Exemple of Menu</li>
 *        </ul>
 */
public class ThirdTab extends Activity {
	
	/******************************************************************************************/
	/** Attributes **************************************************************************/
	/******************************************************************************************/
	EditText EditText;
	
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.menucontext);
		
		/******************************************************************************************/
		/** Define the EditText ********************************************************************/
		/******************************************************************************************/
		EditText edtText= (EditText) this.findViewById(R.id.EditText);
		
		registerForContextMenu(edtText);

	}
	
	@Override
	//Create the Context Menu
	public void onCreateContextMenu(ContextMenu menu, View v, ContextMenuInfo menuInfo) {
	    
	    new MenuInflater(getApplication()).inflate(R.menu.menu, menu);
	    super.onCreateContextMenu(menu,v,menuInfo);
	}
	
	/* Handles item selections */
    @Override
    public boolean onContextItemSelected(MenuItem item) {

        switch (item.getItemId()) {
        //if the Chocolate item is selected 
        case R.id.chocolate:
        	EditText.setText(R.string.chocolate);
            return true;
        //if the Chocolate item is selected 
        case R.id.television:
        	EditText.setText(R.string.television);
            return true;
        //if the Chocolate item is selected 
    	case R.id.internet:
    		EditText.setText(R.string.internet);
    		return true;
    	//if the Chocolate item is selected 
    	case R.id.nicotine:
    		EditText.setText(R.string.nicotine);
    		return true;
    	//if the Chocolate item is selected 
    	case R.id.hug:
    		EditText.setText(R.string.hug);
    		return true;
    	//if the Chocolate item is selected 
    	case R.id.santa:
    		EditText.setText(R.string.santa);
    		return true;
    	
        }
    
        return super.onContextItemSelected(item);
    }
}
