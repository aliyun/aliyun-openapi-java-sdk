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

import com.aliyuncs.imm.model.v20170906.DetectFaceResponse;
import com.aliyuncs.imm.model.v20170906.DetectFaceResponse.FailDetailsItem;
import com.aliyuncs.imm.model.v20170906.DetectFaceResponse.SuccessDetailsItem;
import com.aliyuncs.imm.model.v20170906.DetectFaceResponse.SuccessDetailsItem.FacesItem;
import com.aliyuncs.imm.model.v20170906.DetectFaceResponse.SuccessDetailsItem.FacesItem.FaceAttribute;
import com.aliyuncs.imm.model.v20170906.DetectFaceResponse.SuccessDetailsItem.FacesItem.FaceAttribute.Age;
import com.aliyuncs.imm.model.v20170906.DetectFaceResponse.SuccessDetailsItem.FacesItem.FaceAttribute.Blur;
import com.aliyuncs.imm.model.v20170906.DetectFaceResponse.SuccessDetailsItem.FacesItem.FaceAttribute.Blur.Blurness;
import com.aliyuncs.imm.model.v20170906.DetectFaceResponse.SuccessDetailsItem.FacesItem.FaceAttribute.EyeStatus;
import com.aliyuncs.imm.model.v20170906.DetectFaceResponse.SuccessDetailsItem.FacesItem.FaceAttribute.EyeStatus.LeftEyeStatus;
import com.aliyuncs.imm.model.v20170906.DetectFaceResponse.SuccessDetailsItem.FacesItem.FaceAttribute.EyeStatus.RightEyeStatus;
import com.aliyuncs.imm.model.v20170906.DetectFaceResponse.SuccessDetailsItem.FacesItem.FaceAttribute.FaceQuality;
import com.aliyuncs.imm.model.v20170906.DetectFaceResponse.SuccessDetailsItem.FacesItem.FaceAttribute.Gender;
import com.aliyuncs.imm.model.v20170906.DetectFaceResponse.SuccessDetailsItem.FacesItem.FaceAttribute.HeadPose;
import com.aliyuncs.imm.model.v20170906.DetectFaceResponse.SuccessDetailsItem.FacesItem.FaceRectangle;
import com.aliyuncs.transform.UnmarshallerContext;


public class DetectFaceResponseUnmarshaller {

	public static DetectFaceResponse unmarshall(DetectFaceResponse detectFaceResponse, UnmarshallerContext context) {
		
		detectFaceResponse.setRequestId(context.stringValue("DetectFaceResponse.RequestId"));

		List<String> srcUris = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("DetectFaceResponse.SrcUris.Length"); i++) {
			srcUris.add(context.stringValue("DetectFaceResponse.SrcUris["+ i +"]"));
		}
		detectFaceResponse.setSrcUris(srcUris);

