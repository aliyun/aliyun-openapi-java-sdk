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

package com.aliyuncs.uisplus.transform.v20200707;

import com.aliyuncs.uisplus.model.v20200707.DescribeGreConnectionResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeGreConnectionResponseUnmarshaller {

	public static DescribeGreConnectionResponse unmarshall(DescribeGreConnectionResponse describeGreConnectionResponse, UnmarshallerContext _ctx) {
		
		describeGreConnectionResponse.setRequestId(_ctx.stringValue("DescribeGreConnectionResponse.RequestId"));
		describeGreConnectionResponse.setUisId(_ctx.stringValue("DescribeGreConnectionResponse.UisId"));
		describeGreConnectionResponse.setState(_ctx.stringValue("DescribeGreConnectionResponse.State"));
		describeGreConnectionResponse.setCreateTime(_ctx.longValue("DescribeGreConnectionResponse.CreateTime"));
		describeGreConnectionResponse.setUisName(_ctx.stringValue("DescribeGreConnectionResponse.UisName"));
		describeGreConnectionResponse.setGreConnectionId(_ctx.stringValue("DescribeGreConnectionResponse.GreConnectionId"));
		describeGreConnectionResponse.setCustomerIp(_ctx.stringValue("DescribeGreConnectionResponse.CustomerIp"));
		describeGreConnectionResponse.setCustomerTunnelIp(_ctx.stringValue("DescribeGreConnectionResponse.CustomerTunnelIp"));
		describeGreConnectionResponse.setLocalTunnelIp(_ctx.stringValue("DescribeGreConnectionResponse.LocalTunnelIp"));
		describeGreConnectionResponse.setCidrs(_ctx.stringValue("DescribeGreConnectionResponse.Cidrs"));
		describeGreConnectionResponse.setDescription(_ctx.stringValue("DescribeGreConnectionResponse.Description"));
		describeGreConnectionResponse.setName(_ctx.stringValue("DescribeGreConnectionResponse.Name"));
		describeGreConnectionResponse.setLocalIp(_ctx.stringValue("DescribeGreConnectionResponse.LocalIp"));
	 
	 	return describeGreConnectionResponse;
	}
}