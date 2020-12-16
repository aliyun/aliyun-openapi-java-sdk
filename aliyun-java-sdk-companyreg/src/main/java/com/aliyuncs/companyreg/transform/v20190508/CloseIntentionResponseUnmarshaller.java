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

package com.aliyuncs.companyreg.transform.v20190508;

import com.aliyuncs.companyreg.model.v20190508.CloseIntentionResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CloseIntentionResponseUnmarshaller {

	public static CloseIntentionResponse unmarshall(CloseIntentionResponse closeIntentionResponse, UnmarshallerContext _ctx) {
		
		closeIntentionResponse.setRequestId(_ctx.stringValue("CloseIntentionResponse.RequestId"));
		closeIntentionResponse.setSuccess(_ctx.booleanValue("CloseIntentionResponse.Success"));
		closeIntentionResponse.setErrorMsg(_ctx.stringValue("CloseIntentionResponse.ErrorMsg"));
		closeIntentionResponse.setErrorCode(_ctx.stringValue("CloseIntentionResponse.ErrorCode"));
	 
	 	return closeIntentionResponse;
	}
}