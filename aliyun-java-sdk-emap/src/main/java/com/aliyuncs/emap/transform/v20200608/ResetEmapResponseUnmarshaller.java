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

package com.aliyuncs.emap.transform.v20200608;

import com.aliyuncs.emap.model.v20200608.ResetEmapResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ResetEmapResponseUnmarshaller {

	public static ResetEmapResponse unmarshall(ResetEmapResponse resetEmapResponse, UnmarshallerContext _ctx) {
		
		resetEmapResponse.setRequestId(_ctx.stringValue("ResetEmapResponse.RequestId"));
		resetEmapResponse.setMessage(_ctx.stringValue("ResetEmapResponse.Message"));
		resetEmapResponse.setErrorCode(_ctx.stringValue("ResetEmapResponse.ErrorCode"));
		resetEmapResponse.setErrorMessage(_ctx.stringValue("ResetEmapResponse.ErrorMessage"));
		resetEmapResponse.setDynamicMessage(_ctx.stringValue("ResetEmapResponse.DynamicMessage"));
		resetEmapResponse.setSuccess(_ctx.booleanValue("ResetEmapResponse.Success"));
		resetEmapResponse.setDynamicCode(_ctx.stringValue("ResetEmapResponse.DynamicCode"));
		resetEmapResponse.setCode(_ctx.stringValue("ResetEmapResponse.Code"));
	 
	 	return resetEmapResponse;
	}
}