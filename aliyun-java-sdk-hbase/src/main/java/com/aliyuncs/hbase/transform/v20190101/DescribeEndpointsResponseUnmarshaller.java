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

package com.aliyuncs.hbase.transform.v20190101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.hbase.model.v20190101.DescribeEndpointsResponse;
import com.aliyuncs.hbase.model.v20190101.DescribeEndpointsResponse.ConnAddrInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeEndpointsResponseUnmarshaller {

	public static DescribeEndpointsResponse unmarshall(DescribeEndpointsResponse describeEndpointsResponse, UnmarshallerContext _ctx) {
		
		describeEndpointsResponse.setRequestId(_ctx.stringValue("DescribeEndpointsResponse.RequestId"));
		describeEndpointsResponse.setNetType(_ctx.stringValue("DescribeEndpointsResponse.NetType"));
		describeEndpointsResponse.setVpcId(_ctx.stringValue("DescribeEndpointsResponse.VpcId"));
		describeEndpointsResponse.setVSwitchId(_ctx.stringValue("DescribeEndpointsResponse.VSwitchId"));
		describeEndpointsResponse.setEngine(_ctx.stringValue("DescribeEndpointsResponse.Engine"));

		List<ConnAddrInfo> connAddrs = new ArrayList<ConnAddrInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeEndpointsResponse.ConnAddrs.Length"); i++) {
			ConnAddrInfo connAddrInfo = new ConnAddrInfo();
			connAddrInfo.setConnType(_ctx.stringValue("DescribeEndpointsResponse.ConnAddrs["+ i +"].ConnType"));
			connAddrInfo.setConnAddr(_ctx.stringValue("DescribeEndpointsResponse.ConnAddrs["+ i +"].ConnAddr"));
			connAddrInfo.setConnAddrPort(_ctx.stringValue("DescribeEndpointsResponse.ConnAddrs["+ i +"].ConnAddrPort"));
			connAddrInfo.setNetType(_ctx.stringValue("DescribeEndpointsResponse.ConnAddrs["+ i +"].NetType"));

			connAddrs.add(connAddrInfo);
		}
		describeEndpointsResponse.setConnAddrs(connAddrs);
	 
	 	return describeEndpointsResponse;
	}
}