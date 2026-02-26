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

import com.aliyuncs.cloudapi.model.v20160714.DescribeInstanceSlbConnectResponse;
import com.aliyuncs.cloudapi.model.v20160714.DescribeInstanceSlbConnectResponse.MonitorItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeInstanceSlbConnectResponseUnmarshaller {

	public static DescribeInstanceSlbConnectResponse unmarshall(DescribeInstanceSlbConnectResponse describeInstanceSlbConnectResponse, UnmarshallerContext _ctx) {
		
		describeInstanceSlbConnectResponse.setRequestId(_ctx.stringValue("DescribeInstanceSlbConnectResponse.RequestId"));

		List<MonitorItem> instanceSlbConnect = new ArrayList<MonitorItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeInstanceSlbConnectResponse.InstanceSlbConnect.Length"); i++) {
			MonitorItem monitorItem = new MonitorItem();
			monitorItem.setItemValue(_ctx.stringValue("DescribeInstanceSlbConnectResponse.InstanceSlbConnect["+ i +"].ItemValue"));
			monitorItem.setItemTime(_ctx.stringValue("DescribeInstanceSlbConnectResponse.InstanceSlbConnect["+ i +"].ItemTime"));
			monitorItem.setItem(_ctx.stringValue("DescribeInstanceSlbConnectResponse.InstanceSlbConnect["+ i +"].Item"));

			instanceSlbConnect.add(monitorItem);
		}
		describeInstanceSlbConnectResponse.setInstanceSlbConnect(instanceSlbConnect);
	 
	 	return describeInstanceSlbConnectResponse;
	}
}