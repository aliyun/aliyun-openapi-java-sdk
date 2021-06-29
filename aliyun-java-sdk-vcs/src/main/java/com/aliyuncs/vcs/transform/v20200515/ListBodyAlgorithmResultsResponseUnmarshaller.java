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

import com.aliyuncs.vcs.model.v20200515.ListBodyAlgorithmResultsResponse;
import com.aliyuncs.vcs.model.v20200515.ListBodyAlgorithmResultsResponse.Data;
import com.aliyuncs.vcs.model.v20200515.ListBodyAlgorithmResultsResponse.Data.RecordsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListBodyAlgorithmResultsResponseUnmarshaller {

	public static ListBodyAlgorithmResultsResponse unmarshall(ListBodyAlgorithmResultsResponse listBodyAlgorithmResultsResponse, UnmarshallerContext _ctx) {
		
		listBodyAlgorithmResultsResponse.setRequestId(_ctx.stringValue("ListBodyAlgorithmResultsResponse.RequestId"));
		listBodyAlgorithmResultsResponse.setMessage(_ctx.stringValue("ListBodyAlgorithmResultsResponse.Message"));
		listBodyAlgorithmResultsResponse.setCode(_ctx.stringValue("ListBodyAlgorithmResultsResponse.Code"));

		Data data = new Data();
		data.setTotalPage(_ctx.integerValue("ListBodyAlgorithmResultsResponse.Data.TotalPage"));
		data.setPageNumber(_ctx.integerValue("ListBodyAlgorithmResultsResponse.Data.PageNumber"));
		data.setPageSize(_ctx.integerValue("ListBodyAlgorithmResultsResponse.Data.PageSize"));
		data.setTotalCount(_ctx.integerValue("ListBodyAlgorithmResultsResponse.Data.TotalCount"));

		List<RecordsItem> records = new ArrayList<RecordsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListBodyAlgorithmResultsResponse.Data.Records.Length"); i++) {
			RecordsItem recordsItem = new RecordsItem();
			recordsItem.setRightBottomY(_ctx.floatValue("ListBodyAlgorithmResultsResponse.Data.Records["+ i +"].RightBottomY"));
			recordsItem.setDataSourceId(_ctx.stringValue("ListBodyAlgorithmResultsResponse.Data.Records["+ i +"].DataSourceId"));
			recordsItem.setPicUrlPath(_ctx.stringValue("ListBodyAlgorithmResultsResponse.Data.Records["+ i +"].PicUrlPath"));
			recordsItem.setTrousersColor(_ctx.stringValue("ListBodyAlgorithmResultsResponse.Data.Records["+ i +"].TrousersColor"));
			recordsItem.setRightBottomX(_ctx.floatValue("ListBodyAlgorithmResultsResponse.Data.Records["+ i +"].RightBottomX"));
			recordsItem.setCoatColor(_ctx.stringValue("ListBodyAlgorithmResultsResponse.Data.Records["+ i +"].CoatColor"));
			recordsItem.setSourceId(_ctx.stringValue("ListBodyAlgorithmResultsResponse.Data.Records["+ i +"].SourceId"));
			recordsItem.setMaxAge(_ctx.stringValue("ListBodyAlgorithmResultsResponse.Data.Records["+ i +"].MaxAge"));
			recordsItem.setCoatLength(_ctx.stringValue("ListBodyAlgorithmResultsResponse.Data.Records["+ i +"].CoatLength"));
			recordsItem.setTargetPicUrlPath(_ctx.stringValue("ListBodyAlgorithmResultsResponse.Data.Records["+ i +"].TargetPicUrlPath"));
			recordsItem.setHairStyle(_ctx.stringValue("ListBodyAlgorithmResultsResponse.Data.Records["+ i +"].HairStyle"));
			recordsItem.setCoatStyle(_ctx.stringValue("ListBodyAlgorithmResultsResponse.Data.Records["+ i +"].CoatStyle"));
			recordsItem.setLeftTopY(_ctx.floatValue("ListBodyAlgorithmResultsResponse.Data.Records["+ i +"].LeftTopY"));
			recordsItem.setMinAge(_ctx.stringValue("ListBodyAlgorithmResultsResponse.Data.Records["+ i +"].MinAge"));
			recordsItem.setCorpId(_ctx.stringValue("ListBodyAlgorithmResultsResponse.Data.Records["+ i +"].CorpId"));
			recordsItem.setTrousersLength(_ctx.stringValue("ListBodyAlgorithmResultsResponse.Data.Records["+ i +"].TrousersLength"));
			recordsItem.setTrousersStyle(_ctx.stringValue("ListBodyAlgorithmResultsResponse.Data.Records["+ i +"].TrousersStyle"));
			recordsItem.setShotTime(_ctx.stringValue("ListBodyAlgorithmResultsResponse.Data.Records["+ i +"].ShotTime"));
			recordsItem.setLeftTopX(_ctx.floatValue("ListBodyAlgorithmResultsResponse.Data.Records["+ i +"].LeftTopX"));
			recordsItem.setGenderCode(_ctx.stringValue("ListBodyAlgorithmResultsResponse.Data.Records["+ i +"].GenderCode"));
			recordsItem.setPersonId(_ctx.stringValue("ListBodyAlgorithmResultsResponse.Data.Records["+ i +"].PersonId"));
			recordsItem.setCapStyle(_ctx.stringValue("ListBodyAlgorithmResultsResponse.Data.Records["+ i +"].CapStyle"));

			records.add(recordsItem);
		}
		data.setRecords(records);
		listBodyAlgorithmResultsResponse.setData(data);
	 
	 	return listBodyAlgorithmResultsResponse;
	}
}