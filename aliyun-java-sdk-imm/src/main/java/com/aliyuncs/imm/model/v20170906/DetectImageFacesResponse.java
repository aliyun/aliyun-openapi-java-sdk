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

package com.aliyuncs.imm.model.v20170906;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.imm.transform.v20170906.DetectImageFacesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DetectImageFacesResponse extends AcsResponse {

	private String requestId;

	private String imageUri;

	private List<FacesItem> faces;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getImageUri() {
		return this.imageUri;
	}

	public void setImageUri(String imageUri) {
		this.imageUri = imageUri;
	}

	public List<FacesItem> getFaces() {
		return this.faces;
	}

	public void setFaces(List<FacesItem> faces) {
		this.faces = faces;
	}

	public static class FacesItem {

		private Float attractiveConfidence;

		private String gender;

		private Float genderConfidence;

		private String faceId;

		private Float faceQuality;

		private String emotion;

		private Integer age;

		private Float faceConfidence;

		private Float emotionConfidence;

		private Float attractive;

		private Float ageConfidence;

		private FaceAttributes faceAttributes;

		private EmotionDetails emotionDetails;

		public Float getAttractiveConfidence() {
			return this.attractiveConfidence;
		}

		public void setAttractiveConfidence(Float attractiveConfidence) {
			this.attractiveConfidence = attractiveConfidence;
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

		public String getFaceId() {
			return this.faceId;
		}

		public void setFaceId(String faceId) {
			this.faceId = faceId;
		}

		public Float getFaceQuality() {
			return this.faceQuality;
		}

		public void setFaceQuality(Float faceQuality) {
			this.faceQuality = faceQuality;
		}

		public String getEmotion() {
			return this.emotion;
		}

		public void setEmotion(String emotion) {
			this.emotion = emotion;
		}

		public Integer getAge() {
			return this.age;
		}

		public void setAge(Integer age) {
			this.age = age;
		}

		public Float getFaceConfidence() {
			return this.faceConfidence;
		}

		public void setFaceConfidence(Float faceConfidence) {
			this.faceConfidence = faceConfidence;
		}

		public Float getEmotionConfidence() {
			return this.emotionConfidence;
		}

		public void setEmotionConfidence(Float emotionConfidence) {
			this.emotionConfidence = emotionConfidence;
		}

		public Float getAttractive() {
			return this.attractive;
		}

		public void setAttractive(Float attractive) {
			this.attractive = attractive;
		}

		public Float getAgeConfidence() {
			return this.ageConfidence;
		}

		public void setAgeConfidence(Float ageConfidence) {
			this.ageConfidence = ageConfidence;
		}

		public FaceAttributes getFaceAttributes() {
			return this.faceAttributes;
		}

		public void setFaceAttributes(FaceAttributes faceAttributes) {
			this.faceAttributes = faceAttributes;
		}

		public EmotionDetails getEmotionDetails() {
			return this.emotionDetails;
		}

		public void setEmotionDetails(EmotionDetails emotionDetails) {
			this.emotionDetails = emotionDetails;
		}

		public static class FaceAttributes {

			private Float glassesConfidence;

			private String glasses;

			private String mask;

			private Float beardConfidence;

			private Float maskConfidence;

			private String beard;

			private FaceBoundary faceBoundary;

			private HeadPose headPose;

			public Float getGlassesConfidence() {
				return this.glassesConfidence;
			}

			public void setGlassesConfidence(Float glassesConfidence) {
				this.glassesConfidence = glassesConfidence;
			}

			public String getGlasses() {
				return this.glasses;
			}

			public void setGlasses(String glasses) {
				this.glasses = glasses;
			}

			public String getMask() {
				return this.mask;
			}

			public void setMask(String mask) {
				this.mask = mask;
			}

			public Float getBeardConfidence() {
				return this.beardConfidence;
			}

			public void setBeardConfidence(Float beardConfidence) {
				this.beardConfidence = beardConfidence;
			}

			public Float getMaskConfidence() {
				return this.maskConfidence;
			}

			public void setMaskConfidence(Float maskConfidence) {
				this.maskConfidence = maskConfidence;
			}

			public String getBeard() {
				return this.beard;
			}

			public void setBeard(String beard) {
				this.beard = beard;
			}

			public FaceBoundary getFaceBoundary() {
				return this.faceBoundary;
			}

			public void setFaceBoundary(FaceBoundary faceBoundary) {
				this.faceBoundary = faceBoundary;
			}

			public HeadPose getHeadPose() {
				return this.headPose;
			}

			public void setHeadPose(HeadPose headPose) {
				this.headPose = headPose;
			}

			public static class FaceBoundary {

				private Integer top;

				private Integer width;

				private Integer height;

				private Integer left;

				public Integer getTop() {
					return this.top;
				}

				public void setTop(Integer top) {
					this.top = top;
				}

				public Integer getWidth() {
					return this.width;
				}

				public void setWidth(Integer width) {
					this.width = width;
				}

				public Integer getHeight() {
					return this.height;
				}

				public void setHeight(Integer height) {
					this.height = height;
				}

				public Integer getLeft() {
					return this.left;
				}

				public void setLeft(Integer left) {
					this.left = left;
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

		public static class EmotionDetails {

			private Float hAPPY;

			private Float cALM;

			private Float sURPRISED;

			private Float dISGUSTED;

			private Float aNGRY;

			private Float sAD;

			private Float sCARED;

			public Float getHAPPY() {
				return this.hAPPY;
			}

			public void setHAPPY(Float hAPPY) {
				this.hAPPY = hAPPY;
			}

			public Float getCALM() {
				return this.cALM;
			}

			public void setCALM(Float cALM) {
				this.cALM = cALM;
			}

			public Float getSURPRISED() {
				return this.sURPRISED;
			}

			public void setSURPRISED(Float sURPRISED) {
				this.sURPRISED = sURPRISED;
			}

			public Float getDISGUSTED() {
				return this.dISGUSTED;
			}

			public void setDISGUSTED(Float dISGUSTED) {
				this.dISGUSTED = dISGUSTED;
			}

			public Float getANGRY() {
				return this.aNGRY;
			}

			public void setANGRY(Float aNGRY) {
				this.aNGRY = aNGRY;
			}

			public Float getSAD() {
				return this.sAD;
			}

			public void setSAD(Float sAD) {
				this.sAD = sAD;
			}

			public Float getSCARED() {
				return this.sCARED;
			}

			public void setSCARED(Float sCARED) {
				this.sCARED = sCARED;
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
