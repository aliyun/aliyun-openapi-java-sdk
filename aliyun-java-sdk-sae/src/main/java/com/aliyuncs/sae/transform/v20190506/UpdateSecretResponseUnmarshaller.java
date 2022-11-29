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

import com.aliyuncs.sae.model.v20190506.UpdateSecretResponse;
import com.aliyuncs.sae.model.v20190506.UpdateSecretResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateSecretResponseUnmarshaller {

	public static UpdateSecretResponse unmarshall(UpdateSecretResponse updateSecretResponse, UnmarshallerContext _ctx) {
		
		updateSecretResponse.setRequestId(_ctx.stringValue("UpdateSecretResponse.RequestId"));
		updateSecretResponse.setMessage(_ctx.stringValue("UpdateSecretResponse.Message"));
		updateSecretResponse.setTraceId(_ctx.stringValue("UpdateSecretResponse.TraceId"));
		updateSecretResponse.setErrorCode(_ctx.stringValue("UpdateSecretResponse.ErrorCode"));
		updateSecretResponse.setCode(_ctx.stringValue("UpdateSecretResponse.Code"));
		updateSecretResponse.setSuccess(_ctx.booleanValue("UpdateSecretResponse.Success"));

		Data data = new Data();
		data.setSecretId(_ctx.stringValue("UpdateSecretResponse.Data.SecretId"));
		updateSecretResponse.setData(data);
	 
	 	return updateSecretResponse;
	}
}