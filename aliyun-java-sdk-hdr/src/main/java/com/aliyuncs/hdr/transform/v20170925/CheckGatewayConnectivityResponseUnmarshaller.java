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

package com.aliyuncs.hdr.transform.v20170925;

import com.aliyuncs.hdr.model.v20170925.CheckGatewayConnectivityResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CheckGatewayConnectivityResponseUnmarshaller {

	public static CheckGatewayConnectivityResponse unmarshall(CheckGatewayConnectivityResponse checkGatewayConnectivityResponse, UnmarshallerContext _ctx) {
		
		checkGatewayConnectivityResponse.setRequestId(_ctx.stringValue("CheckGatewayConnectivityResponse.RequestId"));
		checkGatewayConnectivityResponse.setSuccess(_ctx.booleanValue("CheckGatewayConnectivityResponse.Success"));
		checkGatewayConnectivityResponse.setCode(_ctx.stringValue("CheckGatewayConnectivityResponse.Code"));
		checkGatewayConnectivityResponse.setMessage(_ctx.stringValue("CheckGatewayConnectivityResponse.Message"));
	 
	 	return checkGatewayConnectivityResponse;
	}
}