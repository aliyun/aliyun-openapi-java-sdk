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

package com.aliyuncs.xrengine.transform.v20221111;

import com.aliyuncs.xrengine.model.v20221111.ApplyForTryOnResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ApplyForTryOnResponseUnmarshaller {

	public static ApplyForTryOnResponse unmarshall(ApplyForTryOnResponse applyForTryOnResponse, UnmarshallerContext _ctx) {
		
		applyForTryOnResponse.setRequestId(_ctx.stringValue("ApplyForTryOnResponse.RequestId"));
		applyForTryOnResponse.setSuccess(_ctx.booleanValue("ApplyForTryOnResponse.Success"));
		applyForTryOnResponse.setCode(_ctx.stringValue("ApplyForTryOnResponse.Code"));
		applyForTryOnResponse.setMessage(_ctx.stringValue("ApplyForTryOnResponse.Message"));
		applyForTryOnResponse.setErrorName(_ctx.stringValue("ApplyForTryOnResponse.ErrorName"));
		applyForTryOnResponse.setHttpCode(_ctx.integerValue("ApplyForTryOnResponse.HttpCode"));
	 
	 	return applyForTryOnResponse;
	}
}