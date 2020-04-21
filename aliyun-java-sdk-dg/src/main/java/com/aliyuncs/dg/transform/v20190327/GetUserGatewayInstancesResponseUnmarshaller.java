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

package com.aliyuncs.dg.transform.v20190327;

import com.aliyuncs.dg.model.v20190327.GetUserGatewayInstancesResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetUserGatewayInstancesResponseUnmarshaller {

	public static GetUserGatewayInstancesResponse unmarshall(GetUserGatewayInstancesResponse getUserGatewayInstancesResponse, UnmarshallerContext _ctx) {
		
		getUserGatewayInstancesResponse.setRequestId(_ctx.stringValue("GetUserGatewayInstancesResponse.RequestId"));
		getUserGatewayInstancesResponse.setSuccess(_ctx.booleanValue("GetUserGatewayInstancesResponse.Success"));
		getUserGatewayInstancesResponse.setCode(_ctx.stringValue("GetUserGatewayInstancesResponse.Code"));
		getUserGatewayInstancesResponse.setErrorMsg(_ctx.stringValue("GetUserGatewayInstancesResponse.ErrorMsg"));
		getUserGatewayInstancesResponse.setData(_ctx.stringValue("GetUserGatewayInstancesResponse.Data"));
	 
	 	return getUserGatewayInstancesResponse;
	}
}