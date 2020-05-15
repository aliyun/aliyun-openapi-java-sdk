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

package com.aliyuncs.aliyuncvc.transform.v20200330;

import com.aliyuncs.aliyuncvc.model.v20200330.CreateEvaluationResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateEvaluationResponseUnmarshaller {

	public static CreateEvaluationResponse unmarshall(CreateEvaluationResponse createEvaluationResponse, UnmarshallerContext _ctx) {
		
		createEvaluationResponse.setRequestId(_ctx.stringValue("CreateEvaluationResponse.RequestId"));
		createEvaluationResponse.setSuccess(_ctx.booleanValue("CreateEvaluationResponse.Success"));
		createEvaluationResponse.setErrorCode(_ctx.stringValue("CreateEvaluationResponse.ErrorCode"));
		createEvaluationResponse.setMessage(_ctx.stringValue("CreateEvaluationResponse.Message"));
	 
	 	return createEvaluationResponse;
	}
}