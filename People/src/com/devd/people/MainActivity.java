package com.devd.people;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

import com.devd.people.communicator.Communicator;
import com.devd.people.ui.IndividualDetailFragment;

public class MainActivity extends ActionBarActivity implements Communicator{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.people);

	}

	@Override
	public void respond(String data) {
		// TODO Auto-generated method stub
		IndividualDetailFragment f = (IndividualDetailFragment) getSupportFragmentManager().findFragmentById(R.id.individual_detail_fragment);
		f.changeText(data);
	
	}

}
