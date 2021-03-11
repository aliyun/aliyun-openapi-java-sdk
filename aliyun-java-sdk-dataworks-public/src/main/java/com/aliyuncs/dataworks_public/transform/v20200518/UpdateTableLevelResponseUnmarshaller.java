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

import com.aliyuncs.dataworks_public.model.v20200518.UpdateTableLevelResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateTableLevelResponseUnmarshaller {

	public static UpdateTableLevelResponse unmarshall(UpdateTableLevelResponse updateTableLevelResponse, UnmarshallerContext _ctx) {
		
		updateTableLevelResponse.setRequestId(_ctx.stringValue("UpdateTableLevelResponse.RequestId"));
		updateTableLevelResponse.setErrorCode(_ctx.stringValue("UpdateTableLevelResponse.ErrorCode"));
		updateTableLevelResponse.setErrorMessage(_ctx.stringValue("UpdateTableLevelResponse.ErrorMessage"));
		updateTableLevelResponse.setHttpStatusCode(_ctx.integerValue("UpdateTableLevelResponse.HttpStatusCode"));
		updateTableLevelResponse.setSuccess(_ctx.booleanValue("UpdateTableLevelResponse.Success"));
		updateTableLevelResponse.setUpdateResult(_ctx.booleanValue("UpdateTableLevelResponse.UpdateResult"));
	 
	 	return updateTableLevelResponse;
	}
}