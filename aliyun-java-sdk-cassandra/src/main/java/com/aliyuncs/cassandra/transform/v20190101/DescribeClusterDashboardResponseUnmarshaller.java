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

package com.aliyuncs.cassandra.transform.v20190101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cassandra.model.v20190101.DescribeClusterDashboardResponse;
import com.aliyuncs.cassandra.model.v20190101.DescribeClusterDashboardResponse.Dashboard;
import com.aliyuncs.cassandra.model.v20190101.DescribeClusterDashboardResponse.Dashboard.DataCenter;
import com.aliyuncs.cassandra.model.v20190101.DescribeClusterDashboardResponse.Dashboard.DataCenter.Node;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeClusterDashboardResponseUnmarshaller {

	public static DescribeClusterDashboardResponse unmarshall(DescribeClusterDashboardResponse describeClusterDashboardResponse, UnmarshallerContext _ctx) {
		
		describeClusterDashboardResponse.setRequestId(_ctx.stringValue("DescribeClusterDashboardResponse.RequestId"));

		Dashboard dashboard = new Dashboard();
		dashboard.setClusterId(_ctx.stringValue("DescribeClusterDashboardResponse.Dashboard.ClusterId"));

		List<DataCenter> dataCenters = new ArrayList<DataCenter>();
		for (int i = 0; i < _ctx.lengthValue("DescribeClusterDashboardResponse.Dashboard.DataCenters.Length"); i++) {
			DataCenter dataCenter = new DataCenter();
			dataCenter.setDataCenterId(_ctx.stringValue("DescribeClusterDashboardResponse.Dashboard.DataCenters["+ i +"].DataCenterId"));

			List<Node> nodes = new ArrayList<Node>();
			for (int j = 0; j < _ctx.lengthValue("DescribeClusterDashboardResponse.Dashboard.DataCenters["+ i +"].Nodes.Length"); j++) {
				Node node = new Node();
				node.setAddress(_ctx.stringValue("DescribeClusterDashboardResponse.Dashboard.DataCenters["+ i +"].Nodes["+ j +"].Address"));
				node.setStatus(_ctx.stringValue("DescribeClusterDashboardResponse.Dashboard.DataCenters["+ i +"].Nodes["+ j +"].Status"));
				node.setLoad(_ctx.stringValue("DescribeClusterDashboardResponse.Dashboard.DataCenters["+ i +"].Nodes["+ j +"].Load"));

				nodes.add(node);
			}
			dataCenter.setNodes(nodes);

			dataCenters.add(dataCenter);
		}
		dashboard.setDataCenters(dataCenters);
		describeClusterDashboardResponse.setDashboard(dashboard);
	 
	 	return describeClusterDashboardResponse;
	}
}