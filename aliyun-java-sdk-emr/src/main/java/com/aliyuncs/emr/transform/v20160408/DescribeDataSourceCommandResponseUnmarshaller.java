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

package com.aliyuncs.emr.transform.v20160408;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.emr.model.v20160408.DescribeDataSourceCommandResponse;
import com.aliyuncs.emr.model.v20160408.DescribeDataSourceCommandResponse.Host;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDataSourceCommandResponseUnmarshaller {

	public static DescribeDataSourceCommandResponse unmarshall(DescribeDataSourceCommandResponse describeDataSourceCommandResponse, UnmarshallerContext context) {
		
		describeDataSourceCommandResponse.setRequestId(context.stringValue("DescribeDataSourceCommandResponse.RequestId"));
		describeDataSourceCommandResponse.setCommandId(context.stringValue("DescribeDataSourceCommandResponse.CommandId"));
		describeDataSourceCommandResponse.setHostName(context.stringValue("DescribeDataSourceCommandResponse.HostName"));
		describeDataSourceCommandResponse.setState(context.stringValue("DescribeDataSourceCommandResponse.State"));
		describeDataSourceCommandResponse.setStartTime(context.longValue("DescribeDataSourceCommandResponse.StartTime"));
		describeDataSourceCommandResponse.setEndTime(context.longValue("DescribeDataSourceCommandResponse.EndTime"));
		describeDataSourceCommandResponse.setMessage(context.stringValue("DescribeDataSourceCommandResponse.Message"));
		describeDataSourceCommandResponse.setData(context.stringValue("DescribeDataSourceCommandResponse.Data"));

		List<Host> hostList = new ArrayList<Host>();
		for (int i = 0; i < context.lengthValue("DescribeDataSourceCommandResponse.HostList.Length"); i++) {
			Host host = new Host();
			host.setHostName(context.stringValue("DescribeDataSourceCommandResponse.HostList["+ i +"].HostName"));
			host.setState(context.stringValue("DescribeDataSourceCommandResponse.HostList["+ i +"].State"));
			host.setStartTime(context.longValue("DescribeDataSourceCommandResponse.HostList["+ i +"].StartTime"));
			host.setEndTime(context.longValue("DescribeDataSourceCommandResponse.HostList["+ i +"].EndTime"));
			host.setMessage(context.stringValue("DescribeDataSourceCommandResponse.HostList["+ i +"].Message"));
			host.setData(context.stringValue("DescribeDataSourceCommandResponse.HostList["+ i +"].Data"));

			hostList.add(host);
		}
		describeDataSourceCommandResponse.setHostList(hostList);
	 
	 	return describeDataSourceCommandResponse;
	}
}