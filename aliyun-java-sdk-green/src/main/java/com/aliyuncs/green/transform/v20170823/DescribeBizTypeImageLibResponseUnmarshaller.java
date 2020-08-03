/*
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

package com.aliyuncs.green.transform.v20170823;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.green.model.v20170823.DescribeBizTypeImageLibResponse;
import com.aliyuncs.green.model.v20170823.DescribeBizTypeImageLibResponse.Black;
import com.aliyuncs.green.model.v20170823.DescribeBizTypeImageLibResponse.Black.Item;
import com.aliyuncs.green.model.v20170823.DescribeBizTypeImageLibResponse.Review;
import com.aliyuncs.green.model.v20170823.DescribeBizTypeImageLibResponse.Review.Item3;
import com.aliyuncs.green.model.v20170823.DescribeBizTypeImageLibResponse.White;
import com.aliyuncs.green.model.v20170823.DescribeBizTypeImageLibResponse.White.Item6;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeBizTypeImageLibResponseUnmarshaller {

	public static DescribeBizTypeImageLibResponse unmarshall(DescribeBizTypeImageLibResponse describeBizTypeImageLibResponse, UnmarshallerContext _ctx) {
		
		describeBizTypeImageLibResponse.setRequestId(_ctx.stringValue("DescribeBizTypeImageLibResponse.RequestId"));

		Black black = new Black();

		List<Item> selected = new ArrayList<Item>();
		for (int i = 0; i < _ctx.lengthValue("DescribeBizTypeImageLibResponse.Black.Selected.Length"); i++) {
			Item item = new Item();
			item.setName(_ctx.stringValue("DescribeBizTypeImageLibResponse.Black.Selected["+ i +"].Name"));
			item.setCode(_ctx.stringValue("DescribeBizTypeImageLibResponse.Black.Selected["+ i +"].Code"));

			selected.add(item);
		}
		black.setSelected(selected);

		List<Item> all = new ArrayList<Item>();
		for (int i = 0; i < _ctx.lengthValue("DescribeBizTypeImageLibResponse.Black.All.Length"); i++) {
			Item item_ = new Item();
			item_.setName(_ctx.stringValue("DescribeBizTypeImageLibResponse.Black.All["+ i +"].Name"));
			item_.setCode(_ctx.stringValue("DescribeBizTypeImageLibResponse.Black.All["+ i +"].Code"));

			all.add(item_);
		}
		black.setAll(all);
		describeBizTypeImageLibResponse.setBlack(black);

		Review review = new Review();

		List<Item3> selected1 = new ArrayList<Item3>();
		for (int i = 0; i < _ctx.lengthValue("DescribeBizTypeImageLibResponse.Review.Selected.Length"); i++) {
			Item3 item3 = new Item3();
			item3.setName(_ctx.stringValue("DescribeBizTypeImageLibResponse.Review.Selected["+ i +"].Name"));
			item3.setCode(_ctx.stringValue("DescribeBizTypeImageLibResponse.Review.Selected["+ i +"].Code"));

			selected1.add(item3);
		}
		review.setSelected1(selected1);

		List<Item> all2 = new ArrayList<Item>();
		for (int i = 0; i < _ctx.lengthValue("DescribeBizTypeImageLibResponse.Review.All.Length"); i++) {
			Item item_ = new Item();
			item_.setName(_ctx.stringValue("DescribeBizTypeImageLibResponse.Review.All["+ i +"].Name"));
			item_.setCode(_ctx.stringValue("DescribeBizTypeImageLibResponse.Review.All["+ i +"].Code"));

			all2.add(item_);
		}
		review.setAll2(all2);
		describeBizTypeImageLibResponse.setReview(review);

		White white = new White();

		List<Item6> selected4 = new ArrayList<Item6>();
		for (int i = 0; i < _ctx.lengthValue("DescribeBizTypeImageLibResponse.White.Selected.Length"); i++) {
			Item6 item6 = new Item6();
			item6.setName(_ctx.stringValue("DescribeBizTypeImageLibResponse.White.Selected["+ i +"].Name"));
			item6.setCode(_ctx.stringValue("DescribeBizTypeImageLibResponse.White.Selected["+ i +"].Code"));

			selected4.add(item6);
		}
		white.setSelected4(selected4);

		List<Item> all5 = new ArrayList<Item>();
		for (int i = 0; i < _ctx.lengthValue("DescribeBizTypeImageLibResponse.White.All.Length"); i++) {
			Item item_ = new Item();
			item_.setName(_ctx.stringValue("DescribeBizTypeImageLibResponse.White.All["+ i +"].Name"));
			item_.setCode(_ctx.stringValue("DescribeBizTypeImageLibResponse.White.All["+ i +"].Code"));

			all5.add(item_);
		}
		white.setAll5(all5);
		describeBizTypeImageLibResponse.setWhite(white);
	 
	 	return describeBizTypeImageLibResponse;
	}
}