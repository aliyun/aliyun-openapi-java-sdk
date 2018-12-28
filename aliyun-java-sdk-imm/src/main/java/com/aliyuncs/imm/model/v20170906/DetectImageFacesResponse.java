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
import java.util.Map;
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

		private String faceId;

		private Float faceConfidence;

		private String age;

		private String gender;

		private String emotion;

		private Float attractive;

		private Float genderConfidence;

		private Float ageConfidence;

		private Float attractiveConfidence;

		private Float emotionConfidence;

		private FaceAttributes faceAttributes;

		private EmotionDetails emotionDetails;

		public String getFaceId() {
			return this.faceId;
		}

		public void setFaceId(String faceId) {
			this.faceId = faceId;
		}

		public Float getFaceConfidence() {
			return this.faceConfidence;
		}

		public void setFaceConfidence(Float faceConfidence) {
			this.faceConfidence = faceConfidence;
		}

		public String getAge() {
			return this.age;
		}

		public void setAge(String age) {
			this.age = age;
		}

		public String getGender() {
			return this.gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		public String getEmotion() {
			return this.emotion;
		}

		public void setEmotion(String emotion) {
			this.emotion = emotion;
		}

		public Float getAttractive() {
			return this.attractive;
		}

		public void setAttractive(Float attractive) {
			this.attractive = attractive;
		}

		public Float getGenderConfidence() {
			return this.genderConfidence;
		}

		public void setGenderConfidence(Float genderConfidence) {
			this.genderConfidence = genderConfidence;
		}

		public Float getAgeConfidence() {
			return this.ageConfidence;
		}

		public void setAgeConfidence(Float ageConfidence) {
			this.ageConfidence = ageConfidence;
		}

		public Float getAttractiveConfidence() {
			return this.attractiveConfidence;
		}

		public void setAttractiveConfidence(Float attractiveConfidence) {
			this.attractiveConfidence = attractiveConfidence;
		}

		public Float getEmotionConfidence() {
			return this.emotionConfidence;
		}

		public void setEmotionConfidence(Float emotionConfidence) {
			this.emotionConfidence = emotionConfidence;
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

			private String glasses;

			private String beard;

			private String race;

			private String mask;

			private Float glassesConfidence;

			private Float beardConfidence;

			private Float raceConfidence;

			private Float maskConfidence;

			private FaceBoundary faceBoundary;

			public String getGlasses() {
				return this.glasses;
			}

			public void setGlasses(String glasses) {
				this.glasses = glasses;
			}

			public String getBeard() {
				return this.beard;
			}

			public void setBeard(String beard) {
				this.beard = beard;
			}

			public String getRace() {
				return this.race;
			}

			public void setRace(String race) {
				this.race = race;
			}

			public String getMask() {
				return this.mask;
			}

			public void setMask(String mask) {
				this.mask = mask;
			}

			public Float getGlassesConfidence() {
				return this.glassesConfidence;
			}

			public void setGlassesConfidence(Float glassesConfidence) {
				this.glassesConfidence = glassesConfidence;
			}

			public Float getBeardConfidence() {
				return this.beardConfidence;
			}

			public void setBeardConfidence(Float beardConfidence) {
				this.beardConfidence = beardConfidence;
			}

			public Float getRaceConfidence() {
				return this.raceConfidence;
			}

			public void setRaceConfidence(Float raceConfidence) {
				this.raceConfidence = raceConfidence;
			}

			public Float getMaskConfidence() {
				return this.maskConfidence;
			}

			public void setMaskConfidence(Float maskConfidence) {
				this.maskConfidence = maskConfidence;
			}

			public FaceBoundary getFaceBoundary() {
				return this.faceBoundary;
			}

			public void setFaceBoundary(FaceBoundary faceBoundary) {
				this.faceBoundary = faceBoundary;
			}

			public static class FaceBoundary {

				private Integer left;

				private Integer top;

				private Integer width;

				private Integer height;

				public Integer getLeft() {
					return this.left;
				}

				public void setLeft(Integer left) {
					this.left = left;
				}

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
			}
		}

		public static class EmotionDetails {

			private Float hAPPY;

			private Float sAD;

			private Float aNGRY;

			private Float sURPRISED;

			private Float sCARED;

			private Float dISGUSTED;

			private Float cALM;

			public Float getHAPPY() {
				return this.hAPPY;
			}

			public void setHAPPY(Float hAPPY) {
				this.hAPPY = hAPPY;
			}

			public Float getSAD() {
				return this.sAD;
			}

			public void setSAD(Float sAD) {
				this.sAD = sAD;
			}

			public Float getANGRY() {
				return this.aNGRY;
			}

			public void setANGRY(Float aNGRY) {
				this.aNGRY = aNGRY;
			}

			public Float getSURPRISED() {
				return this.sURPRISED;
			}

			public void setSURPRISED(Float sURPRISED) {
				this.sURPRISED = sURPRISED;
			}

			public Float getSCARED() {
				return this.sCARED;
			}

			public void setSCARED(Float sCARED) {
				this.sCARED = sCARED;
			}

			public Float getDISGUSTED() {
				return this.dISGUSTED;
			}

			public void setDISGUSTED(Float dISGUSTED) {
				this.dISGUSTED = dISGUSTED;
			}

			public Float getCALM() {
				return this.cALM;
			}

			public void setCALM(Float cALM) {
				this.cALM = cALM;
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
