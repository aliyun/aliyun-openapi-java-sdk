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

package com.aliyuncs.dataworks_public.transform.v20200518;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataworks_public.model.v20200518.SearchMetaTablesResponse;
import com.aliyuncs.dataworks_public.model.v20200518.SearchMetaTablesResponse.Data;
import com.aliyuncs.dataworks_public.model.v20200518.SearchMetaTablesResponse.Data.DataEntityListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class SearchMetaTablesResponseUnmarshaller {

	public static SearchMetaTablesResponse unmarshall(SearchMetaTablesResponse searchMetaTablesResponse, UnmarshallerContext _ctx) {
		
		searchMetaTablesResponse.setRequestId(_ctx.stringValue("SearchMetaTablesResponse.RequestId"));
		searchMetaTablesResponse.setErrorCode(_ctx.stringValue("SearchMetaTablesResponse.ErrorCode"));
		searchMetaTablesResponse.setErrorMessage(_ctx.stringValue("SearchMetaTablesResponse.ErrorMessage"));
		searchMetaTablesResponse.setHttpStatusCode(_ctx.integerValue("SearchMetaTablesResponse.HttpStatusCode"));
		searchMetaTablesResponse.setSuccess(_ctx.booleanValue("SearchMetaTablesResponse.Success"));

		Data data = new Data();
		data.setPageNumber(_ctx.integerValue("SearchMetaTablesResponse.Data.PageNumber"));
		data.setPageSize(_ctx.integerValue("SearchMetaTablesResponse.Data.PageSize"));
		data.setTotalCount(_ctx.longValue("SearchMetaTablesResponse.Data.TotalCount"));

		List<DataEntityListItem> dataEntityList = new ArrayList<DataEntityListItem>();
		for (int i = 0; i < _ctx.lengthValue("SearchMetaTablesResponse.Data.DataEntityList.Length"); i++) {
			DataEntityListItem dataEntityListItem = new DataEntityListItem();
			dataEntityListItem.setTableName(_ctx.stringValue("SearchMetaTablesResponse.Data.DataEntityList["+ i +"].TableName"));
			dataEntityListItem.setTableGuid(_ctx.stringValue("SearchMetaTablesResponse.Data.DataEntityList["+ i +"].TableGuid"));
			dataEntityListItem.setOwnerId(_ctx.stringValue("SearchMetaTablesResponse.Data.DataEntityList["+ i +"].OwnerId"));
			dataEntityListItem.setTenantId(_ctx.longValue("SearchMetaTablesResponse.Data.DataEntityList["+ i +"].TenantId"));
			dataEntityListItem.setEnvType(_ctx.integerValue("SearchMetaTablesResponse.Data.DataEntityList["+ i +"].EnvType"));
			dataEntityListItem.setEntityType(_ctx.integerValue("SearchMetaTablesResponse.Data.DataEntityList["+ i +"].EntityType"));
			dataEntityListItem.setProjectId(_ctx.longValue("SearchMetaTablesResponse.Data.DataEntityList["+ i +"].ProjectId"));
			dataEntityListItem.setProjectName(_ctx.stringValue("SearchMetaTablesResponse.Data.DataEntityList["+ i +"].ProjectName"));

			dataEntityList.add(dataEntityListItem);
		}
		data.setDataEntityList(dataEntityList);
		searchMetaTablesResponse.setData(data);
	 
	 	return searchMetaTablesResponse;
	}
}