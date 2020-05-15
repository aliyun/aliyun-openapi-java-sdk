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

package com.aliyuncs.imagerecog.transform.v20190930;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.imagerecog.model.v20190930.RecognizeLogoResponse;
import com.aliyuncs.imagerecog.model.v20190930.RecognizeLogoResponse.Data;
import com.aliyuncs.imagerecog.model.v20190930.RecognizeLogoResponse.Data.Element;
import com.aliyuncs.imagerecog.model.v20190930.RecognizeLogoResponse.Data.Element.Result;
import com.aliyuncs.imagerecog.model.v20190930.RecognizeLogoResponse.Data.Element.Result.LogoData;
import com.aliyuncs.transform.UnmarshallerContext;


public class RecognizeLogoResponseUnmarshaller {

	public static RecognizeLogoResponse unmarshall(RecognizeLogoResponse recognizeLogoResponse, UnmarshallerContext _ctx) {
		
		recognizeLogoResponse.setRequestId(_ctx.stringValue("RecognizeLogoResponse.RequestId"));

		Data data = new Data();

		List<Element> elements = new ArrayList<Element>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeLogoResponse.Data.Elements.Length"); i++) {
			Element element = new Element();
			element.setTaskId(_ctx.stringValue("RecognizeLogoResponse.Data.Elements["+ i +"].TaskId"));
			element.setImageURL(_ctx.stringValue("RecognizeLogoResponse.Data.Elements["+ i +"].ImageURL"));

			List<Result> results = new ArrayList<Result>();
			for (int j = 0; j < _ctx.lengthValue("RecognizeLogoResponse.Data.Elements["+ i +"].Results.Length"); j++) {
				Result result = new Result();
				result.setLabel(_ctx.stringValue("RecognizeLogoResponse.Data.Elements["+ i +"].Results["+ j +"].Label"));
				result.setSuggestion(_ctx.stringValue("RecognizeLogoResponse.Data.Elements["+ i +"].Results["+ j +"].Suggestion"));
				result.setRate(_ctx.floatValue("RecognizeLogoResponse.Data.Elements["+ i +"].Results["+ j +"].Rate"));

				List<LogoData> logosData = new ArrayList<LogoData>();
				for (int k = 0; k < _ctx.lengthValue("RecognizeLogoResponse.Data.Elements["+ i +"].Results["+ j +"].LogosData.Length"); k++) {
					LogoData logoData = new LogoData();
					logoData.setName(_ctx.stringValue("RecognizeLogoResponse.Data.Elements["+ i +"].Results["+ j +"].LogosData["+ k +"].Name"));
					logoData.setType(_ctx.stringValue("RecognizeLogoResponse.Data.Elements["+ i +"].Results["+ j +"].LogosData["+ k +"].Type"));
					logoData.setX(_ctx.floatValue("RecognizeLogoResponse.Data.Elements["+ i +"].Results["+ j +"].LogosData["+ k +"].X"));
					logoData.setY(_ctx.floatValue("RecognizeLogoResponse.Data.Elements["+ i +"].Results["+ j +"].LogosData["+ k +"].Y"));
					logoData.setH(_ctx.floatValue("RecognizeLogoResponse.Data.Elements["+ i +"].Results["+ j +"].LogosData["+ k +"].H"));
					logoData.setW(_ctx.floatValue("RecognizeLogoResponse.Data.Elements["+ i +"].Results["+ j +"].LogosData["+ k +"].W"));

					logosData.add(logoData);
				}
				result.setLogosData(logosData);

				results.add(result);
			}
			element.setResults(results);

			elements.add(element);
		}
		data.setElements(elements);
		recognizeLogoResponse.setData(data);
	 
	 	return recognizeLogoResponse;
	}
}