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

import com.aliyuncs.dbs.model.v20190306.CreateRestoreTaskResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateRestoreTaskResponseUnmarshaller {

	public static CreateRestoreTaskResponse unmarshall(CreateRestoreTaskResponse createRestoreTaskResponse, UnmarshallerContext _ctx) {
		
		createRestoreTaskResponse.setRequestId(_ctx.stringValue("CreateRestoreTaskResponse.RequestId"));
		createRestoreTaskResponse.setSuccess(_ctx.booleanValue("CreateRestoreTaskResponse.Success"));
		createRestoreTaskResponse.setErrCode(_ctx.stringValue("CreateRestoreTaskResponse.ErrCode"));
		createRestoreTaskResponse.setErrMessage(_ctx.stringValue("CreateRestoreTaskResponse.ErrMessage"));
		createRestoreTaskResponse.setHttpStatusCode(_ctx.integerValue("CreateRestoreTaskResponse.HttpStatusCode"));
		createRestoreTaskResponse.setRestoreTaskId(_ctx.stringValue("CreateRestoreTaskResponse.RestoreTaskId"));
	 
	 	return createRestoreTaskResponse;
	}
}