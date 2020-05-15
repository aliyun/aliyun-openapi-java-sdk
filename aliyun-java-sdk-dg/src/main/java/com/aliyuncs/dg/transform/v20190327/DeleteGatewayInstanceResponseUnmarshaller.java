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

import com.aliyuncs.dg.model.v20190327.DeleteGatewayInstanceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteGatewayInstanceResponseUnmarshaller {

	public static DeleteGatewayInstanceResponse unmarshall(DeleteGatewayInstanceResponse deleteGatewayInstanceResponse, UnmarshallerContext _ctx) {
		
		deleteGatewayInstanceResponse.setRequestId(_ctx.stringValue("DeleteGatewayInstanceResponse.RequestId"));
		deleteGatewayInstanceResponse.setSuccess(_ctx.booleanValue("DeleteGatewayInstanceResponse.Success"));
		deleteGatewayInstanceResponse.setCode(_ctx.stringValue("DeleteGatewayInstanceResponse.Code"));
		deleteGatewayInstanceResponse.setErrorMsg(_ctx.stringValue("DeleteGatewayInstanceResponse.ErrorMsg"));
		deleteGatewayInstanceResponse.setData(_ctx.stringValue("DeleteGatewayInstanceResponse.Data"));
	 
	 	return deleteGatewayInstanceResponse;
	}
}