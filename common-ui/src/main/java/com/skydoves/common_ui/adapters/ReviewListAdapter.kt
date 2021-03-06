/*
 * Designed and developed by 2019 skydoves (Jaewoong Eum)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.skydoves.common_ui.adapters

import android.view.View
import com.skydoves.baserecyclerviewadapter.BaseAdapter
import com.skydoves.baserecyclerviewadapter.SectionRow
import com.skydoves.common_ui.R
import com.skydoves.common_ui.viewholders.ReviewListViewHolder
import com.skydoves.entity.Review

/** ReviewListAdapter is an adapter class for binding [Review] items. */
class ReviewListAdapter : BaseAdapter() {

  init {
    addSection(ArrayList<Review>())
  }

  fun addReviewList(reviews: List<Review>) {
    val section = sections()[0]
    section.addAll(reviews)
    notifyItemRangeInserted(section.size - reviews.size + 1, reviews.size)
  }

  override fun layout(sectionRow: SectionRow) = R.layout.item_review

  override fun viewHolder(layout: Int, view: View) = ReviewListViewHolder(view)
}
