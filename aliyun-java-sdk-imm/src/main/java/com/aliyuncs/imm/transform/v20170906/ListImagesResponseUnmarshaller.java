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

import com.aliyuncs.imm.model.v20170906.ListImagesResponse;
import com.aliyuncs.imm.model.v20170906.ListImagesResponse.ImagesItem;
import com.aliyuncs.imm.model.v20170906.ListImagesResponse.ImagesItem.CelebrityItem;
import com.aliyuncs.imm.model.v20170906.ListImagesResponse.ImagesItem.CelebrityItem.CelebrityBoundary;
import com.aliyuncs.imm.model.v20170906.ListImagesResponse.ImagesItem.FacesItem;
import com.aliyuncs.imm.model.v20170906.ListImagesResponse.ImagesItem.FacesItem.EmotionDetails;
import com.aliyuncs.imm.model.v20170906.ListImagesResponse.ImagesItem.FacesItem.FaceAttributes;
import com.aliyuncs.imm.model.v20170906.ListImagesResponse.ImagesItem.FacesItem.FaceAttributes.FaceBoundary;
import com.aliyuncs.imm.model.v20170906.ListImagesResponse.ImagesItem.OCRItem;
import com.aliyuncs.imm.model.v20170906.ListImagesResponse.ImagesItem.OCRItem.OCRBoundary;
import com.aliyuncs.imm.model.v20170906.ListImagesResponse.ImagesItem.TagsItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListImagesResponseUnmarshaller {

	public static ListImagesResponse unmarshall(ListImagesResponse listImagesResponse, UnmarshallerContext context) {
		
		listImagesResponse.setRequestId(context.stringValue("ListImagesResponse.RequestId"));
		listImagesResponse.setSetId(context.stringValue("ListImagesResponse.SetId"));
		listImagesResponse.setNextMarker(context.stringValue("ListImagesResponse.NextMarker"));

		List<ImagesItem> images = new ArrayList<ImagesItem>();
		for (int i = 0; i < context.lengthValue("ListImagesResponse.Images.Length"); i++) {
			ImagesItem imagesItem = new ImagesItem();
			imagesItem.setFacesModifyTime(context.stringValue("ListImagesResponse.Images["+ i +"].FacesModifyTime"));
			imagesItem.setOCRModifyTime(context.stringValue("ListImagesResponse.Images["+ i +"].OCRModifyTime"));
			imagesItem.setOCRStatus(context.stringValue("ListImagesResponse.Images["+ i +"].OCRStatus"));
			imagesItem.setSourcePosition(context.stringValue("ListImagesResponse.Images["+ i +"].SourcePosition"));
			imagesItem.setExif(context.stringValue("ListImagesResponse.Images["+ i +"].Exif"));
			imagesItem.setImageUri(context.stringValue("ListImagesResponse.Images["+ i +"].ImageUri"));
			imagesItem.setImageWidth(context.integerValue("ListImagesResponse.Images["+ i +"].ImageWidth"));
			imagesItem.setImageFormat(context.stringValue("ListImagesResponse.Images["+ i +"].ImageFormat"));
			imagesItem.setSourceType(context.stringValue("ListImagesResponse.Images["+ i +"].SourceType"));
			imagesItem.setModifyTime(context.stringValue("ListImagesResponse.Images["+ i +"].ModifyTime"));
			imagesItem.setFileSize(context.integerValue("ListImagesResponse.Images["+ i +"].FileSize"));
			imagesItem.setSourceUri(context.stringValue("ListImagesResponse.Images["+ i +"].SourceUri"));
			imagesItem.setCreateTime(context.stringValue("ListImagesResponse.Images["+ i +"].CreateTime"));
			imagesItem.setFacesStatus(context.stringValue("ListImagesResponse.Images["+ i +"].FacesStatus"));
			imagesItem.setRemarksA(context.stringValue("ListImagesResponse.Images["+ i +"].RemarksA"));
			imagesItem.setImageHeight(context.integerValue("ListImagesResponse.Images["+ i +"].ImageHeight"));
			imagesItem.setRemarksB(context.stringValue("ListImagesResponse.Images["+ i +"].RemarksB"));
			imagesItem.setImageTime(context.stringValue("ListImagesResponse.Images["+ i +"].ImageTime"));
			imagesItem.setOrientation(context.stringValue("ListImagesResponse.Images["+ i +"].Orientation"));
			imagesItem.setLocation(context.stringValue("ListImagesResponse.Images["+ i +"].Location"));
			imagesItem.setOCRFailReason(context.stringValue("ListImagesResponse.Images["+ i +"].OCRFailReason"));
			imagesItem.setFacesFailReason(context.stringValue("ListImagesResponse.Images["+ i +"].FacesFailReason"));
			imagesItem.setTagsFailReason(context.stringValue("ListImagesResponse.Images["+ i +"].TagsFailReason"));
			imagesItem.setTagsModifyTime(context.stringValue("ListImagesResponse.Images["+ i +"].TagsModifyTime"));
			imagesItem.setCelebrityStatus(context.stringValue("ListImagesResponse.Images["+ i +"].CelebrityStatus"));
			imagesItem.setCelebrityModifyTime(context.stringValue("ListImagesResponse.Images["+ i +"].CelebrityModifyTime"));
			imagesItem.setCelebrityFailReason(context.stringValue("ListImagesResponse.Images["+ i +"].CelebrityFailReason"));
			imagesItem.setTagsStatus(context.stringValue("ListImagesResponse.Images["+ i +"].TagsStatus"));

			List<FacesItem> faces = new ArrayList<FacesItem>();
			for (int j = 0; j < context.lengthValue("ListImagesResponse.Images["+ i +"].Faces.Length"); j++) {
				FacesItem facesItem = new FacesItem();
				facesItem.setAge(context.integerValue("ListImagesResponse.Images["+ i +"].Faces["+ j +"].Age"));
				facesItem.setGenderConfidence(context.floatValue("ListImagesResponse.Images["+ i +"].Faces["+ j +"].GenderConfidence"));
				facesItem.setAttractive(context.floatValue("ListImagesResponse.Images["+ i +"].Faces["+ j +"].Attractive"));
				facesItem.setGender(context.stringValue("ListImagesResponse.Images["+ i +"].Faces["+ j +"].Gender"));
				facesItem.setFaceConfidence(context.floatValue("ListImagesResponse.Images["+ i +"].Faces["+ j +"].FaceConfidence"));
				facesItem.setEmotion(context.stringValue("ListImagesResponse.Images["+ i +"].Faces["+ j +"].Emotion"));
				facesItem.setFaceId(context.stringValue("ListImagesResponse.Images["+ i +"].Faces["+ j +"].FaceId"));
				facesItem.setEmotionConfidence(context.floatValue("ListImagesResponse.Images["+ i +"].Faces["+ j +"].EmotionConfidence"));

				EmotionDetails emotionDetails = new EmotionDetails();
				emotionDetails.setSAD(context.floatValue("ListImagesResponse.Images["+ i +"].Faces["+ j +"].EmotionDetails.SAD"));
				emotionDetails.setCALM(context.floatValue("ListImagesResponse.Images["+ i +"].Faces["+ j +"].EmotionDetails.CALM"));
				emotionDetails.setANGRY(context.floatValue("ListImagesResponse.Images["+ i +"].Faces["+ j +"].EmotionDetails.ANGRY"));
				emotionDetails.setHAPPY(context.floatValue("ListImagesResponse.Images["+ i +"].Faces["+ j +"].EmotionDetails.HAPPY"));
				emotionDetails.setSCARED(context.floatValue("ListImagesResponse.Images["+ i +"].Faces["+ j +"].EmotionDetails.SCARED"));
				emotionDetails.setDISGUSTED(context.floatValue("ListImagesResponse.Images["+ i +"].Faces["+ j +"].EmotionDetails.DISGUSTED"));
				emotionDetails.setSURPRISED(context.floatValue("ListImagesResponse.Images["+ i +"].Faces["+ j +"].EmotionDetails.SURPRISED"));
				facesItem.setEmotionDetails(emotionDetails);

				FaceAttributes faceAttributes = new FaceAttributes();
				faceAttributes.setGlassesConfidence(context.floatValue("ListImagesResponse.Images["+ i +"].Faces["+ j +"].FaceAttributes.GlassesConfidence"));
				faceAttributes.setGlasses(context.stringValue("ListImagesResponse.Images["+ i +"].Faces["+ j +"].FaceAttributes.Glasses"));
				faceAttributes.setRaceConfidence(context.floatValue("ListImagesResponse.Images["+ i +"].Faces["+ j +"].FaceAttributes.RaceConfidence"));
				faceAttributes.setBeard(context.stringValue("ListImagesResponse.Images["+ i +"].Faces["+ j +"].FaceAttributes.Beard"));
				faceAttributes.setMaskConfidence(context.floatValue("ListImagesResponse.Images["+ i +"].Faces["+ j +"].FaceAttributes.MaskConfidence"));
				faceAttributes.setRace(context.stringValue("ListImagesResponse.Images["+ i +"].Faces["+ j +"].FaceAttributes.Race"));
				faceAttributes.setBeardConfidence(context.floatValue("ListImagesResponse.Images["+ i +"].Faces["+ j +"].FaceAttributes.BeardConfidence"));
				faceAttributes.setMask(context.stringValue("ListImagesResponse.Images["+ i +"].Faces["+ j +"].FaceAttributes.Mask"));

				FaceBoundary faceBoundary = new FaceBoundary();
				faceBoundary.setTop(context.integerValue("ListImagesResponse.Images["+ i +"].Faces["+ j +"].FaceAttributes.FaceBoundary.Top"));
				faceBoundary.setHeight(context.integerValue("ListImagesResponse.Images["+ i +"].Faces["+ j +"].FaceAttributes.FaceBoundary.Height"));
				faceBoundary.setWidth(context.integerValue("ListImagesResponse.Images["+ i +"].Faces["+ j +"].FaceAttributes.FaceBoundary.Width"));
				faceBoundary.setLeft(context.integerValue("ListImagesResponse.Images["+ i +"].Faces["+ j +"].FaceAttributes.FaceBoundary.Left"));
				faceAttributes.setFaceBoundary(faceBoundary);
				facesItem.setFaceAttributes(faceAttributes);

				faces.add(facesItem);
			}
			imagesItem.setFaces(faces);

			List<TagsItem> tags = new ArrayList<TagsItem>();
			for (int j = 0; j < context.lengthValue("ListImagesResponse.Images["+ i +"].Tags.Length"); j++) {
				TagsItem tagsItem = new TagsItem();
				tagsItem.setTagConfidence(context.floatValue("ListImagesResponse.Images["+ i +"].Tags["+ j +"].TagConfidence"));
				tagsItem.setTagLevel(context.integerValue("ListImagesResponse.Images["+ i +"].Tags["+ j +"].TagLevel"));
				tagsItem.setTagName(context.stringValue("ListImagesResponse.Images["+ i +"].Tags["+ j +"].TagName"));
				tagsItem.setParentTagName(context.stringValue("ListImagesResponse.Images["+ i +"].Tags["+ j +"].ParentTagName"));

				tags.add(tagsItem);
			}
			imagesItem.setTags(tags);

			List<OCRItem> oCR = new ArrayList<OCRItem>();
			for (int j = 0; j < context.lengthValue("ListImagesResponse.Images["+ i +"].OCR.Length"); j++) {
				OCRItem oCRItem = new OCRItem();
				oCRItem.setOCRContents(context.stringValue("ListImagesResponse.Images["+ i +"].OCR["+ j +"].OCRContents"));
				oCRItem.setOCRConfidence(context.floatValue("ListImagesResponse.Images["+ i +"].OCR["+ j +"].OCRConfidence"));

				OCRBoundary oCRBoundary = new OCRBoundary();
				oCRBoundary.setLeft(context.integerValue("ListImagesResponse.Images["+ i +"].OCR["+ j +"].OCRBoundary.Left"));
				oCRBoundary.setLeft1(context.integerValue("ListImagesResponse.Images["+ i +"].OCR["+ j +"].OCRBoundary.Left"));
				oCRBoundary.setWidth(context.integerValue("ListImagesResponse.Images["+ i +"].OCR["+ j +"].OCRBoundary.Width"));
				oCRBoundary.setHeight(context.integerValue("ListImagesResponse.Images["+ i +"].OCR["+ j +"].OCRBoundary.Height"));
				oCRItem.setOCRBoundary(oCRBoundary);

				oCR.add(oCRItem);
			}
			imagesItem.setOCR(oCR);

			List<CelebrityItem> celebrity = new ArrayList<CelebrityItem>();
			for (int j = 0; j < context.lengthValue("ListImagesResponse.Images["+ i +"].Celebrity.Length"); j++) {
				CelebrityItem celebrityItem = new CelebrityItem();
				celebrityItem.setCelebrityName(context.stringValue("ListImagesResponse.Images["+ i +"].Celebrity["+ j +"].CelebrityName"));
				celebrityItem.setCelebrityGender(context.stringValue("ListImagesResponse.Images["+ i +"].Celebrity["+ j +"].CelebrityGender"));
				celebrityItem.setCelebrityConfidence(context.floatValue("ListImagesResponse.Images["+ i +"].Celebrity["+ j +"].CelebrityConfidence"));
				celebrityItem.setCelebrityLibraryName(context.stringValue("ListImagesResponse.Images["+ i +"].Celebrity["+ j +"].CelebrityLibraryName"));

				CelebrityBoundary celebrityBoundary = new CelebrityBoundary();
				celebrityBoundary.setLeft(context.integerValue("ListImagesResponse.Images["+ i +"].Celebrity["+ j +"].CelebrityBoundary.Left"));
				celebrityBoundary.setTop(context.integerValue("ListImagesResponse.Images["+ i +"].Celebrity["+ j +"].CelebrityBoundary.Top"));
				celebrityBoundary.setWidth(context.integerValue("ListImagesResponse.Images["+ i +"].Celebrity["+ j +"].CelebrityBoundary.Width"));
				celebrityBoundary.setHeight(context.integerValue("ListImagesResponse.Images["+ i +"].Celebrity["+ j +"].CelebrityBoundary.Height"));
				celebrityItem.setCelebrityBoundary(celebrityBoundary);

				celebrity.add(celebrityItem);
			}
			imagesItem.setCelebrity(celebrity);

			images.add(imagesItem);
		}
		listImagesResponse.setImages(images);
	 
	 	return listImagesResponse;
	}
}