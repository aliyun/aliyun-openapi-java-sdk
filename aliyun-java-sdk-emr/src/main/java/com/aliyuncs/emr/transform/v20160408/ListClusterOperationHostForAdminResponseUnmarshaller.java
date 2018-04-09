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

import com.aliyuncs.emr.model.v20160408.ListClusterOperationHostForAdminResponse;
import com.aliyuncs.emr.model.v20160408.ListClusterOperationHostForAdminResponse.ClusterOperationHost;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListClusterOperationHostForAdminResponseUnmarshaller {

	public static ListClusterOperationHostForAdminResponse unmarshall(ListClusterOperationHostForAdminResponse listClusterOperationHostForAdminResponse, UnmarshallerContext context) {
		
		listClusterOperationHostForAdminResponse.setRequestId(context.stringValue("ListClusterOperationHostForAdminResponse.RequestId"));
		listClusterOperationHostForAdminResponse.setTotalCount(context.integerValue("ListClusterOperationHostForAdminResponse.TotalCount"));
		listClusterOperationHostForAdminResponse.setPageNumber(context.integerValue("ListClusterOperationHostForAdminResponse.PageNumber"));
		listClusterOperationHostForAdminResponse.setPageSize(context.integerValue("ListClusterOperationHostForAdminResponse.PageSize"));

		List<ClusterOperationHost> clusterOperationHostList = new ArrayList<ClusterOperationHost>();
		for (int i = 0; i < context.lengthValue("ListClusterOperationHostForAdminResponse.ClusterOperationHostList.Length"); i++) {
			ClusterOperationHost clusterOperationHost = new ClusterOperationHost();
			clusterOperationHost.setHostId(context.stringValue("ListClusterOperationHostForAdminResponse.ClusterOperationHostList["+ i +"].HostId"));
			clusterOperationHost.setHostName(context.stringValue("ListClusterOperationHostForAdminResponse.ClusterOperationHostList["+ i +"].HostName"));
			clusterOperationHost.setStatus(context.stringValue("ListClusterOperationHostForAdminResponse.ClusterOperationHostList["+ i +"].Status"));
			clusterOperationHost.setPercentage(context.stringValue("ListClusterOperationHostForAdminResponse.ClusterOperationHostList["+ i +"].Percentage"));

			clusterOperationHostList.add(clusterOperationHost);
		}
		listClusterOperationHostForAdminResponse.setClusterOperationHostList(clusterOperationHostList);
	 
	 	return listClusterOperationHostForAdminResponse;
	}
}