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

import com.aliyuncs.vcs.model.v20200515.SearchBodyResponse;
import com.aliyuncs.vcs.model.v20200515.SearchBodyResponse.Data;
import com.aliyuncs.vcs.model.v20200515.SearchBodyResponse.Data.Record;
import com.aliyuncs.transform.UnmarshallerContext;


public class SearchBodyResponseUnmarshaller {

	public static SearchBodyResponse unmarshall(SearchBodyResponse searchBodyResponse, UnmarshallerContext _ctx) {
		
		searchBodyResponse.setRequestId(_ctx.stringValue("SearchBodyResponse.RequestId"));
		searchBodyResponse.setMessage(_ctx.stringValue("SearchBodyResponse.Message"));
		searchBodyResponse.setCode(_ctx.stringValue("SearchBodyResponse.Code"));

		Data data = new Data();
		data.setTotalCount(_ctx.integerValue("SearchBodyResponse.Data.TotalCount"));
		data.setPageSize(_ctx.integerValue("SearchBodyResponse.Data.PageSize"));
		data.setTotalPage(_ctx.integerValue("SearchBodyResponse.Data.TotalPage"));
		data.setPageNo(_ctx.integerValue("SearchBodyResponse.Data.PageNo"));

		List<Record> records = new ArrayList<Record>();
		for (int i = 0; i < _ctx.lengthValue("SearchBodyResponse.Data.Records.Length"); i++) {
			Record record = new Record();
			record.setTargetImageUrl(_ctx.stringValue("SearchBodyResponse.Data.Records["+ i +"].TargetImageUrl"));
			record.setScore(_ctx.floatValue("SearchBodyResponse.Data.Records["+ i +"].Score"));
			record.setRightBottomX(_ctx.floatValue("SearchBodyResponse.Data.Records["+ i +"].RightBottomX"));
			record.setRightBottomY(_ctx.floatValue("SearchBodyResponse.Data.Records["+ i +"].RightBottomY"));
			record.setGbId(_ctx.stringValue("SearchBodyResponse.Data.Records["+ i +"].GbId"));
			record.setImageUrl(_ctx.stringValue("SearchBodyResponse.Data.Records["+ i +"].ImageUrl"));
			record.setLeftTopY(_ctx.floatValue("SearchBodyResponse.Data.Records["+ i +"].LeftTopY"));
			record.setLeftTopX(_ctx.floatValue("SearchBodyResponse.Data.Records["+ i +"].LeftTopX"));

			records.add(record);
		}
		data.setRecords(records);
		searchBodyResponse.setData(data);
	 
	 	return searchBodyResponse;
	}
}