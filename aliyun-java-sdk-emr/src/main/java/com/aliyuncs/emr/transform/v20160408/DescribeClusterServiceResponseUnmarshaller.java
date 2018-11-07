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

import com.aliyuncs.emr.model.v20160408.DescribeClusterServiceResponse;
import com.aliyuncs.emr.model.v20160408.DescribeClusterServiceResponse.ServiceInfo;
import com.aliyuncs.emr.model.v20160408.DescribeClusterServiceResponse.ServiceInfo.ClusterServiceSummary;
import com.aliyuncs.emr.model.v20160408.DescribeClusterServiceResponse.ServiceInfo.ServiceAction;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeClusterServiceResponseUnmarshaller {

	public static DescribeClusterServiceResponse unmarshall(DescribeClusterServiceResponse describeClusterServiceResponse, UnmarshallerContext context) {
		
		describeClusterServiceResponse.setRequestId(context.stringValue("DescribeClusterServiceResponse.RequestId"));

		ServiceInfo serviceInfo = new ServiceInfo();
		serviceInfo.setServiceName(context.stringValue("DescribeClusterServiceResponse.ServiceInfo.ServiceName"));
		serviceInfo.setServiceVersion(context.stringValue("DescribeClusterServiceResponse.ServiceInfo.ServiceVersion"));
		serviceInfo.setServiceStatus(context.stringValue("DescribeClusterServiceResponse.ServiceInfo.ServiceStatus"));
		serviceInfo.setNeedRestartInfo(context.stringValue("DescribeClusterServiceResponse.ServiceInfo.NeedRestartInfo"));
		serviceInfo.setNeedRestartNum(context.integerValue("DescribeClusterServiceResponse.ServiceInfo.NeedRestartNum"));

		List<String> needRestartHostIdList = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeClusterServiceResponse.ServiceInfo.NeedRestartHostIdList.Length"); i++) {
			needRestartHostIdList.add(context.stringValue("DescribeClusterServiceResponse.ServiceInfo.NeedRestartHostIdList["+ i +"]"));
		}
		serviceInfo.setNeedRestartHostIdList(needRestartHostIdList);

		List<String> needRestartComponentNameList = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DescribeClusterServiceResponse.ServiceInfo.NeedRestartComponentNameList.Length"); i++) {
			needRestartComponentNameList.add(context.stringValue("DescribeClusterServiceResponse.ServiceInfo.NeedRestartComponentNameList["+ i +"]"));
		}
		serviceInfo.setNeedRestartComponentNameList(needRestartComponentNameList);

		List<ServiceAction> serviceActionList = new ArrayList<ServiceAction>();
		for (int i = 0; i < context.lengthValue("DescribeClusterServiceResponse.ServiceInfo.ServiceActionList.Length"); i++) {
			ServiceAction serviceAction = new ServiceAction();
			serviceAction.setServiceName(context.stringValue("DescribeClusterServiceResponse.ServiceInfo.ServiceActionList["+ i +"].ServiceName"));
			serviceAction.setComponentName(context.stringValue("DescribeClusterServiceResponse.ServiceInfo.ServiceActionList["+ i +"].ComponentName"));
			serviceAction.setActionName(context.stringValue("DescribeClusterServiceResponse.ServiceInfo.ServiceActionList["+ i +"].ActionName"));
			serviceAction.setCommand(context.stringValue("DescribeClusterServiceResponse.ServiceInfo.ServiceActionList["+ i +"].Command"));
			serviceAction.setDisplayName(context.stringValue("DescribeClusterServiceResponse.ServiceInfo.ServiceActionList["+ i +"].DisplayName"));

			serviceActionList.add(serviceAction);
		}
		serviceInfo.setServiceActionList(serviceActionList);

		List<ClusterServiceSummary> clusterServiceSummaryList = new ArrayList<ClusterServiceSummary>();
		for (int i = 0; i < context.lengthValue("DescribeClusterServiceResponse.ServiceInfo.ClusterServiceSummaryList.Length"); i++) {
			ClusterServiceSummary clusterServiceSummary = new ClusterServiceSummary();
			clusterServiceSummary.setKey(context.stringValue("DescribeClusterServiceResponse.ServiceInfo.ClusterServiceSummaryList["+ i +"].Key"));
			clusterServiceSummary.setDisplayName(context.stringValue("DescribeClusterServiceResponse.ServiceInfo.ClusterServiceSummaryList["+ i +"].DisplayName"));
			clusterServiceSummary.setValue(context.stringValue("DescribeClusterServiceResponse.ServiceInfo.ClusterServiceSummaryList["+ i +"].Value"));
			clusterServiceSummary.setStatus(context.stringValue("DescribeClusterServiceResponse.ServiceInfo.ClusterServiceSummaryList["+ i +"].Status"));
			clusterServiceSummary.setType(context.stringValue("DescribeClusterServiceResponse.ServiceInfo.ClusterServiceSummaryList["+ i +"].Type"));
			clusterServiceSummary.setAlertInfo(context.stringValue("DescribeClusterServiceResponse.ServiceInfo.ClusterServiceSummaryList["+ i +"].AlertInfo"));

			clusterServiceSummaryList.add(clusterServiceSummary);
		}
		serviceInfo.setClusterServiceSummaryList(clusterServiceSummaryList);
		describeClusterServiceResponse.setServiceInfo(serviceInfo);
	 
	 	return describeClusterServiceResponse;
	}
}