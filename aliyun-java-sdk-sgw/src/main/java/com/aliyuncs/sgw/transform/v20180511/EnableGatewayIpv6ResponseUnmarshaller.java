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

package com.aliyuncs.sgw.transform.v20180511;

import com.aliyuncs.sgw.model.v20180511.EnableGatewayIpv6Response;
import com.aliyuncs.transform.UnmarshallerContext;


public class EnableGatewayIpv6ResponseUnmarshaller {

	public static EnableGatewayIpv6Response unmarshall(EnableGatewayIpv6Response enableGatewayIpv6Response, UnmarshallerContext _ctx) {
		
		enableGatewayIpv6Response.setRequestId(_ctx.stringValue("EnableGatewayIpv6Response.RequestId"));
		enableGatewayIpv6Response.setSuccess(_ctx.booleanValue("EnableGatewayIpv6Response.Success"));
		enableGatewayIpv6Response.setCode(_ctx.stringValue("EnableGatewayIpv6Response.Code"));
		enableGatewayIpv6Response.setMessage(_ctx.stringValue("EnableGatewayIpv6Response.Message"));
		enableGatewayIpv6Response.setTaskId(_ctx.stringValue("EnableGatewayIpv6Response.TaskId"));
	 
	 	return enableGatewayIpv6Response;
	}
}