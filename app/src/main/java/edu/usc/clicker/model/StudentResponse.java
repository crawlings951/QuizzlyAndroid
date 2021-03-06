package edu.usc.clicker.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by crawl_000 on 4/14/2016.
 */
public class StudentResponse implements Parcelable {
    @SerializedName("question")
    @Expose
    private String questionText;
    @SerializedName("student_answer")
    @Expose
    private String student_answer;
    @SerializedName("correct_answer")
    @Expose
    private String correct_answer;

    public String getStudent_answer() {
        return student_answer;
    }

    public void setStudent_answer(String student_answer) {
        this.student_answer = student_answer;
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public String getCorrectAnswer() {
        return correct_answer;
    }

    public void setCorrectAnswer(String c) {
        this.correct_answer = c;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.questionText);
        dest.writeString(this.student_answer);
        dest.writeString(this.correct_answer);
    }
    public StudentResponse() {
    }

    protected StudentResponse(Parcel in) {
        this.questionText = in.readString();
        this.student_answer = in.readString();
        this.correct_answer = in.readString();
    }

    public static final Parcelable.Creator<StudentResponse> CREATOR = new Parcelable.Creator<StudentResponse>() {
        public StudentResponse createFromParcel(Parcel source) {
            return new StudentResponse(source);
        }

        public StudentResponse[] newArray(int size) {
            return new StudentResponse[size];
        }
    };
}
