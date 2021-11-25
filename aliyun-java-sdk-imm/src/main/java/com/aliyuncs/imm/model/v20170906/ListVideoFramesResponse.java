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
import com.aliyuncs.imm.transform.v20170906.ListVideoFramesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListVideoFramesResponse extends AcsResponse {

	private String requestId;

	private String videoUri;

	private String nextMarker;

	private String setId;

	private List<FramesItem> frames;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getVideoUri() {
		return this.videoUri;
	}

	public void setVideoUri(String videoUri) {
		this.videoUri = videoUri;
	}

	public String getNextMarker() {
		return this.nextMarker;
	}

	public void setNextMarker(String nextMarker) {
		this.nextMarker = nextMarker;
	}

	public String getSetId() {
		return this.setId;
	}

	public void setSetId(String setId) {
		this.setId = setId;
	}

	public List<FramesItem> getFrames() {
		return this.frames;
	}

	public void setFrames(List<FramesItem> frames) {
		this.frames = frames;
	}

	public static class FramesItem {

		private String tagsFailReason;

		private String remarksC;

		private String createTime;

		private String sourceType;

		private String facesFailReason;

		private String facesModifyTime;

		private String imageTime;

		private String oCRModifyTime;

		private String facesStatus;

		private Integer imageHeight;

		private String externalId;

		private String sourceUri;

		private Integer fileSize;

		private String modifyTime;

		private String sourcePosition;

		private String oCRFailReason;

		private String imageFormat;

		private Integer imageWidth;

		private String orientation;

		private String remarksD;

		private String tagsStatus;

		private String remarksA;

		private String imageUri;

		private String tagsModifyTime;

		private String oCRStatus;

		private String exif;

		private String location;

		private String remarksB;

		private List<TagsItem> tags;

		private List<OCRItem> oCR;

		private List<FacesItem> faces;

		public String getTagsFailReason() {
			return this.tagsFailReason;
		}

		public void setTagsFailReason(String tagsFailReason) {
			this.tagsFailReason = tagsFailReason;
		}

		public String getRemarksC() {
			return this.remarksC;
		}

		public void setRemarksC(String remarksC) {
			this.remarksC = remarksC;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getSourceType() {
			return this.sourceType;
		}

		public void setSourceType(String sourceType) {
			this.sourceType = sourceType;
		}

		public String getFacesFailReason() {
			return this.facesFailReason;
		}

		public void setFacesFailReason(String facesFailReason) {
			this.facesFailReason = facesFailReason;
		}

		public String getFacesModifyTime() {
			return this.facesModifyTime;
		}

		public void setFacesModifyTime(String facesModifyTime) {
			this.facesModifyTime = facesModifyTime;
		}

		public String getImageTime() {
			return this.imageTime;
		}

		public void setImageTime(String imageTime) {
			this.imageTime = imageTime;
		}

		public String getOCRModifyTime() {
			return this.oCRModifyTime;
		}

		public void setOCRModifyTime(String oCRModifyTime) {
			this.oCRModifyTime = oCRModifyTime;
		}

		public String getFacesStatus() {
			return this.facesStatus;
		}

		public void setFacesStatus(String facesStatus) {
			this.facesStatus = facesStatus;
		}

		public Integer getImageHeight() {
			return this.imageHeight;
		}

		public void setImageHeight(Integer imageHeight) {
			this.imageHeight = imageHeight;
		}

		public String getExternalId() {
			return this.externalId;
		}

		public void setExternalId(String externalId) {
			this.externalId = externalId;
		}

		public String getSourceUri() {
			return this.sourceUri;
		}

		public void setSourceUri(String sourceUri) {
			this.sourceUri = sourceUri;
		}

		public Integer getFileSize() {
			return this.fileSize;
		}

		public void setFileSize(Integer fileSize) {
			this.fileSize = fileSize;
		}

		public String getModifyTime() {
			return this.modifyTime;
		}

		public void setModifyTime(String modifyTime) {
			this.modifyTime = modifyTime;
		}

		public String getSourcePosition() {
			return this.sourcePosition;
		}

		public void setSourcePosition(String sourcePosition) {
			this.sourcePosition = sourcePosition;
		}

		public String getOCRFailReason() {
			return this.oCRFailReason;
		}

		public void setOCRFailReason(String oCRFailReason) {
			this.oCRFailReason = oCRFailReason;
		}

		public String getImageFormat() {
			return this.imageFormat;
		}

		public void setImageFormat(String imageFormat) {
			this.imageFormat = imageFormat;
		}

		public Integer getImageWidth() {
			return this.imageWidth;
		}

		public void setImageWidth(Integer imageWidth) {
			this.imageWidth = imageWidth;
		}

		public String getOrientation() {
			return this.orientation;
		}

		public void setOrientation(String orientation) {
			this.orientation = orientation;
		}

		public String getRemarksD() {
			return this.remarksD;
		}

		public void setRemarksD(String remarksD) {
			this.remarksD = remarksD;
		}

		public String getTagsStatus() {
			return this.tagsStatus;
		}

		public void setTagsStatus(String tagsStatus) {
			this.tagsStatus = tagsStatus;
		}

		public String getRemarksA() {
			return this.remarksA;
		}

		public void setRemarksA(String remarksA) {
			this.remarksA = remarksA;
		}

		public String getImageUri() {
			return this.imageUri;
		}

		public void setImageUri(String imageUri) {
			this.imageUri = imageUri;
		}

		public String getTagsModifyTime() {
			return this.tagsModifyTime;
		}

		public void setTagsModifyTime(String tagsModifyTime) {
			this.tagsModifyTime = tagsModifyTime;
		}

		public String getOCRStatus() {
			return this.oCRStatus;
		}

		public void setOCRStatus(String oCRStatus) {
			this.oCRStatus = oCRStatus;
		}

		public String getExif() {
			return this.exif;
		}

		public void setExif(String exif) {
			this.exif = exif;
		}

		public String getLocation() {
			return this.location;
		}

		public void setLocation(String location) {
			this.location = location;
		}

		public String getRemarksB() {
			return this.remarksB;
		}

		public void setRemarksB(String remarksB) {
			this.remarksB = remarksB;
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

		public List<FacesItem> getFaces() {
			return this.faces;
		}

		public void setFaces(List<FacesItem> faces) {
			this.faces = faces;
		}

		public static class TagsItem {

			private Float tagConfidence;

			private String tagName;

			private Integer tagLevel;

			private String parentTagName;

			public Float getTagConfidence() {
				return this.tagConfidence;
			}

			public void setTagConfidence(Float tagConfidence) {
				this.tagConfidence = tagConfidence;
			}

			public String getTagName() {
				return this.tagName;
			}

			public void setTagName(String tagName) {
				this.tagName = tagName;
			}

			public Integer getTagLevel() {
				return this.tagLevel;
			}

			public void setTagLevel(Integer tagLevel) {
				this.tagLevel = tagLevel;
			}

			public String getParentTagName() {
				return this.parentTagName;
			}

			public void setParentTagName(String parentTagName) {
				this.parentTagName = parentTagName;
			}
		}

		public static class OCRItem {

			private Float oCRConfidence;

			private String oCRContents;

			private OCRBoundary oCRBoundary;

			public Float getOCRConfidence() {
				return this.oCRConfidence;
			}

			public void setOCRConfidence(Float oCRConfidence) {
				this.oCRConfidence = oCRConfidence;
			}

			public String getOCRContents() {
				return this.oCRContents;
			}

			public void setOCRContents(String oCRContents) {
				this.oCRContents = oCRContents;
			}

			public OCRBoundary getOCRBoundary() {
				return this.oCRBoundary;
			}

			public void setOCRBoundary(OCRBoundary oCRBoundary) {
				this.oCRBoundary = oCRBoundary;
			}

			public static class OCRBoundary {

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
		}

		public static class FacesItem {

			private String gender;

			private String faceId;

			private Float genderConfidence;

			private Float faceQuality;

			private String emotion;

			private Integer age;

			private Float faceConfidence;

			private Float emotionConfidence;

			private Float attractive;

			private String groupId;

			private FaceAttributes faceAttributes;

			private EmotionDetails emotionDetails;

			public String getGender() {
				return this.gender;
			}

			public void setGender(String gender) {
				this.gender = gender;
			}

			public String getFaceId() {
				return this.faceId;
			}

			public void setFaceId(String faceId) {
				this.faceId = faceId;
			}

			public Float getGenderConfidence() {
				return this.genderConfidence;
			}

			public void setGenderConfidence(Float genderConfidence) {
				this.genderConfidence = genderConfidence;
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

			public String getGroupId() {
				return this.groupId;
			}

			public void setGroupId(String groupId) {
				this.groupId = groupId;
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

				private Float sURPRISED;

				private Float cALM;

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

				public Float getSURPRISED() {
					return this.sURPRISED;
				}

				public void setSURPRISED(Float sURPRISED) {
					this.sURPRISED = sURPRISED;
				}

				public Float getCALM() {
					return this.cALM;
				}

				public void setCALM(Float cALM) {
					this.cALM = cALM;
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
	}

	@Override
	public ListVideoFramesResponse getInstance(UnmarshallerContext context) {
		return	ListVideoFramesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
