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

package com.aliyuncs.vcs.transform.v20200515;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vcs.model.v20200515.ListFaceAlgorithmResultsResponse;
import com.aliyuncs.vcs.model.v20200515.ListFaceAlgorithmResultsResponse.Data;
import com.aliyuncs.vcs.model.v20200515.ListFaceAlgorithmResultsResponse.Data.RecordsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListFaceAlgorithmResultsResponseUnmarshaller {

	public static ListFaceAlgorithmResultsResponse unmarshall(ListFaceAlgorithmResultsResponse listFaceAlgorithmResultsResponse, UnmarshallerContext _ctx) {
		
		listFaceAlgorithmResultsResponse.setRequestId(_ctx.stringValue("ListFaceAlgorithmResultsResponse.RequestId"));
		listFaceAlgorithmResultsResponse.setCode(_ctx.stringValue("ListFaceAlgorithmResultsResponse.Code"));
		listFaceAlgorithmResultsResponse.setMessage(_ctx.stringValue("ListFaceAlgorithmResultsResponse.Message"));

		Data data = new Data();
		data.setPageNumber(_ctx.integerValue("ListFaceAlgorithmResultsResponse.Data.PageNumber"));
		data.setPageSize(_ctx.integerValue("ListFaceAlgorithmResultsResponse.Data.PageSize"));
		data.setTotalCount(_ctx.integerValue("ListFaceAlgorithmResultsResponse.Data.TotalCount"));
		data.setTotalPage(_ctx.integerValue("ListFaceAlgorithmResultsResponse.Data.TotalPage"));

		List<RecordsItem> records = new ArrayList<RecordsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListFaceAlgorithmResultsResponse.Data.Records.Length"); i++) {
			RecordsItem recordsItem = new RecordsItem();
			recordsItem.setFaceId(_ctx.stringValue("ListFaceAlgorithmResultsResponse.Data.Records["+ i +"].FaceId"));
			recordsItem.setCorpId(_ctx.stringValue("ListFaceAlgorithmResultsResponse.Data.Records["+ i +"].CorpId"));
			recordsItem.setDataSourceId(_ctx.stringValue("ListFaceAlgorithmResultsResponse.Data.Records["+ i +"].DataSourceId"));
			recordsItem.setShotTime(_ctx.stringValue("ListFaceAlgorithmResultsResponse.Data.Records["+ i +"].ShotTime"));
			recordsItem.setGenderCode(_ctx.stringValue("ListFaceAlgorithmResultsResponse.Data.Records["+ i +"].GenderCode"));
			recordsItem.setMinAge(_ctx.stringValue("ListFaceAlgorithmResultsResponse.Data.Records["+ i +"].MinAge"));
			recordsItem.setMaxAge(_ctx.stringValue("ListFaceAlgorithmResultsResponse.Data.Records["+ i +"].MaxAge"));
			recordsItem.setCapStyle(_ctx.stringValue("ListFaceAlgorithmResultsResponse.Data.Records["+ i +"].CapStyle"));
			recordsItem.setHairStyle(_ctx.stringValue("ListFaceAlgorithmResultsResponse.Data.Records["+ i +"].HairStyle"));
			recordsItem.setLeftTopX(_ctx.floatValue("ListFaceAlgorithmResultsResponse.Data.Records["+ i +"].LeftTopX"));
			recordsItem.setLeftTopY(_ctx.floatValue("ListFaceAlgorithmResultsResponse.Data.Records["+ i +"].LeftTopY"));
			recordsItem.setRightBottomX(_ctx.floatValue("ListFaceAlgorithmResultsResponse.Data.Records["+ i +"].RightBottomX"));
			recordsItem.setRightBottomY(_ctx.floatValue("ListFaceAlgorithmResultsResponse.Data.Records["+ i +"].RightBottomY"));
			recordsItem.setPicUrlPath(_ctx.stringValue("ListFaceAlgorithmResultsResponse.Data.Records["+ i +"].PicUrlPath"));
			recordsItem.setTargetPicUrlPath(_ctx.stringValue("ListFaceAlgorithmResultsResponse.Data.Records["+ i +"].TargetPicUrlPath"));

			records.add(recordsItem);
		}
		data.setRecords(records);
		listFaceAlgorithmResultsResponse.setData(data);
	 
	 	return listFaceAlgorithmResultsResponse;
	}
}