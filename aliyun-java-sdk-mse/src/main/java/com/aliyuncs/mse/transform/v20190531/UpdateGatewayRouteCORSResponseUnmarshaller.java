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

import com.aliyuncs.mse.model.v20190531.UpdateGatewayRouteCORSResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateGatewayRouteCORSResponseUnmarshaller {

	public static UpdateGatewayRouteCORSResponse unmarshall(UpdateGatewayRouteCORSResponse updateGatewayRouteCORSResponse, UnmarshallerContext _ctx) {
		
		updateGatewayRouteCORSResponse.setRequestId(_ctx.stringValue("UpdateGatewayRouteCORSResponse.RequestId"));
		updateGatewayRouteCORSResponse.setHttpStatusCode(_ctx.integerValue("UpdateGatewayRouteCORSResponse.HttpStatusCode"));
		updateGatewayRouteCORSResponse.setMessage(_ctx.stringValue("UpdateGatewayRouteCORSResponse.Message"));
		updateGatewayRouteCORSResponse.setCode(_ctx.integerValue("UpdateGatewayRouteCORSResponse.Code"));
		updateGatewayRouteCORSResponse.setSuccess(_ctx.booleanValue("UpdateGatewayRouteCORSResponse.Success"));
		updateGatewayRouteCORSResponse.setData(_ctx.longValue("UpdateGatewayRouteCORSResponse.Data"));
	 
	 	return updateGatewayRouteCORSResponse;
	}
}