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

import com.aliyuncs.mse.model.v20190531.UpdatePluginConfigResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdatePluginConfigResponseUnmarshaller {

	public static UpdatePluginConfigResponse unmarshall(UpdatePluginConfigResponse updatePluginConfigResponse, UnmarshallerContext _ctx) {
		
		updatePluginConfigResponse.setRequestId(_ctx.stringValue("UpdatePluginConfigResponse.RequestId"));
		updatePluginConfigResponse.setSuccess(_ctx.booleanValue("UpdatePluginConfigResponse.Success"));
		updatePluginConfigResponse.setCode(_ctx.integerValue("UpdatePluginConfigResponse.Code"));
		updatePluginConfigResponse.setErrorCode(_ctx.stringValue("UpdatePluginConfigResponse.ErrorCode"));
		updatePluginConfigResponse.setHttpStatusCode(_ctx.integerValue("UpdatePluginConfigResponse.HttpStatusCode"));
		updatePluginConfigResponse.setMessage(_ctx.stringValue("UpdatePluginConfigResponse.Message"));
		updatePluginConfigResponse.setDynamicMessage(_ctx.stringValue("UpdatePluginConfigResponse.DynamicMessage"));
		updatePluginConfigResponse.setData(_ctx.longValue("UpdatePluginConfigResponse.Data"));
	 
	 	return updatePluginConfigResponse;
	}
}