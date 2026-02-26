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

package com.aliyuncs.facebody.transform.v20191230;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.facebody.model.v20191230.DetectInfraredLivingFaceResponse;
import com.aliyuncs.facebody.model.v20191230.DetectInfraredLivingFaceResponse.Data;
import com.aliyuncs.facebody.model.v20191230.DetectInfraredLivingFaceResponse.Data.ElementsItem;
import com.aliyuncs.facebody.model.v20191230.DetectInfraredLivingFaceResponse.Data.ElementsItem.ResultsItem;
import com.aliyuncs.facebody.model.v20191230.DetectInfraredLivingFaceResponse.Data.ElementsItem.ResultsItem.Rect;
import com.aliyuncs.transform.UnmarshallerContext;


public class DetectInfraredLivingFaceResponseUnmarshaller {

	public static DetectInfraredLivingFaceResponse unmarshall(DetectInfraredLivingFaceResponse detectInfraredLivingFaceResponse, UnmarshallerContext _ctx) {
		
		detectInfraredLivingFaceResponse.setRequestId(_ctx.stringValue("DetectInfraredLivingFaceResponse.RequestId"));
		detectInfraredLivingFaceResponse.setCode(_ctx.stringValue("DetectInfraredLivingFaceResponse.Code"));
		detectInfraredLivingFaceResponse.setMessage(_ctx.stringValue("DetectInfraredLivingFaceResponse.Message"));

		Data data = new Data();

		List<ElementsItem> elements = new ArrayList<ElementsItem>();
		for (int i = 0; i < _ctx.lengthValue("DetectInfraredLivingFaceResponse.Data.Elements.Length"); i++) {
			ElementsItem elementsItem = new ElementsItem();
			elementsItem.setFaceNumber(_ctx.longValue("DetectInfraredLivingFaceResponse.Data.Elements["+ i +"].FaceNumber"));
			elementsItem.setImageURL(_ctx.stringValue("DetectInfraredLivingFaceResponse.Data.Elements["+ i +"].ImageURL"));

			List<ResultsItem> results = new ArrayList<ResultsItem>();
			for (int j = 0; j < _ctx.lengthValue("DetectInfraredLivingFaceResponse.Data.Elements["+ i +"].Results.Length"); j++) {
				ResultsItem resultsItem = new ResultsItem();
				resultsItem.setLabel(_ctx.stringValue("DetectInfraredLivingFaceResponse.Data.Elements["+ i +"].Results["+ j +"].Label"));
				resultsItem.setRate(_ctx.floatValue("DetectInfraredLivingFaceResponse.Data.Elements["+ i +"].Results["+ j +"].Rate"));
				resultsItem.setSuggestion(_ctx.stringValue("DetectInfraredLivingFaceResponse.Data.Elements["+ i +"].Results["+ j +"].Suggestion"));
				resultsItem.setMessageTips(_ctx.stringValue("DetectInfraredLivingFaceResponse.Data.Elements["+ i +"].Results["+ j +"].MessageTips"));

				Rect rect = new Rect();
				rect.setHeight(_ctx.longValue("DetectInfraredLivingFaceResponse.Data.Elements["+ i +"].Results["+ j +"].Rect.Height"));
				rect.setWidth(_ctx.longValue("DetectInfraredLivingFaceResponse.Data.Elements["+ i +"].Results["+ j +"].Rect.Width"));
				rect.setTop(_ctx.longValue("DetectInfraredLivingFaceResponse.Data.Elements["+ i +"].Results["+ j +"].Rect.Top"));
				rect.setLeft(_ctx.longValue("DetectInfraredLivingFaceResponse.Data.Elements["+ i +"].Results["+ j +"].Rect.Left"));
				resultsItem.setRect(rect);

				results.add(resultsItem);
			}
			elementsItem.setResults(results);

			elements.add(elementsItem);
		}
		data.setElements(elements);
		detectInfraredLivingFaceResponse.setData(data);
	 
	 	return detectInfraredLivingFaceResponse;
	}
}