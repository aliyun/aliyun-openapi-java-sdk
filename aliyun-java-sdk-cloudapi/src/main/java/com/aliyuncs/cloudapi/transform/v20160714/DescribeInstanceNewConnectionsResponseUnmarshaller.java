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

import com.aliyuncs.cloudapi.model.v20160714.DescribeInstanceNewConnectionsResponse;
import com.aliyuncs.cloudapi.model.v20160714.DescribeInstanceNewConnectionsResponse.MonitorItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstanceNewConnectionsResponseUnmarshaller {

	public static DescribeInstanceNewConnectionsResponse unmarshall(DescribeInstanceNewConnectionsResponse describeInstanceNewConnectionsResponse, UnmarshallerContext _ctx) {
		
		describeInstanceNewConnectionsResponse.setRequestId(_ctx.stringValue("DescribeInstanceNewConnectionsResponse.RequestId"));

		List<MonitorItem> instanceNewConnections = new ArrayList<MonitorItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInstanceNewConnectionsResponse.InstanceNewConnections.Length"); i++) {
			MonitorItem monitorItem = new MonitorItem();
			monitorItem.setItemValue(_ctx.stringValue("DescribeInstanceNewConnectionsResponse.InstanceNewConnections["+ i +"].ItemValue"));
			monitorItem.setItemTime(_ctx.stringValue("DescribeInstanceNewConnectionsResponse.InstanceNewConnections["+ i +"].ItemTime"));

			instanceNewConnections.add(monitorItem);
		}
		describeInstanceNewConnectionsResponse.setInstanceNewConnections(instanceNewConnections);
	 
	 	return describeInstanceNewConnectionsResponse;
	}
}