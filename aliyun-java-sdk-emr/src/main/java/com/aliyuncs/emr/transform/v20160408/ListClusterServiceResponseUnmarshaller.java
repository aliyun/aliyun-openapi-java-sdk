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

import com.aliyuncs.emr.model.v20160408.ListClusterServiceResponse;
import com.aliyuncs.emr.model.v20160408.ListClusterServiceResponse.ClusterService;
import com.aliyuncs.emr.model.v20160408.ListClusterServiceResponse.ClusterService.ServiceAction;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListClusterServiceResponseUnmarshaller {

	public static ListClusterServiceResponse unmarshall(ListClusterServiceResponse listClusterServiceResponse, UnmarshallerContext context) {
		
		listClusterServiceResponse.setRequestId(context.stringValue("ListClusterServiceResponse.RequestId"));
		listClusterServiceResponse.setTotalCount(context.integerValue("ListClusterServiceResponse.TotalCount"));
		listClusterServiceResponse.setPageNumber(context.integerValue("ListClusterServiceResponse.PageNumber"));
		listClusterServiceResponse.setPageSize(context.integerValue("ListClusterServiceResponse.PageSize"));

		List<ClusterService> clusterServiceList = new ArrayList<ClusterService>();
		for (int i = 0; i < context.lengthValue("ListClusterServiceResponse.ClusterServiceList.Length"); i++) {
			ClusterService clusterService = new ClusterService();
			clusterService.setServiceName(context.stringValue("ListClusterServiceResponse.ClusterServiceList["+ i +"].ServiceName"));
			clusterService.setServiceDisplayName(context.stringValue("ListClusterServiceResponse.ClusterServiceList["+ i +"].ServiceDisplayName"));
			clusterService.setServiceVersion(context.stringValue("ListClusterServiceResponse.ClusterServiceList["+ i +"].ServiceVersion"));
			clusterService.setInstallStatus(context.booleanValue("ListClusterServiceResponse.ClusterServiceList["+ i +"].InstallStatus"));
			clusterService.setClientType(context.booleanValue("ListClusterServiceResponse.ClusterServiceList["+ i +"].ClientType"));
			clusterService.setServiceStatus(context.stringValue("ListClusterServiceResponse.ClusterServiceList["+ i +"].ServiceStatus"));
			clusterService.setHealthStatus(context.stringValue("ListClusterServiceResponse.ClusterServiceList["+ i +"].HealthStatus"));
			clusterService.setNeedRestartInfo(context.stringValue("ListClusterServiceResponse.ClusterServiceList["+ i +"].NeedRestartInfo"));
			clusterService.setNotStartInfo(context.stringValue("ListClusterServiceResponse.ClusterServiceList["+ i +"].NotStartInfo"));
			clusterService.setAbnormalNum(context.integerValue("ListClusterServiceResponse.ClusterServiceList["+ i +"].AbnormalNum"));
			clusterService.setStoppedNum(context.integerValue("ListClusterServiceResponse.ClusterServiceList["+ i +"].StoppedNum"));
			clusterService.setNeedRestartNum(context.integerValue("ListClusterServiceResponse.ClusterServiceList["+ i +"].NeedRestartNum"));

			List<ServiceAction> serviceActionList = new ArrayList<ServiceAction>();
			for (int j = 0; j < context.lengthValue("ListClusterServiceResponse.ClusterServiceList["+ i +"].ServiceActionList.Length"); j++) {
				ServiceAction serviceAction = new ServiceAction();
				serviceAction.setServiceName(context.stringValue("ListClusterServiceResponse.ClusterServiceList["+ i +"].ServiceActionList["+ j +"].ServiceName"));
				serviceAction.setComponentName(context.stringValue("ListClusterServiceResponse.ClusterServiceList["+ i +"].ServiceActionList["+ j +"].ComponentName"));
				serviceAction.setActionName(context.stringValue("ListClusterServiceResponse.ClusterServiceList["+ i +"].ServiceActionList["+ j +"].ActionName"));
				serviceAction.setCommand(context.stringValue("ListClusterServiceResponse.ClusterServiceList["+ i +"].ServiceActionList["+ j +"].Command"));
				serviceAction.setDisplayName(context.stringValue("ListClusterServiceResponse.ClusterServiceList["+ i +"].ServiceActionList["+ j +"].DisplayName"));

				serviceActionList.add(serviceAction);
			}
			clusterService.setServiceActionList(serviceActionList);

			clusterServiceList.add(clusterService);
		}
		listClusterServiceResponse.setClusterServiceList(clusterServiceList);
	 
	 	return listClusterServiceResponse;
	}
}