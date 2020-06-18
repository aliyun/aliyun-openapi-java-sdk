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

package com.aliyuncs.aliyuncvc.transform.v20190919;

import com.aliyuncs.aliyuncvc.model.v20190919.CreateUserEvaluationsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateUserEvaluationsResponseUnmarshaller {

	public static CreateUserEvaluationsResponse unmarshall(CreateUserEvaluationsResponse createUserEvaluationsResponse, UnmarshallerContext _ctx) {
		
		createUserEvaluationsResponse.setRequestId(_ctx.stringValue("CreateUserEvaluationsResponse.RequestId"));
		createUserEvaluationsResponse.setSuccess(_ctx.booleanValue("CreateUserEvaluationsResponse.Success"));
		createUserEvaluationsResponse.setErrorCode(_ctx.stringValue("CreateUserEvaluationsResponse.ErrorCode"));
		createUserEvaluationsResponse.setMessage(_ctx.stringValue("CreateUserEvaluationsResponse.Message"));
	 
	 	return createUserEvaluationsResponse;
	}
}