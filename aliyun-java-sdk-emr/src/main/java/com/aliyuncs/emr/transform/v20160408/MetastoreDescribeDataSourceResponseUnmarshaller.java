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

package com.aliyuncs.emr.transform.v20160408;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.emr.model.v20160408.MetastoreDescribeDataSourceResponse;
import com.aliyuncs.emr.model.v20160408.MetastoreDescribeDataSourceResponse.DataSource;
import com.aliyuncs.emr.model.v20160408.MetastoreDescribeDataSourceResponse.DataSource.Config;
import com.aliyuncs.transform.UnmarshallerContext;


public class MetastoreDescribeDataSourceResponseUnmarshaller {

	public static MetastoreDescribeDataSourceResponse unmarshall(MetastoreDescribeDataSourceResponse metastoreDescribeDataSourceResponse, UnmarshallerContext _ctx) {
		
		metastoreDescribeDataSourceResponse.setRequestId(_ctx.stringValue("MetastoreDescribeDataSourceResponse.RequestId"));

		DataSource dataSource = new DataSource();
		dataSource.setId(_ctx.stringValue("MetastoreDescribeDataSourceResponse.DataSource.Id"));
		dataSource.setName(_ctx.stringValue("MetastoreDescribeDataSourceResponse.DataSource.Name"));
		dataSource.setSourceType(_ctx.stringValue("MetastoreDescribeDataSourceResponse.DataSource.SourceType"));
		dataSource.setDescription(_ctx.stringValue("MetastoreDescribeDataSourceResponse.DataSource.Description"));
		dataSource.setConnectionInfo(_ctx.stringValue("MetastoreDescribeDataSourceResponse.DataSource.ConnectionInfo"));
		dataSource.setClusterBizId(_ctx.stringValue("MetastoreDescribeDataSourceResponse.DataSource.ClusterBizId"));
		dataSource.setClusterName(_ctx.stringValue("MetastoreDescribeDataSourceResponse.DataSource.ClusterName"));
		dataSource.setUserId(_ctx.stringValue("MetastoreDescribeDataSourceResponse.DataSource.UserId"));
		dataSource.setGmtCreate(_ctx.longValue("MetastoreDescribeDataSourceResponse.DataSource.GmtCreate"));
		dataSource.setGmtModified(_ctx.longValue("MetastoreDescribeDataSourceResponse.DataSource.GmtModified"));
		dataSource.setCapacity(_ctx.longValue("MetastoreDescribeDataSourceResponse.DataSource.Capacity"));
		dataSource.setUsedSize(_ctx.longValue("MetastoreDescribeDataSourceResponse.DataSource.UsedSize"));

		List<Config> configList = new ArrayList<Config>();
		for (int i = 0; i < _ctx.lengthValue("MetastoreDescribeDataSourceResponse.DataSource.ConfigList.Length"); i++) {
			Config config = new Config();
			config.setConfigName(_ctx.stringValue("MetastoreDescribeDataSourceResponse.DataSource.ConfigList["+ i +"].ConfigName"));
			config.setValue(_ctx.stringValue("MetastoreDescribeDataSourceResponse.DataSource.ConfigList["+ i +"].Value"));

			configList.add(config);
		}
		dataSource.setConfigList(configList);
		metastoreDescribeDataSourceResponse.setDataSource(dataSource);
	 
	 	return metastoreDescribeDataSourceResponse;
	}
}