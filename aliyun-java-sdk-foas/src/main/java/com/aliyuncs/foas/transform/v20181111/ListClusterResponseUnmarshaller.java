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

	public static ListClusterResponse unmarshall(ListClusterResponse listClusterResponse, UnmarshallerContext _ctx) {
		
		listClusterResponse.setRequestId(_ctx.stringValue("ListClusterResponse.RequestId"));
		listClusterResponse.setTotalCount(_ctx.longValue("ListClusterResponse.TotalCount"));
		listClusterResponse.setTotalPage(_ctx.integerValue("ListClusterResponse.TotalPage"));
		listClusterResponse.setPageIndex(_ctx.integerValue("ListClusterResponse.PageIndex"));
		listClusterResponse.setPageSize(_ctx.integerValue("ListClusterResponse.PageSize"));

		List<Cluster> clusters = new ArrayList<Cluster>();
		for (int i = 0; i < _ctx.lengthValue("ListClusterResponse.Clusters.Length"); i++) {
			Cluster cluster = new Cluster();
			cluster.setClusterId(_ctx.stringValue("ListClusterResponse.Clusters["+ i +"].ClusterId"));
			cluster.setRegionId(_ctx.stringValue("ListClusterResponse.Clusters["+ i +"].RegionId"));
			cluster.setZoneId(_ctx.stringValue("ListClusterResponse.Clusters["+ i +"].ZoneId"));
			cluster.setState(_ctx.stringValue("ListClusterResponse.Clusters["+ i +"].State"));
			cluster.setOwnerId(_ctx.stringValue("ListClusterResponse.Clusters["+ i +"].OwnerId"));
			cluster.setOperator(_ctx.stringValue("ListClusterResponse.Clusters["+ i +"].Operator"));
			cluster.setDisplayName(_ctx.stringValue("ListClusterResponse.Clusters["+ i +"].DisplayName"));
			cluster.setDescription(_ctx.stringValue("ListClusterResponse.Clusters["+ i +"].Description"));
			cluster.setGmtCreate(_ctx.longValue("ListClusterResponse.Clusters["+ i +"].GmtCreate"));
			cluster.setGmtModified(_ctx.longValue("ListClusterResponse.Clusters["+ i +"].GmtModified"));

			clusters.add(cluster);
		}
		listClusterResponse.setClusters(clusters);
	 
	 	return listClusterResponse;
	}
}