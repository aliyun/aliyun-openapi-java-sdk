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

import com.aliyuncs.imm.model.v20170906.GetImageResponse;
import com.aliyuncs.imm.model.v20170906.GetImageResponse.Address;
import com.aliyuncs.imm.model.v20170906.GetImageResponse.CroppingSuggestionItem;
import com.aliyuncs.imm.model.v20170906.GetImageResponse.CroppingSuggestionItem.CroppingBoundary;
import com.aliyuncs.imm.model.v20170906.GetImageResponse.FacesItem;
import com.aliyuncs.imm.model.v20170906.GetImageResponse.FacesItem.EmotionDetails;
import com.aliyuncs.imm.model.v20170906.GetImageResponse.FacesItem.FaceAttributes;
import com.aliyuncs.imm.model.v20170906.GetImageResponse.FacesItem.FaceAttributes.FaceBoundary;
import com.aliyuncs.imm.model.v20170906.GetImageResponse.FacesItem.FaceAttributes.HeadPose;
import com.aliyuncs.imm.model.v20170906.GetImageResponse.ImageQuality;
import com.aliyuncs.imm.model.v20170906.GetImageResponse.OCRItem;
import com.aliyuncs.imm.model.v20170906.GetImageResponse.OCRItem.OCRBoundary;
import com.aliyuncs.imm.model.v20170906.GetImageResponse.TagsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetImageResponseUnmarshaller {

	public static GetImageResponse unmarshall(GetImageResponse getImageResponse, UnmarshallerContext _ctx) {
		
		getImageResponse.setRequestId(_ctx.stringValue("GetImageResponse.RequestId"));
		getImageResponse.setModifyTime(_ctx.stringValue("GetImageResponse.ModifyTime"));
		getImageResponse.setSourceType(_ctx.stringValue("GetImageResponse.SourceType"));
		getImageResponse.setSourceUri(_ctx.stringValue("GetImageResponse.SourceUri"));
		getImageResponse.setFacesFailReason(_ctx.stringValue("GetImageResponse.FacesFailReason"));
		getImageResponse.setCroppingSuggestionStatus(_ctx.stringValue("GetImageResponse.CroppingSuggestionStatus"));
		getImageResponse.setCroppingSuggestionFailReason(_ctx.stringValue("GetImageResponse.CroppingSuggestionFailReason"));
		getImageResponse.setAddressFailReason(_ctx.stringValue("GetImageResponse.AddressFailReason"));
		getImageResponse.setRemarksA(_ctx.stringValue("GetImageResponse.RemarksA"));
		getImageResponse.setAddressModifyTime(_ctx.stringValue("GetImageResponse.AddressModifyTime"));
		getImageResponse.setRemarksB(_ctx.stringValue("GetImageResponse.RemarksB"));
		getImageResponse.setImageFormat(_ctx.stringValue("GetImageResponse.ImageFormat"));
		getImageResponse.setTagsFailReason(_ctx.stringValue("GetImageResponse.TagsFailReason"));
		getImageResponse.setRemarksArrayB(_ctx.stringValue("GetImageResponse.RemarksArrayB"));
		getImageResponse.setFacesModifyTime(_ctx.stringValue("GetImageResponse.FacesModifyTime"));
		getImageResponse.setExif(_ctx.stringValue("GetImageResponse.Exif"));
		getImageResponse.setRemarksC(_ctx.stringValue("GetImageResponse.RemarksC"));
		getImageResponse.setRemarksD(_ctx.stringValue("GetImageResponse.RemarksD"));
		getImageResponse.setImageWidth(_ctx.integerValue("GetImageResponse.ImageWidth"));
		getImageResponse.setRemarksArrayA(_ctx.stringValue("GetImageResponse.RemarksArrayA"));
		getImageResponse.setSourcePosition(_ctx.stringValue("GetImageResponse.SourcePosition"));
		getImageResponse.setAddressStatus(_ctx.stringValue("GetImageResponse.AddressStatus"));
		getImageResponse.setFacesStatus(_ctx.stringValue("GetImageResponse.FacesStatus"));
		getImageResponse.setImageQualityModifyTime(_ctx.stringValue("GetImageResponse.ImageQualityModifyTime"));
		getImageResponse.setCreateTime(_ctx.stringValue("GetImageResponse.CreateTime"));
		getImageResponse.setExternalId(_ctx.stringValue("GetImageResponse.ExternalId"));
		getImageResponse.setTagsModifyTime(_ctx.stringValue("GetImageResponse.TagsModifyTime"));
		getImageResponse.setImageQualityFailReason(_ctx.stringValue("GetImageResponse.ImageQualityFailReason"));
		getImageResponse.setOrientation(_ctx.stringValue("GetImageResponse.Orientation"));
		getImageResponse.setImageUri(_ctx.stringValue("GetImageResponse.ImageUri"));
		getImageResponse.setOCRStatus(_ctx.stringValue("GetImageResponse.OCRStatus"));
		getImageResponse.setOCRModifyTime(_ctx.stringValue("GetImageResponse.OCRModifyTime"));
		getImageResponse.setImageTime(_ctx.stringValue("GetImageResponse.ImageTime"));
		getImageResponse.setCroppingSuggestionModifyTime(_ctx.stringValue("GetImageResponse.CroppingSuggestionModifyTime"));
		getImageResponse.setImageHeight(_ctx.integerValue("GetImageResponse.ImageHeight"));
		getImageResponse.setImageQualityStatus(_ctx.stringValue("GetImageResponse.ImageQualityStatus"));
		getImageResponse.setTagsStatus(_ctx.stringValue("GetImageResponse.TagsStatus"));
		getImageResponse.setOCRFailReason(_ctx.stringValue("GetImageResponse.OCRFailReason"));
		getImageResponse.setSetId(_ctx.stringValue("GetImageResponse.SetId"));
		getImageResponse.setFileSize(_ctx.integerValue("GetImageResponse.FileSize"));
		getImageResponse.setLocation(_ctx.stringValue("GetImageResponse.Location"));

		ImageQuality imageQuality = new ImageQuality();
		imageQuality.setOverallScore(_ctx.floatValue("GetImageResponse.ImageQuality.OverallScore"));
		imageQuality.setColor(_ctx.floatValue("GetImageResponse.ImageQuality.Color"));
		imageQuality.setColorScore(_ctx.floatValue("GetImageResponse.ImageQuality.ColorScore"));
		imageQuality.setContrastScore(_ctx.floatValue("GetImageResponse.ImageQuality.ContrastScore"));
		imageQuality.setContrast(_ctx.floatValue("GetImageResponse.ImageQuality.Contrast"));
		imageQuality.setExposureScore(_ctx.floatValue("GetImageResponse.ImageQuality.ExposureScore"));
		imageQuality.setClarityScore(_ctx.floatValue("GetImageResponse.ImageQuality.ClarityScore"));
		imageQuality.setClarity(_ctx.floatValue("GetImageResponse.ImageQuality.Clarity"));
		imageQuality.setExposure(_ctx.floatValue("GetImageResponse.ImageQuality.Exposure"));
		imageQuality.setCompositionScore(_ctx.floatValue("GetImageResponse.ImageQuality.CompositionScore"));
		getImageResponse.setImageQuality(imageQuality);

		Address address = new Address();
		address.setTownship(_ctx.stringValue("GetImageResponse.Address.Township"));
		address.setDistrict(_ctx.stringValue("GetImageResponse.Address.District"));
		address.setAddressLine(_ctx.stringValue("GetImageResponse.Address.AddressLine"));
		address.setCountry(_ctx.stringValue("GetImageResponse.Address.Country"));
		address.setCity(_ctx.stringValue("GetImageResponse.Address.City"));
		address.setProvince(_ctx.stringValue("GetImageResponse.Address.Province"));
		getImageResponse.setAddress(address);

		List<TagsItem> tags = new ArrayList<TagsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetImageResponse.Tags.Length"); i++) {
			TagsItem tagsItem = new TagsItem();
			tagsItem.setTagName(_ctx.stringValue("GetImageResponse.Tags["+ i +"].TagName"));
			tagsItem.setTagConfidence(_ctx.floatValue("GetImageResponse.Tags["+ i +"].TagConfidence"));
			tagsItem.setCentricScore(_ctx.floatValue("GetImageResponse.Tags["+ i +"].CentricScore"));
			tagsItem.setTagLevel(_ctx.integerValue("GetImageResponse.Tags["+ i +"].TagLevel"));
			tagsItem.setParentTagName(_ctx.stringValue("GetImageResponse.Tags["+ i +"].ParentTagName"));

			tags.add(tagsItem);
		}
		getImageResponse.setTags(tags);

		List<FacesItem> faces = new ArrayList<FacesItem>();
		for (int i = 0; i < _ctx.lengthValue("GetImageResponse.Faces.Length"); i++) {
			FacesItem facesItem = new FacesItem();
			facesItem.setGender(_ctx.stringValue("GetImageResponse.Faces["+ i +"].Gender"));
			facesItem.setGenderConfidence(_ctx.floatValue("GetImageResponse.Faces["+ i +"].GenderConfidence"));
			facesItem.setFaceId(_ctx.stringValue("GetImageResponse.Faces["+ i +"].FaceId"));
			facesItem.setFaceQuality(_ctx.floatValue("GetImageResponse.Faces["+ i +"].FaceQuality"));
			facesItem.setEmotion(_ctx.stringValue("GetImageResponse.Faces["+ i +"].Emotion"));
			facesItem.setAge(_ctx.stringValue("GetImageResponse.Faces["+ i +"].Age"));
			facesItem.setFaceConfidence(_ctx.floatValue("GetImageResponse.Faces["+ i +"].FaceConfidence"));
			facesItem.setEmotionConfidence(_ctx.floatValue("GetImageResponse.Faces["+ i +"].EmotionConfidence"));
			facesItem.setAttractive(_ctx.floatValue("GetImageResponse.Faces["+ i +"].Attractive"));
			facesItem.setGroupId(_ctx.stringValue("GetImageResponse.Faces["+ i +"].GroupId"));

			FaceAttributes faceAttributes = new FaceAttributes();
			faceAttributes.setGlassesConfidence(_ctx.floatValue("GetImageResponse.Faces["+ i +"].FaceAttributes.GlassesConfidence"));
			faceAttributes.setGlasses(_ctx.stringValue("GetImageResponse.Faces["+ i +"].FaceAttributes.Glasses"));
			faceAttributes.setMask(_ctx.stringValue("GetImageResponse.Faces["+ i +"].FaceAttributes.Mask"));
			faceAttributes.setBeardConfidence(_ctx.floatValue("GetImageResponse.Faces["+ i +"].FaceAttributes.BeardConfidence"));
			faceAttributes.setMaskConfidence(_ctx.floatValue("GetImageResponse.Faces["+ i +"].FaceAttributes.MaskConfidence"));
			faceAttributes.setBeard(_ctx.stringValue("GetImageResponse.Faces["+ i +"].FaceAttributes.Beard"));

			FaceBoundary faceBoundary = new FaceBoundary();
			faceBoundary.setTop(_ctx.integerValue("GetImageResponse.Faces["+ i +"].FaceAttributes.FaceBoundary.Top"));
			faceBoundary.setWidth(_ctx.integerValue("GetImageResponse.Faces["+ i +"].FaceAttributes.FaceBoundary.Width"));
			faceBoundary.setHeight(_ctx.integerValue("GetImageResponse.Faces["+ i +"].FaceAttributes.FaceBoundary.Height"));
			faceBoundary.setLeft(_ctx.integerValue("GetImageResponse.Faces["+ i +"].FaceAttributes.FaceBoundary.Left"));
			faceAttributes.setFaceBoundary(faceBoundary);

			HeadPose headPose = new HeadPose();
			headPose.setPitch(_ctx.floatValue("GetImageResponse.Faces["+ i +"].FaceAttributes.HeadPose.Pitch"));
			headPose.setRoll(_ctx.floatValue("GetImageResponse.Faces["+ i +"].FaceAttributes.HeadPose.Roll"));
			headPose.setYaw(_ctx.floatValue("GetImageResponse.Faces["+ i +"].FaceAttributes.HeadPose.Yaw"));
			faceAttributes.setHeadPose(headPose);
			facesItem.setFaceAttributes(faceAttributes);

			EmotionDetails emotionDetails = new EmotionDetails();
			emotionDetails.setHAPPY(_ctx.floatValue("GetImageResponse.Faces["+ i +"].EmotionDetails.HAPPY"));
			emotionDetails.setCALM(_ctx.floatValue("GetImageResponse.Faces["+ i +"].EmotionDetails.CALM"));
			emotionDetails.setSURPRISED(_ctx.floatValue("GetImageResponse.Faces["+ i +"].EmotionDetails.SURPRISED"));
			emotionDetails.setDISGUSTED(_ctx.floatValue("GetImageResponse.Faces["+ i +"].EmotionDetails.DISGUSTED"));
			emotionDetails.setANGRY(_ctx.floatValue("GetImageResponse.Faces["+ i +"].EmotionDetails.ANGRY"));
			emotionDetails.setSAD(_ctx.floatValue("GetImageResponse.Faces["+ i +"].EmotionDetails.SAD"));
			emotionDetails.setSCARED(_ctx.floatValue("GetImageResponse.Faces["+ i +"].EmotionDetails.SCARED"));
			facesItem.setEmotionDetails(emotionDetails);

			faces.add(facesItem);
		}
		getImageResponse.setFaces(faces);

		List<CroppingSuggestionItem> croppingSuggestion = new ArrayList<CroppingSuggestionItem>();
		for (int i = 0; i < _ctx.lengthValue("GetImageResponse.CroppingSuggestion.Length"); i++) {
			CroppingSuggestionItem croppingSuggestionItem = new CroppingSuggestionItem();
			croppingSuggestionItem.setScore(_ctx.floatValue("GetImageResponse.CroppingSuggestion["+ i +"].Score"));
			croppingSuggestionItem.setAspectRatio(_ctx.stringValue("GetImageResponse.CroppingSuggestion["+ i +"].AspectRatio"));

			CroppingBoundary croppingBoundary = new CroppingBoundary();
			croppingBoundary.setTop(_ctx.integerValue("GetImageResponse.CroppingSuggestion["+ i +"].CroppingBoundary.Top"));
			croppingBoundary.setWidth(_ctx.integerValue("GetImageResponse.CroppingSuggestion["+ i +"].CroppingBoundary.Width"));
			croppingBoundary.setHeight(_ctx.integerValue("GetImageResponse.CroppingSuggestion["+ i +"].CroppingBoundary.Height"));
			croppingBoundary.setLeft(_ctx.integerValue("GetImageResponse.CroppingSuggestion["+ i +"].CroppingBoundary.Left"));
			croppingSuggestionItem.setCroppingBoundary(croppingBoundary);

			croppingSuggestion.add(croppingSuggestionItem);
		}
		getImageResponse.setCroppingSuggestion(croppingSuggestion);

		List<OCRItem> oCR = new ArrayList<OCRItem>();
		for (int i = 0; i < _ctx.lengthValue("GetImageResponse.OCR.Length"); i++) {
			OCRItem oCRItem = new OCRItem();
			oCRItem.setOCRConfidence(_ctx.floatValue("GetImageResponse.OCR["+ i +"].OCRConfidence"));
			oCRItem.setOCRContents(_ctx.stringValue("GetImageResponse.OCR["+ i +"].OCRContents"));

			OCRBoundary oCRBoundary = new OCRBoundary();
			oCRBoundary.setTop(_ctx.integerValue("GetImageResponse.OCR["+ i +"].OCRBoundary.Top"));
			oCRBoundary.setWidth(_ctx.integerValue("GetImageResponse.OCR["+ i +"].OCRBoundary.Width"));
			oCRBoundary.setHeight(_ctx.integerValue("GetImageResponse.OCR["+ i +"].OCRBoundary.Height"));
			oCRBoundary.setLeft(_ctx.integerValue("GetImageResponse.OCR["+ i +"].OCRBoundary.Left"));
			oCRItem.setOCRBoundary(oCRBoundary);

			oCR.add(oCRItem);
		}
		getImageResponse.setOCR(oCR);
	 
	 	return getImageResponse;
	}
}