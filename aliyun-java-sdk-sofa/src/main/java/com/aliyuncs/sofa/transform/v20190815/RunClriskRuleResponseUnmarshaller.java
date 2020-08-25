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

import com.aliyuncs.sofa.model.v20190815.RunClriskRuleResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class RunClriskRuleResponseUnmarshaller {

	public static RunClriskRuleResponse unmarshall(RunClriskRuleResponse runClriskRuleResponse, UnmarshallerContext _ctx) {
		
		runClriskRuleResponse.setRequestId(_ctx.stringValue("RunClriskRuleResponse.RequestId"));
		runClriskRuleResponse.setResultCode(_ctx.stringValue("RunClriskRuleResponse.ResultCode"));
		runClriskRuleResponse.setResultMessage(_ctx.stringValue("RunClriskRuleResponse.ResultMessage"));
		runClriskRuleResponse.setUuid(_ctx.stringValue("RunClriskRuleResponse.Uuid"));
	 
	 	return runClriskRuleResponse;
	}
}