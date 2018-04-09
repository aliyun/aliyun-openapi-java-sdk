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

import com.aliyuncs.emr.model.v20160408.ListClusterServiceStatusOverviewResponse;
import com.aliyuncs.emr.model.v20160408.ListClusterServiceStatusOverviewResponse.ClusterServiceStatusOverview;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListClusterServiceStatusOverviewResponseUnmarshaller {

	public static ListClusterServiceStatusOverviewResponse unmarshall(ListClusterServiceStatusOverviewResponse listClusterServiceStatusOverviewResponse, UnmarshallerContext context) {
		
		listClusterServiceStatusOverviewResponse.setRequestId(context.stringValue("ListClusterServiceStatusOverviewResponse.RequestId"));

		List<ClusterServiceStatusOverview> clusterServiceStatusList = new ArrayList<ClusterServiceStatusOverview>();
		for (int i = 0; i < context.lengthValue("ListClusterServiceStatusOverviewResponse.ClusterServiceStatusList.Length"); i++) {
			ClusterServiceStatusOverview clusterServiceStatusOverview = new ClusterServiceStatusOverview();
			clusterServiceStatusOverview.setClusterId(context.stringValue("ListClusterServiceStatusOverviewResponse.ClusterServiceStatusList["+ i +"].ClusterId"));
			clusterServiceStatusOverview.setServiceName(context.stringValue("ListClusterServiceStatusOverviewResponse.ClusterServiceStatusList["+ i +"].ServiceName"));
			clusterServiceStatusOverview.setStatus(context.stringValue("ListClusterServiceStatusOverviewResponse.ClusterServiceStatusList["+ i +"].Status"));

			clusterServiceStatusList.add(clusterServiceStatusOverview);
		}
		listClusterServiceStatusOverviewResponse.setClusterServiceStatusList(clusterServiceStatusList);
	 
	 	return listClusterServiceStatusOverviewResponse;
	}
}