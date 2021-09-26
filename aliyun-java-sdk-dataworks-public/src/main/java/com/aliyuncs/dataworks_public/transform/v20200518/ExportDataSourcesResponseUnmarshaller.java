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

import com.aliyuncs.dataworks_public.model.v20200518.ExportDataSourcesResponse;
import com.aliyuncs.dataworks_public.model.v20200518.ExportDataSourcesResponse.Data;
import com.aliyuncs.dataworks_public.model.v20200518.ExportDataSourcesResponse.Data.DataSourcesItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ExportDataSourcesResponseUnmarshaller {

	public static ExportDataSourcesResponse unmarshall(ExportDataSourcesResponse exportDataSourcesResponse, UnmarshallerContext _ctx) {
		
		exportDataSourcesResponse.setRequestId(_ctx.stringValue("ExportDataSourcesResponse.RequestId"));
		exportDataSourcesResponse.setHttpStatusCode(_ctx.integerValue("ExportDataSourcesResponse.HttpStatusCode"));
		exportDataSourcesResponse.setSuccess(_ctx.booleanValue("ExportDataSourcesResponse.Success"));

		Data data = new Data();
		data.setPageNumber(_ctx.integerValue("ExportDataSourcesResponse.Data.PageNumber"));
		data.setPageSize(_ctx.integerValue("ExportDataSourcesResponse.Data.PageSize"));
		data.setTotalCount(_ctx.integerValue("ExportDataSourcesResponse.Data.TotalCount"));

		List<DataSourcesItem> dataSources = new ArrayList<DataSourcesItem>();
		for (int i = 0; i < _ctx.lengthValue("ExportDataSourcesResponse.Data.DataSources.Length"); i++) {
			DataSourcesItem dataSourcesItem = new DataSourcesItem();
			dataSourcesItem.setStatus(_ctx.integerValue("ExportDataSourcesResponse.Data.DataSources["+ i +"].Status"));
			dataSourcesItem.setProjectId(_ctx.integerValue("ExportDataSourcesResponse.Data.DataSources["+ i +"].ProjectId"));
			dataSourcesItem.setSubType(_ctx.stringValue("ExportDataSourcesResponse.Data.DataSources["+ i +"].SubType"));
			dataSourcesItem.setGmtModified(_ctx.stringValue("ExportDataSourcesResponse.Data.DataSources["+ i +"].GmtModified"));
			dataSourcesItem.setEnvType(_ctx.integerValue("ExportDataSourcesResponse.Data.DataSources["+ i +"].EnvType"));
			dataSourcesItem.setConnectStatus(_ctx.integerValue("ExportDataSourcesResponse.Data.DataSources["+ i +"].ConnectStatus"));
			dataSourcesItem.setSequence(_ctx.integerValue("ExportDataSourcesResponse.Data.DataSources["+ i +"].Sequence"));
			dataSourcesItem.setDescription(_ctx.stringValue("ExportDataSourcesResponse.Data.DataSources["+ i +"].Description"));
			dataSourcesItem.setDataSourceType(_ctx.stringValue("ExportDataSourcesResponse.Data.DataSources["+ i +"].DataSourceType"));
			dataSourcesItem.setGmtCreate(_ctx.stringValue("ExportDataSourcesResponse.Data.DataSources["+ i +"].GmtCreate"));
			dataSourcesItem.setDefaultEngine(_ctx.booleanValue("ExportDataSourcesResponse.Data.DataSources["+ i +"].DefaultEngine"));
			dataSourcesItem.setShared(_ctx.booleanValue("ExportDataSourcesResponse.Data.DataSources["+ i +"].Shared"));
			dataSourcesItem.setOperator(_ctx.stringValue("ExportDataSourcesResponse.Data.DataSources["+ i +"].Operator"));
			dataSourcesItem.setName(_ctx.stringValue("ExportDataSourcesResponse.Data.DataSources["+ i +"].Name"));
			dataSourcesItem.setContent(_ctx.stringValue("ExportDataSourcesResponse.Data.DataSources["+ i +"].Content"));
			dataSourcesItem.setId(_ctx.integerValue("ExportDataSourcesResponse.Data.DataSources["+ i +"].Id"));
			dataSourcesItem.setBindingCalcEngineId(_ctx.integerValue("ExportDataSourcesResponse.Data.DataSources["+ i +"].BindingCalcEngineId"));
			dataSourcesItem.setTenantId(_ctx.longValue("ExportDataSourcesResponse.Data.DataSources["+ i +"].TenantId"));

			dataSources.add(dataSourcesItem);
		}
		data.setDataSources(dataSources);
		exportDataSourcesResponse.setData(data);
	 
	 	return exportDataSourcesResponse;
	}
}