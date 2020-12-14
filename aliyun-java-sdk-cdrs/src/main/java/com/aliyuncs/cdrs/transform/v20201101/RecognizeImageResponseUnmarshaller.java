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

package com.aliyuncs.cdrs.transform.v20201101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cdrs.model.v20201101.RecognizeImageResponse;
import com.aliyuncs.cdrs.model.v20201101.RecognizeImageResponse.Data;
import com.aliyuncs.cdrs.model.v20201101.RecognizeImageResponse.Data.BodyListItem;
import com.aliyuncs.cdrs.model.v20201101.RecognizeImageResponse.Data.FaceListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class RecognizeImageResponseUnmarshaller {

	public static RecognizeImageResponse unmarshall(RecognizeImageResponse recognizeImageResponse, UnmarshallerContext _ctx) {
		
		recognizeImageResponse.setRequestId(_ctx.stringValue("RecognizeImageResponse.RequestId"));
		recognizeImageResponse.setCode(_ctx.stringValue("RecognizeImageResponse.Code"));
		recognizeImageResponse.setMessage(_ctx.stringValue("RecognizeImageResponse.Message"));
		recognizeImageResponse.setSuccess(_ctx.stringValue("RecognizeImageResponse.Success"));

		Data data = new Data();

		List<BodyListItem> bodyList = new ArrayList<BodyListItem>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeImageResponse.Data.BodyList.Length"); i++) {
			BodyListItem bodyListItem = new BodyListItem();
			bodyListItem.setLeftTopX(_ctx.integerValue("RecognizeImageResponse.Data.BodyList["+ i +"].LeftTopX"));
			bodyListItem.setLeftTopY(_ctx.integerValue("RecognizeImageResponse.Data.BodyList["+ i +"].LeftTopY"));
			bodyListItem.setRightBottomX(_ctx.integerValue("RecognizeImageResponse.Data.BodyList["+ i +"].RightBottomX"));
			bodyListItem.setRightBottomY(_ctx.integerValue("RecognizeImageResponse.Data.BodyList["+ i +"].RightBottomY"));
			bodyListItem.setFeature(_ctx.stringValue("RecognizeImageResponse.Data.BodyList["+ i +"].Feature"));

			bodyList.add(bodyListItem);
		}
		data.setBodyList(bodyList);

		List<FaceListItem> faceList = new ArrayList<FaceListItem>();
		for (int i = 0; i < _ctx.lengthValue("RecognizeImageResponse.Data.FaceList.Length"); i++) {
			FaceListItem faceListItem = new FaceListItem();
			faceListItem.setLeftTopX(_ctx.integerValue("RecognizeImageResponse.Data.FaceList["+ i +"].LeftTopX"));
			faceListItem.setLeftTopY(_ctx.integerValue("RecognizeImageResponse.Data.FaceList["+ i +"].LeftTopY"));
			faceListItem.setRightBottomX(_ctx.integerValue("RecognizeImageResponse.Data.FaceList["+ i +"].RightBottomX"));
			faceListItem.setRightBottomY(_ctx.integerValue("RecognizeImageResponse.Data.FaceList["+ i +"].RightBottomY"));
			faceListItem.setFaceQuality(_ctx.floatValue("RecognizeImageResponse.Data.FaceList["+ i +"].FaceQuality"));
			faceListItem.setFaceKeyPointQuality(_ctx.floatValue("RecognizeImageResponse.Data.FaceList["+ i +"].FaceKeyPointQuality"));
			faceListItem.setFeature(_ctx.stringValue("RecognizeImageResponse.Data.FaceList["+ i +"].Feature"));

			faceList.add(faceListItem);
		}
		data.setFaceList(faceList);
		recognizeImageResponse.setData(data);
	 
	 	return recognizeImageResponse;
	}
}