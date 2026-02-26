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

import com.aliyuncs.cloudapi.model.v20160714.DescribeInstanceLatencyResponse;
import com.aliyuncs.cloudapi.model.v20160714.DescribeInstanceLatencyResponse.MonitorItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstanceLatencyResponseUnmarshaller {

	public static DescribeInstanceLatencyResponse unmarshall(DescribeInstanceLatencyResponse describeInstanceLatencyResponse, UnmarshallerContext _ctx) {
		
		describeInstanceLatencyResponse.setRequestId(_ctx.stringValue("DescribeInstanceLatencyResponse.RequestId"));

		List<MonitorItem> instanceLatency = new ArrayList<MonitorItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInstanceLatencyResponse.InstanceLatency.Length"); i++) {
			MonitorItem monitorItem = new MonitorItem();
			monitorItem.setItemValue(_ctx.stringValue("DescribeInstanceLatencyResponse.InstanceLatency["+ i +"].ItemValue"));
			monitorItem.setItemTime(_ctx.stringValue("DescribeInstanceLatencyResponse.InstanceLatency["+ i +"].ItemTime"));
			monitorItem.setItem(_ctx.stringValue("DescribeInstanceLatencyResponse.InstanceLatency["+ i +"].Item"));

			instanceLatency.add(monitorItem);
		}
		describeInstanceLatencyResponse.setInstanceLatency(instanceLatency);
	 
	 	return describeInstanceLatencyResponse;
	}
}