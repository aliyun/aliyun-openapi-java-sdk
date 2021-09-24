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

import com.aliyuncs.mse.model.v20190531.DeleteNacosConfigResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteNacosConfigResponseUnmarshaller {

	public static DeleteNacosConfigResponse unmarshall(DeleteNacosConfigResponse deleteNacosConfigResponse, UnmarshallerContext _ctx) {
		
		deleteNacosConfigResponse.setRequestId(_ctx.stringValue("DeleteNacosConfigResponse.RequestId"));
		deleteNacosConfigResponse.setHttpCode(_ctx.stringValue("DeleteNacosConfigResponse.HttpCode"));
		deleteNacosConfigResponse.setMessage(_ctx.stringValue("DeleteNacosConfigResponse.Message"));
		deleteNacosConfigResponse.setErrorCode(_ctx.stringValue("DeleteNacosConfigResponse.ErrorCode"));
		deleteNacosConfigResponse.setCode(_ctx.stringValue("DeleteNacosConfigResponse.Code"));
		deleteNacosConfigResponse.setSuccess(_ctx.booleanValue("DeleteNacosConfigResponse.Success"));
	 
	 	return deleteNacosConfigResponse;
	}
}