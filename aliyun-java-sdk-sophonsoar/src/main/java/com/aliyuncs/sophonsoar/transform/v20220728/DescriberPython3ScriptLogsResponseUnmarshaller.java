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

import com.aliyuncs.sophonsoar.model.v20220728.DescriberPython3ScriptLogsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescriberPython3ScriptLogsResponseUnmarshaller {

	public static DescriberPython3ScriptLogsResponse unmarshall(DescriberPython3ScriptLogsResponse describerPython3ScriptLogsResponse, UnmarshallerContext _ctx) {
		
		describerPython3ScriptLogsResponse.setRequestId(_ctx.stringValue("DescriberPython3ScriptLogsResponse.RequestId"));
		describerPython3ScriptLogsResponse.setRunResult(_ctx.stringValue("DescriberPython3ScriptLogsResponse.RunResult"));
	 
	 	return describerPython3ScriptLogsResponse;
	}
}