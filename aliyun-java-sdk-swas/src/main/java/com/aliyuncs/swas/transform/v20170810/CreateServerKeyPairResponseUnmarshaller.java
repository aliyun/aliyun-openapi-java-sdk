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

package com.aliyuncs.swas.transform.v20170810;

import com.aliyuncs.swas.model.v20170810.CreateServerKeyPairResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateServerKeyPairResponseUnmarshaller {

	public static CreateServerKeyPairResponse unmarshall(CreateServerKeyPairResponse createServerKeyPairResponse, UnmarshallerContext _ctx) {
		
		createServerKeyPairResponse.setRequestId(_ctx.stringValue("CreateServerKeyPairResponse.RequestId"));
		createServerKeyPairResponse.setIsSuccess(_ctx.booleanValue("CreateServerKeyPairResponse.IsSuccess"));
		createServerKeyPairResponse.setPrivateKey(_ctx.stringValue("CreateServerKeyPairResponse.PrivateKey"));
		createServerKeyPairResponse.setCode(_ctx.stringValue("CreateServerKeyPairResponse.Code"));
		createServerKeyPairResponse.setName(_ctx.stringValue("CreateServerKeyPairResponse.Name"));
	 
	 	return createServerKeyPairResponse;
	}
}