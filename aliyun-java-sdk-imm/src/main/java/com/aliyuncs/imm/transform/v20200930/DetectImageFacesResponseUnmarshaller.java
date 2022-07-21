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

package com.aliyuncs.imm.transform.v20200930;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.imm.model.v20200930.DetectImageFacesResponse;
import com.aliyuncs.imm.model.v20200930.DetectImageFacesResponse.FacesItem;
import com.aliyuncs.imm.model.v20200930.DetectImageFacesResponse.FacesItem.Boundary;
import com.aliyuncs.imm.model.v20200930.DetectImageFacesResponse.FacesItem.HeadPose;
import com.aliyuncs.transform.UnmarshallerContext;


public class DetectImageFacesResponseUnmarshaller {

	public static DetectImageFacesResponse unmarshall(DetectImageFacesResponse detectImageFacesResponse, UnmarshallerContext _ctx) {
		
		detectImageFacesResponse.setRequestId(_ctx.stringValue("DetectImageFacesResponse.RequestId"));

		List<FacesItem> faces = new ArrayList<FacesItem>();
		for (int i = 0; i < _ctx.lengthValue("DetectImageFacesResponse.Faces.Length"); i++) {
			FacesItem facesItem = new FacesItem();
			facesItem.setFigureId(_ctx.stringValue("DetectImageFacesResponse.Faces["+ i +"].FigureId"));
			facesItem.setFigureConfidence(_ctx.floatValue("DetectImageFacesResponse.Faces["+ i +"].FigureConfidence"));
			facesItem.setFigureClusterId(_ctx.stringValue("DetectImageFacesResponse.Faces["+ i +"].FigureClusterId"));
			facesItem.setFigureClusterConfidence(_ctx.floatValue("DetectImageFacesResponse.Faces["+ i +"].FigureClusterConfidence"));
			facesItem.setFigureType(_ctx.stringValue("DetectImageFacesResponse.Faces["+ i +"].FigureType"));
			facesItem.setAge(_ctx.longValue("DetectImageFacesResponse.Faces["+ i +"].Age"));
			facesItem.setAgeSD(_ctx.floatValue("DetectImageFacesResponse.Faces["+ i +"].AgeSD"));
			facesItem.setGender(_ctx.stringValue("DetectImageFacesResponse.Faces["+ i +"].Gender"));
			facesItem.setGenderConfidence(_ctx.floatValue("DetectImageFacesResponse.Faces["+ i +"].GenderConfidence"));
			facesItem.setEmotion(_ctx.stringValue("DetectImageFacesResponse.Faces["+ i +"].Emotion"));
			facesItem.setEmotionConfidence(_ctx.floatValue("DetectImageFacesResponse.Faces["+ i +"].EmotionConfidence"));
			facesItem.setFaceQuality(_ctx.floatValue("DetectImageFacesResponse.Faces["+ i +"].FaceQuality"));
			facesItem.setMouth(_ctx.stringValue("DetectImageFacesResponse.Faces["+ i +"].Mouth"));
			facesItem.setMouthConfidence(_ctx.floatValue("DetectImageFacesResponse.Faces["+ i +"].MouthConfidence"));
			facesItem.setBeard(_ctx.stringValue("DetectImageFacesResponse.Faces["+ i +"].Beard"));
			facesItem.setBeardConfidence(_ctx.floatValue("DetectImageFacesResponse.Faces["+ i +"].BeardConfidence"));
			facesItem.setHat(_ctx.stringValue("DetectImageFacesResponse.Faces["+ i +"].Hat"));
			facesItem.setHatConfidence(_ctx.floatValue("DetectImageFacesResponse.Faces["+ i +"].HatConfidence"));
			facesItem.setMask(_ctx.stringValue("DetectImageFacesResponse.Faces["+ i +"].Mask"));
			facesItem.setMaskConfidence(_ctx.floatValue("DetectImageFacesResponse.Faces["+ i +"].MaskConfidence"));
			facesItem.setGlasses(_ctx.stringValue("DetectImageFacesResponse.Faces["+ i +"].Glasses"));
			facesItem.setGlassesConfidence(_ctx.floatValue("DetectImageFacesResponse.Faces["+ i +"].GlassesConfidence"));
			facesItem.setSharpness(_ctx.floatValue("DetectImageFacesResponse.Faces["+ i +"].Sharpness"));
			facesItem.setAttractive(_ctx.floatValue("DetectImageFacesResponse.Faces["+ i +"].Attractive"));

			Boundary boundary = new Boundary();
			boundary.setWidth(_ctx.longValue("DetectImageFacesResponse.Faces["+ i +"].Boundary.Width"));
			boundary.setHeight(_ctx.longValue("DetectImageFacesResponse.Faces["+ i +"].Boundary.Height"));
			boundary.setLeft(_ctx.longValue("DetectImageFacesResponse.Faces["+ i +"].Boundary.Left"));
			boundary.setTop(_ctx.longValue("DetectImageFacesResponse.Faces["+ i +"].Boundary.Top"));
			facesItem.setBoundary(boundary);

			HeadPose headPose = new HeadPose();
			headPose.setPitch(_ctx.floatValue("DetectImageFacesResponse.Faces["+ i +"].HeadPose.Pitch"));
			headPose.setRoll(_ctx.floatValue("DetectImageFacesResponse.Faces["+ i +"].HeadPose.Roll"));
			headPose.setYaw(_ctx.floatValue("DetectImageFacesResponse.Faces["+ i +"].HeadPose.Yaw"));
			facesItem.setHeadPose(headPose);

			faces.add(facesItem);
		}
		detectImageFacesResponse.setFaces(faces);
	 
	 	return detectImageFacesResponse;
	}
}