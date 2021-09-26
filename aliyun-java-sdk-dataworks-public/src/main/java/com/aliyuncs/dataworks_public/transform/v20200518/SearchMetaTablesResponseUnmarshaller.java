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
		searchMetaTablesResponse.setHttpStatusCode(_ctx.integerValue("SearchMetaTablesResponse.HttpStatusCode"));
		searchMetaTablesResponse.setErrorMessage(_ctx.stringValue("SearchMetaTablesResponse.ErrorMessage"));
		searchMetaTablesResponse.setSuccess(_ctx.booleanValue("SearchMetaTablesResponse.Success"));
		searchMetaTablesResponse.setErrorCode(_ctx.stringValue("SearchMetaTablesResponse.ErrorCode"));

		Data data = new Data();
		data.setPageNumber(_ctx.integerValue("SearchMetaTablesResponse.Data.PageNumber"));
		data.setPageSize(_ctx.integerValue("SearchMetaTablesResponse.Data.PageSize"));
		data.setTotalCount(_ctx.longValue("SearchMetaTablesResponse.Data.TotalCount"));

		List<DataEntityListItem> dataEntityList = new ArrayList<DataEntityListItem>();
		for (int i = 0; i < _ctx.lengthValue("SearchMetaTablesResponse.Data.DataEntityList.Length"); i++) {
			DataEntityListItem dataEntityListItem = new DataEntityListItem();
			dataEntityListItem.setTableName(_ctx.stringValue("SearchMetaTablesResponse.Data.DataEntityList["+ i +"].TableName"));
			dataEntityListItem.setDatabaseName(_ctx.stringValue("SearchMetaTablesResponse.Data.DataEntityList["+ i +"].DatabaseName"));
			dataEntityListItem.setEntityType(_ctx.integerValue("SearchMetaTablesResponse.Data.DataEntityList["+ i +"].EntityType"));
			dataEntityListItem.setProjectName(_ctx.stringValue("SearchMetaTablesResponse.Data.DataEntityList["+ i +"].ProjectName"));
			dataEntityListItem.setProjectId(_ctx.longValue("SearchMetaTablesResponse.Data.DataEntityList["+ i +"].ProjectId"));
			dataEntityListItem.setTableGuid(_ctx.stringValue("SearchMetaTablesResponse.Data.DataEntityList["+ i +"].TableGuid"));
			dataEntityListItem.setOwnerId(_ctx.stringValue("SearchMetaTablesResponse.Data.DataEntityList["+ i +"].OwnerId"));
			dataEntityListItem.setClusterId(_ctx.stringValue("SearchMetaTablesResponse.Data.DataEntityList["+ i +"].ClusterId"));
			dataEntityListItem.setEnvType(_ctx.integerValue("SearchMetaTablesResponse.Data.DataEntityList["+ i +"].EnvType"));
			dataEntityListItem.setTenantId(_ctx.longValue("SearchMetaTablesResponse.Data.DataEntityList["+ i +"].TenantId"));

			dataEntityList.add(dataEntityListItem);
		}
		data.setDataEntityList(dataEntityList);
		searchMetaTablesResponse.setData(data);
	 
	 	return searchMetaTablesResponse;
	}
}