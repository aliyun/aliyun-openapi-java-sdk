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

package com.aliyuncs.sofa.transform.v20190815;

import com.aliyuncs.sofa.model.v20190815.DeleteMsSgServiceRateLimitRulesResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteMsSgServiceRateLimitRulesResponseUnmarshaller {

	public static DeleteMsSgServiceRateLimitRulesResponse unmarshall(DeleteMsSgServiceRateLimitRulesResponse deleteMsSgServiceRateLimitRulesResponse, UnmarshallerContext _ctx) {
		
		deleteMsSgServiceRateLimitRulesResponse.setRequestId(_ctx.stringValue("DeleteMsSgServiceRateLimitRulesResponse.RequestId"));
		deleteMsSgServiceRateLimitRulesResponse.setResultCode(_ctx.stringValue("DeleteMsSgServiceRateLimitRulesResponse.ResultCode"));
		deleteMsSgServiceRateLimitRulesResponse.setResultMessage(_ctx.stringValue("DeleteMsSgServiceRateLimitRulesResponse.ResultMessage"));
		deleteMsSgServiceRateLimitRulesResponse.setResult(_ctx.longValue("DeleteMsSgServiceRateLimitRulesResponse.Result"));
	 
	 	return deleteMsSgServiceRateLimitRulesResponse;
	}
}