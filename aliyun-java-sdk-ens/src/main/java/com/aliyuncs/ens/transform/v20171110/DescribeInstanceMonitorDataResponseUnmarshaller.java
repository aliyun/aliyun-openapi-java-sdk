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

package com.aliyuncs.ens.transform.v20171110;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ens.model.v20171110.DescribeInstanceMonitorDataResponse;
import com.aliyuncs.ens.model.v20171110.DescribeInstanceMonitorDataResponse.InstanceMonitorData;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstanceMonitorDataResponseUnmarshaller {

	public static DescribeInstanceMonitorDataResponse unmarshall(DescribeInstanceMonitorDataResponse describeInstanceMonitorDataResponse, UnmarshallerContext _ctx) {
		
		describeInstanceMonitorDataResponse.setRequestId(_ctx.stringValue("DescribeInstanceMonitorDataResponse.RequestId"));
		describeInstanceMonitorDataResponse.setCode(_ctx.integerValue("DescribeInstanceMonitorDataResponse.Code"));

		List<InstanceMonitorData> monitorData = new ArrayList<InstanceMonitorData>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInstanceMonitorDataResponse.MonitorData.Length"); i++) {
			InstanceMonitorData instanceMonitorData = new InstanceMonitorData();
			instanceMonitorData.setInstanceId(_ctx.stringValue("DescribeInstanceMonitorDataResponse.MonitorData["+ i +"].InstanceId"));
			instanceMonitorData.setMemory(_ctx.stringValue("DescribeInstanceMonitorDataResponse.MonitorData["+ i +"].Memory"));
			instanceMonitorData.setCPU(_ctx.stringValue("DescribeInstanceMonitorDataResponse.MonitorData["+ i +"].CPU"));

			monitorData.add(instanceMonitorData);
		}
		describeInstanceMonitorDataResponse.setMonitorData(monitorData);
	 
	 	return describeInstanceMonitorDataResponse;
	}
}