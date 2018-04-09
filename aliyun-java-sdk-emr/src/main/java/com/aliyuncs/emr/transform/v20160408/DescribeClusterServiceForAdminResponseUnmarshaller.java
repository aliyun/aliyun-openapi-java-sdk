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

import com.aliyuncs.emr.model.v20160408.DescribeClusterServiceForAdminResponse;
import com.aliyuncs.emr.model.v20160408.DescribeClusterServiceForAdminResponse.ServiceInfo;
import com.aliyuncs.emr.model.v20160408.DescribeClusterServiceForAdminResponse.ServiceInfo.ClusterServiceSummary;
import com.aliyuncs.emr.model.v20160408.DescribeClusterServiceForAdminResponse.ServiceInfo.ServiceAction;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeClusterServiceForAdminResponseUnmarshaller {

	public static DescribeClusterServiceForAdminResponse unmarshall(DescribeClusterServiceForAdminResponse describeClusterServiceForAdminResponse, UnmarshallerContext context) {
		
		describeClusterServiceForAdminResponse.setRequestId(context.stringValue("DescribeClusterServiceForAdminResponse.RequestId"));

		ServiceInfo serviceInfo = new ServiceInfo();
		serviceInfo.setServiceName(context.stringValue("DescribeClusterServiceForAdminResponse.ServiceInfo.ServiceName"));
		serviceInfo.setServiceVersion(context.stringValue("DescribeClusterServiceForAdminResponse.ServiceInfo.ServiceVersion"));
		serviceInfo.setServiceStatus(context.stringValue("DescribeClusterServiceForAdminResponse.ServiceInfo.ServiceStatus"));
		serviceInfo.setNeedRestartInfo(context.stringValue("DescribeClusterServiceForAdminResponse.ServiceInfo.NeedRestartInfo"));
		serviceInfo.setNeedRestartNum(context.integerValue("DescribeClusterServiceForAdminResponse.ServiceInfo.NeedRestartNum"));

		List<String> needRestartHostIdList = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeClusterServiceForAdminResponse.ServiceInfo.NeedRestartHostIdList.Length"); i++) {
			needRestartHostIdList.add(context.stringValue("DescribeClusterServiceForAdminResponse.ServiceInfo.NeedRestartHostIdList["+ i +"]"));
		}
		serviceInfo.setNeedRestartHostIdList(needRestartHostIdList);

		List<String> needRestartComponentNameList = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeClusterServiceForAdminResponse.ServiceInfo.NeedRestartComponentNameList.Length"); i++) {
			needRestartComponentNameList.add(context.stringValue("DescribeClusterServiceForAdminResponse.ServiceInfo.NeedRestartComponentNameList["+ i +"]"));
		}
		serviceInfo.setNeedRestartComponentNameList(needRestartComponentNameList);

		List<ServiceAction> serviceActionList = new ArrayList<ServiceAction>();
		for (int i = 0; i < context.lengthValue("DescribeClusterServiceForAdminResponse.ServiceInfo.ServiceActionList.Length"); i++) {
			ServiceAction serviceAction = new ServiceAction();
			serviceAction.setServiceName(context.stringValue("DescribeClusterServiceForAdminResponse.ServiceInfo.ServiceActionList["+ i +"].ServiceName"));
			serviceAction.setComponentName(context.stringValue("DescribeClusterServiceForAdminResponse.ServiceInfo.ServiceActionList["+ i +"].ComponentName"));
			serviceAction.setActionName(context.stringValue("DescribeClusterServiceForAdminResponse.ServiceInfo.ServiceActionList["+ i +"].ActionName"));
			serviceAction.setCommand(context.stringValue("DescribeClusterServiceForAdminResponse.ServiceInfo.ServiceActionList["+ i +"].Command"));
			serviceAction.setDisplayName(context.stringValue("DescribeClusterServiceForAdminResponse.ServiceInfo.ServiceActionList["+ i +"].DisplayName"));

			serviceActionList.add(serviceAction);
		}
		serviceInfo.setServiceActionList(serviceActionList);

		List<ClusterServiceSummary> clusterServiceSummaryList = new ArrayList<ClusterServiceSummary>();
		for (int i = 0; i < context.lengthValue("DescribeClusterServiceForAdminResponse.ServiceInfo.ClusterServiceSummaryList.Length"); i++) {
			ClusterServiceSummary clusterServiceSummary = new ClusterServiceSummary();
			clusterServiceSummary.setKey(context.stringValue("DescribeClusterServiceForAdminResponse.ServiceInfo.ClusterServiceSummaryList["+ i +"].Key"));
			clusterServiceSummary.setDisplayName(context.stringValue("DescribeClusterServiceForAdminResponse.ServiceInfo.ClusterServiceSummaryList["+ i +"].DisplayName"));
			clusterServiceSummary.setValue(context.stringValue("DescribeClusterServiceForAdminResponse.ServiceInfo.ClusterServiceSummaryList["+ i +"].Value"));
			clusterServiceSummary.setStatus(context.stringValue("DescribeClusterServiceForAdminResponse.ServiceInfo.ClusterServiceSummaryList["+ i +"].Status"));
			clusterServiceSummary.setType(context.stringValue("DescribeClusterServiceForAdminResponse.ServiceInfo.ClusterServiceSummaryList["+ i +"].Type"));
			clusterServiceSummary.setAlertInfo(context.stringValue("DescribeClusterServiceForAdminResponse.ServiceInfo.ClusterServiceSummaryList["+ i +"].AlertInfo"));

			clusterServiceSummaryList.add(clusterServiceSummary);
		}
		serviceInfo.setClusterServiceSummaryList(clusterServiceSummaryList);
		describeClusterServiceForAdminResponse.setServiceInfo(serviceInfo);
	 
	 	return describeClusterServiceForAdminResponse;
	}
}