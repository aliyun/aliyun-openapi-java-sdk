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

package com.aliyuncs.ddoscoo.transform.v20200101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ddoscoo.model.v20200101.DescribeWebCustomPortsResponse;
import com.aliyuncs.ddoscoo.model.v20200101.DescribeWebCustomPortsResponse.WebCustomPort;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeWebCustomPortsResponseUnmarshaller {

	public static DescribeWebCustomPortsResponse unmarshall(DescribeWebCustomPortsResponse describeWebCustomPortsResponse, UnmarshallerContext _ctx) {
		
		describeWebCustomPortsResponse.setRequestId(_ctx.stringValue("DescribeWebCustomPortsResponse.RequestId"));

		List<WebCustomPort> webCustomPorts = new ArrayList<WebCustomPort>();
		for (int i = 0; i < _ctx.lengthValue("DescribeWebCustomPortsResponse.WebCustomPorts.Length"); i++) {
			WebCustomPort webCustomPort = new WebCustomPort();
			webCustomPort.setProxyType(_ctx.stringValue("DescribeWebCustomPortsResponse.WebCustomPorts["+ i +"].ProxyType"));

			List<String> proxyPorts = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeWebCustomPortsResponse.WebCustomPorts["+ i +"].ProxyPorts.Length"); j++) {
				proxyPorts.add(_ctx.stringValue("DescribeWebCustomPortsResponse.WebCustomPorts["+ i +"].ProxyPorts["+ j +"]"));
			}
			webCustomPort.setProxyPorts(proxyPorts);

			webCustomPorts.add(webCustomPort);
		}
		describeWebCustomPortsResponse.setWebCustomPorts(webCustomPorts);
	 
	 	return describeWebCustomPortsResponse;
	}
}