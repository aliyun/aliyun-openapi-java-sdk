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

package com.aliyuncs.linkvisual.transform.v20180120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.linkvisual.model.v20180120.DetectUserFaceByUrlResponse;
import com.aliyuncs.linkvisual.model.v20180120.DetectUserFaceByUrlResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DetectUserFaceByUrlResponseUnmarshaller {

	public static DetectUserFaceByUrlResponse unmarshall(DetectUserFaceByUrlResponse detectUserFaceByUrlResponse, UnmarshallerContext _ctx) {
		
		detectUserFaceByUrlResponse.setRequestId(_ctx.stringValue("DetectUserFaceByUrlResponse.RequestId"));
		detectUserFaceByUrlResponse.setSuccess(_ctx.booleanValue("DetectUserFaceByUrlResponse.Success"));
		detectUserFaceByUrlResponse.setCode(_ctx.stringValue("DetectUserFaceByUrlResponse.Code"));
		detectUserFaceByUrlResponse.setErrorMessage(_ctx.stringValue("DetectUserFaceByUrlResponse.ErrorMessage"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("DetectUserFaceByUrlResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setFaceProbability(_ctx.floatValue("DetectUserFaceByUrlResponse.Data["+ i +"].FaceProbability"));
			dataItem.setAge(_ctx.integerValue("DetectUserFaceByUrlResponse.Data["+ i +"].Age"));
			dataItem.setGender(_ctx.integerValue("DetectUserFaceByUrlResponse.Data["+ i +"].Gender"));
			dataItem.setBlurScore(_ctx.floatValue("DetectUserFaceByUrlResponse.Data["+ i +"].BlurScore"));
			dataItem.setPoseScore(_ctx.floatValue("DetectUserFaceByUrlResponse.Data["+ i +"].PoseScore"));
			dataItem.setOcclusionScore(_ctx.floatValue("DetectUserFaceByUrlResponse.Data["+ i +"].OcclusionScore"));
			dataItem.setGoodForLibrary(_ctx.booleanValue("DetectUserFaceByUrlResponse.Data["+ i +"].GoodForLibrary"));
			dataItem.setGoodForRecognition(_ctx.booleanValue("DetectUserFaceByUrlResponse.Data["+ i +"].GoodForRecognition"));

			List<String> faceRects = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DetectUserFaceByUrlResponse.Data["+ i +"].FaceRects.Length"); j++) {
				faceRects.add(_ctx.stringValue("DetectUserFaceByUrlResponse.Data["+ i +"].FaceRects["+ j +"]"));
			}
			dataItem.setFaceRects(faceRects);

			List<String> landmarks = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DetectUserFaceByUrlResponse.Data["+ i +"].Landmarks.Length"); j++) {
				landmarks.add(_ctx.stringValue("DetectUserFaceByUrlResponse.Data["+ i +"].Landmarks["+ j +"]"));
			}
			dataItem.setLandmarks(landmarks);

			data.add(dataItem);
		}
		detectUserFaceByUrlResponse.setData(data);
	 
	 	return detectUserFaceByUrlResponse;
	}
}