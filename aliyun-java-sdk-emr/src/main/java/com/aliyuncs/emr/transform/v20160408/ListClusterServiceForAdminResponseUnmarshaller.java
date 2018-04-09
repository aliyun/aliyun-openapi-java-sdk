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

import com.aliyuncs.emr.model.v20160408.ListClusterServiceForAdminResponse;
import com.aliyuncs.emr.model.v20160408.ListClusterServiceForAdminResponse.ClusterService;
import com.aliyuncs.emr.model.v20160408.ListClusterServiceForAdminResponse.ClusterService.ServiceAction;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListClusterServiceForAdminResponseUnmarshaller {

	public static ListClusterServiceForAdminResponse unmarshall(ListClusterServiceForAdminResponse listClusterServiceForAdminResponse, UnmarshallerContext context) {
		
		listClusterServiceForAdminResponse.setRequestId(context.stringValue("ListClusterServiceForAdminResponse.RequestId"));
		listClusterServiceForAdminResponse.setTotalCount(context.integerValue("ListClusterServiceForAdminResponse.TotalCount"));
		listClusterServiceForAdminResponse.setPageNumber(context.integerValue("ListClusterServiceForAdminResponse.PageNumber"));
		listClusterServiceForAdminResponse.setPageSize(context.integerValue("ListClusterServiceForAdminResponse.PageSize"));

		List<ClusterService> clusterServiceList = new ArrayList<ClusterService>();
		for (int i = 0; i < context.lengthValue("ListClusterServiceForAdminResponse.ClusterServiceList.Length"); i++) {
			ClusterService clusterService = new ClusterService();
			clusterService.setServiceName(context.stringValue("ListClusterServiceForAdminResponse.ClusterServiceList["+ i +"].ServiceName"));
			clusterService.setServiceDisplayName(context.stringValue("ListClusterServiceForAdminResponse.ClusterServiceList["+ i +"].ServiceDisplayName"));
			clusterService.setServiceVersion(context.stringValue("ListClusterServiceForAdminResponse.ClusterServiceList["+ i +"].ServiceVersion"));
			clusterService.setInstallStatus(context.booleanValue("ListClusterServiceForAdminResponse.ClusterServiceList["+ i +"].InstallStatus"));
			clusterService.setClientType(context.booleanValue("ListClusterServiceForAdminResponse.ClusterServiceList["+ i +"].ClientType"));
			clusterService.setServiceStatus(context.stringValue("ListClusterServiceForAdminResponse.ClusterServiceList["+ i +"].ServiceStatus"));
			clusterService.setHealthStatus(context.stringValue("ListClusterServiceForAdminResponse.ClusterServiceList["+ i +"].HealthStatus"));
			clusterService.setNeedRestartInfo(context.stringValue("ListClusterServiceForAdminResponse.ClusterServiceList["+ i +"].NeedRestartInfo"));
			clusterService.setNotStartInfo(context.stringValue("ListClusterServiceForAdminResponse.ClusterServiceList["+ i +"].NotStartInfo"));
			clusterService.setAbnormalNum(context.integerValue("ListClusterServiceForAdminResponse.ClusterServiceList["+ i +"].AbnormalNum"));
			clusterService.setStoppedNum(context.integerValue("ListClusterServiceForAdminResponse.ClusterServiceList["+ i +"].StoppedNum"));
			clusterService.setNeedRestartNum(context.integerValue("ListClusterServiceForAdminResponse.ClusterServiceList["+ i +"].NeedRestartNum"));

			List<ServiceAction> serviceActionList = new ArrayList<ServiceAction>();
			for (int j = 0; j < context.lengthValue("ListClusterServiceForAdminResponse.ClusterServiceList["+ i +"].ServiceActionList.Length"); j++) {
				ServiceAction serviceAction = new ServiceAction();
				serviceAction.setServiceName(context.stringValue("ListClusterServiceForAdminResponse.ClusterServiceList["+ i +"].ServiceActionList["+ j +"].ServiceName"));
				serviceAction.setComponentName(context.stringValue("ListClusterServiceForAdminResponse.ClusterServiceList["+ i +"].ServiceActionList["+ j +"].ComponentName"));
				serviceAction.setActionName(context.stringValue("ListClusterServiceForAdminResponse.ClusterServiceList["+ i +"].ServiceActionList["+ j +"].ActionName"));
				serviceAction.setCommand(context.stringValue("ListClusterServiceForAdminResponse.ClusterServiceList["+ i +"].ServiceActionList["+ j +"].Command"));
				serviceAction.setDisplayName(context.stringValue("ListClusterServiceForAdminResponse.ClusterServiceList["+ i +"].ServiceActionList["+ j +"].DisplayName"));

				serviceActionList.add(serviceAction);
			}
			clusterService.setServiceActionList(serviceActionList);

			clusterServiceList.add(clusterService);
		}
		listClusterServiceForAdminResponse.setClusterServiceList(clusterServiceList);
	 
	 	return listClusterServiceForAdminResponse;
	}
}