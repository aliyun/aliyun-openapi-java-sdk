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

package com.aliyuncs.servicemesh.transform.v20200111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.servicemesh.model.v20200111.DescribeGuestClusterAccessLogDashboardsResponse;
import com.aliyuncs.servicemesh.model.v20200111.DescribeGuestClusterAccessLogDashboardsResponse.DashboardsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeGuestClusterAccessLogDashboardsResponseUnmarshaller {

	public static DescribeGuestClusterAccessLogDashboardsResponse unmarshall(DescribeGuestClusterAccessLogDashboardsResponse describeGuestClusterAccessLogDashboardsResponse, UnmarshallerContext _ctx) {
		
		describeGuestClusterAccessLogDashboardsResponse.setRequestId(_ctx.stringValue("DescribeGuestClusterAccessLogDashboardsResponse.RequestId"));
		describeGuestClusterAccessLogDashboardsResponse.setK8sClusterId(_ctx.stringValue("DescribeGuestClusterAccessLogDashboardsResponse.K8sClusterId"));

		List<DashboardsItem> dashboards = new ArrayList<DashboardsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeGuestClusterAccessLogDashboardsResponse.Dashboards.Length"); i++) {
			DashboardsItem dashboardsItem = new DashboardsItem();
			dashboardsItem.setTitle(_ctx.stringValue("DescribeGuestClusterAccessLogDashboardsResponse.Dashboards["+ i +"].Title"));
			dashboardsItem.setUrl(_ctx.stringValue("DescribeGuestClusterAccessLogDashboardsResponse.Dashboards["+ i +"].Url"));

			dashboards.add(dashboardsItem);
		}
		describeGuestClusterAccessLogDashboardsResponse.setDashboards(dashboards);
	 
	 	return describeGuestClusterAccessLogDashboardsResponse;
	}
}