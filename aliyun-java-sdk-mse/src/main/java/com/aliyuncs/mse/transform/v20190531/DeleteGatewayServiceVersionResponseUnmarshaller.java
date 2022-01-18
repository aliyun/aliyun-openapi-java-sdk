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

import com.aliyuncs.mse.model.v20190531.DeleteGatewayServiceVersionResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteGatewayServiceVersionResponseUnmarshaller {

	public static DeleteGatewayServiceVersionResponse unmarshall(DeleteGatewayServiceVersionResponse deleteGatewayServiceVersionResponse, UnmarshallerContext _ctx) {
		
		deleteGatewayServiceVersionResponse.setRequestId(_ctx.stringValue("DeleteGatewayServiceVersionResponse.RequestId"));
		deleteGatewayServiceVersionResponse.setHttpStatusCode(_ctx.integerValue("DeleteGatewayServiceVersionResponse.HttpStatusCode"));
		deleteGatewayServiceVersionResponse.setMessage(_ctx.stringValue("DeleteGatewayServiceVersionResponse.Message"));
		deleteGatewayServiceVersionResponse.setCode(_ctx.integerValue("DeleteGatewayServiceVersionResponse.Code"));
		deleteGatewayServiceVersionResponse.setSuccess(_ctx.booleanValue("DeleteGatewayServiceVersionResponse.Success"));
		deleteGatewayServiceVersionResponse.setData(_ctx.longValue("DeleteGatewayServiceVersionResponse.Data"));
	 
	 	return deleteGatewayServiceVersionResponse;
	}
}