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

package com.aliyuncs.codeup.transform.v20200414;

import com.aliyuncs.codeup.model.v20200414.UpdateMergeRequestSettingResponse;
import com.aliyuncs.codeup.model.v20200414.UpdateMergeRequestSettingResponse.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateMergeRequestSettingResponseUnmarshaller {

	public static UpdateMergeRequestSettingResponse unmarshall(UpdateMergeRequestSettingResponse updateMergeRequestSettingResponse, UnmarshallerContext _ctx) {
		
		updateMergeRequestSettingResponse.setRequestId(_ctx.stringValue("UpdateMergeRequestSettingResponse.RequestId"));
		updateMergeRequestSettingResponse.setErrorCode(_ctx.stringValue("UpdateMergeRequestSettingResponse.ErrorCode"));
		updateMergeRequestSettingResponse.setErrorMessage(_ctx.stringValue("UpdateMergeRequestSettingResponse.ErrorMessage"));
		updateMergeRequestSettingResponse.setSuccess(_ctx.booleanValue("UpdateMergeRequestSettingResponse.Success"));

		Result result = new Result();
		result.setResult(_ctx.booleanValue("UpdateMergeRequestSettingResponse.Result.Result"));
		updateMergeRequestSettingResponse.setResult(result);
	 
	 	return updateMergeRequestSettingResponse;
	}
}