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

import com.aliyuncs.datalake.model.v20200710.DescribeDataSourceResponse;
import com.aliyuncs.datalake.model.v20200710.DescribeDataSourceResponse.DataSource;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDataSourceResponseUnmarshaller {

	public static DescribeDataSourceResponse unmarshall(DescribeDataSourceResponse describeDataSourceResponse, UnmarshallerContext _ctx) {
		
		describeDataSourceResponse.setRequestId(_ctx.stringValue("DescribeDataSourceResponse.RequestId"));
		describeDataSourceResponse.setSuccess(_ctx.booleanValue("DescribeDataSourceResponse.Success"));

		DataSource dataSource = new DataSource();
		dataSource.setDataSourceId(_ctx.stringValue("DescribeDataSourceResponse.DataSource.DataSourceId"));
		dataSource.setName(_ctx.stringValue("DescribeDataSourceResponse.DataSource.Name"));
		dataSource.setDataSourceType(_ctx.stringValue("DescribeDataSourceResponse.DataSource.DataSourceType"));
		dataSource.setConnectionInfo(_ctx.stringValue("DescribeDataSourceResponse.DataSource.ConnectionInfo"));
		dataSource.setGmtModified(_ctx.stringValue("DescribeDataSourceResponse.DataSource.GmtModified"));
		dataSource.setGmtCreate(_ctx.stringValue("DescribeDataSourceResponse.DataSource.GmtCreate"));
		describeDataSourceResponse.setDataSource(dataSource);
	 
	 	return describeDataSourceResponse;
	}
}