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

package com.aliyuncs.hbr.transform.v20170908;

import com.aliyuncs.hbr.model.v20170908.CheckBetaResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CheckBetaResponseUnmarshaller {

	public static CheckBetaResponse unmarshall(CheckBetaResponse checkBetaResponse, UnmarshallerContext _ctx) {
		
		checkBetaResponse.setRequestId(_ctx.stringValue("CheckBetaResponse.RequestId"));
		checkBetaResponse.setSuccess(_ctx.booleanValue("CheckBetaResponse.Success"));
		checkBetaResponse.setCode(_ctx.stringValue("CheckBetaResponse.Code"));
		checkBetaResponse.setMessage(_ctx.stringValue("CheckBetaResponse.Message"));
		checkBetaResponse.setApplyStatus(_ctx.stringValue("CheckBetaResponse.ApplyStatus"));
	 
	 	return checkBetaResponse;
	}
}