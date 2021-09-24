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

import com.aliyuncs.mse.model.v20190531.DeleteNacosServiceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteNacosServiceResponseUnmarshaller {

	public static DeleteNacosServiceResponse unmarshall(DeleteNacosServiceResponse deleteNacosServiceResponse, UnmarshallerContext _ctx) {
		
		deleteNacosServiceResponse.setRequestId(_ctx.stringValue("DeleteNacosServiceResponse.RequestId"));
		deleteNacosServiceResponse.setHttpStatusCode(_ctx.integerValue("DeleteNacosServiceResponse.HttpStatusCode"));
		deleteNacosServiceResponse.setMessage(_ctx.stringValue("DeleteNacosServiceResponse.Message"));
		deleteNacosServiceResponse.setCode(_ctx.integerValue("DeleteNacosServiceResponse.Code"));
		deleteNacosServiceResponse.setSuccess(_ctx.booleanValue("DeleteNacosServiceResponse.Success"));
		deleteNacosServiceResponse.setData(_ctx.stringValue("DeleteNacosServiceResponse.Data"));
	 
	 	return deleteNacosServiceResponse;
	}
}