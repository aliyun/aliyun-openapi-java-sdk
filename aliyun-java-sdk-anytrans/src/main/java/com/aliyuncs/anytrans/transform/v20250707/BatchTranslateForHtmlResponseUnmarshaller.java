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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.anytrans.model.v20250707.BatchTranslateForHtmlResponse;
import com.aliyuncs.anytrans.model.v20250707.BatchTranslateForHtmlResponse.Data;
import com.aliyuncs.anytrans.model.v20250707.BatchTranslateForHtmlResponse.Data.TranslationListItem;
import com.aliyuncs.anytrans.model.v20250707.BatchTranslateForHtmlResponse.Data.TranslationListItem.Usage;
import com.aliyuncs.transform.UnmarshallerContext;


public class BatchTranslateForHtmlResponseUnmarshaller {

	public static BatchTranslateForHtmlResponse unmarshall(BatchTranslateForHtmlResponse batchTranslateForHtmlResponse, UnmarshallerContext _ctx) {
		
		batchTranslateForHtmlResponse.setCode(_ctx.stringValue("BatchTranslateForHtmlResponse.code"));
		batchTranslateForHtmlResponse.setMessage(_ctx.stringValue("BatchTranslateForHtmlResponse.message"));
		batchTranslateForHtmlResponse.setRequestId(_ctx.stringValue("BatchTranslateForHtmlResponse.requestId"));
		batchTranslateForHtmlResponse.setSuccess(_ctx.booleanValue("BatchTranslateForHtmlResponse.success"));
		batchTranslateForHtmlResponse.setHttpStatusCode(_ctx.stringValue("BatchTranslateForHtmlResponse.httpStatusCode"));

		Data data = new Data();

		List<TranslationListItem> translationList = new ArrayList<TranslationListItem>();
		for (int i = 0; i < _ctx.lengthValue("BatchTranslateForHtmlResponse.data.translationList.Length"); i++) {
			TranslationListItem translationListItem = new TranslationListItem();
			translationListItem.setCode(_ctx.longValue("BatchTranslateForHtmlResponse.data.translationList["+ i +"].code"));
			translationListItem.setMessage(_ctx.stringValue("BatchTranslateForHtmlResponse.data.translationList["+ i +"].message"));
			translationListItem.setIndex(_ctx.stringValue("BatchTranslateForHtmlResponse.data.translationList["+ i +"].index"));
			translationListItem.setTranslation(_ctx.stringValue("BatchTranslateForHtmlResponse.data.translationList["+ i +"].translation"));

			Usage usage = new Usage();
			usage.setInputTokens(_ctx.longValue("BatchTranslateForHtmlResponse.data.translationList["+ i +"].usage.inputTokens"));
			usage.setOutputTokens(_ctx.longValue("BatchTranslateForHtmlResponse.data.translationList["+ i +"].usage.outputTokens"));
			usage.setTotalTokens(_ctx.longValue("BatchTranslateForHtmlResponse.data.translationList["+ i +"].usage.totalTokens"));
			translationListItem.setUsage(usage);

			translationList.add(translationListItem);
		}
		data.setTranslationList(translationList);
		batchTranslateForHtmlResponse.setData(data);
	 
	 	return batchTranslateForHtmlResponse;
	}
}