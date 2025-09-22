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

package com.aliyuncs.anytrans.transform.v20250707;

import com.aliyuncs.anytrans.model.v20250707.SubmitImageTranslateTaskResponse;
import com.aliyuncs.anytrans.model.v20250707.SubmitImageTranslateTaskResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class SubmitImageTranslateTaskResponseUnmarshaller {

	public static SubmitImageTranslateTaskResponse unmarshall(SubmitImageTranslateTaskResponse submitImageTranslateTaskResponse, UnmarshallerContext _ctx) {
		
		submitImageTranslateTaskResponse.setCode(_ctx.stringValue("SubmitImageTranslateTaskResponse.code"));
		submitImageTranslateTaskResponse.setMessage(_ctx.stringValue("SubmitImageTranslateTaskResponse.message"));
		submitImageTranslateTaskResponse.setRequestId(_ctx.stringValue("SubmitImageTranslateTaskResponse.requestId"));
		submitImageTranslateTaskResponse.setSuccess(_ctx.booleanValue("SubmitImageTranslateTaskResponse.success"));
		submitImageTranslateTaskResponse.setHttpStatusCode(_ctx.stringValue("SubmitImageTranslateTaskResponse.httpStatusCode"));

		Data data = new Data();
		data.setTaskId(_ctx.stringValue("SubmitImageTranslateTaskResponse.data.taskId"));
		data.setStatus(_ctx.stringValue("SubmitImageTranslateTaskResponse.data.status"));
		submitImageTranslateTaskResponse.setData(data);
	 
	 	return submitImageTranslateTaskResponse;
	}
}