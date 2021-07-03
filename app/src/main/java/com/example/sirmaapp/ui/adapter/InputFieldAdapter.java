package com.example.sirmaapp.ui.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sirmaapp.R;
import com.example.sirmaapp.model.InputField;
import com.example.sirmaapp.util.PersonalDiffUtil;

import java.util.List;

public class InputFieldAdapter extends RecyclerView.Adapter<InputFieldAdapter.InputFieldHolder> {
    private List<InputField> inputFieldsList;

    public InputFieldAdapter(List<InputField> inputFieldsList) {
        this.inputFieldsList = inputFieldsList;
    }

    @NonNull
    @Override
    public InputFieldHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View iView = LayoutInflater.from(parent.getContext()).inflate(R.layout.content_detail,parent,false);
        return new InputFieldHolder(iView);
    }

    @Override
    public void onBindViewHolder(@NonNull InputFieldHolder holder, int position) {

        InputField inputField = inputFieldsList.get(position);
        holder.birthDate.setText("D_O_B : "+inputField.getBirthDate());
        holder.bloodGrp.setText("Blood Group : "+inputField.getBloodGroup());
        holder.passportId.setText("Passport ID : "+inputField.getPassportId());
        holder.address.setText("Address : "+inputField.getAddress());
        holder.passportIssued.setText("Issued Date : "+inputField.getPassportIssued());
        holder.passportExpired.setText("Expiry Date : "+inputField.getPassportExpired());
        holder.fieldName.setText("First Name : "+inputField.getFieldName());
        holder.displayName.setText("Last Name : "+inputField.getDisplayName());
    }

    @Override
    public int getItemCount() {
        return inputFieldsList.size();
    }

    public class InputFieldHolder extends RecyclerView.ViewHolder {
        private TextView fieldName, displayName,address,passportId, passportIssued,passportExpired,birthDate,bloodGrp;
        public InputFieldHolder(@NonNull View itemView) {
            super(itemView);
            fieldName = itemView.findViewById(R.id.nameField);
            displayName = itemView.findViewById(R.id.nameDisplay);
            address  = itemView.findViewById(R.id.tvAddress);
            passportId = itemView.findViewById(R.id.tvPassportID);
            passportIssued = itemView.findViewById(R.id.tvPassportIssued);
            passportExpired = itemView.findViewById(R.id.tvPassportExpired);
            birthDate = itemView.findViewById(R.id.tvBirthDate);
            bloodGrp = itemView.findViewById(R.id.tvBloodGrp);
        }
    }

    public void addTasks(List<InputField> newInputField) {

        PersonalDiffUtil personalDiffUtil = new PersonalDiffUtil(inputFieldsList,newInputField);
        DiffUtil.DiffResult diffResult = DiffUtil.calculateDiff(personalDiffUtil);
        inputFieldsList.clear();
        inputFieldsList.addAll(newInputField);
        diffResult.dispatchUpdatesTo(this);

    }
}
