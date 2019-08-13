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
import com.aliyuncs.transform.UnmarshallerContext;


public class MetastoreListDataSourceResponseUnmarshaller {

	public static MetastoreListDataSourceResponse unmarshall(MetastoreListDataSourceResponse metastoreListDataSourceResponse, UnmarshallerContext _ctx) {
		
		metastoreListDataSourceResponse.setRequestId(_ctx.stringValue("MetastoreListDataSourceResponse.RequestId"));
		metastoreListDataSourceResponse.setTotalCount(_ctx.integerValue("MetastoreListDataSourceResponse.TotalCount"));
		metastoreListDataSourceResponse.setPageNumber(_ctx.integerValue("MetastoreListDataSourceResponse.PageNumber"));
		metastoreListDataSourceResponse.setPageSize(_ctx.integerValue("MetastoreListDataSourceResponse.PageSize"));

		List<DataSource> dataSourceList = new ArrayList<DataSource>();
		for (int i = 0; i < _ctx.lengthValue("MetastoreListDataSourceResponse.DataSourceList.Length"); i++) {
			DataSource dataSource = new DataSource();
			dataSource.setId(_ctx.stringValue("MetastoreListDataSourceResponse.DataSourceList["+ i +"].Id"));
			dataSource.setName(_ctx.stringValue("MetastoreListDataSourceResponse.DataSourceList["+ i +"].Name"));
			dataSource.setSourceType(_ctx.stringValue("MetastoreListDataSourceResponse.DataSourceList["+ i +"].SourceType"));
			dataSource.setDescription(_ctx.stringValue("MetastoreListDataSourceResponse.DataSourceList["+ i +"].Description"));
			dataSource.setConnectionInfo(_ctx.stringValue("MetastoreListDataSourceResponse.DataSourceList["+ i +"].ConnectionInfo"));
			dataSource.setClusterBizId(_ctx.stringValue("MetastoreListDataSourceResponse.DataSourceList["+ i +"].ClusterBizId"));
			dataSource.setClusterName(_ctx.stringValue("MetastoreListDataSourceResponse.DataSourceList["+ i +"].ClusterName"));
			dataSource.setUserId(_ctx.stringValue("MetastoreListDataSourceResponse.DataSourceList["+ i +"].UserId"));
			dataSource.setGmtCreate(_ctx.longValue("MetastoreListDataSourceResponse.DataSourceList["+ i +"].GmtCreate"));
			dataSource.setGmtModified(_ctx.longValue("MetastoreListDataSourceResponse.DataSourceList["+ i +"].GmtModified"));
			dataSource.setCapacity(_ctx.longValue("MetastoreListDataSourceResponse.DataSourceList["+ i +"].Capacity"));
			dataSource.setUsedSize(_ctx.longValue("MetastoreListDataSourceResponse.DataSourceList["+ i +"].UsedSize"));

			List<Config> configList = new ArrayList<Config>();
			for (int j = 0; j < _ctx.lengthValue("MetastoreListDataSourceResponse.DataSourceList["+ i +"].ConfigList.Length"); j++) {
				Config config = new Config();
				config.setConfigName(_ctx.stringValue("MetastoreListDataSourceResponse.DataSourceList["+ i +"].ConfigList["+ j +"].ConfigName"));
				config.setValue(_ctx.stringValue("MetastoreListDataSourceResponse.DataSourceList["+ i +"].ConfigList["+ j +"].Value"));

				configList.add(config);
			}
			dataSource.setConfigList(configList);

			dataSourceList.add(dataSource);
		}
		metastoreListDataSourceResponse.setDataSourceList(dataSourceList);
	 
	 	return metastoreListDataSourceResponse;
	}
}