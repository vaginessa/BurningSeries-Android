@file:Obfuscate

package de.datlag.burningseries.common

import android.content.Context
import android.os.SystemClock
import android.view.LayoutInflater
import android.view.MotionEvent
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.annotation.LayoutRes
import androidx.core.widget.ImageViewCompat
import androidx.viewbinding.ViewBinding
import com.google.android.material.snackbar.Snackbar
import io.michaelrocks.paranoid.Obfuscate

val ViewBinding.context: Context
	get() = this.root.context

fun ViewGroup.inflateView(
	@LayoutRes layoutId: Int
) = LayoutInflater.from(this.context).inflate(layoutId, this, false)

fun View.visible() {
	this.visibility = View.VISIBLE
}

fun View.gone() {
	this.visibility = View.GONE
}

fun View.invisible() {
	this.visibility = View.INVISIBLE
}

fun ImageView.clearTint() {
	this.clearColorFilter()
	ImageViewCompat.setImageTintList(this, null)
}

val View.anyWidth: Int?
	get() {
		return when {
			this.width > 0 -> this.width
			this.measuredWidth > 0 -> this.measuredWidth
			this.layoutParams.width == ViewGroup.LayoutParams.MATCH_PARENT -> resources?.displayMetrics?.widthPixels
			this.minimumWidth > 0 -> this.minimumWidth
			else -> null
		}
	}

val View.anyHeight: Int?
	get() {
		return when {
			this.height > 0 -> this.height
			this.measuredHeight > 0 -> this.measuredHeight
			this.layoutParams.height == ViewGroup.LayoutParams.MATCH_PARENT -> resources?.displayMetrics?.heightPixels
			this.minimumHeight > 0 -> this.minimumHeight
			else -> null
		}
	}
