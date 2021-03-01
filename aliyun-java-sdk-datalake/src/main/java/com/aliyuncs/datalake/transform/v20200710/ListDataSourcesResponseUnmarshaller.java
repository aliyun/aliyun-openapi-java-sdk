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

package com.aliyuncs.datalake.transform.v20200710;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.datalake.model.v20200710.ListDataSourcesResponse;
import com.aliyuncs.datalake.model.v20200710.ListDataSourcesResponse.DataSource;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDataSourcesResponseUnmarshaller {

	public static ListDataSourcesResponse unmarshall(ListDataSourcesResponse listDataSourcesResponse, UnmarshallerContext _ctx) {
		
		listDataSourcesResponse.setRequestId(_ctx.stringValue("ListDataSourcesResponse.RequestId"));
		listDataSourcesResponse.setSuccess(_ctx.booleanValue("ListDataSourcesResponse.Success"));
		listDataSourcesResponse.setTotalCount(_ctx.integerValue("ListDataSourcesResponse.TotalCount"));

		List<DataSource> dataSources = new ArrayList<DataSource>();
		for (int i = 0; i < _ctx.lengthValue("ListDataSourcesResponse.DataSources.Length"); i++) {
			DataSource dataSource = new DataSource();
			dataSource.setConnectionInfo(_ctx.stringValue("ListDataSourcesResponse.DataSources["+ i +"].ConnectionInfo"));
			dataSource.setDataSourceId(_ctx.stringValue("ListDataSourcesResponse.DataSources["+ i +"].DataSourceId"));
			dataSource.setDataSourceType(_ctx.stringValue("ListDataSourcesResponse.DataSources["+ i +"].DataSourceType"));
			dataSource.setGmtCreate(_ctx.stringValue("ListDataSourcesResponse.DataSources["+ i +"].GmtCreate"));
			dataSource.setGmtModified(_ctx.stringValue("ListDataSourcesResponse.DataSources["+ i +"].GmtModified"));
			dataSource.setName(_ctx.stringValue("ListDataSourcesResponse.DataSources["+ i +"].Name"));

			dataSources.add(dataSource);
		}
		listDataSourcesResponse.setDataSources(dataSources);
	 
	 	return listDataSourcesResponse;
	}
}