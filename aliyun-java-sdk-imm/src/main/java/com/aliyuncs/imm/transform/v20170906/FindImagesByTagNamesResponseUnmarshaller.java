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

import com.aliyuncs.imm.model.v20170906.FindImagesByTagNamesResponse;
import com.aliyuncs.imm.model.v20170906.FindImagesByTagNamesResponse.Frames;
import com.aliyuncs.imm.model.v20170906.FindImagesByTagNamesResponse.Frames.CelebrityItem;
import com.aliyuncs.imm.model.v20170906.FindImagesByTagNamesResponse.Frames.CelebrityItem.CelebrityBoundary;
import com.aliyuncs.imm.model.v20170906.FindImagesByTagNamesResponse.Frames.FacesItem;
import com.aliyuncs.imm.model.v20170906.FindImagesByTagNamesResponse.Frames.FacesItem.EmotionDetails;
import com.aliyuncs.imm.model.v20170906.FindImagesByTagNamesResponse.Frames.FacesItem.FaceAttributes;
import com.aliyuncs.imm.model.v20170906.FindImagesByTagNamesResponse.Frames.FacesItem.FaceAttributes.FaceBoundary;
import com.aliyuncs.imm.model.v20170906.FindImagesByTagNamesResponse.Frames.FacesItem.FaceAttributes.HeadPose;
import com.aliyuncs.imm.model.v20170906.FindImagesByTagNamesResponse.Frames.OCRItem;
import com.aliyuncs.imm.model.v20170906.FindImagesByTagNamesResponse.Frames.OCRItem.OCRBoundary;
import com.aliyuncs.imm.model.v20170906.FindImagesByTagNamesResponse.Frames.TagsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class FindImagesByTagNamesResponseUnmarshaller {

	public static FindImagesByTagNamesResponse unmarshall(FindImagesByTagNamesResponse findImagesByTagNamesResponse, UnmarshallerContext context) {
		
		findImagesByTagNamesResponse.setRequestId(context.stringValue("FindImagesByTagNamesResponse.RequestId"));
		findImagesByTagNamesResponse.setSetId(context.stringValue("FindImagesByTagNamesResponse.SetId"));
		findImagesByTagNamesResponse.setNextMarker(context.stringValue("FindImagesByTagNamesResponse.NextMarker"));

		List<Frames> images = new ArrayList<Frames>();
		for (int i = 0; i < context.lengthValue("FindImagesByTagNamesResponse.Images.Length"); i++) {
			Frames frames = new Frames();
			frames.setFacesModifyTime(context.stringValue("FindImagesByTagNamesResponse.Images["+ i +"].FacesModifyTime"));
			frames.setOCRModifyTime(context.stringValue("FindImagesByTagNamesResponse.Images["+ i +"].OCRModifyTime"));
			frames.setOCRStatus(context.stringValue("FindImagesByTagNamesResponse.Images["+ i +"].OCRStatus"));
			frames.setSourcePosition(context.stringValue("FindImagesByTagNamesResponse.Images["+ i +"].SourcePosition"));
			frames.setExif(context.stringValue("FindImagesByTagNamesResponse.Images["+ i +"].Exif"));
			frames.setImageUri(context.stringValue("FindImagesByTagNamesResponse.Images["+ i +"].ImageUri"));
			frames.setImageWidth(context.integerValue("FindImagesByTagNamesResponse.Images["+ i +"].ImageWidth"));
			frames.setImageFormat(context.stringValue("FindImagesByTagNamesResponse.Images["+ i +"].ImageFormat"));
			frames.setSourceType(context.stringValue("FindImagesByTagNamesResponse.Images["+ i +"].SourceType"));
			frames.setModifyTime(context.stringValue("FindImagesByTagNamesResponse.Images["+ i +"].ModifyTime"));
			frames.setFileSize(context.integerValue("FindImagesByTagNamesResponse.Images["+ i +"].FileSize"));
			frames.setSourceUri(context.stringValue("FindImagesByTagNamesResponse.Images["+ i +"].SourceUri"));
			frames.setCreateTime(context.stringValue("FindImagesByTagNamesResponse.Images["+ i +"].CreateTime"));
			frames.setFacesStatus(context.stringValue("FindImagesByTagNamesResponse.Images["+ i +"].FacesStatus"));
			frames.setRemarksA(context.stringValue("FindImagesByTagNamesResponse.Images["+ i +"].RemarksA"));
			frames.setImageHeight(context.integerValue("FindImagesByTagNamesResponse.Images["+ i +"].ImageHeight"));
			frames.setRemarksB(context.stringValue("FindImagesByTagNamesResponse.Images["+ i +"].RemarksB"));
			frames.setImageTime(context.stringValue("FindImagesByTagNamesResponse.Images["+ i +"].ImageTime"));
			frames.setOrientation(context.stringValue("FindImagesByTagNamesResponse.Images["+ i +"].Orientation"));
			frames.setLocation(context.stringValue("FindImagesByTagNamesResponse.Images["+ i +"].Location"));
			frames.setOCRFailReason(context.stringValue("FindImagesByTagNamesResponse.Images["+ i +"].OCRFailReason"));
			frames.setFacesFailReason(context.stringValue("FindImagesByTagNamesResponse.Images["+ i +"].FacesFailReason"));
			frames.setTagsFailReason(context.stringValue("FindImagesByTagNamesResponse.Images["+ i +"].TagsFailReason"));
			frames.setTagsModifyTime(context.stringValue("FindImagesByTagNamesResponse.Images["+ i +"].TagsModifyTime"));
			frames.setCelebrityStatus(context.stringValue("FindImagesByTagNamesResponse.Images["+ i +"].CelebrityStatus"));
			frames.setCelebrityModifyTime(context.stringValue("FindImagesByTagNamesResponse.Images["+ i +"].CelebrityModifyTime"));
			frames.setCelebrityFailReason(context.stringValue("FindImagesByTagNamesResponse.Images["+ i +"].CelebrityFailReason"));
			frames.setTagsStatus(context.stringValue("FindImagesByTagNamesResponse.Images["+ i +"].TagsStatus"));
			frames.setExternalId(context.stringValue("FindImagesByTagNamesResponse.Images["+ i +"].ExternalId"));
			frames.setRemarksC(context.stringValue("FindImagesByTagNamesResponse.Images["+ i +"].RemarksC"));
			frames.setRemarksD(context.stringValue("FindImagesByTagNamesResponse.Images["+ i +"].RemarksD"));

			List<FacesItem> faces = new ArrayList<FacesItem>();
			for (int j = 0; j < context.lengthValue("FindImagesByTagNamesResponse.Images["+ i +"].Faces.Length"); j++) {
				FacesItem facesItem = new FacesItem();
				facesItem.setAge(context.integerValue("FindImagesByTagNamesResponse.Images["+ i +"].Faces["+ j +"].Age"));
				facesItem.setGenderConfidence(context.floatValue("FindImagesByTagNamesResponse.Images["+ i +"].Faces["+ j +"].GenderConfidence"));
				facesItem.setAttractive(context.floatValue("FindImagesByTagNamesResponse.Images["+ i +"].Faces["+ j +"].Attractive"));
				facesItem.setGender(context.stringValue("FindImagesByTagNamesResponse.Images["+ i +"].Faces["+ j +"].Gender"));
				facesItem.setFaceConfidence(context.floatValue("FindImagesByTagNamesResponse.Images["+ i +"].Faces["+ j +"].FaceConfidence"));
				facesItem.setEmotion(context.stringValue("FindImagesByTagNamesResponse.Images["+ i +"].Faces["+ j +"].Emotion"));
				facesItem.setFaceId(context.stringValue("FindImagesByTagNamesResponse.Images["+ i +"].Faces["+ j +"].FaceId"));
				facesItem.setEmotionConfidence(context.floatValue("FindImagesByTagNamesResponse.Images["+ i +"].Faces["+ j +"].EmotionConfidence"));
				facesItem.setGroupId(context.stringValue("FindImagesByTagNamesResponse.Images["+ i +"].Faces["+ j +"].GroupId"));
				facesItem.setFaceQuality(context.floatValue("FindImagesByTagNamesResponse.Images["+ i +"].Faces["+ j +"].FaceQuality"));

				EmotionDetails emotionDetails = new EmotionDetails();
				emotionDetails.setSAD(context.floatValue("FindImagesByTagNamesResponse.Images["+ i +"].Faces["+ j +"].EmotionDetails.SAD"));
				emotionDetails.setCALM(context.floatValue("FindImagesByTagNamesResponse.Images["+ i +"].Faces["+ j +"].EmotionDetails.CALM"));
				emotionDetails.setANGRY(context.floatValue("FindImagesByTagNamesResponse.Images["+ i +"].Faces["+ j +"].EmotionDetails.ANGRY"));
				emotionDetails.setHAPPY(context.floatValue("FindImagesByTagNamesResponse.Images["+ i +"].Faces["+ j +"].EmotionDetails.HAPPY"));
				emotionDetails.setSCARED(context.floatValue("FindImagesByTagNamesResponse.Images["+ i +"].Faces["+ j +"].EmotionDetails.SCARED"));
				emotionDetails.setDISGUSTED(context.floatValue("FindImagesByTagNamesResponse.Images["+ i +"].Faces["+ j +"].EmotionDetails.DISGUSTED"));
				emotionDetails.setSURPRISED(context.floatValue("FindImagesByTagNamesResponse.Images["+ i +"].Faces["+ j +"].EmotionDetails.SURPRISED"));
				facesItem.setEmotionDetails(emotionDetails);

				FaceAttributes faceAttributes = new FaceAttributes();
				faceAttributes.setGlassesConfidence(context.floatValue("FindImagesByTagNamesResponse.Images["+ i +"].Faces["+ j +"].FaceAttributes.GlassesConfidence"));
				faceAttributes.setGlasses(context.stringValue("FindImagesByTagNamesResponse.Images["+ i +"].Faces["+ j +"].FaceAttributes.Glasses"));
				faceAttributes.setRaceConfidence(context.floatValue("FindImagesByTagNamesResponse.Images["+ i +"].Faces["+ j +"].FaceAttributes.RaceConfidence"));
				faceAttributes.setBeard(context.stringValue("FindImagesByTagNamesResponse.Images["+ i +"].Faces["+ j +"].FaceAttributes.Beard"));
				faceAttributes.setMaskConfidence(context.floatValue("FindImagesByTagNamesResponse.Images["+ i +"].Faces["+ j +"].FaceAttributes.MaskConfidence"));
				faceAttributes.setRace(context.stringValue("FindImagesByTagNamesResponse.Images["+ i +"].Faces["+ j +"].FaceAttributes.Race"));
				faceAttributes.setBeardConfidence(context.floatValue("FindImagesByTagNamesResponse.Images["+ i +"].Faces["+ j +"].FaceAttributes.BeardConfidence"));
				faceAttributes.setMask(context.stringValue("FindImagesByTagNamesResponse.Images["+ i +"].Faces["+ j +"].FaceAttributes.Mask"));

				FaceBoundary faceBoundary = new FaceBoundary();
				faceBoundary.setTop(context.integerValue("FindImagesByTagNamesResponse.Images["+ i +"].Faces["+ j +"].FaceAttributes.FaceBoundary.Top"));
				faceBoundary.setHeight(context.integerValue("FindImagesByTagNamesResponse.Images["+ i +"].Faces["+ j +"].FaceAttributes.FaceBoundary.Height"));
				faceBoundary.setWidth(context.integerValue("FindImagesByTagNamesResponse.Images["+ i +"].Faces["+ j +"].FaceAttributes.FaceBoundary.Width"));
				faceBoundary.setLeft(context.integerValue("FindImagesByTagNamesResponse.Images["+ i +"].Faces["+ j +"].FaceAttributes.FaceBoundary.Left"));
				faceAttributes.setFaceBoundary(faceBoundary);

				HeadPose headPose = new HeadPose();
				headPose.setPitch(context.floatValue("FindImagesByTagNamesResponse.Images["+ i +"].Faces["+ j +"].FaceAttributes.HeadPose.Pitch"));
				headPose.setRoll(context.floatValue("FindImagesByTagNamesResponse.Images["+ i +"].Faces["+ j +"].FaceAttributes.HeadPose.Roll"));
				headPose.setYaw(context.floatValue("FindImagesByTagNamesResponse.Images["+ i +"].Faces["+ j +"].FaceAttributes.HeadPose.Yaw"));
				faceAttributes.setHeadPose(headPose);
				facesItem.setFaceAttributes(faceAttributes);

				faces.add(facesItem);
			}
			frames.setFaces(faces);

			List<TagsItem> tags = new ArrayList<TagsItem>();
			for (int j = 0; j < context.lengthValue("FindImagesByTagNamesResponse.Images["+ i +"].Tags.Length"); j++) {
				TagsItem tagsItem = new TagsItem();
				tagsItem.setTagConfidence(context.floatValue("FindImagesByTagNamesResponse.Images["+ i +"].Tags["+ j +"].TagConfidence"));
				tagsItem.setTagLevel(context.integerValue("FindImagesByTagNamesResponse.Images["+ i +"].Tags["+ j +"].TagLevel"));
				tagsItem.setTagName(context.stringValue("FindImagesByTagNamesResponse.Images["+ i +"].Tags["+ j +"].TagName"));
				tagsItem.setParentTagName(context.stringValue("FindImagesByTagNamesResponse.Images["+ i +"].Tags["+ j +"].ParentTagName"));

				tags.add(tagsItem);
			}
			frames.setTags(tags);

			List<OCRItem> oCR = new ArrayList<OCRItem>();
			for (int j = 0; j < context.lengthValue("FindImagesByTagNamesResponse.Images["+ i +"].OCR.Length"); j++) {
				OCRItem oCRItem = new OCRItem();
				oCRItem.setOCRContents(context.stringValue("FindImagesByTagNamesResponse.Images["+ i +"].OCR["+ j +"].OCRContents"));
				oCRItem.setOCRConfidence(context.floatValue("FindImagesByTagNamesResponse.Images["+ i +"].OCR["+ j +"].OCRConfidence"));

				OCRBoundary oCRBoundary = new OCRBoundary();
				oCRBoundary.setLeft(context.integerValue("FindImagesByTagNamesResponse.Images["+ i +"].OCR["+ j +"].OCRBoundary.Left"));
				oCRBoundary.setLeft1(context.integerValue("FindImagesByTagNamesResponse.Images["+ i +"].OCR["+ j +"].OCRBoundary.Left"));
				oCRBoundary.setWidth(context.integerValue("FindImagesByTagNamesResponse.Images["+ i +"].OCR["+ j +"].OCRBoundary.Width"));
				oCRBoundary.setHeight(context.integerValue("FindImagesByTagNamesResponse.Images["+ i +"].OCR["+ j +"].OCRBoundary.Height"));
				oCRItem.setOCRBoundary(oCRBoundary);

				oCR.add(oCRItem);
			}
			frames.setOCR(oCR);

			List<CelebrityItem> celebrity = new ArrayList<CelebrityItem>();
			for (int j = 0; j < context.lengthValue("FindImagesByTagNamesResponse.Images["+ i +"].Celebrity.Length"); j++) {
				CelebrityItem celebrityItem = new CelebrityItem();
				celebrityItem.setCelebrityName(context.stringValue("FindImagesByTagNamesResponse.Images["+ i +"].Celebrity["+ j +"].CelebrityName"));
				celebrityItem.setCelebrityGender(context.stringValue("FindImagesByTagNamesResponse.Images["+ i +"].Celebrity["+ j +"].CelebrityGender"));
				celebrityItem.setCelebrityConfidence(context.floatValue("FindImagesByTagNamesResponse.Images["+ i +"].Celebrity["+ j +"].CelebrityConfidence"));
				celebrityItem.setCelebrityLibraryName(context.stringValue("FindImagesByTagNamesResponse.Images["+ i +"].Celebrity["+ j +"].CelebrityLibraryName"));

				CelebrityBoundary celebrityBoundary = new CelebrityBoundary();
				celebrityBoundary.setLeft(context.integerValue("FindImagesByTagNamesResponse.Images["+ i +"].Celebrity["+ j +"].CelebrityBoundary.Left"));
				celebrityBoundary.setTop(context.integerValue("FindImagesByTagNamesResponse.Images["+ i +"].Celebrity["+ j +"].CelebrityBoundary.Top"));
				celebrityBoundary.setWidth(context.integerValue("FindImagesByTagNamesResponse.Images["+ i +"].Celebrity["+ j +"].CelebrityBoundary.Width"));
				celebrityBoundary.setHeight(context.integerValue("FindImagesByTagNamesResponse.Images["+ i +"].Celebrity["+ j +"].CelebrityBoundary.Height"));
				celebrityItem.setCelebrityBoundary(celebrityBoundary);

				celebrity.add(celebrityItem);
			}
			frames.setCelebrity(celebrity);

			images.add(frames);
		}
		findImagesByTagNamesResponse.setImages(images);
	 
	 	return findImagesByTagNamesResponse;
	}
}