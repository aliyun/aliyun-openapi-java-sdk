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

import com.aliyuncs.ocr.model.v20191230.RecognizeCharacterResponse;
import com.aliyuncs.ocr.model.v20191230.RecognizeCharacterResponse.Data;
import com.aliyuncs.ocr.model.v20191230.RecognizeCharacterResponse.Data.Result;
import com.aliyuncs.ocr.model.v20191230.RecognizeCharacterResponse.Data.Result.TextRectangles;
import com.aliyuncs.transform.UnmarshallerContext;


public class RecognizeCharacterResponseUnmarshaller {

	public static RecognizeCharacterResponse unmarshall(RecognizeCharacterResponse recognizeCharacterResponse, UnmarshallerContext _ctx) {
		
		recognizeCharacterResponse.setRequestId(_ctx.stringValue("RecognizeCharacterResponse.RequestId"));

		Data data = new Data();

		List<Result> results = new ArrayList<Result>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeCharacterResponse.Data.Results.Length"); i++) {
			Result result = new Result();
			result.setProbability(_ctx.floatValue("RecognizeCharacterResponse.Data.Results["+ i +"].Probability"));
			result.setText(_ctx.stringValue("RecognizeCharacterResponse.Data.Results["+ i +"].Text"));

			TextRectangles textRectangles = new TextRectangles();
			textRectangles.setAngle(_ctx.integerValue("RecognizeCharacterResponse.Data.Results["+ i +"].TextRectangles.Angle"));
			textRectangles.setLeft(_ctx.integerValue("RecognizeCharacterResponse.Data.Results["+ i +"].TextRectangles.Left"));
			textRectangles.setTop(_ctx.integerValue("RecognizeCharacterResponse.Data.Results["+ i +"].TextRectangles.Top"));
			textRectangles.setWidth(_ctx.integerValue("RecognizeCharacterResponse.Data.Results["+ i +"].TextRectangles.Width"));
			textRectangles.setHeight(_ctx.integerValue("RecognizeCharacterResponse.Data.Results["+ i +"].TextRectangles.Height"));
			result.setTextRectangles(textRectangles);

			results.add(result);
		}
		data.setResults(results);
		recognizeCharacterResponse.setData(data);
	 
	 	return recognizeCharacterResponse;
	}
}