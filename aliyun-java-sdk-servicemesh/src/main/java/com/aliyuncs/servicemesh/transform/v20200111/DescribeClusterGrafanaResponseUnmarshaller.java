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

import com.aliyuncs.servicemesh.model.v20200111.DescribeClusterGrafanaResponse;
import com.aliyuncs.servicemesh.model.v20200111.DescribeClusterGrafanaResponse.Dashboard;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeClusterGrafanaResponseUnmarshaller {

	public static DescribeClusterGrafanaResponse unmarshall(DescribeClusterGrafanaResponse describeClusterGrafanaResponse, UnmarshallerContext _ctx) {
		
		describeClusterGrafanaResponse.setRequestId(_ctx.stringValue("DescribeClusterGrafanaResponse.RequestId"));

		List<Dashboard> dashboards = new ArrayList<Dashboard>();
		for (int i = 0; i < _ctx.lengthValue("DescribeClusterGrafanaResponse.Dashboards.Length"); i++) {
			Dashboard dashboard = new Dashboard();
			dashboard.setUrl(_ctx.stringValue("DescribeClusterGrafanaResponse.Dashboards["+ i +"].Url"));
			dashboard.setTitle(_ctx.stringValue("DescribeClusterGrafanaResponse.Dashboards["+ i +"].Title"));

			dashboards.add(dashboard);
		}
		describeClusterGrafanaResponse.setDashboards(dashboards);
	 
	 	return describeClusterGrafanaResponse;
	}
}