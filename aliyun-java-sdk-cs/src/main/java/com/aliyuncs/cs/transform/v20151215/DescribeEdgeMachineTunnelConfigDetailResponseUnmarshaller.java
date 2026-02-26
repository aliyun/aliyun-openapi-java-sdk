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

package com.aliyuncs.cs.transform.v20151215;

import com.aliyuncs.cs.model.v20151215.DescribeEdgeMachineTunnelConfigDetailResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeEdgeMachineTunnelConfigDetailResponseUnmarshaller {

	public static DescribeEdgeMachineTunnelConfigDetailResponse unmarshall(DescribeEdgeMachineTunnelConfigDetailResponse describeEdgeMachineTunnelConfigDetailResponse, UnmarshallerContext _ctx) {
		
		describeEdgeMachineTunnelConfigDetailResponse.setModel(_ctx.stringValue("DescribeEdgeMachineTunnelConfigDetailResponse.model"));
		describeEdgeMachineTunnelConfigDetailResponse.setSn(_ctx.stringValue("DescribeEdgeMachineTunnelConfigDetailResponse.sn"));
		describeEdgeMachineTunnelConfigDetailResponse.setTunnel_endpoint(_ctx.stringValue("DescribeEdgeMachineTunnelConfigDetailResponse.tunnel_endpoint"));
		describeEdgeMachineTunnelConfigDetailResponse.setToken(_ctx.stringValue("DescribeEdgeMachineTunnelConfigDetailResponse.token"));
		describeEdgeMachineTunnelConfigDetailResponse.setProduct_key(_ctx.stringValue("DescribeEdgeMachineTunnelConfigDetailResponse.product_key"));
		describeEdgeMachineTunnelConfigDetailResponse.setDevice_name(_ctx.stringValue("DescribeEdgeMachineTunnelConfigDetailResponse.device_name"));
		describeEdgeMachineTunnelConfigDetailResponse.setRequest_id(_ctx.stringValue("DescribeEdgeMachineTunnelConfigDetailResponse.request_id"));
	 
	 	return describeEdgeMachineTunnelConfigDetailResponse;
	}
}