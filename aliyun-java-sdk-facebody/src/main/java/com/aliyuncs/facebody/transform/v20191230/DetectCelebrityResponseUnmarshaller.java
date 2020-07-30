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

import com.aliyuncs.facebody.model.v20191230.DetectCelebrityResponse;
import com.aliyuncs.facebody.model.v20191230.DetectCelebrityResponse.Data;
import com.aliyuncs.facebody.model.v20191230.DetectCelebrityResponse.Data.FaceRecognizeResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class DetectCelebrityResponseUnmarshaller {

	public static DetectCelebrityResponse unmarshall(DetectCelebrityResponse detectCelebrityResponse, UnmarshallerContext _ctx) {
		
		detectCelebrityResponse.setRequestId(_ctx.stringValue("DetectCelebrityResponse.RequestId"));

		Data data = new Data();
		data.setWidth(_ctx.integerValue("DetectCelebrityResponse.Data.Width"));
		data.setHeight(_ctx.integerValue("DetectCelebrityResponse.Data.Height"));

		List<FaceRecognizeResult> faceRecognizeResults = new ArrayList<FaceRecognizeResult>();
		for (int i = 0; i < _ctx.lengthValue("DetectCelebrityResponse.Data.FaceRecognizeResults.Length"); i++) {
			FaceRecognizeResult faceRecognizeResult = new FaceRecognizeResult();
			faceRecognizeResult.setName(_ctx.stringValue("DetectCelebrityResponse.Data.FaceRecognizeResults["+ i +"].Name"));

			List<Float> faceBoxes = new ArrayList<Float>();
			for (int j = 0; j < _ctx.lengthValue("DetectCelebrityResponse.Data.FaceRecognizeResults["+ i +"].FaceBoxes.Length"); j++) {
				faceBoxes.add(_ctx.floatValue("DetectCelebrityResponse.Data.FaceRecognizeResults["+ i +"].FaceBoxes["+ j +"]"));
			}
			faceRecognizeResult.setFaceBoxes(faceBoxes);

			faceRecognizeResults.add(faceRecognizeResult);
		}
		data.setFaceRecognizeResults(faceRecognizeResults);
		detectCelebrityResponse.setData(data);
	 
	 	return detectCelebrityResponse;
	}
}