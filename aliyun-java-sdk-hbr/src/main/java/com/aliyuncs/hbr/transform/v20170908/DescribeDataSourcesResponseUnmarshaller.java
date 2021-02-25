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
		describeDataSourcesResponse.setTotalCount(_ctx.longValue("DescribeDataSourcesResponse.TotalCount"));
		describeDataSourcesResponse.setPageSize(_ctx.integerValue("DescribeDataSourcesResponse.PageSize"));
		describeDataSourcesResponse.setPageNumber(_ctx.integerValue("DescribeDataSourcesResponse.PageNumber"));

		List<DataSource> dataSources = new ArrayList<DataSource>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDataSourcesResponse.DataSources.Length"); i++) {
			DataSource dataSource = new DataSource();
			dataSource.setCreatedTime(_ctx.longValue("DescribeDataSourcesResponse.DataSources["+ i +"].CreatedTime"));
			dataSource.setUpdatedTime(_ctx.longValue("DescribeDataSourcesResponse.DataSources["+ i +"].UpdatedTime"));
			dataSource.setDataSourceType(_ctx.stringValue("DescribeDataSourcesResponse.DataSources["+ i +"].DataSourceType"));
			dataSource.setDataSourceId(_ctx.stringValue("DescribeDataSourcesResponse.DataSources["+ i +"].DataSourceId"));
			dataSource.setDataSourceName(_ctx.stringValue("DescribeDataSourcesResponse.DataSources["+ i +"].DataSourceName"));
			dataSource.setConnectionInfo(_ctx.stringValue("DescribeDataSourcesResponse.DataSources["+ i +"].ConnectionInfo"));

			dataSources.add(dataSource);
		}
		describeDataSourcesResponse.setDataSources(dataSources);
	 
	 	return describeDataSourcesResponse;
	}
}