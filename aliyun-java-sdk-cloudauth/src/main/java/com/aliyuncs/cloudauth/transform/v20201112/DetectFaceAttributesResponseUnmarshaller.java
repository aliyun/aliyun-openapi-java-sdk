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

package com.aliyuncs.cloudauth.transform.v20201112;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudauth.model.v20201112.DetectFaceAttributesResponse;
import com.aliyuncs.cloudauth.model.v20201112.DetectFaceAttributesResponse.ResultObject;
import com.aliyuncs.cloudauth.model.v20201112.DetectFaceAttributesResponse.ResultObject.FaceAttributesDetectInfo;
import com.aliyuncs.cloudauth.model.v20201112.DetectFaceAttributesResponse.ResultObject.FaceAttributesDetectInfo.FaceAttributes;
import com.aliyuncs.cloudauth.model.v20201112.DetectFaceAttributesResponse.ResultObject.FaceAttributesDetectInfo.FaceAttributes.Gender;
import com.aliyuncs.cloudauth.model.v20201112.DetectFaceAttributesResponse.ResultObject.FaceAttributesDetectInfo.FaceAttributes.Headpose;
import com.aliyuncs.cloudauth.model.v20201112.DetectFaceAttributesResponse.ResultObject.FaceAttributesDetectInfo.FaceAttributes.Smiling;
import com.aliyuncs.cloudauth.model.v20201112.DetectFaceAttributesResponse.ResultObject.FaceAttributesDetectInfo.FaceRect;
import com.aliyuncs.transform.UnmarshallerContext;


public class DetectFaceAttributesResponseUnmarshaller {

	public static DetectFaceAttributesResponse unmarshall(DetectFaceAttributesResponse detectFaceAttributesResponse, UnmarshallerContext _ctx) {
		
		detectFaceAttributesResponse.setRequestId(_ctx.stringValue("DetectFaceAttributesResponse.RequestId"));
		detectFaceAttributesResponse.setSuccess(_ctx.booleanValue("DetectFaceAttributesResponse.Success"));
		detectFaceAttributesResponse.setCode(_ctx.stringValue("DetectFaceAttributesResponse.Code"));
		detectFaceAttributesResponse.setMessage(_ctx.stringValue("DetectFaceAttributesResponse.Message"));

		ResultObject resultObject = new ResultObject();
		resultObject.setImgWidth(_ctx.integerValue("DetectFaceAttributesResponse.ResultObject.ImgWidth"));
		resultObject.setImgHeight(_ctx.integerValue("DetectFaceAttributesResponse.ResultObject.ImgHeight"));

		List<FaceAttributesDetectInfo> faceInfos = new ArrayList<FaceAttributesDetectInfo>();
		for (int i = 0; i < _ctx.lengthValue("DetectFaceAttributesResponse.ResultObject.FaceInfos.Length"); i++) {
			FaceAttributesDetectInfo faceAttributesDetectInfo = new FaceAttributesDetectInfo();

			FaceRect faceRect = new FaceRect();
			faceRect.setTop(_ctx.integerValue("DetectFaceAttributesResponse.ResultObject.FaceInfos["+ i +"].FaceRect.Top"));
			faceRect.setLeft(_ctx.integerValue("DetectFaceAttributesResponse.ResultObject.FaceInfos["+ i +"].FaceRect.Left"));
			faceRect.setWidth(_ctx.integerValue("DetectFaceAttributesResponse.ResultObject.FaceInfos["+ i +"].FaceRect.Width"));
			faceRect.setHeight(_ctx.integerValue("DetectFaceAttributesResponse.ResultObject.FaceInfos["+ i +"].FaceRect.Height"));
			faceAttributesDetectInfo.setFaceRect(faceRect);

			FaceAttributes faceAttributes = new FaceAttributes();
			faceAttributes.setAge(_ctx.integerValue("DetectFaceAttributesResponse.ResultObject.FaceInfos["+ i +"].FaceAttributes.Age"));
			faceAttributes.setGlasses(_ctx.stringValue("DetectFaceAttributesResponse.ResultObject.FaceInfos["+ i +"].FaceAttributes.Glasses"));
			faceAttributes.setFacetype(_ctx.stringValue("DetectFaceAttributesResponse.ResultObject.FaceInfos["+ i +"].FaceAttributes.Facetype"));
			faceAttributes.setBlur(_ctx.floatValue("DetectFaceAttributesResponse.ResultObject.FaceInfos["+ i +"].FaceAttributes.Blur"));
			faceAttributes.setFacequal(_ctx.floatValue("DetectFaceAttributesResponse.ResultObject.FaceInfos["+ i +"].FaceAttributes.Facequal"));
			faceAttributes.setIntegrity(_ctx.integerValue("DetectFaceAttributesResponse.ResultObject.FaceInfos["+ i +"].FaceAttributes.Integrity"));
			faceAttributes.setRespirator(_ctx.stringValue("DetectFaceAttributesResponse.ResultObject.FaceInfos["+ i +"].FaceAttributes.Respirator"));
			faceAttributes.setAppearanceScore(_ctx.floatValue("DetectFaceAttributesResponse.ResultObject.FaceInfos["+ i +"].FaceAttributes.AppearanceScore"));

			Gender gender = new Gender();
			gender.setScore(_ctx.floatValue("DetectFaceAttributesResponse.ResultObject.FaceInfos["+ i +"].FaceAttributes.Gender.Score"));
			gender.setValue(_ctx.stringValue("DetectFaceAttributesResponse.ResultObject.FaceInfos["+ i +"].FaceAttributes.Gender.Value"));
			faceAttributes.setGender(gender);

			Smiling smiling = new Smiling();
			smiling.setValue(_ctx.floatValue("DetectFaceAttributesResponse.ResultObject.FaceInfos["+ i +"].FaceAttributes.Smiling.Value"));
			smiling.setThreshold(_ctx.floatValue("DetectFaceAttributesResponse.ResultObject.FaceInfos["+ i +"].FaceAttributes.Smiling.Threshold"));
			faceAttributes.setSmiling(smiling);

			Headpose headpose = new Headpose();
			headpose.setPitchAngle(_ctx.floatValue("DetectFaceAttributesResponse.ResultObject.FaceInfos["+ i +"].FaceAttributes.Headpose.PitchAngle"));
			headpose.setRollAngle(_ctx.floatValue("DetectFaceAttributesResponse.ResultObject.FaceInfos["+ i +"].FaceAttributes.Headpose.RollAngle"));
			headpose.setYawAngle(_ctx.floatValue("DetectFaceAttributesResponse.ResultObject.FaceInfos["+ i +"].FaceAttributes.Headpose.YawAngle"));
			faceAttributes.setHeadpose(headpose);
			faceAttributesDetectInfo.setFaceAttributes(faceAttributes);

			faceInfos.add(faceAttributesDetectInfo);
		}
		resultObject.setFaceInfos(faceInfos);
		detectFaceAttributesResponse.setResultObject(resultObject);
	 
	 	return detectFaceAttributesResponse;
	}
}