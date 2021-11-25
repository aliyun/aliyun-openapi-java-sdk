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
		findImagesResponse.setNextMarker(_ctx.stringValue("FindImagesResponse.NextMarker"));
		findImagesResponse.setSetId(_ctx.stringValue("FindImagesResponse.SetId"));

		List<ImagesItem> images = new ArrayList<ImagesItem>();
		for (int i = 0; i < _ctx.lengthValue("FindImagesResponse.Images.Length"); i++) {
			ImagesItem imagesItem = new ImagesItem();
			imagesItem.setCroppingSuggestionStatus(_ctx.stringValue("FindImagesResponse.Images["+ i +"].CroppingSuggestionStatus"));
			imagesItem.setImageQualityModifyTime(_ctx.stringValue("FindImagesResponse.Images["+ i +"].ImageQualityModifyTime"));
			imagesItem.setTagsFailReason(_ctx.stringValue("FindImagesResponse.Images["+ i +"].TagsFailReason"));
			imagesItem.setRemarksC(_ctx.stringValue("FindImagesResponse.Images["+ i +"].RemarksC"));
			imagesItem.setCreateTime(_ctx.stringValue("FindImagesResponse.Images["+ i +"].CreateTime"));
			imagesItem.setSourceType(_ctx.stringValue("FindImagesResponse.Images["+ i +"].SourceType"));
			imagesItem.setFacesFailReason(_ctx.stringValue("FindImagesResponse.Images["+ i +"].FacesFailReason"));
			imagesItem.setFacesModifyTime(_ctx.stringValue("FindImagesResponse.Images["+ i +"].FacesModifyTime"));
			imagesItem.setImageTime(_ctx.stringValue("FindImagesResponse.Images["+ i +"].ImageTime"));
			imagesItem.setOCRModifyTime(_ctx.stringValue("FindImagesResponse.Images["+ i +"].OCRModifyTime"));
			imagesItem.setAddressModifyTime(_ctx.stringValue("FindImagesResponse.Images["+ i +"].AddressModifyTime"));
			imagesItem.setImageQualityFailReason(_ctx.stringValue("FindImagesResponse.Images["+ i +"].ImageQualityFailReason"));
			imagesItem.setFacesStatus(_ctx.stringValue("FindImagesResponse.Images["+ i +"].FacesStatus"));
			imagesItem.setImageHeight(_ctx.integerValue("FindImagesResponse.Images["+ i +"].ImageHeight"));
			imagesItem.setRemarksArrayA(_ctx.stringValue("FindImagesResponse.Images["+ i +"].RemarksArrayA"));
			imagesItem.setExternalId(_ctx.stringValue("FindImagesResponse.Images["+ i +"].ExternalId"));
			imagesItem.setSourceUri(_ctx.stringValue("FindImagesResponse.Images["+ i +"].SourceUri"));
			imagesItem.setModifyTime(_ctx.stringValue("FindImagesResponse.Images["+ i +"].ModifyTime"));
			imagesItem.setFileSize(_ctx.integerValue("FindImagesResponse.Images["+ i +"].FileSize"));
			imagesItem.setSourcePosition(_ctx.stringValue("FindImagesResponse.Images["+ i +"].SourcePosition"));
			imagesItem.setImageQualityStatus(_ctx.stringValue("FindImagesResponse.Images["+ i +"].ImageQualityStatus"));
			imagesItem.setOCRFailReason(_ctx.stringValue("FindImagesResponse.Images["+ i +"].OCRFailReason"));
			imagesItem.setAddressFailReason(_ctx.stringValue("FindImagesResponse.Images["+ i +"].AddressFailReason"));
			imagesItem.setCroppingSuggestionModifyTime(_ctx.stringValue("FindImagesResponse.Images["+ i +"].CroppingSuggestionModifyTime"));
			imagesItem.setImageFormat(_ctx.stringValue("FindImagesResponse.Images["+ i +"].ImageFormat"));
			imagesItem.setImageWidth(_ctx.integerValue("FindImagesResponse.Images["+ i +"].ImageWidth"));
			imagesItem.setRemarksArrayB(_ctx.stringValue("FindImagesResponse.Images["+ i +"].RemarksArrayB"));
			imagesItem.setOrientation(_ctx.stringValue("FindImagesResponse.Images["+ i +"].Orientation"));
			imagesItem.setRemarksD(_ctx.stringValue("FindImagesResponse.Images["+ i +"].RemarksD"));
			imagesItem.setTagsStatus(_ctx.stringValue("FindImagesResponse.Images["+ i +"].TagsStatus"));
			imagesItem.setCroppingSuggestionFailReason(_ctx.stringValue("FindImagesResponse.Images["+ i +"].CroppingSuggestionFailReason"));
			imagesItem.setRemarksA(_ctx.stringValue("FindImagesResponse.Images["+ i +"].RemarksA"));
			imagesItem.setImageUri(_ctx.stringValue("FindImagesResponse.Images["+ i +"].ImageUri"));
			imagesItem.setTagsModifyTime(_ctx.stringValue("FindImagesResponse.Images["+ i +"].TagsModifyTime"));
			imagesItem.setOCRStatus(_ctx.stringValue("FindImagesResponse.Images["+ i +"].OCRStatus"));
			imagesItem.setAddressStatus(_ctx.stringValue("FindImagesResponse.Images["+ i +"].AddressStatus"));
			imagesItem.setExif(_ctx.stringValue("FindImagesResponse.Images["+ i +"].Exif"));
			imagesItem.setLocation(_ctx.stringValue("FindImagesResponse.Images["+ i +"].Location"));
			imagesItem.setRemarksB(_ctx.stringValue("FindImagesResponse.Images["+ i +"].RemarksB"));

			Address address = new Address();
			address.setTownship(_ctx.stringValue("FindImagesResponse.Images["+ i +"].Address.Township"));
			address.setDistrict(_ctx.stringValue("FindImagesResponse.Images["+ i +"].Address.District"));
			address.setAddressLine(_ctx.stringValue("FindImagesResponse.Images["+ i +"].Address.AddressLine"));
			address.setCountry(_ctx.stringValue("FindImagesResponse.Images["+ i +"].Address.Country"));
			address.setCity(_ctx.stringValue("FindImagesResponse.Images["+ i +"].Address.City"));
			address.setProvince(_ctx.stringValue("FindImagesResponse.Images["+ i +"].Address.Province"));
			imagesItem.setAddress(address);

			ImageQuality imageQuality = new ImageQuality();
			imageQuality.setOverallScore(_ctx.floatValue("FindImagesResponse.Images["+ i +"].ImageQuality.OverallScore"));
			imageQuality.setColor(_ctx.floatValue("FindImagesResponse.Images["+ i +"].ImageQuality.Color"));
			imageQuality.setColorScore(_ctx.floatValue("FindImagesResponse.Images["+ i +"].ImageQuality.ColorScore"));
			imageQuality.setContrastScore(_ctx.floatValue("FindImagesResponse.Images["+ i +"].ImageQuality.ContrastScore"));
			imageQuality.setContrast(_ctx.floatValue("FindImagesResponse.Images["+ i +"].ImageQuality.Contrast"));
			imageQuality.setExposureScore(_ctx.floatValue("FindImagesResponse.Images["+ i +"].ImageQuality.ExposureScore"));
			imageQuality.setClarityScore(_ctx.floatValue("FindImagesResponse.Images["+ i +"].ImageQuality.ClarityScore"));
			imageQuality.setClarity(_ctx.floatValue("FindImagesResponse.Images["+ i +"].ImageQuality.Clarity"));
			imageQuality.setExposure(_ctx.floatValue("FindImagesResponse.Images["+ i +"].ImageQuality.Exposure"));
			imageQuality.setCompositionScore(_ctx.floatValue("FindImagesResponse.Images["+ i +"].ImageQuality.CompositionScore"));
			imagesItem.setImageQuality(imageQuality);

			List<TagsItem> tags = new ArrayList<TagsItem>();
			for (int j = 0; j < _ctx.lengthValue("FindImagesResponse.Images["+ i +"].Tags.Length"); j++) {
				TagsItem tagsItem = new TagsItem();
				tagsItem.setTagConfidence(_ctx.floatValue("FindImagesResponse.Images["+ i +"].Tags["+ j +"].TagConfidence"));
				tagsItem.setCentricScore(_ctx.floatValue("FindImagesResponse.Images["+ i +"].Tags["+ j +"].CentricScore"));
				tagsItem.setTagName(_ctx.stringValue("FindImagesResponse.Images["+ i +"].Tags["+ j +"].TagName"));
				tagsItem.setTagLevel(_ctx.integerValue("FindImagesResponse.Images["+ i +"].Tags["+ j +"].TagLevel"));
				tagsItem.setParentTagName(_ctx.stringValue("FindImagesResponse.Images["+ i +"].Tags["+ j +"].ParentTagName"));

				tags.add(tagsItem);
			}
			imagesItem.setTags(tags);

			List<OCRItem> oCR = new ArrayList<OCRItem>();
			for (int j = 0; j < _ctx.lengthValue("FindImagesResponse.Images["+ i +"].OCR.Length"); j++) {
				OCRItem oCRItem = new OCRItem();
				oCRItem.setOCRConfidence(_ctx.floatValue("FindImagesResponse.Images["+ i +"].OCR["+ j +"].OCRConfidence"));
				oCRItem.setOCRContents(_ctx.stringValue("FindImagesResponse.Images["+ i +"].OCR["+ j +"].OCRContents"));

				OCRBoundary oCRBoundary = new OCRBoundary();
				oCRBoundary.setTop(_ctx.integerValue("FindImagesResponse.Images["+ i +"].OCR["+ j +"].OCRBoundary.Top"));
				oCRBoundary.setWidth(_ctx.integerValue("FindImagesResponse.Images["+ i +"].OCR["+ j +"].OCRBoundary.Width"));
				oCRBoundary.setHeight(_ctx.integerValue("FindImagesResponse.Images["+ i +"].OCR["+ j +"].OCRBoundary.Height"));
				oCRBoundary.setLeft(_ctx.integerValue("FindImagesResponse.Images["+ i +"].OCR["+ j +"].OCRBoundary.Left"));
				oCRItem.setOCRBoundary(oCRBoundary);

				oCR.add(oCRItem);
			}
			imagesItem.setOCR(oCR);

			List<FacesItem> faces = new ArrayList<FacesItem>();
			for (int j = 0; j < _ctx.lengthValue("FindImagesResponse.Images["+ i +"].Faces.Length"); j++) {
				FacesItem facesItem = new FacesItem();
				facesItem.setGender(_ctx.stringValue("FindImagesResponse.Images["+ i +"].Faces["+ j +"].Gender"));
				facesItem.setFaceId(_ctx.stringValue("FindImagesResponse.Images["+ i +"].Faces["+ j +"].FaceId"));
				facesItem.setGenderConfidence(_ctx.floatValue("FindImagesResponse.Images["+ i +"].Faces["+ j +"].GenderConfidence"));
				facesItem.setFaceQuality(_ctx.floatValue("FindImagesResponse.Images["+ i +"].Faces["+ j +"].FaceQuality"));
				facesItem.setEmotion(_ctx.stringValue("FindImagesResponse.Images["+ i +"].Faces["+ j +"].Emotion"));
				facesItem.setAge(_ctx.integerValue("FindImagesResponse.Images["+ i +"].Faces["+ j +"].Age"));
				facesItem.setFaceConfidence(_ctx.floatValue("FindImagesResponse.Images["+ i +"].Faces["+ j +"].FaceConfidence"));
				facesItem.setEmotionConfidence(_ctx.floatValue("FindImagesResponse.Images["+ i +"].Faces["+ j +"].EmotionConfidence"));
				facesItem.setAttractive(_ctx.floatValue("FindImagesResponse.Images["+ i +"].Faces["+ j +"].Attractive"));
				facesItem.setGroupId(_ctx.stringValue("FindImagesResponse.Images["+ i +"].Faces["+ j +"].GroupId"));

				FaceAttributes faceAttributes = new FaceAttributes();
				faceAttributes.setGlassesConfidence(_ctx.floatValue("FindImagesResponse.Images["+ i +"].Faces["+ j +"].FaceAttributes.GlassesConfidence"));
				faceAttributes.setGlasses(_ctx.stringValue("FindImagesResponse.Images["+ i +"].Faces["+ j +"].FaceAttributes.Glasses"));
				faceAttributes.setMask(_ctx.stringValue("FindImagesResponse.Images["+ i +"].Faces["+ j +"].FaceAttributes.Mask"));
				faceAttributes.setBeardConfidence(_ctx.floatValue("FindImagesResponse.Images["+ i +"].Faces["+ j +"].FaceAttributes.BeardConfidence"));
				faceAttributes.setMaskConfidence(_ctx.floatValue("FindImagesResponse.Images["+ i +"].Faces["+ j +"].FaceAttributes.MaskConfidence"));
				faceAttributes.setBeard(_ctx.stringValue("FindImagesResponse.Images["+ i +"].Faces["+ j +"].FaceAttributes.Beard"));

				FaceBoundary faceBoundary = new FaceBoundary();
				faceBoundary.setTop(_ctx.integerValue("FindImagesResponse.Images["+ i +"].Faces["+ j +"].FaceAttributes.FaceBoundary.Top"));
				faceBoundary.setWidth(_ctx.integerValue("FindImagesResponse.Images["+ i +"].Faces["+ j +"].FaceAttributes.FaceBoundary.Width"));
				faceBoundary.setHeight(_ctx.integerValue("FindImagesResponse.Images["+ i +"].Faces["+ j +"].FaceAttributes.FaceBoundary.Height"));
				faceBoundary.setLeft(_ctx.integerValue("FindImagesResponse.Images["+ i +"].Faces["+ j +"].FaceAttributes.FaceBoundary.Left"));
				faceAttributes.setFaceBoundary(faceBoundary);

				HeadPose headPose = new HeadPose();
				headPose.setPitch(_ctx.floatValue("FindImagesResponse.Images["+ i +"].Faces["+ j +"].FaceAttributes.HeadPose.Pitch"));
				headPose.setRoll(_ctx.floatValue("FindImagesResponse.Images["+ i +"].Faces["+ j +"].FaceAttributes.HeadPose.Roll"));
				headPose.setYaw(_ctx.floatValue("FindImagesResponse.Images["+ i +"].Faces["+ j +"].FaceAttributes.HeadPose.Yaw"));
				faceAttributes.setHeadPose(headPose);
				facesItem.setFaceAttributes(faceAttributes);

				EmotionDetails emotionDetails = new EmotionDetails();
				emotionDetails.setHAPPY(_ctx.floatValue("FindImagesResponse.Images["+ i +"].Faces["+ j +"].EmotionDetails.HAPPY"));
				emotionDetails.setSURPRISED(_ctx.floatValue("FindImagesResponse.Images["+ i +"].Faces["+ j +"].EmotionDetails.SURPRISED"));
				emotionDetails.setCALM(_ctx.floatValue("FindImagesResponse.Images["+ i +"].Faces["+ j +"].EmotionDetails.CALM"));
				emotionDetails.setDISGUSTED(_ctx.floatValue("FindImagesResponse.Images["+ i +"].Faces["+ j +"].EmotionDetails.DISGUSTED"));
				emotionDetails.setANGRY(_ctx.floatValue("FindImagesResponse.Images["+ i +"].Faces["+ j +"].EmotionDetails.ANGRY"));
				emotionDetails.setSAD(_ctx.floatValue("FindImagesResponse.Images["+ i +"].Faces["+ j +"].EmotionDetails.SAD"));
				emotionDetails.setSCARED(_ctx.floatValue("FindImagesResponse.Images["+ i +"].Faces["+ j +"].EmotionDetails.SCARED"));
				facesItem.setEmotionDetails(emotionDetails);

				faces.add(facesItem);
			}
			imagesItem.setFaces(faces);

			List<CroppingSuggestionItem> croppingSuggestion = new ArrayList<CroppingSuggestionItem>();
			for (int j = 0; j < _ctx.lengthValue("FindImagesResponse.Images["+ i +"].CroppingSuggestion.Length"); j++) {
				CroppingSuggestionItem croppingSuggestionItem = new CroppingSuggestionItem();
				croppingSuggestionItem.setScore(_ctx.floatValue("FindImagesResponse.Images["+ i +"].CroppingSuggestion["+ j +"].Score"));
				croppingSuggestionItem.setAspectRatio(_ctx.stringValue("FindImagesResponse.Images["+ i +"].CroppingSuggestion["+ j +"].AspectRatio"));

				CroppingBoundary croppingBoundary = new CroppingBoundary();
				croppingBoundary.setTop(_ctx.integerValue("FindImagesResponse.Images["+ i +"].CroppingSuggestion["+ j +"].CroppingBoundary.Top"));
				croppingBoundary.setWidth(_ctx.integerValue("FindImagesResponse.Images["+ i +"].CroppingSuggestion["+ j +"].CroppingBoundary.Width"));
				croppingBoundary.setHeight(_ctx.integerValue("FindImagesResponse.Images["+ i +"].CroppingSuggestion["+ j +"].CroppingBoundary.Height"));
				croppingBoundary.setLeft(_ctx.integerValue("FindImagesResponse.Images["+ i +"].CroppingSuggestion["+ j +"].CroppingBoundary.Left"));
				croppingSuggestionItem.setCroppingBoundary(croppingBoundary);

				croppingSuggestion.add(croppingSuggestionItem);
			}
			imagesItem.setCroppingSuggestion(croppingSuggestion);

			images.add(imagesItem);
		}
		findImagesResponse.setImages(images);
	 
	 	return findImagesResponse;
	}
}