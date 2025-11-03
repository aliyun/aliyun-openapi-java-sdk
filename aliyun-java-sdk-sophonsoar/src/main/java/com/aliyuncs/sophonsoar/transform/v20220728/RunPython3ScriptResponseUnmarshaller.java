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

package com.aliyuncs.sophonsoar.transform.v20220728;

import com.aliyuncs.sophonsoar.model.v20220728.RunPython3ScriptResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class RunPython3ScriptResponseUnmarshaller {

	public static RunPython3ScriptResponse unmarshall(RunPython3ScriptResponse runPython3ScriptResponse, UnmarshallerContext _ctx) {
		
		runPython3ScriptResponse.setRequestId(_ctx.stringValue("RunPython3ScriptResponse.RequestId"));
		runPython3ScriptResponse.setRunResult(_ctx.stringValue("RunPython3ScriptResponse.RunResult"));
	 
	 	return runPython3ScriptResponse;
	}
}