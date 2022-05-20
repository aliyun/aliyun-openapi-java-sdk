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

package com.aliyuncs.das.transform.v20200116;

import com.aliyuncs.das.model.v20200116.DeleteStopGatewayResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteStopGatewayResponseUnmarshaller {

	public static DeleteStopGatewayResponse unmarshall(DeleteStopGatewayResponse deleteStopGatewayResponse, UnmarshallerContext _ctx) {
		
		deleteStopGatewayResponse.setRequestId(_ctx.stringValue("DeleteStopGatewayResponse.RequestId"));
		deleteStopGatewayResponse.setCode(_ctx.stringValue("DeleteStopGatewayResponse.Code"));
		deleteStopGatewayResponse.setMessage(_ctx.stringValue("DeleteStopGatewayResponse.Message"));
		deleteStopGatewayResponse.setData(_ctx.stringValue("DeleteStopGatewayResponse.Data"));
		deleteStopGatewayResponse.setSuccess(_ctx.stringValue("DeleteStopGatewayResponse.Success"));
	 
	 	return deleteStopGatewayResponse;
	}
}