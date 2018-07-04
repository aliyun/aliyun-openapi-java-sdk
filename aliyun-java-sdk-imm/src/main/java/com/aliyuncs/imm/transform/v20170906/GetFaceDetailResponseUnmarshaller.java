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

import com.aliyuncs.imm.model.v20170906.GetFaceDetailResponse;
import com.aliyuncs.imm.model.v20170906.GetFaceDetailResponse.FaceAttribute;
import com.aliyuncs.imm.model.v20170906.GetFaceDetailResponse.FaceAttribute.Age;
import com.aliyuncs.imm.model.v20170906.GetFaceDetailResponse.FaceAttribute.Blur;
import com.aliyuncs.imm.model.v20170906.GetFaceDetailResponse.FaceAttribute.Blur.Blurness;
import com.aliyuncs.imm.model.v20170906.GetFaceDetailResponse.FaceAttribute.EyeStatus;
import com.aliyuncs.imm.model.v20170906.GetFaceDetailResponse.FaceAttribute.EyeStatus.LeftEyeStatus;
import com.aliyuncs.imm.model.v20170906.GetFaceDetailResponse.FaceAttribute.EyeStatus.RightEyeStatus;
import com.aliyuncs.imm.model.v20170906.GetFaceDetailResponse.FaceAttribute.FaceQuality;
import com.aliyuncs.imm.model.v20170906.GetFaceDetailResponse.FaceAttribute.Gender;
import com.aliyuncs.imm.model.v20170906.GetFaceDetailResponse.FaceAttribute.HeadPose;
import com.aliyuncs.imm.model.v20170906.GetFaceDetailResponse.FaceRectangle;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetFaceDetailResponseUnmarshaller {

	public static GetFaceDetailResponse unmarshall(GetFaceDetailResponse getFaceDetailResponse, UnmarshallerContext context) {
		
		getFaceDetailResponse.setRequestId(context.stringValue("GetFaceDetailResponse.RequestId"));
		getFaceDetailResponse.setSetId(context.stringValue("GetFaceDetailResponse.SetId"));
		getFaceDetailResponse.setFaceId(context.stringValue("GetFaceDetailResponse.FaceId"));
		getFaceDetailResponse.setPhotoId(context.stringValue("GetFaceDetailResponse.PhotoId"));
		getFaceDetailResponse.setPhotoUrl(context.stringValue("GetFaceDetailResponse.PhotoUrl"));
		getFaceDetailResponse.setGroupId(context.stringValue("GetFaceDetailResponse.GroupId"));

		FaceRectangle faceRectangle = new FaceRectangle();
		faceRectangle.setTop(context.integerValue("GetFaceDetailResponse.FaceRectangle.Top"));
		faceRectangle.setLeft(context.integerValue("GetFaceDetailResponse.FaceRectangle.Left"));
		faceRectangle.setWidth(context.integerValue("GetFaceDetailResponse.FaceRectangle.Width"));
		faceRectangle.setHeight(context.integerValue("GetFaceDetailResponse.FaceRectangle.Height"));
		getFaceDetailResponse.setFaceRectangle(faceRectangle);

		FaceAttribute faceAttribute = new FaceAttribute();

		Gender gender = new Gender();
		gender.setValue(context.stringValue("GetFaceDetailResponse.FaceAttribute.Gender.Value"));
		faceAttribute.setGender(gender);

		Age age = new Age();
		age.setValue(context.stringValue("GetFaceDetailResponse.FaceAttribute.Age.Value"));
		faceAttribute.setAge(age);

		HeadPose headPose = new HeadPose();
		headPose.setPitchAngle(context.floatValue("GetFaceDetailResponse.FaceAttribute.HeadPose.PitchAngle"));
		headPose.setRollAngle(context.floatValue("GetFaceDetailResponse.FaceAttribute.HeadPose.RollAngle"));
		headPose.setYawAngle(context.floatValue("GetFaceDetailResponse.FaceAttribute.HeadPose.YawAngle"));
		faceAttribute.setHeadPose(headPose);

		EyeStatus eyeStatus = new EyeStatus();

		LeftEyeStatus leftEyeStatus = new LeftEyeStatus();
		leftEyeStatus.setNormalGlassEyeOpen(context.floatValue("GetFaceDetailResponse.FaceAttribute.EyeStatus.LeftEyeStatus.NormalGlassEyeOpen"));
		leftEyeStatus.setNoGlassEyeClose(context.floatValue("GetFaceDetailResponse.FaceAttribute.EyeStatus.LeftEyeStatus.NoGlassEyeClose"));
		leftEyeStatus.setOcclusion(context.floatValue("GetFaceDetailResponse.FaceAttribute.EyeStatus.LeftEyeStatus.Occlusion"));
		leftEyeStatus.setNoGlassEyeOpen(context.floatValue("GetFaceDetailResponse.FaceAttribute.EyeStatus.LeftEyeStatus.NoGlassEyeOpen"));
		leftEyeStatus.setNormalGlassEyeClose(context.floatValue("GetFaceDetailResponse.FaceAttribute.EyeStatus.LeftEyeStatus.NormalGlassEyeClose"));
		leftEyeStatus.setDarkGlasses(context.floatValue("GetFaceDetailResponse.FaceAttribute.EyeStatus.LeftEyeStatus.DarkGlasses"));
		eyeStatus.setLeftEyeStatus(leftEyeStatus);

		RightEyeStatus rightEyeStatus = new RightEyeStatus();
		rightEyeStatus.setNormalGlassEyeOpen(context.floatValue("GetFaceDetailResponse.FaceAttribute.EyeStatus.RightEyeStatus.NormalGlassEyeOpen"));
		rightEyeStatus.setNoGlassEyeClose(context.floatValue("GetFaceDetailResponse.FaceAttribute.EyeStatus.RightEyeStatus.NoGlassEyeClose"));
		rightEyeStatus.setNormalGlassEyeClose(context.floatValue("GetFaceDetailResponse.FaceAttribute.EyeStatus.RightEyeStatus.NormalGlassEyeClose"));
		rightEyeStatus.setOcclusion(context.floatValue("GetFaceDetailResponse.FaceAttribute.EyeStatus.RightEyeStatus.Occlusion"));
		rightEyeStatus.setNoGlassEyeOpen(context.floatValue("GetFaceDetailResponse.FaceAttribute.EyeStatus.RightEyeStatus.NoGlassEyeOpen"));
		rightEyeStatus.setNormalGlassEyeClose1(context.floatValue("GetFaceDetailResponse.FaceAttribute.EyeStatus.RightEyeStatus.NormalGlassEyeClose"));
		rightEyeStatus.setDarkGlasses(context.floatValue("GetFaceDetailResponse.FaceAttribute.EyeStatus.RightEyeStatus.DarkGlasses"));
		eyeStatus.setRightEyeStatus(rightEyeStatus);
		faceAttribute.setEyeStatus(eyeStatus);

		Blur blur = new Blur();

		Blurness blurness = new Blurness();
		blurness.setValue(context.floatValue("GetFaceDetailResponse.FaceAttribute.Blur.Blurness.Value"));
		blurness.setThreshold(context.floatValue("GetFaceDetailResponse.FaceAttribute.Blur.Blurness.Threshold"));
		blur.setBlurness(blurness);
		faceAttribute.setBlur(blur);

		FaceQuality faceQuality = new FaceQuality();
		faceQuality.setValue(context.floatValue("GetFaceDetailResponse.FaceAttribute.FaceQuality.Value"));
		faceQuality.setThreshold(context.floatValue("GetFaceDetailResponse.FaceAttribute.FaceQuality.Threshold"));
		faceAttribute.setFaceQuality(faceQuality);
		getFaceDetailResponse.setFaceAttribute(faceAttribute);
	 
	 	return getFaceDetailResponse;
	}
}