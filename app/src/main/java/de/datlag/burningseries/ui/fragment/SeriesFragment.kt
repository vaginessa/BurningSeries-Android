package de.datlag.burningseries.ui.fragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.navArgs
import by.kirich1409.viewbindingdelegate.viewBinding
import dagger.hilt.android.AndroidEntryPoint
import de.datlag.burningseries.R
import de.datlag.burningseries.databinding.FragmentSeriesBinding
import de.datlag.burningseries.extend.AdvancedFragment
import de.datlag.burningseries.viewmodel.BurningSeriesViewModel
import io.michaelrocks.paranoid.Obfuscate
import timber.log.Timber

@AndroidEntryPoint
@Obfuscate
class SeriesFragment : AdvancedFragment(R.layout.fragment_series) {

    private val navArgs: SeriesFragmentArgs by navArgs()
    private val binding: FragmentSeriesBinding by viewBinding()
    private val burningSeriesViewModel: BurningSeriesViewModel by activityViewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        Timber.e(navArgs.latestEpisode.toString())
        Timber.e(navArgs.latestSeries.toString())
    }

    private fun getSafeHrefTitle(): String {
        return ""
    }
}