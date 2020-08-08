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

package com.aliyuncs.imgsearch.transform.v20200320;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.imgsearch.model.v20200320.SearchImageResponse;
import com.aliyuncs.imgsearch.model.v20200320.SearchImageResponse.Data;
import com.aliyuncs.imgsearch.model.v20200320.SearchImageResponse.Data.MatchListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class SearchImageResponseUnmarshaller {

	public static SearchImageResponse unmarshall(SearchImageResponse searchImageResponse, UnmarshallerContext _ctx) {
		
		searchImageResponse.setRequestId(_ctx.stringValue("SearchImageResponse.RequestId"));

		Data data = new Data();

		List<MatchListItem> matchList = new ArrayList<MatchListItem>();
		for (int i = 0; i < _ctx.lengthValue("SearchImageResponse.Data.MatchList.Length"); i++) {
			MatchListItem matchListItem = new MatchListItem();
			matchListItem.setDataId(_ctx.stringValue("SearchImageResponse.Data.MatchList["+ i +"].DataId"));
			matchListItem.setExtraData(_ctx.stringValue("SearchImageResponse.Data.MatchList["+ i +"].ExtraData"));
			matchListItem.setEntityId(_ctx.stringValue("SearchImageResponse.Data.MatchList["+ i +"].EntityId"));
			matchListItem.setImageUrl(_ctx.stringValue("SearchImageResponse.Data.MatchList["+ i +"].ImageUrl"));
			matchListItem.setScore(_ctx.floatValue("SearchImageResponse.Data.MatchList["+ i +"].Score"));

			matchList.add(matchListItem);
		}
		data.setMatchList(matchList);
		searchImageResponse.setData(data);
	 
	 	return searchImageResponse;
	}
}