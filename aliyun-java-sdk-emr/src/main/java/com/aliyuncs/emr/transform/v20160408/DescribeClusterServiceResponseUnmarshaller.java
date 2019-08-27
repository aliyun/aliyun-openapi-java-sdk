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
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeClusterServiceResponseUnmarshaller {

	public static DescribeClusterServiceResponse unmarshall(DescribeClusterServiceResponse describeClusterServiceResponse, UnmarshallerContext _ctx) {
		
		describeClusterServiceResponse.setRequestId(_ctx.stringValue("DescribeClusterServiceResponse.RequestId"));

		ServiceInfo serviceInfo = new ServiceInfo();
		serviceInfo.setServiceName(_ctx.stringValue("DescribeClusterServiceResponse.ServiceInfo.ServiceName"));
		serviceInfo.setServiceVersion(_ctx.stringValue("DescribeClusterServiceResponse.ServiceInfo.ServiceVersion"));
		serviceInfo.setServiceStatus(_ctx.stringValue("DescribeClusterServiceResponse.ServiceInfo.ServiceStatus"));
		serviceInfo.setNeedRestartInfo(_ctx.stringValue("DescribeClusterServiceResponse.ServiceInfo.NeedRestartInfo"));
		serviceInfo.setNeedRestartNum(_ctx.integerValue("DescribeClusterServiceResponse.ServiceInfo.NeedRestartNum"));

		List<String> needRestartHostIdList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeClusterServiceResponse.ServiceInfo.NeedRestartHostIdList.Length"); i++) {
			needRestartHostIdList.add(_ctx.stringValue("DescribeClusterServiceResponse.ServiceInfo.NeedRestartHostIdList["+ i +"]"));
		}
		serviceInfo.setNeedRestartHostIdList(needRestartHostIdList);

		List<String> needRestartComponentNameList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeClusterServiceResponse.ServiceInfo.NeedRestartComponentNameList.Length"); i++) {
			needRestartComponentNameList.add(_ctx.stringValue("DescribeClusterServiceResponse.ServiceInfo.NeedRestartComponentNameList["+ i +"]"));
		}
		serviceInfo.setNeedRestartComponentNameList(needRestartComponentNameList);

		List<ServiceAction> serviceActionList = new ArrayList<ServiceAction>();
		for (int i = 0; i < _ctx.lengthValue("DescribeClusterServiceResponse.ServiceInfo.ServiceActionList.Length"); i++) {
			ServiceAction serviceAction = new ServiceAction();
			serviceAction.setServiceName(_ctx.stringValue("DescribeClusterServiceResponse.ServiceInfo.ServiceActionList["+ i +"].ServiceName"));
			serviceAction.setComponentName(_ctx.stringValue("DescribeClusterServiceResponse.ServiceInfo.ServiceActionList["+ i +"].ComponentName"));
			serviceAction.setActionName(_ctx.stringValue("DescribeClusterServiceResponse.ServiceInfo.ServiceActionList["+ i +"].ActionName"));
			serviceAction.setCommand(_ctx.stringValue("DescribeClusterServiceResponse.ServiceInfo.ServiceActionList["+ i +"].Command"));
			serviceAction.setDisplayName(_ctx.stringValue("DescribeClusterServiceResponse.ServiceInfo.ServiceActionList["+ i +"].DisplayName"));

			serviceActionList.add(serviceAction);
		}
		serviceInfo.setServiceActionList(serviceActionList);

		List<ClusterServiceSummary> clusterServiceSummaryList = new ArrayList<ClusterServiceSummary>();
		for (int i = 0; i < _ctx.lengthValue("DescribeClusterServiceResponse.ServiceInfo.ClusterServiceSummaryList.Length"); i++) {
			ClusterServiceSummary clusterServiceSummary = new ClusterServiceSummary();
			clusterServiceSummary.setKey(_ctx.stringValue("DescribeClusterServiceResponse.ServiceInfo.ClusterServiceSummaryList["+ i +"].Key"));
			clusterServiceSummary.setDisplayName(_ctx.stringValue("DescribeClusterServiceResponse.ServiceInfo.ClusterServiceSummaryList["+ i +"].DisplayName"));
			clusterServiceSummary.setValue(_ctx.stringValue("DescribeClusterServiceResponse.ServiceInfo.ClusterServiceSummaryList["+ i +"].Value"));
			clusterServiceSummary.setDesiredStoppedValue(_ctx.integerValue("DescribeClusterServiceResponse.ServiceInfo.ClusterServiceSummaryList["+ i +"].DesiredStoppedValue"));
			clusterServiceSummary.setStatus(_ctx.stringValue("DescribeClusterServiceResponse.ServiceInfo.ClusterServiceSummaryList["+ i +"].Status"));
			clusterServiceSummary.setType(_ctx.stringValue("DescribeClusterServiceResponse.ServiceInfo.ClusterServiceSummaryList["+ i +"].Type"));
			clusterServiceSummary.setCategory(_ctx.stringValue("DescribeClusterServiceResponse.ServiceInfo.ClusterServiceSummaryList["+ i +"].Category"));
			clusterServiceSummary.setAlertInfo(_ctx.stringValue("DescribeClusterServiceResponse.ServiceInfo.ClusterServiceSummaryList["+ i +"].AlertInfo"));

			clusterServiceSummaryList.add(clusterServiceSummary);
		}
		serviceInfo.setClusterServiceSummaryList(clusterServiceSummaryList);
		describeClusterServiceResponse.setServiceInfo(serviceInfo);
	 
	 	return describeClusterServiceResponse;
	}
}