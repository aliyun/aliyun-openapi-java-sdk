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

package com.aliyuncs.vcs.transform.v20200515;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vcs.model.v20200515.RecognizeImageResponse;
import com.aliyuncs.vcs.model.v20200515.RecognizeImageResponse.Data;
import com.aliyuncs.vcs.model.v20200515.RecognizeImageResponse.Data.Body;
import com.aliyuncs.vcs.model.v20200515.RecognizeImageResponse.Data.Face;
import com.aliyuncs.transform.UnmarshallerContext;


public class RecognizeImageResponseUnmarshaller {

	public static RecognizeImageResponse unmarshall(RecognizeImageResponse recognizeImageResponse, UnmarshallerContext _ctx) {
		
		recognizeImageResponse.setRequestId(_ctx.stringValue("RecognizeImageResponse.RequestId"));
		recognizeImageResponse.setMessage(_ctx.stringValue("RecognizeImageResponse.Message"));
		recognizeImageResponse.setCode(_ctx.stringValue("RecognizeImageResponse.Code"));

		Data data = new Data();

		List<Body> bodyList = new ArrayList<Body>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeImageResponse.Data.BodyList.Length"); i++) {
			Body body = new Body();
			body.setRespiratorColor(_ctx.stringValue("RecognizeImageResponse.Data.BodyList["+ i +"].RespiratorColor"));
			body.setRightBottomY(_ctx.stringValue("RecognizeImageResponse.Data.BodyList["+ i +"].RightBottomY"));
			body.setFeature(_ctx.stringValue("RecognizeImageResponse.Data.BodyList["+ i +"].Feature"));
			body.setLeftTopY(_ctx.stringValue("RecognizeImageResponse.Data.BodyList["+ i +"].LeftTopY"));
			body.setImageBaseSixFour(_ctx.stringValue("RecognizeImageResponse.Data.BodyList["+ i +"].ImageBaseSixFour"));
			body.setFileName(_ctx.stringValue("RecognizeImageResponse.Data.BodyList["+ i +"].FileName"));
			body.setRightBottomX(_ctx.stringValue("RecognizeImageResponse.Data.BodyList["+ i +"].RightBottomX"));
			body.setLocalFeature(_ctx.stringValue("RecognizeImageResponse.Data.BodyList["+ i +"].LocalFeature"));
			body.setLeftTopX(_ctx.stringValue("RecognizeImageResponse.Data.BodyList["+ i +"].LeftTopX"));

			bodyList.add(body);
		}
		data.setBodyList(bodyList);

		List<Face> faceList = new ArrayList<Face>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeImageResponse.Data.FaceList.Length"); i++) {
			Face face = new Face();
			face.setQuality(_ctx.floatValue("RecognizeImageResponse.Data.FaceList["+ i +"].Quality"));
			face.setRespiratorColor(_ctx.stringValue("RecognizeImageResponse.Data.FaceList["+ i +"].RespiratorColor"));
			face.setKeyPointQuality(_ctx.floatValue("RecognizeImageResponse.Data.FaceList["+ i +"].KeyPointQuality"));
			face.setRightBottomY(_ctx.stringValue("RecognizeImageResponse.Data.FaceList["+ i +"].RightBottomY"));
			face.setFeature(_ctx.stringValue("RecognizeImageResponse.Data.FaceList["+ i +"].Feature"));
			face.setLeftTopY(_ctx.stringValue("RecognizeImageResponse.Data.FaceList["+ i +"].LeftTopY"));
			face.setImageBaseSixFour(_ctx.stringValue("RecognizeImageResponse.Data.FaceList["+ i +"].ImageBaseSixFour"));
			face.setFileName(_ctx.stringValue("RecognizeImageResponse.Data.FaceList["+ i +"].FileName"));
			face.setRightBottomX(_ctx.stringValue("RecognizeImageResponse.Data.FaceList["+ i +"].RightBottomX"));
			face.setLocalFeature(_ctx.stringValue("RecognizeImageResponse.Data.FaceList["+ i +"].LocalFeature"));
			face.setLeftTopX(_ctx.stringValue("RecognizeImageResponse.Data.FaceList["+ i +"].LeftTopX"));

			faceList.add(face);
		}
		data.setFaceList(faceList);
		recognizeImageResponse.setData(data);
	 
	 	return recognizeImageResponse;
	}
}