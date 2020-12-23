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

import com.aliyuncs.facebody.model.v20191230.RecognizeExpressionResponse;
import com.aliyuncs.facebody.model.v20191230.RecognizeExpressionResponse.Data;
import com.aliyuncs.facebody.model.v20191230.RecognizeExpressionResponse.Data.Element;
import com.aliyuncs.facebody.model.v20191230.RecognizeExpressionResponse.Data.Element.FaceRectangle;
import com.aliyuncs.transform.UnmarshallerContext;


public class RecognizeExpressionResponseUnmarshaller {

	public static RecognizeExpressionResponse unmarshall(RecognizeExpressionResponse recognizeExpressionResponse, UnmarshallerContext _ctx) {
		
		recognizeExpressionResponse.setRequestId(_ctx.stringValue("RecognizeExpressionResponse.RequestId"));

		Data data = new Data();

		List<Element> elements = new ArrayList<Element>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeExpressionResponse.Data.Elements.Length"); i++) {
			Element element = new Element();
			element.setExpression(_ctx.stringValue("RecognizeExpressionResponse.Data.Elements["+ i +"].Expression"));
			element.setFaceProbability(_ctx.floatValue("RecognizeExpressionResponse.Data.Elements["+ i +"].FaceProbability"));

			FaceRectangle faceRectangle = new FaceRectangle();
			faceRectangle.setHeight(_ctx.integerValue("RecognizeExpressionResponse.Data.Elements["+ i +"].FaceRectangle.Height"));
			faceRectangle.setLeft(_ctx.integerValue("RecognizeExpressionResponse.Data.Elements["+ i +"].FaceRectangle.Left"));
			faceRectangle.setTop(_ctx.integerValue("RecognizeExpressionResponse.Data.Elements["+ i +"].FaceRectangle.Top"));
			faceRectangle.setWidth(_ctx.integerValue("RecognizeExpressionResponse.Data.Elements["+ i +"].FaceRectangle.Width"));
			element.setFaceRectangle(faceRectangle);

			elements.add(element);
		}
		data.setElements(elements);
		recognizeExpressionResponse.setData(data);
	 
	 	return recognizeExpressionResponse;
	}
}