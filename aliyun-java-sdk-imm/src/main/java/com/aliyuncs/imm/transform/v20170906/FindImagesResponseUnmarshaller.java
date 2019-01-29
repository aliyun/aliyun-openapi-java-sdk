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

import com.aliyuncs.imm.model.v20170906.FindImagesResponse;
import com.aliyuncs.imm.model.v20170906.FindImagesResponse.ImagesItem;
import com.aliyuncs.imm.model.v20170906.FindImagesResponse.ImagesItem.CelebrityItem;
import com.aliyuncs.imm.model.v20170906.FindImagesResponse.ImagesItem.CelebrityItem.CelebrityBoundary;
import com.aliyuncs.imm.model.v20170906.FindImagesResponse.ImagesItem.FacesItem;
import com.aliyuncs.imm.model.v20170906.FindImagesResponse.ImagesItem.FacesItem.EmotionDetails;
import com.aliyuncs.imm.model.v20170906.FindImagesResponse.ImagesItem.FacesItem.FaceAttributes;
import com.aliyuncs.imm.model.v20170906.FindImagesResponse.ImagesItem.FacesItem.FaceAttributes.FaceBoundary;
import com.aliyuncs.imm.model.v20170906.FindImagesResponse.ImagesItem.OCRItem;
import com.aliyuncs.imm.model.v20170906.FindImagesResponse.ImagesItem.OCRItem.OCRBoundary;
import com.aliyuncs.imm.model.v20170906.FindImagesResponse.ImagesItem.TagsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class FindImagesResponseUnmarshaller {

	public static FindImagesResponse unmarshall(FindImagesResponse findImagesResponse, UnmarshallerContext context) {
		
		findImagesResponse.setRequestId(context.stringValue("FindImagesResponse.RequestId"));
		findImagesResponse.setSetId(context.stringValue("FindImagesResponse.SetId"));
		findImagesResponse.setNextMarker(context.stringValue("FindImagesResponse.NextMarker"));

		List<ImagesItem> images = new ArrayList<ImagesItem>();
		for (int i = 0; i < context.lengthValue("FindImagesResponse.Images.Length"); i++) {
			ImagesItem imagesItem = new ImagesItem();
			imagesItem.setFacesModifyTime(context.stringValue("FindImagesResponse.Images["+ i +"].FacesModifyTime"));
			imagesItem.setOCRModifyTime(context.stringValue("FindImagesResponse.Images["+ i +"].OCRModifyTime"));
			imagesItem.setOCRStatus(context.stringValue("FindImagesResponse.Images["+ i +"].OCRStatus"));
			imagesItem.setSourcePosition(context.stringValue("FindImagesResponse.Images["+ i +"].SourcePosition"));
			imagesItem.setExif(context.stringValue("FindImagesResponse.Images["+ i +"].Exif"));
			imagesItem.setImageUri(context.stringValue("FindImagesResponse.Images["+ i +"].ImageUri"));
			imagesItem.setImageWidth(context.integerValue("FindImagesResponse.Images["+ i +"].ImageWidth"));
			imagesItem.setImageFormat(context.stringValue("FindImagesResponse.Images["+ i +"].ImageFormat"));
			imagesItem.setSourceType(context.stringValue("FindImagesResponse.Images["+ i +"].SourceType"));
			imagesItem.setModifyTime(context.stringValue("FindImagesResponse.Images["+ i +"].ModifyTime"));
			imagesItem.setFileSize(context.integerValue("FindImagesResponse.Images["+ i +"].FileSize"));
			imagesItem.setSourceUri(context.stringValue("FindImagesResponse.Images["+ i +"].SourceUri"));
			imagesItem.setCreateTime(context.stringValue("FindImagesResponse.Images["+ i +"].CreateTime"));
			imagesItem.setFacesStatus(context.stringValue("FindImagesResponse.Images["+ i +"].FacesStatus"));
			imagesItem.setRemarksA(context.stringValue("FindImagesResponse.Images["+ i +"].RemarksA"));
			imagesItem.setImageHeight(context.integerValue("FindImagesResponse.Images["+ i +"].ImageHeight"));
			imagesItem.setRemarksB(context.stringValue("FindImagesResponse.Images["+ i +"].RemarksB"));
			imagesItem.setImageTime(context.stringValue("FindImagesResponse.Images["+ i +"].ImageTime"));
			imagesItem.setOrientation(context.stringValue("FindImagesResponse.Images["+ i +"].Orientation"));
			imagesItem.setLocation(context.stringValue("FindImagesResponse.Images["+ i +"].Location"));
			imagesItem.setOCRFailReason(context.stringValue("FindImagesResponse.Images["+ i +"].OCRFailReason"));
			imagesItem.setFacesFailReason(context.stringValue("FindImagesResponse.Images["+ i +"].FacesFailReason"));
			imagesItem.setTagsFailReason(context.stringValue("FindImagesResponse.Images["+ i +"].TagsFailReason"));
			imagesItem.setTagsModifyTime(context.stringValue("FindImagesResponse.Images["+ i +"].TagsModifyTime"));
			imagesItem.setCelebrityStatus(context.stringValue("FindImagesResponse.Images["+ i +"].CelebrityStatus"));
			imagesItem.setCelebrityModifyTime(context.stringValue("FindImagesResponse.Images["+ i +"].CelebrityModifyTime"));
			imagesItem.setCelebrityFailReason(context.stringValue("FindImagesResponse.Images["+ i +"].CelebrityFailReason"));
			imagesItem.setTagsStatus(context.stringValue("FindImagesResponse.Images["+ i +"].TagsStatus"));
			imagesItem.setRemarksC(context.stringValue("FindImagesResponse.Images["+ i +"].RemarksC"));
			imagesItem.setRemarksD(context.stringValue("FindImagesResponse.Images["+ i +"].RemarksD"));
			imagesItem.setExternalId(context.stringValue("FindImagesResponse.Images["+ i +"].ExternalId"));

			List<FacesItem> faces = new ArrayList<FacesItem>();
			for (int j = 0; j < context.lengthValue("FindImagesResponse.Images["+ i +"].Faces.Length"); j++) {
				FacesItem facesItem = new FacesItem();
				facesItem.setAge(context.integerValue("FindImagesResponse.Images["+ i +"].Faces["+ j +"].Age"));
				facesItem.setGenderConfidence(context.floatValue("FindImagesResponse.Images["+ i +"].Faces["+ j +"].GenderConfidence"));
				facesItem.setAttractive(context.floatValue("FindImagesResponse.Images["+ i +"].Faces["+ j +"].Attractive"));
				facesItem.setGender(context.stringValue("FindImagesResponse.Images["+ i +"].Faces["+ j +"].Gender"));
				facesItem.setFaceConfidence(context.floatValue("FindImagesResponse.Images["+ i +"].Faces["+ j +"].FaceConfidence"));
				facesItem.setEmotion(context.stringValue("FindImagesResponse.Images["+ i +"].Faces["+ j +"].Emotion"));
				facesItem.setFaceId(context.stringValue("FindImagesResponse.Images["+ i +"].Faces["+ j +"].FaceId"));
				facesItem.setEmotionConfidence(context.floatValue("FindImagesResponse.Images["+ i +"].Faces["+ j +"].EmotionConfidence"));

				EmotionDetails emotionDetails = new EmotionDetails();
				emotionDetails.setSAD(context.floatValue("FindImagesResponse.Images["+ i +"].Faces["+ j +"].EmotionDetails.SAD"));
				emotionDetails.setCALM(context.floatValue("FindImagesResponse.Images["+ i +"].Faces["+ j +"].EmotionDetails.CALM"));
				emotionDetails.setANGRY(context.floatValue("FindImagesResponse.Images["+ i +"].Faces["+ j +"].EmotionDetails.ANGRY"));
				emotionDetails.setHAPPY(context.floatValue("FindImagesResponse.Images["+ i +"].Faces["+ j +"].EmotionDetails.HAPPY"));
				emotionDetails.setSCARED(context.floatValue("FindImagesResponse.Images["+ i +"].Faces["+ j +"].EmotionDetails.SCARED"));
				emotionDetails.setDISGUSTED(context.floatValue("FindImagesResponse.Images["+ i +"].Faces["+ j +"].EmotionDetails.DISGUSTED"));
				emotionDetails.setSURPRISED(context.floatValue("FindImagesResponse.Images["+ i +"].Faces["+ j +"].EmotionDetails.SURPRISED"));
				facesItem.setEmotionDetails(emotionDetails);

				FaceAttributes faceAttributes = new FaceAttributes();
				faceAttributes.setGlassesConfidence(context.floatValue("FindImagesResponse.Images["+ i +"].Faces["+ j +"].FaceAttributes.GlassesConfidence"));
				faceAttributes.setGlasses(context.stringValue("FindImagesResponse.Images["+ i +"].Faces["+ j +"].FaceAttributes.Glasses"));
				faceAttributes.setRaceConfidence(context.floatValue("FindImagesResponse.Images["+ i +"].Faces["+ j +"].FaceAttributes.RaceConfidence"));
				faceAttributes.setBeard(context.stringValue("FindImagesResponse.Images["+ i +"].Faces["+ j +"].FaceAttributes.Beard"));
				faceAttributes.setMaskConfidence(context.floatValue("FindImagesResponse.Images["+ i +"].Faces["+ j +"].FaceAttributes.MaskConfidence"));
				faceAttributes.setRace(context.stringValue("FindImagesResponse.Images["+ i +"].Faces["+ j +"].FaceAttributes.Race"));
				faceAttributes.setBeardConfidence(context.floatValue("FindImagesResponse.Images["+ i +"].Faces["+ j +"].FaceAttributes.BeardConfidence"));
				faceAttributes.setMask(context.stringValue("FindImagesResponse.Images["+ i +"].Faces["+ j +"].FaceAttributes.Mask"));

				FaceBoundary faceBoundary = new FaceBoundary();
				faceBoundary.setTop(context.integerValue("FindImagesResponse.Images["+ i +"].Faces["+ j +"].FaceAttributes.FaceBoundary.Top"));
				faceBoundary.setHeight(context.integerValue("FindImagesResponse.Images["+ i +"].Faces["+ j +"].FaceAttributes.FaceBoundary.Height"));
				faceBoundary.setWidth(context.integerValue("FindImagesResponse.Images["+ i +"].Faces["+ j +"].FaceAttributes.FaceBoundary.Width"));
				faceBoundary.setLeft(context.integerValue("FindImagesResponse.Images["+ i +"].Faces["+ j +"].FaceAttributes.FaceBoundary.Left"));
				faceAttributes.setFaceBoundary(faceBoundary);
				facesItem.setFaceAttributes(faceAttributes);

				faces.add(facesItem);
			}
			imagesItem.setFaces(faces);

			List<TagsItem> tags = new ArrayList<TagsItem>();
			for (int j = 0; j < context.lengthValue("FindImagesResponse.Images["+ i +"].Tags.Length"); j++) {
				TagsItem tagsItem = new TagsItem();
				tagsItem.setTagConfidence(context.floatValue("FindImagesResponse.Images["+ i +"].Tags["+ j +"].TagConfidence"));
				tagsItem.setTagLevel(context.integerValue("FindImagesResponse.Images["+ i +"].Tags["+ j +"].TagLevel"));
				tagsItem.setTagName(context.stringValue("FindImagesResponse.Images["+ i +"].Tags["+ j +"].TagName"));
				tagsItem.setParentTagName(context.stringValue("FindImagesResponse.Images["+ i +"].Tags["+ j +"].ParentTagName"));

				tags.add(tagsItem);
			}
			imagesItem.setTags(tags);

			List<OCRItem> oCR = new ArrayList<OCRItem>();
			for (int j = 0; j < context.lengthValue("FindImagesResponse.Images["+ i +"].OCR.Length"); j++) {
				OCRItem oCRItem = new OCRItem();
				oCRItem.setOCRContents(context.stringValue("FindImagesResponse.Images["+ i +"].OCR["+ j +"].OCRContents"));
				oCRItem.setOCRConfidence(context.floatValue("FindImagesResponse.Images["+ i +"].OCR["+ j +"].OCRConfidence"));

				OCRBoundary oCRBoundary = new OCRBoundary();
				oCRBoundary.setLeft(context.integerValue("FindImagesResponse.Images["+ i +"].OCR["+ j +"].OCRBoundary.Left"));
				oCRBoundary.setLeft1(context.integerValue("FindImagesResponse.Images["+ i +"].OCR["+ j +"].OCRBoundary.Left"));
				oCRBoundary.setWidth(context.integerValue("FindImagesResponse.Images["+ i +"].OCR["+ j +"].OCRBoundary.Width"));
				oCRBoundary.setHeight(context.integerValue("FindImagesResponse.Images["+ i +"].OCR["+ j +"].OCRBoundary.Height"));
				oCRItem.setOCRBoundary(oCRBoundary);

				oCR.add(oCRItem);
			}
			imagesItem.setOCR(oCR);

			List<CelebrityItem> celebrity = new ArrayList<CelebrityItem>();
			for (int j = 0; j < context.lengthValue("FindImagesResponse.Images["+ i +"].Celebrity.Length"); j++) {
				CelebrityItem celebrityItem = new CelebrityItem();
				celebrityItem.setCelebrityName(context.stringValue("FindImagesResponse.Images["+ i +"].Celebrity["+ j +"].CelebrityName"));
				celebrityItem.setCelebrityGender(context.stringValue("FindImagesResponse.Images["+ i +"].Celebrity["+ j +"].CelebrityGender"));
				celebrityItem.setCelebrityConfidence(context.floatValue("FindImagesResponse.Images["+ i +"].Celebrity["+ j +"].CelebrityConfidence"));
				celebrityItem.setCelebrityLibraryName(context.stringValue("FindImagesResponse.Images["+ i +"].Celebrity["+ j +"].CelebrityLibraryName"));

				CelebrityBoundary celebrityBoundary = new CelebrityBoundary();
				celebrityBoundary.setLeft(context.integerValue("FindImagesResponse.Images["+ i +"].Celebrity["+ j +"].CelebrityBoundary.Left"));
				celebrityBoundary.setTop(context.integerValue("FindImagesResponse.Images["+ i +"].Celebrity["+ j +"].CelebrityBoundary.Top"));
				celebrityBoundary.setWidth(context.integerValue("FindImagesResponse.Images["+ i +"].Celebrity["+ j +"].CelebrityBoundary.Width"));
				celebrityBoundary.setHeight(context.integerValue("FindImagesResponse.Images["+ i +"].Celebrity["+ j +"].CelebrityBoundary.Height"));
				celebrityItem.setCelebrityBoundary(celebrityBoundary);

				celebrity.add(celebrityItem);
			}
			imagesItem.setCelebrity(celebrity);

			images.add(imagesItem);
		}
		findImagesResponse.setImages(images);
	 
	 	return findImagesResponse;
	}
}