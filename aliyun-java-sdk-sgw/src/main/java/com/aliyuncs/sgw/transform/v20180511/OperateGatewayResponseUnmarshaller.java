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

import com.aliyuncs.sgw.model.v20180511.OperateGatewayResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class OperateGatewayResponseUnmarshaller {

	public static OperateGatewayResponse unmarshall(OperateGatewayResponse operateGatewayResponse, UnmarshallerContext _ctx) {
		
		operateGatewayResponse.setRequestId(_ctx.stringValue("OperateGatewayResponse.RequestId"));
		operateGatewayResponse.setSuccess(_ctx.booleanValue("OperateGatewayResponse.Success"));
		operateGatewayResponse.setCode(_ctx.stringValue("OperateGatewayResponse.Code"));
		operateGatewayResponse.setMessage(_ctx.stringValue("OperateGatewayResponse.Message"));
		operateGatewayResponse.setTaskId(_ctx.stringValue("OperateGatewayResponse.TaskId"));
		operateGatewayResponse.setBuyURL(_ctx.stringValue("OperateGatewayResponse.BuyURL"));
	 
	 	return operateGatewayResponse;
	}
}