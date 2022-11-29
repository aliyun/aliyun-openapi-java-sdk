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

import com.aliyuncs.sae.model.v20190506.CreateSecretResponse;
import com.aliyuncs.sae.model.v20190506.CreateSecretResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateSecretResponseUnmarshaller {

	public static CreateSecretResponse unmarshall(CreateSecretResponse createSecretResponse, UnmarshallerContext _ctx) {
		
		createSecretResponse.setRequestId(_ctx.stringValue("CreateSecretResponse.RequestId"));
		createSecretResponse.setMessage(_ctx.stringValue("CreateSecretResponse.Message"));
		createSecretResponse.setTraceId(_ctx.stringValue("CreateSecretResponse.TraceId"));
		createSecretResponse.setErrorCode(_ctx.stringValue("CreateSecretResponse.ErrorCode"));
		createSecretResponse.setCode(_ctx.stringValue("CreateSecretResponse.Code"));
		createSecretResponse.setSuccess(_ctx.booleanValue("CreateSecretResponse.Success"));

		Data data = new Data();
		data.setSecretId(_ctx.longValue("CreateSecretResponse.Data.SecretId"));
		createSecretResponse.setData(data);
	 
	 	return createSecretResponse;
	}
}