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
import com.aliyuncs.imm.model.v20170906.FindImagesResponse.ImagesItem.Address;
import com.aliyuncs.imm.model.v20170906.FindImagesResponse.ImagesItem.CelebrityItem;
import com.aliyuncs.imm.model.v20170906.FindImagesResponse.ImagesItem.CelebrityItem.CelebrityBoundary;
import com.aliyuncs.imm.model.v20170906.FindImagesResponse.ImagesItem.CroppingSuggestionItem;
import com.aliyuncs.imm.model.v20170906.FindImagesResponse.ImagesItem.CroppingSuggestionItem.CroppingBoundary;
import com.aliyuncs.imm.model.v20170906.FindImagesResponse.ImagesItem.FacesItem;
import com.aliyuncs.imm.model.v20170906.FindImagesResponse.ImagesItem.FacesItem.EmotionDetails;
import com.aliyuncs.imm.model.v20170906.FindImagesResponse.ImagesItem.FacesItem.FaceAttributes;
import com.aliyuncs.imm.model.v20170906.FindImagesResponse.ImagesItem.FacesItem.FaceAttributes.FaceBoundary;
import com.aliyuncs.imm.model.v20170906.FindImagesResponse.ImagesItem.FacesItem.FaceAttributes.HeadPose;
import com.aliyuncs.imm.model.v20170906.FindImagesResponse.ImagesItem.ImageQuality;
import com.aliyuncs.imm.model.v20170906.FindImagesResponse.ImagesItem.OCRItem;
import com.aliyuncs.imm.model.v20170906.FindImagesResponse.ImagesItem.OCRItem.OCRBoundary;
import com.aliyuncs.imm.model.v20170906.FindImagesResponse.ImagesItem.TagsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class FindImagesResponseUnmarshaller {

	public static FindImagesResponse unmarshall(FindImagesResponse findImagesResponse, UnmarshallerContext _ctx) {
		
		findImagesResponse.setRequestId(_ctx.stringValue("FindImagesResponse.RequestId"));
		findImagesResponse.setSetId(_ctx.stringValue("FindImagesResponse.SetId"));
		findImagesResponse.setNextMarker(_ctx.stringValue("FindImagesResponse.NextMarker"));

		List<ImagesItem> images = new ArrayList<ImagesItem>();
		for (int i = 0; i < _ctx.lengthValue("FindImagesResponse.Images.Length"); i++) {
			ImagesItem imagesItem = new ImagesItem();
			imagesItem.setFacesModifyTime(_ctx.stringValue("FindImagesResponse.Images["+ i +"].FacesModifyTime"));
			imagesItem.setOCRModifyTime(_ctx.stringValue("FindImagesResponse.Images["+ i +"].OCRModifyTime"));
			imagesItem.setOCRStatus(_ctx.stringValue("FindImagesResponse.Images["+ i +"].OCRStatus"));
			imagesItem.setSourcePosition(_ctx.stringValue("FindImagesResponse.Images["+ i +"].SourcePosition"));
			imagesItem.setExif(_ctx.stringValue("FindImagesResponse.Images["+ i +"].Exif"));
			imagesItem.setImageUri(_ctx.stringValue("FindImagesResponse.Images["+ i +"].ImageUri"));
			imagesItem.setImageWidth(_ctx.integerValue("FindImagesResponse.Images["+ i +"].ImageWidth"));
			imagesItem.setImageFormat(_ctx.stringValue("FindImagesResponse.Images["+ i +"].ImageFormat"));
			imagesItem.setSourceType(_ctx.stringValue("FindImagesResponse.Images["+ i +"].SourceType"));
			imagesItem.setModifyTime(_ctx.stringValue("FindImagesResponse.Images["+ i +"].ModifyTime"));
			imagesItem.setFileSize(_ctx.integerValue("FindImagesResponse.Images["+ i +"].FileSize"));
			imagesItem.setSourceUri(_ctx.stringValue("FindImagesResponse.Images["+ i +"].SourceUri"));
			imagesItem.setCreateTime(_ctx.stringValue("FindImagesResponse.Images["+ i +"].CreateTime"));
			imagesItem.setFacesStatus(_ctx.stringValue("FindImagesResponse.Images["+ i +"].FacesStatus"));
			imagesItem.setRemarksA(_ctx.stringValue("FindImagesResponse.Images["+ i +"].RemarksA"));
			imagesItem.setImageHeight(_ctx.integerValue("FindImagesResponse.Images["+ i +"].ImageHeight"));
			imagesItem.setRemarksB(_ctx.stringValue("FindImagesResponse.Images["+ i +"].RemarksB"));
			imagesItem.setImageTime(_ctx.stringValue("FindImagesResponse.Images["+ i +"].ImageTime"));
			imagesItem.setOrientation(_ctx.stringValue("FindImagesResponse.Images["+ i +"].Orientation"));
			imagesItem.setLocation(_ctx.stringValue("FindImagesResponse.Images["+ i +"].Location"));
			imagesItem.setOCRFailReason(_ctx.stringValue("FindImagesResponse.Images["+ i +"].OCRFailReason"));
			imagesItem.setFacesFailReason(_ctx.stringValue("FindImagesResponse.Images["+ i +"].FacesFailReason"));
			imagesItem.setTagsFailReason(_ctx.stringValue("FindImagesResponse.Images["+ i +"].TagsFailReason"));
			imagesItem.setTagsModifyTime(_ctx.stringValue("FindImagesResponse.Images["+ i +"].TagsModifyTime"));
			imagesItem.setCelebrityStatus(_ctx.stringValue("FindImagesResponse.Images["+ i +"].CelebrityStatus"));
			imagesItem.setCelebrityModifyTime(_ctx.stringValue("FindImagesResponse.Images["+ i +"].CelebrityModifyTime"));
			imagesItem.setCelebrityFailReason(_ctx.stringValue("FindImagesResponse.Images["+ i +"].CelebrityFailReason"));
			imagesItem.setTagsStatus(_ctx.stringValue("FindImagesResponse.Images["+ i +"].TagsStatus"));
			imagesItem.setRemarksC(_ctx.stringValue("FindImagesResponse.Images["+ i +"].RemarksC"));
			imagesItem.setRemarksD(_ctx.stringValue("FindImagesResponse.Images["+ i +"].RemarksD"));
			imagesItem.setExternalId(_ctx.stringValue("FindImagesResponse.Images["+ i +"].ExternalId"));
			imagesItem.setAddressModifyTime(_ctx.stringValue("FindImagesResponse.Images["+ i +"].AddressModifyTime"));
			imagesItem.setAddressStatus(_ctx.stringValue("FindImagesResponse.Images["+ i +"].AddressStatus"));
			imagesItem.setAddressFailReason(_ctx.stringValue("FindImagesResponse.Images["+ i +"].AddressFailReason"));
			imagesItem.setRemarksArrayB(_ctx.stringValue("FindImagesResponse.Images["+ i +"].RemarksArrayB"));
			imagesItem.setRemarksArrayA(_ctx.stringValue("FindImagesResponse.Images["+ i +"].RemarksArrayA"));
			imagesItem.setImageQualityStatus(_ctx.stringValue("FindImagesResponse.Images["+ i +"].ImageQualityStatus"));
			imagesItem.setImageQualityFailReason(_ctx.stringValue("FindImagesResponse.Images["+ i +"].ImageQualityFailReason"));
			imagesItem.setImageQualityModifyTime(_ctx.stringValue("FindImagesResponse.Images["+ i +"].ImageQualityModifyTime"));
			imagesItem.setCroppingSuggestionStatus(_ctx.stringValue("FindImagesResponse.Images["+ i +"].CroppingSuggestionStatus"));
			imagesItem.setCroppingSuggestionFailReason(_ctx.stringValue("FindImagesResponse.Images["+ i +"].CroppingSuggestionFailReason"));
			imagesItem.setCroppingSuggestionModifyTime(_ctx.stringValue("FindImagesResponse.Images["+ i +"].CroppingSuggestionModifyTime"));

			ImageQuality imageQuality = new ImageQuality();
			imageQuality.setOverallScore(_ctx.floatValue("FindImagesResponse.Images["+ i +"].ImageQuality.OverallScore"));
			imageQuality.setClarityScore(_ctx.floatValue("FindImagesResponse.Images["+ i +"].ImageQuality.ClarityScore"));
			imageQuality.setClarity(_ctx.floatValue("FindImagesResponse.Images["+ i +"].ImageQuality.Clarity"));
			imageQuality.setExposureScore(_ctx.floatValue("FindImagesResponse.Images["+ i +"].ImageQuality.ExposureScore"));
			imageQuality.setExposure(_ctx.floatValue("FindImagesResponse.Images["+ i +"].ImageQuality.Exposure"));
			imageQuality.setContrastScore(_ctx.floatValue("FindImagesResponse.Images["+ i +"].ImageQuality.ContrastScore"));
			imageQuality.setContrast(_ctx.floatValue("FindImagesResponse.Images["+ i +"].ImageQuality.Contrast"));
			imageQuality.setColorScore(_ctx.floatValue("FindImagesResponse.Images["+ i +"].ImageQuality.ColorScore"));
			imageQuality.setColor(_ctx.floatValue("FindImagesResponse.Images["+ i +"].ImageQuality.Color"));
			imageQuality.setCompositionScore(_ctx.floatValue("FindImagesResponse.Images["+ i +"].ImageQuality.CompositionScore"));
			imagesItem.setImageQuality(imageQuality);

			Address address = new Address();
			address.setAddressLine(_ctx.stringValue("FindImagesResponse.Images["+ i +"].Address.AddressLine"));
			address.setCountry(_ctx.stringValue("FindImagesResponse.Images["+ i +"].Address.Country"));
			address.setProvince(_ctx.stringValue("FindImagesResponse.Images["+ i +"].Address.Province"));
			address.setCity(_ctx.stringValue("FindImagesResponse.Images["+ i +"].Address.City"));
			address.setDistrict(_ctx.stringValue("FindImagesResponse.Images["+ i +"].Address.District"));
			address.setTownship(_ctx.stringValue("FindImagesResponse.Images["+ i +"].Address.Township"));
			imagesItem.setAddress(address);

			List<CroppingSuggestionItem> croppingSuggestion = new ArrayList<CroppingSuggestionItem>();
			for (int j = 0; j < _ctx.lengthValue("FindImagesResponse.Images["+ i +"].CroppingSuggestion.Length"); j++) {
				CroppingSuggestionItem croppingSuggestionItem = new CroppingSuggestionItem();
				croppingSuggestionItem.setAspectRatio(_ctx.stringValue("FindImagesResponse.Images["+ i +"].CroppingSuggestion["+ j +"].AspectRatio"));
				croppingSuggestionItem.setScore(_ctx.floatValue("FindImagesResponse.Images["+ i +"].CroppingSuggestion["+ j +"].Score"));

				CroppingBoundary croppingBoundary = new CroppingBoundary();
				croppingBoundary.setWidth(_ctx.integerValue("FindImagesResponse.Images["+ i +"].CroppingSuggestion["+ j +"].CroppingBoundary.Width"));
				croppingBoundary.setHeight(_ctx.integerValue("FindImagesResponse.Images["+ i +"].CroppingSuggestion["+ j +"].CroppingBoundary.Height"));
				croppingBoundary.setLeft(_ctx.integerValue("FindImagesResponse.Images["+ i +"].CroppingSuggestion["+ j +"].CroppingBoundary.Left"));
				croppingBoundary.setTop(_ctx.integerValue("FindImagesResponse.Images["+ i +"].CroppingSuggestion["+ j +"].CroppingBoundary.Top"));
				croppingSuggestionItem.setCroppingBoundary(croppingBoundary);

				croppingSuggestion.add(croppingSuggestionItem);
			}
			imagesItem.setCroppingSuggestion(croppingSuggestion);

			List<FacesItem> faces = new ArrayList<FacesItem>();
			for (int j = 0; j < _ctx.lengthValue("FindImagesResponse.Images["+ i +"].Faces.Length"); j++) {
				FacesItem facesItem = new FacesItem();
				facesItem.setAge(_ctx.integerValue("FindImagesResponse.Images["+ i +"].Faces["+ j +"].Age"));
				facesItem.setGenderConfidence(_ctx.floatValue("FindImagesResponse.Images["+ i +"].Faces["+ j +"].GenderConfidence"));
				facesItem.setAttractive(_ctx.floatValue("FindImagesResponse.Images["+ i +"].Faces["+ j +"].Attractive"));
				facesItem.setGender(_ctx.stringValue("FindImagesResponse.Images["+ i +"].Faces["+ j +"].Gender"));
				facesItem.setFaceConfidence(_ctx.floatValue("FindImagesResponse.Images["+ i +"].Faces["+ j +"].FaceConfidence"));
				facesItem.setEmotion(_ctx.stringValue("FindImagesResponse.Images["+ i +"].Faces["+ j +"].Emotion"));
				facesItem.setFaceId(_ctx.stringValue("FindImagesResponse.Images["+ i +"].Faces["+ j +"].FaceId"));
				facesItem.setEmotionConfidence(_ctx.floatValue("FindImagesResponse.Images["+ i +"].Faces["+ j +"].EmotionConfidence"));
				facesItem.setGroupId(_ctx.stringValue("FindImagesResponse.Images["+ i +"].Faces["+ j +"].GroupId"));
				facesItem.setFaceQuality(_ctx.floatValue("FindImagesResponse.Images["+ i +"].Faces["+ j +"].FaceQuality"));

				EmotionDetails emotionDetails = new EmotionDetails();
				emotionDetails.setSAD(_ctx.floatValue("FindImagesResponse.Images["+ i +"].Faces["+ j +"].EmotionDetails.SAD"));
				emotionDetails.setCALM(_ctx.floatValue("FindImagesResponse.Images["+ i +"].Faces["+ j +"].EmotionDetails.CALM"));
				emotionDetails.setANGRY(_ctx.floatValue("FindImagesResponse.Images["+ i +"].Faces["+ j +"].EmotionDetails.ANGRY"));
				emotionDetails.setHAPPY(_ctx.floatValue("FindImagesResponse.Images["+ i +"].Faces["+ j +"].EmotionDetails.HAPPY"));
				emotionDetails.setSCARED(_ctx.floatValue("FindImagesResponse.Images["+ i +"].Faces["+ j +"].EmotionDetails.SCARED"));
				emotionDetails.setDISGUSTED(_ctx.floatValue("FindImagesResponse.Images["+ i +"].Faces["+ j +"].EmotionDetails.DISGUSTED"));
				emotionDetails.setSURPRISED(_ctx.floatValue("FindImagesResponse.Images["+ i +"].Faces["+ j +"].EmotionDetails.SURPRISED"));
				facesItem.setEmotionDetails(emotionDetails);

				FaceAttributes faceAttributes = new FaceAttributes();
				faceAttributes.setGlassesConfidence(_ctx.floatValue("FindImagesResponse.Images["+ i +"].Faces["+ j +"].FaceAttributes.GlassesConfidence"));
				faceAttributes.setGlasses(_ctx.stringValue("FindImagesResponse.Images["+ i +"].Faces["+ j +"].FaceAttributes.Glasses"));
				faceAttributes.setRaceConfidence(_ctx.floatValue("FindImagesResponse.Images["+ i +"].Faces["+ j +"].FaceAttributes.RaceConfidence"));
				faceAttributes.setBeard(_ctx.stringValue("FindImagesResponse.Images["+ i +"].Faces["+ j +"].FaceAttributes.Beard"));
				faceAttributes.setMaskConfidence(_ctx.floatValue("FindImagesResponse.Images["+ i +"].Faces["+ j +"].FaceAttributes.MaskConfidence"));
				faceAttributes.setRace(_ctx.stringValue("FindImagesResponse.Images["+ i +"].Faces["+ j +"].FaceAttributes.Race"));
				faceAttributes.setBeardConfidence(_ctx.floatValue("FindImagesResponse.Images["+ i +"].Faces["+ j +"].FaceAttributes.BeardConfidence"));
				faceAttributes.setMask(_ctx.stringValue("FindImagesResponse.Images["+ i +"].Faces["+ j +"].FaceAttributes.Mask"));

				FaceBoundary faceBoundary = new FaceBoundary();
				faceBoundary.setTop(_ctx.integerValue("FindImagesResponse.Images["+ i +"].Faces["+ j +"].FaceAttributes.FaceBoundary.Top"));
				faceBoundary.setHeight(_ctx.integerValue("FindImagesResponse.Images["+ i +"].Faces["+ j +"].FaceAttributes.FaceBoundary.Height"));
				faceBoundary.setWidth(_ctx.integerValue("FindImagesResponse.Images["+ i +"].Faces["+ j +"].FaceAttributes.FaceBoundary.Width"));
				faceBoundary.setLeft(_ctx.integerValue("FindImagesResponse.Images["+ i +"].Faces["+ j +"].FaceAttributes.FaceBoundary.Left"));
				faceAttributes.setFaceBoundary(faceBoundary);

				HeadPose headPose = new HeadPose();
				headPose.setPitch(_ctx.floatValue("FindImagesResponse.Images["+ i +"].Faces["+ j +"].FaceAttributes.HeadPose.Pitch"));
				headPose.setRoll(_ctx.floatValue("FindImagesResponse.Images["+ i +"].Faces["+ j +"].FaceAttributes.HeadPose.Roll"));
				headPose.setYaw(_ctx.floatValue("FindImagesResponse.Images["+ i +"].Faces["+ j +"].FaceAttributes.HeadPose.Yaw"));
				faceAttributes.setHeadPose(headPose);
				facesItem.setFaceAttributes(faceAttributes);

				faces.add(facesItem);
			}
			imagesItem.setFaces(faces);

			List<TagsItem> tags = new ArrayList<TagsItem>();
			for (int j = 0; j < _ctx.lengthValue("FindImagesResponse.Images["+ i +"].Tags.Length"); j++) {
				TagsItem tagsItem = new TagsItem();
				tagsItem.setTagConfidence(_ctx.floatValue("FindImagesResponse.Images["+ i +"].Tags["+ j +"].TagConfidence"));
				tagsItem.setTagLevel(_ctx.integerValue("FindImagesResponse.Images["+ i +"].Tags["+ j +"].TagLevel"));
				tagsItem.setTagName(_ctx.stringValue("FindImagesResponse.Images["+ i +"].Tags["+ j +"].TagName"));
				tagsItem.setParentTagName(_ctx.stringValue("FindImagesResponse.Images["+ i +"].Tags["+ j +"].ParentTagName"));

				tags.add(tagsItem);
			}
			imagesItem.setTags(tags);

			List<OCRItem> oCR = new ArrayList<OCRItem>();
			for (int j = 0; j < _ctx.lengthValue("FindImagesResponse.Images["+ i +"].OCR.Length"); j++) {
				OCRItem oCRItem = new OCRItem();
				oCRItem.setOCRContents(_ctx.stringValue("FindImagesResponse.Images["+ i +"].OCR["+ j +"].OCRContents"));
				oCRItem.setOCRConfidence(_ctx.floatValue("FindImagesResponse.Images["+ i +"].OCR["+ j +"].OCRConfidence"));

				OCRBoundary oCRBoundary = new OCRBoundary();
				oCRBoundary.setLeft(_ctx.integerValue("FindImagesResponse.Images["+ i +"].OCR["+ j +"].OCRBoundary.Left"));
				oCRBoundary.setLeft1(_ctx.integerValue("FindImagesResponse.Images["+ i +"].OCR["+ j +"].OCRBoundary.Left"));
				oCRBoundary.setWidth(_ctx.integerValue("FindImagesResponse.Images["+ i +"].OCR["+ j +"].OCRBoundary.Width"));
				oCRBoundary.setHeight(_ctx.integerValue("FindImagesResponse.Images["+ i +"].OCR["+ j +"].OCRBoundary.Height"));
				oCRItem.setOCRBoundary(oCRBoundary);

				oCR.add(oCRItem);
			}
			imagesItem.setOCR(oCR);

			List<CelebrityItem> celebrity = new ArrayList<CelebrityItem>();
			for (int j = 0; j < _ctx.lengthValue("FindImagesResponse.Images["+ i +"].Celebrity.Length"); j++) {
				CelebrityItem celebrityItem = new CelebrityItem();
				celebrityItem.setCelebrityName(_ctx.stringValue("FindImagesResponse.Images["+ i +"].Celebrity["+ j +"].CelebrityName"));
				celebrityItem.setCelebrityGender(_ctx.stringValue("FindImagesResponse.Images["+ i +"].Celebrity["+ j +"].CelebrityGender"));
				celebrityItem.setCelebrityConfidence(_ctx.floatValue("FindImagesResponse.Images["+ i +"].Celebrity["+ j +"].CelebrityConfidence"));
				celebrityItem.setCelebrityLibraryName(_ctx.stringValue("FindImagesResponse.Images["+ i +"].Celebrity["+ j +"].CelebrityLibraryName"));

				CelebrityBoundary celebrityBoundary = new CelebrityBoundary();
				celebrityBoundary.setLeft(_ctx.integerValue("FindImagesResponse.Images["+ i +"].Celebrity["+ j +"].CelebrityBoundary.Left"));
				celebrityBoundary.setTop(_ctx.integerValue("FindImagesResponse.Images["+ i +"].Celebrity["+ j +"].CelebrityBoundary.Top"));
				celebrityBoundary.setWidth(_ctx.integerValue("FindImagesResponse.Images["+ i +"].Celebrity["+ j +"].CelebrityBoundary.Width"));
				celebrityBoundary.setHeight(_ctx.integerValue("FindImagesResponse.Images["+ i +"].Celebrity["+ j +"].CelebrityBoundary.Height"));
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