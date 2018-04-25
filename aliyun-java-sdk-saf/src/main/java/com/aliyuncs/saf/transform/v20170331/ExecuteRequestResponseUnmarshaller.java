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

package com.aliyuncs.saf.transform.v20170331;

import com.aliyuncs.saf.model.v20170331.ExecuteRequestResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ExecuteRequestResponseUnmarshaller {

	public static ExecuteRequestResponse unmarshall(ExecuteRequestResponse executeRequestResponse, UnmarshallerContext context) {
		
		executeRequestResponse.setRequestId(context.stringValue("ExecuteRequestResponse.RequestId"));
		executeRequestResponse.setCode(context.integerValue("ExecuteRequestResponse.Code"));
		executeRequestResponse.setData(context.stringValue("ExecuteRequestResponse.Data"));
		executeRequestResponse.setMessage(context.stringValue("ExecuteRequestResponse.Message"));
	 
	 	return executeRequestResponse;
	}
}