package com.example.cameraxapplication.data.repository

import android.content.Context
import androidx.camera.view.PreviewView
import androidx.lifecycle.LifecycleOwner
import com.example.cameraxapplication.domain.repository.CustomCameraRepo

class CustomCameraRepoImpl: CustomCameraRepo {

    override suspend fun captureAndSaveImage(context: Context) {
        TODO("Not yet implemented")
    }

    override suspend fun showCameraPreview(
        previewView: PreviewView,
        lifecycleOwner: LifecycleOwner,
    ) {
        TODO("Not yet implemented")
    }
}