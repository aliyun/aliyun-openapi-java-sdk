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

import com.aliyuncs.ocr.model.v20191230.RecognizePoiNameResponse;
import com.aliyuncs.ocr.model.v20191230.RecognizePoiNameResponse.Data;
import com.aliyuncs.ocr.model.v20191230.RecognizePoiNameResponse.Data.SignboardsItem;
import com.aliyuncs.ocr.model.v20191230.RecognizePoiNameResponse.Data.SignboardsItem.TextsItem;
import com.aliyuncs.ocr.model.v20191230.RecognizePoiNameResponse.Data.Summary;
import com.aliyuncs.transform.UnmarshallerContext;


public class RecognizePoiNameResponseUnmarshaller {

	public static RecognizePoiNameResponse unmarshall(RecognizePoiNameResponse recognizePoiNameResponse, UnmarshallerContext _ctx) {
		
		recognizePoiNameResponse.setRequestId(_ctx.stringValue("RecognizePoiNameResponse.RequestId"));

		Data data = new Data();

		Summary summary = new Summary();
		summary.setBrand(_ctx.stringValue("RecognizePoiNameResponse.Data.Summary.Brand"));
		summary.setScore(_ctx.floatValue("RecognizePoiNameResponse.Data.Summary.Score"));
		data.setSummary(summary);

		List<SignboardsItem> signboards = new ArrayList<SignboardsItem>();
		for (int i = 0; i < _ctx.lengthValue("RecognizePoiNameResponse.Data.Signboards.Length"); i++) {
			SignboardsItem signboardsItem = new SignboardsItem();

			List<TextsItem> texts = new ArrayList<TextsItem>();
			for (int j = 0; j < _ctx.lengthValue("RecognizePoiNameResponse.Data.Signboards["+ i +"].Texts.Length"); j++) {
				TextsItem textsItem = new TextsItem();
				textsItem.setLabel(_ctx.stringValue("RecognizePoiNameResponse.Data.Signboards["+ i +"].Texts["+ j +"].Label"));
				textsItem.setScore(_ctx.floatValue("RecognizePoiNameResponse.Data.Signboards["+ i +"].Texts["+ j +"].Score"));
				textsItem.setTag(_ctx.stringValue("RecognizePoiNameResponse.Data.Signboards["+ i +"].Texts["+ j +"].Tag"));
				textsItem.setType(_ctx.stringValue("RecognizePoiNameResponse.Data.Signboards["+ i +"].Texts["+ j +"].Type"));

				List<Integer> points = new ArrayList<Integer>();
				for (int k = 0; k < _ctx.lengthValue("RecognizePoiNameResponse.Data.Signboards["+ i +"].Texts["+ j +"].Points.Length"); k++) {
					points.add(_ctx.integerValue("RecognizePoiNameResponse.Data.Signboards["+ i +"].Texts["+ j +"].Points["+ k +"]"));
				}
				textsItem.setPoints(points);

				texts.add(textsItem);
			}
			signboardsItem.setTexts(texts);

			signboards.add(signboardsItem);
		}
		data.setSignboards(signboards);
		recognizePoiNameResponse.setData(data);
	 
	 	return recognizePoiNameResponse;
	}
}