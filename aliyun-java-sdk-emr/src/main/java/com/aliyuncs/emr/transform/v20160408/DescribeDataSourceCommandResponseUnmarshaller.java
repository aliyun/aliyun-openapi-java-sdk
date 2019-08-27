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

	public static DescribeDataSourceCommandResponse unmarshall(DescribeDataSourceCommandResponse describeDataSourceCommandResponse, UnmarshallerContext _ctx) {
		
		describeDataSourceCommandResponse.setRequestId(_ctx.stringValue("DescribeDataSourceCommandResponse.RequestId"));
		describeDataSourceCommandResponse.setCommandId(_ctx.stringValue("DescribeDataSourceCommandResponse.CommandId"));
		describeDataSourceCommandResponse.setHostName(_ctx.stringValue("DescribeDataSourceCommandResponse.HostName"));
		describeDataSourceCommandResponse.setState(_ctx.stringValue("DescribeDataSourceCommandResponse.State"));
		describeDataSourceCommandResponse.setStartTime(_ctx.longValue("DescribeDataSourceCommandResponse.StartTime"));
		describeDataSourceCommandResponse.setEndTime(_ctx.longValue("DescribeDataSourceCommandResponse.EndTime"));
		describeDataSourceCommandResponse.setMessage(_ctx.stringValue("DescribeDataSourceCommandResponse.Message"));
		describeDataSourceCommandResponse.setData(_ctx.stringValue("DescribeDataSourceCommandResponse.Data"));

		List<Host> hostList = new ArrayList<Host>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDataSourceCommandResponse.HostList.Length"); i++) {
			Host host = new Host();
			host.setHostName(_ctx.stringValue("DescribeDataSourceCommandResponse.HostList["+ i +"].HostName"));
			host.setState(_ctx.stringValue("DescribeDataSourceCommandResponse.HostList["+ i +"].State"));
			host.setStartTime(_ctx.longValue("DescribeDataSourceCommandResponse.HostList["+ i +"].StartTime"));
			host.setEndTime(_ctx.longValue("DescribeDataSourceCommandResponse.HostList["+ i +"].EndTime"));
			host.setMessage(_ctx.stringValue("DescribeDataSourceCommandResponse.HostList["+ i +"].Message"));
			host.setData(_ctx.stringValue("DescribeDataSourceCommandResponse.HostList["+ i +"].Data"));

			hostList.add(host);
		}
		describeDataSourceCommandResponse.setHostList(hostList);
	 
	 	return describeDataSourceCommandResponse;
	}
}