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

import com.aliyuncs.mse.model.v20190531.UpdateNacosConfigResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateNacosConfigResponseUnmarshaller {

	public static UpdateNacosConfigResponse unmarshall(UpdateNacosConfigResponse updateNacosConfigResponse, UnmarshallerContext _ctx) {
		
		updateNacosConfigResponse.setRequestId(_ctx.stringValue("UpdateNacosConfigResponse.RequestId"));
		updateNacosConfigResponse.setHttpCode(_ctx.stringValue("UpdateNacosConfigResponse.HttpCode"));
		updateNacosConfigResponse.setMessage(_ctx.stringValue("UpdateNacosConfigResponse.Message"));
		updateNacosConfigResponse.setErrorCode(_ctx.stringValue("UpdateNacosConfigResponse.ErrorCode"));
		updateNacosConfigResponse.setSuccess(_ctx.booleanValue("UpdateNacosConfigResponse.Success"));
	 
	 	return updateNacosConfigResponse;
	}
}