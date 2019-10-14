package com.example.sirmaapp.util;

import androidx.annotation.Nullable;
import androidx.recyclerview.widget.DiffUtil;

import com.example.sirmaapp.model.InputField;

import java.util.List;

public class PersonalDiffUtil extends DiffUtil.Callback {

    List<InputField> oldNoteList;
    List<InputField> newNoteList;
    public PersonalDiffUtil(List<InputField> oldNoteList, List<InputField> newNoteList) {
        this.oldNoteList = oldNoteList;
        this.newNoteList = newNoteList;
    }

    @Override
    public int getOldListSize() {
        return oldNoteList.size();
    }

    @Override
    public int getNewListSize() {
        return newNoteList.size();
    }

    @Override
    public boolean areItemsTheSame(int oldItemPosition, int newItemPosition) {
        return oldNoteList.get(oldItemPosition).getId() == newNoteList.get(newItemPosition).getId();
    }

    @Override
    public boolean areContentsTheSame(int oldItemPosition, int newItemPosition) {
        return oldNoteList.get(oldItemPosition).equals(newNoteList.get(newItemPosition));
    }

    @Nullable
    @Override
    public Object getChangePayload(int oldItemPosition, int newItemPosition) {
        //you can return particular field for changed item.
        return super.getChangePayload(oldItemPosition, newItemPosition);
    }
}
