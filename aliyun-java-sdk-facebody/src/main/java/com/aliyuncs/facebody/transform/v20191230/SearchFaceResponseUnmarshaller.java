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

package com.aliyuncs.facebody.transform.v20191230;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.facebody.model.v20191230.SearchFaceResponse;
import com.aliyuncs.facebody.model.v20191230.SearchFaceResponse.Data;
import com.aliyuncs.facebody.model.v20191230.SearchFaceResponse.Data.MatchListItem;
import com.aliyuncs.facebody.model.v20191230.SearchFaceResponse.Data.MatchListItem.FaceItemsItem;
import com.aliyuncs.facebody.model.v20191230.SearchFaceResponse.Data.MatchListItem.Location;
import com.aliyuncs.transform.UnmarshallerContext;


public class SearchFaceResponseUnmarshaller {

	public static SearchFaceResponse unmarshall(SearchFaceResponse searchFaceResponse, UnmarshallerContext _ctx) {
		
		searchFaceResponse.setRequestId(_ctx.stringValue("SearchFaceResponse.RequestId"));

		Data data = new Data();

		List<MatchListItem> matchList = new ArrayList<MatchListItem>();
		for (int i = 0; i < _ctx.lengthValue("SearchFaceResponse.Data.MatchList.Length"); i++) {
			MatchListItem matchListItem = new MatchListItem();

			Location location = new Location();
			location.setWidth(_ctx.integerValue("SearchFaceResponse.Data.MatchList["+ i +"].Location.Width"));
			location.setHeight(_ctx.integerValue("SearchFaceResponse.Data.MatchList["+ i +"].Location.Height"));
			location.setY(_ctx.integerValue("SearchFaceResponse.Data.MatchList["+ i +"].Location.Y"));
			location.setX(_ctx.integerValue("SearchFaceResponse.Data.MatchList["+ i +"].Location.X"));
			matchListItem.setLocation(location);

			List<FaceItemsItem> faceItems = new ArrayList<FaceItemsItem>();
			for (int j = 0; j < _ctx.lengthValue("SearchFaceResponse.Data.MatchList["+ i +"].FaceItems.Length"); j++) {
				FaceItemsItem faceItemsItem = new FaceItemsItem();
				faceItemsItem.setEntityId(_ctx.stringValue("SearchFaceResponse.Data.MatchList["+ i +"].FaceItems["+ j +"].EntityId"));
				faceItemsItem.setFaceId(_ctx.stringValue("SearchFaceResponse.Data.MatchList["+ i +"].FaceItems["+ j +"].FaceId"));
				faceItemsItem.setScore(_ctx.floatValue("SearchFaceResponse.Data.MatchList["+ i +"].FaceItems["+ j +"].Score"));
				faceItemsItem.setExtraData(_ctx.stringValue("SearchFaceResponse.Data.MatchList["+ i +"].FaceItems["+ j +"].ExtraData"));
				faceItemsItem.setDbName(_ctx.stringValue("SearchFaceResponse.Data.MatchList["+ i +"].FaceItems["+ j +"].DbName"));
				faceItemsItem.setConfidence(_ctx.floatValue("SearchFaceResponse.Data.MatchList["+ i +"].FaceItems["+ j +"].Confidence"));

				faceItems.add(faceItemsItem);
			}
			matchListItem.setFaceItems(faceItems);

			matchList.add(matchListItem);
		}
		data.setMatchList(matchList);
		searchFaceResponse.setData(data);
	 
	 	return searchFaceResponse;
	}
}