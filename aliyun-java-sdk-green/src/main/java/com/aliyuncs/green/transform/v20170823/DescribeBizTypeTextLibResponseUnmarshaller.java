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
import com.aliyuncs.green.model.v20170823.DescribeBizTypeTextLibResponse.Black.WhiteAllItem;
import com.aliyuncs.green.model.v20170823.DescribeBizTypeTextLibResponse.Black.WhiteSelectedItem;
import com.aliyuncs.green.model.v20170823.DescribeBizTypeTextLibResponse.Ignore;
import com.aliyuncs.green.model.v20170823.DescribeBizTypeTextLibResponse.Ignore.WhiteAllItem8;
import com.aliyuncs.green.model.v20170823.DescribeBizTypeTextLibResponse.Ignore.WhiteSelectedItem7;
import com.aliyuncs.green.model.v20170823.DescribeBizTypeTextLibResponse.Review;
import com.aliyuncs.green.model.v20170823.DescribeBizTypeTextLibResponse.Review.WhiteAllItem4;
import com.aliyuncs.green.model.v20170823.DescribeBizTypeTextLibResponse.Review.WhiteSelectedItem3;
import com.aliyuncs.green.model.v20170823.DescribeBizTypeTextLibResponse.White;
import com.aliyuncs.green.model.v20170823.DescribeBizTypeTextLibResponse.White.WhiteAllItem12;
import com.aliyuncs.green.model.v20170823.DescribeBizTypeTextLibResponse.White.WhiteSelectedItem11;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeBizTypeTextLibResponseUnmarshaller {

	public static DescribeBizTypeTextLibResponse unmarshall(DescribeBizTypeTextLibResponse describeBizTypeTextLibResponse, UnmarshallerContext _ctx) {
		
		describeBizTypeTextLibResponse.setRequestId(_ctx.stringValue("DescribeBizTypeTextLibResponse.RequestId"));

		Black black = new Black();

		List<WhiteSelectedItem> selected = new ArrayList<WhiteSelectedItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeBizTypeTextLibResponse.Black.Selected.Length"); i++) {
			WhiteSelectedItem whiteSelectedItem = new WhiteSelectedItem();
			whiteSelectedItem.setName(_ctx.stringValue("DescribeBizTypeTextLibResponse.Black.Selected["+ i +"].Name"));
			whiteSelectedItem.setCode(_ctx.stringValue("DescribeBizTypeTextLibResponse.Black.Selected["+ i +"].Code"));

			selected.add(whiteSelectedItem);
		}
		black.setSelected(selected);

		List<WhiteAllItem> all = new ArrayList<WhiteAllItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeBizTypeTextLibResponse.Black.All.Length"); i++) {
			WhiteAllItem whiteAllItem = new WhiteAllItem();
			whiteAllItem.setName(_ctx.stringValue("DescribeBizTypeTextLibResponse.Black.All["+ i +"].Name"));
			whiteAllItem.setCode(_ctx.stringValue("DescribeBizTypeTextLibResponse.Black.All["+ i +"].Code"));

			all.add(whiteAllItem);
		}
		black.setAll(all);
		describeBizTypeTextLibResponse.setBlack(black);

		Review review = new Review();

		List<WhiteSelectedItem3> selected1 = new ArrayList<WhiteSelectedItem3>();
		for (int i = 0; i < _ctx.lengthValue("DescribeBizTypeTextLibResponse.Review.Selected.Length"); i++) {
			WhiteSelectedItem3 whiteSelectedItem3 = new WhiteSelectedItem3();
			whiteSelectedItem3.setName(_ctx.stringValue("DescribeBizTypeTextLibResponse.Review.Selected["+ i +"].Name"));
			whiteSelectedItem3.setCode(_ctx.stringValue("DescribeBizTypeTextLibResponse.Review.Selected["+ i +"].Code"));

			selected1.add(whiteSelectedItem3);
		}
		review.setSelected1(selected1);

		List<WhiteAllItem4> all2 = new ArrayList<WhiteAllItem4>();
		for (int i = 0; i < _ctx.lengthValue("DescribeBizTypeTextLibResponse.Review.All.Length"); i++) {
			WhiteAllItem4 whiteAllItem4 = new WhiteAllItem4();
			whiteAllItem4.setName(_ctx.stringValue("DescribeBizTypeTextLibResponse.Review.All["+ i +"].Name"));
			whiteAllItem4.setCode(_ctx.stringValue("DescribeBizTypeTextLibResponse.Review.All["+ i +"].Code"));

			all2.add(whiteAllItem4);
		}
		review.setAll2(all2);
		describeBizTypeTextLibResponse.setReview(review);

		Ignore ignore = new Ignore();

		List<WhiteSelectedItem7> selected5 = new ArrayList<WhiteSelectedItem7>();
		for (int i = 0; i < _ctx.lengthValue("DescribeBizTypeTextLibResponse.Ignore.Selected.Length"); i++) {
			WhiteSelectedItem7 whiteSelectedItem7 = new WhiteSelectedItem7();
			whiteSelectedItem7.setName(_ctx.stringValue("DescribeBizTypeTextLibResponse.Ignore.Selected["+ i +"].Name"));
			whiteSelectedItem7.setCode(_ctx.stringValue("DescribeBizTypeTextLibResponse.Ignore.Selected["+ i +"].Code"));

			selected5.add(whiteSelectedItem7);
		}
		ignore.setSelected5(selected5);

		List<WhiteAllItem8> all6 = new ArrayList<WhiteAllItem8>();
		for (int i = 0; i < _ctx.lengthValue("DescribeBizTypeTextLibResponse.Ignore.All.Length"); i++) {
			WhiteAllItem8 whiteAllItem8 = new WhiteAllItem8();
			whiteAllItem8.setName(_ctx.stringValue("DescribeBizTypeTextLibResponse.Ignore.All["+ i +"].Name"));
			whiteAllItem8.setCode(_ctx.stringValue("DescribeBizTypeTextLibResponse.Ignore.All["+ i +"].Code"));

			all6.add(whiteAllItem8);
		}
		ignore.setAll6(all6);
		describeBizTypeTextLibResponse.setIgnore(ignore);

		White white = new White();

		List<WhiteSelectedItem11> selected9 = new ArrayList<WhiteSelectedItem11>();
		for (int i = 0; i < _ctx.lengthValue("DescribeBizTypeTextLibResponse.White.Selected.Length"); i++) {
			WhiteSelectedItem11 whiteSelectedItem11 = new WhiteSelectedItem11();
			whiteSelectedItem11.setName(_ctx.stringValue("DescribeBizTypeTextLibResponse.White.Selected["+ i +"].Name"));
			whiteSelectedItem11.setCode(_ctx.stringValue("DescribeBizTypeTextLibResponse.White.Selected["+ i +"].Code"));

			selected9.add(whiteSelectedItem11);
		}
		white.setSelected9(selected9);

		List<WhiteAllItem12> all10 = new ArrayList<WhiteAllItem12>();
		for (int i = 0; i < _ctx.lengthValue("DescribeBizTypeTextLibResponse.White.All.Length"); i++) {
			WhiteAllItem12 whiteAllItem12 = new WhiteAllItem12();
			whiteAllItem12.setName(_ctx.stringValue("DescribeBizTypeTextLibResponse.White.All["+ i +"].Name"));
			whiteAllItem12.setCode(_ctx.stringValue("DescribeBizTypeTextLibResponse.White.All["+ i +"].Code"));

			all10.add(whiteAllItem12);
		}
		white.setAll10(all10);
		describeBizTypeTextLibResponse.setWhite(white);
	 
	 	return describeBizTypeTextLibResponse;
	}
}