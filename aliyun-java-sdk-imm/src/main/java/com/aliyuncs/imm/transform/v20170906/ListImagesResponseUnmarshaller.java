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
		listImagesResponse.setNextMarker(_ctx.stringValue("ListImagesResponse.NextMarker"));
		listImagesResponse.setSetId(_ctx.stringValue("ListImagesResponse.SetId"));

		List<ImagesItem> images = new ArrayList<ImagesItem>();
		for (int i = 0; i < _ctx.lengthValue("ListImagesResponse.Images.Length"); i++) {
			ImagesItem imagesItem = new ImagesItem();
			imagesItem.setCroppingSuggestionStatus(_ctx.stringValue("ListImagesResponse.Images["+ i +"].CroppingSuggestionStatus"));
			imagesItem.setImageQualityModifyTime(_ctx.stringValue("ListImagesResponse.Images["+ i +"].ImageQualityModifyTime"));
			imagesItem.setTagsFailReason(_ctx.stringValue("ListImagesResponse.Images["+ i +"].TagsFailReason"));
			imagesItem.setRemarksC(_ctx.stringValue("ListImagesResponse.Images["+ i +"].RemarksC"));
			imagesItem.setCreateTime(_ctx.stringValue("ListImagesResponse.Images["+ i +"].CreateTime"));
			imagesItem.setSourceType(_ctx.stringValue("ListImagesResponse.Images["+ i +"].SourceType"));
			imagesItem.setFacesFailReason(_ctx.stringValue("ListImagesResponse.Images["+ i +"].FacesFailReason"));
			imagesItem.setFacesModifyTime(_ctx.stringValue("ListImagesResponse.Images["+ i +"].FacesModifyTime"));
			imagesItem.setImageTime(_ctx.stringValue("ListImagesResponse.Images["+ i +"].ImageTime"));
			imagesItem.setOCRModifyTime(_ctx.stringValue("ListImagesResponse.Images["+ i +"].OCRModifyTime"));
			imagesItem.setAddressModifyTime(_ctx.stringValue("ListImagesResponse.Images["+ i +"].AddressModifyTime"));
			imagesItem.setImageQualityFailReason(_ctx.stringValue("ListImagesResponse.Images["+ i +"].ImageQualityFailReason"));
			imagesItem.setFacesStatus(_ctx.stringValue("ListImagesResponse.Images["+ i +"].FacesStatus"));
			imagesItem.setImageHeight(_ctx.integerValue("ListImagesResponse.Images["+ i +"].ImageHeight"));
			imagesItem.setRemarksArrayA(_ctx.stringValue("ListImagesResponse.Images["+ i +"].RemarksArrayA"));
			imagesItem.setExternalId(_ctx.stringValue("ListImagesResponse.Images["+ i +"].ExternalId"));
			imagesItem.setSourceUri(_ctx.stringValue("ListImagesResponse.Images["+ i +"].SourceUri"));
			imagesItem.setModifyTime(_ctx.stringValue("ListImagesResponse.Images["+ i +"].ModifyTime"));
			imagesItem.setFileSize(_ctx.integerValue("ListImagesResponse.Images["+ i +"].FileSize"));
			imagesItem.setSourcePosition(_ctx.stringValue("ListImagesResponse.Images["+ i +"].SourcePosition"));
			imagesItem.setImageQualityStatus(_ctx.stringValue("ListImagesResponse.Images["+ i +"].ImageQualityStatus"));
			imagesItem.setOCRFailReason(_ctx.stringValue("ListImagesResponse.Images["+ i +"].OCRFailReason"));
			imagesItem.setAddressFailReason(_ctx.stringValue("ListImagesResponse.Images["+ i +"].AddressFailReason"));
			imagesItem.setCroppingSuggestionModifyTime(_ctx.stringValue("ListImagesResponse.Images["+ i +"].CroppingSuggestionModifyTime"));
			imagesItem.setImageFormat(_ctx.stringValue("ListImagesResponse.Images["+ i +"].ImageFormat"));
			imagesItem.setImageWidth(_ctx.integerValue("ListImagesResponse.Images["+ i +"].ImageWidth"));
			imagesItem.setRemarksArrayB(_ctx.stringValue("ListImagesResponse.Images["+ i +"].RemarksArrayB"));
			imagesItem.setOrientation(_ctx.stringValue("ListImagesResponse.Images["+ i +"].Orientation"));
			imagesItem.setRemarksD(_ctx.stringValue("ListImagesResponse.Images["+ i +"].RemarksD"));
			imagesItem.setTagsStatus(_ctx.stringValue("ListImagesResponse.Images["+ i +"].TagsStatus"));
			imagesItem.setCroppingSuggestionFailReason(_ctx.stringValue("ListImagesResponse.Images["+ i +"].CroppingSuggestionFailReason"));
			imagesItem.setRemarksA(_ctx.stringValue("ListImagesResponse.Images["+ i +"].RemarksA"));
			imagesItem.setImageUri(_ctx.stringValue("ListImagesResponse.Images["+ i +"].ImageUri"));
			imagesItem.setTagsModifyTime(_ctx.stringValue("ListImagesResponse.Images["+ i +"].TagsModifyTime"));
			imagesItem.setOCRStatus(_ctx.stringValue("ListImagesResponse.Images["+ i +"].OCRStatus"));
			imagesItem.setAddressStatus(_ctx.stringValue("ListImagesResponse.Images["+ i +"].AddressStatus"));
			imagesItem.setExif(_ctx.stringValue("ListImagesResponse.Images["+ i +"].Exif"));
			imagesItem.setLocation(_ctx.stringValue("ListImagesResponse.Images["+ i +"].Location"));
			imagesItem.setRemarksB(_ctx.stringValue("ListImagesResponse.Images["+ i +"].RemarksB"));

			Address address = new Address();
			address.setTownship(_ctx.stringValue("ListImagesResponse.Images["+ i +"].Address.Township"));
			address.setDistrict(_ctx.stringValue("ListImagesResponse.Images["+ i +"].Address.District"));
			address.setAddressLine(_ctx.stringValue("ListImagesResponse.Images["+ i +"].Address.AddressLine"));
			address.setCountry(_ctx.stringValue("ListImagesResponse.Images["+ i +"].Address.Country"));
			address.setCity(_ctx.stringValue("ListImagesResponse.Images["+ i +"].Address.City"));
			address.setProvince(_ctx.stringValue("ListImagesResponse.Images["+ i +"].Address.Province"));
			imagesItem.setAddress(address);

			ImageQuality imageQuality = new ImageQuality();
			imageQuality.setOverallScore(_ctx.floatValue("ListImagesResponse.Images["+ i +"].ImageQuality.OverallScore"));
			imageQuality.setColor(_ctx.floatValue("ListImagesResponse.Images["+ i +"].ImageQuality.Color"));
			imageQuality.setColorScore(_ctx.floatValue("ListImagesResponse.Images["+ i +"].ImageQuality.ColorScore"));
			imageQuality.setContrastScore(_ctx.floatValue("ListImagesResponse.Images["+ i +"].ImageQuality.ContrastScore"));
			imageQuality.setContrast(_ctx.floatValue("ListImagesResponse.Images["+ i +"].ImageQuality.Contrast"));
			imageQuality.setExposureScore(_ctx.floatValue("ListImagesResponse.Images["+ i +"].ImageQuality.ExposureScore"));
			imageQuality.setClarityScore(_ctx.floatValue("ListImagesResponse.Images["+ i +"].ImageQuality.ClarityScore"));
			imageQuality.setClarity(_ctx.floatValue("ListImagesResponse.Images["+ i +"].ImageQuality.Clarity"));
			imageQuality.setExposure(_ctx.floatValue("ListImagesResponse.Images["+ i +"].ImageQuality.Exposure"));
			imageQuality.setCompositionScore(_ctx.floatValue("ListImagesResponse.Images["+ i +"].ImageQuality.CompositionScore"));
			imagesItem.setImageQuality(imageQuality);

			List<TagsItem> tags = new ArrayList<TagsItem>();
			for (int j = 0; j < _ctx.lengthValue("ListImagesResponse.Images["+ i +"].Tags.Length"); j++) {
				TagsItem tagsItem = new TagsItem();
				tagsItem.setTagConfidence(_ctx.floatValue("ListImagesResponse.Images["+ i +"].Tags["+ j +"].TagConfidence"));
				tagsItem.setCentricScore(_ctx.floatValue("ListImagesResponse.Images["+ i +"].Tags["+ j +"].CentricScore"));
				tagsItem.setTagName(_ctx.stringValue("ListImagesResponse.Images["+ i +"].Tags["+ j +"].TagName"));
				tagsItem.setTagLevel(_ctx.integerValue("ListImagesResponse.Images["+ i +"].Tags["+ j +"].TagLevel"));
				tagsItem.setParentTagName(_ctx.stringValue("ListImagesResponse.Images["+ i +"].Tags["+ j +"].ParentTagName"));

				tags.add(tagsItem);
			}
			imagesItem.setTags(tags);

			List<OCRItem> oCR = new ArrayList<OCRItem>();
			for (int j = 0; j < _ctx.lengthValue("ListImagesResponse.Images["+ i +"].OCR.Length"); j++) {
				OCRItem oCRItem = new OCRItem();
				oCRItem.setOCRConfidence(_ctx.floatValue("ListImagesResponse.Images["+ i +"].OCR["+ j +"].OCRConfidence"));
				oCRItem.setOCRContents(_ctx.stringValue("ListImagesResponse.Images["+ i +"].OCR["+ j +"].OCRContents"));

				OCRBoundary oCRBoundary = new OCRBoundary();
				oCRBoundary.setTop(_ctx.integerValue("ListImagesResponse.Images["+ i +"].OCR["+ j +"].OCRBoundary.Top"));
				oCRBoundary.setWidth(_ctx.integerValue("ListImagesResponse.Images["+ i +"].OCR["+ j +"].OCRBoundary.Width"));
				oCRBoundary.setHeight(_ctx.integerValue("ListImagesResponse.Images["+ i +"].OCR["+ j +"].OCRBoundary.Height"));
				oCRBoundary.setLeft(_ctx.integerValue("ListImagesResponse.Images["+ i +"].OCR["+ j +"].OCRBoundary.Left"));
				oCRItem.setOCRBoundary(oCRBoundary);

				oCR.add(oCRItem);
			}
			imagesItem.setOCR(oCR);

			List<FacesItem> faces = new ArrayList<FacesItem>();
			for (int j = 0; j < _ctx.lengthValue("ListImagesResponse.Images["+ i +"].Faces.Length"); j++) {
				FacesItem facesItem = new FacesItem();
				facesItem.setGender(_ctx.stringValue("ListImagesResponse.Images["+ i +"].Faces["+ j +"].Gender"));
				facesItem.setFaceId(_ctx.stringValue("ListImagesResponse.Images["+ i +"].Faces["+ j +"].FaceId"));
				facesItem.setGenderConfidence(_ctx.floatValue("ListImagesResponse.Images["+ i +"].Faces["+ j +"].GenderConfidence"));
				facesItem.setFaceQuality(_ctx.floatValue("ListImagesResponse.Images["+ i +"].Faces["+ j +"].FaceQuality"));
				facesItem.setEmotion(_ctx.stringValue("ListImagesResponse.Images["+ i +"].Faces["+ j +"].Emotion"));
				facesItem.setAge(_ctx.integerValue("ListImagesResponse.Images["+ i +"].Faces["+ j +"].Age"));
				facesItem.setFaceConfidence(_ctx.floatValue("ListImagesResponse.Images["+ i +"].Faces["+ j +"].FaceConfidence"));
				facesItem.setEmotionConfidence(_ctx.floatValue("ListImagesResponse.Images["+ i +"].Faces["+ j +"].EmotionConfidence"));
				facesItem.setAttractive(_ctx.floatValue("ListImagesResponse.Images["+ i +"].Faces["+ j +"].Attractive"));
				facesItem.setGroupId(_ctx.stringValue("ListImagesResponse.Images["+ i +"].Faces["+ j +"].GroupId"));

				FaceAttributes faceAttributes = new FaceAttributes();
				faceAttributes.setGlassesConfidence(_ctx.floatValue("ListImagesResponse.Images["+ i +"].Faces["+ j +"].FaceAttributes.GlassesConfidence"));
				faceAttributes.setGlasses(_ctx.stringValue("ListImagesResponse.Images["+ i +"].Faces["+ j +"].FaceAttributes.Glasses"));
				faceAttributes.setMask(_ctx.stringValue("ListImagesResponse.Images["+ i +"].Faces["+ j +"].FaceAttributes.Mask"));
				faceAttributes.setBeardConfidence(_ctx.floatValue("ListImagesResponse.Images["+ i +"].Faces["+ j +"].FaceAttributes.BeardConfidence"));
				faceAttributes.setMaskConfidence(_ctx.floatValue("ListImagesResponse.Images["+ i +"].Faces["+ j +"].FaceAttributes.MaskConfidence"));
				faceAttributes.setBeard(_ctx.stringValue("ListImagesResponse.Images["+ i +"].Faces["+ j +"].FaceAttributes.Beard"));

				FaceBoundary faceBoundary = new FaceBoundary();
				faceBoundary.setTop(_ctx.integerValue("ListImagesResponse.Images["+ i +"].Faces["+ j +"].FaceAttributes.FaceBoundary.Top"));
				faceBoundary.setWidth(_ctx.integerValue("ListImagesResponse.Images["+ i +"].Faces["+ j +"].FaceAttributes.FaceBoundary.Width"));
				faceBoundary.setHeight(_ctx.integerValue("ListImagesResponse.Images["+ i +"].Faces["+ j +"].FaceAttributes.FaceBoundary.Height"));
				faceBoundary.setLeft(_ctx.integerValue("ListImagesResponse.Images["+ i +"].Faces["+ j +"].FaceAttributes.FaceBoundary.Left"));
				faceAttributes.setFaceBoundary(faceBoundary);

				HeadPose headPose = new HeadPose();
				headPose.setPitch(_ctx.floatValue("ListImagesResponse.Images["+ i +"].Faces["+ j +"].FaceAttributes.HeadPose.Pitch"));
				headPose.setRoll(_ctx.floatValue("ListImagesResponse.Images["+ i +"].Faces["+ j +"].FaceAttributes.HeadPose.Roll"));
				headPose.setYaw(_ctx.floatValue("ListImagesResponse.Images["+ i +"].Faces["+ j +"].FaceAttributes.HeadPose.Yaw"));
				faceAttributes.setHeadPose(headPose);
				facesItem.setFaceAttributes(faceAttributes);

				EmotionDetails emotionDetails = new EmotionDetails();
				emotionDetails.setHAPPY(_ctx.floatValue("ListImagesResponse.Images["+ i +"].Faces["+ j +"].EmotionDetails.HAPPY"));
				emotionDetails.setSURPRISED(_ctx.floatValue("ListImagesResponse.Images["+ i +"].Faces["+ j +"].EmotionDetails.SURPRISED"));
				emotionDetails.setCALM(_ctx.floatValue("ListImagesResponse.Images["+ i +"].Faces["+ j +"].EmotionDetails.CALM"));
				emotionDetails.setDISGUSTED(_ctx.floatValue("ListImagesResponse.Images["+ i +"].Faces["+ j +"].EmotionDetails.DISGUSTED"));
				emotionDetails.setANGRY(_ctx.floatValue("ListImagesResponse.Images["+ i +"].Faces["+ j +"].EmotionDetails.ANGRY"));
				emotionDetails.setSAD(_ctx.floatValue("ListImagesResponse.Images["+ i +"].Faces["+ j +"].EmotionDetails.SAD"));
				emotionDetails.setSCARED(_ctx.floatValue("ListImagesResponse.Images["+ i +"].Faces["+ j +"].EmotionDetails.SCARED"));
				facesItem.setEmotionDetails(emotionDetails);

				faces.add(facesItem);
			}
			imagesItem.setFaces(faces);

			List<CroppingSuggestionItem> croppingSuggestion = new ArrayList<CroppingSuggestionItem>();
			for (int j = 0; j < _ctx.lengthValue("ListImagesResponse.Images["+ i +"].CroppingSuggestion.Length"); j++) {
				CroppingSuggestionItem croppingSuggestionItem = new CroppingSuggestionItem();
				croppingSuggestionItem.setScore(_ctx.floatValue("ListImagesResponse.Images["+ i +"].CroppingSuggestion["+ j +"].Score"));
				croppingSuggestionItem.setAspectRatio(_ctx.stringValue("ListImagesResponse.Images["+ i +"].CroppingSuggestion["+ j +"].AspectRatio"));

				CroppingBoundary croppingBoundary = new CroppingBoundary();
				croppingBoundary.setTop(_ctx.integerValue("ListImagesResponse.Images["+ i +"].CroppingSuggestion["+ j +"].CroppingBoundary.Top"));
				croppingBoundary.setWidth(_ctx.integerValue("ListImagesResponse.Images["+ i +"].CroppingSuggestion["+ j +"].CroppingBoundary.Width"));
				croppingBoundary.setHeight(_ctx.integerValue("ListImagesResponse.Images["+ i +"].CroppingSuggestion["+ j +"].CroppingBoundary.Height"));
				croppingBoundary.setLeft(_ctx.integerValue("ListImagesResponse.Images["+ i +"].CroppingSuggestion["+ j +"].CroppingBoundary.Left"));
				croppingSuggestionItem.setCroppingBoundary(croppingBoundary);

				croppingSuggestion.add(croppingSuggestionItem);
			}
			imagesItem.setCroppingSuggestion(croppingSuggestion);

			images.add(imagesItem);
		}
		listImagesResponse.setImages(images);
	 
	 	return listImagesResponse;
	}
}