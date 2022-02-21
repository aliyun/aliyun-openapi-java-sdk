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

package com.aliyuncs.mse.transform.v20190531;

import com.aliyuncs.mse.model.v20190531.DeleteGatewaySlbResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteGatewaySlbResponseUnmarshaller {

	public static DeleteGatewaySlbResponse unmarshall(DeleteGatewaySlbResponse deleteGatewaySlbResponse, UnmarshallerContext _ctx) {
		
		deleteGatewaySlbResponse.setRequestId(_ctx.stringValue("DeleteGatewaySlbResponse.RequestId"));
		deleteGatewaySlbResponse.setHttpStatusCode(_ctx.integerValue("DeleteGatewaySlbResponse.HttpStatusCode"));
		deleteGatewaySlbResponse.setMessage(_ctx.stringValue("DeleteGatewaySlbResponse.Message"));
		deleteGatewaySlbResponse.setCode(_ctx.integerValue("DeleteGatewaySlbResponse.Code"));
		deleteGatewaySlbResponse.setSuccess(_ctx.booleanValue("DeleteGatewaySlbResponse.Success"));
		deleteGatewaySlbResponse.setData(_ctx.stringValue("DeleteGatewaySlbResponse.Data"));
	 
	 	return deleteGatewaySlbResponse;
	}
}