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

package com.aliyuncs.foas.transform.v20181111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.foas.model.v20181111.ListClusterResponse;
import com.aliyuncs.foas.model.v20181111.ListClusterResponse.Cluster;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListClusterResponseUnmarshaller {

	public static ListClusterResponse unmarshall(ListClusterResponse listClusterResponse, UnmarshallerContext context) {
		
		listClusterResponse.setRequestId(context.stringValue("ListClusterResponse.RequestId"));
		listClusterResponse.setTotalCount(context.longValue("ListClusterResponse.TotalCount"));
		listClusterResponse.setTotalPage(context.integerValue("ListClusterResponse.TotalPage"));
		listClusterResponse.setPageIndex(context.integerValue("ListClusterResponse.PageIndex"));
		listClusterResponse.setPageSize(context.integerValue("ListClusterResponse.PageSize"));

		List<Cluster> clusters = new ArrayList<Cluster>();
		for (int i = 0; i < context.lengthValue("ListClusterResponse.Clusters.Length"); i++) {
			Cluster cluster = new Cluster();
			cluster.setClusterId(context.stringValue("ListClusterResponse.Clusters["+ i +"].ClusterId"));
			cluster.setRegionId(context.stringValue("ListClusterResponse.Clusters["+ i +"].RegionId"));
			cluster.setZoneId(context.stringValue("ListClusterResponse.Clusters["+ i +"].ZoneId"));
			cluster.setState(context.stringValue("ListClusterResponse.Clusters["+ i +"].State"));
			cluster.setOwnerId(context.stringValue("ListClusterResponse.Clusters["+ i +"].OwnerId"));
			cluster.setOperator(context.stringValue("ListClusterResponse.Clusters["+ i +"].Operator"));
			cluster.setDisplayName(context.stringValue("ListClusterResponse.Clusters["+ i +"].DisplayName"));
			cluster.setDescription(context.stringValue("ListClusterResponse.Clusters["+ i +"].Description"));
			cluster.setGmtCreate(context.longValue("ListClusterResponse.Clusters["+ i +"].GmtCreate"));
			cluster.setGmtModified(context.longValue("ListClusterResponse.Clusters["+ i +"].GmtModified"));

			clusters.add(cluster);
		}
		listClusterResponse.setClusters(clusters);
	 
	 	return listClusterResponse;
	}
}