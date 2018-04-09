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

import com.aliyuncs.emr.model.v20160408.ListClusterServiceStatusResponse;
import com.aliyuncs.emr.model.v20160408.ListClusterServiceStatusResponse.ClusterServiceStatus;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListClusterServiceStatusResponseUnmarshaller {

	public static ListClusterServiceStatusResponse unmarshall(ListClusterServiceStatusResponse listClusterServiceStatusResponse, UnmarshallerContext context) {
		
		listClusterServiceStatusResponse.setRequestId(context.stringValue("ListClusterServiceStatusResponse.RequestId"));

		List<ClusterServiceStatus> clusterServiceStatusList = new ArrayList<ClusterServiceStatus>();
		for (int i = 0; i < context.lengthValue("ListClusterServiceStatusResponse.ClusterServiceStatusList.Length"); i++) {
			ClusterServiceStatus clusterServiceStatus = new ClusterServiceStatus();
			clusterServiceStatus.setNodeIp(context.stringValue("ListClusterServiceStatusResponse.ClusterServiceStatusList["+ i +"].NodeIp"));
			clusterServiceStatus.setStatus(context.stringValue("ListClusterServiceStatusResponse.ClusterServiceStatusList["+ i +"].Status"));

			clusterServiceStatusList.add(clusterServiceStatus);
		}
		listClusterServiceStatusResponse.setClusterServiceStatusList(clusterServiceStatusList);
	 
	 	return listClusterServiceStatusResponse;
	}
}