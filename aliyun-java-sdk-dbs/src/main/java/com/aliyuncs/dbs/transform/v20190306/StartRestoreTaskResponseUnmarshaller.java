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

package com.aliyuncs.dbs.transform.v20190306;

import com.aliyuncs.dbs.model.v20190306.StartRestoreTaskResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class StartRestoreTaskResponseUnmarshaller {

	public static StartRestoreTaskResponse unmarshall(StartRestoreTaskResponse startRestoreTaskResponse, UnmarshallerContext _ctx) {
		
		startRestoreTaskResponse.setRequestId(_ctx.stringValue("StartRestoreTaskResponse.RequestId"));
		startRestoreTaskResponse.setSuccess(_ctx.booleanValue("StartRestoreTaskResponse.Success"));
		startRestoreTaskResponse.setErrCode(_ctx.stringValue("StartRestoreTaskResponse.ErrCode"));
		startRestoreTaskResponse.setErrMessage(_ctx.stringValue("StartRestoreTaskResponse.ErrMessage"));
		startRestoreTaskResponse.setHttpStatusCode(_ctx.integerValue("StartRestoreTaskResponse.HttpStatusCode"));
		startRestoreTaskResponse.setRestoreTaskId(_ctx.stringValue("StartRestoreTaskResponse.RestoreTaskId"));
	 
	 	return startRestoreTaskResponse;
	}
}