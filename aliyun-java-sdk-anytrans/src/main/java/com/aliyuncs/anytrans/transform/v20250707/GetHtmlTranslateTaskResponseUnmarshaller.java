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

import com.aliyuncs.anytrans.model.v20250707.GetHtmlTranslateTaskResponse;
import com.aliyuncs.anytrans.model.v20250707.GetHtmlTranslateTaskResponse.Data;
import com.aliyuncs.anytrans.model.v20250707.GetHtmlTranslateTaskResponse.Data.Usage;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetHtmlTranslateTaskResponseUnmarshaller {

	public static GetHtmlTranslateTaskResponse unmarshall(GetHtmlTranslateTaskResponse getHtmlTranslateTaskResponse, UnmarshallerContext _ctx) {
		
		getHtmlTranslateTaskResponse.setCode(_ctx.stringValue("GetHtmlTranslateTaskResponse.code"));
		getHtmlTranslateTaskResponse.setMessage(_ctx.stringValue("GetHtmlTranslateTaskResponse.message"));
		getHtmlTranslateTaskResponse.setRequestId(_ctx.stringValue("GetHtmlTranslateTaskResponse.requestId"));
		getHtmlTranslateTaskResponse.setSuccess(_ctx.booleanValue("GetHtmlTranslateTaskResponse.success"));
		getHtmlTranslateTaskResponse.setHttpStatusCode(_ctx.stringValue("GetHtmlTranslateTaskResponse.httpStatusCode"));

		Data data = new Data();
		data.setTranslation(_ctx.stringValue("GetHtmlTranslateTaskResponse.data.translation"));

		Usage usage = new Usage();
		usage.setInputTokens(_ctx.longValue("GetHtmlTranslateTaskResponse.data.usage.inputTokens"));
		usage.setOutputTokens(_ctx.longValue("GetHtmlTranslateTaskResponse.data.usage.outputTokens"));
		usage.setTotalTokens(_ctx.longValue("GetHtmlTranslateTaskResponse.data.usage.totalTokens"));
		data.setUsage(usage);
		getHtmlTranslateTaskResponse.setData(data);
	 
	 	return getHtmlTranslateTaskResponse;
	}
}