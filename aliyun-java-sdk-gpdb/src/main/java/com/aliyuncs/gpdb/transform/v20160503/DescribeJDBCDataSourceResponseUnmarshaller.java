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

package com.aliyuncs.gpdb.transform.v20160503;

import com.aliyuncs.gpdb.model.v20160503.DescribeJDBCDataSourceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeJDBCDataSourceResponseUnmarshaller {

	public static DescribeJDBCDataSourceResponse unmarshall(DescribeJDBCDataSourceResponse describeJDBCDataSourceResponse, UnmarshallerContext _ctx) {
		
		describeJDBCDataSourceResponse.setRequestId(_ctx.stringValue("DescribeJDBCDataSourceResponse.RequestId"));
		describeJDBCDataSourceResponse.setDataSourceId(_ctx.stringValue("DescribeJDBCDataSourceResponse.DataSourceId"));
		describeJDBCDataSourceResponse.setDataSourceName(_ctx.stringValue("DescribeJDBCDataSourceResponse.DataSourceName"));
		describeJDBCDataSourceResponse.setDataSourceDescription(_ctx.stringValue("DescribeJDBCDataSourceResponse.DataSourceDescription"));
		describeJDBCDataSourceResponse.setDataSourceStatus(_ctx.stringValue("DescribeJDBCDataSourceResponse.DataSourceStatus"));
		describeJDBCDataSourceResponse.setStatusMessage(_ctx.stringValue("DescribeJDBCDataSourceResponse.StatusMessage"));
		describeJDBCDataSourceResponse.setCreateTime(_ctx.stringValue("DescribeJDBCDataSourceResponse.CreateTime"));
		describeJDBCDataSourceResponse.setDataSourceType(_ctx.stringValue("DescribeJDBCDataSourceResponse.DataSourceType"));
		describeJDBCDataSourceResponse.setJDBCConnectionString(_ctx.stringValue("DescribeJDBCDataSourceResponse.JDBCConnectionString"));
		describeJDBCDataSourceResponse.setJDBCUserName(_ctx.stringValue("DescribeJDBCDataSourceResponse.JDBCUserName"));
		describeJDBCDataSourceResponse.setJDBCPassword(_ctx.stringValue("DescribeJDBCDataSourceResponse.JDBCPassword"));
		describeJDBCDataSourceResponse.setModifyTime(_ctx.stringValue("DescribeJDBCDataSourceResponse.ModifyTime"));
		describeJDBCDataSourceResponse.setExternalDataServiceId(_ctx.stringValue("DescribeJDBCDataSourceResponse.ExternalDataServiceId"));
	 
	 	return describeJDBCDataSourceResponse;
	}
}