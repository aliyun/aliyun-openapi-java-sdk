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

import com.aliyuncs.petadata.model.v20160101.DescribeInstanceResourceUsageResponse;
import com.aliyuncs.petadata.model.v20160101.DescribeInstanceResourceUsageResponse.MonitorData;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstanceResourceUsageResponseUnmarshaller {

	public static DescribeInstanceResourceUsageResponse unmarshall(DescribeInstanceResourceUsageResponse describeInstanceResourceUsageResponse, UnmarshallerContext context) {
		
		describeInstanceResourceUsageResponse.setRequestId(context.stringValue("DescribeInstanceResourceUsageResponse.RequestId"));

		List<MonitorData> monitorDatas = new ArrayList<MonitorData>();
		for (int i = 0; i < context.lengthValue("DescribeInstanceResourceUsageResponse.MonitorDatas.Length"); i++) {
			MonitorData monitorData = new MonitorData();
			monitorData.setDate(context.stringValue("DescribeInstanceResourceUsageResponse.MonitorDatas["+ i +"].Date"));
			monitorData.setBinlogSize(context.longValue("DescribeInstanceResourceUsageResponse.MonitorDatas["+ i +"].BinlogSize"));
			monitorData.setDataSize(context.longValue("DescribeInstanceResourceUsageResponse.MonitorDatas["+ i +"].DataSize"));
			monitorData.setOtherSize(context.longValue("DescribeInstanceResourceUsageResponse.MonitorDatas["+ i +"].OtherSize"));
			monitorData.setTotalSize(context.longValue("DescribeInstanceResourceUsageResponse.MonitorDatas["+ i +"].TotalSize"));

			monitorDatas.add(monitorData);
		}
		describeInstanceResourceUsageResponse.setMonitorDatas(monitorDatas);
	 
	 	return describeInstanceResourceUsageResponse;
	}
}