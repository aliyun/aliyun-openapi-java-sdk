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

import com.aliyuncs.vcs.model.v20200515.ListEventAlgorithmResultsResponse;
import com.aliyuncs.vcs.model.v20200515.ListEventAlgorithmResultsResponse.Data;
import com.aliyuncs.vcs.model.v20200515.ListEventAlgorithmResultsResponse.Data.RecordsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListEventAlgorithmResultsResponseUnmarshaller {

	public static ListEventAlgorithmResultsResponse unmarshall(ListEventAlgorithmResultsResponse listEventAlgorithmResultsResponse, UnmarshallerContext _ctx) {
		
		listEventAlgorithmResultsResponse.setRequestId(_ctx.stringValue("ListEventAlgorithmResultsResponse.RequestId"));
		listEventAlgorithmResultsResponse.setExtendValue(_ctx.stringValue("ListEventAlgorithmResultsResponse.ExtendValue"));
		listEventAlgorithmResultsResponse.setMessage(_ctx.stringValue("ListEventAlgorithmResultsResponse.Message"));
		listEventAlgorithmResultsResponse.setCode(_ctx.stringValue("ListEventAlgorithmResultsResponse.Code"));

		Data data = new Data();
		data.setTotalCount(_ctx.integerValue("ListEventAlgorithmResultsResponse.Data.TotalCount"));
		data.setPageSize(_ctx.integerValue("ListEventAlgorithmResultsResponse.Data.PageSize"));
		data.setTotalPage(_ctx.integerValue("ListEventAlgorithmResultsResponse.Data.TotalPage"));
		data.setPageNumber(_ctx.integerValue("ListEventAlgorithmResultsResponse.Data.PageNumber"));

		List<RecordsItem> records = new ArrayList<RecordsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListEventAlgorithmResultsResponse.Data.Records.Length"); i++) {
			RecordsItem recordsItem = new RecordsItem();
			recordsItem.setPicUrlPath(_ctx.stringValue("ListEventAlgorithmResultsResponse.Data.Records["+ i +"].PicUrlPath"));
			recordsItem.setUuidCode(_ctx.stringValue("ListEventAlgorithmResultsResponse.Data.Records["+ i +"].UuidCode"));
			recordsItem.setCorpId(_ctx.stringValue("ListEventAlgorithmResultsResponse.Data.Records["+ i +"].CorpId"));
			recordsItem.setEventType(_ctx.stringValue("ListEventAlgorithmResultsResponse.Data.Records["+ i +"].EventType"));
			recordsItem.setExtendValueThree(_ctx.stringValue("ListEventAlgorithmResultsResponse.Data.Records["+ i +"].ExtendValueThree"));
			recordsItem.setTargetPicUrlPath(_ctx.stringValue("ListEventAlgorithmResultsResponse.Data.Records["+ i +"].TargetPicUrlPath"));
			recordsItem.setCapStyle(_ctx.stringValue("ListEventAlgorithmResultsResponse.Data.Records["+ i +"].CapStyle"));
			recordsItem.setExtendValue(_ctx.stringValue("ListEventAlgorithmResultsResponse.Data.Records["+ i +"].ExtendValue"));
			recordsItem.setExtendValueTwo(_ctx.stringValue("ListEventAlgorithmResultsResponse.Data.Records["+ i +"].ExtendValueTwo"));
			recordsItem.setTagCode(_ctx.stringValue("ListEventAlgorithmResultsResponse.Data.Records["+ i +"].TagCode"));
			recordsItem.setShotTime(_ctx.stringValue("ListEventAlgorithmResultsResponse.Data.Records["+ i +"].ShotTime"));
			recordsItem.setRecordId(_ctx.stringValue("ListEventAlgorithmResultsResponse.Data.Records["+ i +"].RecordId"));
			recordsItem.setTagCodeReliability(_ctx.stringValue("ListEventAlgorithmResultsResponse.Data.Records["+ i +"].TagCodeReliability"));
			recordsItem.setFaceCount(_ctx.stringValue("ListEventAlgorithmResultsResponse.Data.Records["+ i +"].FaceCount"));
			recordsItem.setDataSourceId(_ctx.stringValue("ListEventAlgorithmResultsResponse.Data.Records["+ i +"].DataSourceId"));

			records.add(recordsItem);
		}
		data.setRecords(records);
		listEventAlgorithmResultsResponse.setData(data);
	 
	 	return listEventAlgorithmResultsResponse;
	}
}