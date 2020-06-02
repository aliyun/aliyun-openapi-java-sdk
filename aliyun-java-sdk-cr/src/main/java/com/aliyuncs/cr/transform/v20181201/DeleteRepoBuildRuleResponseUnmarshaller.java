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

package com.aliyuncs.cr.transform.v20181201;

import com.aliyuncs.cr.model.v20181201.DeleteRepoBuildRuleResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DeleteRepoBuildRuleResponseUnmarshaller {

	public static DeleteRepoBuildRuleResponse unmarshall(DeleteRepoBuildRuleResponse deleteRepoBuildRuleResponse, UnmarshallerContext _ctx) {
		
		deleteRepoBuildRuleResponse.setRequestId(_ctx.stringValue("DeleteRepoBuildRuleResponse.RequestId"));
		deleteRepoBuildRuleResponse.setIsSuccess(_ctx.booleanValue("DeleteRepoBuildRuleResponse.IsSuccess"));
		deleteRepoBuildRuleResponse.setCode(_ctx.stringValue("DeleteRepoBuildRuleResponse.Code"));
	 
	 	return deleteRepoBuildRuleResponse;
	}
}