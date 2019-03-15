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
import com.aliyuncs.imm.transform.v20170906.FindImagesByTagNamesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class FindImagesByTagNamesResponse extends AcsResponse {

	private String setId;

	private String nextMarker;

	private String requestId;

	private List<Frames> images;

	public String getSetId() {
		return this.setId;
	}

	public void setSetId(String setId) {
		this.setId = setId;
	}

	public String getNextMarker() {
		return this.nextMarker;
	}

	public void setNextMarker(String nextMarker) {
		this.nextMarker = nextMarker;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Frames> getImages() {
		return this.images;
	}

	public void setImages(List<Frames> images) {
		this.images = images;
	}

	public static class Frames {

		private String facesModifyTime;

		private String oCRModifyTime;

		private String oCRStatus;

		private String sourcePosition;

		private String exif;

		private String imageUri;

		private Integer imageWidth;

		private String imageFormat;

		private String sourceType;

		private String modifyTime;

		private Integer fileSize;

		private String sourceUri;

		private String createTime;

		private String facesStatus;

		private String remarksA;

		private Integer imageHeight;

		private String remarksB;

		private String imageTime;

		private String orientation;

		private String location;

		private String oCRFailReason;

		private String facesFailReason;

		private String tagsFailReason;

		private String tagsModifyTime;

		private String celebrityStatus;

		private String celebrityModifyTime;

		private String celebrityFailReason;

		private String tagsStatus;

		private String externalId;

		private String remarksC;

		private String remarksD;

		private List<FacesItem> faces;

		private List<TagsItem> tags;

		private List<OCRItem> oCR;

		private List<CelebrityItem> celebrity;

		public String getFacesModifyTime() {
			return this.facesModifyTime;
		}

		public void setFacesModifyTime(String facesModifyTime) {
			this.facesModifyTime = facesModifyTime;
		}

		public String getOCRModifyTime() {
			return this.oCRModifyTime;
		}

		public void setOCRModifyTime(String oCRModifyTime) {
			this.oCRModifyTime = oCRModifyTime;
		}

		public String getOCRStatus() {
			return this.oCRStatus;
		}

		public void setOCRStatus(String oCRStatus) {
			this.oCRStatus = oCRStatus;
		}

		public String getSourcePosition() {
			return this.sourcePosition;
		}

		public void setSourcePosition(String sourcePosition) {
			this.sourcePosition = sourcePosition;
		}

		public String getExif() {
			return this.exif;
		}

		public void setExif(String exif) {
			this.exif = exif;
		}

		public String getImageUri() {
			return this.imageUri;
		}

		public void setImageUri(String imageUri) {
			this.imageUri = imageUri;
		}

		public Integer getImageWidth() {
			return this.imageWidth;
		}

		public void setImageWidth(Integer imageWidth) {
			this.imageWidth = imageWidth;
		}

		public String getImageFormat() {
			return this.imageFormat;
		}

		public void setImageFormat(String imageFormat) {
			this.imageFormat = imageFormat;
		}

		public String getSourceType() {
			return this.sourceType;
		}

		public void setSourceType(String sourceType) {
			this.sourceType = sourceType;
		}

		public String getModifyTime() {
			return this.modifyTime;
		}

		public void setModifyTime(String modifyTime) {
			this.modifyTime = modifyTime;
		}

		public Integer getFileSize() {
			return this.fileSize;
		}

		public void setFileSize(Integer fileSize) {
			this.fileSize = fileSize;
		}

		public String getSourceUri() {
			return this.sourceUri;
		}

		public void setSourceUri(String sourceUri) {
			this.sourceUri = sourceUri;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getFacesStatus() {
			return this.facesStatus;
		}

		public void setFacesStatus(String facesStatus) {
			this.facesStatus = facesStatus;
		}

		public String getRemarksA() {
			return this.remarksA;
		}

		public void setRemarksA(String remarksA) {
			this.remarksA = remarksA;
		}

		public Integer getImageHeight() {
			return this.imageHeight;
		}

		public void setImageHeight(Integer imageHeight) {
			this.imageHeight = imageHeight;
		}

		public String getRemarksB() {
			return this.remarksB;
		}

		public void setRemarksB(String remarksB) {
			this.remarksB = remarksB;
		}

		public String getImageTime() {
			return this.imageTime;
		}

		public void setImageTime(String imageTime) {
			this.imageTime = imageTime;
		}

		public String getOrientation() {
			return this.orientation;
		}

		public void setOrientation(String orientation) {
			this.orientation = orientation;
		}

		public String getLocation() {
			return this.location;
		}

		public void setLocation(String location) {
			this.location = location;
		}

		public String getOCRFailReason() {
			return this.oCRFailReason;
		}

		public void setOCRFailReason(String oCRFailReason) {
			this.oCRFailReason = oCRFailReason;
		}

		public String getFacesFailReason() {
			return this.facesFailReason;
		}

		public void setFacesFailReason(String facesFailReason) {
			this.facesFailReason = facesFailReason;
		}

		public String getTagsFailReason() {
			return this.tagsFailReason;
		}

		public void setTagsFailReason(String tagsFailReason) {
			this.tagsFailReason = tagsFailReason;
		}

		public String getTagsModifyTime() {
			return this.tagsModifyTime;
		}

		public void setTagsModifyTime(String tagsModifyTime) {
			this.tagsModifyTime = tagsModifyTime;
		}

		public String getCelebrityStatus() {
			return this.celebrityStatus;
		}

		public void setCelebrityStatus(String celebrityStatus) {
			this.celebrityStatus = celebrityStatus;
		}

		public String getCelebrityModifyTime() {
			return this.celebrityModifyTime;
		}

		public void setCelebrityModifyTime(String celebrityModifyTime) {
			this.celebrityModifyTime = celebrityModifyTime;
		}

		public String getCelebrityFailReason() {
			return this.celebrityFailReason;
		}

		public void setCelebrityFailReason(String celebrityFailReason) {
			this.celebrityFailReason = celebrityFailReason;
		}

		public String getTagsStatus() {
			return this.tagsStatus;
		}

		public void setTagsStatus(String tagsStatus) {
			this.tagsStatus = tagsStatus;
		}

		public String getExternalId() {
			return this.externalId;
		}

		public void setExternalId(String externalId) {
			this.externalId = externalId;
		}

		public String getRemarksC() {
			return this.remarksC;
		}

		public void setRemarksC(String remarksC) {
			this.remarksC = remarksC;
		}

		public String getRemarksD() {
			return this.remarksD;
		}

		public void setRemarksD(String remarksD) {
			this.remarksD = remarksD;
		}

		public List<FacesItem> getFaces() {
			return this.faces;
		}

		public void setFaces(List<FacesItem> faces) {
			this.faces = faces;
		}

		public List<TagsItem> getTags() {
			return this.tags;
		}

		public void setTags(List<TagsItem> tags) {
			this.tags = tags;
		}

		public List<OCRItem> getOCR() {
			return this.oCR;
		}

		public void setOCR(List<OCRItem> oCR) {
			this.oCR = oCR;
		}

		public List<CelebrityItem> getCelebrity() {
			return this.celebrity;
		}

		public void setCelebrity(List<CelebrityItem> celebrity) {
			this.celebrity = celebrity;
		}

		public static class FacesItem {

			private Integer age;

			private Float genderConfidence;

			private Float attractive;

			private String gender;

			private Float faceConfidence;

			private String emotion;

			private String faceId;

			private Float emotionConfidence;

			private String groupId;

			private Float faceQuality;

			private EmotionDetails emotionDetails;

			private FaceAttributes faceAttributes;

			public Integer getAge() {
				return this.age;
			}

			public void setAge(Integer age) {
				this.age = age;
			}

			public Float getGenderConfidence() {
				return this.genderConfidence;
			}

			public void setGenderConfidence(Float genderConfidence) {
				this.genderConfidence = genderConfidence;
			}

			public Float getAttractive() {
				return this.attractive;
			}

			public void setAttractive(Float attractive) {
				this.attractive = attractive;
			}

			public String getGender() {
				return this.gender;
			}

			public void setGender(String gender) {
				this.gender = gender;
			}

			public Float getFaceConfidence() {
				return this.faceConfidence;
			}

			public void setFaceConfidence(Float faceConfidence) {
				this.faceConfidence = faceConfidence;
			}

			public String getEmotion() {
				return this.emotion;
			}

			public void setEmotion(String emotion) {
				this.emotion = emotion;
			}

			public String getFaceId() {
				return this.faceId;
			}

			public void setFaceId(String faceId) {
				this.faceId = faceId;
			}

			public Float getEmotionConfidence() {
				return this.emotionConfidence;
			}

			public void setEmotionConfidence(Float emotionConfidence) {
				this.emotionConfidence = emotionConfidence;
			}

			public String getGroupId() {
				return this.groupId;
			}

			public void setGroupId(String groupId) {
				this.groupId = groupId;
			}

			public Float getFaceQuality() {
				return this.faceQuality;
			}

			public void setFaceQuality(Float faceQuality) {
				this.faceQuality = faceQuality;
			}

			public EmotionDetails getEmotionDetails() {
				return this.emotionDetails;
			}

			public void setEmotionDetails(EmotionDetails emotionDetails) {
				this.emotionDetails = emotionDetails;
			}

			public FaceAttributes getFaceAttributes() {
				return this.faceAttributes;
			}

			public void setFaceAttributes(FaceAttributes faceAttributes) {
				this.faceAttributes = faceAttributes;
			}

			public static class EmotionDetails {

				private Float sAD;

				private Float cALM;

				private Float aNGRY;

				private Float hAPPY;

				private Float sCARED;

				private Float dISGUSTED;

				private Float sURPRISED;

				public Float getSAD() {
					return this.sAD;
				}

				public void setSAD(Float sAD) {
					this.sAD = sAD;
				}

				public Float getCALM() {
					return this.cALM;
				}

				public void setCALM(Float cALM) {
					this.cALM = cALM;
				}

				public Float getANGRY() {
					return this.aNGRY;
				}

				public void setANGRY(Float aNGRY) {
					this.aNGRY = aNGRY;
				}

				public Float getHAPPY() {
					return this.hAPPY;
				}

				public void setHAPPY(Float hAPPY) {
					this.hAPPY = hAPPY;
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

				public Float getSURPRISED() {
					return this.sURPRISED;
				}

				public void setSURPRISED(Float sURPRISED) {
					this.sURPRISED = sURPRISED;
				}
			}

			public static class FaceAttributes {

				private Float glassesConfidence;

				private String glasses;

				private Float raceConfidence;

				private String beard;

				private Float maskConfidence;

				private String race;

				private Float beardConfidence;

				private String mask;

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

				public Float getRaceConfidence() {
					return this.raceConfidence;
				}

				public void setRaceConfidence(Float raceConfidence) {
					this.raceConfidence = raceConfidence;
				}

				public String getBeard() {
					return this.beard;
				}

				public void setBeard(String beard) {
					this.beard = beard;
				}

				public Float getMaskConfidence() {
					return this.maskConfidence;
				}

				public void setMaskConfidence(Float maskConfidence) {
					this.maskConfidence = maskConfidence;
				}

				public String getRace() {
					return this.race;
				}

				public void setRace(String race) {
					this.race = race;
				}

				public Float getBeardConfidence() {
					return this.beardConfidence;
				}

				public void setBeardConfidence(Float beardConfidence) {
					this.beardConfidence = beardConfidence;
				}

				public String getMask() {
					return this.mask;
				}

				public void setMask(String mask) {
					this.mask = mask;
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

					private Integer height;

					private Integer width;

					private Integer left;

					public Integer getTop() {
						return this.top;
					}

					public void setTop(Integer top) {
						this.top = top;
					}

					public Integer getHeight() {
						return this.height;
					}

					public void setHeight(Integer height) {
						this.height = height;
					}

					public Integer getWidth() {
						return this.width;
					}

					public void setWidth(Integer width) {
						this.width = width;
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
		}

		public static class TagsItem {

			private Float tagConfidence;

			private Integer tagLevel;

			private String tagName;

			private String parentTagName;

			public Float getTagConfidence() {
				return this.tagConfidence;
			}

			public void setTagConfidence(Float tagConfidence) {
				this.tagConfidence = tagConfidence;
			}

			public Integer getTagLevel() {
				return this.tagLevel;
			}

			public void setTagLevel(Integer tagLevel) {
				this.tagLevel = tagLevel;
			}

			public String getTagName() {
				return this.tagName;
			}

			public void setTagName(String tagName) {
				this.tagName = tagName;
			}

			public String getParentTagName() {
				return this.parentTagName;
			}

			public void setParentTagName(String parentTagName) {
				this.parentTagName = parentTagName;
			}
		}

		public static class OCRItem {

			private String oCRContents;

			private Float oCRConfidence;

			private OCRBoundary oCRBoundary;

			public String getOCRContents() {
				return this.oCRContents;
			}

			public void setOCRContents(String oCRContents) {
				this.oCRContents = oCRContents;
			}

			public Float getOCRConfidence() {
				return this.oCRConfidence;
			}

			public void setOCRConfidence(Float oCRConfidence) {
				this.oCRConfidence = oCRConfidence;
			}

			public OCRBoundary getOCRBoundary() {
				return this.oCRBoundary;
			}

			public void setOCRBoundary(OCRBoundary oCRBoundary) {
				this.oCRBoundary = oCRBoundary;
			}

			public static class OCRBoundary {

				private Integer left;

				private Integer left1;

				private Integer width;

				private Integer height;

				public Integer getLeft() {
					return this.left;
				}

				public void setLeft(Integer left) {
					this.left = left;
				}

				public Integer getLeft1() {
					return this.left1;
				}

				public void setLeft1(Integer left1) {
					this.left1 = left1;
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

		public static class CelebrityItem {

			private String celebrityName;

			private String celebrityGender;

			private Float celebrityConfidence;

			private String celebrityLibraryName;

			private CelebrityBoundary celebrityBoundary;

			public String getCelebrityName() {
				return this.celebrityName;
			}

			public void setCelebrityName(String celebrityName) {
				this.celebrityName = celebrityName;
			}

			public String getCelebrityGender() {
				return this.celebrityGender;
			}

			public void setCelebrityGender(String celebrityGender) {
				this.celebrityGender = celebrityGender;
			}

			public Float getCelebrityConfidence() {
				return this.celebrityConfidence;
			}

			public void setCelebrityConfidence(Float celebrityConfidence) {
				this.celebrityConfidence = celebrityConfidence;
			}

			public String getCelebrityLibraryName() {
				return this.celebrityLibraryName;
			}

			public void setCelebrityLibraryName(String celebrityLibraryName) {
				this.celebrityLibraryName = celebrityLibraryName;
			}

			public CelebrityBoundary getCelebrityBoundary() {
				return this.celebrityBoundary;
			}

			public void setCelebrityBoundary(CelebrityBoundary celebrityBoundary) {
				this.celebrityBoundary = celebrityBoundary;
			}

			public static class CelebrityBoundary {

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
	}

	@Override
	public FindImagesByTagNamesResponse getInstance(UnmarshallerContext context) {
		return	FindImagesByTagNamesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
