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

package com.aliyuncs.ccc.transform.v20200701;

import com.aliyuncs.ccc.model.v20200701.SaveTerminalLogResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SaveTerminalLogResponseUnmarshaller {

	public static SaveTerminalLogResponse unmarshall(SaveTerminalLogResponse saveTerminalLogResponse, UnmarshallerContext _ctx) {
		
		saveTerminalLogResponse.setRequestId(_ctx.stringValue("SaveTerminalLogResponse.RequestId"));
		saveTerminalLogResponse.setHttpStatusCode(_ctx.longValue("SaveTerminalLogResponse.HttpStatusCode"));
		saveTerminalLogResponse.setSuccess(_ctx.booleanValue("SaveTerminalLogResponse.Success"));
		saveTerminalLogResponse.setCode(_ctx.stringValue("SaveTerminalLogResponse.Code"));
		saveTerminalLogResponse.setMessage(_ctx.stringValue("SaveTerminalLogResponse.Message"));
		saveTerminalLogResponse.setTimeStamp(_ctx.longValue("SaveTerminalLogResponse.TimeStamp"));
	 
	 	return saveTerminalLogResponse;
	}
}