		List<SuccessDetailsItem> successDetails = new ArrayList<SuccessDetailsItem>();
		for (int i = 0; i < context.lengthValue("DetectFaceResponse.SuccessDetails.Length"); i++) {
			SuccessDetailsItem successDetailsItem = new SuccessDetailsItem();
			successDetailsItem.setSrcUri(context.stringValue("DetectFaceResponse.SuccessDetails["+ i +"].SrcUri"));
			successDetailsItem.setPhotoId(context.stringValue("DetectFaceResponse.SuccessDetails["+ i +"].PhotoId"));

			List<FacesItem> faces = new ArrayList<FacesItem>();
			for (int j = 0; j < context.lengthValue("DetectFaceResponse.SuccessDetails["+ i +"].Faces.Length"); j++) {
				FacesItem facesItem = new FacesItem();
				facesItem.setFaceId(context.stringValue("DetectFaceResponse.SuccessDetails["+ i +"].Faces["+ j +"].FaceId"));

				FaceRectangle faceRectangle = new FaceRectangle();
				faceRectangle.setTop(context.stringValue("DetectFaceResponse.SuccessDetails["+ i +"].Faces["+ j +"].FaceRectangle.Top"));
				faceRectangle.setLeft(context.stringValue("DetectFaceResponse.SuccessDetails["+ i +"].Faces["+ j +"].FaceRectangle.Left"));
				faceRectangle.setWidth(context.stringValue("DetectFaceResponse.SuccessDetails["+ i +"].Faces["+ j +"].FaceRectangle.Width"));
				faceRectangle.setHeight(context.stringValue("DetectFaceResponse.SuccessDetails["+ i +"].Faces["+ j +"].FaceRectangle.Height"));
				facesItem.setFaceRectangle(faceRectangle);

				FaceAttribute faceAttribute = new FaceAttribute();

				Gender gender = new Gender();
				gender.setValue(context.stringValue("DetectFaceResponse.SuccessDetails["+ i +"].Faces["+ j +"].FaceAttribute.Gender.Value"));
				faceAttribute.setGender(gender);

				Age age = new Age();
				age.setValue(context.integerValue("DetectFaceResponse.SuccessDetails["+ i +"].Faces["+ j +"].FaceAttribute.Age.Value"));
				faceAttribute.setAge(age);

				HeadPose headPose = new HeadPose();
				headPose.setPitchAngle(context.floatValue("DetectFaceResponse.SuccessDetails["+ i +"].Faces["+ j +"].FaceAttribute.HeadPose.PitchAngle"));
				headPose.setRollAngle(context.floatValue("DetectFaceResponse.SuccessDetails["+ i +"].Faces["+ j +"].FaceAttribute.HeadPose.RollAngle"));
				headPose.setYawAngle(context.floatValue("DetectFaceResponse.SuccessDetails["+ i +"].Faces["+ j +"].FaceAttribute.HeadPose.YawAngle"));
				faceAttribute.setHeadPose(headPose);

				EyeStatus eyeStatus = new EyeStatus();

				LeftEyeStatus leftEyeStatus = new LeftEyeStatus();
				leftEyeStatus.setNormalGlassEyeOpen(context.floatValue("DetectFaceResponse.SuccessDetails["+ i +"].Faces["+ j +"].FaceAttribute.EyeStatus.LeftEyeStatus.NormalGlassEyeOpen"));
				leftEyeStatus.setNoGlassEyeClose(context.floatValue("DetectFaceResponse.SuccessDetails["+ i +"].Faces["+ j +"].FaceAttribute.EyeStatus.LeftEyeStatus.NoGlassEyeClose"));
				leftEyeStatus.setOcclusion(context.floatValue("DetectFaceResponse.SuccessDetails["+ i +"].Faces["+ j +"].FaceAttribute.EyeStatus.LeftEyeStatus.Occlusion"));
				leftEyeStatus.setNoGlassEyeOpen(context.floatValue("DetectFaceResponse.SuccessDetails["+ i +"].Faces["+ j +"].FaceAttribute.EyeStatus.LeftEyeStatus.NoGlassEyeOpen"));
				leftEyeStatus.setNormalGlassEyeClose(context.floatValue("DetectFaceResponse.SuccessDetails["+ i +"].Faces["+ j +"].FaceAttribute.EyeStatus.LeftEyeStatus.NormalGlassEyeClose"));
				leftEyeStatus.setDarkGlasses(context.floatValue("DetectFaceResponse.SuccessDetails["+ i +"].Faces["+ j +"].FaceAttribute.EyeStatus.LeftEyeStatus.DarkGlasses"));
				eyeStatus.setLeftEyeStatus(leftEyeStatus);

				RightEyeStatus rightEyeStatus = new RightEyeStatus();
				rightEyeStatus.setNormalGlassEyeOpen(context.floatValue("DetectFaceResponse.SuccessDetails["+ i +"].Faces["+ j +"].FaceAttribute.EyeStatus.RightEyeStatus.NormalGlassEyeOpen"));
				rightEyeStatus.setNoGlassEyeClose(context.floatValue("DetectFaceResponse.SuccessDetails["+ i +"].Faces["+ j +"].FaceAttribute.EyeStatus.RightEyeStatus.NoGlassEyeClose"));
				rightEyeStatus.setOcclusion(context.floatValue("DetectFaceResponse.SuccessDetails["+ i +"].Faces["+ j +"].FaceAttribute.EyeStatus.RightEyeStatus.Occlusion"));
				rightEyeStatus.setNoGlassEyeOpen(context.floatValue("DetectFaceResponse.SuccessDetails["+ i +"].Faces["+ j +"].FaceAttribute.EyeStatus.RightEyeStatus.NoGlassEyeOpen"));
				rightEyeStatus.setNormalGlassEyeClose(context.floatValue("DetectFaceResponse.SuccessDetails["+ i +"].Faces["+ j +"].FaceAttribute.EyeStatus.RightEyeStatus.NormalGlassEyeClose"));
				rightEyeStatus.setDarkGlasses(context.floatValue("DetectFaceResponse.SuccessDetails["+ i +"].Faces["+ j +"].FaceAttribute.EyeStatus.RightEyeStatus.DarkGlasses"));
				eyeStatus.setRightEyeStatus(rightEyeStatus);
				faceAttribute.setEyeStatus(eyeStatus);

				Blur blur = new Blur();

				Blurness blurness = new Blurness();
				blurness.setValue(context.floatValue("DetectFaceResponse.SuccessDetails["+ i +"].Faces["+ j +"].FaceAttribute.Blur.Blurness.Value"));
				blurness.setThreshold(context.floatValue("DetectFaceResponse.SuccessDetails["+ i +"].Faces["+ j +"].FaceAttribute.Blur.Blurness.Threshold"));
				blur.setBlurness(blurness);
				faceAttribute.setBlur(blur);

				FaceQuality faceQuality = new FaceQuality();
				faceQuality.setValue(context.floatValue("DetectFaceResponse.SuccessDetails["+ i +"].Faces["+ j +"].FaceAttribute.FaceQuality.Value"));
				faceQuality.setThreshold(context.floatValue("DetectFaceResponse.SuccessDetails["+ i +"].Faces["+ j +"].FaceAttribute.FaceQuality.Threshold"));
				faceAttribute.setFaceQuality(faceQuality);
				facesItem.setFaceAttribute(faceAttribute);

				faces.add(facesItem);
			}
			successDetailsItem.setFaces(faces);

			successDetails.add(successDetailsItem);
		}
		detectFaceResponse.setSuccessDetails(successDetails);

		List<FailDetailsItem> failDetails = new ArrayList<FailDetailsItem>();
		for (int i = 0; i < context.lengthValue("DetectFaceResponse.FailDetails.Length"); i++) {
			FailDetailsItem failDetailsItem = new FailDetailsItem();
			failDetailsItem.setSrcUri(context.stringValue("DetectFaceResponse.FailDetails["+ i +"].SrcUri"));
			failDetailsItem.setReason(context.stringValue("DetectFaceResponse.FailDetails["+ i +"].Reason"));

			failDetails.add(failDetailsItem);
		}
		detectFaceResponse.setFailDetails(failDetails);
	 
	 	return detectFaceResponse;
	}
}