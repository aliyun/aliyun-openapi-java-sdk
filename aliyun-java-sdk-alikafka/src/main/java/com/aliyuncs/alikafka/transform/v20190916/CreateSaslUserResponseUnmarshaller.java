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

package com.aliyuncs.alikafka.transform.v20190916;

import com.aliyuncs.alikafka.model.v20190916.CreateSaslUserResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateSaslUserResponseUnmarshaller {

	public static CreateSaslUserResponse unmarshall(CreateSaslUserResponse createSaslUserResponse, UnmarshallerContext _ctx) {
		
		createSaslUserResponse.setRequestId(_ctx.stringValue("CreateSaslUserResponse.RequestId"));
		createSaslUserResponse.setSuccess(_ctx.booleanValue("CreateSaslUserResponse.Success"));
		createSaslUserResponse.setCode(_ctx.integerValue("CreateSaslUserResponse.Code"));
		createSaslUserResponse.setMessage(_ctx.stringValue("CreateSaslUserResponse.Message"));
	 
	 	return createSaslUserResponse;
	}
}