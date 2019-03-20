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

package com.aliyuncs.ocs.transform.v20150301;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ocs.model.v20150301.DescribeMonitorValuesResponse;
import com.aliyuncs.ocs.model.v20150301.DescribeMonitorValuesResponse.OcsInstanceMonitor;
import com.aliyuncs.ocs.model.v20150301.DescribeMonitorValuesResponse.OcsInstanceMonitor.OcsMonitorKey;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeMonitorValuesResponseUnmarshaller {

	public static DescribeMonitorValuesResponse unmarshall(DescribeMonitorValuesResponse describeMonitorValuesResponse, UnmarshallerContext context) {
		
		describeMonitorValuesResponse.setRequestId(context.stringValue("DescribeMonitorValuesResponse.RequestId"));
		describeMonitorValuesResponse.setDate(context.stringValue("DescribeMonitorValuesResponse.Date"));

		List<OcsInstanceMonitor> instanceIds = new ArrayList<OcsInstanceMonitor>();
		for (int i = 0; i < context.lengthValue("DescribeMonitorValuesResponse.InstanceIds.Length"); i++) {
			OcsInstanceMonitor ocsInstanceMonitor = new OcsInstanceMonitor();
			ocsInstanceMonitor.setInstanceId(context.stringValue("DescribeMonitorValuesResponse.InstanceIds["+ i +"].InstanceId"));

			List<OcsMonitorKey> monitorKeys = new ArrayList<OcsMonitorKey>();
			for (int j = 0; j < context.lengthValue("DescribeMonitorValuesResponse.InstanceIds["+ i +"].MonitorKeys.Length"); j++) {
				OcsMonitorKey ocsMonitorKey = new OcsMonitorKey();
				ocsMonitorKey.setMonitorKey(context.stringValue("DescribeMonitorValuesResponse.InstanceIds["+ i +"].MonitorKeys["+ j +"].MonitorKey"));
				ocsMonitorKey.setValue(context.stringValue("DescribeMonitorValuesResponse.InstanceIds["+ i +"].MonitorKeys["+ j +"].Value"));
				ocsMonitorKey.setUnit(context.stringValue("DescribeMonitorValuesResponse.InstanceIds["+ i +"].MonitorKeys["+ j +"].Unit"));

				monitorKeys.add(ocsMonitorKey);
			}
			ocsInstanceMonitor.setMonitorKeys(monitorKeys);

			instanceIds.add(ocsInstanceMonitor);
		}
		describeMonitorValuesResponse.setInstanceIds(instanceIds);
	 
	 	return describeMonitorValuesResponse;
	}
}