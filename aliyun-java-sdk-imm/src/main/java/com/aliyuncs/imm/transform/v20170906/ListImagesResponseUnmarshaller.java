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
import com.aliyuncs.imm.model.v20170906.ListImagesResponse.ImagesItem.Address;
import com.aliyuncs.imm.model.v20170906.ListImagesResponse.ImagesItem.CelebrityItem;
import com.aliyuncs.imm.model.v20170906.ListImagesResponse.ImagesItem.CelebrityItem.CelebrityBoundary;
import com.aliyuncs.imm.model.v20170906.ListImagesResponse.ImagesItem.CroppingSuggestionItem;
import com.aliyuncs.imm.model.v20170906.ListImagesResponse.ImagesItem.CroppingSuggestionItem.CroppingBoundary;
import com.aliyuncs.imm.model.v20170906.ListImagesResponse.ImagesItem.FacesItem;
import com.aliyuncs.imm.model.v20170906.ListImagesResponse.ImagesItem.FacesItem.EmotionDetails;
import com.aliyuncs.imm.model.v20170906.ListImagesResponse.ImagesItem.FacesItem.FaceAttributes;
import com.aliyuncs.imm.model.v20170906.ListImagesResponse.ImagesItem.FacesItem.FaceAttributes.FaceBoundary;
import com.aliyuncs.imm.model.v20170906.ListImagesResponse.ImagesItem.FacesItem.FaceAttributes.HeadPose;
import com.aliyuncs.imm.model.v20170906.ListImagesResponse.ImagesItem.ImageQuality;
import com.aliyuncs.imm.model.v20170906.ListImagesResponse.ImagesItem.OCRItem;
import com.aliyuncs.imm.model.v20170906.ListImagesResponse.ImagesItem.OCRItem.OCRBoundary;
import com.aliyuncs.imm.model.v20170906.ListImagesResponse.ImagesItem.TagsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListImagesResponseUnmarshaller {

	public static ListImagesResponse unmarshall(ListImagesResponse listImagesResponse, UnmarshallerContext _ctx) {
		
		listImagesResponse.setRequestId(_ctx.stringValue("ListImagesResponse.RequestId"));
		listImagesResponse.setSetId(_ctx.stringValue("ListImagesResponse.SetId"));
		listImagesResponse.setNextMarker(_ctx.stringValue("ListImagesResponse.NextMarker"));

		List<ImagesItem> images = new ArrayList<ImagesItem>();
		for (int i = 0; i < _ctx.lengthValue("ListImagesResponse.Images.Length"); i++) {
			ImagesItem imagesItem = new ImagesItem();
			imagesItem.setFacesModifyTime(_ctx.stringValue("ListImagesResponse.Images["+ i +"].FacesModifyTime"));
			imagesItem.setOCRModifyTime(_ctx.stringValue("ListImagesResponse.Images["+ i +"].OCRModifyTime"));
			imagesItem.setOCRStatus(_ctx.stringValue("ListImagesResponse.Images["+ i +"].OCRStatus"));
			imagesItem.setSourcePosition(_ctx.stringValue("ListImagesResponse.Images["+ i +"].SourcePosition"));
			imagesItem.setExif(_ctx.stringValue("ListImagesResponse.Images["+ i +"].Exif"));
			imagesItem.setImageUri(_ctx.stringValue("ListImagesResponse.Images["+ i +"].ImageUri"));
			imagesItem.setImageWidth(_ctx.integerValue("ListImagesResponse.Images["+ i +"].ImageWidth"));
			imagesItem.setImageFormat(_ctx.stringValue("ListImagesResponse.Images["+ i +"].ImageFormat"));
			imagesItem.setSourceType(_ctx.stringValue("ListImagesResponse.Images["+ i +"].SourceType"));
			imagesItem.setModifyTime(_ctx.stringValue("ListImagesResponse.Images["+ i +"].ModifyTime"));
			imagesItem.setFileSize(_ctx.integerValue("ListImagesResponse.Images["+ i +"].FileSize"));
			imagesItem.setSourceUri(_ctx.stringValue("ListImagesResponse.Images["+ i +"].SourceUri"));
			imagesItem.setCreateTime(_ctx.stringValue("ListImagesResponse.Images["+ i +"].CreateTime"));
			imagesItem.setFacesStatus(_ctx.stringValue("ListImagesResponse.Images["+ i +"].FacesStatus"));
			imagesItem.setRemarksA(_ctx.stringValue("ListImagesResponse.Images["+ i +"].RemarksA"));
			imagesItem.setImageHeight(_ctx.integerValue("ListImagesResponse.Images["+ i +"].ImageHeight"));
			imagesItem.setRemarksB(_ctx.stringValue("ListImagesResponse.Images["+ i +"].RemarksB"));
			imagesItem.setImageTime(_ctx.stringValue("ListImagesResponse.Images["+ i +"].ImageTime"));
			imagesItem.setOrientation(_ctx.stringValue("ListImagesResponse.Images["+ i +"].Orientation"));
			imagesItem.setLocation(_ctx.stringValue("ListImagesResponse.Images["+ i +"].Location"));
			imagesItem.setOCRFailReason(_ctx.stringValue("ListImagesResponse.Images["+ i +"].OCRFailReason"));
			imagesItem.setFacesFailReason(_ctx.stringValue("ListImagesResponse.Images["+ i +"].FacesFailReason"));
			imagesItem.setTagsFailReason(_ctx.stringValue("ListImagesResponse.Images["+ i +"].TagsFailReason"));
			imagesItem.setTagsModifyTime(_ctx.stringValue("ListImagesResponse.Images["+ i +"].TagsModifyTime"));
			imagesItem.setCelebrityStatus(_ctx.stringValue("ListImagesResponse.Images["+ i +"].CelebrityStatus"));
			imagesItem.setCelebrityModifyTime(_ctx.stringValue("ListImagesResponse.Images["+ i +"].CelebrityModifyTime"));
			imagesItem.setCelebrityFailReason(_ctx.stringValue("ListImagesResponse.Images["+ i +"].CelebrityFailReason"));
			imagesItem.setTagsStatus(_ctx.stringValue("ListImagesResponse.Images["+ i +"].TagsStatus"));
			imagesItem.setRemarksC(_ctx.stringValue("ListImagesResponse.Images["+ i +"].RemarksC"));
			imagesItem.setRemarksD(_ctx.stringValue("ListImagesResponse.Images["+ i +"].RemarksD"));
			imagesItem.setExternalId(_ctx.stringValue("ListImagesResponse.Images["+ i +"].ExternalId"));
			imagesItem.setAddressModifyTime(_ctx.stringValue("ListImagesResponse.Images["+ i +"].AddressModifyTime"));
			imagesItem.setAddressStatus(_ctx.stringValue("ListImagesResponse.Images["+ i +"].AddressStatus"));
			imagesItem.setAddressFailReason(_ctx.stringValue("ListImagesResponse.Images["+ i +"].AddressFailReason"));
			imagesItem.setRemarksArrayA(_ctx.stringValue("ListImagesResponse.Images["+ i +"].RemarksArrayA"));
			imagesItem.setRemarksArrayB(_ctx.stringValue("ListImagesResponse.Images["+ i +"].RemarksArrayB"));
			imagesItem.setImageQualityStatus(_ctx.stringValue("ListImagesResponse.Images["+ i +"].ImageQualityStatus"));
			imagesItem.setImageQualityFailReason(_ctx.stringValue("ListImagesResponse.Images["+ i +"].ImageQualityFailReason"));
			imagesItem.setImageQualityModifyTime(_ctx.stringValue("ListImagesResponse.Images["+ i +"].ImageQualityModifyTime"));
			imagesItem.setCroppingSuggestionStatus(_ctx.stringValue("ListImagesResponse.Images["+ i +"].CroppingSuggestionStatus"));
			imagesItem.setCroppingSuggestionFailReason(_ctx.stringValue("ListImagesResponse.Images["+ i +"].CroppingSuggestionFailReason"));
			imagesItem.setCroppingSuggestionModifyTime(_ctx.stringValue("ListImagesResponse.Images["+ i +"].CroppingSuggestionModifyTime"));

			ImageQuality imageQuality = new ImageQuality();
			imageQuality.setOverallScore(_ctx.floatValue("ListImagesResponse.Images["+ i +"].ImageQuality.OverallScore"));
			imageQuality.setClarityScore(_ctx.floatValue("ListImagesResponse.Images["+ i +"].ImageQuality.ClarityScore"));
			imageQuality.setClarity(_ctx.floatValue("ListImagesResponse.Images["+ i +"].ImageQuality.Clarity"));
			imageQuality.setExposureScore(_ctx.floatValue("ListImagesResponse.Images["+ i +"].ImageQuality.ExposureScore"));
			imageQuality.setExposure(_ctx.floatValue("ListImagesResponse.Images["+ i +"].ImageQuality.Exposure"));
			imageQuality.setContrastScore(_ctx.floatValue("ListImagesResponse.Images["+ i +"].ImageQuality.ContrastScore"));
			imageQuality.setContrast(_ctx.floatValue("ListImagesResponse.Images["+ i +"].ImageQuality.Contrast"));
			imageQuality.setColorScore(_ctx.floatValue("ListImagesResponse.Images["+ i +"].ImageQuality.ColorScore"));
			imageQuality.setColor(_ctx.floatValue("ListImagesResponse.Images["+ i +"].ImageQuality.Color"));
			imageQuality.setCompositionScore(_ctx.floatValue("ListImagesResponse.Images["+ i +"].ImageQuality.CompositionScore"));
			imagesItem.setImageQuality(imageQuality);

			Address address = new Address();
			address.setAddressLine(_ctx.stringValue("ListImagesResponse.Images["+ i +"].Address.AddressLine"));
			address.setCountry(_ctx.stringValue("ListImagesResponse.Images["+ i +"].Address.Country"));
			address.setProvince(_ctx.stringValue("ListImagesResponse.Images["+ i +"].Address.Province"));
			address.setCity(_ctx.stringValue("ListImagesResponse.Images["+ i +"].Address.City"));
			address.setDistrict(_ctx.stringValue("ListImagesResponse.Images["+ i +"].Address.District"));
			address.setTownship(_ctx.stringValue("ListImagesResponse.Images["+ i +"].Address.Township"));
			imagesItem.setAddress(address);

			List<CroppingSuggestionItem> croppingSuggestion = new ArrayList<CroppingSuggestionItem>();
			for (int j = 0; j < _ctx.lengthValue("ListImagesResponse.Images["+ i +"].CroppingSuggestion.Length"); j++) {
				CroppingSuggestionItem croppingSuggestionItem = new CroppingSuggestionItem();
				croppingSuggestionItem.setAspectRatio(_ctx.stringValue("ListImagesResponse.Images["+ i +"].CroppingSuggestion["+ j +"].AspectRatio"));
				croppingSuggestionItem.setScore(_ctx.floatValue("ListImagesResponse.Images["+ i +"].CroppingSuggestion["+ j +"].Score"));

				CroppingBoundary croppingBoundary = new CroppingBoundary();
				croppingBoundary.setWidth(_ctx.integerValue("ListImagesResponse.Images["+ i +"].CroppingSuggestion["+ j +"].CroppingBoundary.Width"));
				croppingBoundary.setHeight(_ctx.integerValue("ListImagesResponse.Images["+ i +"].CroppingSuggestion["+ j +"].CroppingBoundary.Height"));
				croppingBoundary.setLeft(_ctx.integerValue("ListImagesResponse.Images["+ i +"].CroppingSuggestion["+ j +"].CroppingBoundary.Left"));
				croppingBoundary.setTop(_ctx.integerValue("ListImagesResponse.Images["+ i +"].CroppingSuggestion["+ j +"].CroppingBoundary.Top"));
				croppingSuggestionItem.setCroppingBoundary(croppingBoundary);

				croppingSuggestion.add(croppingSuggestionItem);
			}
			imagesItem.setCroppingSuggestion(croppingSuggestion);

			List<FacesItem> faces = new ArrayList<FacesItem>();
			for (int j = 0; j < _ctx.lengthValue("ListImagesResponse.Images["+ i +"].Faces.Length"); j++) {
				FacesItem facesItem = new FacesItem();
				facesItem.setAge(_ctx.integerValue("ListImagesResponse.Images["+ i +"].Faces["+ j +"].Age"));
				facesItem.setGenderConfidence(_ctx.floatValue("ListImagesResponse.Images["+ i +"].Faces["+ j +"].GenderConfidence"));
				facesItem.setAttractive(_ctx.floatValue("ListImagesResponse.Images["+ i +"].Faces["+ j +"].Attractive"));
				facesItem.setGender(_ctx.stringValue("ListImagesResponse.Images["+ i +"].Faces["+ j +"].Gender"));
				facesItem.setFaceConfidence(_ctx.floatValue("ListImagesResponse.Images["+ i +"].Faces["+ j +"].FaceConfidence"));
				facesItem.setEmotion(_ctx.stringValue("ListImagesResponse.Images["+ i +"].Faces["+ j +"].Emotion"));
				facesItem.setFaceId(_ctx.stringValue("ListImagesResponse.Images["+ i +"].Faces["+ j +"].FaceId"));
				facesItem.setEmotionConfidence(_ctx.floatValue("ListImagesResponse.Images["+ i +"].Faces["+ j +"].EmotionConfidence"));
				facesItem.setGroupId(_ctx.stringValue("ListImagesResponse.Images["+ i +"].Faces["+ j +"].GroupId"));
				facesItem.setFaceQuality(_ctx.floatValue("ListImagesResponse.Images["+ i +"].Faces["+ j +"].FaceQuality"));

				EmotionDetails emotionDetails = new EmotionDetails();
				emotionDetails.setSAD(_ctx.floatValue("ListImagesResponse.Images["+ i +"].Faces["+ j +"].EmotionDetails.SAD"));
				emotionDetails.setCALM(_ctx.floatValue("ListImagesResponse.Images["+ i +"].Faces["+ j +"].EmotionDetails.CALM"));
				emotionDetails.setANGRY(_ctx.floatValue("ListImagesResponse.Images["+ i +"].Faces["+ j +"].EmotionDetails.ANGRY"));
				emotionDetails.setHAPPY(_ctx.floatValue("ListImagesResponse.Images["+ i +"].Faces["+ j +"].EmotionDetails.HAPPY"));
				emotionDetails.setSCARED(_ctx.floatValue("ListImagesResponse.Images["+ i +"].Faces["+ j +"].EmotionDetails.SCARED"));
				emotionDetails.setDISGUSTED(_ctx.floatValue("ListImagesResponse.Images["+ i +"].Faces["+ j +"].EmotionDetails.DISGUSTED"));
				emotionDetails.setSURPRISED(_ctx.floatValue("ListImagesResponse.Images["+ i +"].Faces["+ j +"].EmotionDetails.SURPRISED"));
				facesItem.setEmotionDetails(emotionDetails);

				FaceAttributes faceAttributes = new FaceAttributes();
				faceAttributes.setGlassesConfidence(_ctx.floatValue("ListImagesResponse.Images["+ i +"].Faces["+ j +"].FaceAttributes.GlassesConfidence"));
				faceAttributes.setGlasses(_ctx.stringValue("ListImagesResponse.Images["+ i +"].Faces["+ j +"].FaceAttributes.Glasses"));
				faceAttributes.setRaceConfidence(_ctx.floatValue("ListImagesResponse.Images["+ i +"].Faces["+ j +"].FaceAttributes.RaceConfidence"));
				faceAttributes.setBeard(_ctx.stringValue("ListImagesResponse.Images["+ i +"].Faces["+ j +"].FaceAttributes.Beard"));
				faceAttributes.setMaskConfidence(_ctx.floatValue("ListImagesResponse.Images["+ i +"].Faces["+ j +"].FaceAttributes.MaskConfidence"));
				faceAttributes.setRace(_ctx.stringValue("ListImagesResponse.Images["+ i +"].Faces["+ j +"].FaceAttributes.Race"));
				faceAttributes.setBeardConfidence(_ctx.floatValue("ListImagesResponse.Images["+ i +"].Faces["+ j +"].FaceAttributes.BeardConfidence"));
				faceAttributes.setMask(_ctx.stringValue("ListImagesResponse.Images["+ i +"].Faces["+ j +"].FaceAttributes.Mask"));

				FaceBoundary faceBoundary = new FaceBoundary();
				faceBoundary.setTop(_ctx.integerValue("ListImagesResponse.Images["+ i +"].Faces["+ j +"].FaceAttributes.FaceBoundary.Top"));
				faceBoundary.setHeight(_ctx.integerValue("ListImagesResponse.Images["+ i +"].Faces["+ j +"].FaceAttributes.FaceBoundary.Height"));
				faceBoundary.setWidth(_ctx.integerValue("ListImagesResponse.Images["+ i +"].Faces["+ j +"].FaceAttributes.FaceBoundary.Width"));
				faceBoundary.setLeft(_ctx.integerValue("ListImagesResponse.Images["+ i +"].Faces["+ j +"].FaceAttributes.FaceBoundary.Left"));
				faceAttributes.setFaceBoundary(faceBoundary);

				HeadPose headPose = new HeadPose();
				headPose.setPitch(_ctx.floatValue("ListImagesResponse.Images["+ i +"].Faces["+ j +"].FaceAttributes.HeadPose.Pitch"));
				headPose.setRoll(_ctx.floatValue("ListImagesResponse.Images["+ i +"].Faces["+ j +"].FaceAttributes.HeadPose.Roll"));
				headPose.setYaw(_ctx.floatValue("ListImagesResponse.Images["+ i +"].Faces["+ j +"].FaceAttributes.HeadPose.Yaw"));
				faceAttributes.setHeadPose(headPose);
				facesItem.setFaceAttributes(faceAttributes);

				faces.add(facesItem);
			}
			imagesItem.setFaces(faces);

			List<TagsItem> tags = new ArrayList<TagsItem>();
			for (int j = 0; j < _ctx.lengthValue("ListImagesResponse.Images["+ i +"].Tags.Length"); j++) {
				TagsItem tagsItem = new TagsItem();
				tagsItem.setTagConfidence(_ctx.floatValue("ListImagesResponse.Images["+ i +"].Tags["+ j +"].TagConfidence"));
				tagsItem.setTagLevel(_ctx.integerValue("ListImagesResponse.Images["+ i +"].Tags["+ j +"].TagLevel"));
				tagsItem.setTagName(_ctx.stringValue("ListImagesResponse.Images["+ i +"].Tags["+ j +"].TagName"));
				tagsItem.setParentTagName(_ctx.stringValue("ListImagesResponse.Images["+ i +"].Tags["+ j +"].ParentTagName"));

				tags.add(tagsItem);
			}
			imagesItem.setTags(tags);

			List<OCRItem> oCR = new ArrayList<OCRItem>();
			for (int j = 0; j < _ctx.lengthValue("ListImagesResponse.Images["+ i +"].OCR.Length"); j++) {
				OCRItem oCRItem = new OCRItem();
				oCRItem.setOCRContents(_ctx.stringValue("ListImagesResponse.Images["+ i +"].OCR["+ j +"].OCRContents"));
				oCRItem.setOCRConfidence(_ctx.floatValue("ListImagesResponse.Images["+ i +"].OCR["+ j +"].OCRConfidence"));

				OCRBoundary oCRBoundary = new OCRBoundary();
				oCRBoundary.setLeft(_ctx.integerValue("ListImagesResponse.Images["+ i +"].OCR["+ j +"].OCRBoundary.Left"));
				oCRBoundary.setLeft1(_ctx.integerValue("ListImagesResponse.Images["+ i +"].OCR["+ j +"].OCRBoundary.Left"));
				oCRBoundary.setWidth(_ctx.integerValue("ListImagesResponse.Images["+ i +"].OCR["+ j +"].OCRBoundary.Width"));
				oCRBoundary.setHeight(_ctx.integerValue("ListImagesResponse.Images["+ i +"].OCR["+ j +"].OCRBoundary.Height"));
				oCRItem.setOCRBoundary(oCRBoundary);

				oCR.add(oCRItem);
			}
			imagesItem.setOCR(oCR);

			List<CelebrityItem> celebrity = new ArrayList<CelebrityItem>();
			for (int j = 0; j < _ctx.lengthValue("ListImagesResponse.Images["+ i +"].Celebrity.Length"); j++) {
				CelebrityItem celebrityItem = new CelebrityItem();
				celebrityItem.setCelebrityName(_ctx.stringValue("ListImagesResponse.Images["+ i +"].Celebrity["+ j +"].CelebrityName"));
				celebrityItem.setCelebrityGender(_ctx.stringValue("ListImagesResponse.Images["+ i +"].Celebrity["+ j +"].CelebrityGender"));
				celebrityItem.setCelebrityConfidence(_ctx.floatValue("ListImagesResponse.Images["+ i +"].Celebrity["+ j +"].CelebrityConfidence"));
				celebrityItem.setCelebrityLibraryName(_ctx.stringValue("ListImagesResponse.Images["+ i +"].Celebrity["+ j +"].CelebrityLibraryName"));

				CelebrityBoundary celebrityBoundary = new CelebrityBoundary();
				celebrityBoundary.setLeft(_ctx.integerValue("ListImagesResponse.Images["+ i +"].Celebrity["+ j +"].CelebrityBoundary.Left"));
				celebrityBoundary.setTop(_ctx.integerValue("ListImagesResponse.Images["+ i +"].Celebrity["+ j +"].CelebrityBoundary.Top"));
				celebrityBoundary.setWidth(_ctx.integerValue("ListImagesResponse.Images["+ i +"].Celebrity["+ j +"].CelebrityBoundary.Width"));
				celebrityBoundary.setHeight(_ctx.integerValue("ListImagesResponse.Images["+ i +"].Celebrity["+ j +"].CelebrityBoundary.Height"));
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