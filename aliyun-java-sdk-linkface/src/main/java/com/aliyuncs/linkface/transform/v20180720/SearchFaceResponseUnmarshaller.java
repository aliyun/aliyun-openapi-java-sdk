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

package com.aliyuncs.linkface.transform.v20180720;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.linkface.model.v20180720.SearchFaceResponse;
import com.aliyuncs.linkface.model.v20180720.SearchFaceResponse.Data;
import com.aliyuncs.linkface.model.v20180720.SearchFaceResponse.Data.TopUserItemItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class SearchFaceResponseUnmarshaller {

	public static SearchFaceResponse unmarshall(SearchFaceResponse searchFaceResponse, UnmarshallerContext context) {
		
		searchFaceResponse.setRequestId(context.stringValue("SearchFaceResponse.RequestId"));
		searchFaceResponse.setCode(context.integerValue("SearchFaceResponse.Code"));
		searchFaceResponse.setMessage(context.stringValue("SearchFaceResponse.Message"));
		searchFaceResponse.setSuccess(context.booleanValue("SearchFaceResponse.Success"));

		Data data = new Data();

		List<TopUserItemItem> topUserItem = new ArrayList<TopUserItemItem>();
		for (int i = 0; i < context.lengthValue("SearchFaceResponse.Data.TopUserItem.Length"); i++) {
			TopUserItemItem topUserItemItem = new TopUserItemItem();
			topUserItemItem.setUserId(context.stringValue("SearchFaceResponse.Data.TopUserItem["+ i +"].UserId"));
			topUserItemItem.setScore(context.floatValue("SearchFaceResponse.Data.TopUserItem["+ i +"].Score"));

			topUserItem.add(topUserItemItem);
		}
		data.setTopUserItem(topUserItem);
		searchFaceResponse.setData(data);
	 
	 	return searchFaceResponse;
	}
}