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

import com.aliyuncs.facebody.model.v20191230.BatchAddFacesResponse;
import com.aliyuncs.facebody.model.v20191230.BatchAddFacesResponse.Data;
import com.aliyuncs.facebody.model.v20191230.BatchAddFacesResponse.Data.FailedFacesItem;
import com.aliyuncs.facebody.model.v20191230.BatchAddFacesResponse.Data.InsertedFacesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class BatchAddFacesResponseUnmarshaller {

	public static BatchAddFacesResponse unmarshall(BatchAddFacesResponse batchAddFacesResponse, UnmarshallerContext _ctx) {
		
		batchAddFacesResponse.setRequestId(_ctx.stringValue("BatchAddFacesResponse.RequestId"));
		batchAddFacesResponse.setCode(_ctx.stringValue("BatchAddFacesResponse.Code"));
		batchAddFacesResponse.setMessage(_ctx.stringValue("BatchAddFacesResponse.Message"));

		Data data = new Data();

		List<InsertedFacesItem> insertedFaces = new ArrayList<InsertedFacesItem>();
		for (int i = 0; i < _ctx.lengthValue("BatchAddFacesResponse.Data.InsertedFaces.Length"); i++) {
			InsertedFacesItem insertedFacesItem = new InsertedFacesItem();
			insertedFacesItem.setImageURL(_ctx.stringValue("BatchAddFacesResponse.Data.InsertedFaces["+ i +"].ImageURL"));
			insertedFacesItem.setFaceId(_ctx.stringValue("BatchAddFacesResponse.Data.InsertedFaces["+ i +"].FaceId"));

			insertedFaces.add(insertedFacesItem);
		}
		data.setInsertedFaces(insertedFaces);

		List<FailedFacesItem> failedFaces = new ArrayList<FailedFacesItem>();
		for (int i = 0; i < _ctx.lengthValue("BatchAddFacesResponse.Data.FailedFaces.Length"); i++) {
			FailedFacesItem failedFacesItem = new FailedFacesItem();
			failedFacesItem.setImageURL(_ctx.stringValue("BatchAddFacesResponse.Data.FailedFaces["+ i +"].ImageURL"));
			failedFacesItem.setCode(_ctx.stringValue("BatchAddFacesResponse.Data.FailedFaces["+ i +"].Code"));
			failedFacesItem.setMessage(_ctx.stringValue("BatchAddFacesResponse.Data.FailedFaces["+ i +"].Message"));

			failedFaces.add(failedFacesItem);
		}
		data.setFailedFaces(failedFaces);
		batchAddFacesResponse.setData(data);
	 
	 	return batchAddFacesResponse;
	}
}