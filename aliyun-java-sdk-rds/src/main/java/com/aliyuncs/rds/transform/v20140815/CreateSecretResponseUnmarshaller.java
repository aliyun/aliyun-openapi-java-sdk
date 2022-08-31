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

package com.aliyuncs.rds.transform.v20140815;

import com.aliyuncs.rds.model.v20140815.CreateSecretResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateSecretResponseUnmarshaller {

	public static CreateSecretResponse unmarshall(CreateSecretResponse createSecretResponse, UnmarshallerContext _ctx) {
		
		createSecretResponse.setRequestId(_ctx.stringValue("CreateSecretResponse.RequestId"));
		createSecretResponse.setSecretArn(_ctx.stringValue("CreateSecretResponse.SecretArn"));
		createSecretResponse.setSecretName(_ctx.stringValue("CreateSecretResponse.SecretName"));
		createSecretResponse.setSuccess(_ctx.booleanValue("CreateSecretResponse.Success"));
	 
	 	return createSecretResponse;
	}
}