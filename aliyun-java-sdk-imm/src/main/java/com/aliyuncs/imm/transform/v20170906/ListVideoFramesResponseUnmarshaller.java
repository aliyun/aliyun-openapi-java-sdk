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

import com.aliyuncs.imm.model.v20170906.ListVideoFramesResponse;
import com.aliyuncs.imm.model.v20170906.ListVideoFramesResponse.FramesItem;
import com.aliyuncs.imm.model.v20170906.ListVideoFramesResponse.FramesItem.FacesItem;
import com.aliyuncs.imm.model.v20170906.ListVideoFramesResponse.FramesItem.FacesItem.EmotionDetails;
import com.aliyuncs.imm.model.v20170906.ListVideoFramesResponse.FramesItem.FacesItem.FaceAttributes;
import com.aliyuncs.imm.model.v20170906.ListVideoFramesResponse.FramesItem.FacesItem.FaceAttributes.FaceBoundary;
import com.aliyuncs.imm.model.v20170906.ListVideoFramesResponse.FramesItem.FacesItem.FaceAttributes.HeadPose;
import com.aliyuncs.imm.model.v20170906.ListVideoFramesResponse.FramesItem.OCRItem;
import com.aliyuncs.imm.model.v20170906.ListVideoFramesResponse.FramesItem.OCRItem.OCRBoundary;
import com.aliyuncs.imm.model.v20170906.ListVideoFramesResponse.FramesItem.TagsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListVideoFramesResponseUnmarshaller {

	public static ListVideoFramesResponse unmarshall(ListVideoFramesResponse listVideoFramesResponse, UnmarshallerContext _ctx) {
		
		listVideoFramesResponse.setRequestId(_ctx.stringValue("ListVideoFramesResponse.RequestId"));
		listVideoFramesResponse.setVideoUri(_ctx.stringValue("ListVideoFramesResponse.VideoUri"));
		listVideoFramesResponse.setNextMarker(_ctx.stringValue("ListVideoFramesResponse.NextMarker"));
		listVideoFramesResponse.setSetId(_ctx.stringValue("ListVideoFramesResponse.SetId"));

		List<FramesItem> frames = new ArrayList<FramesItem>();
		for (int i = 0; i < _ctx.lengthValue("ListVideoFramesResponse.Frames.Length"); i++) {
			FramesItem framesItem = new FramesItem();
			framesItem.setTagsFailReason(_ctx.stringValue("ListVideoFramesResponse.Frames["+ i +"].TagsFailReason"));
			framesItem.setRemarksC(_ctx.stringValue("ListVideoFramesResponse.Frames["+ i +"].RemarksC"));
			framesItem.setCreateTime(_ctx.stringValue("ListVideoFramesResponse.Frames["+ i +"].CreateTime"));
			framesItem.setSourceType(_ctx.stringValue("ListVideoFramesResponse.Frames["+ i +"].SourceType"));
			framesItem.setFacesFailReason(_ctx.stringValue("ListVideoFramesResponse.Frames["+ i +"].FacesFailReason"));
			framesItem.setFacesModifyTime(_ctx.stringValue("ListVideoFramesResponse.Frames["+ i +"].FacesModifyTime"));
			framesItem.setImageTime(_ctx.stringValue("ListVideoFramesResponse.Frames["+ i +"].ImageTime"));
			framesItem.setOCRModifyTime(_ctx.stringValue("ListVideoFramesResponse.Frames["+ i +"].OCRModifyTime"));
			framesItem.setFacesStatus(_ctx.stringValue("ListVideoFramesResponse.Frames["+ i +"].FacesStatus"));
			framesItem.setImageHeight(_ctx.integerValue("ListVideoFramesResponse.Frames["+ i +"].ImageHeight"));
			framesItem.setExternalId(_ctx.stringValue("ListVideoFramesResponse.Frames["+ i +"].ExternalId"));
			framesItem.setSourceUri(_ctx.stringValue("ListVideoFramesResponse.Frames["+ i +"].SourceUri"));
			framesItem.setFileSize(_ctx.integerValue("ListVideoFramesResponse.Frames["+ i +"].FileSize"));
			framesItem.setModifyTime(_ctx.stringValue("ListVideoFramesResponse.Frames["+ i +"].ModifyTime"));
			framesItem.setSourcePosition(_ctx.stringValue("ListVideoFramesResponse.Frames["+ i +"].SourcePosition"));
			framesItem.setOCRFailReason(_ctx.stringValue("ListVideoFramesResponse.Frames["+ i +"].OCRFailReason"));
			framesItem.setImageFormat(_ctx.stringValue("ListVideoFramesResponse.Frames["+ i +"].ImageFormat"));
			framesItem.setImageWidth(_ctx.integerValue("ListVideoFramesResponse.Frames["+ i +"].ImageWidth"));
			framesItem.setOrientation(_ctx.stringValue("ListVideoFramesResponse.Frames["+ i +"].Orientation"));
			framesItem.setRemarksD(_ctx.stringValue("ListVideoFramesResponse.Frames["+ i +"].RemarksD"));
			framesItem.setTagsStatus(_ctx.stringValue("ListVideoFramesResponse.Frames["+ i +"].TagsStatus"));
			framesItem.setRemarksA(_ctx.stringValue("ListVideoFramesResponse.Frames["+ i +"].RemarksA"));
			framesItem.setImageUri(_ctx.stringValue("ListVideoFramesResponse.Frames["+ i +"].ImageUri"));
			framesItem.setTagsModifyTime(_ctx.stringValue("ListVideoFramesResponse.Frames["+ i +"].TagsModifyTime"));
			framesItem.setOCRStatus(_ctx.stringValue("ListVideoFramesResponse.Frames["+ i +"].OCRStatus"));
			framesItem.setExif(_ctx.stringValue("ListVideoFramesResponse.Frames["+ i +"].Exif"));
			framesItem.setLocation(_ctx.stringValue("ListVideoFramesResponse.Frames["+ i +"].Location"));
			framesItem.setRemarksB(_ctx.stringValue("ListVideoFramesResponse.Frames["+ i +"].RemarksB"));

			List<TagsItem> tags = new ArrayList<TagsItem>();
			for (int j = 0; j < _ctx.lengthValue("ListVideoFramesResponse.Frames["+ i +"].Tags.Length"); j++) {
				TagsItem tagsItem = new TagsItem();
				tagsItem.setTagConfidence(_ctx.floatValue("ListVideoFramesResponse.Frames["+ i +"].Tags["+ j +"].TagConfidence"));
				tagsItem.setTagName(_ctx.stringValue("ListVideoFramesResponse.Frames["+ i +"].Tags["+ j +"].TagName"));
				tagsItem.setTagLevel(_ctx.integerValue("ListVideoFramesResponse.Frames["+ i +"].Tags["+ j +"].TagLevel"));
				tagsItem.setParentTagName(_ctx.stringValue("ListVideoFramesResponse.Frames["+ i +"].Tags["+ j +"].ParentTagName"));

				tags.add(tagsItem);
			}
			framesItem.setTags(tags);

			List<OCRItem> oCR = new ArrayList<OCRItem>();
			for (int j = 0; j < _ctx.lengthValue("ListVideoFramesResponse.Frames["+ i +"].OCR.Length"); j++) {
				OCRItem oCRItem = new OCRItem();
				oCRItem.setOCRConfidence(_ctx.floatValue("ListVideoFramesResponse.Frames["+ i +"].OCR["+ j +"].OCRConfidence"));
				oCRItem.setOCRContents(_ctx.stringValue("ListVideoFramesResponse.Frames["+ i +"].OCR["+ j +"].OCRContents"));

				OCRBoundary oCRBoundary = new OCRBoundary();
				oCRBoundary.setTop(_ctx.integerValue("ListVideoFramesResponse.Frames["+ i +"].OCR["+ j +"].OCRBoundary.Top"));
				oCRBoundary.setWidth(_ctx.integerValue("ListVideoFramesResponse.Frames["+ i +"].OCR["+ j +"].OCRBoundary.Width"));
				oCRBoundary.setHeight(_ctx.integerValue("ListVideoFramesResponse.Frames["+ i +"].OCR["+ j +"].OCRBoundary.Height"));
				oCRBoundary.setLeft(_ctx.integerValue("ListVideoFramesResponse.Frames["+ i +"].OCR["+ j +"].OCRBoundary.Left"));
				oCRItem.setOCRBoundary(oCRBoundary);

				oCR.add(oCRItem);
			}
			framesItem.setOCR(oCR);

			List<FacesItem> faces = new ArrayList<FacesItem>();
			for (int j = 0; j < _ctx.lengthValue("ListVideoFramesResponse.Frames["+ i +"].Faces.Length"); j++) {
				FacesItem facesItem = new FacesItem();
				facesItem.setGender(_ctx.stringValue("ListVideoFramesResponse.Frames["+ i +"].Faces["+ j +"].Gender"));
				facesItem.setFaceId(_ctx.stringValue("ListVideoFramesResponse.Frames["+ i +"].Faces["+ j +"].FaceId"));
				facesItem.setGenderConfidence(_ctx.floatValue("ListVideoFramesResponse.Frames["+ i +"].Faces["+ j +"].GenderConfidence"));
				facesItem.setFaceQuality(_ctx.floatValue("ListVideoFramesResponse.Frames["+ i +"].Faces["+ j +"].FaceQuality"));
				facesItem.setEmotion(_ctx.stringValue("ListVideoFramesResponse.Frames["+ i +"].Faces["+ j +"].Emotion"));
				facesItem.setAge(_ctx.integerValue("ListVideoFramesResponse.Frames["+ i +"].Faces["+ j +"].Age"));
				facesItem.setFaceConfidence(_ctx.floatValue("ListVideoFramesResponse.Frames["+ i +"].Faces["+ j +"].FaceConfidence"));
				facesItem.setEmotionConfidence(_ctx.floatValue("ListVideoFramesResponse.Frames["+ i +"].Faces["+ j +"].EmotionConfidence"));
				facesItem.setAttractive(_ctx.floatValue("ListVideoFramesResponse.Frames["+ i +"].Faces["+ j +"].Attractive"));
				facesItem.setGroupId(_ctx.stringValue("ListVideoFramesResponse.Frames["+ i +"].Faces["+ j +"].GroupId"));

				FaceAttributes faceAttributes = new FaceAttributes();
				faceAttributes.setGlassesConfidence(_ctx.floatValue("ListVideoFramesResponse.Frames["+ i +"].Faces["+ j +"].FaceAttributes.GlassesConfidence"));
				faceAttributes.setGlasses(_ctx.stringValue("ListVideoFramesResponse.Frames["+ i +"].Faces["+ j +"].FaceAttributes.Glasses"));
				faceAttributes.setMask(_ctx.stringValue("ListVideoFramesResponse.Frames["+ i +"].Faces["+ j +"].FaceAttributes.Mask"));
				faceAttributes.setBeardConfidence(_ctx.floatValue("ListVideoFramesResponse.Frames["+ i +"].Faces["+ j +"].FaceAttributes.BeardConfidence"));
				faceAttributes.setMaskConfidence(_ctx.floatValue("ListVideoFramesResponse.Frames["+ i +"].Faces["+ j +"].FaceAttributes.MaskConfidence"));
				faceAttributes.setBeard(_ctx.stringValue("ListVideoFramesResponse.Frames["+ i +"].Faces["+ j +"].FaceAttributes.Beard"));

				FaceBoundary faceBoundary = new FaceBoundary();
				faceBoundary.setTop(_ctx.integerValue("ListVideoFramesResponse.Frames["+ i +"].Faces["+ j +"].FaceAttributes.FaceBoundary.Top"));
				faceBoundary.setWidth(_ctx.integerValue("ListVideoFramesResponse.Frames["+ i +"].Faces["+ j +"].FaceAttributes.FaceBoundary.Width"));
				faceBoundary.setHeight(_ctx.integerValue("ListVideoFramesResponse.Frames["+ i +"].Faces["+ j +"].FaceAttributes.FaceBoundary.Height"));
				faceBoundary.setLeft(_ctx.integerValue("ListVideoFramesResponse.Frames["+ i +"].Faces["+ j +"].FaceAttributes.FaceBoundary.Left"));
				faceAttributes.setFaceBoundary(faceBoundary);

				HeadPose headPose = new HeadPose();
				headPose.setPitch(_ctx.floatValue("ListVideoFramesResponse.Frames["+ i +"].Faces["+ j +"].FaceAttributes.HeadPose.Pitch"));
				headPose.setRoll(_ctx.floatValue("ListVideoFramesResponse.Frames["+ i +"].Faces["+ j +"].FaceAttributes.HeadPose.Roll"));
				headPose.setYaw(_ctx.floatValue("ListVideoFramesResponse.Frames["+ i +"].Faces["+ j +"].FaceAttributes.HeadPose.Yaw"));
				faceAttributes.setHeadPose(headPose);
				facesItem.setFaceAttributes(faceAttributes);

				EmotionDetails emotionDetails = new EmotionDetails();
				emotionDetails.setHAPPY(_ctx.floatValue("ListVideoFramesResponse.Frames["+ i +"].Faces["+ j +"].EmotionDetails.HAPPY"));
				emotionDetails.setSURPRISED(_ctx.floatValue("ListVideoFramesResponse.Frames["+ i +"].Faces["+ j +"].EmotionDetails.SURPRISED"));
				emotionDetails.setCALM(_ctx.floatValue("ListVideoFramesResponse.Frames["+ i +"].Faces["+ j +"].EmotionDetails.CALM"));
				emotionDetails.setDISGUSTED(_ctx.floatValue("ListVideoFramesResponse.Frames["+ i +"].Faces["+ j +"].EmotionDetails.DISGUSTED"));
				emotionDetails.setANGRY(_ctx.floatValue("ListVideoFramesResponse.Frames["+ i +"].Faces["+ j +"].EmotionDetails.ANGRY"));
				emotionDetails.setSAD(_ctx.floatValue("ListVideoFramesResponse.Frames["+ i +"].Faces["+ j +"].EmotionDetails.SAD"));
				emotionDetails.setSCARED(_ctx.floatValue("ListVideoFramesResponse.Frames["+ i +"].Faces["+ j +"].EmotionDetails.SCARED"));
				facesItem.setEmotionDetails(emotionDetails);

				faces.add(facesItem);
			}
			framesItem.setFaces(faces);

			frames.add(framesItem);
		}
		listVideoFramesResponse.setFrames(frames);
	 
	 	return listVideoFramesResponse;
	}
}