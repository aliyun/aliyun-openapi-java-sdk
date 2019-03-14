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

	public static MetastoreDescribeDataSourceResponse unmarshall(MetastoreDescribeDataSourceResponse metastoreDescribeDataSourceResponse, UnmarshallerContext context) {
		
		metastoreDescribeDataSourceResponse.setRequestId(context.stringValue("MetastoreDescribeDataSourceResponse.RequestId"));

		DataSource dataSource = new DataSource();
		dataSource.setId(context.stringValue("MetastoreDescribeDataSourceResponse.DataSource.Id"));
		dataSource.setName(context.stringValue("MetastoreDescribeDataSourceResponse.DataSource.Name"));
		dataSource.setSourceType(context.stringValue("MetastoreDescribeDataSourceResponse.DataSource.SourceType"));
		dataSource.setDescription(context.stringValue("MetastoreDescribeDataSourceResponse.DataSource.Description"));
		dataSource.setConnectionInfo(context.stringValue("MetastoreDescribeDataSourceResponse.DataSource.ConnectionInfo"));
		dataSource.setClusterBizId(context.stringValue("MetastoreDescribeDataSourceResponse.DataSource.ClusterBizId"));
		dataSource.setClusterName(context.stringValue("MetastoreDescribeDataSourceResponse.DataSource.ClusterName"));
		dataSource.setUserId(context.stringValue("MetastoreDescribeDataSourceResponse.DataSource.UserId"));
		dataSource.setGmtCreate(context.longValue("MetastoreDescribeDataSourceResponse.DataSource.GmtCreate"));
		dataSource.setGmtModified(context.longValue("MetastoreDescribeDataSourceResponse.DataSource.GmtModified"));
		dataSource.setCapacity(context.longValue("MetastoreDescribeDataSourceResponse.DataSource.Capacity"));
		dataSource.setUsedSize(context.longValue("MetastoreDescribeDataSourceResponse.DataSource.UsedSize"));

		List<Config> configList = new ArrayList<Config>();
		for (int i = 0; i < context.lengthValue("MetastoreDescribeDataSourceResponse.DataSource.ConfigList.Length"); i++) {
			Config config = new Config();
			config.setConfigName(context.stringValue("MetastoreDescribeDataSourceResponse.DataSource.ConfigList["+ i +"].ConfigName"));
			config.setValue(context.stringValue("MetastoreDescribeDataSourceResponse.DataSource.ConfigList["+ i +"].Value"));

			configList.add(config);
		}
		dataSource.setConfigList(configList);
		metastoreDescribeDataSourceResponse.setDataSource(dataSource);
	 
	 	return metastoreDescribeDataSourceResponse;
	}
}