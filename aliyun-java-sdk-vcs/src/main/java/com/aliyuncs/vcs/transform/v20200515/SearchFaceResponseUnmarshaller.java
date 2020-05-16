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

import com.aliyuncs.vcs.model.v20200515.SearchFaceResponse;
import com.aliyuncs.vcs.model.v20200515.SearchFaceResponse.Data;
import com.aliyuncs.vcs.model.v20200515.SearchFaceResponse.Data.Record;
import com.aliyuncs.transform.UnmarshallerContext;


public class SearchFaceResponseUnmarshaller {

	public static SearchFaceResponse unmarshall(SearchFaceResponse searchFaceResponse, UnmarshallerContext _ctx) {
		
		searchFaceResponse.setRequestId(_ctx.stringValue("SearchFaceResponse.RequestId"));
		searchFaceResponse.setCode(_ctx.stringValue("SearchFaceResponse.Code"));
		searchFaceResponse.setMessage(_ctx.stringValue("SearchFaceResponse.Message"));

		Data data = new Data();
		data.setPageNo(_ctx.integerValue("SearchFaceResponse.Data.PageNo"));
		data.setPageSize(_ctx.integerValue("SearchFaceResponse.Data.PageSize"));
		data.setTotalCount(_ctx.integerValue("SearchFaceResponse.Data.TotalCount"));
		data.setTotalPage(_ctx.integerValue("SearchFaceResponse.Data.TotalPage"));

		List<Record> records = new ArrayList<Record>();
		for (int i = 0; i < _ctx.lengthValue("SearchFaceResponse.Data.Records.Length"); i++) {
			Record record = new Record();
			record.setGbId(_ctx.stringValue("SearchFaceResponse.Data.Records["+ i +"].GbId"));
			record.setImageUrl(_ctx.stringValue("SearchFaceResponse.Data.Records["+ i +"].ImageUrl"));
			record.setLeftTopX(_ctx.integerValue("SearchFaceResponse.Data.Records["+ i +"].LeftTopX"));
			record.setLeftTopY(_ctx.integerValue("SearchFaceResponse.Data.Records["+ i +"].LeftTopY"));
			record.setRightBottomX(_ctx.integerValue("SearchFaceResponse.Data.Records["+ i +"].RightBottomX"));
			record.setRightBottomY(_ctx.integerValue("SearchFaceResponse.Data.Records["+ i +"].RightBottomY"));
			record.setScore(_ctx.integerValue("SearchFaceResponse.Data.Records["+ i +"].Score"));
			record.setTargetImageUrl(_ctx.stringValue("SearchFaceResponse.Data.Records["+ i +"].TargetImageUrl"));

			records.add(record);
		}
		data.setRecords(records);
		searchFaceResponse.setData(data);
	 
	 	return searchFaceResponse;
	}
}