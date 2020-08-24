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

package com.aliyuncs.linkvisual.transform.v20180120;

import com.aliyuncs.linkvisual.model.v20180120.CreateAIAppResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateAIAppResponseUnmarshaller {

	public static CreateAIAppResponse unmarshall(CreateAIAppResponse createAIAppResponse, UnmarshallerContext _ctx) {
		
		createAIAppResponse.setRequestId(_ctx.stringValue("CreateAIAppResponse.RequestId"));
		createAIAppResponse.setSuccess(_ctx.booleanValue("CreateAIAppResponse.Success"));
		createAIAppResponse.setErrorMessage(_ctx.stringValue("CreateAIAppResponse.ErrorMessage"));
		createAIAppResponse.setCode(_ctx.stringValue("CreateAIAppResponse.Code"));
		createAIAppResponse.setData(_ctx.stringValue("CreateAIAppResponse.Data"));
	 
	 	return createAIAppResponse;
	}
}