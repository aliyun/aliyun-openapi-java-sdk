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

import com.aliyuncs.dataworks_public.model.v20200518.ListDataSourcesResponse;
import com.aliyuncs.dataworks_public.model.v20200518.ListDataSourcesResponse.Data;
import com.aliyuncs.dataworks_public.model.v20200518.ListDataSourcesResponse.Data.DataSourcesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDataSourcesResponseUnmarshaller {

	public static ListDataSourcesResponse unmarshall(ListDataSourcesResponse listDataSourcesResponse, UnmarshallerContext _ctx) {
		
		listDataSourcesResponse.setRequestId(_ctx.stringValue("ListDataSourcesResponse.RequestId"));
		listDataSourcesResponse.setHttpStatusCode(_ctx.integerValue("ListDataSourcesResponse.HttpStatusCode"));
		listDataSourcesResponse.setSuccess(_ctx.booleanValue("ListDataSourcesResponse.Success"));

		Data data = new Data();
		data.setPageNumber(_ctx.integerValue("ListDataSourcesResponse.Data.PageNumber"));
		data.setPageSize(_ctx.integerValue("ListDataSourcesResponse.Data.PageSize"));
		data.setTotalCount(_ctx.integerValue("ListDataSourcesResponse.Data.TotalCount"));

		List<DataSourcesItem> dataSources = new ArrayList<DataSourcesItem>();
		for (int i = 0; i < _ctx.lengthValue("ListDataSourcesResponse.Data.DataSources.Length"); i++) {
			DataSourcesItem dataSourcesItem = new DataSourcesItem();
			dataSourcesItem.setShared(_ctx.booleanValue("ListDataSourcesResponse.Data.DataSources["+ i +"].Shared"));
			dataSourcesItem.setGmtModified(_ctx.stringValue("ListDataSourcesResponse.Data.DataSources["+ i +"].GmtModified"));
			dataSourcesItem.setConnectStatus(_ctx.integerValue("ListDataSourcesResponse.Data.DataSources["+ i +"].ConnectStatus"));
			dataSourcesItem.setBindingCalcEngineId(_ctx.integerValue("ListDataSourcesResponse.Data.DataSources["+ i +"].BindingCalcEngineId"));
			dataSourcesItem.setDescription(_ctx.stringValue("ListDataSourcesResponse.Data.DataSources["+ i +"].Description"));
			dataSourcesItem.setDataSourceType(_ctx.stringValue("ListDataSourcesResponse.Data.DataSources["+ i +"].DataSourceType"));
			dataSourcesItem.setGmtCreate(_ctx.stringValue("ListDataSourcesResponse.Data.DataSources["+ i +"].GmtCreate"));
			dataSourcesItem.setDefaultEngine(_ctx.booleanValue("ListDataSourcesResponse.Data.DataSources["+ i +"].DefaultEngine"));
			dataSourcesItem.setOperator(_ctx.stringValue("ListDataSourcesResponse.Data.DataSources["+ i +"].Operator"));
			dataSourcesItem.setSequence(_ctx.integerValue("ListDataSourcesResponse.Data.DataSources["+ i +"].Sequence"));
			dataSourcesItem.setEnvType(_ctx.integerValue("ListDataSourcesResponse.Data.DataSources["+ i +"].EnvType"));
			dataSourcesItem.setTenantId(_ctx.longValue("ListDataSourcesResponse.Data.DataSources["+ i +"].TenantId"));
			dataSourcesItem.setName(_ctx.stringValue("ListDataSourcesResponse.Data.DataSources["+ i +"].Name"));
			dataSourcesItem.setSubType(_ctx.stringValue("ListDataSourcesResponse.Data.DataSources["+ i +"].SubType"));
			dataSourcesItem.setId(_ctx.integerValue("ListDataSourcesResponse.Data.DataSources["+ i +"].Id"));
			dataSourcesItem.setProjectId(_ctx.integerValue("ListDataSourcesResponse.Data.DataSources["+ i +"].ProjectId"));
			dataSourcesItem.setStatus(_ctx.integerValue("ListDataSourcesResponse.Data.DataSources["+ i +"].Status"));
			dataSourcesItem.setContent(_ctx.stringValue("ListDataSourcesResponse.Data.DataSources["+ i +"].Content"));

			dataSources.add(dataSourcesItem);
		}
		data.setDataSources(dataSources);
		listDataSourcesResponse.setData(data);
	 
	 	return listDataSourcesResponse;
	}
}