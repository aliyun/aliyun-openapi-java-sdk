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

import com.aliyuncs.emr.model.v20160408.ListClusterOperationHostResponse;
import com.aliyuncs.emr.model.v20160408.ListClusterOperationHostResponse.ClusterOperationHost;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListClusterOperationHostResponseUnmarshaller {

	public static ListClusterOperationHostResponse unmarshall(ListClusterOperationHostResponse listClusterOperationHostResponse, UnmarshallerContext _ctx) {
		
		listClusterOperationHostResponse.setRequestId(_ctx.stringValue("ListClusterOperationHostResponse.RequestId"));
		listClusterOperationHostResponse.setTotalCount(_ctx.integerValue("ListClusterOperationHostResponse.TotalCount"));
		listClusterOperationHostResponse.setPageNumber(_ctx.integerValue("ListClusterOperationHostResponse.PageNumber"));
		listClusterOperationHostResponse.setPageSize(_ctx.integerValue("ListClusterOperationHostResponse.PageSize"));

		List<ClusterOperationHost> clusterOperationHostList = new ArrayList<ClusterOperationHost>();
		for (int i = 0; i < _ctx.lengthValue("ListClusterOperationHostResponse.ClusterOperationHostList.Length"); i++) {
			ClusterOperationHost clusterOperationHost = new ClusterOperationHost();
			clusterOperationHost.setHostId(_ctx.stringValue("ListClusterOperationHostResponse.ClusterOperationHostList["+ i +"].HostId"));
			clusterOperationHost.setHostName(_ctx.stringValue("ListClusterOperationHostResponse.ClusterOperationHostList["+ i +"].HostName"));
			clusterOperationHost.setStatus(_ctx.stringValue("ListClusterOperationHostResponse.ClusterOperationHostList["+ i +"].Status"));
			clusterOperationHost.setPercentage(_ctx.stringValue("ListClusterOperationHostResponse.ClusterOperationHostList["+ i +"].Percentage"));

			clusterOperationHostList.add(clusterOperationHost);
		}
		listClusterOperationHostResponse.setClusterOperationHostList(clusterOperationHostList);
	 
	 	return listClusterOperationHostResponse;
	}
}