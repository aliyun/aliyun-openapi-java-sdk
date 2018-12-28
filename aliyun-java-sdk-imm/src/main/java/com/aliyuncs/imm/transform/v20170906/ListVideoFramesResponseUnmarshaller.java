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

import com.aliyuncs.imm.model.v20170906.ListVideoFramesResponse;
import com.aliyuncs.imm.model.v20170906.ListVideoFramesResponse.FramesItem;
import com.aliyuncs.imm.model.v20170906.ListVideoFramesResponse.FramesItem.CelebrityItem;
import com.aliyuncs.imm.model.v20170906.ListVideoFramesResponse.FramesItem.CelebrityItem.CelebrityBoundary;
import com.aliyuncs.imm.model.v20170906.ListVideoFramesResponse.FramesItem.FacesItem;
import com.aliyuncs.imm.model.v20170906.ListVideoFramesResponse.FramesItem.FacesItem.EmotionDetails;
import com.aliyuncs.imm.model.v20170906.ListVideoFramesResponse.FramesItem.FacesItem.FaceAttributes;
import com.aliyuncs.imm.model.v20170906.ListVideoFramesResponse.FramesItem.FacesItem.FaceAttributes.FaceBoundary;
import com.aliyuncs.imm.model.v20170906.ListVideoFramesResponse.FramesItem.OCRItem;
import com.aliyuncs.imm.model.v20170906.ListVideoFramesResponse.FramesItem.OCRItem.OCRBoundary;
import com.aliyuncs.imm.model.v20170906.ListVideoFramesResponse.FramesItem.TagsItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListVideoFramesResponseUnmarshaller {

	public static ListVideoFramesResponse unmarshall(ListVideoFramesResponse listVideoFramesResponse, UnmarshallerContext context) {
		
		listVideoFramesResponse.setRequestId(context.stringValue("ListVideoFramesResponse.RequestId"));
		listVideoFramesResponse.setSetId(context.stringValue("ListVideoFramesResponse.SetId"));
		listVideoFramesResponse.setVideoUri(context.stringValue("ListVideoFramesResponse.VideoUri"));
		listVideoFramesResponse.setNextMarker(context.stringValue("ListVideoFramesResponse.NextMarker"));

		List<FramesItem> frames = new ArrayList<FramesItem>();
		for (int i = 0; i < context.lengthValue("ListVideoFramesResponse.Frames.Length"); i++) {
			FramesItem framesItem = new FramesItem();
			framesItem.setFacesModifyTime(context.stringValue("ListVideoFramesResponse.Frames["+ i +"].FacesModifyTime"));
			framesItem.setOCRModifyTime(context.stringValue("ListVideoFramesResponse.Frames["+ i +"].OCRModifyTime"));
			framesItem.setOCRStatus(context.stringValue("ListVideoFramesResponse.Frames["+ i +"].OCRStatus"));
			framesItem.setSourcePosition(context.stringValue("ListVideoFramesResponse.Frames["+ i +"].SourcePosition"));
			framesItem.setExif(context.stringValue("ListVideoFramesResponse.Frames["+ i +"].Exif"));
			framesItem.setImageUri(context.stringValue("ListVideoFramesResponse.Frames["+ i +"].ImageUri"));
			framesItem.setImageWidth(context.integerValue("ListVideoFramesResponse.Frames["+ i +"].ImageWidth"));
			framesItem.setImageFormat(context.stringValue("ListVideoFramesResponse.Frames["+ i +"].ImageFormat"));
			framesItem.setSourceType(context.stringValue("ListVideoFramesResponse.Frames["+ i +"].SourceType"));
			framesItem.setModifyTime(context.stringValue("ListVideoFramesResponse.Frames["+ i +"].ModifyTime"));
			framesItem.setFileSize(context.integerValue("ListVideoFramesResponse.Frames["+ i +"].FileSize"));
			framesItem.setSourceUri(context.stringValue("ListVideoFramesResponse.Frames["+ i +"].SourceUri"));
			framesItem.setCreateTime(context.stringValue("ListVideoFramesResponse.Frames["+ i +"].CreateTime"));
			framesItem.setFacesStatus(context.stringValue("ListVideoFramesResponse.Frames["+ i +"].FacesStatus"));
			framesItem.setRemarksA(context.stringValue("ListVideoFramesResponse.Frames["+ i +"].RemarksA"));
			framesItem.setImageHeight(context.integerValue("ListVideoFramesResponse.Frames["+ i +"].ImageHeight"));
			framesItem.setRemarksB(context.stringValue("ListVideoFramesResponse.Frames["+ i +"].RemarksB"));
			framesItem.setImageTime(context.stringValue("ListVideoFramesResponse.Frames["+ i +"].ImageTime"));
			framesItem.setOrientation(context.stringValue("ListVideoFramesResponse.Frames["+ i +"].Orientation"));
			framesItem.setLocation(context.stringValue("ListVideoFramesResponse.Frames["+ i +"].Location"));
			framesItem.setOCRFailReason(context.stringValue("ListVideoFramesResponse.Frames["+ i +"].OCRFailReason"));
			framesItem.setFacesFailReason(context.stringValue("ListVideoFramesResponse.Frames["+ i +"].FacesFailReason"));
			framesItem.setTagsFailReason(context.stringValue("ListVideoFramesResponse.Frames["+ i +"].TagsFailReason"));
			framesItem.setTagsModifyTime(context.stringValue("ListVideoFramesResponse.Frames["+ i +"].TagsModifyTime"));
			framesItem.setCelebrityStatus(context.stringValue("ListVideoFramesResponse.Frames["+ i +"].CelebrityStatus"));
			framesItem.setCelebrityModifyTime(context.stringValue("ListVideoFramesResponse.Frames["+ i +"].CelebrityModifyTime"));
			framesItem.setCelebrityFailReason(context.stringValue("ListVideoFramesResponse.Frames["+ i +"].CelebrityFailReason"));
			framesItem.setTagsStatus(context.stringValue("ListVideoFramesResponse.Frames["+ i +"].TagsStatus"));

			List<FacesItem> faces = new ArrayList<FacesItem>();
			for (int j = 0; j < context.lengthValue("ListVideoFramesResponse.Frames["+ i +"].Faces.Length"); j++) {
				FacesItem facesItem = new FacesItem();
				facesItem.setAge(context.integerValue("ListVideoFramesResponse.Frames["+ i +"].Faces["+ j +"].Age"));
				facesItem.setGenderConfidence(context.floatValue("ListVideoFramesResponse.Frames["+ i +"].Faces["+ j +"].GenderConfidence"));
				facesItem.setAttractive(context.floatValue("ListVideoFramesResponse.Frames["+ i +"].Faces["+ j +"].Attractive"));
				facesItem.setGender(context.stringValue("ListVideoFramesResponse.Frames["+ i +"].Faces["+ j +"].Gender"));
				facesItem.setFaceConfidence(context.floatValue("ListVideoFramesResponse.Frames["+ i +"].Faces["+ j +"].FaceConfidence"));
				facesItem.setEmotion(context.stringValue("ListVideoFramesResponse.Frames["+ i +"].Faces["+ j +"].Emotion"));
				facesItem.setFaceId(context.stringValue("ListVideoFramesResponse.Frames["+ i +"].Faces["+ j +"].FaceId"));
				facesItem.setEmotionConfidence(context.floatValue("ListVideoFramesResponse.Frames["+ i +"].Faces["+ j +"].EmotionConfidence"));

				EmotionDetails emotionDetails = new EmotionDetails();
				emotionDetails.setSAD(context.floatValue("ListVideoFramesResponse.Frames["+ i +"].Faces["+ j +"].EmotionDetails.SAD"));
				emotionDetails.setCALM(context.floatValue("ListVideoFramesResponse.Frames["+ i +"].Faces["+ j +"].EmotionDetails.CALM"));
				emotionDetails.setANGRY(context.floatValue("ListVideoFramesResponse.Frames["+ i +"].Faces["+ j +"].EmotionDetails.ANGRY"));
				emotionDetails.setHAPPY(context.floatValue("ListVideoFramesResponse.Frames["+ i +"].Faces["+ j +"].EmotionDetails.HAPPY"));
				emotionDetails.setSCARED(context.floatValue("ListVideoFramesResponse.Frames["+ i +"].Faces["+ j +"].EmotionDetails.SCARED"));
				emotionDetails.setDISGUSTED(context.floatValue("ListVideoFramesResponse.Frames["+ i +"].Faces["+ j +"].EmotionDetails.DISGUSTED"));
				emotionDetails.setSURPRISED(context.floatValue("ListVideoFramesResponse.Frames["+ i +"].Faces["+ j +"].EmotionDetails.SURPRISED"));
				facesItem.setEmotionDetails(emotionDetails);

				FaceAttributes faceAttributes = new FaceAttributes();
				faceAttributes.setGlassesConfidence(context.floatValue("ListVideoFramesResponse.Frames["+ i +"].Faces["+ j +"].FaceAttributes.GlassesConfidence"));
				faceAttributes.setGlasses(context.stringValue("ListVideoFramesResponse.Frames["+ i +"].Faces["+ j +"].FaceAttributes.Glasses"));
				faceAttributes.setRaceConfidence(context.floatValue("ListVideoFramesResponse.Frames["+ i +"].Faces["+ j +"].FaceAttributes.RaceConfidence"));
				faceAttributes.setBeard(context.stringValue("ListVideoFramesResponse.Frames["+ i +"].Faces["+ j +"].FaceAttributes.Beard"));
				faceAttributes.setMaskConfidence(context.floatValue("ListVideoFramesResponse.Frames["+ i +"].Faces["+ j +"].FaceAttributes.MaskConfidence"));
				faceAttributes.setRace(context.stringValue("ListVideoFramesResponse.Frames["+ i +"].Faces["+ j +"].FaceAttributes.Race"));
				faceAttributes.setBeardConfidence(context.floatValue("ListVideoFramesResponse.Frames["+ i +"].Faces["+ j +"].FaceAttributes.BeardConfidence"));
				faceAttributes.setMask(context.stringValue("ListVideoFramesResponse.Frames["+ i +"].Faces["+ j +"].FaceAttributes.Mask"));

				FaceBoundary faceBoundary = new FaceBoundary();
				faceBoundary.setTop(context.integerValue("ListVideoFramesResponse.Frames["+ i +"].Faces["+ j +"].FaceAttributes.FaceBoundary.Top"));
				faceBoundary.setHeight(context.integerValue("ListVideoFramesResponse.Frames["+ i +"].Faces["+ j +"].FaceAttributes.FaceBoundary.Height"));
				faceBoundary.setWidth(context.integerValue("ListVideoFramesResponse.Frames["+ i +"].Faces["+ j +"].FaceAttributes.FaceBoundary.Width"));
				faceBoundary.setLeft(context.integerValue("ListVideoFramesResponse.Frames["+ i +"].Faces["+ j +"].FaceAttributes.FaceBoundary.Left"));
				faceAttributes.setFaceBoundary(faceBoundary);
				facesItem.setFaceAttributes(faceAttributes);

				faces.add(facesItem);
			}
			framesItem.setFaces(faces);

			List<TagsItem> tags = new ArrayList<TagsItem>();
			for (int j = 0; j < context.lengthValue("ListVideoFramesResponse.Frames["+ i +"].Tags.Length"); j++) {
				TagsItem tagsItem = new TagsItem();
				tagsItem.setTagConfidence(context.floatValue("ListVideoFramesResponse.Frames["+ i +"].Tags["+ j +"].TagConfidence"));
				tagsItem.setTagLevel(context.integerValue("ListVideoFramesResponse.Frames["+ i +"].Tags["+ j +"].TagLevel"));
				tagsItem.setTagName(context.stringValue("ListVideoFramesResponse.Frames["+ i +"].Tags["+ j +"].TagName"));
				tagsItem.setParentTagName(context.stringValue("ListVideoFramesResponse.Frames["+ i +"].Tags["+ j +"].ParentTagName"));

				tags.add(tagsItem);
			}
			framesItem.setTags(tags);

			List<OCRItem> oCR = new ArrayList<OCRItem>();
			for (int j = 0; j < context.lengthValue("ListVideoFramesResponse.Frames["+ i +"].OCR.Length"); j++) {
				OCRItem oCRItem = new OCRItem();
				oCRItem.setOCRContents(context.stringValue("ListVideoFramesResponse.Frames["+ i +"].OCR["+ j +"].OCRContents"));
				oCRItem.setOCRConfidence(context.floatValue("ListVideoFramesResponse.Frames["+ i +"].OCR["+ j +"].OCRConfidence"));

				OCRBoundary oCRBoundary = new OCRBoundary();
				oCRBoundary.setLeft(context.integerValue("ListVideoFramesResponse.Frames["+ i +"].OCR["+ j +"].OCRBoundary.Left"));
				oCRBoundary.setLeft1(context.integerValue("ListVideoFramesResponse.Frames["+ i +"].OCR["+ j +"].OCRBoundary.Left"));
				oCRBoundary.setWidth(context.integerValue("ListVideoFramesResponse.Frames["+ i +"].OCR["+ j +"].OCRBoundary.Width"));
				oCRBoundary.setHeight(context.integerValue("ListVideoFramesResponse.Frames["+ i +"].OCR["+ j +"].OCRBoundary.Height"));
				oCRItem.setOCRBoundary(oCRBoundary);

				oCR.add(oCRItem);
			}
			framesItem.setOCR(oCR);

			List<CelebrityItem> celebrity = new ArrayList<CelebrityItem>();
			for (int j = 0; j < context.lengthValue("ListVideoFramesResponse.Frames["+ i +"].Celebrity.Length"); j++) {
				CelebrityItem celebrityItem = new CelebrityItem();
				celebrityItem.setCelebrityName(context.stringValue("ListVideoFramesResponse.Frames["+ i +"].Celebrity["+ j +"].CelebrityName"));
				celebrityItem.setCelebrityGender(context.stringValue("ListVideoFramesResponse.Frames["+ i +"].Celebrity["+ j +"].CelebrityGender"));
				celebrityItem.setCelebrityConfidence(context.floatValue("ListVideoFramesResponse.Frames["+ i +"].Celebrity["+ j +"].CelebrityConfidence"));
				celebrityItem.setCelebrityLibraryName(context.stringValue("ListVideoFramesResponse.Frames["+ i +"].Celebrity["+ j +"].CelebrityLibraryName"));

				CelebrityBoundary celebrityBoundary = new CelebrityBoundary();
				celebrityBoundary.setLeft(context.integerValue("ListVideoFramesResponse.Frames["+ i +"].Celebrity["+ j +"].CelebrityBoundary.Left"));
				celebrityBoundary.setTop(context.integerValue("ListVideoFramesResponse.Frames["+ i +"].Celebrity["+ j +"].CelebrityBoundary.Top"));
				celebrityBoundary.setWidth(context.integerValue("ListVideoFramesResponse.Frames["+ i +"].Celebrity["+ j +"].CelebrityBoundary.Width"));
				celebrityBoundary.setHeight(context.integerValue("ListVideoFramesResponse.Frames["+ i +"].Celebrity["+ j +"].CelebrityBoundary.Height"));
				celebrityItem.setCelebrityBoundary(celebrityBoundary);

				celebrity.add(celebrityItem);
			}
			framesItem.setCelebrity(celebrity);

			frames.add(framesItem);
		}
		listVideoFramesResponse.setFrames(frames);
	 
	 	return listVideoFramesResponse;
	}
}