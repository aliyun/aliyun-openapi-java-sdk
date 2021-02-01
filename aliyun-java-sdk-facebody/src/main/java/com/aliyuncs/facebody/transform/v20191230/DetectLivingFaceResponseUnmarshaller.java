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

import com.aliyuncs.facebody.model.v20191230.DetectLivingFaceResponse;
import com.aliyuncs.facebody.model.v20191230.DetectLivingFaceResponse.Data;
import com.aliyuncs.facebody.model.v20191230.DetectLivingFaceResponse.Data.Element;
import com.aliyuncs.facebody.model.v20191230.DetectLivingFaceResponse.Data.Element.Result;
import com.aliyuncs.facebody.model.v20191230.DetectLivingFaceResponse.Data.Element.Result.Frame;
import com.aliyuncs.transform.UnmarshallerContext;


public class DetectLivingFaceResponseUnmarshaller {

	public static DetectLivingFaceResponse unmarshall(DetectLivingFaceResponse detectLivingFaceResponse, UnmarshallerContext _ctx) {
		
		detectLivingFaceResponse.setRequestId(_ctx.stringValue("DetectLivingFaceResponse.RequestId"));

		Data data = new Data();

		List<Element> elements = new ArrayList<Element>();
		for (int i = 0; i < _ctx.lengthValue("DetectLivingFaceResponse.Data.Elements.Length"); i++) {
			Element element = new Element();
			element.setTaskId(_ctx.stringValue("DetectLivingFaceResponse.Data.Elements["+ i +"].TaskId"));
			element.setImageURL(_ctx.stringValue("DetectLivingFaceResponse.Data.Elements["+ i +"].ImageURL"));

			List<Result> results = new ArrayList<Result>();
			for (int j = 0; j < _ctx.lengthValue("DetectLivingFaceResponse.Data.Elements["+ i +"].Results.Length"); j++) {
				Result result = new Result();
				result.setLabel(_ctx.stringValue("DetectLivingFaceResponse.Data.Elements["+ i +"].Results["+ j +"].Label"));
				result.setSuggestion(_ctx.stringValue("DetectLivingFaceResponse.Data.Elements["+ i +"].Results["+ j +"].Suggestion"));
				result.setRate(_ctx.floatValue("DetectLivingFaceResponse.Data.Elements["+ i +"].Results["+ j +"].Rate"));

				List<Frame> frames = new ArrayList<Frame>();
				for (int k = 0; k < _ctx.lengthValue("DetectLivingFaceResponse.Data.Elements["+ i +"].Results["+ j +"].Frames.Length"); k++) {
					Frame frame = new Frame();
					frame.setRate(_ctx.floatValue("DetectLivingFaceResponse.Data.Elements["+ i +"].Results["+ j +"].Frames["+ k +"].Rate"));
					frame.setUrl(_ctx.stringValue("DetectLivingFaceResponse.Data.Elements["+ i +"].Results["+ j +"].Frames["+ k +"].Url"));

					frames.add(frame);
				}
				result.setFrames(frames);

				results.add(result);
			}
			element.setResults(results);

			elements.add(element);
		}
		data.setElements(elements);
		detectLivingFaceResponse.setData(data);
	 
	 	return detectLivingFaceResponse;
	}
}