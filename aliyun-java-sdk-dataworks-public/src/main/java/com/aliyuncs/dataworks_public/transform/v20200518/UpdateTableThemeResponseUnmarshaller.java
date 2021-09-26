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

import com.aliyuncs.dataworks_public.model.v20200518.UpdateTableThemeResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateTableThemeResponseUnmarshaller {

	public static UpdateTableThemeResponse unmarshall(UpdateTableThemeResponse updateTableThemeResponse, UnmarshallerContext _ctx) {
		
		updateTableThemeResponse.setRequestId(_ctx.stringValue("UpdateTableThemeResponse.RequestId"));
		updateTableThemeResponse.setHttpStatusCode(_ctx.integerValue("UpdateTableThemeResponse.HttpStatusCode"));
		updateTableThemeResponse.setErrorMessage(_ctx.stringValue("UpdateTableThemeResponse.ErrorMessage"));
		updateTableThemeResponse.setUpdateResult(_ctx.booleanValue("UpdateTableThemeResponse.UpdateResult"));
		updateTableThemeResponse.setErrorCode(_ctx.stringValue("UpdateTableThemeResponse.ErrorCode"));
		updateTableThemeResponse.setSuccess(_ctx.booleanValue("UpdateTableThemeResponse.Success"));
	 
	 	return updateTableThemeResponse;
	}
}