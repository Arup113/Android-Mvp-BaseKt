package com.core.kbasekit.ui.home

import android.support.v4.app.Fragment
import com.core.kbasekit.ui.base.MvpView

/*
* ****************************************************************************
* * Created by:
* * Name : Md. Imran Hossain
* * Date : 4/24/2018
* * Email : hossain.imran.cse11@gmail.com
* *
* * Last Edited by : Md. Imran Hossain on 4/24/2018
* *
* * Last Reviewed by : <Reviewer Name> on <mm/dd/yy>
* ****************************************************************************
*/

interface HomeMvpView : MvpView {
    fun openFragment(fragment: Fragment)
}