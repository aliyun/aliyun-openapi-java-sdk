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
		listFaceAlgorithmResultsResponse.setMessage(_ctx.stringValue("ListFaceAlgorithmResultsResponse.Message"));
		listFaceAlgorithmResultsResponse.setCode(_ctx.stringValue("ListFaceAlgorithmResultsResponse.Code"));

		Data data = new Data();
		data.setTotalCount(_ctx.integerValue("ListFaceAlgorithmResultsResponse.Data.TotalCount"));
		data.setPageSize(_ctx.integerValue("ListFaceAlgorithmResultsResponse.Data.PageSize"));
		data.setTotalPage(_ctx.integerValue("ListFaceAlgorithmResultsResponse.Data.TotalPage"));
		data.setPageNumber(_ctx.integerValue("ListFaceAlgorithmResultsResponse.Data.PageNumber"));

		List<RecordsItem> records = new ArrayList<RecordsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListFaceAlgorithmResultsResponse.Data.Records.Length"); i++) {
			RecordsItem recordsItem = new RecordsItem();
			recordsItem.setGenderCode(_ctx.stringValue("ListFaceAlgorithmResultsResponse.Data.Records["+ i +"].GenderCode"));
			recordsItem.setFaceId(_ctx.stringValue("ListFaceAlgorithmResultsResponse.Data.Records["+ i +"].FaceId"));
			recordsItem.setPicUrlPath(_ctx.stringValue("ListFaceAlgorithmResultsResponse.Data.Records["+ i +"].PicUrlPath"));
			recordsItem.setCorpId(_ctx.stringValue("ListFaceAlgorithmResultsResponse.Data.Records["+ i +"].CorpId"));
			recordsItem.setRightBottomX(_ctx.floatValue("ListFaceAlgorithmResultsResponse.Data.Records["+ i +"].RightBottomX"));
			recordsItem.setTargetPicUrlPath(_ctx.stringValue("ListFaceAlgorithmResultsResponse.Data.Records["+ i +"].TargetPicUrlPath"));
			recordsItem.setRightBottomY(_ctx.floatValue("ListFaceAlgorithmResultsResponse.Data.Records["+ i +"].RightBottomY"));
			recordsItem.setSourceId(_ctx.stringValue("ListFaceAlgorithmResultsResponse.Data.Records["+ i +"].SourceId"));
			recordsItem.setMaxAge(_ctx.stringValue("ListFaceAlgorithmResultsResponse.Data.Records["+ i +"].MaxAge"));
			recordsItem.setLeftTopY(_ctx.floatValue("ListFaceAlgorithmResultsResponse.Data.Records["+ i +"].LeftTopY"));
			recordsItem.setLeftTopX(_ctx.floatValue("ListFaceAlgorithmResultsResponse.Data.Records["+ i +"].LeftTopX"));
			recordsItem.setCapStyle(_ctx.stringValue("ListFaceAlgorithmResultsResponse.Data.Records["+ i +"].CapStyle"));
			recordsItem.setMinAge(_ctx.stringValue("ListFaceAlgorithmResultsResponse.Data.Records["+ i +"].MinAge"));
			recordsItem.setShotTime(_ctx.stringValue("ListFaceAlgorithmResultsResponse.Data.Records["+ i +"].ShotTime"));
			recordsItem.setDataSourceId(_ctx.stringValue("ListFaceAlgorithmResultsResponse.Data.Records["+ i +"].DataSourceId"));
			recordsItem.setHairStyle(_ctx.stringValue("ListFaceAlgorithmResultsResponse.Data.Records["+ i +"].HairStyle"));

			records.add(recordsItem);
		}
		data.setRecords(records);
		listFaceAlgorithmResultsResponse.setData(data);
	 
	 	return listFaceAlgorithmResultsResponse;
	}
}