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

import com.aliyuncs.imm.model.v20170906.FindImagesByTagNamesResponse;
import com.aliyuncs.imm.model.v20170906.FindImagesByTagNamesResponse.Frames;
import com.aliyuncs.imm.model.v20170906.FindImagesByTagNamesResponse.Frames.Address;
import com.aliyuncs.imm.model.v20170906.FindImagesByTagNamesResponse.Frames.CelebrityItem;
import com.aliyuncs.imm.model.v20170906.FindImagesByTagNamesResponse.Frames.CelebrityItem.CelebrityBoundary;
import com.aliyuncs.imm.model.v20170906.FindImagesByTagNamesResponse.Frames.FacesItem;
import com.aliyuncs.imm.model.v20170906.FindImagesByTagNamesResponse.Frames.FacesItem.EmotionDetails;
import com.aliyuncs.imm.model.v20170906.FindImagesByTagNamesResponse.Frames.FacesItem.FaceAttributes;
import com.aliyuncs.imm.model.v20170906.FindImagesByTagNamesResponse.Frames.FacesItem.FaceAttributes.FaceBoundary;
import com.aliyuncs.imm.model.v20170906.FindImagesByTagNamesResponse.Frames.FacesItem.FaceAttributes.HeadPose;
import com.aliyuncs.imm.model.v20170906.FindImagesByTagNamesResponse.Frames.OCRItem;
import com.aliyuncs.imm.model.v20170906.FindImagesByTagNamesResponse.Frames.OCRItem.OCRBoundary;
import com.aliyuncs.imm.model.v20170906.FindImagesByTagNamesResponse.Frames.TagsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class FindImagesByTagNamesResponseUnmarshaller {

	public static FindImagesByTagNamesResponse unmarshall(FindImagesByTagNamesResponse findImagesByTagNamesResponse, UnmarshallerContext _ctx) {
		
		findImagesByTagNamesResponse.setRequestId(_ctx.stringValue("FindImagesByTagNamesResponse.RequestId"));
		findImagesByTagNamesResponse.setSetId(_ctx.stringValue("FindImagesByTagNamesResponse.SetId"));
		findImagesByTagNamesResponse.setNextMarker(_ctx.stringValue("FindImagesByTagNamesResponse.NextMarker"));

		List<Frames> images = new ArrayList<Frames>();
		for (int i = 0; i < _ctx.lengthValue("FindImagesByTagNamesResponse.Images.Length"); i++) {
			Frames frames = new Frames();
			frames.setFacesModifyTime(_ctx.stringValue("FindImagesByTagNamesResponse.Images["+ i +"].FacesModifyTime"));
			frames.setOCRModifyTime(_ctx.stringValue("FindImagesByTagNamesResponse.Images["+ i +"].OCRModifyTime"));
			frames.setOCRStatus(_ctx.stringValue("FindImagesByTagNamesResponse.Images["+ i +"].OCRStatus"));
			frames.setSourcePosition(_ctx.stringValue("FindImagesByTagNamesResponse.Images["+ i +"].SourcePosition"));
			frames.setExif(_ctx.stringValue("FindImagesByTagNamesResponse.Images["+ i +"].Exif"));
			frames.setImageUri(_ctx.stringValue("FindImagesByTagNamesResponse.Images["+ i +"].ImageUri"));
			frames.setImageWidth(_ctx.integerValue("FindImagesByTagNamesResponse.Images["+ i +"].ImageWidth"));
			frames.setImageFormat(_ctx.stringValue("FindImagesByTagNamesResponse.Images["+ i +"].ImageFormat"));
			frames.setSourceType(_ctx.stringValue("FindImagesByTagNamesResponse.Images["+ i +"].SourceType"));
			frames.setModifyTime(_ctx.stringValue("FindImagesByTagNamesResponse.Images["+ i +"].ModifyTime"));
			frames.setFileSize(_ctx.integerValue("FindImagesByTagNamesResponse.Images["+ i +"].FileSize"));
			frames.setSourceUri(_ctx.stringValue("FindImagesByTagNamesResponse.Images["+ i +"].SourceUri"));
			frames.setCreateTime(_ctx.stringValue("FindImagesByTagNamesResponse.Images["+ i +"].CreateTime"));
			frames.setFacesStatus(_ctx.stringValue("FindImagesByTagNamesResponse.Images["+ i +"].FacesStatus"));
			frames.setRemarksA(_ctx.stringValue("FindImagesByTagNamesResponse.Images["+ i +"].RemarksA"));
			frames.setImageHeight(_ctx.integerValue("FindImagesByTagNamesResponse.Images["+ i +"].ImageHeight"));
			frames.setRemarksB(_ctx.stringValue("FindImagesByTagNamesResponse.Images["+ i +"].RemarksB"));
			frames.setImageTime(_ctx.stringValue("FindImagesByTagNamesResponse.Images["+ i +"].ImageTime"));
			frames.setOrientation(_ctx.stringValue("FindImagesByTagNamesResponse.Images["+ i +"].Orientation"));
			frames.setLocation(_ctx.stringValue("FindImagesByTagNamesResponse.Images["+ i +"].Location"));
			frames.setOCRFailReason(_ctx.stringValue("FindImagesByTagNamesResponse.Images["+ i +"].OCRFailReason"));
			frames.setFacesFailReason(_ctx.stringValue("FindImagesByTagNamesResponse.Images["+ i +"].FacesFailReason"));
			frames.setTagsFailReason(_ctx.stringValue("FindImagesByTagNamesResponse.Images["+ i +"].TagsFailReason"));
			frames.setTagsModifyTime(_ctx.stringValue("FindImagesByTagNamesResponse.Images["+ i +"].TagsModifyTime"));
			frames.setCelebrityStatus(_ctx.stringValue("FindImagesByTagNamesResponse.Images["+ i +"].CelebrityStatus"));
			frames.setCelebrityModifyTime(_ctx.stringValue("FindImagesByTagNamesResponse.Images["+ i +"].CelebrityModifyTime"));
			frames.setCelebrityFailReason(_ctx.stringValue("FindImagesByTagNamesResponse.Images["+ i +"].CelebrityFailReason"));
			frames.setTagsStatus(_ctx.stringValue("FindImagesByTagNamesResponse.Images["+ i +"].TagsStatus"));
			frames.setExternalId(_ctx.stringValue("FindImagesByTagNamesResponse.Images["+ i +"].ExternalId"));
			frames.setRemarksC(_ctx.stringValue("FindImagesByTagNamesResponse.Images["+ i +"].RemarksC"));
			frames.setRemarksD(_ctx.stringValue("FindImagesByTagNamesResponse.Images["+ i +"].RemarksD"));
			frames.setAddressModifyTime(_ctx.stringValue("FindImagesByTagNamesResponse.Images["+ i +"].AddressModifyTime"));
			frames.setAddressStatus(_ctx.stringValue("FindImagesByTagNamesResponse.Images["+ i +"].AddressStatus"));
			frames.setAddressFailReason(_ctx.stringValue("FindImagesByTagNamesResponse.Images["+ i +"].AddressFailReason"));

			Address address = new Address();
			address.setAddressLine(_ctx.stringValue("FindImagesByTagNamesResponse.Images["+ i +"].Address.AddressLine"));
			address.setCountry(_ctx.stringValue("FindImagesByTagNamesResponse.Images["+ i +"].Address.Country"));
			address.setProvince(_ctx.stringValue("FindImagesByTagNamesResponse.Images["+ i +"].Address.Province"));
			address.setCity(_ctx.stringValue("FindImagesByTagNamesResponse.Images["+ i +"].Address.City"));
			address.setDistrict(_ctx.stringValue("FindImagesByTagNamesResponse.Images["+ i +"].Address.District"));
			address.setTownship(_ctx.stringValue("FindImagesByTagNamesResponse.Images["+ i +"].Address.Township"));
			frames.setAddress(address);

			List<FacesItem> faces = new ArrayList<FacesItem>();
			for (int j = 0; j < _ctx.lengthValue("FindImagesByTagNamesResponse.Images["+ i +"].Faces.Length"); j++) {
				FacesItem facesItem = new FacesItem();
				facesItem.setAge(_ctx.integerValue("FindImagesByTagNamesResponse.Images["+ i +"].Faces["+ j +"].Age"));
				facesItem.setGenderConfidence(_ctx.floatValue("FindImagesByTagNamesResponse.Images["+ i +"].Faces["+ j +"].GenderConfidence"));
				facesItem.setAttractive(_ctx.floatValue("FindImagesByTagNamesResponse.Images["+ i +"].Faces["+ j +"].Attractive"));
				facesItem.setGender(_ctx.stringValue("FindImagesByTagNamesResponse.Images["+ i +"].Faces["+ j +"].Gender"));
				facesItem.setFaceConfidence(_ctx.floatValue("FindImagesByTagNamesResponse.Images["+ i +"].Faces["+ j +"].FaceConfidence"));
				facesItem.setEmotion(_ctx.stringValue("FindImagesByTagNamesResponse.Images["+ i +"].Faces["+ j +"].Emotion"));
				facesItem.setFaceId(_ctx.stringValue("FindImagesByTagNamesResponse.Images["+ i +"].Faces["+ j +"].FaceId"));
				facesItem.setEmotionConfidence(_ctx.floatValue("FindImagesByTagNamesResponse.Images["+ i +"].Faces["+ j +"].EmotionConfidence"));
				facesItem.setGroupId(_ctx.stringValue("FindImagesByTagNamesResponse.Images["+ i +"].Faces["+ j +"].GroupId"));
				facesItem.setFaceQuality(_ctx.floatValue("FindImagesByTagNamesResponse.Images["+ i +"].Faces["+ j +"].FaceQuality"));

				EmotionDetails emotionDetails = new EmotionDetails();
				emotionDetails.setSAD(_ctx.floatValue("FindImagesByTagNamesResponse.Images["+ i +"].Faces["+ j +"].EmotionDetails.SAD"));
				emotionDetails.setCALM(_ctx.floatValue("FindImagesByTagNamesResponse.Images["+ i +"].Faces["+ j +"].EmotionDetails.CALM"));
				emotionDetails.setANGRY(_ctx.floatValue("FindImagesByTagNamesResponse.Images["+ i +"].Faces["+ j +"].EmotionDetails.ANGRY"));
				emotionDetails.setHAPPY(_ctx.floatValue("FindImagesByTagNamesResponse.Images["+ i +"].Faces["+ j +"].EmotionDetails.HAPPY"));
				emotionDetails.setSCARED(_ctx.floatValue("FindImagesByTagNamesResponse.Images["+ i +"].Faces["+ j +"].EmotionDetails.SCARED"));
				emotionDetails.setDISGUSTED(_ctx.floatValue("FindImagesByTagNamesResponse.Images["+ i +"].Faces["+ j +"].EmotionDetails.DISGUSTED"));
				emotionDetails.setSURPRISED(_ctx.floatValue("FindImagesByTagNamesResponse.Images["+ i +"].Faces["+ j +"].EmotionDetails.SURPRISED"));
				facesItem.setEmotionDetails(emotionDetails);

				FaceAttributes faceAttributes = new FaceAttributes();
				faceAttributes.setGlassesConfidence(_ctx.floatValue("FindImagesByTagNamesResponse.Images["+ i +"].Faces["+ j +"].FaceAttributes.GlassesConfidence"));
				faceAttributes.setGlasses(_ctx.stringValue("FindImagesByTagNamesResponse.Images["+ i +"].Faces["+ j +"].FaceAttributes.Glasses"));
				faceAttributes.setRaceConfidence(_ctx.floatValue("FindImagesByTagNamesResponse.Images["+ i +"].Faces["+ j +"].FaceAttributes.RaceConfidence"));
				faceAttributes.setBeard(_ctx.stringValue("FindImagesByTagNamesResponse.Images["+ i +"].Faces["+ j +"].FaceAttributes.Beard"));
				faceAttributes.setMaskConfidence(_ctx.floatValue("FindImagesByTagNamesResponse.Images["+ i +"].Faces["+ j +"].FaceAttributes.MaskConfidence"));
				faceAttributes.setRace(_ctx.stringValue("FindImagesByTagNamesResponse.Images["+ i +"].Faces["+ j +"].FaceAttributes.Race"));
				faceAttributes.setBeardConfidence(_ctx.floatValue("FindImagesByTagNamesResponse.Images["+ i +"].Faces["+ j +"].FaceAttributes.BeardConfidence"));
				faceAttributes.setMask(_ctx.stringValue("FindImagesByTagNamesResponse.Images["+ i +"].Faces["+ j +"].FaceAttributes.Mask"));

				FaceBoundary faceBoundary = new FaceBoundary();
				faceBoundary.setTop(_ctx.integerValue("FindImagesByTagNamesResponse.Images["+ i +"].Faces["+ j +"].FaceAttributes.FaceBoundary.Top"));
				faceBoundary.setHeight(_ctx.integerValue("FindImagesByTagNamesResponse.Images["+ i +"].Faces["+ j +"].FaceAttributes.FaceBoundary.Height"));
				faceBoundary.setWidth(_ctx.integerValue("FindImagesByTagNamesResponse.Images["+ i +"].Faces["+ j +"].FaceAttributes.FaceBoundary.Width"));
				faceBoundary.setLeft(_ctx.integerValue("FindImagesByTagNamesResponse.Images["+ i +"].Faces["+ j +"].FaceAttributes.FaceBoundary.Left"));
				faceAttributes.setFaceBoundary(faceBoundary);

				HeadPose headPose = new HeadPose();
				headPose.setPitch(_ctx.floatValue("FindImagesByTagNamesResponse.Images["+ i +"].Faces["+ j +"].FaceAttributes.HeadPose.Pitch"));
				headPose.setRoll(_ctx.floatValue("FindImagesByTagNamesResponse.Images["+ i +"].Faces["+ j +"].FaceAttributes.HeadPose.Roll"));
				headPose.setYaw(_ctx.floatValue("FindImagesByTagNamesResponse.Images["+ i +"].Faces["+ j +"].FaceAttributes.HeadPose.Yaw"));
				faceAttributes.setHeadPose(headPose);
				facesItem.setFaceAttributes(faceAttributes);

				faces.add(facesItem);
			}
			frames.setFaces(faces);

			List<TagsItem> tags = new ArrayList<TagsItem>();
			for (int j = 0; j < _ctx.lengthValue("FindImagesByTagNamesResponse.Images["+ i +"].Tags.Length"); j++) {
				TagsItem tagsItem = new TagsItem();
				tagsItem.setTagConfidence(_ctx.floatValue("FindImagesByTagNamesResponse.Images["+ i +"].Tags["+ j +"].TagConfidence"));
				tagsItem.setTagLevel(_ctx.integerValue("FindImagesByTagNamesResponse.Images["+ i +"].Tags["+ j +"].TagLevel"));
				tagsItem.setTagName(_ctx.stringValue("FindImagesByTagNamesResponse.Images["+ i +"].Tags["+ j +"].TagName"));
				tagsItem.setParentTagName(_ctx.stringValue("FindImagesByTagNamesResponse.Images["+ i +"].Tags["+ j +"].ParentTagName"));

				tags.add(tagsItem);
			}
			frames.setTags(tags);

			List<OCRItem> oCR = new ArrayList<OCRItem>();
			for (int j = 0; j < _ctx.lengthValue("FindImagesByTagNamesResponse.Images["+ i +"].OCR.Length"); j++) {
				OCRItem oCRItem = new OCRItem();
				oCRItem.setOCRContents(_ctx.stringValue("FindImagesByTagNamesResponse.Images["+ i +"].OCR["+ j +"].OCRContents"));
				oCRItem.setOCRConfidence(_ctx.floatValue("FindImagesByTagNamesResponse.Images["+ i +"].OCR["+ j +"].OCRConfidence"));

				OCRBoundary oCRBoundary = new OCRBoundary();
				oCRBoundary.setLeft(_ctx.integerValue("FindImagesByTagNamesResponse.Images["+ i +"].OCR["+ j +"].OCRBoundary.Left"));
				oCRBoundary.setLeft1(_ctx.integerValue("FindImagesByTagNamesResponse.Images["+ i +"].OCR["+ j +"].OCRBoundary.Left"));
				oCRBoundary.setWidth(_ctx.integerValue("FindImagesByTagNamesResponse.Images["+ i +"].OCR["+ j +"].OCRBoundary.Width"));
				oCRBoundary.setHeight(_ctx.integerValue("FindImagesByTagNamesResponse.Images["+ i +"].OCR["+ j +"].OCRBoundary.Height"));
				oCRItem.setOCRBoundary(oCRBoundary);

				oCR.add(oCRItem);
			}
			frames.setOCR(oCR);

			List<CelebrityItem> celebrity = new ArrayList<CelebrityItem>();
			for (int j = 0; j < _ctx.lengthValue("FindImagesByTagNamesResponse.Images["+ i +"].Celebrity.Length"); j++) {
				CelebrityItem celebrityItem = new CelebrityItem();
				celebrityItem.setCelebrityName(_ctx.stringValue("FindImagesByTagNamesResponse.Images["+ i +"].Celebrity["+ j +"].CelebrityName"));
				celebrityItem.setCelebrityGender(_ctx.stringValue("FindImagesByTagNamesResponse.Images["+ i +"].Celebrity["+ j +"].CelebrityGender"));
				celebrityItem.setCelebrityConfidence(_ctx.floatValue("FindImagesByTagNamesResponse.Images["+ i +"].Celebrity["+ j +"].CelebrityConfidence"));
				celebrityItem.setCelebrityLibraryName(_ctx.stringValue("FindImagesByTagNamesResponse.Images["+ i +"].Celebrity["+ j +"].CelebrityLibraryName"));

				CelebrityBoundary celebrityBoundary = new CelebrityBoundary();
				celebrityBoundary.setLeft(_ctx.integerValue("FindImagesByTagNamesResponse.Images["+ i +"].Celebrity["+ j +"].CelebrityBoundary.Left"));
				celebrityBoundary.setTop(_ctx.integerValue("FindImagesByTagNamesResponse.Images["+ i +"].Celebrity["+ j +"].CelebrityBoundary.Top"));
				celebrityBoundary.setWidth(_ctx.integerValue("FindImagesByTagNamesResponse.Images["+ i +"].Celebrity["+ j +"].CelebrityBoundary.Width"));
				celebrityBoundary.setHeight(_ctx.integerValue("FindImagesByTagNamesResponse.Images["+ i +"].Celebrity["+ j +"].CelebrityBoundary.Height"));
				celebrityItem.setCelebrityBoundary(celebrityBoundary);

				celebrity.add(celebrityItem);
			}
			frames.setCelebrity(celebrity);

			images.add(frames);
		}
		findImagesByTagNamesResponse.setImages(images);
	 
	 	return findImagesByTagNamesResponse;
	}
}