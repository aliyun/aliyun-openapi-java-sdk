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

package com.aliyuncs.petadata.transform.v20160101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.petadata.model.v20160101.DescribeInstancePerformanceResponse;
import com.aliyuncs.petadata.model.v20160101.DescribeInstancePerformanceResponse.MonitorData;
import com.aliyuncs.petadata.model.v20160101.DescribeInstancePerformanceResponse.MonitorData.PerformanceValue;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstancePerformanceResponseUnmarshaller {

	public static DescribeInstancePerformanceResponse unmarshall(DescribeInstancePerformanceResponse describeInstancePerformanceResponse, UnmarshallerContext context) {
		
		describeInstancePerformanceResponse.setRequestId(context.stringValue("DescribeInstancePerformanceResponse.RequestId"));

		List<MonitorData> monitorDatas = new ArrayList<MonitorData>();
		for (int i = 0; i < context.lengthValue("DescribeInstancePerformanceResponse.MonitorDatas.Length"); i++) {
			MonitorData monitorData = new MonitorData();
			monitorData.setKey(context.stringValue("DescribeInstancePerformanceResponse.MonitorDatas["+ i +"].Key"));
			monitorData.setUnit(context.stringValue("DescribeInstancePerformanceResponse.MonitorDatas["+ i +"].Unit"));

			List<PerformanceValue> performanceValues = new ArrayList<PerformanceValue>();
			for (int j = 0; j < context.lengthValue("DescribeInstancePerformanceResponse.MonitorDatas["+ i +"].PerformanceValues.Length"); j++) {
				PerformanceValue performanceValue = new PerformanceValue();
				performanceValue.setValue(context.stringValue("DescribeInstancePerformanceResponse.MonitorDatas["+ i +"].PerformanceValues["+ j +"].Value"));
				performanceValue.setDate(context.stringValue("DescribeInstancePerformanceResponse.MonitorDatas["+ i +"].PerformanceValues["+ j +"].Date"));

				performanceValues.add(performanceValue);
			}
			monitorData.setPerformanceValues(performanceValues);

			monitorDatas.add(monitorData);
		}
		describeInstancePerformanceResponse.setMonitorDatas(monitorDatas);
	 
	 	return describeInstancePerformanceResponse;
	}
}