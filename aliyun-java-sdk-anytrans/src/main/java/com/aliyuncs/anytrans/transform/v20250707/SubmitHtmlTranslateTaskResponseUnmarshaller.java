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

import com.aliyuncs.anytrans.model.v20250707.SubmitHtmlTranslateTaskResponse;
import com.aliyuncs.anytrans.model.v20250707.SubmitHtmlTranslateTaskResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class SubmitHtmlTranslateTaskResponseUnmarshaller {

	public static SubmitHtmlTranslateTaskResponse unmarshall(SubmitHtmlTranslateTaskResponse submitHtmlTranslateTaskResponse, UnmarshallerContext _ctx) {
		
		submitHtmlTranslateTaskResponse.setCode(_ctx.stringValue("SubmitHtmlTranslateTaskResponse.code"));
		submitHtmlTranslateTaskResponse.setMessage(_ctx.stringValue("SubmitHtmlTranslateTaskResponse.message"));
		submitHtmlTranslateTaskResponse.setRequestId(_ctx.stringValue("SubmitHtmlTranslateTaskResponse.requestId"));
		submitHtmlTranslateTaskResponse.setSuccess(_ctx.booleanValue("SubmitHtmlTranslateTaskResponse.success"));
		submitHtmlTranslateTaskResponse.setHttpStatusCode(_ctx.stringValue("SubmitHtmlTranslateTaskResponse.httpStatusCode"));

		Data data = new Data();
		data.setTaskId(_ctx.stringValue("SubmitHtmlTranslateTaskResponse.data.taskId"));
		data.setStatus(_ctx.stringValue("SubmitHtmlTranslateTaskResponse.data.status"));
		submitHtmlTranslateTaskResponse.setData(data);
	 
	 	return submitHtmlTranslateTaskResponse;
	}
}