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

package com.aliyuncs.imageaudit.transform.v20191230;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.imageaudit.model.v20191230.ScanTextResponse;
import com.aliyuncs.imageaudit.model.v20191230.ScanTextResponse.Data;
import com.aliyuncs.imageaudit.model.v20191230.ScanTextResponse.Data.Element;
import com.aliyuncs.imageaudit.model.v20191230.ScanTextResponse.Data.Element.Result;
import com.aliyuncs.imageaudit.model.v20191230.ScanTextResponse.Data.Element.Result.Detail;
import com.aliyuncs.imageaudit.model.v20191230.ScanTextResponse.Data.Element.Result.Detail.HintWord;
import com.aliyuncs.transform.UnmarshallerContext;


public class ScanTextResponseUnmarshaller {

	public static ScanTextResponse unmarshall(ScanTextResponse scanTextResponse, UnmarshallerContext _ctx) {
		
		scanTextResponse.setRequestId(_ctx.stringValue("ScanTextResponse.RequestId"));

		Data data = new Data();

		List<Element> elements = new ArrayList<Element>();
		for (int i = 0; i < _ctx.lengthValue("ScanTextResponse.Data.Elements.Length"); i++) {
			Element element = new Element();
			element.setTaskId(_ctx.stringValue("ScanTextResponse.Data.Elements["+ i +"].TaskId"));

			List<Result> results = new ArrayList<Result>();
			for (int j = 0; j < _ctx.lengthValue("ScanTextResponse.Data.Elements["+ i +"].Results.Length"); j++) {
				Result result = new Result();
				result.setLabel(_ctx.stringValue("ScanTextResponse.Data.Elements["+ i +"].Results["+ j +"].Label"));
				result.setSuggestion(_ctx.stringValue("ScanTextResponse.Data.Elements["+ i +"].Results["+ j +"].Suggestion"));
				result.setRate(_ctx.floatValue("ScanTextResponse.Data.Elements["+ i +"].Results["+ j +"].Rate"));

				List<Detail> details = new ArrayList<Detail>();
				for (int k = 0; k < _ctx.lengthValue("ScanTextResponse.Data.Elements["+ i +"].Results["+ j +"].Details.Length"); k++) {
					Detail detail = new Detail();
					detail.setLabel(_ctx.stringValue("ScanTextResponse.Data.Elements["+ i +"].Results["+ j +"].Details["+ k +"].Label"));

					List<HintWord> hintWords = new ArrayList<HintWord>();
					for (int l = 0; l < _ctx.lengthValue("ScanTextResponse.Data.Elements["+ i +"].Results["+ j +"].Details["+ k +"].HintWords.Length"); l++) {
						HintWord hintWord = new HintWord();
						hintWord.setContext(_ctx.stringValue("ScanTextResponse.Data.Elements["+ i +"].Results["+ j +"].Details["+ k +"].HintWords["+ l +"].Context"));

						hintWords.add(hintWord);
					}
					detail.setHintWords(hintWords);

					details.add(detail);
				}
				result.setDetails(details);

				results.add(result);
			}
			element.setResults(results);

			elements.add(element);
		}
		data.setElements(elements);
		scanTextResponse.setData(data);
	 
	 	return scanTextResponse;
	}
}