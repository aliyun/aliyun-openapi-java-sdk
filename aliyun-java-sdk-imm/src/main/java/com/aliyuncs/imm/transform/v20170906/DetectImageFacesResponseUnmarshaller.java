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

import com.aliyuncs.imm.model.v20170906.DetectImageFacesResponse;
import com.aliyuncs.imm.model.v20170906.DetectImageFacesResponse.FacesItem;
import com.aliyuncs.imm.model.v20170906.DetectImageFacesResponse.FacesItem.EmotionDetails;
import com.aliyuncs.imm.model.v20170906.DetectImageFacesResponse.FacesItem.FaceAttributes;
import com.aliyuncs.imm.model.v20170906.DetectImageFacesResponse.FacesItem.FaceAttributes.FaceBoundary;
import com.aliyuncs.imm.model.v20170906.DetectImageFacesResponse.FacesItem.FaceAttributes.HeadPose;
import com.aliyuncs.transform.UnmarshallerContext;


public class DetectImageFacesResponseUnmarshaller {

	public static DetectImageFacesResponse unmarshall(DetectImageFacesResponse detectImageFacesResponse, UnmarshallerContext context) {
		
		detectImageFacesResponse.setRequestId(context.stringValue("DetectImageFacesResponse.RequestId"));
		detectImageFacesResponse.setImageUri(context.stringValue("DetectImageFacesResponse.ImageUri"));

		List<FacesItem> faces = new ArrayList<FacesItem>();
		for (int i = 0; i < context.lengthValue("DetectImageFacesResponse.Faces.Length"); i++) {
			FacesItem facesItem = new FacesItem();
			facesItem.setFaceId(context.stringValue("DetectImageFacesResponse.Faces["+ i +"].FaceId"));
			facesItem.setFaceConfidence(context.floatValue("DetectImageFacesResponse.Faces["+ i +"].FaceConfidence"));
			facesItem.setAge(context.integerValue("DetectImageFacesResponse.Faces["+ i +"].Age"));
			facesItem.setGender(context.stringValue("DetectImageFacesResponse.Faces["+ i +"].Gender"));
			facesItem.setEmotion(context.stringValue("DetectImageFacesResponse.Faces["+ i +"].Emotion"));
			facesItem.setAttractive(context.floatValue("DetectImageFacesResponse.Faces["+ i +"].Attractive"));
			facesItem.setGenderConfidence(context.floatValue("DetectImageFacesResponse.Faces["+ i +"].GenderConfidence"));
			facesItem.setAgeConfidence(context.floatValue("DetectImageFacesResponse.Faces["+ i +"].AgeConfidence"));
			facesItem.setAttractiveConfidence(context.floatValue("DetectImageFacesResponse.Faces["+ i +"].AttractiveConfidence"));
			facesItem.setEmotionConfidence(context.floatValue("DetectImageFacesResponse.Faces["+ i +"].EmotionConfidence"));
			facesItem.setFaceQuality(context.floatValue("DetectImageFacesResponse.Faces["+ i +"].FaceQuality"));

			FaceAttributes faceAttributes = new FaceAttributes();
			faceAttributes.setGlasses(context.stringValue("DetectImageFacesResponse.Faces["+ i +"].FaceAttributes.Glasses"));
			faceAttributes.setBeard(context.stringValue("DetectImageFacesResponse.Faces["+ i +"].FaceAttributes.Beard"));
			faceAttributes.setRace(context.stringValue("DetectImageFacesResponse.Faces["+ i +"].FaceAttributes.Race"));
			faceAttributes.setMask(context.stringValue("DetectImageFacesResponse.Faces["+ i +"].FaceAttributes.Mask"));
			faceAttributes.setGlassesConfidence(context.floatValue("DetectImageFacesResponse.Faces["+ i +"].FaceAttributes.GlassesConfidence"));
			faceAttributes.setBeardConfidence(context.floatValue("DetectImageFacesResponse.Faces["+ i +"].FaceAttributes.BeardConfidence"));
			faceAttributes.setRaceConfidence(context.floatValue("DetectImageFacesResponse.Faces["+ i +"].FaceAttributes.RaceConfidence"));
			faceAttributes.setMaskConfidence(context.floatValue("DetectImageFacesResponse.Faces["+ i +"].FaceAttributes.MaskConfidence"));

			FaceBoundary faceBoundary = new FaceBoundary();
			faceBoundary.setLeft(context.integerValue("DetectImageFacesResponse.Faces["+ i +"].FaceAttributes.FaceBoundary.Left"));
			faceBoundary.setTop(context.integerValue("DetectImageFacesResponse.Faces["+ i +"].FaceAttributes.FaceBoundary.Top"));
			faceBoundary.setWidth(context.integerValue("DetectImageFacesResponse.Faces["+ i +"].FaceAttributes.FaceBoundary.Width"));
			faceBoundary.setHeight(context.integerValue("DetectImageFacesResponse.Faces["+ i +"].FaceAttributes.FaceBoundary.Height"));
			faceAttributes.setFaceBoundary(faceBoundary);

			HeadPose headPose = new HeadPose();
			headPose.setPitch(context.floatValue("DetectImageFacesResponse.Faces["+ i +"].FaceAttributes.HeadPose.Pitch"));
			headPose.setRoll(context.floatValue("DetectImageFacesResponse.Faces["+ i +"].FaceAttributes.HeadPose.Roll"));
			headPose.setYaw(context.floatValue("DetectImageFacesResponse.Faces["+ i +"].FaceAttributes.HeadPose.Yaw"));
			faceAttributes.setHeadPose(headPose);
			facesItem.setFaceAttributes(faceAttributes);

			EmotionDetails emotionDetails = new EmotionDetails();
			emotionDetails.setHAPPY(context.floatValue("DetectImageFacesResponse.Faces["+ i +"].EmotionDetails.HAPPY"));
			emotionDetails.setSAD(context.floatValue("DetectImageFacesResponse.Faces["+ i +"].EmotionDetails.SAD"));
			emotionDetails.setANGRY(context.floatValue("DetectImageFacesResponse.Faces["+ i +"].EmotionDetails.ANGRY"));
			emotionDetails.setSURPRISED(context.floatValue("DetectImageFacesResponse.Faces["+ i +"].EmotionDetails.SURPRISED"));
			emotionDetails.setSCARED(context.floatValue("DetectImageFacesResponse.Faces["+ i +"].EmotionDetails.SCARED"));
			emotionDetails.setDISGUSTED(context.floatValue("DetectImageFacesResponse.Faces["+ i +"].EmotionDetails.DISGUSTED"));
			emotionDetails.setCALM(context.floatValue("DetectImageFacesResponse.Faces["+ i +"].EmotionDetails.CALM"));
			facesItem.setEmotionDetails(emotionDetails);

			faces.add(facesItem);
		}
		detectImageFacesResponse.setFaces(faces);
	 
	 	return detectImageFacesResponse;
	}
}