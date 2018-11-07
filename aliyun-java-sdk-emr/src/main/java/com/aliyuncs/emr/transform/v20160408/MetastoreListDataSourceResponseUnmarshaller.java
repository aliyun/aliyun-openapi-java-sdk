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

import com.aliyuncs.emr.model.v20160408.MetastoreListDataSourceResponse;
import com.aliyuncs.emr.model.v20160408.MetastoreListDataSourceResponse.DataSource;
import com.aliyuncs.emr.model.v20160408.MetastoreListDataSourceResponse.DataSource.Config;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class MetastoreListDataSourceResponseUnmarshaller {

	public static MetastoreListDataSourceResponse unmarshall(MetastoreListDataSourceResponse metastoreListDataSourceResponse, UnmarshallerContext context) {
		
		metastoreListDataSourceResponse.setRequestId(context.stringValue("MetastoreListDataSourceResponse.RequestId"));
		metastoreListDataSourceResponse.setTotalCount(context.integerValue("MetastoreListDataSourceResponse.TotalCount"));
		metastoreListDataSourceResponse.setPageNumber(context.integerValue("MetastoreListDataSourceResponse.PageNumber"));
		metastoreListDataSourceResponse.setPageSize(context.integerValue("MetastoreListDataSourceResponse.PageSize"));

		List<DataSource> dataSourceList = new ArrayList<DataSource>();
		for (int i = 0; i < context.lengthValue("MetastoreListDataSourceResponse.DataSourceList.Length"); i++) {
			DataSource dataSource = new DataSource();
			dataSource.setId(context.stringValue("MetastoreListDataSourceResponse.DataSourceList["+ i +"].Id"));
			dataSource.setName(context.stringValue("MetastoreListDataSourceResponse.DataSourceList["+ i +"].Name"));
			dataSource.setSourceType(context.stringValue("MetastoreListDataSourceResponse.DataSourceList["+ i +"].SourceType"));
			dataSource.setDescription(context.stringValue("MetastoreListDataSourceResponse.DataSourceList["+ i +"].Description"));
			dataSource.setConnectionInfo(context.stringValue("MetastoreListDataSourceResponse.DataSourceList["+ i +"].ConnectionInfo"));
			dataSource.setClusterBizId(context.stringValue("MetastoreListDataSourceResponse.DataSourceList["+ i +"].ClusterBizId"));
			dataSource.setClusterName(context.stringValue("MetastoreListDataSourceResponse.DataSourceList["+ i +"].ClusterName"));
			dataSource.setUserId(context.stringValue("MetastoreListDataSourceResponse.DataSourceList["+ i +"].UserId"));
			dataSource.setGmtCreate(context.longValue("MetastoreListDataSourceResponse.DataSourceList["+ i +"].GmtCreate"));
			dataSource.setGmtModified(context.longValue("MetastoreListDataSourceResponse.DataSourceList["+ i +"].GmtModified"));
			dataSource.setCapacity(context.longValue("MetastoreListDataSourceResponse.DataSourceList["+ i +"].Capacity"));
			dataSource.setUsedSize(context.longValue("MetastoreListDataSourceResponse.DataSourceList["+ i +"].UsedSize"));

			List<Config> configList = new ArrayList<Config>();
			for (int j = 0; j < context.lengthValue("MetastoreListDataSourceResponse.DataSourceList["+ i +"].ConfigList.Length"); j++) {
				Config config = new Config();
				config.setConfigName(context.stringValue("MetastoreListDataSourceResponse.DataSourceList["+ i +"].ConfigList["+ j +"].ConfigName"));
				config.setValue(context.stringValue("MetastoreListDataSourceResponse.DataSourceList["+ i +"].ConfigList["+ j +"].Value"));

				configList.add(config);
			}
			dataSource.setConfigList(configList);

			dataSourceList.add(dataSource);
		}
		metastoreListDataSourceResponse.setDataSourceList(dataSourceList);
	 
	 	return metastoreListDataSourceResponse;
	}
}