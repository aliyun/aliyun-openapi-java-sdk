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

import com.aliyuncs.vcs.model.v20200515.SearchItemResponse;
import com.aliyuncs.vcs.model.v20200515.SearchItemResponse.Data;
import com.aliyuncs.vcs.model.v20200515.SearchItemResponse.Data.Record;
import com.aliyuncs.transform.UnmarshallerContext;


public class SearchItemResponseUnmarshaller {

	public static SearchItemResponse unmarshall(SearchItemResponse searchItemResponse, UnmarshallerContext _ctx) {
		
		searchItemResponse.setRequestId(_ctx.stringValue("SearchItemResponse.RequestId"));
		searchItemResponse.setSuccess(_ctx.booleanValue("SearchItemResponse.Success"));
		searchItemResponse.setCode(_ctx.stringValue("SearchItemResponse.Code"));
		searchItemResponse.setMessage(_ctx.stringValue("SearchItemResponse.Message"));

		Data data = new Data();
		data.setTotalCount(_ctx.longValue("SearchItemResponse.Data.TotalCount"));
		data.setPageSize(_ctx.longValue("SearchItemResponse.Data.PageSize"));
		data.setPageNumber(_ctx.longValue("SearchItemResponse.Data.PageNumber"));

		List<Record> records = new ArrayList<Record>();
		for (int i = 0; i < _ctx.lengthValue("SearchItemResponse.Data.Records.Length"); i++) {
			Record record = new Record();
			record.setItemImageUrl(_ctx.stringValue("SearchItemResponse.Data.Records["+ i +"].ItemImageUrl"));
			record.setItemImageSimilarity(_ctx.doubleValue("SearchItemResponse.Data.Records["+ i +"].ItemImageSimilarity"));
			record.setItemId(_ctx.stringValue("SearchItemResponse.Data.Records["+ i +"].ItemId"));
			record.setItemName(_ctx.stringValue("SearchItemResponse.Data.Records["+ i +"].ItemName"));

			records.add(record);
		}
		data.setRecords(records);
		searchItemResponse.setData(data);
	 
	 	return searchItemResponse;
	}
}