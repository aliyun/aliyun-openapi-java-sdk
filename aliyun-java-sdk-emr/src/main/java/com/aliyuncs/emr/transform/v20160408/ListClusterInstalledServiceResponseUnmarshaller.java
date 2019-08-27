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

import com.aliyuncs.emr.model.v20160408.ListClusterInstalledServiceResponse;
import com.aliyuncs.emr.model.v20160408.ListClusterInstalledServiceResponse.ClusterInstalledService;
import com.aliyuncs.emr.model.v20160408.ListClusterInstalledServiceResponse.ClusterInstalledService.ServiceAction;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListClusterInstalledServiceResponseUnmarshaller {

	public static ListClusterInstalledServiceResponse unmarshall(ListClusterInstalledServiceResponse listClusterInstalledServiceResponse, UnmarshallerContext _ctx) {
		
		listClusterInstalledServiceResponse.setRequestId(_ctx.stringValue("ListClusterInstalledServiceResponse.RequestId"));

		List<ClusterInstalledService> clusterInstalledServiceList = new ArrayList<ClusterInstalledService>();
		for (int i = 0; i < _ctx.lengthValue("ListClusterInstalledServiceResponse.ClusterInstalledServiceList.Length"); i++) {
			ClusterInstalledService clusterInstalledService = new ClusterInstalledService();
			clusterInstalledService.setServiceName(_ctx.stringValue("ListClusterInstalledServiceResponse.ClusterInstalledServiceList["+ i +"].ServiceName"));
			clusterInstalledService.setServiceDisplayName(_ctx.stringValue("ListClusterInstalledServiceResponse.ClusterInstalledServiceList["+ i +"].ServiceDisplayName"));
			clusterInstalledService.setServiceVersion(_ctx.stringValue("ListClusterInstalledServiceResponse.ClusterInstalledServiceList["+ i +"].ServiceVersion"));
			clusterInstalledService.setServiceEcmVersion(_ctx.stringValue("ListClusterInstalledServiceResponse.ClusterInstalledServiceList["+ i +"].ServiceEcmVersion"));
			clusterInstalledService.setServiceStatus(_ctx.stringValue("ListClusterInstalledServiceResponse.ClusterInstalledServiceList["+ i +"].serviceStatus"));
			clusterInstalledService.setOnlyClient(_ctx.booleanValue("ListClusterInstalledServiceResponse.ClusterInstalledServiceList["+ i +"].onlyClient"));
			clusterInstalledService.setNotStartedNum(_ctx.integerValue("ListClusterInstalledServiceResponse.ClusterInstalledServiceList["+ i +"].notStartedNum"));
			clusterInstalledService.setNeedRestartNum(_ctx.integerValue("ListClusterInstalledServiceResponse.ClusterInstalledServiceList["+ i +"].needRestartNum"));
			clusterInstalledService.setAbnormalNum(_ctx.integerValue("ListClusterInstalledServiceResponse.ClusterInstalledServiceList["+ i +"].abnormalNum"));
			clusterInstalledService.setComment(_ctx.stringValue("ListClusterInstalledServiceResponse.ClusterInstalledServiceList["+ i +"].comment"));

			List<ServiceAction> serviceActionList = new ArrayList<ServiceAction>();
			for (int j = 0; j < _ctx.lengthValue("ListClusterInstalledServiceResponse.ClusterInstalledServiceList["+ i +"].ServiceActionList.Length"); j++) {
				ServiceAction serviceAction = new ServiceAction();
				serviceAction.setServiceName(_ctx.stringValue("ListClusterInstalledServiceResponse.ClusterInstalledServiceList["+ i +"].ServiceActionList["+ j +"].ServiceName"));
				serviceAction.setComponentName(_ctx.stringValue("ListClusterInstalledServiceResponse.ClusterInstalledServiceList["+ i +"].ServiceActionList["+ j +"].ComponentName"));
				serviceAction.setActionName(_ctx.stringValue("ListClusterInstalledServiceResponse.ClusterInstalledServiceList["+ i +"].ServiceActionList["+ j +"].ActionName"));
				serviceAction.setCommand(_ctx.stringValue("ListClusterInstalledServiceResponse.ClusterInstalledServiceList["+ i +"].ServiceActionList["+ j +"].Command"));
				serviceAction.setDisplayName(_ctx.stringValue("ListClusterInstalledServiceResponse.ClusterInstalledServiceList["+ i +"].ServiceActionList["+ j +"].DisplayName"));

				serviceActionList.add(serviceAction);
			}
			clusterInstalledService.setServiceActionList(serviceActionList);

			clusterInstalledServiceList.add(clusterInstalledService);
		}
		listClusterInstalledServiceResponse.setClusterInstalledServiceList(clusterInstalledServiceList);
	 
	 	return listClusterInstalledServiceResponse;
	}
}