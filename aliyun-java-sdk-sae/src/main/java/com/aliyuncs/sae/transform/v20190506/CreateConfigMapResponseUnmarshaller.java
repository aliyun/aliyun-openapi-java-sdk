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

import com.aliyuncs.sae.model.v20190506.CreateConfigMapResponse;
import com.aliyuncs.sae.model.v20190506.CreateConfigMapResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateConfigMapResponseUnmarshaller {

	public static CreateConfigMapResponse unmarshall(CreateConfigMapResponse createConfigMapResponse, UnmarshallerContext _ctx) {
		
		createConfigMapResponse.setRequestId(_ctx.stringValue("CreateConfigMapResponse.RequestId"));
		createConfigMapResponse.setCode(_ctx.stringValue("CreateConfigMapResponse.Code"));
		createConfigMapResponse.setMessage(_ctx.stringValue("CreateConfigMapResponse.Message"));
		createConfigMapResponse.setErrorCode(_ctx.stringValue("CreateConfigMapResponse.ErrorCode"));
		createConfigMapResponse.setTraceId(_ctx.stringValue("CreateConfigMapResponse.TraceId"));
		createConfigMapResponse.setSuccess(_ctx.booleanValue("CreateConfigMapResponse.Success"));

		Data data = new Data();
		data.setConfigMapId(_ctx.longValue("CreateConfigMapResponse.Data.ConfigMapId"));
		createConfigMapResponse.setData(data);
	 
	 	return createConfigMapResponse;
	}
}