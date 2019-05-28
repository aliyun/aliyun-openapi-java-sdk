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

	public static CreateRestoreTaskResponse unmarshall(CreateRestoreTaskResponse createRestoreTaskResponse, UnmarshallerContext context) {
		
		createRestoreTaskResponse.setRequestId(context.stringValue("CreateRestoreTaskResponse.RequestId"));
		createRestoreTaskResponse.setSuccess(context.booleanValue("CreateRestoreTaskResponse.Success"));
		createRestoreTaskResponse.setErrCode(context.stringValue("CreateRestoreTaskResponse.ErrCode"));
		createRestoreTaskResponse.setErrMessage(context.stringValue("CreateRestoreTaskResponse.ErrMessage"));
		createRestoreTaskResponse.setHttpStatusCode(context.integerValue("CreateRestoreTaskResponse.HttpStatusCode"));
		createRestoreTaskResponse.setRestoreTaskId(context.stringValue("CreateRestoreTaskResponse.RestoreTaskId"));
	 
	 	return createRestoreTaskResponse;
	}
}