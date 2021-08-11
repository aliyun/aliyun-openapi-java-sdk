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

package com.aliyuncs.aiccs.transform.v20191015;

import com.aliyuncs.aiccs.model.v20191015.StartTaskByAppResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class StartTaskByAppResponseUnmarshaller {

	public static StartTaskByAppResponse unmarshall(StartTaskByAppResponse startTaskByAppResponse, UnmarshallerContext _ctx) {
		
		startTaskByAppResponse.setRequestId(_ctx.stringValue("StartTaskByAppResponse.RequestId"));
		startTaskByAppResponse.setStatus(_ctx.stringValue("StartTaskByAppResponse.Status"));
		startTaskByAppResponse.setMessage(_ctx.stringValue("StartTaskByAppResponse.Message"));
		startTaskByAppResponse.setBuildId(_ctx.stringValue("StartTaskByAppResponse.BuildId"));
		startTaskByAppResponse.setPassNumber(_ctx.longValue("StartTaskByAppResponse.PassNumber"));
		startTaskByAppResponse.setTotalNumber(_ctx.longValue("StartTaskByAppResponse.TotalNumber"));
		startTaskByAppResponse.setUrl(_ctx.stringValue("StartTaskByAppResponse.Url"));
		startTaskByAppResponse.setSuccess(_ctx.booleanValue("StartTaskByAppResponse.Success"));
		startTaskByAppResponse.setTestSetRecordId(_ctx.longValue("StartTaskByAppResponse.TestSetRecordId"));
	 
	 	return startTaskByAppResponse;
	}
}