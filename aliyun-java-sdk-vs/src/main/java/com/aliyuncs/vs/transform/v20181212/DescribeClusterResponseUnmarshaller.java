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

package com.aliyuncs.vs.transform.v20181212;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vs.model.v20181212.DescribeClusterResponse;
import com.aliyuncs.vs.model.v20181212.DescribeClusterResponse.InternalPort;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeClusterResponseUnmarshaller {

	public static DescribeClusterResponse unmarshall(DescribeClusterResponse describeClusterResponse, UnmarshallerContext _ctx) {
		
		describeClusterResponse.setRequestId(_ctx.stringValue("DescribeClusterResponse.RequestId"));
		describeClusterResponse.setClusterId(_ctx.stringValue("DescribeClusterResponse.ClusterId"));
		describeClusterResponse.setName(_ctx.stringValue("DescribeClusterResponse.Name"));
		describeClusterResponse.setDescription(_ctx.stringValue("DescribeClusterResponse.Description"));
		describeClusterResponse.setMaintainTime(_ctx.stringValue("DescribeClusterResponse.MaintainTime"));
		describeClusterResponse.setStatus(_ctx.stringValue("DescribeClusterResponse.Status"));

		List<InternalPort> internalPorts = new ArrayList<InternalPort>();
		for (int i = 0; i < _ctx.lengthValue("DescribeClusterResponse.InternalPorts.Length"); i++) {
			InternalPort internalPort = new InternalPort();
			internalPort.setPlatform(_ctx.stringValue("DescribeClusterResponse.InternalPorts["+ i +"].Platform"));
			internalPort.setIpProtocol(_ctx.stringValue("DescribeClusterResponse.InternalPorts["+ i +"].IpProtocol"));

			List<String> port = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeClusterResponse.InternalPorts["+ i +"].Port.Length"); j++) {
				port.add(_ctx.stringValue("DescribeClusterResponse.InternalPorts["+ i +"].Port["+ j +"]"));
			}
			internalPort.setPort(port);

			internalPorts.add(internalPort);
		}
		describeClusterResponse.setInternalPorts(internalPorts);
	 
	 	return describeClusterResponse;
	}
}