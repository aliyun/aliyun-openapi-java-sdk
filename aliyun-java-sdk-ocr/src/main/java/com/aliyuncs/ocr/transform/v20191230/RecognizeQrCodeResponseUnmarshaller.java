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

package com.aliyuncs.ocr.transform.v20191230;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ocr.model.v20191230.RecognizeQrCodeResponse;
import com.aliyuncs.ocr.model.v20191230.RecognizeQrCodeResponse.Data;
import com.aliyuncs.ocr.model.v20191230.RecognizeQrCodeResponse.Data.Element;
import com.aliyuncs.ocr.model.v20191230.RecognizeQrCodeResponse.Data.Element.Result;
import com.aliyuncs.transform.UnmarshallerContext;


public class RecognizeQrCodeResponseUnmarshaller {

	public static RecognizeQrCodeResponse unmarshall(RecognizeQrCodeResponse recognizeQrCodeResponse, UnmarshallerContext _ctx) {
		
		recognizeQrCodeResponse.setRequestId(_ctx.stringValue("RecognizeQrCodeResponse.RequestId"));

		Data data = new Data();

		List<Element> elements = new ArrayList<Element>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeQrCodeResponse.Data.Elements.Length"); i++) {
			Element element = new Element();
			element.setTaskId(_ctx.stringValue("RecognizeQrCodeResponse.Data.Elements["+ i +"].TaskId"));
			element.setImageURL(_ctx.stringValue("RecognizeQrCodeResponse.Data.Elements["+ i +"].ImageURL"));

			List<Result> results = new ArrayList<Result>();
			for (int j = 0; j < _ctx.lengthValue("RecognizeQrCodeResponse.Data.Elements["+ i +"].Results.Length"); j++) {
				Result result = new Result();
				result.setLabel(_ctx.stringValue("RecognizeQrCodeResponse.Data.Elements["+ i +"].Results["+ j +"].Label"));
				result.setSuggestion(_ctx.stringValue("RecognizeQrCodeResponse.Data.Elements["+ i +"].Results["+ j +"].Suggestion"));
				result.setRate(_ctx.floatValue("RecognizeQrCodeResponse.Data.Elements["+ i +"].Results["+ j +"].Rate"));

				List<String> qrCodesData = new ArrayList<String>();
				for (int k = 0; k < _ctx.lengthValue("RecognizeQrCodeResponse.Data.Elements["+ i +"].Results["+ j +"].QrCodesData.Length"); k++) {
					qrCodesData.add(_ctx.stringValue("RecognizeQrCodeResponse.Data.Elements["+ i +"].Results["+ j +"].QrCodesData["+ k +"]"));
				}
				result.setQrCodesData(qrCodesData);

				results.add(result);
			}
			element.setResults(results);

			elements.add(element);
		}
		data.setElements(elements);
		recognizeQrCodeResponse.setData(data);
	 
	 	return recognizeQrCodeResponse;
	}
}