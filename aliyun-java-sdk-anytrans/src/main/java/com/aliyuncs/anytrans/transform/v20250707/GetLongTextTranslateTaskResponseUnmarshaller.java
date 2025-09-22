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

import com.aliyuncs.anytrans.model.v20250707.GetLongTextTranslateTaskResponse;
import com.aliyuncs.anytrans.model.v20250707.GetLongTextTranslateTaskResponse.Data;
import com.aliyuncs.anytrans.model.v20250707.GetLongTextTranslateTaskResponse.Data.Usage;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetLongTextTranslateTaskResponseUnmarshaller {

	public static GetLongTextTranslateTaskResponse unmarshall(GetLongTextTranslateTaskResponse getLongTextTranslateTaskResponse, UnmarshallerContext _ctx) {
		
		getLongTextTranslateTaskResponse.setCode(_ctx.stringValue("GetLongTextTranslateTaskResponse.code"));
		getLongTextTranslateTaskResponse.setMessage(_ctx.stringValue("GetLongTextTranslateTaskResponse.message"));
		getLongTextTranslateTaskResponse.setRequestId(_ctx.stringValue("GetLongTextTranslateTaskResponse.requestId"));
		getLongTextTranslateTaskResponse.setSuccess(_ctx.booleanValue("GetLongTextTranslateTaskResponse.success"));
		getLongTextTranslateTaskResponse.setHttpStatusCode(_ctx.stringValue("GetLongTextTranslateTaskResponse.httpStatusCode"));

		Data data = new Data();
		data.setTranslation(_ctx.stringValue("GetLongTextTranslateTaskResponse.data.translation"));

		Usage usage = new Usage();
		usage.setInputTokens(_ctx.longValue("GetLongTextTranslateTaskResponse.data.usage.inputTokens"));
		usage.setOutputTokens(_ctx.longValue("GetLongTextTranslateTaskResponse.data.usage.outputTokens"));
		usage.setTotalTokens(_ctx.longValue("GetLongTextTranslateTaskResponse.data.usage.totalTokens"));
		data.setUsage(usage);
		getLongTextTranslateTaskResponse.setData(data);
	 
	 	return getLongTextTranslateTaskResponse;
	}
}