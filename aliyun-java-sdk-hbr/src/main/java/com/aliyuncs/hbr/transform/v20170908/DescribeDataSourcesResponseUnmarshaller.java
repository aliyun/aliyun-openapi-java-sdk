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

package com.aliyuncs.hbr.transform.v20170908;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.hbr.model.v20170908.DescribeDataSourcesResponse;
import com.aliyuncs.hbr.model.v20170908.DescribeDataSourcesResponse.DataSource;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDataSourcesResponseUnmarshaller {

	public static DescribeDataSourcesResponse unmarshall(DescribeDataSourcesResponse describeDataSourcesResponse, UnmarshallerContext _ctx) {
		
		describeDataSourcesResponse.setRequestId(_ctx.stringValue("DescribeDataSourcesResponse.RequestId"));
		describeDataSourcesResponse.setSuccess(_ctx.booleanValue("DescribeDataSourcesResponse.Success"));
		describeDataSourcesResponse.setCode(_ctx.stringValue("DescribeDataSourcesResponse.Code"));
		describeDataSourcesResponse.setMessage(_ctx.stringValue("DescribeDataSourcesResponse.Message"));
		describeDataSourcesResponse.setPageNumber(_ctx.integerValue("DescribeDataSourcesResponse.PageNumber"));
		describeDataSourcesResponse.setPageSize(_ctx.integerValue("DescribeDataSourcesResponse.PageSize"));
		describeDataSourcesResponse.setTotalCount(_ctx.longValue("DescribeDataSourcesResponse.TotalCount"));

		List<DataSource> dataSources = new ArrayList<DataSource>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDataSourcesResponse.DataSources.Length"); i++) {
			DataSource dataSource = new DataSource();
			dataSource.setIndexLevel(_ctx.stringValue("DescribeDataSourcesResponse.DataSources["+ i +"].IndexLevel"));
			dataSource.setSchedule(_ctx.stringValue("DescribeDataSourcesResponse.DataSources["+ i +"].Schedule"));
			dataSource.setDataSourceName(_ctx.stringValue("DescribeDataSourcesResponse.DataSources["+ i +"].DataSourceName"));
			dataSource.setDataSourceId(_ctx.stringValue("DescribeDataSourcesResponse.DataSources["+ i +"].DataSourceId"));
			dataSource.setOptions(_ctx.stringValue("DescribeDataSourcesResponse.DataSources["+ i +"].Options"));
			dataSource.setSpeedLimit(_ctx.stringValue("DescribeDataSourcesResponse.DataSources["+ i +"].SpeedLimit"));
			dataSource.setPlanId(_ctx.stringValue("DescribeDataSourcesResponse.DataSources["+ i +"].PlanId"));
			dataSource.setIndexUpdateTime(_ctx.booleanValue("DescribeDataSourcesResponse.DataSources["+ i +"].IndexUpdateTime"));
			dataSource.setExclude(_ctx.stringValue("DescribeDataSourcesResponse.DataSources["+ i +"].Exclude"));
			dataSource.setIndexing(_ctx.booleanValue("DescribeDataSourcesResponse.DataSources["+ i +"].Indexing"));
			dataSource.setUpdatedTime(_ctx.longValue("DescribeDataSourcesResponse.DataSources["+ i +"].UpdatedTime"));
			dataSource.setDataSourceType(_ctx.stringValue("DescribeDataSourcesResponse.DataSources["+ i +"].DataSourceType"));
			dataSource.setConnectionInfo(_ctx.stringValue("DescribeDataSourcesResponse.DataSources["+ i +"].ConnectionInfo"));
			dataSource.setIndexAvailable(_ctx.booleanValue("DescribeDataSourcesResponse.DataSources["+ i +"].IndexAvailable"));
			dataSource.setCreatedTime(_ctx.longValue("DescribeDataSourcesResponse.DataSources["+ i +"].CreatedTime"));
			dataSource.setInclude(_ctx.stringValue("DescribeDataSourcesResponse.DataSources["+ i +"].Include"));
			dataSource.setClusterId(_ctx.stringValue("DescribeDataSourcesResponse.DataSources["+ i +"].ClusterId"));

			List<String> paths = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDataSourcesResponse.DataSources["+ i +"].Paths.Length"); j++) {
				paths.add(_ctx.stringValue("DescribeDataSourcesResponse.DataSources["+ i +"].Paths["+ j +"]"));
			}
			dataSource.setPaths(paths);

			dataSources.add(dataSource);
		}
		describeDataSourcesResponse.setDataSources(dataSources);
	 
	 	return describeDataSourcesResponse;
	}
}