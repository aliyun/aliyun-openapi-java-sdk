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

import com.aliyuncs.cloudapi.model.v20160714.DescribeGroupLatencyResponse;
import com.aliyuncs.cloudapi.model.v20160714.DescribeGroupLatencyResponse.MonitorItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeGroupLatencyResponseUnmarshaller {

	public static DescribeGroupLatencyResponse unmarshall(DescribeGroupLatencyResponse describeGroupLatencyResponse, UnmarshallerContext _ctx) {
		
		describeGroupLatencyResponse.setRequestId(_ctx.stringValue("DescribeGroupLatencyResponse.RequestId"));

		List<MonitorItem> latencyPacket = new ArrayList<MonitorItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeGroupLatencyResponse.LatencyPacket.Length"); i++) {
			MonitorItem monitorItem = new MonitorItem();
			monitorItem.setItemValue(_ctx.stringValue("DescribeGroupLatencyResponse.LatencyPacket["+ i +"].ItemValue"));
			monitorItem.setItemTime(_ctx.stringValue("DescribeGroupLatencyResponse.LatencyPacket["+ i +"].ItemTime"));
			monitorItem.setItem(_ctx.stringValue("DescribeGroupLatencyResponse.LatencyPacket["+ i +"].Item"));

			latencyPacket.add(monitorItem);
		}
		describeGroupLatencyResponse.setLatencyPacket(latencyPacket);
	 
	 	return describeGroupLatencyResponse;
	}
}