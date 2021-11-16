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

package com.aliyuncs.dataworks_public.transform.v20200518;

import com.aliyuncs.dataworks_public.model.v20200518.CreateTableLevelResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateTableLevelResponseUnmarshaller {

	public static CreateTableLevelResponse unmarshall(CreateTableLevelResponse createTableLevelResponse, UnmarshallerContext _ctx) {
		
		createTableLevelResponse.setRequestId(_ctx.stringValue("CreateTableLevelResponse.RequestId"));
		createTableLevelResponse.setErrorCode(_ctx.stringValue("CreateTableLevelResponse.ErrorCode"));
		createTableLevelResponse.setErrorMessage(_ctx.stringValue("CreateTableLevelResponse.ErrorMessage"));
		createTableLevelResponse.setHttpStatusCode(_ctx.integerValue("CreateTableLevelResponse.HttpStatusCode"));
		createTableLevelResponse.setSuccess(_ctx.booleanValue("CreateTableLevelResponse.Success"));
		createTableLevelResponse.setLevelId(_ctx.longValue("CreateTableLevelResponse.LevelId"));
	 
	 	return createTableLevelResponse;
	}
}