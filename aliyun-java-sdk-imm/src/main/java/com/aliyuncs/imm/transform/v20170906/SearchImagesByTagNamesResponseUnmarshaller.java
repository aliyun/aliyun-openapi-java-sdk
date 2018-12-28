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

import com.aliyuncs.imm.model.v20170906.SearchImagesByTagNamesResponse;
import com.aliyuncs.imm.model.v20170906.SearchImagesByTagNamesResponse.Frames;
import com.aliyuncs.imm.model.v20170906.SearchImagesByTagNamesResponse.Frames.CelebrityItem;
import com.aliyuncs.imm.model.v20170906.SearchImagesByTagNamesResponse.Frames.CelebrityItem.CelebrityBoundary;
import com.aliyuncs.imm.model.v20170906.SearchImagesByTagNamesResponse.Frames.FacesItem;
import com.aliyuncs.imm.model.v20170906.SearchImagesByTagNamesResponse.Frames.FacesItem.EmotionDetails;
import com.aliyuncs.imm.model.v20170906.SearchImagesByTagNamesResponse.Frames.FacesItem.FaceAttributes;
import com.aliyuncs.imm.model.v20170906.SearchImagesByTagNamesResponse.Frames.FacesItem.FaceAttributes.FaceBoundary;
import com.aliyuncs.imm.model.v20170906.SearchImagesByTagNamesResponse.Frames.OCRItem;
import com.aliyuncs.imm.model.v20170906.SearchImagesByTagNamesResponse.Frames.OCRItem.OCRBoundary;
import com.aliyuncs.imm.model.v20170906.SearchImagesByTagNamesResponse.Frames.TagsItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class SearchImagesByTagNamesResponseUnmarshaller {

	public static SearchImagesByTagNamesResponse unmarshall(SearchImagesByTagNamesResponse searchImagesByTagNamesResponse, UnmarshallerContext context) {
		
		searchImagesByTagNamesResponse.setRequestId(context.stringValue("SearchImagesByTagNamesResponse.RequestId"));
		searchImagesByTagNamesResponse.setSetId(context.stringValue("SearchImagesByTagNamesResponse.SetId"));
		searchImagesByTagNamesResponse.setNextMarker(context.stringValue("SearchImagesByTagNamesResponse.NextMarker"));

		List<Frames> images = new ArrayList<Frames>();
		for (int i = 0; i < context.lengthValue("SearchImagesByTagNamesResponse.Images.Length"); i++) {
			Frames frames = new Frames();
			frames.setFacesModifyTime(context.stringValue("SearchImagesByTagNamesResponse.Images["+ i +"].FacesModifyTime"));
			frames.setOCRModifyTime(context.stringValue("SearchImagesByTagNamesResponse.Images["+ i +"].OCRModifyTime"));
			frames.setOCRStatus(context.stringValue("SearchImagesByTagNamesResponse.Images["+ i +"].OCRStatus"));
			frames.setSourcePosition(context.stringValue("SearchImagesByTagNamesResponse.Images["+ i +"].SourcePosition"));
			frames.setExif(context.stringValue("SearchImagesByTagNamesResponse.Images["+ i +"].Exif"));
			frames.setImageUri(context.stringValue("SearchImagesByTagNamesResponse.Images["+ i +"].ImageUri"));
			frames.setImageWidth(context.integerValue("SearchImagesByTagNamesResponse.Images["+ i +"].ImageWidth"));
			frames.setImageFormat(context.stringValue("SearchImagesByTagNamesResponse.Images["+ i +"].ImageFormat"));
			frames.setSourceType(context.stringValue("SearchImagesByTagNamesResponse.Images["+ i +"].SourceType"));
			frames.setModifyTime(context.stringValue("SearchImagesByTagNamesResponse.Images["+ i +"].ModifyTime"));
			frames.setFileSize(context.integerValue("SearchImagesByTagNamesResponse.Images["+ i +"].FileSize"));
			frames.setSourceUri(context.stringValue("SearchImagesByTagNamesResponse.Images["+ i +"].SourceUri"));
			frames.setCreateTime(context.stringValue("SearchImagesByTagNamesResponse.Images["+ i +"].CreateTime"));
			frames.setFacesStatus(context.stringValue("SearchImagesByTagNamesResponse.Images["+ i +"].FacesStatus"));
			frames.setRemarksA(context.stringValue("SearchImagesByTagNamesResponse.Images["+ i +"].RemarksA"));
			frames.setImageHeight(context.integerValue("SearchImagesByTagNamesResponse.Images["+ i +"].ImageHeight"));
			frames.setRemarksB(context.stringValue("SearchImagesByTagNamesResponse.Images["+ i +"].RemarksB"));
			frames.setImageTime(context.stringValue("SearchImagesByTagNamesResponse.Images["+ i +"].ImageTime"));
			frames.setOrientation(context.stringValue("SearchImagesByTagNamesResponse.Images["+ i +"].Orientation"));
			frames.setLocation(context.stringValue("SearchImagesByTagNamesResponse.Images["+ i +"].Location"));
			frames.setOCRFailReason(context.stringValue("SearchImagesByTagNamesResponse.Images["+ i +"].OCRFailReason"));
			frames.setFacesFailReason(context.stringValue("SearchImagesByTagNamesResponse.Images["+ i +"].FacesFailReason"));
			frames.setTagsFailReason(context.stringValue("SearchImagesByTagNamesResponse.Images["+ i +"].TagsFailReason"));
			frames.setTagsModifyTime(context.stringValue("SearchImagesByTagNamesResponse.Images["+ i +"].TagsModifyTime"));
			frames.setCelebrityStatus(context.stringValue("SearchImagesByTagNamesResponse.Images["+ i +"].CelebrityStatus"));
			frames.setCelebrityModifyTime(context.stringValue("SearchImagesByTagNamesResponse.Images["+ i +"].CelebrityModifyTime"));
			frames.setCelebrityFailReason(context.stringValue("SearchImagesByTagNamesResponse.Images["+ i +"].CelebrityFailReason"));
			frames.setTagsStatus(context.stringValue("SearchImagesByTagNamesResponse.Images["+ i +"].TagsStatus"));

			List<FacesItem> faces = new ArrayList<FacesItem>();
			for (int j = 0; j < context.lengthValue("SearchImagesByTagNamesResponse.Images["+ i +"].Faces.Length"); j++) {
				FacesItem facesItem = new FacesItem();
				facesItem.setAge(context.integerValue("SearchImagesByTagNamesResponse.Images["+ i +"].Faces["+ j +"].Age"));
				facesItem.setGenderConfidence(context.floatValue("SearchImagesByTagNamesResponse.Images["+ i +"].Faces["+ j +"].GenderConfidence"));
				facesItem.setAttractive(context.floatValue("SearchImagesByTagNamesResponse.Images["+ i +"].Faces["+ j +"].Attractive"));
				facesItem.setGender(context.stringValue("SearchImagesByTagNamesResponse.Images["+ i +"].Faces["+ j +"].Gender"));
				facesItem.setFaceConfidence(context.floatValue("SearchImagesByTagNamesResponse.Images["+ i +"].Faces["+ j +"].FaceConfidence"));
				facesItem.setEmotion(context.stringValue("SearchImagesByTagNamesResponse.Images["+ i +"].Faces["+ j +"].Emotion"));
				facesItem.setFaceId(context.stringValue("SearchImagesByTagNamesResponse.Images["+ i +"].Faces["+ j +"].FaceId"));
				facesItem.setEmotionConfidence(context.floatValue("SearchImagesByTagNamesResponse.Images["+ i +"].Faces["+ j +"].EmotionConfidence"));

				EmotionDetails emotionDetails = new EmotionDetails();
				emotionDetails.setSAD(context.floatValue("SearchImagesByTagNamesResponse.Images["+ i +"].Faces["+ j +"].EmotionDetails.SAD"));
				emotionDetails.setCALM(context.floatValue("SearchImagesByTagNamesResponse.Images["+ i +"].Faces["+ j +"].EmotionDetails.CALM"));
				emotionDetails.setANGRY(context.floatValue("SearchImagesByTagNamesResponse.Images["+ i +"].Faces["+ j +"].EmotionDetails.ANGRY"));
				emotionDetails.setHAPPY(context.floatValue("SearchImagesByTagNamesResponse.Images["+ i +"].Faces["+ j +"].EmotionDetails.HAPPY"));
				emotionDetails.setSCARED(context.floatValue("SearchImagesByTagNamesResponse.Images["+ i +"].Faces["+ j +"].EmotionDetails.SCARED"));
				emotionDetails.setDISGUSTED(context.floatValue("SearchImagesByTagNamesResponse.Images["+ i +"].Faces["+ j +"].EmotionDetails.DISGUSTED"));
				emotionDetails.setSURPRISED(context.floatValue("SearchImagesByTagNamesResponse.Images["+ i +"].Faces["+ j +"].EmotionDetails.SURPRISED"));
				facesItem.setEmotionDetails(emotionDetails);

				FaceAttributes faceAttributes = new FaceAttributes();
				faceAttributes.setGlassesConfidence(context.floatValue("SearchImagesByTagNamesResponse.Images["+ i +"].Faces["+ j +"].FaceAttributes.GlassesConfidence"));
				faceAttributes.setGlasses(context.stringValue("SearchImagesByTagNamesResponse.Images["+ i +"].Faces["+ j +"].FaceAttributes.Glasses"));
				faceAttributes.setRaceConfidence(context.floatValue("SearchImagesByTagNamesResponse.Images["+ i +"].Faces["+ j +"].FaceAttributes.RaceConfidence"));
				faceAttributes.setBeard(context.stringValue("SearchImagesByTagNamesResponse.Images["+ i +"].Faces["+ j +"].FaceAttributes.Beard"));
				faceAttributes.setMaskConfidence(context.floatValue("SearchImagesByTagNamesResponse.Images["+ i +"].Faces["+ j +"].FaceAttributes.MaskConfidence"));
				faceAttributes.setRace(context.stringValue("SearchImagesByTagNamesResponse.Images["+ i +"].Faces["+ j +"].FaceAttributes.Race"));
				faceAttributes.setBeardConfidence(context.floatValue("SearchImagesByTagNamesResponse.Images["+ i +"].Faces["+ j +"].FaceAttributes.BeardConfidence"));
				faceAttributes.setMask(context.stringValue("SearchImagesByTagNamesResponse.Images["+ i +"].Faces["+ j +"].FaceAttributes.Mask"));

				FaceBoundary faceBoundary = new FaceBoundary();
				faceBoundary.setTop(context.integerValue("SearchImagesByTagNamesResponse.Images["+ i +"].Faces["+ j +"].FaceAttributes.FaceBoundary.Top"));
				faceBoundary.setHeight(context.integerValue("SearchImagesByTagNamesResponse.Images["+ i +"].Faces["+ j +"].FaceAttributes.FaceBoundary.Height"));
				faceBoundary.setWidth(context.integerValue("SearchImagesByTagNamesResponse.Images["+ i +"].Faces["+ j +"].FaceAttributes.FaceBoundary.Width"));
				faceBoundary.setLeft(context.integerValue("SearchImagesByTagNamesResponse.Images["+ i +"].Faces["+ j +"].FaceAttributes.FaceBoundary.Left"));
				faceAttributes.setFaceBoundary(faceBoundary);
				facesItem.setFaceAttributes(faceAttributes);

				faces.add(facesItem);
			}
			frames.setFaces(faces);

			List<TagsItem> tags = new ArrayList<TagsItem>();
			for (int j = 0; j < context.lengthValue("SearchImagesByTagNamesResponse.Images["+ i +"].Tags.Length"); j++) {
				TagsItem tagsItem = new TagsItem();
				tagsItem.setTagConfidence(context.floatValue("SearchImagesByTagNamesResponse.Images["+ i +"].Tags["+ j +"].TagConfidence"));
				tagsItem.setTagLevel(context.integerValue("SearchImagesByTagNamesResponse.Images["+ i +"].Tags["+ j +"].TagLevel"));
				tagsItem.setTagName(context.stringValue("SearchImagesByTagNamesResponse.Images["+ i +"].Tags["+ j +"].TagName"));
				tagsItem.setParentTagName(context.stringValue("SearchImagesByTagNamesResponse.Images["+ i +"].Tags["+ j +"].ParentTagName"));

				tags.add(tagsItem);
			}
			frames.setTags(tags);

			List<OCRItem> oCR = new ArrayList<OCRItem>();
			for (int j = 0; j < context.lengthValue("SearchImagesByTagNamesResponse.Images["+ i +"].OCR.Length"); j++) {
				OCRItem oCRItem = new OCRItem();
				oCRItem.setOCRContents(context.stringValue("SearchImagesByTagNamesResponse.Images["+ i +"].OCR["+ j +"].OCRContents"));
				oCRItem.setOCRConfidence(context.floatValue("SearchImagesByTagNamesResponse.Images["+ i +"].OCR["+ j +"].OCRConfidence"));

				OCRBoundary oCRBoundary = new OCRBoundary();
				oCRBoundary.setLeft(context.integerValue("SearchImagesByTagNamesResponse.Images["+ i +"].OCR["+ j +"].OCRBoundary.Left"));
				oCRBoundary.setLeft1(context.integerValue("SearchImagesByTagNamesResponse.Images["+ i +"].OCR["+ j +"].OCRBoundary.Left"));
				oCRBoundary.setWidth(context.integerValue("SearchImagesByTagNamesResponse.Images["+ i +"].OCR["+ j +"].OCRBoundary.Width"));
				oCRBoundary.setHeight(context.integerValue("SearchImagesByTagNamesResponse.Images["+ i +"].OCR["+ j +"].OCRBoundary.Height"));
				oCRItem.setOCRBoundary(oCRBoundary);

				oCR.add(oCRItem);
			}
			frames.setOCR(oCR);

			List<CelebrityItem> celebrity = new ArrayList<CelebrityItem>();
			for (int j = 0; j < context.lengthValue("SearchImagesByTagNamesResponse.Images["+ i +"].Celebrity.Length"); j++) {
				CelebrityItem celebrityItem = new CelebrityItem();
				celebrityItem.setCelebrityName(context.stringValue("SearchImagesByTagNamesResponse.Images["+ i +"].Celebrity["+ j +"].CelebrityName"));
				celebrityItem.setCelebrityGender(context.stringValue("SearchImagesByTagNamesResponse.Images["+ i +"].Celebrity["+ j +"].CelebrityGender"));
				celebrityItem.setCelebrityConfidence(context.floatValue("SearchImagesByTagNamesResponse.Images["+ i +"].Celebrity["+ j +"].CelebrityConfidence"));
				celebrityItem.setCelebrityLibraryName(context.stringValue("SearchImagesByTagNamesResponse.Images["+ i +"].Celebrity["+ j +"].CelebrityLibraryName"));

				CelebrityBoundary celebrityBoundary = new CelebrityBoundary();
				celebrityBoundary.setLeft(context.integerValue("SearchImagesByTagNamesResponse.Images["+ i +"].Celebrity["+ j +"].CelebrityBoundary.Left"));
				celebrityBoundary.setTop(context.integerValue("SearchImagesByTagNamesResponse.Images["+ i +"].Celebrity["+ j +"].CelebrityBoundary.Top"));
				celebrityBoundary.setWidth(context.integerValue("SearchImagesByTagNamesResponse.Images["+ i +"].Celebrity["+ j +"].CelebrityBoundary.Width"));
				celebrityBoundary.setHeight(context.integerValue("SearchImagesByTagNamesResponse.Images["+ i +"].Celebrity["+ j +"].CelebrityBoundary.Height"));
				celebrityItem.setCelebrityBoundary(celebrityBoundary);

				celebrity.add(celebrityItem);
			}
			frames.setCelebrity(celebrity);

			images.add(frames);
		}
		searchImagesByTagNamesResponse.setImages(images);
	 
	 	return searchImagesByTagNamesResponse;
	}
}