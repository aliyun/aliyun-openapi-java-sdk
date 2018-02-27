/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.imm.transform.v20170906;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.imm.model.v20170906.GetFaceSetDetailResponse;
import com.aliyuncs.imm.model.v20170906.GetFaceSetDetailResponse.FaceDetailsItem;
import com.aliyuncs.imm.model.v20170906.GetFaceSetDetailResponse.FaceDetailsItem.FaceAttributeItem;
import com.aliyuncs.imm.model.v20170906.GetFaceSetDetailResponse.FaceDetailsItem.FaceAttributeItem.AgeItem;
import com.aliyuncs.imm.model.v20170906.GetFaceSetDetailResponse.FaceDetailsItem.FaceAttributeItem.BlurItem;
import com.aliyuncs.imm.model.v20170906.GetFaceSetDetailResponse.FaceDetailsItem.FaceAttributeItem.BlurItem.BlurnessItem;
import com.aliyuncs.imm.model.v20170906.GetFaceSetDetailResponse.FaceDetailsItem.FaceAttributeItem.EyestatusItem;
import com.aliyuncs.imm.model.v20170906.GetFaceSetDetailResponse.FaceDetailsItem.FaceAttributeItem.EyestatusItem.Left_eye_statusItem;
import com.aliyuncs.imm.model.v20170906.GetFaceSetDetailResponse.FaceDetailsItem.FaceAttributeItem.EyestatusItem.Right_eye_statusItem;
import com.aliyuncs.imm.model.v20170906.GetFaceSetDetailResponse.FaceDetailsItem.FaceAttributeItem.FacequalityItem;
import com.aliyuncs.imm.model.v20170906.GetFaceSetDetailResponse.FaceDetailsItem.FaceAttributeItem.GenderItem;
import com.aliyuncs.imm.model.v20170906.GetFaceSetDetailResponse.FaceDetailsItem.FaceAttributeItem.HeadposeItem;
import com.aliyuncs.imm.model.v20170906.GetFaceSetDetailResponse.FaceDetailsItem.FaceRectangleItem;
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

			List<FaceRectangleItem> faceRectangle = new ArrayList<FaceRectangleItem>();
			for (int j = 0; j < context.lengthValue("GetFaceSetDetailResponse.FaceDetails["+ i +"].FaceRectangle.Length"); j++) {
				FaceRectangleItem faceRectangleItem = new FaceRectangleItem();
				faceRectangleItem.setTop(context.integerValue("GetFaceSetDetailResponse.FaceDetails["+ i +"].FaceRectangle["+ j +"].top"));
				faceRectangleItem.setLeft(context.integerValue("GetFaceSetDetailResponse.FaceDetails["+ i +"].FaceRectangle["+ j +"].left"));
				faceRectangleItem.setWidth(context.integerValue("GetFaceSetDetailResponse.FaceDetails["+ i +"].FaceRectangle["+ j +"].width"));
				faceRectangleItem.setHeight(context.integerValue("GetFaceSetDetailResponse.FaceDetails["+ i +"].FaceRectangle["+ j +"].height"));

				faceRectangle.add(faceRectangleItem);
			}
			faceDetailsItem.setFaceRectangle(faceRectangle);

			List<FaceAttributeItem> faceAttribute = new ArrayList<FaceAttributeItem>();
			for (int j = 0; j < context.lengthValue("GetFaceSetDetailResponse.FaceDetails["+ i +"].FaceAttribute.Length"); j++) {
				FaceAttributeItem faceAttributeItem = new FaceAttributeItem();

				List<GenderItem> gender = new ArrayList<GenderItem>();
				for (int k = 0; k < context.lengthValue("GetFaceSetDetailResponse.FaceDetails["+ i +"].FaceAttribute["+ j +"].gender.Length"); k++) {
					GenderItem genderItem = new GenderItem();
					genderItem.setValue(context.stringValue("GetFaceSetDetailResponse.FaceDetails["+ i +"].FaceAttribute["+ j +"].gender["+ k +"].value"));

					gender.add(genderItem);
				}
				faceAttributeItem.setGender(gender);

				List<AgeItem> age = new ArrayList<AgeItem>();
				for (int k = 0; k < context.lengthValue("GetFaceSetDetailResponse.FaceDetails["+ i +"].FaceAttribute["+ j +"].age.Length"); k++) {
					AgeItem ageItem = new AgeItem();
					ageItem.setValue(context.stringValue("GetFaceSetDetailResponse.FaceDetails["+ i +"].FaceAttribute["+ j +"].age["+ k +"].value"));

					age.add(ageItem);
				}
				faceAttributeItem.setAge(age);

				List<HeadposeItem> headpose = new ArrayList<HeadposeItem>();
				for (int k = 0; k < context.lengthValue("GetFaceSetDetailResponse.FaceDetails["+ i +"].FaceAttribute["+ j +"].headpose.Length"); k++) {
					HeadposeItem headposeItem = new HeadposeItem();
					headposeItem.setPitch_angle(context.floatValue("GetFaceSetDetailResponse.FaceDetails["+ i +"].FaceAttribute["+ j +"].headpose["+ k +"].pitch_angle"));
					headposeItem.setRoll_angle(context.floatValue("GetFaceSetDetailResponse.FaceDetails["+ i +"].FaceAttribute["+ j +"].headpose["+ k +"].roll_angle"));
					headposeItem.setYaw_angle(context.floatValue("GetFaceSetDetailResponse.FaceDetails["+ i +"].FaceAttribute["+ j +"].headpose["+ k +"].yaw_angle"));

					headpose.add(headposeItem);
				}
				faceAttributeItem.setHeadpose(headpose);

				List<EyestatusItem> eyestatus = new ArrayList<EyestatusItem>();
				for (int k = 0; k < context.lengthValue("GetFaceSetDetailResponse.FaceDetails["+ i +"].FaceAttribute["+ j +"].eyestatus.Length"); k++) {
					EyestatusItem eyestatusItem = new EyestatusItem();

					List<Left_eye_statusItem> left_eye_status = new ArrayList<Left_eye_statusItem>();
					for (int l = 0; l < context.lengthValue("GetFaceSetDetailResponse.FaceDetails["+ i +"].FaceAttribute["+ j +"].eyestatus["+ k +"].left_eye_status.Length"); l++) {
						Left_eye_statusItem left_eye_statusItem = new Left_eye_statusItem();
						left_eye_statusItem.setNormal_glass_eye_open(context.floatValue("GetFaceSetDetailResponse.FaceDetails["+ i +"].FaceAttribute["+ j +"].eyestatus["+ k +"].left_eye_status["+ l +"].normal_glass_eye_open"));
						left_eye_statusItem.setNo_glass_eye_close(context.floatValue("GetFaceSetDetailResponse.FaceDetails["+ i +"].FaceAttribute["+ j +"].eyestatus["+ k +"].left_eye_status["+ l +"].no_glass_eye_close"));
						left_eye_statusItem.setOcclusion(context.floatValue("GetFaceSetDetailResponse.FaceDetails["+ i +"].FaceAttribute["+ j +"].eyestatus["+ k +"].left_eye_status["+ l +"].occlusion"));
						left_eye_statusItem.setNo_glass_eye_open(context.floatValue("GetFaceSetDetailResponse.FaceDetails["+ i +"].FaceAttribute["+ j +"].eyestatus["+ k +"].left_eye_status["+ l +"].no_glass_eye_open"));
						left_eye_statusItem.setNormal_glass_eye_close(context.floatValue("GetFaceSetDetailResponse.FaceDetails["+ i +"].FaceAttribute["+ j +"].eyestatus["+ k +"].left_eye_status["+ l +"].normal_glass_eye_close"));
						left_eye_statusItem.setDark_glasses(context.floatValue("GetFaceSetDetailResponse.FaceDetails["+ i +"].FaceAttribute["+ j +"].eyestatus["+ k +"].left_eye_status["+ l +"].dark_glasses"));

						left_eye_status.add(left_eye_statusItem);
					}
					eyestatusItem.setLeft_eye_status(left_eye_status);

					List<Right_eye_statusItem> right_eye_status = new ArrayList<Right_eye_statusItem>();
					for (int l = 0; l < context.lengthValue("GetFaceSetDetailResponse.FaceDetails["+ i +"].FaceAttribute["+ j +"].eyestatus["+ k +"].right_eye_status.Length"); l++) {
						Right_eye_statusItem right_eye_statusItem = new Right_eye_statusItem();
						right_eye_statusItem.setNormal_glass_eye_open(context.floatValue("GetFaceSetDetailResponse.FaceDetails["+ i +"].FaceAttribute["+ j +"].eyestatus["+ k +"].right_eye_status["+ l +"].normal_glass_eye_open"));
						right_eye_statusItem.setNo_glass_eye_close(context.floatValue("GetFaceSetDetailResponse.FaceDetails["+ i +"].FaceAttribute["+ j +"].eyestatus["+ k +"].right_eye_status["+ l +"].no_glass_eye_close"));
						right_eye_statusItem.setOcclusion(context.floatValue("GetFaceSetDetailResponse.FaceDetails["+ i +"].FaceAttribute["+ j +"].eyestatus["+ k +"].right_eye_status["+ l +"].occlusion"));
						right_eye_statusItem.setNo_glass_eye_open(context.floatValue("GetFaceSetDetailResponse.FaceDetails["+ i +"].FaceAttribute["+ j +"].eyestatus["+ k +"].right_eye_status["+ l +"].no_glass_eye_open"));
						right_eye_statusItem.setNormal_glass_eye_close(context.floatValue("GetFaceSetDetailResponse.FaceDetails["+ i +"].FaceAttribute["+ j +"].eyestatus["+ k +"].right_eye_status["+ l +"].normal_glass_eye_close"));
						right_eye_statusItem.setDark_glasses(context.floatValue("GetFaceSetDetailResponse.FaceDetails["+ i +"].FaceAttribute["+ j +"].eyestatus["+ k +"].right_eye_status["+ l +"].dark_glasses"));

						right_eye_status.add(right_eye_statusItem);
					}
					eyestatusItem.setRight_eye_status(right_eye_status);

					eyestatus.add(eyestatusItem);
				}
				faceAttributeItem.setEyestatus(eyestatus);

				List<BlurItem> blur = new ArrayList<BlurItem>();
				for (int k = 0; k < context.lengthValue("GetFaceSetDetailResponse.FaceDetails["+ i +"].FaceAttribute["+ j +"].blur.Length"); k++) {
					BlurItem blurItem = new BlurItem();

					List<BlurnessItem> blurness = new ArrayList<BlurnessItem>();
					for (int l = 0; l < context.lengthValue("GetFaceSetDetailResponse.FaceDetails["+ i +"].FaceAttribute["+ j +"].blur["+ k +"].blurness.Length"); l++) {
						BlurnessItem blurnessItem = new BlurnessItem();
						blurnessItem.setValue(context.floatValue("GetFaceSetDetailResponse.FaceDetails["+ i +"].FaceAttribute["+ j +"].blur["+ k +"].blurness["+ l +"].value"));
						blurnessItem.setThreshold(context.floatValue("GetFaceSetDetailResponse.FaceDetails["+ i +"].FaceAttribute["+ j +"].blur["+ k +"].blurness["+ l +"].threshold"));

						blurness.add(blurnessItem);
					}
					blurItem.setBlurness(blurness);

					blur.add(blurItem);
				}
				faceAttributeItem.setBlur(blur);

				List<FacequalityItem> facequality = new ArrayList<FacequalityItem>();
				for (int k = 0; k < context.lengthValue("GetFaceSetDetailResponse.FaceDetails["+ i +"].FaceAttribute["+ j +"].facequality.Length"); k++) {
					FacequalityItem facequalityItem = new FacequalityItem();
					facequalityItem.setValue(context.floatValue("GetFaceSetDetailResponse.FaceDetails["+ i +"].FaceAttribute["+ j +"].facequality["+ k +"].value"));
					facequalityItem.setThreshold(context.floatValue("GetFaceSetDetailResponse.FaceDetails["+ i +"].FaceAttribute["+ j +"].facequality["+ k +"].threshold"));

					facequality.add(facequalityItem);
				}
				faceAttributeItem.setFacequality(facequality);

				faceAttribute.add(faceAttributeItem);
			}
			faceDetailsItem.setFaceAttribute(faceAttribute);

			faceDetails.add(faceDetailsItem);
		}
		getFaceSetDetailResponse.setFaceDetails(faceDetails);
	 
	 	return getFaceSetDetailResponse;
	}
}