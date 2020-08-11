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

import com.aliyuncs.green.model.v20170823.DescribeBizTypeTextLibResponse;
import com.aliyuncs.green.model.v20170823.DescribeBizTypeTextLibResponse.Black;
import com.aliyuncs.green.model.v20170823.DescribeBizTypeTextLibResponse.Black.Item;
import com.aliyuncs.green.model.v20170823.DescribeBizTypeTextLibResponse.Ignore;
import com.aliyuncs.green.model.v20170823.DescribeBizTypeTextLibResponse.Ignore.Item6;
import com.aliyuncs.green.model.v20170823.DescribeBizTypeTextLibResponse.Review;
import com.aliyuncs.green.model.v20170823.DescribeBizTypeTextLibResponse.Review.Item3;
import com.aliyuncs.green.model.v20170823.DescribeBizTypeTextLibResponse.White;
import com.aliyuncs.green.model.v20170823.DescribeBizTypeTextLibResponse.White.Item9;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeBizTypeTextLibResponseUnmarshaller {

	public static DescribeBizTypeTextLibResponse unmarshall(DescribeBizTypeTextLibResponse describeBizTypeTextLibResponse, UnmarshallerContext _ctx) {
		
		describeBizTypeTextLibResponse.setRequestId(_ctx.stringValue("DescribeBizTypeTextLibResponse.RequestId"));

		Black black = new Black();

		List<Item> selected = new ArrayList<Item>();
		for (int i = 0; i < _ctx.lengthValue("DescribeBizTypeTextLibResponse.Black.Selected.Length"); i++) {
			Item item = new Item();
			item.setName(_ctx.stringValue("DescribeBizTypeTextLibResponse.Black.Selected["+ i +"].Name"));
			item.setCode(_ctx.stringValue("DescribeBizTypeTextLibResponse.Black.Selected["+ i +"].Code"));

			selected.add(item);
		}
		black.setSelected(selected);

		List<Item> all = new ArrayList<Item>();
		for (int i = 0; i < _ctx.lengthValue("DescribeBizTypeTextLibResponse.Black.All.Length"); i++) {
			Item item_ = new Item();
			item_.setName(_ctx.stringValue("DescribeBizTypeTextLibResponse.Black.All["+ i +"].Name"));
			item_.setCode(_ctx.stringValue("DescribeBizTypeTextLibResponse.Black.All["+ i +"].Code"));

			all.add(item_);
		}
		black.setAll(all);
		describeBizTypeTextLibResponse.setBlack(black);

		Review review = new Review();

		List<Item3> selected1 = new ArrayList<Item3>();
		for (int i = 0; i < _ctx.lengthValue("DescribeBizTypeTextLibResponse.Review.Selected.Length"); i++) {
			Item3 item3 = new Item3();
			item3.setName(_ctx.stringValue("DescribeBizTypeTextLibResponse.Review.Selected["+ i +"].Name"));
			item3.setCode(_ctx.stringValue("DescribeBizTypeTextLibResponse.Review.Selected["+ i +"].Code"));

			selected1.add(item3);
		}
		review.setSelected1(selected1);

		List<Item3> all2 = new ArrayList<Item3>();
		for (int i = 0; i < _ctx.lengthValue("DescribeBizTypeTextLibResponse.Review.All.Length"); i++) {
			Item3 item_ = new Item3();
			item_.setName(_ctx.stringValue("DescribeBizTypeTextLibResponse.Review.All["+ i +"].Name"));
			item_.setCode(_ctx.stringValue("DescribeBizTypeTextLibResponse.Review.All["+ i +"].Code"));

			all2.add(item_);
		}
		review.setAll2(all2);
		describeBizTypeTextLibResponse.setReview(review);

		Ignore ignore = new Ignore();

		List<Item6> selected4 = new ArrayList<Item6>();
		for (int i = 0; i < _ctx.lengthValue("DescribeBizTypeTextLibResponse.Ignore.Selected.Length"); i++) {
			Item6 item6 = new Item6();
			item6.setName(_ctx.stringValue("DescribeBizTypeTextLibResponse.Ignore.Selected["+ i +"].Name"));
			item6.setCode(_ctx.stringValue("DescribeBizTypeTextLibResponse.Ignore.Selected["+ i +"].Code"));

			selected4.add(item6);
		}
		ignore.setSelected4(selected4);

		List<Item6> all5 = new ArrayList<Item6>();
		for (int i = 0; i < _ctx.lengthValue("DescribeBizTypeTextLibResponse.Ignore.All.Length"); i++) {
			Item6 item_ = new Item6();
			item_.setName(_ctx.stringValue("DescribeBizTypeTextLibResponse.Ignore.All["+ i +"].Name"));
			item_.setCode(_ctx.stringValue("DescribeBizTypeTextLibResponse.Ignore.All["+ i +"].Code"));

			all5.add(item_);
		}
		ignore.setAll5(all5);
		describeBizTypeTextLibResponse.setIgnore(ignore);

		White white = new White();

		List<Item9> selected7 = new ArrayList<Item9>();
		for (int i = 0; i < _ctx.lengthValue("DescribeBizTypeTextLibResponse.White.Selected.Length"); i++) {
			Item9 item9 = new Item9();
			item9.setName(_ctx.stringValue("DescribeBizTypeTextLibResponse.White.Selected["+ i +"].Name"));
			item9.setCode(_ctx.stringValue("DescribeBizTypeTextLibResponse.White.Selected["+ i +"].Code"));

			selected7.add(item9);
		}
		white.setSelected7(selected7);

		List<Item9> all8 = new ArrayList<Item9>();
		for (int i = 0; i < _ctx.lengthValue("DescribeBizTypeTextLibResponse.White.All.Length"); i++) {
			Item9 item_ = new Item9();
			item_.setName(_ctx.stringValue("DescribeBizTypeTextLibResponse.White.All["+ i +"].Name"));
			item_.setCode(_ctx.stringValue("DescribeBizTypeTextLibResponse.White.All["+ i +"].Code"));

			all8.add(item_);
		}
		white.setAll8(all8);
		describeBizTypeTextLibResponse.setWhite(white);
	 
	 	return describeBizTypeTextLibResponse;
	}
}