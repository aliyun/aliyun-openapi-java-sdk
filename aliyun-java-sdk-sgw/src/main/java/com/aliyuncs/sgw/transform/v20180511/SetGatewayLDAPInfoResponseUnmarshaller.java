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

import com.aliyuncs.sgw.model.v20180511.SetGatewayLDAPInfoResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SetGatewayLDAPInfoResponseUnmarshaller {

	public static SetGatewayLDAPInfoResponse unmarshall(SetGatewayLDAPInfoResponse setGatewayLDAPInfoResponse, UnmarshallerContext _ctx) {
		
		setGatewayLDAPInfoResponse.setRequestId(_ctx.stringValue("SetGatewayLDAPInfoResponse.RequestId"));
		setGatewayLDAPInfoResponse.setSuccess(_ctx.booleanValue("SetGatewayLDAPInfoResponse.Success"));
		setGatewayLDAPInfoResponse.setCode(_ctx.stringValue("SetGatewayLDAPInfoResponse.Code"));
		setGatewayLDAPInfoResponse.setMessage(_ctx.stringValue("SetGatewayLDAPInfoResponse.Message"));
		setGatewayLDAPInfoResponse.setTaskId(_ctx.stringValue("SetGatewayLDAPInfoResponse.TaskId"));
	 
	 	return setGatewayLDAPInfoResponse;
	}
}