package com.devd.people.ui;

import com.devd.people.R;
import com.devd.people.communicator.Communicator;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

public class PeopleListFragment extends Fragment implements OnClickListener {
	Button btn;
	int counter = 0;
	Communicator mComm;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		return inflater
				.inflate(R.layout.people_list_fragment, container, false);
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onActivityCreated(savedInstanceState);
		mComm = (Communicator) getActivity();
		btn = (Button) getActivity().findViewById(R.id.button1);
		btn.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if (v.getId() == btn.getId()) {
			// TODO
			counter++;
			mComm.respond("The button was  clicked " + counter + " times!!!");
		}

	}

}
