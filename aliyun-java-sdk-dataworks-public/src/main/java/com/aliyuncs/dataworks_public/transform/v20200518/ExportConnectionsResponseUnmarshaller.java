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

import com.aliyuncs.dataworks_public.model.v20200518.ExportConnectionsResponse;
import com.aliyuncs.dataworks_public.model.v20200518.ExportConnectionsResponse.Data;
import com.aliyuncs.dataworks_public.model.v20200518.ExportConnectionsResponse.Data.DataSourcesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ExportConnectionsResponseUnmarshaller {

	public static ExportConnectionsResponse unmarshall(ExportConnectionsResponse exportConnectionsResponse, UnmarshallerContext _ctx) {
		
		exportConnectionsResponse.setRequestId(_ctx.stringValue("ExportConnectionsResponse.RequestId"));
		exportConnectionsResponse.setHttpStatusCode(_ctx.integerValue("ExportConnectionsResponse.HttpStatusCode"));
		exportConnectionsResponse.setSuccess(_ctx.booleanValue("ExportConnectionsResponse.Success"));

		Data data = new Data();
		data.setPageNumber(_ctx.integerValue("ExportConnectionsResponse.Data.PageNumber"));
		data.setPageSize(_ctx.integerValue("ExportConnectionsResponse.Data.PageSize"));
		data.setTotalCount(_ctx.integerValue("ExportConnectionsResponse.Data.TotalCount"));

		List<DataSourcesItem> dataSources = new ArrayList<DataSourcesItem>();
		for (int i = 0; i < _ctx.lengthValue("ExportConnectionsResponse.Data.DataSources.Length"); i++) {
			DataSourcesItem dataSourcesItem = new DataSourcesItem();
			dataSourcesItem.setStatus(_ctx.integerValue("ExportConnectionsResponse.Data.DataSources["+ i +"].Status"));
			dataSourcesItem.setProjectId(_ctx.integerValue("ExportConnectionsResponse.Data.DataSources["+ i +"].ProjectId"));
			dataSourcesItem.setSubType(_ctx.stringValue("ExportConnectionsResponse.Data.DataSources["+ i +"].SubType"));
			dataSourcesItem.setGmtModified(_ctx.stringValue("ExportConnectionsResponse.Data.DataSources["+ i +"].GmtModified"));
			dataSourcesItem.setEnvType(_ctx.integerValue("ExportConnectionsResponse.Data.DataSources["+ i +"].EnvType"));
			dataSourcesItem.setConnectStatus(_ctx.integerValue("ExportConnectionsResponse.Data.DataSources["+ i +"].ConnectStatus"));
			dataSourcesItem.setSequence(_ctx.integerValue("ExportConnectionsResponse.Data.DataSources["+ i +"].Sequence"));
			dataSourcesItem.setDescription(_ctx.stringValue("ExportConnectionsResponse.Data.DataSources["+ i +"].Description"));
			dataSourcesItem.setDataSourceType(_ctx.stringValue("ExportConnectionsResponse.Data.DataSources["+ i +"].DataSourceType"));
			dataSourcesItem.setGmtCreate(_ctx.stringValue("ExportConnectionsResponse.Data.DataSources["+ i +"].GmtCreate"));
			dataSourcesItem.setDefaultEngine(_ctx.booleanValue("ExportConnectionsResponse.Data.DataSources["+ i +"].DefaultEngine"));
			dataSourcesItem.setShared(_ctx.booleanValue("ExportConnectionsResponse.Data.DataSources["+ i +"].Shared"));
			dataSourcesItem.setOperator(_ctx.stringValue("ExportConnectionsResponse.Data.DataSources["+ i +"].Operator"));
			dataSourcesItem.setName(_ctx.stringValue("ExportConnectionsResponse.Data.DataSources["+ i +"].Name"));
			dataSourcesItem.setContent(_ctx.stringValue("ExportConnectionsResponse.Data.DataSources["+ i +"].Content"));
			dataSourcesItem.setId(_ctx.integerValue("ExportConnectionsResponse.Data.DataSources["+ i +"].Id"));
			dataSourcesItem.setBindingCalcEngineId(_ctx.integerValue("ExportConnectionsResponse.Data.DataSources["+ i +"].BindingCalcEngineId"));
			dataSourcesItem.setTenantId(_ctx.longValue("ExportConnectionsResponse.Data.DataSources["+ i +"].TenantId"));

			dataSources.add(dataSourcesItem);
		}
		data.setDataSources(dataSources);
		exportConnectionsResponse.setData(data);
	 
	 	return exportConnectionsResponse;
	}
}