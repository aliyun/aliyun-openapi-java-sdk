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

import com.aliyuncs.imm.model.v20170906.IndexFaceResponse;
import com.aliyuncs.imm.model.v20170906.IndexFaceResponse.FailDetailsItem;
import com.aliyuncs.imm.model.v20170906.IndexFaceResponse.SuccessDetailsItem;
import com.aliyuncs.imm.model.v20170906.IndexFaceResponse.SuccessDetailsItem.FacesItem;
import com.aliyuncs.imm.model.v20170906.IndexFaceResponse.SuccessDetailsItem.FacesItem.FaceAttributeItem;
import com.aliyuncs.imm.model.v20170906.IndexFaceResponse.SuccessDetailsItem.FacesItem.FaceAttributeItem.AgeItem;
import com.aliyuncs.imm.model.v20170906.IndexFaceResponse.SuccessDetailsItem.FacesItem.FaceAttributeItem.BlurItem;
import com.aliyuncs.imm.model.v20170906.IndexFaceResponse.SuccessDetailsItem.FacesItem.FaceAttributeItem.BlurItem.BlurnessItem;
import com.aliyuncs.imm.model.v20170906.IndexFaceResponse.SuccessDetailsItem.FacesItem.FaceAttributeItem.EyestatusItem;
import com.aliyuncs.imm.model.v20170906.IndexFaceResponse.SuccessDetailsItem.FacesItem.FaceAttributeItem.EyestatusItem.Left_eye_statusItem;
import com.aliyuncs.imm.model.v20170906.IndexFaceResponse.SuccessDetailsItem.FacesItem.FaceAttributeItem.EyestatusItem.Right_eye_statusItem;
import com.aliyuncs.imm.model.v20170906.IndexFaceResponse.SuccessDetailsItem.FacesItem.FaceAttributeItem.FacequalityItem;
import com.aliyuncs.imm.model.v20170906.IndexFaceResponse.SuccessDetailsItem.FacesItem.FaceAttributeItem.GenderItem;
import com.aliyuncs.imm.model.v20170906.IndexFaceResponse.SuccessDetailsItem.FacesItem.FaceAttributeItem.HeadposeItem;
import com.aliyuncs.imm.model.v20170906.IndexFaceResponse.SuccessDetailsItem.FacesItem.FaceRectangleItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class IndexFaceResponseUnmarshaller {

	public static IndexFaceResponse unmarshall(IndexFaceResponse indexFaceResponse, UnmarshallerContext context) {
		
		indexFaceResponse.setRequestId(context.stringValue("IndexFaceResponse.RequestId"));
		indexFaceResponse.setSetId(context.stringValue("IndexFaceResponse.SetId"));

		List<String> srcUris = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("IndexFaceResponse.SrcUris.Length"); i++) {
			srcUris.add(context.stringValue("IndexFaceResponse.SrcUris["+ i +"]"));
		}
		indexFaceResponse.setSrcUris(srcUris);

		List<SuccessDetailsItem> successDetails = new ArrayList<SuccessDetailsItem>();
		for (int i = 0; i < context.lengthValue("IndexFaceResponse.SuccessDetails.Length"); i++) {
			SuccessDetailsItem successDetailsItem = new SuccessDetailsItem();
			successDetailsItem.setSrcUri(context.stringValue("IndexFaceResponse.SuccessDetails["+ i +"].SrcUri"));
			successDetailsItem.setPhotoId(context.stringValue("IndexFaceResponse.SuccessDetails["+ i +"].PhotoId"));

			List<FacesItem> faces = new ArrayList<FacesItem>();
			for (int j = 0; j < context.lengthValue("IndexFaceResponse.SuccessDetails["+ i +"].Faces.Length"); j++) {
				FacesItem facesItem = new FacesItem();
				facesItem.setFaceId(context.stringValue("IndexFaceResponse.SuccessDetails["+ i +"].Faces["+ j +"].FaceId"));

				List<FaceRectangleItem> faceRectangle = new ArrayList<FaceRectangleItem>();
				for (int k = 0; k < context.lengthValue("IndexFaceResponse.SuccessDetails["+ i +"].Faces["+ j +"].FaceRectangle.Length"); k++) {
					FaceRectangleItem faceRectangleItem = new FaceRectangleItem();
					faceRectangleItem.setTop(context.stringValue("IndexFaceResponse.SuccessDetails["+ i +"].Faces["+ j +"].FaceRectangle["+ k +"].top"));
					faceRectangleItem.setLeft(context.stringValue("IndexFaceResponse.SuccessDetails["+ i +"].Faces["+ j +"].FaceRectangle["+ k +"].left"));
					faceRectangleItem.setWidth(context.stringValue("IndexFaceResponse.SuccessDetails["+ i +"].Faces["+ j +"].FaceRectangle["+ k +"].width"));
					faceRectangleItem.setHeight(context.stringValue("IndexFaceResponse.SuccessDetails["+ i +"].Faces["+ j +"].FaceRectangle["+ k +"].height"));

					faceRectangle.add(faceRectangleItem);
				}
				facesItem.setFaceRectangle(faceRectangle);

				List<FaceAttributeItem> faceAttribute = new ArrayList<FaceAttributeItem>();
				for (int k = 0; k < context.lengthValue("IndexFaceResponse.SuccessDetails["+ i +"].Faces["+ j +"].FaceAttribute.Length"); k++) {
					FaceAttributeItem faceAttributeItem = new FaceAttributeItem();

					List<GenderItem> gender = new ArrayList<GenderItem>();
					for (int l = 0; l < context.lengthValue("IndexFaceResponse.SuccessDetails["+ i +"].Faces["+ j +"].FaceAttribute["+ k +"].gender.Length"); l++) {
						GenderItem genderItem = new GenderItem();
						genderItem.setValue(context.stringValue("IndexFaceResponse.SuccessDetails["+ i +"].Faces["+ j +"].FaceAttribute["+ k +"].gender["+ l +"].value"));

						gender.add(genderItem);
					}
					faceAttributeItem.setGender(gender);

					List<AgeItem> age = new ArrayList<AgeItem>();
					for (int l = 0; l < context.lengthValue("IndexFaceResponse.SuccessDetails["+ i +"].Faces["+ j +"].FaceAttribute["+ k +"].age.Length"); l++) {
						AgeItem ageItem = new AgeItem();
						ageItem.setValue(context.integerValue("IndexFaceResponse.SuccessDetails["+ i +"].Faces["+ j +"].FaceAttribute["+ k +"].age["+ l +"].value"));

						age.add(ageItem);
					}
					faceAttributeItem.setAge(age);

					List<HeadposeItem> headpose = new ArrayList<HeadposeItem>();
					for (int l = 0; l < context.lengthValue("IndexFaceResponse.SuccessDetails["+ i +"].Faces["+ j +"].FaceAttribute["+ k +"].headpose.Length"); l++) {
						HeadposeItem headposeItem = new HeadposeItem();
						headposeItem.setPitch_angle(context.floatValue("IndexFaceResponse.SuccessDetails["+ i +"].Faces["+ j +"].FaceAttribute["+ k +"].headpose["+ l +"].pitch_angle"));
						headposeItem.setRoll_angle(context.floatValue("IndexFaceResponse.SuccessDetails["+ i +"].Faces["+ j +"].FaceAttribute["+ k +"].headpose["+ l +"].roll_angle"));
						headposeItem.setYaw_angle(context.floatValue("IndexFaceResponse.SuccessDetails["+ i +"].Faces["+ j +"].FaceAttribute["+ k +"].headpose["+ l +"].yaw_angle"));

						headpose.add(headposeItem);
					}
					faceAttributeItem.setHeadpose(headpose);

					List<EyestatusItem> eyestatus = new ArrayList<EyestatusItem>();
					for (int l = 0; l < context.lengthValue("IndexFaceResponse.SuccessDetails["+ i +"].Faces["+ j +"].FaceAttribute["+ k +"].eyestatus.Length"); l++) {
						EyestatusItem eyestatusItem = new EyestatusItem();

						List<Left_eye_statusItem> left_eye_status = new ArrayList<Left_eye_statusItem>();
						for (int m = 0; m < context.lengthValue("IndexFaceResponse.SuccessDetails["+ i +"].Faces["+ j +"].FaceAttribute["+ k +"].eyestatus["+ l +"].left_eye_status.Length"); m++) {
							Left_eye_statusItem left_eye_statusItem = new Left_eye_statusItem();
							left_eye_statusItem.setNormal_glass_eye_open(context.floatValue("IndexFaceResponse.SuccessDetails["+ i +"].Faces["+ j +"].FaceAttribute["+ k +"].eyestatus["+ l +"].left_eye_status["+ m +"].normal_glass_eye_open"));
							left_eye_statusItem.setNo_glass_eye_close(context.floatValue("IndexFaceResponse.SuccessDetails["+ i +"].Faces["+ j +"].FaceAttribute["+ k +"].eyestatus["+ l +"].left_eye_status["+ m +"].no_glass_eye_close"));
							left_eye_statusItem.setOcclusion(context.floatValue("IndexFaceResponse.SuccessDetails["+ i +"].Faces["+ j +"].FaceAttribute["+ k +"].eyestatus["+ l +"].left_eye_status["+ m +"].occlusion"));
							left_eye_statusItem.setNo_glass_eye_open(context.floatValue("IndexFaceResponse.SuccessDetails["+ i +"].Faces["+ j +"].FaceAttribute["+ k +"].eyestatus["+ l +"].left_eye_status["+ m +"].no_glass_eye_open"));
							left_eye_statusItem.setNormal_glass_eye_close(context.floatValue("IndexFaceResponse.SuccessDetails["+ i +"].Faces["+ j +"].FaceAttribute["+ k +"].eyestatus["+ l +"].left_eye_status["+ m +"].normal_glass_eye_close"));
							left_eye_statusItem.setDark_glasses(context.floatValue("IndexFaceResponse.SuccessDetails["+ i +"].Faces["+ j +"].FaceAttribute["+ k +"].eyestatus["+ l +"].left_eye_status["+ m +"].dark_glasses"));

							left_eye_status.add(left_eye_statusItem);
						}
						eyestatusItem.setLeft_eye_status(left_eye_status);

						List<Right_eye_statusItem> right_eye_status = new ArrayList<Right_eye_statusItem>();
						for (int m = 0; m < context.lengthValue("IndexFaceResponse.SuccessDetails["+ i +"].Faces["+ j +"].FaceAttribute["+ k +"].eyestatus["+ l +"].right_eye_status.Length"); m++) {
							Right_eye_statusItem right_eye_statusItem = new Right_eye_statusItem();
							right_eye_statusItem.setNormal_glass_eye_open(context.floatValue("IndexFaceResponse.SuccessDetails["+ i +"].Faces["+ j +"].FaceAttribute["+ k +"].eyestatus["+ l +"].right_eye_status["+ m +"].normal_glass_eye_open"));
							right_eye_statusItem.setNo_glass_eye_close(context.floatValue("IndexFaceResponse.SuccessDetails["+ i +"].Faces["+ j +"].FaceAttribute["+ k +"].eyestatus["+ l +"].right_eye_status["+ m +"].no_glass_eye_close"));
							right_eye_statusItem.setOcclusion(context.floatValue("IndexFaceResponse.SuccessDetails["+ i +"].Faces["+ j +"].FaceAttribute["+ k +"].eyestatus["+ l +"].right_eye_status["+ m +"].occlusion"));
							right_eye_statusItem.setNo_glass_eye_open(context.floatValue("IndexFaceResponse.SuccessDetails["+ i +"].Faces["+ j +"].FaceAttribute["+ k +"].eyestatus["+ l +"].right_eye_status["+ m +"].no_glass_eye_open"));
							right_eye_statusItem.setNormal_glass_eye_close(context.floatValue("IndexFaceResponse.SuccessDetails["+ i +"].Faces["+ j +"].FaceAttribute["+ k +"].eyestatus["+ l +"].right_eye_status["+ m +"].normal_glass_eye_close"));
							right_eye_statusItem.setDark_glasses(context.floatValue("IndexFaceResponse.SuccessDetails["+ i +"].Faces["+ j +"].FaceAttribute["+ k +"].eyestatus["+ l +"].right_eye_status["+ m +"].dark_glasses"));

							right_eye_status.add(right_eye_statusItem);
						}
						eyestatusItem.setRight_eye_status(right_eye_status);

						eyestatus.add(eyestatusItem);
					}
					faceAttributeItem.setEyestatus(eyestatus);

					List<BlurItem> blur = new ArrayList<BlurItem>();
					for (int l = 0; l < context.lengthValue("IndexFaceResponse.SuccessDetails["+ i +"].Faces["+ j +"].FaceAttribute["+ k +"].blur.Length"); l++) {
						BlurItem blurItem = new BlurItem();

						List<BlurnessItem> blurness = new ArrayList<BlurnessItem>();
						for (int m = 0; m < context.lengthValue("IndexFaceResponse.SuccessDetails["+ i +"].Faces["+ j +"].FaceAttribute["+ k +"].blur["+ l +"].blurness.Length"); m++) {
							BlurnessItem blurnessItem = new BlurnessItem();
							blurnessItem.setValue(context.floatValue("IndexFaceResponse.SuccessDetails["+ i +"].Faces["+ j +"].FaceAttribute["+ k +"].blur["+ l +"].blurness["+ m +"].value"));
							blurnessItem.setThreshold(context.floatValue("IndexFaceResponse.SuccessDetails["+ i +"].Faces["+ j +"].FaceAttribute["+ k +"].blur["+ l +"].blurness["+ m +"].threshold"));

							blurness.add(blurnessItem);
						}
						blurItem.setBlurness(blurness);

						blur.add(blurItem);
					}
					faceAttributeItem.setBlur(blur);

					List<FacequalityItem> facequality = new ArrayList<FacequalityItem>();
					for (int l = 0; l < context.lengthValue("IndexFaceResponse.SuccessDetails["+ i +"].Faces["+ j +"].FaceAttribute["+ k +"].facequality.Length"); l++) {
						FacequalityItem facequalityItem = new FacequalityItem();
						facequalityItem.setValue(context.floatValue("IndexFaceResponse.SuccessDetails["+ i +"].Faces["+ j +"].FaceAttribute["+ k +"].facequality["+ l +"].value"));
						facequalityItem.setThreshold(context.floatValue("IndexFaceResponse.SuccessDetails["+ i +"].Faces["+ j +"].FaceAttribute["+ k +"].facequality["+ l +"].threshold"));

						facequality.add(facequalityItem);
					}
					faceAttributeItem.setFacequality(facequality);

					faceAttribute.add(faceAttributeItem);
				}
				facesItem.setFaceAttribute(faceAttribute);

				faces.add(facesItem);
			}
			successDetailsItem.setFaces(faces);

			successDetails.add(successDetailsItem);
		}
		indexFaceResponse.setSuccessDetails(successDetails);

		List<FailDetailsItem> failDetails = new ArrayList<FailDetailsItem>();
		for (int i = 0; i < context.lengthValue("IndexFaceResponse.FailDetails.Length"); i++) {
			FailDetailsItem failDetailsItem = new FailDetailsItem();
			failDetailsItem.setSrcUri(context.stringValue("IndexFaceResponse.FailDetails["+ i +"].SrcUri"));
			failDetailsItem.setReason(context.stringValue("IndexFaceResponse.FailDetails["+ i +"].Reason"));

			failDetails.add(failDetailsItem);
		}
		indexFaceResponse.setFailDetails(failDetails);
	 
	 	return indexFaceResponse;
	}
}