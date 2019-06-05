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
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

/**
 *@author (Julien PAPUT sous la direction du Dr. Mathias Séguy)
 * @goals This class aims to:
 *        <ul>
 *        <li>An Exemple of Menu</li>
 *        </ul>
 */
public class SecondTab extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.menusimpl);
	}
	
	@Override
	//Create the Context Menu
	public boolean onCreateOptionsMenu(Menu menu) {
	    MenuInflater inflater = getMenuInflater();
	    inflater.inflate(R.menu.menu, menu);
	    return true;
	}
	
	 /* Handles item selections */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
        //if the Chocolate item is selected 
        case R.id.chocolate:
        	Toast.makeText(SecondTab.this, R.string.chocolate, Toast.LENGTH_LONG).show();
            return true;
        //if the Chocolate item is selected 
        case R.id.television:
        	Toast.makeText(SecondTab.this, R.string.television, Toast.LENGTH_LONG).show();
            return true;
        //if the Chocolate item is selected 
    	case R.id.internet:
    		Toast.makeText(SecondTab.this, R.string.internet, Toast.LENGTH_LONG).show();
    		return true;
    	//if the Chocolate item is selected 
    	case R.id.nicotine:
    		Toast.makeText(SecondTab.this, R.string.nicotine, Toast.LENGTH_LONG).show();
    		return true;
    	//if the Chocolate item is selected 
    	case R.id.hug:
    		Toast.makeText(SecondTab.this, R.string.hug, Toast.LENGTH_LONG).show();
    		return true;
    	//if the Chocolate item is selected 
    	case R.id.santa:
    		Toast.makeText(SecondTab.this, R.string.santa, Toast.LENGTH_LONG).show();
    		return true;
        }  
        //If working with fragments, ensure them to chceck if the item belongs to them.
        return super.onOptionsItemSelected(item);
    }
}
