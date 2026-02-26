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

import com.aliyuncs.anytrans.model.v20250707.GetDocTranslateTaskResponse;
import com.aliyuncs.anytrans.model.v20250707.GetDocTranslateTaskResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDocTranslateTaskResponseUnmarshaller {

	public static GetDocTranslateTaskResponse unmarshall(GetDocTranslateTaskResponse getDocTranslateTaskResponse, UnmarshallerContext _ctx) {
		
		getDocTranslateTaskResponse.setCode(_ctx.stringValue("GetDocTranslateTaskResponse.code"));
		getDocTranslateTaskResponse.setMessage(_ctx.stringValue("GetDocTranslateTaskResponse.message"));
		getDocTranslateTaskResponse.setRequestId(_ctx.stringValue("GetDocTranslateTaskResponse.requestId"));
		getDocTranslateTaskResponse.setSuccess(_ctx.booleanValue("GetDocTranslateTaskResponse.success"));
		getDocTranslateTaskResponse.setHttpStatusCode(_ctx.stringValue("GetDocTranslateTaskResponse.httpStatusCode"));

		Data data = new Data();
		data.setTaskId(_ctx.stringValue("GetDocTranslateTaskResponse.data.taskId"));
		data.setStatus(_ctx.stringValue("GetDocTranslateTaskResponse.data.status"));
		data.setCharactersCount(_ctx.integerValue("GetDocTranslateTaskResponse.data.charactersCount"));
		data.setPageCount(_ctx.integerValue("GetDocTranslateTaskResponse.data.pageCount"));
		data.setTranslateFileUrl(_ctx.stringValue("GetDocTranslateTaskResponse.data.translateFileUrl"));
		getDocTranslateTaskResponse.setData(data);
	 
	 	return getDocTranslateTaskResponse;
	}
}