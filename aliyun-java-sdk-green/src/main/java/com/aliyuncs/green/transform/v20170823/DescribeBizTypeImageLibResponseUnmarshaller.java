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
import com.aliyuncs.green.model.v20170823.DescribeBizTypeImageLibResponse.Black.WhiteAllItem;
import com.aliyuncs.green.model.v20170823.DescribeBizTypeImageLibResponse.Black.WhiteSelectedItem;
import com.aliyuncs.green.model.v20170823.DescribeBizTypeImageLibResponse.Review;
import com.aliyuncs.green.model.v20170823.DescribeBizTypeImageLibResponse.Review.WhiteAllItem4;
import com.aliyuncs.green.model.v20170823.DescribeBizTypeImageLibResponse.Review.WhiteSelectedItem3;
import com.aliyuncs.green.model.v20170823.DescribeBizTypeImageLibResponse.White;
import com.aliyuncs.green.model.v20170823.DescribeBizTypeImageLibResponse.White.WhiteAllItem8;
import com.aliyuncs.green.model.v20170823.DescribeBizTypeImageLibResponse.White.WhiteSelectedItem7;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeBizTypeImageLibResponseUnmarshaller {

	public static DescribeBizTypeImageLibResponse unmarshall(DescribeBizTypeImageLibResponse describeBizTypeImageLibResponse, UnmarshallerContext _ctx) {
		
		describeBizTypeImageLibResponse.setRequestId(_ctx.stringValue("DescribeBizTypeImageLibResponse.RequestId"));

		Black black = new Black();

		List<WhiteSelectedItem> selected = new ArrayList<WhiteSelectedItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeBizTypeImageLibResponse.Black.Selected.Length"); i++) {
			WhiteSelectedItem whiteSelectedItem = new WhiteSelectedItem();
			whiteSelectedItem.setName(_ctx.stringValue("DescribeBizTypeImageLibResponse.Black.Selected["+ i +"].Name"));
			whiteSelectedItem.setCode(_ctx.stringValue("DescribeBizTypeImageLibResponse.Black.Selected["+ i +"].Code"));

			selected.add(whiteSelectedItem);
		}
		black.setSelected(selected);

		List<WhiteAllItem> all = new ArrayList<WhiteAllItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeBizTypeImageLibResponse.Black.All.Length"); i++) {
			WhiteAllItem whiteAllItem = new WhiteAllItem();
			whiteAllItem.setName(_ctx.stringValue("DescribeBizTypeImageLibResponse.Black.All["+ i +"].Name"));
			whiteAllItem.setCode(_ctx.stringValue("DescribeBizTypeImageLibResponse.Black.All["+ i +"].Code"));

			all.add(whiteAllItem);
		}
		black.setAll(all);
		describeBizTypeImageLibResponse.setBlack(black);

		Review review = new Review();

		List<WhiteSelectedItem3> selected1 = new ArrayList<WhiteSelectedItem3>();
		for (int i = 0; i < _ctx.lengthValue("DescribeBizTypeImageLibResponse.Review.Selected.Length"); i++) {
			WhiteSelectedItem3 whiteSelectedItem3 = new WhiteSelectedItem3();
			whiteSelectedItem3.setName(_ctx.stringValue("DescribeBizTypeImageLibResponse.Review.Selected["+ i +"].Name"));
			whiteSelectedItem3.setCode(_ctx.stringValue("DescribeBizTypeImageLibResponse.Review.Selected["+ i +"].Code"));

			selected1.add(whiteSelectedItem3);
		}
		review.setSelected1(selected1);

		List<WhiteAllItem4> all2 = new ArrayList<WhiteAllItem4>();
		for (int i = 0; i < _ctx.lengthValue("DescribeBizTypeImageLibResponse.Review.All.Length"); i++) {
			WhiteAllItem4 whiteAllItem4 = new WhiteAllItem4();
			whiteAllItem4.setName(_ctx.stringValue("DescribeBizTypeImageLibResponse.Review.All["+ i +"].Name"));
			whiteAllItem4.setCode(_ctx.stringValue("DescribeBizTypeImageLibResponse.Review.All["+ i +"].Code"));

			all2.add(whiteAllItem4);
		}
		review.setAll2(all2);
		describeBizTypeImageLibResponse.setReview(review);

		White white = new White();

		List<WhiteSelectedItem7> selected5 = new ArrayList<WhiteSelectedItem7>();
		for (int i = 0; i < _ctx.lengthValue("DescribeBizTypeImageLibResponse.White.Selected.Length"); i++) {
			WhiteSelectedItem7 whiteSelectedItem7 = new WhiteSelectedItem7();
			whiteSelectedItem7.setName(_ctx.stringValue("DescribeBizTypeImageLibResponse.White.Selected["+ i +"].Name"));
			whiteSelectedItem7.setCode(_ctx.stringValue("DescribeBizTypeImageLibResponse.White.Selected["+ i +"].Code"));

			selected5.add(whiteSelectedItem7);
		}
		white.setSelected5(selected5);

		List<WhiteAllItem8> all6 = new ArrayList<WhiteAllItem8>();
		for (int i = 0; i < _ctx.lengthValue("DescribeBizTypeImageLibResponse.White.All.Length"); i++) {
			WhiteAllItem8 whiteAllItem8 = new WhiteAllItem8();
			whiteAllItem8.setName(_ctx.stringValue("DescribeBizTypeImageLibResponse.White.All["+ i +"].Name"));
			whiteAllItem8.setCode(_ctx.stringValue("DescribeBizTypeImageLibResponse.White.All["+ i +"].Code"));

			all6.add(whiteAllItem8);
		}
		white.setAll6(all6);
		describeBizTypeImageLibResponse.setWhite(white);
	 
	 	return describeBizTypeImageLibResponse;
	}
}