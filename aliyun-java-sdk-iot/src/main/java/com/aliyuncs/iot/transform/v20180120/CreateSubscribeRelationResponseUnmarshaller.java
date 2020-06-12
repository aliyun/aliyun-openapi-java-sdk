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

package com.aliyuncs.iot.transform.v20180120;

import com.aliyuncs.iot.model.v20180120.CreateSubscribeRelationResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateSubscribeRelationResponseUnmarshaller {

	public static CreateSubscribeRelationResponse unmarshall(CreateSubscribeRelationResponse createSubscribeRelationResponse, UnmarshallerContext _ctx) {
		
		createSubscribeRelationResponse.setRequestId(_ctx.stringValue("CreateSubscribeRelationResponse.RequestId"));
		createSubscribeRelationResponse.setSuccess(_ctx.booleanValue("CreateSubscribeRelationResponse.Success"));
		createSubscribeRelationResponse.setCode(_ctx.stringValue("CreateSubscribeRelationResponse.Code"));
		createSubscribeRelationResponse.setErrorMessage(_ctx.stringValue("CreateSubscribeRelationResponse.ErrorMessage"));
	 
	 	return createSubscribeRelationResponse;
	}
}