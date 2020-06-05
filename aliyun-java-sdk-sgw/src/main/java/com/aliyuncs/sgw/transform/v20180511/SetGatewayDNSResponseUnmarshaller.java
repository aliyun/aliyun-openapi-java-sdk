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

import com.aliyuncs.sgw.model.v20180511.SetGatewayDNSResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SetGatewayDNSResponseUnmarshaller {

	public static SetGatewayDNSResponse unmarshall(SetGatewayDNSResponse setGatewayDNSResponse, UnmarshallerContext _ctx) {
		
		setGatewayDNSResponse.setRequestId(_ctx.stringValue("SetGatewayDNSResponse.RequestId"));
		setGatewayDNSResponse.setSuccess(_ctx.booleanValue("SetGatewayDNSResponse.Success"));
		setGatewayDNSResponse.setCode(_ctx.stringValue("SetGatewayDNSResponse.Code"));
		setGatewayDNSResponse.setMessage(_ctx.stringValue("SetGatewayDNSResponse.Message"));
		setGatewayDNSResponse.setTaskId(_ctx.stringValue("SetGatewayDNSResponse.TaskId"));
	 
	 	return setGatewayDNSResponse;
	}
}