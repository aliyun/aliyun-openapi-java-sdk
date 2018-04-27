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
import com.aliyuncs.imm.model.v20170906.GetFaceSetDetailResponse.FaceDetailsItem.FaceAttribute.Eyestatus;
import com.aliyuncs.imm.model.v20170906.GetFaceSetDetailResponse.FaceDetailsItem.FaceAttribute.Eyestatus.Left_eye_status;
import com.aliyuncs.imm.model.v20170906.GetFaceSetDetailResponse.FaceDetailsItem.FaceAttribute.Eyestatus.Right_eye_status;
import com.aliyuncs.imm.model.v20170906.GetFaceSetDetailResponse.FaceDetailsItem.FaceAttribute.Facequality;
import com.aliyuncs.imm.model.v20170906.GetFaceSetDetailResponse.FaceDetailsItem.FaceAttribute.Gender;
import com.aliyuncs.imm.model.v20170906.GetFaceSetDetailResponse.FaceDetailsItem.FaceAttribute.Headpose;
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
			faceRectangle.setTop(context.integerValue("GetFaceSetDetailResponse.FaceDetails["+ i +"].FaceRectangle.top"));
			faceRectangle.setLeft(context.integerValue("GetFaceSetDetailResponse.FaceDetails["+ i +"].FaceRectangle.left"));
			faceRectangle.setWidth(context.integerValue("GetFaceSetDetailResponse.FaceDetails["+ i +"].FaceRectangle.width"));
			faceRectangle.setHeight(context.integerValue("GetFaceSetDetailResponse.FaceDetails["+ i +"].FaceRectangle.height"));
			faceDetailsItem.setFaceRectangle(faceRectangle);

			FaceAttribute faceAttribute = new FaceAttribute();

			Gender gender = new Gender();
			gender.setValue(context.stringValue("GetFaceSetDetailResponse.FaceDetails["+ i +"].FaceAttribute.gender.value"));
			faceAttribute.setGender(gender);

			Age age = new Age();
			age.setValue(context.stringValue("GetFaceSetDetailResponse.FaceDetails["+ i +"].FaceAttribute.age.value"));
			faceAttribute.setAge(age);

			Headpose headpose = new Headpose();
			headpose.setPitch_angle(context.floatValue("GetFaceSetDetailResponse.FaceDetails["+ i +"].FaceAttribute.headpose.pitch_angle"));
			headpose.setRoll_angle(context.floatValue("GetFaceSetDetailResponse.FaceDetails["+ i +"].FaceAttribute.headpose.roll_angle"));
			headpose.setYaw_angle(context.floatValue("GetFaceSetDetailResponse.FaceDetails["+ i +"].FaceAttribute.headpose.yaw_angle"));
			faceAttribute.setHeadpose(headpose);

			Eyestatus eyestatus = new Eyestatus();

			Left_eye_status left_eye_status = new Left_eye_status();
			left_eye_status.setNormal_glass_eye_open(context.floatValue("GetFaceSetDetailResponse.FaceDetails["+ i +"].FaceAttribute.eyestatus.left_eye_status.normal_glass_eye_open"));
			left_eye_status.setNo_glass_eye_close(context.floatValue("GetFaceSetDetailResponse.FaceDetails["+ i +"].FaceAttribute.eyestatus.left_eye_status.no_glass_eye_close"));
			left_eye_status.setOcclusion(context.floatValue("GetFaceSetDetailResponse.FaceDetails["+ i +"].FaceAttribute.eyestatus.left_eye_status.occlusion"));
			left_eye_status.setNo_glass_eye_open(context.floatValue("GetFaceSetDetailResponse.FaceDetails["+ i +"].FaceAttribute.eyestatus.left_eye_status.no_glass_eye_open"));
			left_eye_status.setNormal_glass_eye_close(context.floatValue("GetFaceSetDetailResponse.FaceDetails["+ i +"].FaceAttribute.eyestatus.left_eye_status.normal_glass_eye_close"));
			left_eye_status.setDark_glasses(context.floatValue("GetFaceSetDetailResponse.FaceDetails["+ i +"].FaceAttribute.eyestatus.left_eye_status.dark_glasses"));
			eyestatus.setLeft_eye_status(left_eye_status);

			Right_eye_status right_eye_status = new Right_eye_status();
			right_eye_status.setNormal_glass_eye_open(context.floatValue("GetFaceSetDetailResponse.FaceDetails["+ i +"].FaceAttribute.eyestatus.right_eye_status.normal_glass_eye_open"));
			right_eye_status.setNo_glass_eye_close(context.floatValue("GetFaceSetDetailResponse.FaceDetails["+ i +"].FaceAttribute.eyestatus.right_eye_status.no_glass_eye_close"));
			right_eye_status.setOcclusion(context.floatValue("GetFaceSetDetailResponse.FaceDetails["+ i +"].FaceAttribute.eyestatus.right_eye_status.occlusion"));
			right_eye_status.setNo_glass_eye_open(context.floatValue("GetFaceSetDetailResponse.FaceDetails["+ i +"].FaceAttribute.eyestatus.right_eye_status.no_glass_eye_open"));
			right_eye_status.setNormal_glass_eye_close(context.floatValue("GetFaceSetDetailResponse.FaceDetails["+ i +"].FaceAttribute.eyestatus.right_eye_status.normal_glass_eye_close"));
			right_eye_status.setDark_glasses(context.floatValue("GetFaceSetDetailResponse.FaceDetails["+ i +"].FaceAttribute.eyestatus.right_eye_status.dark_glasses"));
			eyestatus.setRight_eye_status(right_eye_status);
			faceAttribute.setEyestatus(eyestatus);

			Blur blur = new Blur();

			Blurness blurness = new Blurness();
			blurness.setValue(context.floatValue("GetFaceSetDetailResponse.FaceDetails["+ i +"].FaceAttribute.blur.blurness.value"));
			blurness.setThreshold(context.floatValue("GetFaceSetDetailResponse.FaceDetails["+ i +"].FaceAttribute.blur.blurness.threshold"));
			blur.setBlurness(blurness);
			faceAttribute.setBlur(blur);

			Facequality facequality = new Facequality();
			facequality.setValue(context.floatValue("GetFaceSetDetailResponse.FaceDetails["+ i +"].FaceAttribute.facequality.value"));
			facequality.setThreshold(context.floatValue("GetFaceSetDetailResponse.FaceDetails["+ i +"].FaceAttribute.facequality.threshold"));
			faceAttribute.setFacequality(facequality);
			faceDetailsItem.setFaceAttribute(faceAttribute);

			faceDetails.add(faceDetailsItem);
		}
		getFaceSetDetailResponse.setFaceDetails(faceDetails);
	 
	 	return getFaceSetDetailResponse;
	}
}