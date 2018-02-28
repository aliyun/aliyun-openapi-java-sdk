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

import com.aliyuncs.imm.model.v20170906.DetectFaceResponse;
import com.aliyuncs.imm.model.v20170906.DetectFaceResponse.FailDetailsItem;
import com.aliyuncs.imm.model.v20170906.DetectFaceResponse.SuccessDetailsItem;
import com.aliyuncs.imm.model.v20170906.DetectFaceResponse.SuccessDetailsItem.FacesItem;
import com.aliyuncs.imm.model.v20170906.DetectFaceResponse.SuccessDetailsItem.FacesItem.FaceAttribute;
import com.aliyuncs.imm.model.v20170906.DetectFaceResponse.SuccessDetailsItem.FacesItem.FaceAttribute.Age;
import com.aliyuncs.imm.model.v20170906.DetectFaceResponse.SuccessDetailsItem.FacesItem.FaceAttribute.Blur;
import com.aliyuncs.imm.model.v20170906.DetectFaceResponse.SuccessDetailsItem.FacesItem.FaceAttribute.Blur.Blurness;
import com.aliyuncs.imm.model.v20170906.DetectFaceResponse.SuccessDetailsItem.FacesItem.FaceAttribute.Eyestatus;
import com.aliyuncs.imm.model.v20170906.DetectFaceResponse.SuccessDetailsItem.FacesItem.FaceAttribute.Eyestatus.Left_eye_status;
import com.aliyuncs.imm.model.v20170906.DetectFaceResponse.SuccessDetailsItem.FacesItem.FaceAttribute.Eyestatus.Right_eye_status;
import com.aliyuncs.imm.model.v20170906.DetectFaceResponse.SuccessDetailsItem.FacesItem.FaceAttribute.Facequality;
import com.aliyuncs.imm.model.v20170906.DetectFaceResponse.SuccessDetailsItem.FacesItem.FaceAttribute.Gender;
import com.aliyuncs.imm.model.v20170906.DetectFaceResponse.SuccessDetailsItem.FacesItem.FaceAttribute.Headpose;
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
				faceRectangle.setTop(context.stringValue("DetectFaceResponse.SuccessDetails["+ i +"].Faces["+ j +"].FaceRectangle.top"));
				faceRectangle.setLeft(context.stringValue("DetectFaceResponse.SuccessDetails["+ i +"].Faces["+ j +"].FaceRectangle.left"));
				faceRectangle.setWidth(context.stringValue("DetectFaceResponse.SuccessDetails["+ i +"].Faces["+ j +"].FaceRectangle.width"));
				faceRectangle.setHeight(context.stringValue("DetectFaceResponse.SuccessDetails["+ i +"].Faces["+ j +"].FaceRectangle.height"));
				facesItem.setFaceRectangle(faceRectangle);

				FaceAttribute faceAttribute = new FaceAttribute();

				Gender gender = new Gender();
				gender.setValue(context.stringValue("DetectFaceResponse.SuccessDetails["+ i +"].Faces["+ j +"].FaceAttribute.gender.value"));
				faceAttribute.setGender(gender);

				Age age = new Age();
				age.setValue(context.integerValue("DetectFaceResponse.SuccessDetails["+ i +"].Faces["+ j +"].FaceAttribute.age.value"));
				faceAttribute.setAge(age);

				Headpose headpose = new Headpose();
				headpose.setPitch_angle(context.floatValue("DetectFaceResponse.SuccessDetails["+ i +"].Faces["+ j +"].FaceAttribute.headpose.pitch_angle"));
				headpose.setRoll_angle(context.floatValue("DetectFaceResponse.SuccessDetails["+ i +"].Faces["+ j +"].FaceAttribute.headpose.roll_angle"));
				headpose.setYaw_angle(context.floatValue("DetectFaceResponse.SuccessDetails["+ i +"].Faces["+ j +"].FaceAttribute.headpose.yaw_angle"));
				faceAttribute.setHeadpose(headpose);

				Eyestatus eyestatus = new Eyestatus();

				Left_eye_status left_eye_status = new Left_eye_status();
				left_eye_status.setNormal_glass_eye_open(context.floatValue("DetectFaceResponse.SuccessDetails["+ i +"].Faces["+ j +"].FaceAttribute.eyestatus.left_eye_status.normal_glass_eye_open"));
				left_eye_status.setNo_glass_eye_close(context.floatValue("DetectFaceResponse.SuccessDetails["+ i +"].Faces["+ j +"].FaceAttribute.eyestatus.left_eye_status.no_glass_eye_close"));
				left_eye_status.setOcclusion(context.floatValue("DetectFaceResponse.SuccessDetails["+ i +"].Faces["+ j +"].FaceAttribute.eyestatus.left_eye_status.occlusion"));
				left_eye_status.setNo_glass_eye_open(context.floatValue("DetectFaceResponse.SuccessDetails["+ i +"].Faces["+ j +"].FaceAttribute.eyestatus.left_eye_status.no_glass_eye_open"));
				left_eye_status.setNormal_glass_eye_close(context.floatValue("DetectFaceResponse.SuccessDetails["+ i +"].Faces["+ j +"].FaceAttribute.eyestatus.left_eye_status.normal_glass_eye_close"));
				left_eye_status.setDark_glasses(context.floatValue("DetectFaceResponse.SuccessDetails["+ i +"].Faces["+ j +"].FaceAttribute.eyestatus.left_eye_status.dark_glasses"));
				eyestatus.setLeft_eye_status(left_eye_status);

				Right_eye_status right_eye_status = new Right_eye_status();
				right_eye_status.setNormal_glass_eye_open(context.floatValue("DetectFaceResponse.SuccessDetails["+ i +"].Faces["+ j +"].FaceAttribute.eyestatus.right_eye_status.normal_glass_eye_open"));
				right_eye_status.setNo_glass_eye_close(context.floatValue("DetectFaceResponse.SuccessDetails["+ i +"].Faces["+ j +"].FaceAttribute.eyestatus.right_eye_status.no_glass_eye_close"));
				right_eye_status.setOcclusion(context.floatValue("DetectFaceResponse.SuccessDetails["+ i +"].Faces["+ j +"].FaceAttribute.eyestatus.right_eye_status.occlusion"));
				right_eye_status.setNo_glass_eye_open(context.floatValue("DetectFaceResponse.SuccessDetails["+ i +"].Faces["+ j +"].FaceAttribute.eyestatus.right_eye_status.no_glass_eye_open"));
				right_eye_status.setNormal_glass_eye_close(context.floatValue("DetectFaceResponse.SuccessDetails["+ i +"].Faces["+ j +"].FaceAttribute.eyestatus.right_eye_status.normal_glass_eye_close"));
				right_eye_status.setDark_glasses(context.floatValue("DetectFaceResponse.SuccessDetails["+ i +"].Faces["+ j +"].FaceAttribute.eyestatus.right_eye_status.dark_glasses"));
				eyestatus.setRight_eye_status(right_eye_status);
				faceAttribute.setEyestatus(eyestatus);

				Blur blur = new Blur();

				Blurness blurness = new Blurness();
				blurness.setValue(context.floatValue("DetectFaceResponse.SuccessDetails["+ i +"].Faces["+ j +"].FaceAttribute.blur.blurness.value"));
				blurness.setThreshold(context.floatValue("DetectFaceResponse.SuccessDetails["+ i +"].Faces["+ j +"].FaceAttribute.blur.blurness.threshold"));
				blur.setBlurness(blurness);
				faceAttribute.setBlur(blur);

				Facequality facequality = new Facequality();
				facequality.setValue(context.floatValue("DetectFaceResponse.SuccessDetails["+ i +"].Faces["+ j +"].FaceAttribute.facequality.value"));
				facequality.setThreshold(context.floatValue("DetectFaceResponse.SuccessDetails["+ i +"].Faces["+ j +"].FaceAttribute.facequality.threshold"));
				faceAttribute.setFacequality(facequality);
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