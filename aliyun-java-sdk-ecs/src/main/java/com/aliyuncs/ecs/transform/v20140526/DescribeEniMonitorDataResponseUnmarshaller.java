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

import com.aliyuncs.ecs.model.v20140526.DescribeEniMonitorDataResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeEniMonitorDataResponse.EniMonitorData;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeEniMonitorDataResponseUnmarshaller {

	public static DescribeEniMonitorDataResponse unmarshall(DescribeEniMonitorDataResponse describeEniMonitorDataResponse, UnmarshallerContext context) {
		
		describeEniMonitorDataResponse.setRequestId(context.stringValue("DescribeEniMonitorDataResponse.RequestId"));
		describeEniMonitorDataResponse.setTotalCount(context.integerValue("DescribeEniMonitorDataResponse.TotalCount"));

		List<EniMonitorData> monitorData = new ArrayList<EniMonitorData>();
		for (int i = 0; i < context.lengthValue("DescribeEniMonitorDataResponse.MonitorData.Length"); i++) {
			EniMonitorData eniMonitorData = new EniMonitorData();
			eniMonitorData.setEniId(context.stringValue("DescribeEniMonitorDataResponse.MonitorData["+ i +"].EniId"));
			eniMonitorData.setTimeStamp(context.stringValue("DescribeEniMonitorDataResponse.MonitorData["+ i +"].TimeStamp"));
			eniMonitorData.setPacketTx(context.stringValue("DescribeEniMonitorDataResponse.MonitorData["+ i +"].PacketTx"));
			eniMonitorData.setPacketRx(context.stringValue("DescribeEniMonitorDataResponse.MonitorData["+ i +"].PacketRx"));
			eniMonitorData.setIntranetTx(context.stringValue("DescribeEniMonitorDataResponse.MonitorData["+ i +"].IntranetTx"));
			eniMonitorData.setIntranetRx(context.stringValue("DescribeEniMonitorDataResponse.MonitorData["+ i +"].IntranetRx"));
			eniMonitorData.setDropPacketTx(context.stringValue("DescribeEniMonitorDataResponse.MonitorData["+ i +"].DropPacketTx"));
			eniMonitorData.setDropPacketRx(context.stringValue("DescribeEniMonitorDataResponse.MonitorData["+ i +"].DropPacketRx"));

			monitorData.add(eniMonitorData);
		}
		describeEniMonitorDataResponse.setMonitorData(monitorData);
	 
	 	return describeEniMonitorDataResponse;
	}
}