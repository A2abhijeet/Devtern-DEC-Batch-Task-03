<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">
    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:orientation="vertical">

        <EditText
            android:id="@+id/note_input"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:hint="Enter note">
        </EditText>

        <Button
            android:id="@+id/add_note_button"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Add Note"/>

        <ListView
            android:id="@+id/notes_list"
            android:layout_width="match_parent"
            android:layout_height="match_parent">
        </ListView>

    </LinearLayout>
  </androidx.constraintlayout.widget.ConstraintLayout>
