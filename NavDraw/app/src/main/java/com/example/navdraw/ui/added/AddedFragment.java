package com.example.navdraw.ui.added;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.navdraw.R;
import com.example.navdraw.databinding.AddedFragmentBinding;
import com.example.navdraw.databinding.FragmentHomeBinding;
import com.example.navdraw.ui.home.HomeViewModel;

public class AddedFragment extends Fragment {

    private AddedFragmentBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        AddedViewModel addedViewModel =
                new ViewModelProvider(this).get(AddedViewModel.class);

        binding = AddedFragmentBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textAdded;
        addedViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}