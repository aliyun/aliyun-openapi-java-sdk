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

package com.aliyuncs.mts.transform.v20140618;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mts.model.v20140618.ListCustomViewsResponse;
import com.aliyuncs.mts.model.v20140618.ListCustomViewsResponse.CustomView;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListCustomViewsResponseUnmarshaller {

	public static ListCustomViewsResponse unmarshall(ListCustomViewsResponse listCustomViewsResponse, UnmarshallerContext _ctx) {
		
		listCustomViewsResponse.setRequestId(_ctx.stringValue("ListCustomViewsResponse.RequestId"));
		listCustomViewsResponse.setPageNumber(_ctx.integerValue("ListCustomViewsResponse.PageNumber"));
		listCustomViewsResponse.setPageSize(_ctx.integerValue("ListCustomViewsResponse.PageSize"));
		listCustomViewsResponse.setTotalCount(_ctx.longValue("ListCustomViewsResponse.TotalCount"));

		List<CustomView> customViews = new ArrayList<CustomView>();
		for (int i = 0; i < _ctx.lengthValue("ListCustomViewsResponse.CustomViews.Length"); i++) {
			CustomView customView = new CustomView();
			customView.setCustomViewId(_ctx.stringValue("ListCustomViewsResponse.CustomViews["+ i +"].CustomViewId"));
			customView.setImageUrl(_ctx.stringValue("ListCustomViewsResponse.CustomViews["+ i +"].ImageUrl"));

			customViews.add(customView);
		}
		listCustomViewsResponse.setCustomViews(customViews);
	 
	 	return listCustomViewsResponse;
	}
}