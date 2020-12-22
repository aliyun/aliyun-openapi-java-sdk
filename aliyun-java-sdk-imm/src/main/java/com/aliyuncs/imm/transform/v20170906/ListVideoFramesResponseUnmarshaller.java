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
		listVideoFramesResponse.setSetId(_ctx.stringValue("ListVideoFramesResponse.SetId"));
		listVideoFramesResponse.setVideoUri(_ctx.stringValue("ListVideoFramesResponse.VideoUri"));
		listVideoFramesResponse.setNextMarker(_ctx.stringValue("ListVideoFramesResponse.NextMarker"));

		List<FramesItem> frames = new ArrayList<FramesItem>();
		for (int i = 0; i < _ctx.lengthValue("ListVideoFramesResponse.Frames.Length"); i++) {
			FramesItem framesItem = new FramesItem();
			framesItem.setFacesModifyTime(_ctx.stringValue("ListVideoFramesResponse.Frames["+ i +"].FacesModifyTime"));
			framesItem.setOCRModifyTime(_ctx.stringValue("ListVideoFramesResponse.Frames["+ i +"].OCRModifyTime"));
			framesItem.setOCRStatus(_ctx.stringValue("ListVideoFramesResponse.Frames["+ i +"].OCRStatus"));
			framesItem.setSourcePosition(_ctx.stringValue("ListVideoFramesResponse.Frames["+ i +"].SourcePosition"));
			framesItem.setExif(_ctx.stringValue("ListVideoFramesResponse.Frames["+ i +"].Exif"));
			framesItem.setImageUri(_ctx.stringValue("ListVideoFramesResponse.Frames["+ i +"].ImageUri"));
			framesItem.setImageWidth(_ctx.integerValue("ListVideoFramesResponse.Frames["+ i +"].ImageWidth"));
			framesItem.setImageFormat(_ctx.stringValue("ListVideoFramesResponse.Frames["+ i +"].ImageFormat"));
			framesItem.setSourceType(_ctx.stringValue("ListVideoFramesResponse.Frames["+ i +"].SourceType"));
			framesItem.setModifyTime(_ctx.stringValue("ListVideoFramesResponse.Frames["+ i +"].ModifyTime"));
			framesItem.setFileSize(_ctx.integerValue("ListVideoFramesResponse.Frames["+ i +"].FileSize"));
			framesItem.setSourceUri(_ctx.stringValue("ListVideoFramesResponse.Frames["+ i +"].SourceUri"));
			framesItem.setCreateTime(_ctx.stringValue("ListVideoFramesResponse.Frames["+ i +"].CreateTime"));
			framesItem.setFacesStatus(_ctx.stringValue("ListVideoFramesResponse.Frames["+ i +"].FacesStatus"));
			framesItem.setRemarksA(_ctx.stringValue("ListVideoFramesResponse.Frames["+ i +"].RemarksA"));
			framesItem.setImageHeight(_ctx.integerValue("ListVideoFramesResponse.Frames["+ i +"].ImageHeight"));
			framesItem.setRemarksB(_ctx.stringValue("ListVideoFramesResponse.Frames["+ i +"].RemarksB"));
			framesItem.setImageTime(_ctx.stringValue("ListVideoFramesResponse.Frames["+ i +"].ImageTime"));
			framesItem.setOrientation(_ctx.stringValue("ListVideoFramesResponse.Frames["+ i +"].Orientation"));
			framesItem.setLocation(_ctx.stringValue("ListVideoFramesResponse.Frames["+ i +"].Location"));
			framesItem.setOCRFailReason(_ctx.stringValue("ListVideoFramesResponse.Frames["+ i +"].OCRFailReason"));
			framesItem.setFacesFailReason(_ctx.stringValue("ListVideoFramesResponse.Frames["+ i +"].FacesFailReason"));
			framesItem.setTagsFailReason(_ctx.stringValue("ListVideoFramesResponse.Frames["+ i +"].TagsFailReason"));
			framesItem.setTagsModifyTime(_ctx.stringValue("ListVideoFramesResponse.Frames["+ i +"].TagsModifyTime"));
			framesItem.setTagsStatus(_ctx.stringValue("ListVideoFramesResponse.Frames["+ i +"].TagsStatus"));
			framesItem.setRemarksC(_ctx.stringValue("ListVideoFramesResponse.Frames["+ i +"].RemarksC"));
			framesItem.setRemarksD(_ctx.stringValue("ListVideoFramesResponse.Frames["+ i +"].RemarksD"));
			framesItem.setExternalId(_ctx.stringValue("ListVideoFramesResponse.Frames["+ i +"].ExternalId"));

			List<FacesItem> faces = new ArrayList<FacesItem>();
			for (int j = 0; j < _ctx.lengthValue("ListVideoFramesResponse.Frames["+ i +"].Faces.Length"); j++) {
				FacesItem facesItem = new FacesItem();
				facesItem.setAge(_ctx.integerValue("ListVideoFramesResponse.Frames["+ i +"].Faces["+ j +"].Age"));
				facesItem.setGenderConfidence(_ctx.floatValue("ListVideoFramesResponse.Frames["+ i +"].Faces["+ j +"].GenderConfidence"));
				facesItem.setAttractive(_ctx.floatValue("ListVideoFramesResponse.Frames["+ i +"].Faces["+ j +"].Attractive"));
				facesItem.setGender(_ctx.stringValue("ListVideoFramesResponse.Frames["+ i +"].Faces["+ j +"].Gender"));
				facesItem.setFaceConfidence(_ctx.floatValue("ListVideoFramesResponse.Frames["+ i +"].Faces["+ j +"].FaceConfidence"));
				facesItem.setEmotion(_ctx.stringValue("ListVideoFramesResponse.Frames["+ i +"].Faces["+ j +"].Emotion"));
				facesItem.setFaceId(_ctx.stringValue("ListVideoFramesResponse.Frames["+ i +"].Faces["+ j +"].FaceId"));
				facesItem.setEmotionConfidence(_ctx.floatValue("ListVideoFramesResponse.Frames["+ i +"].Faces["+ j +"].EmotionConfidence"));
				facesItem.setGroupId(_ctx.stringValue("ListVideoFramesResponse.Frames["+ i +"].Faces["+ j +"].GroupId"));
				facesItem.setFaceQuality(_ctx.floatValue("ListVideoFramesResponse.Frames["+ i +"].Faces["+ j +"].FaceQuality"));

				EmotionDetails emotionDetails = new EmotionDetails();
				emotionDetails.setSAD(_ctx.floatValue("ListVideoFramesResponse.Frames["+ i +"].Faces["+ j +"].EmotionDetails.SAD"));
				emotionDetails.setCALM(_ctx.floatValue("ListVideoFramesResponse.Frames["+ i +"].Faces["+ j +"].EmotionDetails.CALM"));
				emotionDetails.setANGRY(_ctx.floatValue("ListVideoFramesResponse.Frames["+ i +"].Faces["+ j +"].EmotionDetails.ANGRY"));
				emotionDetails.setHAPPY(_ctx.floatValue("ListVideoFramesResponse.Frames["+ i +"].Faces["+ j +"].EmotionDetails.HAPPY"));
				emotionDetails.setSCARED(_ctx.floatValue("ListVideoFramesResponse.Frames["+ i +"].Faces["+ j +"].EmotionDetails.SCARED"));
				emotionDetails.setDISGUSTED(_ctx.floatValue("ListVideoFramesResponse.Frames["+ i +"].Faces["+ j +"].EmotionDetails.DISGUSTED"));
				emotionDetails.setSURPRISED(_ctx.floatValue("ListVideoFramesResponse.Frames["+ i +"].Faces["+ j +"].EmotionDetails.SURPRISED"));
				facesItem.setEmotionDetails(emotionDetails);

				FaceAttributes faceAttributes = new FaceAttributes();
				faceAttributes.setGlassesConfidence(_ctx.floatValue("ListVideoFramesResponse.Frames["+ i +"].Faces["+ j +"].FaceAttributes.GlassesConfidence"));
				faceAttributes.setGlasses(_ctx.stringValue("ListVideoFramesResponse.Frames["+ i +"].Faces["+ j +"].FaceAttributes.Glasses"));
				faceAttributes.setBeard(_ctx.stringValue("ListVideoFramesResponse.Frames["+ i +"].Faces["+ j +"].FaceAttributes.Beard"));
				faceAttributes.setMaskConfidence(_ctx.floatValue("ListVideoFramesResponse.Frames["+ i +"].Faces["+ j +"].FaceAttributes.MaskConfidence"));
				faceAttributes.setBeardConfidence(_ctx.floatValue("ListVideoFramesResponse.Frames["+ i +"].Faces["+ j +"].FaceAttributes.BeardConfidence"));
				faceAttributes.setMask(_ctx.stringValue("ListVideoFramesResponse.Frames["+ i +"].Faces["+ j +"].FaceAttributes.Mask"));

				FaceBoundary faceBoundary = new FaceBoundary();
				faceBoundary.setTop(_ctx.integerValue("ListVideoFramesResponse.Frames["+ i +"].Faces["+ j +"].FaceAttributes.FaceBoundary.Top"));
				faceBoundary.setHeight(_ctx.integerValue("ListVideoFramesResponse.Frames["+ i +"].Faces["+ j +"].FaceAttributes.FaceBoundary.Height"));
				faceBoundary.setWidth(_ctx.integerValue("ListVideoFramesResponse.Frames["+ i +"].Faces["+ j +"].FaceAttributes.FaceBoundary.Width"));
				faceBoundary.setLeft(_ctx.integerValue("ListVideoFramesResponse.Frames["+ i +"].Faces["+ j +"].FaceAttributes.FaceBoundary.Left"));
				faceAttributes.setFaceBoundary(faceBoundary);

				HeadPose headPose = new HeadPose();
				headPose.setPitch(_ctx.floatValue("ListVideoFramesResponse.Frames["+ i +"].Faces["+ j +"].FaceAttributes.HeadPose.Pitch"));
				headPose.setRoll(_ctx.floatValue("ListVideoFramesResponse.Frames["+ i +"].Faces["+ j +"].FaceAttributes.HeadPose.Roll"));
				headPose.setYaw(_ctx.floatValue("ListVideoFramesResponse.Frames["+ i +"].Faces["+ j +"].FaceAttributes.HeadPose.Yaw"));
				faceAttributes.setHeadPose(headPose);
				facesItem.setFaceAttributes(faceAttributes);

				faces.add(facesItem);
			}
			framesItem.setFaces(faces);

			List<TagsItem> tags = new ArrayList<TagsItem>();
			for (int j = 0; j < _ctx.lengthValue("ListVideoFramesResponse.Frames["+ i +"].Tags.Length"); j++) {
				TagsItem tagsItem = new TagsItem();
				tagsItem.setTagConfidence(_ctx.floatValue("ListVideoFramesResponse.Frames["+ i +"].Tags["+ j +"].TagConfidence"));
				tagsItem.setTagLevel(_ctx.integerValue("ListVideoFramesResponse.Frames["+ i +"].Tags["+ j +"].TagLevel"));
				tagsItem.setTagName(_ctx.stringValue("ListVideoFramesResponse.Frames["+ i +"].Tags["+ j +"].TagName"));
				tagsItem.setParentTagName(_ctx.stringValue("ListVideoFramesResponse.Frames["+ i +"].Tags["+ j +"].ParentTagName"));

				tags.add(tagsItem);
			}
			framesItem.setTags(tags);

			List<OCRItem> oCR = new ArrayList<OCRItem>();
			for (int j = 0; j < _ctx.lengthValue("ListVideoFramesResponse.Frames["+ i +"].OCR.Length"); j++) {
				OCRItem oCRItem = new OCRItem();
				oCRItem.setOCRContents(_ctx.stringValue("ListVideoFramesResponse.Frames["+ i +"].OCR["+ j +"].OCRContents"));
				oCRItem.setOCRConfidence(_ctx.floatValue("ListVideoFramesResponse.Frames["+ i +"].OCR["+ j +"].OCRConfidence"));

				OCRBoundary oCRBoundary = new OCRBoundary();
				oCRBoundary.setLeft(_ctx.integerValue("ListVideoFramesResponse.Frames["+ i +"].OCR["+ j +"].OCRBoundary.Left"));
				oCRBoundary.setTop(_ctx.integerValue("ListVideoFramesResponse.Frames["+ i +"].OCR["+ j +"].OCRBoundary.Top"));
				oCRBoundary.setWidth(_ctx.integerValue("ListVideoFramesResponse.Frames["+ i +"].OCR["+ j +"].OCRBoundary.Width"));
				oCRBoundary.setHeight(_ctx.integerValue("ListVideoFramesResponse.Frames["+ i +"].OCR["+ j +"].OCRBoundary.Height"));
				oCRItem.setOCRBoundary(oCRBoundary);

				oCR.add(oCRItem);
			}
			framesItem.setOCR(oCR);

			frames.add(framesItem);
		}
		listVideoFramesResponse.setFrames(frames);
	 
	 	return listVideoFramesResponse;
	}
}