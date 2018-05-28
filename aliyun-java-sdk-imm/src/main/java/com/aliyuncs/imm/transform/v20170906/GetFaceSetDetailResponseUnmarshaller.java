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

package com.aliyuncs.imm.transform.v20170906;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.imm.model.v20170906.GetFaceSetDetailResponse;
import com.aliyuncs.imm.model.v20170906.GetFaceSetDetailResponse.FaceDetailsItem;
import com.aliyuncs.imm.model.v20170906.GetFaceSetDetailResponse.FaceDetailsItem.FaceAttribute;
import com.aliyuncs.imm.model.v20170906.GetFaceSetDetailResponse.FaceDetailsItem.FaceAttribute.Age;
import com.aliyuncs.imm.model.v20170906.GetFaceSetDetailResponse.FaceDetailsItem.FaceAttribute.Blur;
import com.aliyuncs.imm.model.v20170906.GetFaceSetDetailResponse.FaceDetailsItem.FaceAttribute.Blur.Blurness;
import com.aliyuncs.imm.model.v20170906.GetFaceSetDetailResponse.FaceDetailsItem.FaceAttribute.EyeStatus;
import com.aliyuncs.imm.model.v20170906.GetFaceSetDetailResponse.FaceDetailsItem.FaceAttribute.EyeStatus.LeftEyeStatus;
import com.aliyuncs.imm.model.v20170906.GetFaceSetDetailResponse.FaceDetailsItem.FaceAttribute.EyeStatus.RightEyeStatus;
import com.aliyuncs.imm.model.v20170906.GetFaceSetDetailResponse.FaceDetailsItem.FaceAttribute.FaceQuality;
import com.aliyuncs.imm.model.v20170906.GetFaceSetDetailResponse.FaceDetailsItem.FaceAttribute.Gender;
import com.aliyuncs.imm.model.v20170906.GetFaceSetDetailResponse.FaceDetailsItem.FaceAttribute.HeadPose;
import com.aliyuncs.imm.model.v20170906.GetFaceSetDetailResponse.FaceDetailsItem.FaceRectangle;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetFaceSetDetailResponseUnmarshaller {

	public static GetFaceSetDetailResponse unmarshall(GetFaceSetDetailResponse getFaceSetDetailResponse, UnmarshallerContext context) {
		
		getFaceSetDetailResponse.setRequestId(context.stringValue("GetFaceSetDetailResponse.RequestId"));
		getFaceSetDetailResponse.setSetId(context.stringValue("GetFaceSetDetailResponse.SetId"));
		getFaceSetDetailResponse.setNextMarker(context.stringValue("GetFaceSetDetailResponse.NextMarker"));

		List<FaceDetailsItem> faceDetails = new ArrayList<FaceDetailsItem>();
		for (int i = 0; i < context.lengthValue("GetFaceSetDetailResponse.FaceDetails.Length"); i++) {
			FaceDetailsItem faceDetailsItem = new FaceDetailsItem();
			faceDetailsItem.setFaceId(context.stringValue("GetFaceSetDetailResponse.FaceDetails["+ i +"].FaceId"));
			faceDetailsItem.setSrcUri(context.stringValue("GetFaceSetDetailResponse.FaceDetails["+ i +"].SrcUri"));
			faceDetailsItem.setPhotoId(context.stringValue("GetFaceSetDetailResponse.FaceDetails["+ i +"].PhotoId"));
			faceDetailsItem.setGroupId(context.stringValue("GetFaceSetDetailResponse.FaceDetails["+ i +"].GroupId"));
			faceDetailsItem.setUnGroupReason(context.stringValue("GetFaceSetDetailResponse.FaceDetails["+ i +"].UnGroupReason"));

			FaceRectangle faceRectangle = new FaceRectangle();
			faceRectangle.setTop(context.integerValue("GetFaceSetDetailResponse.FaceDetails["+ i +"].FaceRectangle.Top"));
			faceRectangle.setLeft(context.integerValue("GetFaceSetDetailResponse.FaceDetails["+ i +"].FaceRectangle.Left"));
			faceRectangle.setWidth(context.integerValue("GetFaceSetDetailResponse.FaceDetails["+ i +"].FaceRectangle.Width"));
			faceRectangle.setHeight(context.integerValue("GetFaceSetDetailResponse.FaceDetails["+ i +"].FaceRectangle.Height"));
			faceDetailsItem.setFaceRectangle(faceRectangle);

			FaceAttribute faceAttribute = new FaceAttribute();

			Gender gender = new Gender();
			gender.setValue(context.stringValue("GetFaceSetDetailResponse.FaceDetails["+ i +"].FaceAttribute.Gender.Value"));
			faceAttribute.setGender(gender);

			Age age = new Age();
			age.setValue(context.stringValue("GetFaceSetDetailResponse.FaceDetails["+ i +"].FaceAttribute.Age.Value"));
			faceAttribute.setAge(age);

			HeadPose headPose = new HeadPose();
			headPose.setPitchAngle(context.floatValue("GetFaceSetDetailResponse.FaceDetails["+ i +"].FaceAttribute.HeadPose.PitchAngle"));
			headPose.setRollAngle(context.floatValue("GetFaceSetDetailResponse.FaceDetails["+ i +"].FaceAttribute.HeadPose.RollAngle"));
			headPose.setYawAngle(context.floatValue("GetFaceSetDetailResponse.FaceDetails["+ i +"].FaceAttribute.HeadPose.YawAngle"));
			faceAttribute.setHeadPose(headPose);

			EyeStatus eyeStatus = new EyeStatus();

			LeftEyeStatus leftEyeStatus = new LeftEyeStatus();
			leftEyeStatus.setNormalGlassEyeOpen(context.floatValue("GetFaceSetDetailResponse.FaceDetails["+ i +"].FaceAttribute.EyeStatus.LeftEyeStatus.NormalGlassEyeOpen"));
			leftEyeStatus.setNoGlassEyeClose(context.floatValue("GetFaceSetDetailResponse.FaceDetails["+ i +"].FaceAttribute.EyeStatus.LeftEyeStatus.NoGlassEyeClose"));
			leftEyeStatus.setOcclusion(context.floatValue("GetFaceSetDetailResponse.FaceDetails["+ i +"].FaceAttribute.EyeStatus.LeftEyeStatus.Occlusion"));
			leftEyeStatus.setNoGlassEyeOpen(context.floatValue("GetFaceSetDetailResponse.FaceDetails["+ i +"].FaceAttribute.EyeStatus.LeftEyeStatus.NoGlassEyeOpen"));
			leftEyeStatus.setNormalGlassEyeClose(context.floatValue("GetFaceSetDetailResponse.FaceDetails["+ i +"].FaceAttribute.EyeStatus.LeftEyeStatus.NormalGlassEyeClose"));
			leftEyeStatus.setDarkGlasses(context.floatValue("GetFaceSetDetailResponse.FaceDetails["+ i +"].FaceAttribute.EyeStatus.LeftEyeStatus.DarkGlasses"));
			eyeStatus.setLeftEyeStatus(leftEyeStatus);

			RightEyeStatus rightEyeStatus = new RightEyeStatus();
			rightEyeStatus.setNormalGlassEyeOpen(context.floatValue("GetFaceSetDetailResponse.FaceDetails["+ i +"].FaceAttribute.EyeStatus.RightEyeStatus.NormalGlassEyeOpen"));
			rightEyeStatus.setNoGlassEyeClose(context.floatValue("GetFaceSetDetailResponse.FaceDetails["+ i +"].FaceAttribute.EyeStatus.RightEyeStatus.NoGlassEyeClose"));
			rightEyeStatus.setOcclusion(context.floatValue("GetFaceSetDetailResponse.FaceDetails["+ i +"].FaceAttribute.EyeStatus.RightEyeStatus.Occlusion"));
			rightEyeStatus.setNoGlassEyeOpen(context.floatValue("GetFaceSetDetailResponse.FaceDetails["+ i +"].FaceAttribute.EyeStatus.RightEyeStatus.NoGlassEyeOpen"));
			rightEyeStatus.setNormalGlassEyeClose(context.floatValue("GetFaceSetDetailResponse.FaceDetails["+ i +"].FaceAttribute.EyeStatus.RightEyeStatus.NormalGlassEyeClose"));
			rightEyeStatus.setDarkGlasses(context.floatValue("GetFaceSetDetailResponse.FaceDetails["+ i +"].FaceAttribute.EyeStatus.RightEyeStatus.DarkGlasses"));
			eyeStatus.setRightEyeStatus(rightEyeStatus);
			faceAttribute.setEyeStatus(eyeStatus);

			Blur blur = new Blur();

			Blurness blurness = new Blurness();
			blurness.setValue(context.floatValue("GetFaceSetDetailResponse.FaceDetails["+ i +"].FaceAttribute.Blur.Blurness.Value"));
			blurness.setThreshold(context.floatValue("GetFaceSetDetailResponse.FaceDetails["+ i +"].FaceAttribute.Blur.Blurness.Threshold"));
			blur.setBlurness(blurness);
			faceAttribute.setBlur(blur);

			FaceQuality faceQuality = new FaceQuality();
			faceQuality.setValue(context.floatValue("GetFaceSetDetailResponse.FaceDetails["+ i +"].FaceAttribute.FaceQuality.Value"));
			faceQuality.setThreshold(context.floatValue("GetFaceSetDetailResponse.FaceDetails["+ i +"].FaceAttribute.FaceQuality.Threshold"));
			faceAttribute.setFaceQuality(faceQuality);
			faceDetailsItem.setFaceAttribute(faceAttribute);

			faceDetails.add(faceDetailsItem);
		}
		getFaceSetDetailResponse.setFaceDetails(faceDetails);
	 
	 	return getFaceSetDetailResponse;
	}
}