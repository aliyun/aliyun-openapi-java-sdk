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

import com.aliyuncs.anytrans.model.v20250707.BatchTranslateResponse;
import com.aliyuncs.anytrans.model.v20250707.BatchTranslateResponse.Data;
import com.aliyuncs.anytrans.model.v20250707.BatchTranslateResponse.Data.TranslationListItem;
import com.aliyuncs.anytrans.model.v20250707.BatchTranslateResponse.Data.TranslationListItem.Usage;
import com.aliyuncs.transform.UnmarshallerContext;


public class BatchTranslateResponseUnmarshaller {

	public static BatchTranslateResponse unmarshall(BatchTranslateResponse batchTranslateResponse, UnmarshallerContext _ctx) {
		
		batchTranslateResponse.setCode(_ctx.stringValue("BatchTranslateResponse.code"));
		batchTranslateResponse.setMessage(_ctx.stringValue("BatchTranslateResponse.message"));
		batchTranslateResponse.setRequestId(_ctx.stringValue("BatchTranslateResponse.requestId"));
		batchTranslateResponse.setSuccess(_ctx.booleanValue("BatchTranslateResponse.success"));
		batchTranslateResponse.setHttpStatusCode(_ctx.stringValue("BatchTranslateResponse.httpStatusCode"));

		Data data = new Data();

		List<TranslationListItem> translationList = new ArrayList<TranslationListItem>();
		for (int i = 0; i < _ctx.lengthValue("BatchTranslateResponse.data.translationList.Length"); i++) {
			TranslationListItem translationListItem = new TranslationListItem();
			translationListItem.setCode(_ctx.longValue("BatchTranslateResponse.data.translationList["+ i +"].code"));
			translationListItem.setMessage(_ctx.stringValue("BatchTranslateResponse.data.translationList["+ i +"].message"));
			translationListItem.setIndex(_ctx.stringValue("BatchTranslateResponse.data.translationList["+ i +"].index"));
			translationListItem.setTranslation(_ctx.stringValue("BatchTranslateResponse.data.translationList["+ i +"].translation"));

			Usage usage = new Usage();
			usage.setInputTokens(_ctx.longValue("BatchTranslateResponse.data.translationList["+ i +"].usage.inputTokens"));
			usage.setOutputTokens(_ctx.longValue("BatchTranslateResponse.data.translationList["+ i +"].usage.outputTokens"));
			usage.setTotalTokens(_ctx.longValue("BatchTranslateResponse.data.translationList["+ i +"].usage.totalTokens"));
			translationListItem.setUsage(usage);

			translationList.add(translationListItem);
		}
		data.setTranslationList(translationList);
		batchTranslateResponse.setData(data);
	 
	 	return batchTranslateResponse;
	}
}