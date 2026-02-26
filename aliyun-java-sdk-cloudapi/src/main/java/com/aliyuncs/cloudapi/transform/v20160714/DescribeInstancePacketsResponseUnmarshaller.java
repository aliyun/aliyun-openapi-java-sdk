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

import com.aliyuncs.cloudapi.model.v20160714.DescribeInstancePacketsResponse;
import com.aliyuncs.cloudapi.model.v20160714.DescribeInstancePacketsResponse.MonitorItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstancePacketsResponseUnmarshaller {

	public static DescribeInstancePacketsResponse unmarshall(DescribeInstancePacketsResponse describeInstancePacketsResponse, UnmarshallerContext _ctx) {
		
		describeInstancePacketsResponse.setRequestId(_ctx.stringValue("DescribeInstancePacketsResponse.RequestId"));

		List<MonitorItem> instancePackets = new ArrayList<MonitorItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInstancePacketsResponse.InstancePackets.Length"); i++) {
			MonitorItem monitorItem = new MonitorItem();
			monitorItem.setItemValue(_ctx.stringValue("DescribeInstancePacketsResponse.InstancePackets["+ i +"].ItemValue"));
			monitorItem.setItemTime(_ctx.stringValue("DescribeInstancePacketsResponse.InstancePackets["+ i +"].ItemTime"));
			monitorItem.setItem(_ctx.stringValue("DescribeInstancePacketsResponse.InstancePackets["+ i +"].Item"));

			instancePackets.add(monitorItem);
		}
		describeInstancePacketsResponse.setInstancePackets(instancePackets);
	 
	 	return describeInstancePacketsResponse;
	}
}