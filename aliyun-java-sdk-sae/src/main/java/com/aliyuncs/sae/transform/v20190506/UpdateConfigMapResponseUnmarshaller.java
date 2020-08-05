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

package com.aliyuncs.sae.transform.v20190506;

import com.aliyuncs.sae.model.v20190506.UpdateConfigMapResponse;
import com.aliyuncs.sae.model.v20190506.UpdateConfigMapResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateConfigMapResponseUnmarshaller {

	public static UpdateConfigMapResponse unmarshall(UpdateConfigMapResponse updateConfigMapResponse, UnmarshallerContext _ctx) {
		
		updateConfigMapResponse.setRequestId(_ctx.stringValue("UpdateConfigMapResponse.RequestId"));
		updateConfigMapResponse.setCode(_ctx.stringValue("UpdateConfigMapResponse.Code"));
		updateConfigMapResponse.setMessage(_ctx.stringValue("UpdateConfigMapResponse.Message"));
		updateConfigMapResponse.setErrorCode(_ctx.stringValue("UpdateConfigMapResponse.ErrorCode"));
		updateConfigMapResponse.setTraceId(_ctx.stringValue("UpdateConfigMapResponse.TraceId"));
		updateConfigMapResponse.setSuccess(_ctx.booleanValue("UpdateConfigMapResponse.Success"));

		Data data = new Data();
		data.setConfigMapId(_ctx.stringValue("UpdateConfigMapResponse.Data.ConfigMapId"));
		updateConfigMapResponse.setData(data);
	 
	 	return updateConfigMapResponse;
	}
}