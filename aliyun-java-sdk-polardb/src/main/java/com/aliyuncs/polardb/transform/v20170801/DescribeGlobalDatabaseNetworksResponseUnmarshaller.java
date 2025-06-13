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

package com.aliyuncs.polardb.transform.v20170801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.polardb.model.v20170801.DescribeGlobalDatabaseNetworksResponse;
import com.aliyuncs.polardb.model.v20170801.DescribeGlobalDatabaseNetworksResponse.GlobalDatabaseNetwork;
import com.aliyuncs.polardb.model.v20170801.DescribeGlobalDatabaseNetworksResponse.GlobalDatabaseNetwork.DBCluster;
import com.aliyuncs.polardb.model.v20170801.DescribeGlobalDatabaseNetworksResponse.GlobalDatabaseNetwork.Labels;
import com.aliyuncs.polardb.model.v20170801.DescribeGlobalDatabaseNetworksResponse.GlobalDatabaseNetwork.OutCloudDBCluster;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeGlobalDatabaseNetworksResponseUnmarshaller {

	public static DescribeGlobalDatabaseNetworksResponse unmarshall(DescribeGlobalDatabaseNetworksResponse describeGlobalDatabaseNetworksResponse, UnmarshallerContext _ctx) {
		
		describeGlobalDatabaseNetworksResponse.setRequestId(_ctx.stringValue("DescribeGlobalDatabaseNetworksResponse.RequestId"));
		describeGlobalDatabaseNetworksResponse.setTotalRecordCount(_ctx.integerValue("DescribeGlobalDatabaseNetworksResponse.TotalRecordCount"));
		describeGlobalDatabaseNetworksResponse.setPageRecordCount(_ctx.integerValue("DescribeGlobalDatabaseNetworksResponse.PageRecordCount"));
		describeGlobalDatabaseNetworksResponse.setPageNumber(_ctx.integerValue("DescribeGlobalDatabaseNetworksResponse.PageNumber"));

		List<GlobalDatabaseNetwork> items = new ArrayList<GlobalDatabaseNetwork>();
		for (int i = 0; i < _ctx.lengthValue("DescribeGlobalDatabaseNetworksResponse.Items.Length"); i++) {
			GlobalDatabaseNetwork globalDatabaseNetwork = new GlobalDatabaseNetwork();
			globalDatabaseNetwork.setDBVersion(_ctx.stringValue("DescribeGlobalDatabaseNetworksResponse.Items["+ i +"].DBVersion"));
			globalDatabaseNetwork.setGDNId(_ctx.stringValue("DescribeGlobalDatabaseNetworksResponse.Items["+ i +"].GDNId"));
			globalDatabaseNetwork.setCreateTime(_ctx.stringValue("DescribeGlobalDatabaseNetworksResponse.Items["+ i +"].CreateTime"));
			globalDatabaseNetwork.setGDNStatus(_ctx.stringValue("DescribeGlobalDatabaseNetworksResponse.Items["+ i +"].GDNStatus"));
			globalDatabaseNetwork.setDBType(_ctx.stringValue("DescribeGlobalDatabaseNetworksResponse.Items["+ i +"].DBType"));
			globalDatabaseNetwork.setGDNDescription(_ctx.stringValue("DescribeGlobalDatabaseNetworksResponse.Items["+ i +"].GDNDescription"));
			globalDatabaseNetwork.setZoneId(_ctx.stringValue("DescribeGlobalDatabaseNetworksResponse.Items["+ i +"].ZoneId"));

			Labels labels = new Labels();
			labels.setGDNVersion(_ctx.stringValue("DescribeGlobalDatabaseNetworksResponse.Items["+ i +"].Labels.GDNVersion"));
			globalDatabaseNetwork.setLabels(labels);

			List<DBCluster> dBClusters = new ArrayList<DBCluster>();
			for (int j = 0; j < _ctx.lengthValue("DescribeGlobalDatabaseNetworksResponse.Items["+ i +"].DBClusters.Length"); j++) {
				DBCluster dBCluster = new DBCluster();
				dBCluster.setDBClusterId(_ctx.stringValue("DescribeGlobalDatabaseNetworksResponse.Items["+ i +"].DBClusters["+ j +"].DBClusterId"));
				dBCluster.setRole(_ctx.stringValue("DescribeGlobalDatabaseNetworksResponse.Items["+ i +"].DBClusters["+ j +"].Role"));
				dBCluster.setRegionId(_ctx.stringValue("DescribeGlobalDatabaseNetworksResponse.Items["+ i +"].DBClusters["+ j +"].RegionId"));

				dBClusters.add(dBCluster);
			}
			globalDatabaseNetwork.setDBClusters(dBClusters);

			List<OutCloudDBCluster> outCloudDBClusters = new ArrayList<OutCloudDBCluster>();
			for (int j = 0; j < _ctx.lengthValue("DescribeGlobalDatabaseNetworksResponse.Items["+ i +"].OutCloudDBClusters.Length"); j++) {
				OutCloudDBCluster outCloudDBCluster = new OutCloudDBCluster();
				outCloudDBCluster.setOutCloudType(_ctx.stringValue("DescribeGlobalDatabaseNetworksResponse.Items["+ i +"].OutCloudDBClusters["+ j +"].OutCloudType"));
				outCloudDBCluster.setDBClusterId(_ctx.stringValue("DescribeGlobalDatabaseNetworksResponse.Items["+ i +"].OutCloudDBClusters["+ j +"].DBClusterId"));
				outCloudDBCluster.setRole(_ctx.stringValue("DescribeGlobalDatabaseNetworksResponse.Items["+ i +"].OutCloudDBClusters["+ j +"].Role"));
				outCloudDBCluster.setRegionId(_ctx.stringValue("DescribeGlobalDatabaseNetworksResponse.Items["+ i +"].OutCloudDBClusters["+ j +"].RegionId"));

				outCloudDBClusters.add(outCloudDBCluster);
			}
			globalDatabaseNetwork.setOutCloudDBClusters(outCloudDBClusters);

			items.add(globalDatabaseNetwork);
		}
		describeGlobalDatabaseNetworksResponse.setItems(items);
	 
	 	return describeGlobalDatabaseNetworksResponse;
	}
}