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

package com.aliyuncs.cdrs.transform.v20201101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cdrs.model.v20201101.PaginateProjectResponse;
import com.aliyuncs.cdrs.model.v20201101.PaginateProjectResponse.Data;
import com.aliyuncs.cdrs.model.v20201101.PaginateProjectResponse.Data.RecordsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class PaginateProjectResponseUnmarshaller {

	public static PaginateProjectResponse unmarshall(PaginateProjectResponse paginateProjectResponse, UnmarshallerContext _ctx) {
		
		paginateProjectResponse.setRequestId(_ctx.stringValue("PaginateProjectResponse.RequestId"));
		paginateProjectResponse.setCode(_ctx.stringValue("PaginateProjectResponse.Code"));
		paginateProjectResponse.setMessage(_ctx.stringValue("PaginateProjectResponse.Message"));

		Data data = new Data();
		data.setPageNumber(_ctx.integerValue("PaginateProjectResponse.Data.PageNumber"));
		data.setPageSize(_ctx.integerValue("PaginateProjectResponse.Data.PageSize"));
		data.setTotalCount(_ctx.integerValue("PaginateProjectResponse.Data.TotalCount"));
		data.setTotalPage(_ctx.integerValue("PaginateProjectResponse.Data.TotalPage"));

		List<RecordsItem> records = new ArrayList<RecordsItem>();
		for (int i = 0; i < _ctx.lengthValue("PaginateProjectResponse.Data.Records.Length"); i++) {
			RecordsItem recordsItem = new RecordsItem();
			recordsItem.setUserId(_ctx.stringValue("PaginateProjectResponse.Data.Records["+ i +"].UserId"));
			recordsItem.setType(_ctx.stringValue("PaginateProjectResponse.Data.Records["+ i +"].Type"));
			recordsItem.setCorpId(_ctx.stringValue("PaginateProjectResponse.Data.Records["+ i +"].CorpId"));
			recordsItem.setName(_ctx.stringValue("PaginateProjectResponse.Data.Records["+ i +"].Name"));
			recordsItem.setCreatedTime(_ctx.stringValue("PaginateProjectResponse.Data.Records["+ i +"].CreatedTime"));
			recordsItem.setModifiedTime(_ctx.stringValue("PaginateProjectResponse.Data.Records["+ i +"].ModifiedTime"));
			recordsItem.setIcon(_ctx.stringValue("PaginateProjectResponse.Data.Records["+ i +"].Icon"));
			recordsItem.setDescription(_ctx.stringValue("PaginateProjectResponse.Data.Records["+ i +"].Description"));
			recordsItem.setAggregateSceneCode(_ctx.stringValue("PaginateProjectResponse.Data.Records["+ i +"].AggregateSceneCode"));

			records.add(recordsItem);
		}
		data.setRecords(records);
		paginateProjectResponse.setData(data);
	 
	 	return paginateProjectResponse;
	}
}