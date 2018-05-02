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

package com.aliyuncs.ecs.transform.v20140526;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs.model.v20140526.DescribeInstanceMonitorDataResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeInstanceMonitorDataResponse.InstanceMonitorData;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstanceMonitorDataResponseUnmarshaller {

	public static DescribeInstanceMonitorDataResponse unmarshall(DescribeInstanceMonitorDataResponse describeInstanceMonitorDataResponse, UnmarshallerContext context) {
		
		describeInstanceMonitorDataResponse.setRequestId(context.stringValue("DescribeInstanceMonitorDataResponse.RequestId"));

		List<InstanceMonitorData> monitorData = new ArrayList<InstanceMonitorData>();
		for (int i = 0; i < context.lengthValue("DescribeInstanceMonitorDataResponse.MonitorData.Length"); i++) {
			InstanceMonitorData instanceMonitorData = new InstanceMonitorData();
			instanceMonitorData.setInstanceId(context.stringValue("DescribeInstanceMonitorDataResponse.MonitorData["+ i +"].InstanceId"));
			instanceMonitorData.setCPU(context.integerValue("DescribeInstanceMonitorDataResponse.MonitorData["+ i +"].CPU"));
			instanceMonitorData.setIntranetRX(context.integerValue("DescribeInstanceMonitorDataResponse.MonitorData["+ i +"].IntranetRX"));
			instanceMonitorData.setIntranetTX(context.integerValue("DescribeInstanceMonitorDataResponse.MonitorData["+ i +"].IntranetTX"));
			instanceMonitorData.setIntranetBandwidth(context.integerValue("DescribeInstanceMonitorDataResponse.MonitorData["+ i +"].IntranetBandwidth"));
			instanceMonitorData.setInternetRX(context.integerValue("DescribeInstanceMonitorDataResponse.MonitorData["+ i +"].InternetRX"));
			instanceMonitorData.setInternetTX(context.integerValue("DescribeInstanceMonitorDataResponse.MonitorData["+ i +"].InternetTX"));
			instanceMonitorData.setInternetBandwidth(context.integerValue("DescribeInstanceMonitorDataResponse.MonitorData["+ i +"].InternetBandwidth"));
			instanceMonitorData.setIOPSRead(context.integerValue("DescribeInstanceMonitorDataResponse.MonitorData["+ i +"].IOPSRead"));
			instanceMonitorData.setIOPSWrite(context.integerValue("DescribeInstanceMonitorDataResponse.MonitorData["+ i +"].IOPSWrite"));
			instanceMonitorData.setBPSRead(context.integerValue("DescribeInstanceMonitorDataResponse.MonitorData["+ i +"].BPSRead"));
			instanceMonitorData.setBPSWrite(context.integerValue("DescribeInstanceMonitorDataResponse.MonitorData["+ i +"].BPSWrite"));
			instanceMonitorData.setCPUCreditUsage(context.floatValue("DescribeInstanceMonitorDataResponse.MonitorData["+ i +"].CPUCreditUsage"));
			instanceMonitorData.setCPUCreditBalance(context.floatValue("DescribeInstanceMonitorDataResponse.MonitorData["+ i +"].CPUCreditBalance"));
			instanceMonitorData.setCPUAdvanceCreditBalance(context.floatValue("DescribeInstanceMonitorDataResponse.MonitorData["+ i +"].CPUAdvanceCreditBalance"));
			instanceMonitorData.setCPUNotpaidSurplusCreditUsage(context.floatValue("DescribeInstanceMonitorDataResponse.MonitorData["+ i +"].CPUNotpaidSurplusCreditUsage"));
			instanceMonitorData.setTimeStamp(context.stringValue("DescribeInstanceMonitorDataResponse.MonitorData["+ i +"].TimeStamp"));

			monitorData.add(instanceMonitorData);
		}
		describeInstanceMonitorDataResponse.setMonitorData(monitorData);
	 
	 	return describeInstanceMonitorDataResponse;
	}
}