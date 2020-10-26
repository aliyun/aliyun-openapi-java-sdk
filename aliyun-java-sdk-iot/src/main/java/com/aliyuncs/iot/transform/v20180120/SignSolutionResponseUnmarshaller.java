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

import com.aliyuncs.iot.model.v20180120.SignSolutionResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SignSolutionResponseUnmarshaller {

	public static SignSolutionResponse unmarshall(SignSolutionResponse signSolutionResponse, UnmarshallerContext _ctx) {
		
		signSolutionResponse.setRequestId(_ctx.stringValue("SignSolutionResponse.RequestId"));
		signSolutionResponse.setSuccess(_ctx.booleanValue("SignSolutionResponse.Success"));
		signSolutionResponse.setCode(_ctx.stringValue("SignSolutionResponse.Code"));
		signSolutionResponse.setErrorMessage(_ctx.stringValue("SignSolutionResponse.ErrorMessage"));
	 
	 	return signSolutionResponse;
	}
}