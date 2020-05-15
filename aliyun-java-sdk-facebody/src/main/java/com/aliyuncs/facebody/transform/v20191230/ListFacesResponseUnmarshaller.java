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

import com.aliyuncs.facebody.model.v20191230.ListFacesResponse;
import com.aliyuncs.facebody.model.v20191230.ListFacesResponse.Data;
import com.aliyuncs.facebody.model.v20191230.ListFacesResponse.Data.FaceListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListFacesResponseUnmarshaller {

	public static ListFacesResponse unmarshall(ListFacesResponse listFacesResponse, UnmarshallerContext _ctx) {
		
		listFacesResponse.setRequestId(_ctx.stringValue("ListFacesResponse.RequestId"));

		Data data = new Data();
		data.setScrollId(_ctx.stringValue("ListFacesResponse.Data.ScrollId"));

		List<FaceListItem> faceList = new ArrayList<FaceListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListFacesResponse.Data.FaceList.Length"); i++) {
			FaceListItem faceListItem = new FaceListItem();
			faceListItem.setFaceId(_ctx.stringValue("ListFacesResponse.Data.FaceList["+ i +"].FaceId"));
			faceListItem.setExtraData(_ctx.stringValue("ListFacesResponse.Data.FaceList["+ i +"].ExtraData"));
			faceListItem.setEntityId(_ctx.stringValue("ListFacesResponse.Data.FaceList["+ i +"].EntityId"));
			faceListItem.setImageUrl(_ctx.stringValue("ListFacesResponse.Data.FaceList["+ i +"].ImageUrl"));

			faceList.add(faceListItem);
		}
		data.setFaceList(faceList);
		listFacesResponse.setData(data);
	 
	 	return listFacesResponse;
	}
}