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

package com.aliyuncs.mpserverless.transform.v20190615;

import com.aliyuncs.mpserverless.model.v20190615.RunDBCommandResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class RunDBCommandResponseUnmarshaller {

	public static RunDBCommandResponse unmarshall(RunDBCommandResponse runDBCommandResponse, UnmarshallerContext _ctx) {
		
		runDBCommandResponse.setRequestId(_ctx.stringValue("RunDBCommandResponse.RequestId"));
		runDBCommandResponse.setHttpStatusCode(_ctx.stringValue("RunDBCommandResponse.HttpStatusCode"));
		runDBCommandResponse.setSuccess(_ctx.booleanValue("RunDBCommandResponse.Success"));
		runDBCommandResponse.setCode(_ctx.stringValue("RunDBCommandResponse.Code"));
		runDBCommandResponse.setMessage(_ctx.stringValue("RunDBCommandResponse.Message"));
		runDBCommandResponse.setResult(_ctx.stringValue("RunDBCommandResponse.Result"));
		runDBCommandResponse.setAffectedDocs(_ctx.integerValue("RunDBCommandResponse.AffectedDocs"));
	 
	 	return runDBCommandResponse;
	}
}