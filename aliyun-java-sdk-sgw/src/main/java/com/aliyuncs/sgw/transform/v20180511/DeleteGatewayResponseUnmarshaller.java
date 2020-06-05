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

import com.aliyuncs.sgw.model.v20180511.DeleteGatewayResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteGatewayResponseUnmarshaller {

	public static DeleteGatewayResponse unmarshall(DeleteGatewayResponse deleteGatewayResponse, UnmarshallerContext _ctx) {
		
		deleteGatewayResponse.setRequestId(_ctx.stringValue("DeleteGatewayResponse.RequestId"));
		deleteGatewayResponse.setSuccess(_ctx.booleanValue("DeleteGatewayResponse.Success"));
		deleteGatewayResponse.setCode(_ctx.stringValue("DeleteGatewayResponse.Code"));
		deleteGatewayResponse.setMessage(_ctx.stringValue("DeleteGatewayResponse.Message"));
		deleteGatewayResponse.setTaskId(_ctx.stringValue("DeleteGatewayResponse.TaskId"));
	 
	 	return deleteGatewayResponse;
	}
}