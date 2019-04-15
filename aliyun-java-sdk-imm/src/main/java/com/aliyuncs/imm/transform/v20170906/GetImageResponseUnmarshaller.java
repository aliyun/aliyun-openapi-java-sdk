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

import com.aliyuncs.imm.model.v20170906.GetImageResponse;
import com.aliyuncs.imm.model.v20170906.GetImageResponse.CelebrityItem;
import com.aliyuncs.imm.model.v20170906.GetImageResponse.CelebrityItem.CelebrityBoundary;
import com.aliyuncs.imm.model.v20170906.GetImageResponse.FacesItem;
import com.aliyuncs.imm.model.v20170906.GetImageResponse.FacesItem.EmotionDetails;
import com.aliyuncs.imm.model.v20170906.GetImageResponse.FacesItem.FaceAttributes;
import com.aliyuncs.imm.model.v20170906.GetImageResponse.FacesItem.FaceAttributes.FaceBoundary;
import com.aliyuncs.imm.model.v20170906.GetImageResponse.FacesItem.FaceAttributes.HeadPose;
import com.aliyuncs.imm.model.v20170906.GetImageResponse.OCRItem;
import com.aliyuncs.imm.model.v20170906.GetImageResponse.OCRItem.OCRBoundary;
import com.aliyuncs.imm.model.v20170906.GetImageResponse.TagsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetImageResponseUnmarshaller {

	public static GetImageResponse unmarshall(GetImageResponse getImageResponse, UnmarshallerContext context) {
		
		getImageResponse.setRequestId(context.stringValue("GetImageResponse.RequestId"));
		getImageResponse.setSetId(context.stringValue("GetImageResponse.SetId"));
		getImageResponse.setImageUri(context.stringValue("GetImageResponse.ImageUri"));
		getImageResponse.setRemarksA(context.stringValue("GetImageResponse.RemarksA"));
		getImageResponse.setRemarksB(context.stringValue("GetImageResponse.RemarksB"));
		getImageResponse.setCreateTime(context.stringValue("GetImageResponse.CreateTime"));
		getImageResponse.setModifyTime(context.stringValue("GetImageResponse.ModifyTime"));
		getImageResponse.setImageWidth(context.integerValue("GetImageResponse.ImageWidth"));
		getImageResponse.setImageHeight(context.integerValue("GetImageResponse.ImageHeight"));
		getImageResponse.setImageFormat(context.stringValue("GetImageResponse.ImageFormat"));
		getImageResponse.setExif(context.stringValue("GetImageResponse.Exif"));
		getImageResponse.setFileSize(context.integerValue("GetImageResponse.FileSize"));
		getImageResponse.setImageTime(context.stringValue("GetImageResponse.ImageTime"));
		getImageResponse.setOrientation(context.stringValue("GetImageResponse.Orientation"));
		getImageResponse.setSourceType(context.stringValue("GetImageResponse.SourceType"));
		getImageResponse.setSourceUri(context.stringValue("GetImageResponse.SourceUri"));
		getImageResponse.setSourcePosition(context.stringValue("GetImageResponse.SourcePosition"));
		getImageResponse.setFacesStatus(context.stringValue("GetImageResponse.FacesStatus"));
		getImageResponse.setFacesModifyTime(context.stringValue("GetImageResponse.FacesModifyTime"));
		getImageResponse.setLocation(context.stringValue("GetImageResponse.Location"));
		getImageResponse.setOCRStatus(context.stringValue("GetImageResponse.OCRStatus"));
		getImageResponse.setOCRModifyTime(context.stringValue("GetImageResponse.OCRModifyTime"));
		getImageResponse.setOCRFailReason(context.stringValue("GetImageResponse.OCRFailReason"));
		getImageResponse.setFacesFailReason(context.stringValue("GetImageResponse.FacesFailReason"));
		getImageResponse.setTagsFailReason(context.stringValue("GetImageResponse.TagsFailReason"));
		getImageResponse.setTagsModifyTime(context.stringValue("GetImageResponse.TagsModifyTime"));
		getImageResponse.setCelebrityStatus(context.stringValue("GetImageResponse.CelebrityStatus"));
		getImageResponse.setCelebrityModifyTime(context.stringValue("GetImageResponse.CelebrityModifyTime"));
		getImageResponse.setCelebrityFailReason(context.stringValue("GetImageResponse.CelebrityFailReason"));
		getImageResponse.setTagsStatus(context.stringValue("GetImageResponse.TagsStatus"));
		getImageResponse.setRemarksC(context.stringValue("GetImageResponse.RemarksC"));
		getImageResponse.setRemarksD(context.stringValue("GetImageResponse.RemarksD"));
		getImageResponse.setExternalId(context.stringValue("GetImageResponse.ExternalId"));

		List<FacesItem> faces = new ArrayList<FacesItem>();
		for (int i = 0; i < context.lengthValue("GetImageResponse.Faces.Length"); i++) {
			FacesItem facesItem = new FacesItem();
			facesItem.setFaceId(context.stringValue("GetImageResponse.Faces["+ i +"].FaceId"));
			facesItem.setFaceConfidence(context.floatValue("GetImageResponse.Faces["+ i +"].FaceConfidence"));
			facesItem.setAge(context.stringValue("GetImageResponse.Faces["+ i +"].Age"));
			facesItem.setGender(context.stringValue("GetImageResponse.Faces["+ i +"].Gender"));
			facesItem.setEmotion(context.stringValue("GetImageResponse.Faces["+ i +"].Emotion"));
			facesItem.setAttractive(context.floatValue("GetImageResponse.Faces["+ i +"].Attractive"));
			facesItem.setGenderConfidence(context.floatValue("GetImageResponse.Faces["+ i +"].GenderConfidence"));
			facesItem.setGroupId(context.stringValue("GetImageResponse.Faces["+ i +"].GroupId"));
			facesItem.setFaceQuality(context.floatValue("GetImageResponse.Faces["+ i +"].FaceQuality"));

			FaceAttributes faceAttributes = new FaceAttributes();
			faceAttributes.setGlasses(context.stringValue("GetImageResponse.Faces["+ i +"].FaceAttributes.Glasses"));
			faceAttributes.setBeard(context.stringValue("GetImageResponse.Faces["+ i +"].FaceAttributes.Beard"));
			faceAttributes.setRace(context.stringValue("GetImageResponse.Faces["+ i +"].FaceAttributes.Race"));
			faceAttributes.setMask(context.stringValue("GetImageResponse.Faces["+ i +"].FaceAttributes.Mask"));
			faceAttributes.setGlassesConfidence(context.floatValue("GetImageResponse.Faces["+ i +"].FaceAttributes.GlassesConfidence"));
			faceAttributes.setBeardConfidence(context.floatValue("GetImageResponse.Faces["+ i +"].FaceAttributes.BeardConfidence"));
			faceAttributes.setRaceConfidence(context.floatValue("GetImageResponse.Faces["+ i +"].FaceAttributes.RaceConfidence"));
			faceAttributes.setMaskConfidence(context.floatValue("GetImageResponse.Faces["+ i +"].FaceAttributes.MaskConfidence"));

			FaceBoundary faceBoundary = new FaceBoundary();
			faceBoundary.setLeft(context.integerValue("GetImageResponse.Faces["+ i +"].FaceAttributes.FaceBoundary.Left"));
			faceBoundary.setTop(context.integerValue("GetImageResponse.Faces["+ i +"].FaceAttributes.FaceBoundary.Top"));
			faceBoundary.setWidth(context.integerValue("GetImageResponse.Faces["+ i +"].FaceAttributes.FaceBoundary.Width"));
			faceBoundary.setHeight(context.integerValue("GetImageResponse.Faces["+ i +"].FaceAttributes.FaceBoundary.Height"));
			faceAttributes.setFaceBoundary(faceBoundary);

			HeadPose headPose = new HeadPose();
			headPose.setPitch(context.floatValue("GetImageResponse.Faces["+ i +"].FaceAttributes.HeadPose.Pitch"));
			headPose.setRoll(context.floatValue("GetImageResponse.Faces["+ i +"].FaceAttributes.HeadPose.Roll"));
			headPose.setYaw(context.floatValue("GetImageResponse.Faces["+ i +"].FaceAttributes.HeadPose.Yaw"));
			faceAttributes.setHeadPose(headPose);
			facesItem.setFaceAttributes(faceAttributes);

			EmotionDetails emotionDetails = new EmotionDetails();
			emotionDetails.setHAPPY(context.floatValue("GetImageResponse.Faces["+ i +"].EmotionDetails.HAPPY"));
			emotionDetails.setSAD(context.floatValue("GetImageResponse.Faces["+ i +"].EmotionDetails.SAD"));
			emotionDetails.setANGRY(context.floatValue("GetImageResponse.Faces["+ i +"].EmotionDetails.ANGRY"));
			emotionDetails.setSURPRISED(context.floatValue("GetImageResponse.Faces["+ i +"].EmotionDetails.SURPRISED"));
			emotionDetails.setSCARED(context.floatValue("GetImageResponse.Faces["+ i +"].EmotionDetails.SCARED"));
			emotionDetails.setDISGUSTED(context.floatValue("GetImageResponse.Faces["+ i +"].EmotionDetails.DISGUSTED"));
			emotionDetails.setCALM(context.floatValue("GetImageResponse.Faces["+ i +"].EmotionDetails.CALM"));
			facesItem.setEmotionDetails(emotionDetails);

			faces.add(facesItem);
		}
		getImageResponse.setFaces(faces);

		List<OCRItem> oCR = new ArrayList<OCRItem>();
		for (int i = 0; i < context.lengthValue("GetImageResponse.OCR.Length"); i++) {
			OCRItem oCRItem = new OCRItem();
			oCRItem.setOCRContents(context.stringValue("GetImageResponse.OCR["+ i +"].OCRContents"));
			oCRItem.setOCRConfidence(context.floatValue("GetImageResponse.OCR["+ i +"].OCRConfidence"));

			OCRBoundary oCRBoundary = new OCRBoundary();
			oCRBoundary.setLeft(context.integerValue("GetImageResponse.OCR["+ i +"].OCRBoundary.Left"));
			oCRBoundary.setTop(context.integerValue("GetImageResponse.OCR["+ i +"].OCRBoundary.Top"));
			oCRBoundary.setWidth(context.integerValue("GetImageResponse.OCR["+ i +"].OCRBoundary.Width"));
			oCRBoundary.setHeight(context.integerValue("GetImageResponse.OCR["+ i +"].OCRBoundary.Height"));
			oCRItem.setOCRBoundary(oCRBoundary);

			oCR.add(oCRItem);
		}
		getImageResponse.setOCR(oCR);

		List<TagsItem> tags = new ArrayList<TagsItem>();
		for (int i = 0; i < context.lengthValue("GetImageResponse.Tags.Length"); i++) {
			TagsItem tagsItem = new TagsItem();
			tagsItem.setTagName(context.stringValue("GetImageResponse.Tags["+ i +"].TagName"));
			tagsItem.setTagConfidence(context.floatValue("GetImageResponse.Tags["+ i +"].TagConfidence"));
			tagsItem.setTagLevel(context.integerValue("GetImageResponse.Tags["+ i +"].TagLevel"));
			tagsItem.setParentTagName(context.stringValue("GetImageResponse.Tags["+ i +"].ParentTagName"));

			tags.add(tagsItem);
		}
		getImageResponse.setTags(tags);

		List<CelebrityItem> celebrity = new ArrayList<CelebrityItem>();
		for (int i = 0; i < context.lengthValue("GetImageResponse.Celebrity.Length"); i++) {
			CelebrityItem celebrityItem = new CelebrityItem();
			celebrityItem.setCelebrityName(context.stringValue("GetImageResponse.Celebrity["+ i +"].CelebrityName"));
			celebrityItem.setCelebrityGender(context.stringValue("GetImageResponse.Celebrity["+ i +"].CelebrityGender"));
			celebrityItem.setCelebrityConfidence(context.floatValue("GetImageResponse.Celebrity["+ i +"].CelebrityConfidence"));
			celebrityItem.setCelebrityLibraryName(context.stringValue("GetImageResponse.Celebrity["+ i +"].CelebrityLibraryName"));

			CelebrityBoundary celebrityBoundary = new CelebrityBoundary();
			celebrityBoundary.setLeft(context.integerValue("GetImageResponse.Celebrity["+ i +"].CelebrityBoundary.Left"));
			celebrityBoundary.setTop(context.integerValue("GetImageResponse.Celebrity["+ i +"].CelebrityBoundary.Top"));
			celebrityBoundary.setWidth(context.integerValue("GetImageResponse.Celebrity["+ i +"].CelebrityBoundary.Width"));
			celebrityBoundary.setHeight(context.integerValue("GetImageResponse.Celebrity["+ i +"].CelebrityBoundary.Height"));
			celebrityItem.setCelebrityBoundary(celebrityBoundary);

			celebrity.add(celebrityItem);
		}
		getImageResponse.setCelebrity(celebrity);
	 
	 	return getImageResponse;
	}
}