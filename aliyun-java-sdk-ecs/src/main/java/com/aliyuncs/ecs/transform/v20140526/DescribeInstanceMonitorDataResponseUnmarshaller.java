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

	public static DescribeInstanceMonitorDataResponse unmarshall(DescribeInstanceMonitorDataResponse describeInstanceMonitorDataResponse, UnmarshallerContext _ctx) {
		
		describeInstanceMonitorDataResponse.setRequestId(_ctx.stringValue("DescribeInstanceMonitorDataResponse.RequestId"));

		List<InstanceMonitorData> monitorData = new ArrayList<InstanceMonitorData>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInstanceMonitorDataResponse.MonitorData.Length"); i++) {
			InstanceMonitorData instanceMonitorData = new InstanceMonitorData();
			instanceMonitorData.setInstanceId(_ctx.stringValue("DescribeInstanceMonitorDataResponse.MonitorData["+ i +"].InstanceId"));
			instanceMonitorData.setCPU(_ctx.integerValue("DescribeInstanceMonitorDataResponse.MonitorData["+ i +"].CPU"));
			instanceMonitorData.setIntranetRX(_ctx.integerValue("DescribeInstanceMonitorDataResponse.MonitorData["+ i +"].IntranetRX"));
			instanceMonitorData.setIntranetTX(_ctx.integerValue("DescribeInstanceMonitorDataResponse.MonitorData["+ i +"].IntranetTX"));
			instanceMonitorData.setIntranetBandwidth(_ctx.integerValue("DescribeInstanceMonitorDataResponse.MonitorData["+ i +"].IntranetBandwidth"));
			instanceMonitorData.setInternetRX(_ctx.integerValue("DescribeInstanceMonitorDataResponse.MonitorData["+ i +"].InternetRX"));
			instanceMonitorData.setInternetTX(_ctx.integerValue("DescribeInstanceMonitorDataResponse.MonitorData["+ i +"].InternetTX"));
			instanceMonitorData.setInternetBandwidth(_ctx.integerValue("DescribeInstanceMonitorDataResponse.MonitorData["+ i +"].InternetBandwidth"));
			instanceMonitorData.setIOPSRead(_ctx.integerValue("DescribeInstanceMonitorDataResponse.MonitorData["+ i +"].IOPSRead"));
			instanceMonitorData.setIOPSWrite(_ctx.integerValue("DescribeInstanceMonitorDataResponse.MonitorData["+ i +"].IOPSWrite"));
			instanceMonitorData.setBPSRead(_ctx.integerValue("DescribeInstanceMonitorDataResponse.MonitorData["+ i +"].BPSRead"));
			instanceMonitorData.setBPSWrite(_ctx.integerValue("DescribeInstanceMonitorDataResponse.MonitorData["+ i +"].BPSWrite"));
			instanceMonitorData.setCPUCreditUsage(_ctx.floatValue("DescribeInstanceMonitorDataResponse.MonitorData["+ i +"].CPUCreditUsage"));
			instanceMonitorData.setCPUCreditBalance(_ctx.floatValue("DescribeInstanceMonitorDataResponse.MonitorData["+ i +"].CPUCreditBalance"));
			instanceMonitorData.setCPUAdvanceCreditBalance(_ctx.floatValue("DescribeInstanceMonitorDataResponse.MonitorData["+ i +"].CPUAdvanceCreditBalance"));
			instanceMonitorData.setCPUNotpaidSurplusCreditUsage(_ctx.floatValue("DescribeInstanceMonitorDataResponse.MonitorData["+ i +"].CPUNotpaidSurplusCreditUsage"));
			instanceMonitorData.setTimeStamp(_ctx.stringValue("DescribeInstanceMonitorDataResponse.MonitorData["+ i +"].TimeStamp"));

			monitorData.add(instanceMonitorData);
		}
		describeInstanceMonitorDataResponse.setMonitorData(monitorData);
	 
	 	return describeInstanceMonitorDataResponse;
	}
}