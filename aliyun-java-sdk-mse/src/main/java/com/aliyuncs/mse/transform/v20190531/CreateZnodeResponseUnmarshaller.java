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

import com.aliyuncs.mse.model.v20190531.CreateZnodeResponse;
import com.aliyuncs.mse.model.v20190531.CreateZnodeResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateZnodeResponseUnmarshaller {

	public static CreateZnodeResponse unmarshall(CreateZnodeResponse createZnodeResponse, UnmarshallerContext _ctx) {
		
		createZnodeResponse.setRequestId(_ctx.stringValue("CreateZnodeResponse.RequestId"));
		createZnodeResponse.setSuccess(_ctx.booleanValue("CreateZnodeResponse.Success"));
		createZnodeResponse.setMessage(_ctx.stringValue("CreateZnodeResponse.Message"));
		createZnodeResponse.setErrorCode(_ctx.stringValue("CreateZnodeResponse.ErrorCode"));
		createZnodeResponse.setHttpCode(_ctx.stringValue("CreateZnodeResponse.HttpCode"));

		Data data = new Data();
		data.setPath(_ctx.stringValue("CreateZnodeResponse.Data.Path"));
		data.setName(_ctx.stringValue("CreateZnodeResponse.Data.Name"));
		data.setData(_ctx.stringValue("CreateZnodeResponse.Data.Data"));
		data.setDir(_ctx.booleanValue("CreateZnodeResponse.Data.Dir"));
		createZnodeResponse.setData(data);
	 
	 	return createZnodeResponse;
	}
}