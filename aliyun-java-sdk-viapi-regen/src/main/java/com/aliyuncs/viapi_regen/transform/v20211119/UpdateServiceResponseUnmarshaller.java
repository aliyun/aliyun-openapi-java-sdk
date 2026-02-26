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

package com.aliyuncs.viapi_regen.transform.v20211119;

import com.aliyuncs.viapi_regen.model.v20211119.UpdateServiceResponse;
import com.aliyuncs.viapi_regen.model.v20211119.UpdateServiceResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateServiceResponseUnmarshaller {

	public static UpdateServiceResponse unmarshall(UpdateServiceResponse updateServiceResponse, UnmarshallerContext _ctx) {
		
		updateServiceResponse.setRequestId(_ctx.stringValue("UpdateServiceResponse.RequestId"));
		updateServiceResponse.setMessage(_ctx.stringValue("UpdateServiceResponse.Message"));
		updateServiceResponse.setCode(_ctx.stringValue("UpdateServiceResponse.Code"));

		Data data = new Data();
		data.setId(_ctx.longValue("UpdateServiceResponse.Data.Id"));
		data.setGmtCreate(_ctx.longValue("UpdateServiceResponse.Data.GmtCreate"));
		data.setServiceName(_ctx.stringValue("UpdateServiceResponse.Data.ServiceName"));
		data.setServiceDescription(_ctx.stringValue("UpdateServiceResponse.Data.ServiceDescription"));
		data.setAuthorizationType(_ctx.stringValue("UpdateServiceResponse.Data.AuthorizationType"));
		data.setAuthorizedAccount(_ctx.stringValue("UpdateServiceResponse.Data.AuthorizedAccount"));
		updateServiceResponse.setData(data);
	 
	 	return updateServiceResponse;
	}
}