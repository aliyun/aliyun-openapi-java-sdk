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

import com.aliyuncs.imm.model.v20170906.SearchImagesResponse;
import com.aliyuncs.imm.model.v20170906.SearchImagesResponse.ImagesItem;
import com.aliyuncs.imm.model.v20170906.SearchImagesResponse.ImagesItem.CelebrityItem;
import com.aliyuncs.imm.model.v20170906.SearchImagesResponse.ImagesItem.CelebrityItem.CelebrityBoundary;
import com.aliyuncs.imm.model.v20170906.SearchImagesResponse.ImagesItem.FacesItem;
import com.aliyuncs.imm.model.v20170906.SearchImagesResponse.ImagesItem.FacesItem.EmotionDetails;
import com.aliyuncs.imm.model.v20170906.SearchImagesResponse.ImagesItem.FacesItem.FaceAttributes;
import com.aliyuncs.imm.model.v20170906.SearchImagesResponse.ImagesItem.FacesItem.FaceAttributes.FaceBoundary;
import com.aliyuncs.imm.model.v20170906.SearchImagesResponse.ImagesItem.OCRItem;
import com.aliyuncs.imm.model.v20170906.SearchImagesResponse.ImagesItem.OCRItem.OCRBoundary;
import com.aliyuncs.imm.model.v20170906.SearchImagesResponse.ImagesItem.TagsItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class SearchImagesResponseUnmarshaller {

	public static SearchImagesResponse unmarshall(SearchImagesResponse searchImagesResponse, UnmarshallerContext context) {
		
		searchImagesResponse.setRequestId(context.stringValue("SearchImagesResponse.RequestId"));
		searchImagesResponse.setSetId(context.stringValue("SearchImagesResponse.SetId"));
		searchImagesResponse.setNextMarker(context.stringValue("SearchImagesResponse.NextMarker"));

		List<ImagesItem> images = new ArrayList<ImagesItem>();
		for (int i = 0; i < context.lengthValue("SearchImagesResponse.Images.Length"); i++) {
			ImagesItem imagesItem = new ImagesItem();
			imagesItem.setFacesModifyTime(context.stringValue("SearchImagesResponse.Images["+ i +"].FacesModifyTime"));
			imagesItem.setOCRModifyTime(context.stringValue("SearchImagesResponse.Images["+ i +"].OCRModifyTime"));
			imagesItem.setOCRStatus(context.stringValue("SearchImagesResponse.Images["+ i +"].OCRStatus"));
			imagesItem.setSourcePosition(context.stringValue("SearchImagesResponse.Images["+ i +"].SourcePosition"));
			imagesItem.setExif(context.stringValue("SearchImagesResponse.Images["+ i +"].Exif"));
			imagesItem.setImageUri(context.stringValue("SearchImagesResponse.Images["+ i +"].ImageUri"));
			imagesItem.setImageWidth(context.integerValue("SearchImagesResponse.Images["+ i +"].ImageWidth"));
			imagesItem.setImageFormat(context.stringValue("SearchImagesResponse.Images["+ i +"].ImageFormat"));
			imagesItem.setSourceType(context.stringValue("SearchImagesResponse.Images["+ i +"].SourceType"));
			imagesItem.setModifyTime(context.stringValue("SearchImagesResponse.Images["+ i +"].ModifyTime"));
			imagesItem.setFileSize(context.integerValue("SearchImagesResponse.Images["+ i +"].FileSize"));
			imagesItem.setSourceUri(context.stringValue("SearchImagesResponse.Images["+ i +"].SourceUri"));
			imagesItem.setCreateTime(context.stringValue("SearchImagesResponse.Images["+ i +"].CreateTime"));
			imagesItem.setFacesStatus(context.stringValue("SearchImagesResponse.Images["+ i +"].FacesStatus"));
			imagesItem.setRemarksA(context.stringValue("SearchImagesResponse.Images["+ i +"].RemarksA"));
			imagesItem.setImageHeight(context.integerValue("SearchImagesResponse.Images["+ i +"].ImageHeight"));
			imagesItem.setRemarksB(context.stringValue("SearchImagesResponse.Images["+ i +"].RemarksB"));
			imagesItem.setImageTime(context.stringValue("SearchImagesResponse.Images["+ i +"].ImageTime"));
			imagesItem.setOrientation(context.stringValue("SearchImagesResponse.Images["+ i +"].Orientation"));
			imagesItem.setLocation(context.stringValue("SearchImagesResponse.Images["+ i +"].Location"));
			imagesItem.setOCRFailReason(context.stringValue("SearchImagesResponse.Images["+ i +"].OCRFailReason"));
			imagesItem.setFacesFailReason(context.stringValue("SearchImagesResponse.Images["+ i +"].FacesFailReason"));
			imagesItem.setTagsFailReason(context.stringValue("SearchImagesResponse.Images["+ i +"].TagsFailReason"));
			imagesItem.setTagsModifyTime(context.stringValue("SearchImagesResponse.Images["+ i +"].TagsModifyTime"));
			imagesItem.setCelebrityStatus(context.stringValue("SearchImagesResponse.Images["+ i +"].CelebrityStatus"));
			imagesItem.setCelebrityModifyTime(context.stringValue("SearchImagesResponse.Images["+ i +"].CelebrityModifyTime"));
			imagesItem.setCelebrityFailReason(context.stringValue("SearchImagesResponse.Images["+ i +"].CelebrityFailReason"));
			imagesItem.setTagsStatus(context.stringValue("SearchImagesResponse.Images["+ i +"].TagsStatus"));

			List<FacesItem> faces = new ArrayList<FacesItem>();
			for (int j = 0; j < context.lengthValue("SearchImagesResponse.Images["+ i +"].Faces.Length"); j++) {
				FacesItem facesItem = new FacesItem();
				facesItem.setAge(context.integerValue("SearchImagesResponse.Images["+ i +"].Faces["+ j +"].Age"));
				facesItem.setGenderConfidence(context.floatValue("SearchImagesResponse.Images["+ i +"].Faces["+ j +"].GenderConfidence"));
				facesItem.setAttractive(context.floatValue("SearchImagesResponse.Images["+ i +"].Faces["+ j +"].Attractive"));
				facesItem.setGender(context.stringValue("SearchImagesResponse.Images["+ i +"].Faces["+ j +"].Gender"));
				facesItem.setFaceConfidence(context.floatValue("SearchImagesResponse.Images["+ i +"].Faces["+ j +"].FaceConfidence"));
				facesItem.setEmotion(context.stringValue("SearchImagesResponse.Images["+ i +"].Faces["+ j +"].Emotion"));
				facesItem.setFaceId(context.stringValue("SearchImagesResponse.Images["+ i +"].Faces["+ j +"].FaceId"));
				facesItem.setEmotionConfidence(context.floatValue("SearchImagesResponse.Images["+ i +"].Faces["+ j +"].EmotionConfidence"));

				EmotionDetails emotionDetails = new EmotionDetails();
				emotionDetails.setSAD(context.floatValue("SearchImagesResponse.Images["+ i +"].Faces["+ j +"].EmotionDetails.SAD"));
				emotionDetails.setCALM(context.floatValue("SearchImagesResponse.Images["+ i +"].Faces["+ j +"].EmotionDetails.CALM"));
				emotionDetails.setANGRY(context.floatValue("SearchImagesResponse.Images["+ i +"].Faces["+ j +"].EmotionDetails.ANGRY"));
				emotionDetails.setHAPPY(context.floatValue("SearchImagesResponse.Images["+ i +"].Faces["+ j +"].EmotionDetails.HAPPY"));
				emotionDetails.setSCARED(context.floatValue("SearchImagesResponse.Images["+ i +"].Faces["+ j +"].EmotionDetails.SCARED"));
				emotionDetails.setDISGUSTED(context.floatValue("SearchImagesResponse.Images["+ i +"].Faces["+ j +"].EmotionDetails.DISGUSTED"));
				emotionDetails.setSURPRISED(context.floatValue("SearchImagesResponse.Images["+ i +"].Faces["+ j +"].EmotionDetails.SURPRISED"));
				facesItem.setEmotionDetails(emotionDetails);

				FaceAttributes faceAttributes = new FaceAttributes();
				faceAttributes.setGlassesConfidence(context.floatValue("SearchImagesResponse.Images["+ i +"].Faces["+ j +"].FaceAttributes.GlassesConfidence"));
				faceAttributes.setGlasses(context.stringValue("SearchImagesResponse.Images["+ i +"].Faces["+ j +"].FaceAttributes.Glasses"));
				faceAttributes.setRaceConfidence(context.floatValue("SearchImagesResponse.Images["+ i +"].Faces["+ j +"].FaceAttributes.RaceConfidence"));
				faceAttributes.setBeard(context.stringValue("SearchImagesResponse.Images["+ i +"].Faces["+ j +"].FaceAttributes.Beard"));
				faceAttributes.setMaskConfidence(context.floatValue("SearchImagesResponse.Images["+ i +"].Faces["+ j +"].FaceAttributes.MaskConfidence"));
				faceAttributes.setRace(context.stringValue("SearchImagesResponse.Images["+ i +"].Faces["+ j +"].FaceAttributes.Race"));
				faceAttributes.setBeardConfidence(context.floatValue("SearchImagesResponse.Images["+ i +"].Faces["+ j +"].FaceAttributes.BeardConfidence"));
				faceAttributes.setMask(context.stringValue("SearchImagesResponse.Images["+ i +"].Faces["+ j +"].FaceAttributes.Mask"));

				FaceBoundary faceBoundary = new FaceBoundary();
				faceBoundary.setTop(context.integerValue("SearchImagesResponse.Images["+ i +"].Faces["+ j +"].FaceAttributes.FaceBoundary.Top"));
				faceBoundary.setHeight(context.integerValue("SearchImagesResponse.Images["+ i +"].Faces["+ j +"].FaceAttributes.FaceBoundary.Height"));
				faceBoundary.setWidth(context.integerValue("SearchImagesResponse.Images["+ i +"].Faces["+ j +"].FaceAttributes.FaceBoundary.Width"));
				faceBoundary.setLeft(context.integerValue("SearchImagesResponse.Images["+ i +"].Faces["+ j +"].FaceAttributes.FaceBoundary.Left"));
				faceAttributes.setFaceBoundary(faceBoundary);
				facesItem.setFaceAttributes(faceAttributes);

				faces.add(facesItem);
			}
			imagesItem.setFaces(faces);

			List<TagsItem> tags = new ArrayList<TagsItem>();
			for (int j = 0; j < context.lengthValue("SearchImagesResponse.Images["+ i +"].Tags.Length"); j++) {
				TagsItem tagsItem = new TagsItem();
				tagsItem.setTagConfidence(context.floatValue("SearchImagesResponse.Images["+ i +"].Tags["+ j +"].TagConfidence"));
				tagsItem.setTagLevel(context.integerValue("SearchImagesResponse.Images["+ i +"].Tags["+ j +"].TagLevel"));
				tagsItem.setTagName(context.stringValue("SearchImagesResponse.Images["+ i +"].Tags["+ j +"].TagName"));
				tagsItem.setParentTagName(context.stringValue("SearchImagesResponse.Images["+ i +"].Tags["+ j +"].ParentTagName"));

				tags.add(tagsItem);
			}
			imagesItem.setTags(tags);

			List<OCRItem> oCR = new ArrayList<OCRItem>();
			for (int j = 0; j < context.lengthValue("SearchImagesResponse.Images["+ i +"].OCR.Length"); j++) {
				OCRItem oCRItem = new OCRItem();
				oCRItem.setOCRContents(context.stringValue("SearchImagesResponse.Images["+ i +"].OCR["+ j +"].OCRContents"));
				oCRItem.setOCRConfidence(context.floatValue("SearchImagesResponse.Images["+ i +"].OCR["+ j +"].OCRConfidence"));

				OCRBoundary oCRBoundary = new OCRBoundary();
				oCRBoundary.setLeft(context.integerValue("SearchImagesResponse.Images["+ i +"].OCR["+ j +"].OCRBoundary.Left"));
				oCRBoundary.setLeft1(context.integerValue("SearchImagesResponse.Images["+ i +"].OCR["+ j +"].OCRBoundary.Left"));
				oCRBoundary.setWidth(context.integerValue("SearchImagesResponse.Images["+ i +"].OCR["+ j +"].OCRBoundary.Width"));
				oCRBoundary.setHeight(context.integerValue("SearchImagesResponse.Images["+ i +"].OCR["+ j +"].OCRBoundary.Height"));
				oCRItem.setOCRBoundary(oCRBoundary);

				oCR.add(oCRItem);
			}
			imagesItem.setOCR(oCR);

			List<CelebrityItem> celebrity = new ArrayList<CelebrityItem>();
			for (int j = 0; j < context.lengthValue("SearchImagesResponse.Images["+ i +"].Celebrity.Length"); j++) {
				CelebrityItem celebrityItem = new CelebrityItem();
				celebrityItem.setCelebrityName(context.stringValue("SearchImagesResponse.Images["+ i +"].Celebrity["+ j +"].CelebrityName"));
				celebrityItem.setCelebrityGender(context.stringValue("SearchImagesResponse.Images["+ i +"].Celebrity["+ j +"].CelebrityGender"));
				celebrityItem.setCelebrityConfidence(context.floatValue("SearchImagesResponse.Images["+ i +"].Celebrity["+ j +"].CelebrityConfidence"));
				celebrityItem.setCelebrityLibraryName(context.stringValue("SearchImagesResponse.Images["+ i +"].Celebrity["+ j +"].CelebrityLibraryName"));

				CelebrityBoundary celebrityBoundary = new CelebrityBoundary();
				celebrityBoundary.setLeft(context.integerValue("SearchImagesResponse.Images["+ i +"].Celebrity["+ j +"].CelebrityBoundary.Left"));
				celebrityBoundary.setTop(context.integerValue("SearchImagesResponse.Images["+ i +"].Celebrity["+ j +"].CelebrityBoundary.Top"));
				celebrityBoundary.setWidth(context.integerValue("SearchImagesResponse.Images["+ i +"].Celebrity["+ j +"].CelebrityBoundary.Width"));
				celebrityBoundary.setHeight(context.integerValue("SearchImagesResponse.Images["+ i +"].Celebrity["+ j +"].CelebrityBoundary.Height"));
				celebrityItem.setCelebrityBoundary(celebrityBoundary);

				celebrity.add(celebrityItem);
			}
			imagesItem.setCelebrity(celebrity);

			images.add(imagesItem);
		}
		searchImagesResponse.setImages(images);
	 
	 	return searchImagesResponse;
	}
}