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

	public static DetectImageFacesResponse unmarshall(DetectImageFacesResponse detectImageFacesResponse, UnmarshallerContext _ctx) {
		
		detectImageFacesResponse.setRequestId(_ctx.stringValue("DetectImageFacesResponse.RequestId"));
		detectImageFacesResponse.setImageUri(_ctx.stringValue("DetectImageFacesResponse.ImageUri"));

		List<FacesItem> faces = new ArrayList<FacesItem>();
		for (int i = 0; i < _ctx.lengthValue("DetectImageFacesResponse.Faces.Length"); i++) {
			FacesItem facesItem = new FacesItem();
			facesItem.setAttractiveConfidence(_ctx.floatValue("DetectImageFacesResponse.Faces["+ i +"].AttractiveConfidence"));
			facesItem.setGender(_ctx.stringValue("DetectImageFacesResponse.Faces["+ i +"].Gender"));
			facesItem.setGenderConfidence(_ctx.floatValue("DetectImageFacesResponse.Faces["+ i +"].GenderConfidence"));
			facesItem.setFaceId(_ctx.stringValue("DetectImageFacesResponse.Faces["+ i +"].FaceId"));
			facesItem.setFaceQuality(_ctx.floatValue("DetectImageFacesResponse.Faces["+ i +"].FaceQuality"));
			facesItem.setEmotion(_ctx.stringValue("DetectImageFacesResponse.Faces["+ i +"].Emotion"));
			facesItem.setAge(_ctx.integerValue("DetectImageFacesResponse.Faces["+ i +"].Age"));
			facesItem.setFaceConfidence(_ctx.floatValue("DetectImageFacesResponse.Faces["+ i +"].FaceConfidence"));
			facesItem.setEmotionConfidence(_ctx.floatValue("DetectImageFacesResponse.Faces["+ i +"].EmotionConfidence"));
			facesItem.setAttractive(_ctx.floatValue("DetectImageFacesResponse.Faces["+ i +"].Attractive"));
			facesItem.setAgeConfidence(_ctx.floatValue("DetectImageFacesResponse.Faces["+ i +"].AgeConfidence"));

			FaceAttributes faceAttributes = new FaceAttributes();
			faceAttributes.setGlassesConfidence(_ctx.floatValue("DetectImageFacesResponse.Faces["+ i +"].FaceAttributes.GlassesConfidence"));
			faceAttributes.setGlasses(_ctx.stringValue("DetectImageFacesResponse.Faces["+ i +"].FaceAttributes.Glasses"));
			faceAttributes.setMask(_ctx.stringValue("DetectImageFacesResponse.Faces["+ i +"].FaceAttributes.Mask"));
			faceAttributes.setBeardConfidence(_ctx.floatValue("DetectImageFacesResponse.Faces["+ i +"].FaceAttributes.BeardConfidence"));
			faceAttributes.setMaskConfidence(_ctx.floatValue("DetectImageFacesResponse.Faces["+ i +"].FaceAttributes.MaskConfidence"));
			faceAttributes.setBeard(_ctx.stringValue("DetectImageFacesResponse.Faces["+ i +"].FaceAttributes.Beard"));

			FaceBoundary faceBoundary = new FaceBoundary();
			faceBoundary.setTop(_ctx.integerValue("DetectImageFacesResponse.Faces["+ i +"].FaceAttributes.FaceBoundary.Top"));
			faceBoundary.setWidth(_ctx.integerValue("DetectImageFacesResponse.Faces["+ i +"].FaceAttributes.FaceBoundary.Width"));
			faceBoundary.setHeight(_ctx.integerValue("DetectImageFacesResponse.Faces["+ i +"].FaceAttributes.FaceBoundary.Height"));
			faceBoundary.setLeft(_ctx.integerValue("DetectImageFacesResponse.Faces["+ i +"].FaceAttributes.FaceBoundary.Left"));
			faceAttributes.setFaceBoundary(faceBoundary);

			HeadPose headPose = new HeadPose();
			headPose.setPitch(_ctx.floatValue("DetectImageFacesResponse.Faces["+ i +"].FaceAttributes.HeadPose.Pitch"));
			headPose.setRoll(_ctx.floatValue("DetectImageFacesResponse.Faces["+ i +"].FaceAttributes.HeadPose.Roll"));
			headPose.setYaw(_ctx.floatValue("DetectImageFacesResponse.Faces["+ i +"].FaceAttributes.HeadPose.Yaw"));
			faceAttributes.setHeadPose(headPose);
			facesItem.setFaceAttributes(faceAttributes);

			EmotionDetails emotionDetails = new EmotionDetails();
			emotionDetails.setHAPPY(_ctx.floatValue("DetectImageFacesResponse.Faces["+ i +"].EmotionDetails.HAPPY"));
			emotionDetails.setCALM(_ctx.floatValue("DetectImageFacesResponse.Faces["+ i +"].EmotionDetails.CALM"));
			emotionDetails.setSURPRISED(_ctx.floatValue("DetectImageFacesResponse.Faces["+ i +"].EmotionDetails.SURPRISED"));
			emotionDetails.setDISGUSTED(_ctx.floatValue("DetectImageFacesResponse.Faces["+ i +"].EmotionDetails.DISGUSTED"));
			emotionDetails.setANGRY(_ctx.floatValue("DetectImageFacesResponse.Faces["+ i +"].EmotionDetails.ANGRY"));
			emotionDetails.setSAD(_ctx.floatValue("DetectImageFacesResponse.Faces["+ i +"].EmotionDetails.SAD"));
			emotionDetails.setSCARED(_ctx.floatValue("DetectImageFacesResponse.Faces["+ i +"].EmotionDetails.SCARED"));
			facesItem.setEmotionDetails(emotionDetails);

			faces.add(facesItem);
		}
		detectImageFacesResponse.setFaces(faces);
	 
	 	return detectImageFacesResponse;
	}
}