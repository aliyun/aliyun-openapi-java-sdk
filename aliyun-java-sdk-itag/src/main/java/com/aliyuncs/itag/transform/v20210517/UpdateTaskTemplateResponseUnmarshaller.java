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

package com.aliyuncs.itag.transform.v20210517;

import com.aliyuncs.itag.model.v20210517.UpdateTaskTemplateResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateTaskTemplateResponseUnmarshaller {

	public static UpdateTaskTemplateResponse unmarshall(UpdateTaskTemplateResponse updateTaskTemplateResponse, UnmarshallerContext _ctx) {
		
		updateTaskTemplateResponse.setRequestId(_ctx.stringValue("UpdateTaskTemplateResponse.RequestId"));
		updateTaskTemplateResponse.setCode(_ctx.stringValue("UpdateTaskTemplateResponse.Code"));
		updateTaskTemplateResponse.setErrInfo(_ctx.stringValue("UpdateTaskTemplateResponse.ErrInfo"));
		updateTaskTemplateResponse.setMsg(_ctx.stringValue("UpdateTaskTemplateResponse.Msg"));
		updateTaskTemplateResponse.setSucc(_ctx.booleanValue("UpdateTaskTemplateResponse.Succ"));
		updateTaskTemplateResponse.setResult(_ctx.booleanValue("UpdateTaskTemplateResponse.Result"));
		updateTaskTemplateResponse.setErrorCode(_ctx.stringValue("UpdateTaskTemplateResponse.ErrorCode"));
	 
	 	return updateTaskTemplateResponse;
	}
}