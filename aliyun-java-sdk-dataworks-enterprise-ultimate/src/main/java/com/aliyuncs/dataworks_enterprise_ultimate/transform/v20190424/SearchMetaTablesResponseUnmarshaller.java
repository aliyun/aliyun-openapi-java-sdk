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

package com.aliyuncs.dataworks_enterprise_ultimate.transform.v20190424;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataworks_enterprise_ultimate.model.v20190424.SearchMetaTablesResponse;
import com.aliyuncs.dataworks_enterprise_ultimate.model.v20190424.SearchMetaTablesResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class SearchMetaTablesResponseUnmarshaller {

	public static SearchMetaTablesResponse unmarshall(SearchMetaTablesResponse searchMetaTablesResponse, UnmarshallerContext _ctx) {
		
		searchMetaTablesResponse.setRequestId(_ctx.stringValue("SearchMetaTablesResponse.RequestId"));
		searchMetaTablesResponse.setErrCode(_ctx.stringValue("SearchMetaTablesResponse.ErrCode"));
		searchMetaTablesResponse.setErrMsg(_ctx.stringValue("SearchMetaTablesResponse.ErrMsg"));
		searchMetaTablesResponse.setPageNum(_ctx.integerValue("SearchMetaTablesResponse.PageNum"));
		searchMetaTablesResponse.setPageSize(_ctx.integerValue("SearchMetaTablesResponse.PageSize"));
		searchMetaTablesResponse.setTotalNum(_ctx.integerValue("SearchMetaTablesResponse.TotalNum"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("SearchMetaTablesResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setAppGuid(_ctx.stringValue("SearchMetaTablesResponse.Data["+ i +"].AppGuid"));
			dataItem.setTableGuid(_ctx.stringValue("SearchMetaTablesResponse.Data["+ i +"].TableGuid"));
			dataItem.setTableName(_ctx.stringValue("SearchMetaTablesResponse.Data["+ i +"].TableName"));
			dataItem.setCreateTime(_ctx.stringValue("SearchMetaTablesResponse.Data["+ i +"].CreateTime"));
			dataItem.setLastModifyTime(_ctx.stringValue("SearchMetaTablesResponse.Data["+ i +"].LastModifyTime"));
			dataItem.setLastDdlTime(_ctx.stringValue("SearchMetaTablesResponse.Data["+ i +"].LastDdlTime"));
			dataItem.setLastAccessTime(_ctx.stringValue("SearchMetaTablesResponse.Data["+ i +"].LastAccessTime"));
			dataItem.setOwnerId(_ctx.stringValue("SearchMetaTablesResponse.Data["+ i +"].OwnerId"));

			data.add(dataItem);
		}
		searchMetaTablesResponse.setData(data);
	 
	 	return searchMetaTablesResponse;
	}
}