package thiengo.com.br.torneioscontinentais.fragment

import kotlinx.android.synthetic.main.lista_jogos.*
import thiengo.com.br.torneioscontinentais.adapter.JogosAdapter
import thiengo.com.br.torneioscontinentais.data.BancoDados


class UefaFragment : FragmentAbstrato() {

    companion object {
        @JvmField val TITULO = "UEFA Champions League"
    }

    override fun onStart() {
        super.onStart()
        rv_jogos.adapter = JogosAdapter(activity!!, BancoDados.getUefaTimes())
    }
}
