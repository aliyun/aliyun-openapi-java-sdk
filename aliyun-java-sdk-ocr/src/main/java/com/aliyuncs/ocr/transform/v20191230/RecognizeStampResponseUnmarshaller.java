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

import com.aliyuncs.ocr.model.v20191230.RecognizeStampResponse;
import com.aliyuncs.ocr.model.v20191230.RecognizeStampResponse.Data;
import com.aliyuncs.ocr.model.v20191230.RecognizeStampResponse.Data.ResultsItem;
import com.aliyuncs.ocr.model.v20191230.RecognizeStampResponse.Data.ResultsItem.GeneralTextItem;
import com.aliyuncs.ocr.model.v20191230.RecognizeStampResponse.Data.ResultsItem.Roi;
import com.aliyuncs.ocr.model.v20191230.RecognizeStampResponse.Data.ResultsItem.Text;
import com.aliyuncs.transform.UnmarshallerContext;


public class RecognizeStampResponseUnmarshaller {

	public static RecognizeStampResponse unmarshall(RecognizeStampResponse recognizeStampResponse, UnmarshallerContext _ctx) {
		
		recognizeStampResponse.setRequestId(_ctx.stringValue("RecognizeStampResponse.RequestId"));

		Data data = new Data();

		List<ResultsItem> results = new ArrayList<ResultsItem>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeStampResponse.Data.Results.Length"); i++) {
			ResultsItem resultsItem = new ResultsItem();

			Roi roi = new Roi();
			roi.setLeft(_ctx.integerValue("RecognizeStampResponse.Data.Results["+ i +"].Roi.Left"));
			roi.setTop(_ctx.integerValue("RecognizeStampResponse.Data.Results["+ i +"].Roi.Top"));
			roi.setWidth(_ctx.integerValue("RecognizeStampResponse.Data.Results["+ i +"].Roi.Width"));
			roi.setHeight(_ctx.integerValue("RecognizeStampResponse.Data.Results["+ i +"].Roi.Height"));
			resultsItem.setRoi(roi);

			Text text = new Text();
			text.setContent(_ctx.stringValue("RecognizeStampResponse.Data.Results["+ i +"].Text.Content"));
			text.setConfidence(_ctx.floatValue("RecognizeStampResponse.Data.Results["+ i +"].Text.Confidence"));
			resultsItem.setText(text);

			List<GeneralTextItem> generalText = new ArrayList<GeneralTextItem>();
			for (int j = 0; j < _ctx.lengthValue("RecognizeStampResponse.Data.Results["+ i +"].GeneralText.Length"); j++) {
				GeneralTextItem generalTextItem = new GeneralTextItem();
				generalTextItem.setContent(_ctx.stringValue("RecognizeStampResponse.Data.Results["+ i +"].GeneralText["+ j +"].Content"));
				generalTextItem.setConfidence(_ctx.floatValue("RecognizeStampResponse.Data.Results["+ i +"].GeneralText["+ j +"].Confidence"));

				generalText.add(generalTextItem);
			}
			resultsItem.setGeneralText(generalText);

			results.add(resultsItem);
		}
		data.setResults(results);
		recognizeStampResponse.setData(data);
	 
	 	return recognizeStampResponse;
	}
}