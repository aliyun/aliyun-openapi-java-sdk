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

import com.aliyuncs.mse.model.v20190531.UpdateNacosInstanceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateNacosInstanceResponseUnmarshaller {

	public static UpdateNacosInstanceResponse unmarshall(UpdateNacosInstanceResponse updateNacosInstanceResponse, UnmarshallerContext _ctx) {
		
		updateNacosInstanceResponse.setRequestId(_ctx.stringValue("UpdateNacosInstanceResponse.RequestId"));
		updateNacosInstanceResponse.setMessage(_ctx.stringValue("UpdateNacosInstanceResponse.Message"));
		updateNacosInstanceResponse.setHttpStatusCode(_ctx.integerValue("UpdateNacosInstanceResponse.HttpStatusCode"));
		updateNacosInstanceResponse.setData(_ctx.stringValue("UpdateNacosInstanceResponse.Data"));
		updateNacosInstanceResponse.setCode(_ctx.integerValue("UpdateNacosInstanceResponse.Code"));
		updateNacosInstanceResponse.setSuccess(_ctx.booleanValue("UpdateNacosInstanceResponse.Success"));
	 
	 	return updateNacosInstanceResponse;
	}
}