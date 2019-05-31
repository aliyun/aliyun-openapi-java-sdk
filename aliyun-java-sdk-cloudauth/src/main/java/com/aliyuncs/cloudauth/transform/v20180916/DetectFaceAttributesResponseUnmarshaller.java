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

package com.aliyuncs.cloudauth.transform.v20180916;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudauth.model.v20180916.DetectFaceAttributesResponse;
import com.aliyuncs.cloudauth.model.v20180916.DetectFaceAttributesResponse.Data;
import com.aliyuncs.cloudauth.model.v20180916.DetectFaceAttributesResponse.Data.FaceAttributesDetectInfo;
import com.aliyuncs.cloudauth.model.v20180916.DetectFaceAttributesResponse.Data.FaceAttributesDetectInfo.FaceAttributes;
import com.aliyuncs.cloudauth.model.v20180916.DetectFaceAttributesResponse.Data.FaceAttributesDetectInfo.FaceAttributes.Gender;
import com.aliyuncs.cloudauth.model.v20180916.DetectFaceAttributesResponse.Data.FaceAttributesDetectInfo.FaceAttributes.Headpose;
import com.aliyuncs.cloudauth.model.v20180916.DetectFaceAttributesResponse.Data.FaceAttributesDetectInfo.FaceAttributes.Smiling;
import com.aliyuncs.cloudauth.model.v20180916.DetectFaceAttributesResponse.Data.FaceAttributesDetectInfo.FaceRect;
import com.aliyuncs.transform.UnmarshallerContext;


public class DetectFaceAttributesResponseUnmarshaller {

	public static DetectFaceAttributesResponse unmarshall(DetectFaceAttributesResponse detectFaceAttributesResponse, UnmarshallerContext context) {
		
		detectFaceAttributesResponse.setRequestId(context.stringValue("DetectFaceAttributesResponse.RequestId"));
		detectFaceAttributesResponse.setSuccess(context.booleanValue("DetectFaceAttributesResponse.Success"));
		detectFaceAttributesResponse.setCode(context.stringValue("DetectFaceAttributesResponse.Code"));
		detectFaceAttributesResponse.setMessage(context.stringValue("DetectFaceAttributesResponse.Message"));

		Data data = new Data();
		data.setImgWidth(context.integerValue("DetectFaceAttributesResponse.Data.ImgWidth"));
		data.setImgHeight(context.integerValue("DetectFaceAttributesResponse.Data.ImgHeight"));

		List<FaceAttributesDetectInfo> faceInfos = new ArrayList<FaceAttributesDetectInfo>();
		for (int i = 0; i < context.lengthValue("DetectFaceAttributesResponse.Data.FaceInfos.Length"); i++) {
			FaceAttributesDetectInfo faceAttributesDetectInfo = new FaceAttributesDetectInfo();

			FaceRect faceRect = new FaceRect();
			faceRect.setTop(context.integerValue("DetectFaceAttributesResponse.Data.FaceInfos["+ i +"].FaceRect.Top"));
			faceRect.setLeft(context.integerValue("DetectFaceAttributesResponse.Data.FaceInfos["+ i +"].FaceRect.Left"));
			faceRect.setWidth(context.integerValue("DetectFaceAttributesResponse.Data.FaceInfos["+ i +"].FaceRect.Width"));
			faceRect.setHeight(context.integerValue("DetectFaceAttributesResponse.Data.FaceInfos["+ i +"].FaceRect.Height"));
			faceAttributesDetectInfo.setFaceRect(faceRect);

			FaceAttributes faceAttributes = new FaceAttributes();
			faceAttributes.setAge(context.integerValue("DetectFaceAttributesResponse.Data.FaceInfos["+ i +"].FaceAttributes.Age"));
			faceAttributes.setGlasses(context.stringValue("DetectFaceAttributesResponse.Data.FaceInfos["+ i +"].FaceAttributes.Glasses"));
			faceAttributes.setFacetype(context.stringValue("DetectFaceAttributesResponse.Data.FaceInfos["+ i +"].FaceAttributes.Facetype"));
			faceAttributes.setBlur(context.floatValue("DetectFaceAttributesResponse.Data.FaceInfos["+ i +"].FaceAttributes.Blur"));
			faceAttributes.setEthnicity(context.stringValue("DetectFaceAttributesResponse.Data.FaceInfos["+ i +"].FaceAttributes.Ethnicity"));

			Gender gender = new Gender();
			gender.setScore(context.floatValue("DetectFaceAttributesResponse.Data.FaceInfos["+ i +"].FaceAttributes.Gender.Score"));
			gender.setValue(context.stringValue("DetectFaceAttributesResponse.Data.FaceInfos["+ i +"].FaceAttributes.Gender.Value"));
			faceAttributes.setGender(gender);

			Smiling smiling = new Smiling();
			smiling.setValue(context.floatValue("DetectFaceAttributesResponse.Data.FaceInfos["+ i +"].FaceAttributes.Smiling.Value"));
			smiling.setThreshold(context.floatValue("DetectFaceAttributesResponse.Data.FaceInfos["+ i +"].FaceAttributes.Smiling.Threshold"));
			faceAttributes.setSmiling(smiling);

			Headpose headpose = new Headpose();
			headpose.setPitchAngle(context.floatValue("DetectFaceAttributesResponse.Data.FaceInfos["+ i +"].FaceAttributes.Headpose.PitchAngle"));
			headpose.setRollAngle(context.floatValue("DetectFaceAttributesResponse.Data.FaceInfos["+ i +"].FaceAttributes.Headpose.RollAngle"));
			headpose.setYawAngle(context.floatValue("DetectFaceAttributesResponse.Data.FaceInfos["+ i +"].FaceAttributes.Headpose.YawAngle"));
			faceAttributes.setHeadpose(headpose);
			faceAttributesDetectInfo.setFaceAttributes(faceAttributes);

			faceInfos.add(faceAttributesDetectInfo);
		}
		data.setFaceInfos(faceInfos);
		detectFaceAttributesResponse.setData(data);
	 
	 	return detectFaceAttributesResponse;
	}
}