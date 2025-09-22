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

import com.aliyuncs.anytrans.model.v20250707.TextTranslateResponse;
import com.aliyuncs.anytrans.model.v20250707.TextTranslateResponse.Data;
import com.aliyuncs.anytrans.model.v20250707.TextTranslateResponse.Data.Usage;
import com.aliyuncs.transform.UnmarshallerContext;


public class TextTranslateResponseUnmarshaller {

	public static TextTranslateResponse unmarshall(TextTranslateResponse textTranslateResponse, UnmarshallerContext _ctx) {
		
		textTranslateResponse.setCode(_ctx.stringValue("TextTranslateResponse.code"));
		textTranslateResponse.setMessage(_ctx.stringValue("TextTranslateResponse.message"));
		textTranslateResponse.setRequestId(_ctx.stringValue("TextTranslateResponse.requestId"));
		textTranslateResponse.setSuccess(_ctx.booleanValue("TextTranslateResponse.success"));
		textTranslateResponse.setHttpStatusCode(_ctx.stringValue("TextTranslateResponse.httpStatusCode"));

		Data data = new Data();
		data.setTranslation(_ctx.stringValue("TextTranslateResponse.data.translation"));

		Usage usage = new Usage();
		usage.setInputTokens(_ctx.longValue("TextTranslateResponse.data.usage.inputTokens"));
		usage.setOutputTokens(_ctx.longValue("TextTranslateResponse.data.usage.outputTokens"));
		usage.setTotalTokens(_ctx.longValue("TextTranslateResponse.data.usage.totalTokens"));
		data.setUsage(usage);
		textTranslateResponse.setData(data);
	 
	 	return textTranslateResponse;
	}
}