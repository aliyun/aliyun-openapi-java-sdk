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

import com.aliyuncs.facebody.model.v20191230.DetectVideoLivingFaceResponse;
import com.aliyuncs.facebody.model.v20191230.DetectVideoLivingFaceResponse.Data;
import com.aliyuncs.facebody.model.v20191230.DetectVideoLivingFaceResponse.Data.Element;
import com.aliyuncs.transform.UnmarshallerContext;


public class DetectVideoLivingFaceResponseUnmarshaller {

	public static DetectVideoLivingFaceResponse unmarshall(DetectVideoLivingFaceResponse detectVideoLivingFaceResponse, UnmarshallerContext _ctx) {
		
		detectVideoLivingFaceResponse.setRequestId(_ctx.stringValue("DetectVideoLivingFaceResponse.RequestId"));

		Data data = new Data();

		List<Element> elements = new ArrayList<Element>();
		for (int i = 0; i < _ctx.lengthValue("DetectVideoLivingFaceResponse.Data.Elements.Length"); i++) {
			Element element = new Element();
			element.setLiveConfidence(_ctx.floatValue("DetectVideoLivingFaceResponse.Data.Elements["+ i +"].LiveConfidence"));
			element.setFaceConfidence(_ctx.floatValue("DetectVideoLivingFaceResponse.Data.Elements["+ i +"].FaceConfidence"));

			List<Integer> rect = new ArrayList<Integer>();
			for (int j = 0; j < _ctx.lengthValue("DetectVideoLivingFaceResponse.Data.Elements["+ i +"].Rect.Length"); j++) {
				rect.add(_ctx.integerValue("DetectVideoLivingFaceResponse.Data.Elements["+ i +"].Rect["+ j +"]"));
			}
			element.setRect(rect);

			elements.add(element);
		}
		data.setElements(elements);
		detectVideoLivingFaceResponse.setData(data);
	 
	 	return detectVideoLivingFaceResponse;
	}
}