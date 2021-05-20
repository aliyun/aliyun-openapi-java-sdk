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

import com.aliyuncs.vcs.model.v20200515.SearchObjectResponse;
import com.aliyuncs.vcs.model.v20200515.SearchObjectResponse.Data;
import com.aliyuncs.vcs.model.v20200515.SearchObjectResponse.Data.RecordsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class SearchObjectResponseUnmarshaller {

	public static SearchObjectResponse unmarshall(SearchObjectResponse searchObjectResponse, UnmarshallerContext _ctx) {
		
		searchObjectResponse.setRequestId(_ctx.stringValue("SearchObjectResponse.RequestId"));
		searchObjectResponse.setMessage(_ctx.stringValue("SearchObjectResponse.Message"));
		searchObjectResponse.setCode(_ctx.stringValue("SearchObjectResponse.Code"));

		Data data = new Data();
		data.setTotalCount(_ctx.integerValue("SearchObjectResponse.Data.TotalCount"));
		data.setPageSize(_ctx.integerValue("SearchObjectResponse.Data.PageSize"));
		data.setTotalPage(_ctx.integerValue("SearchObjectResponse.Data.TotalPage"));
		data.setPageNumber(_ctx.integerValue("SearchObjectResponse.Data.PageNumber"));

		List<RecordsItem> records = new ArrayList<RecordsItem>();
		for (int i = 0; i < _ctx.lengthValue("SearchObjectResponse.Data.Records.Length"); i++) {
			RecordsItem recordsItem = new RecordsItem();
			recordsItem.setTargetImageUrl(_ctx.stringValue("SearchObjectResponse.Data.Records["+ i +"].TargetImageUrl"));
			recordsItem.setScore(_ctx.floatValue("SearchObjectResponse.Data.Records["+ i +"].Score"));
			recordsItem.setDeviceID(_ctx.stringValue("SearchObjectResponse.Data.Records["+ i +"].DeviceID"));
			recordsItem.setSourceID(_ctx.stringValue("SearchObjectResponse.Data.Records["+ i +"].SourceID"));
			recordsItem.setRightBtmY(_ctx.integerValue("SearchObjectResponse.Data.Records["+ i +"].RightBtmY"));
			recordsItem.setShotTime(_ctx.longValue("SearchObjectResponse.Data.Records["+ i +"].ShotTime"));
			recordsItem.setRightBtmX(_ctx.integerValue("SearchObjectResponse.Data.Records["+ i +"].RightBtmX"));
			recordsItem.setSourceImagePath(_ctx.stringValue("SearchObjectResponse.Data.Records["+ i +"].SourceImagePath"));
			recordsItem.setTargetImagePath(_ctx.stringValue("SearchObjectResponse.Data.Records["+ i +"].TargetImagePath"));
			recordsItem.setSourceImageUrl(_ctx.stringValue("SearchObjectResponse.Data.Records["+ i +"].SourceImageUrl"));
			recordsItem.setLeftTopY(_ctx.integerValue("SearchObjectResponse.Data.Records["+ i +"].LeftTopY"));
			recordsItem.setLeftTopX(_ctx.integerValue("SearchObjectResponse.Data.Records["+ i +"].LeftTopX"));
			recordsItem.setCompareResult(_ctx.stringValue("SearchObjectResponse.Data.Records["+ i +"].CompareResult"));

			records.add(recordsItem);
		}
		data.setRecords(records);
		searchObjectResponse.setData(data);
	 
	 	return searchObjectResponse;
	}
}