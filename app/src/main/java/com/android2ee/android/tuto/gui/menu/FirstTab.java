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
import android.view.MenuItem;
import android.view.SubMenu;
import android.widget.Toast;

/**
 * @author (Julien PAPUT sous la direction du Dr. Mathias Séguy)
 * @goals
 * This class aims to:
 * <ul><li>An Exemple of Menu</li></ul>
 */

public class FirstTab extends Activity{
	/******************************************************************************************/
	/** Attributes **************************************************************************/
	/******************************************************************************************/
	private static final int CHOCOLATE = 1;
	private static final int TELEVISION = 2;
	private static final int INTERNET = 3;
	private static final int NICOTINE = 4;
	private static final int HUG = 5;
	private static final int SANTA = 6;

	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menusimpl);
        
    }
    
   
    //called at the menu creation
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
    	// add items to the menu
        menu.add(0, CHOCOLATE, 0, R.string.chocolate);
        menu.add(0, TELEVISION, 0, R.string.television);
        menu.add(0, INTERNET, 0, R.string.internet);
        menu.add(0, NICOTINE, 0, R.string.nicotine);
        menu.add(0, HUG, 0, R.string.hug);
        menu.add(0, SANTA, 0, R.string.santa);
        return true;
    }
    
    
    
    /* (non-Javadoc)
	 * @see android.app.Activity#onPrepareOptionsMenu(android.view.Menu)
	 */
	@Override
	public boolean onPrepareOptionsMenu(Menu menu) {
		//remove item
		menu.removeItem(R.id.chocolate);
		//remove item group
		menu.removeGroup(R.id.itemGroup1);
		//add item (groupId,itemId,order,titleRes)
		menu.add(Menu.NONE, R.id.hug, Menu.NONE, R.string.hug);
		//add group:just set the same groupId for those elements
		//add subMenu
		SubMenu subMenu=menu.addSubMenu("subMenuTitle");
		//add item in the subMenu (groupId,itemId,order,titleRes)
		subMenu.add(Menu.NONE, R.id.hug, Menu.NONE, R.string.hug);
		//clear or close the menu
		menu.clear();
		menu.close();
		//Manage group 
		//(groupId,Checkable,exclusive)
		menu.setGroupCheckable(R.id.itemGroup1, true, true);
		//(groupId,enable)
		menu.setGroupEnabled(R.id.itemGroup1, true);
		//(groupId,visible)
		menu.setGroupVisible(R.id.itemGroup1, true);
		
		return super.onPrepareOptionsMenu(menu);
		
	}


	/* Handles item selections */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
        //if the Chocolate item is selected 
        case CHOCOLATE:
        	Toast.makeText(FirstTab.this, R.string.chocolate, Toast.LENGTH_LONG).show();
            return true;
        //if the Chocolate item is selected 
        case TELEVISION:
        	Toast.makeText(FirstTab.this, R.string.television, Toast.LENGTH_LONG).show();
            return true;
        //if the Chocolate item is selected 
    	case INTERNET:
    		Toast.makeText(FirstTab.this, R.string.internet, Toast.LENGTH_LONG).show();
    		return true;
    	//if the Chocolate item is selected 
    	case NICOTINE:
    		Toast.makeText(FirstTab.this, R.string.nicotine, Toast.LENGTH_LONG).show();
    		return true;
    	//if the Chocolate item is selected 
    	case HUG:
    		Toast.makeText(FirstTab.this, R.string.hug, Toast.LENGTH_LONG).show();
    		return true;
    	//if the Chocolate item is selected 
    	case SANTA:
    		Toast.makeText(FirstTab.this, R.string.santa, Toast.LENGTH_LONG).show();
    		return true;
        }
    
        return false;
    }
}


