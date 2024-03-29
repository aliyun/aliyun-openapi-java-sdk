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

package com.aliyuncs.cloudauth.transform.v20190307;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudauth.model.v20190307.DetectFaceAttributesResponse;
import com.aliyuncs.cloudauth.model.v20190307.DetectFaceAttributesResponse.Data;
import com.aliyuncs.cloudauth.model.v20190307.DetectFaceAttributesResponse.Data.FaceAttributesDetectInfo;
import com.aliyuncs.cloudauth.model.v20190307.DetectFaceAttributesResponse.Data.FaceAttributesDetectInfo.FaceAttributes;
import com.aliyuncs.cloudauth.model.v20190307.DetectFaceAttributesResponse.Data.FaceAttributesDetectInfo.FaceAttributes.Gender;
import com.aliyuncs.cloudauth.model.v20190307.DetectFaceAttributesResponse.Data.FaceAttributesDetectInfo.FaceAttributes.Headpose;
import com.aliyuncs.cloudauth.model.v20190307.DetectFaceAttributesResponse.Data.FaceAttributesDetectInfo.FaceAttributes.Smiling;
import com.aliyuncs.cloudauth.model.v20190307.DetectFaceAttributesResponse.Data.FaceAttributesDetectInfo.FaceRect;
import com.aliyuncs.transform.UnmarshallerContext;


public class DetectFaceAttributesResponseUnmarshaller {

	public static DetectFaceAttributesResponse unmarshall(DetectFaceAttributesResponse detectFaceAttributesResponse, UnmarshallerContext _ctx) {
		
		detectFaceAttributesResponse.setRequestId(_ctx.stringValue("DetectFaceAttributesResponse.RequestId"));
		detectFaceAttributesResponse.setCode(_ctx.stringValue("DetectFaceAttributesResponse.Code"));
		detectFaceAttributesResponse.setMessage(_ctx.stringValue("DetectFaceAttributesResponse.Message"));
		detectFaceAttributesResponse.setSuccess(_ctx.booleanValue("DetectFaceAttributesResponse.Success"));

		Data data = new Data();
		data.setImgHeight(_ctx.integerValue("DetectFaceAttributesResponse.Data.ImgHeight"));
		data.setImgWidth(_ctx.integerValue("DetectFaceAttributesResponse.Data.ImgWidth"));

		List<FaceAttributesDetectInfo> faceInfos = new ArrayList<FaceAttributesDetectInfo>();
		for (int i = 0; i < _ctx.lengthValue("DetectFaceAttributesResponse.Data.FaceInfos.Length"); i++) {
			FaceAttributesDetectInfo faceAttributesDetectInfo = new FaceAttributesDetectInfo();

			FaceRect faceRect = new FaceRect();
			faceRect.setLeft(_ctx.integerValue("DetectFaceAttributesResponse.Data.FaceInfos["+ i +"].FaceRect.Left"));
			faceRect.setTop(_ctx.integerValue("DetectFaceAttributesResponse.Data.FaceInfos["+ i +"].FaceRect.Top"));
			faceRect.setWidth(_ctx.integerValue("DetectFaceAttributesResponse.Data.FaceInfos["+ i +"].FaceRect.Width"));
			faceRect.setHeight(_ctx.integerValue("DetectFaceAttributesResponse.Data.FaceInfos["+ i +"].FaceRect.Height"));
			faceAttributesDetectInfo.setFaceRect(faceRect);

			FaceAttributes faceAttributes = new FaceAttributes();
			faceAttributes.setGlasses(_ctx.stringValue("DetectFaceAttributesResponse.Data.FaceInfos["+ i +"].FaceAttributes.Glasses"));
			faceAttributes.setFacequal(_ctx.floatValue("DetectFaceAttributesResponse.Data.FaceInfos["+ i +"].FaceAttributes.Facequal"));
			faceAttributes.setIntegrity(_ctx.integerValue("DetectFaceAttributesResponse.Data.FaceInfos["+ i +"].FaceAttributes.Integrity"));
			faceAttributes.setFacetype(_ctx.stringValue("DetectFaceAttributesResponse.Data.FaceInfos["+ i +"].FaceAttributes.Facetype"));
			faceAttributes.setRespirator(_ctx.stringValue("DetectFaceAttributesResponse.Data.FaceInfos["+ i +"].FaceAttributes.Respirator"));
			faceAttributes.setAppearanceScore(_ctx.floatValue("DetectFaceAttributesResponse.Data.FaceInfos["+ i +"].FaceAttributes.AppearanceScore"));
			faceAttributes.setAge(_ctx.integerValue("DetectFaceAttributesResponse.Data.FaceInfos["+ i +"].FaceAttributes.Age"));
			faceAttributes.setBlur(_ctx.floatValue("DetectFaceAttributesResponse.Data.FaceInfos["+ i +"].FaceAttributes.Blur"));

			Gender gender = new Gender();
			gender.setValue(_ctx.stringValue("DetectFaceAttributesResponse.Data.FaceInfos["+ i +"].FaceAttributes.Gender.Value"));
			gender.setScore(_ctx.floatValue("DetectFaceAttributesResponse.Data.FaceInfos["+ i +"].FaceAttributes.Gender.Score"));
			faceAttributes.setGender(gender);

			Smiling smiling = new Smiling();
			smiling.setValue(_ctx.floatValue("DetectFaceAttributesResponse.Data.FaceInfos["+ i +"].FaceAttributes.Smiling.Value"));
			smiling.setThreshold(_ctx.floatValue("DetectFaceAttributesResponse.Data.FaceInfos["+ i +"].FaceAttributes.Smiling.Threshold"));
			faceAttributes.setSmiling(smiling);

			Headpose headpose = new Headpose();
			headpose.setPitchAngle(_ctx.floatValue("DetectFaceAttributesResponse.Data.FaceInfos["+ i +"].FaceAttributes.Headpose.PitchAngle"));
			headpose.setRollAngle(_ctx.floatValue("DetectFaceAttributesResponse.Data.FaceInfos["+ i +"].FaceAttributes.Headpose.RollAngle"));
			headpose.setYawAngle(_ctx.floatValue("DetectFaceAttributesResponse.Data.FaceInfos["+ i +"].FaceAttributes.Headpose.YawAngle"));
			faceAttributes.setHeadpose(headpose);
			faceAttributesDetectInfo.setFaceAttributes(faceAttributes);

			faceInfos.add(faceAttributesDetectInfo);
		}
		data.setFaceInfos(faceInfos);
		detectFaceAttributesResponse.setData(data);
	 
	 	return detectFaceAttributesResponse;
	}
}