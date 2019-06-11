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

package com.aliyuncs.staffschedule.transform.v20190604;

import com.aliyuncs.staffschedule.model.v20190604.AsyncSolveRulesResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class AsyncSolveRulesResponseUnmarshaller {

	public static AsyncSolveRulesResponse unmarshall(AsyncSolveRulesResponse asyncSolveRulesResponse, UnmarshallerContext context) {
		
		asyncSolveRulesResponse.setRequestId(context.stringValue("AsyncSolveRulesResponse.RequestId"));
		asyncSolveRulesResponse.setCode(context.stringValue("AsyncSolveRulesResponse.Code"));
		asyncSolveRulesResponse.setMsg(context.stringValue("AsyncSolveRulesResponse.Msg"));
		asyncSolveRulesResponse.setData(context.stringValue("AsyncSolveRulesResponse.Data"));
	 
	 	return asyncSolveRulesResponse;
	}
}