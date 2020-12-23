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

import com.aliyuncs.facebody.model.v20191230.RecognizePublicFaceResponse;
import com.aliyuncs.facebody.model.v20191230.RecognizePublicFaceResponse.Data;
import com.aliyuncs.facebody.model.v20191230.RecognizePublicFaceResponse.Data.Element;
import com.aliyuncs.facebody.model.v20191230.RecognizePublicFaceResponse.Data.Element.Result;
import com.aliyuncs.facebody.model.v20191230.RecognizePublicFaceResponse.Data.Element.Result.SubResult;
import com.aliyuncs.facebody.model.v20191230.RecognizePublicFaceResponse.Data.Element.Result.SubResult.Face;
import com.aliyuncs.transform.UnmarshallerContext;


public class RecognizePublicFaceResponseUnmarshaller {

	public static RecognizePublicFaceResponse unmarshall(RecognizePublicFaceResponse recognizePublicFaceResponse, UnmarshallerContext _ctx) {
		
		recognizePublicFaceResponse.setRequestId(_ctx.stringValue("RecognizePublicFaceResponse.RequestId"));

		Data data = new Data();

		List<Element> elements = new ArrayList<Element>();
		for (int i = 0; i < _ctx.lengthValue("RecognizePublicFaceResponse.Data.Elements.Length"); i++) {
			Element element = new Element();
			element.setTaskId(_ctx.stringValue("RecognizePublicFaceResponse.Data.Elements["+ i +"].TaskId"));
			element.setImageURL(_ctx.stringValue("RecognizePublicFaceResponse.Data.Elements["+ i +"].ImageURL"));

			List<Result> results = new ArrayList<Result>();
			for (int j = 0; j < _ctx.lengthValue("RecognizePublicFaceResponse.Data.Elements["+ i +"].Results.Length"); j++) {
				Result result = new Result();
				result.setLabel(_ctx.stringValue("RecognizePublicFaceResponse.Data.Elements["+ i +"].Results["+ j +"].Label"));
				result.setSuggestion(_ctx.stringValue("RecognizePublicFaceResponse.Data.Elements["+ i +"].Results["+ j +"].Suggestion"));
				result.setRate(_ctx.floatValue("RecognizePublicFaceResponse.Data.Elements["+ i +"].Results["+ j +"].Rate"));

				List<SubResult> subResults = new ArrayList<SubResult>();
				for (int k = 0; k < _ctx.lengthValue("RecognizePublicFaceResponse.Data.Elements["+ i +"].Results["+ j +"].SubResults.Length"); k++) {
					SubResult subResult = new SubResult();
					subResult.setH(_ctx.floatValue("RecognizePublicFaceResponse.Data.Elements["+ i +"].Results["+ j +"].SubResults["+ k +"].H"));
					subResult.setW(_ctx.floatValue("RecognizePublicFaceResponse.Data.Elements["+ i +"].Results["+ j +"].SubResults["+ k +"].W"));
					subResult.setX(_ctx.floatValue("RecognizePublicFaceResponse.Data.Elements["+ i +"].Results["+ j +"].SubResults["+ k +"].X"));
					subResult.setY(_ctx.floatValue("RecognizePublicFaceResponse.Data.Elements["+ i +"].Results["+ j +"].SubResults["+ k +"].Y"));

					List<Face> faces = new ArrayList<Face>();
					for (int l = 0; l < _ctx.lengthValue("RecognizePublicFaceResponse.Data.Elements["+ i +"].Results["+ j +"].SubResults["+ k +"].Faces.Length"); l++) {
						Face face = new Face();
						face.setId(_ctx.stringValue("RecognizePublicFaceResponse.Data.Elements["+ i +"].Results["+ j +"].SubResults["+ k +"].Faces["+ l +"].Id"));
						face.setName(_ctx.stringValue("RecognizePublicFaceResponse.Data.Elements["+ i +"].Results["+ j +"].SubResults["+ k +"].Faces["+ l +"].Name"));
						face.setRate(_ctx.floatValue("RecognizePublicFaceResponse.Data.Elements["+ i +"].Results["+ j +"].SubResults["+ k +"].Faces["+ l +"].Rate"));

						faces.add(face);
					}
					subResult.setFaces(faces);

					subResults.add(subResult);
				}
				result.setSubResults(subResults);

				results.add(result);
			}
			element.setResults(results);

			elements.add(element);
		}
		data.setElements(elements);
		recognizePublicFaceResponse.setData(data);
	 
	 	return recognizePublicFaceResponse;
	}
}