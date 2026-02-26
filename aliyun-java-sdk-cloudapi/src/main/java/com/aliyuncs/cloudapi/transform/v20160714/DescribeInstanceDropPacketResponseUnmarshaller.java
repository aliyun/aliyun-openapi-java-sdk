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

package com.aliyuncs.cloudapi.transform.v20160714;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudapi.model.v20160714.DescribeInstanceDropPacketResponse;
import com.aliyuncs.cloudapi.model.v20160714.DescribeInstanceDropPacketResponse.MonitorItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstanceDropPacketResponseUnmarshaller {

	public static DescribeInstanceDropPacketResponse unmarshall(DescribeInstanceDropPacketResponse describeInstanceDropPacketResponse, UnmarshallerContext _ctx) {
		
		describeInstanceDropPacketResponse.setRequestId(_ctx.stringValue("DescribeInstanceDropPacketResponse.RequestId"));

		List<MonitorItem> instanceDropPacket = new ArrayList<MonitorItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInstanceDropPacketResponse.InstanceDropPacket.Length"); i++) {
			MonitorItem monitorItem = new MonitorItem();
			monitorItem.setItemValue(_ctx.stringValue("DescribeInstanceDropPacketResponse.InstanceDropPacket["+ i +"].ItemValue"));
			monitorItem.setItemTime(_ctx.stringValue("DescribeInstanceDropPacketResponse.InstanceDropPacket["+ i +"].ItemTime"));
			monitorItem.setItem(_ctx.stringValue("DescribeInstanceDropPacketResponse.InstanceDropPacket["+ i +"].Item"));

			instanceDropPacket.add(monitorItem);
		}
		describeInstanceDropPacketResponse.setInstanceDropPacket(instanceDropPacket);
	 
	 	return describeInstanceDropPacketResponse;
	}
}