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

package com.aliyuncs.waf_openapi.transform.v20180117;

import com.aliyuncs.waf_openapi.model.v20180117.DeleteAclRuleResponse;
import com.aliyuncs.waf_openapi.model.v20180117.DeleteAclRuleResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteAclRuleResponseUnmarshaller {

	public static DeleteAclRuleResponse unmarshall(DeleteAclRuleResponse deleteAclRuleResponse, UnmarshallerContext _ctx) {
		
		deleteAclRuleResponse.setRequestId(_ctx.stringValue("DeleteAclRuleResponse.RequestId"));

		Result result = new Result();
		result.setWafTaskId(_ctx.stringValue("DeleteAclRuleResponse.Result.WafTaskId"));
		result.setStatus(_ctx.integerValue("DeleteAclRuleResponse.Result.Status"));
		deleteAclRuleResponse.setResult(result);
	 
	 	return deleteAclRuleResponse;
	}
}