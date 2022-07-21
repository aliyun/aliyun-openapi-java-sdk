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

package com.aliyuncs.imm.model.v20200930;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.imm.transform.v20200930.DetectImageFacesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DetectImageFacesResponse extends AcsResponse {

	private String requestId;

	private List<FacesItem> faces;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<FacesItem> getFaces() {
		return this.faces;
	}

	public void setFaces(List<FacesItem> faces) {
		this.faces = faces;
	}

	public static class FacesItem {

		private String figureId;

		private Float figureConfidence;

		private String figureClusterId;

		private Float figureClusterConfidence;

		private String figureType;

		private Long age;

		private Float ageSD;

		private String gender;

		private Float genderConfidence;

		private String emotion;

		private Float emotionConfidence;

		private Float faceQuality;

		private String mouth;

		private Float mouthConfidence;

		private String beard;

		private Float beardConfidence;

		private String hat;

		private Float hatConfidence;

		private String mask;

		private Float maskConfidence;

		private String glasses;

		private Float glassesConfidence;

		private Float sharpness;

		private Float attractive;

		private Boundary boundary;

		private HeadPose headPose;

		public String getFigureId() {
			return this.figureId;
		}

		public void setFigureId(String figureId) {
			this.figureId = figureId;
		}

		public Float getFigureConfidence() {
			return this.figureConfidence;
		}

		public void setFigureConfidence(Float figureConfidence) {
			this.figureConfidence = figureConfidence;
		}

		public String getFigureClusterId() {
			return this.figureClusterId;
		}

		public void setFigureClusterId(String figureClusterId) {
			this.figureClusterId = figureClusterId;
		}

		public Float getFigureClusterConfidence() {
			return this.figureClusterConfidence;
		}

		public void setFigureClusterConfidence(Float figureClusterConfidence) {
			this.figureClusterConfidence = figureClusterConfidence;
		}

		public String getFigureType() {
			return this.figureType;
		}

		public void setFigureType(String figureType) {
			this.figureType = figureType;
		}

		public Long getAge() {
			return this.age;
		}

		public void setAge(Long age) {
			this.age = age;
		}

		public Float getAgeSD() {
			return this.ageSD;
		}

		public void setAgeSD(Float ageSD) {
			this.ageSD = ageSD;
		}

		public String getGender() {
			return this.gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		public Float getGenderConfidence() {
			return this.genderConfidence;
		}

		public void setGenderConfidence(Float genderConfidence) {
			this.genderConfidence = genderConfidence;
		}

		public String getEmotion() {
			return this.emotion;
		}

		public void setEmotion(String emotion) {
			this.emotion = emotion;
		}

		public Float getEmotionConfidence() {
			return this.emotionConfidence;
		}

		public void setEmotionConfidence(Float emotionConfidence) {
			this.emotionConfidence = emotionConfidence;
		}

		public Float getFaceQuality() {
			return this.faceQuality;
		}

		public void setFaceQuality(Float faceQuality) {
			this.faceQuality = faceQuality;
		}

		public String getMouth() {
			return this.mouth;
		}

		public void setMouth(String mouth) {
			this.mouth = mouth;
		}

		public Float getMouthConfidence() {
			return this.mouthConfidence;
		}

		public void setMouthConfidence(Float mouthConfidence) {
			this.mouthConfidence = mouthConfidence;
		}

		public String getBeard() {
			return this.beard;
		}

		public void setBeard(String beard) {
			this.beard = beard;
		}

		public Float getBeardConfidence() {
			return this.beardConfidence;
		}

		public void setBeardConfidence(Float beardConfidence) {
			this.beardConfidence = beardConfidence;
		}

		public String getHat() {
			return this.hat;
		}

		public void setHat(String hat) {
			this.hat = hat;
		}

		public Float getHatConfidence() {
			return this.hatConfidence;
		}

		public void setHatConfidence(Float hatConfidence) {
			this.hatConfidence = hatConfidence;
		}

		public String getMask() {
			return this.mask;
		}

		public void setMask(String mask) {
			this.mask = mask;
		}

		public Float getMaskConfidence() {
			return this.maskConfidence;
		}

		public void setMaskConfidence(Float maskConfidence) {
			this.maskConfidence = maskConfidence;
		}

		public String getGlasses() {
			return this.glasses;
		}

		public void setGlasses(String glasses) {
			this.glasses = glasses;
		}

		public Float getGlassesConfidence() {
			return this.glassesConfidence;
		}

		public void setGlassesConfidence(Float glassesConfidence) {
			this.glassesConfidence = glassesConfidence;
		}

		public Float getSharpness() {
			return this.sharpness;
		}

		public void setSharpness(Float sharpness) {
			this.sharpness = sharpness;
		}

		public Float getAttractive() {
			return this.attractive;
		}

		public void setAttractive(Float attractive) {
			this.attractive = attractive;
		}

		public Boundary getBoundary() {
			return this.boundary;
		}

		public void setBoundary(Boundary boundary) {
			this.boundary = boundary;
		}

		public HeadPose getHeadPose() {
			return this.headPose;
		}

		public void setHeadPose(HeadPose headPose) {
			this.headPose = headPose;
		}

		public static class Boundary {

			private Long width;

			private Long height;

			private Long left;

			private Long top;

			public Long getWidth() {
				return this.width;
			}

			public void setWidth(Long width) {
				this.width = width;
			}

			public Long getHeight() {
				return this.height;
			}

			public void setHeight(Long height) {
				this.height = height;
			}

			public Long getLeft() {
				return this.left;
			}

			public void setLeft(Long left) {
				this.left = left;
			}

			public Long getTop() {
				return this.top;
			}

			public void setTop(Long top) {
				this.top = top;
			}
		}

		public static class HeadPose {

			private Float pitch;

			private Float roll;

			private Float yaw;

			public Float getPitch() {
				return this.pitch;
			}

			public void setPitch(Float pitch) {
				this.pitch = pitch;
			}

			public Float getRoll() {
				return this.roll;
			}

			public void setRoll(Float roll) {
				this.roll = roll;
			}

			public Float getYaw() {
				return this.yaw;
			}

			public void setYaw(Float yaw) {
				this.yaw = yaw;
			}
		}
	}

	@Override
	public DetectImageFacesResponse getInstance(UnmarshallerContext context) {
		return	DetectImageFacesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
