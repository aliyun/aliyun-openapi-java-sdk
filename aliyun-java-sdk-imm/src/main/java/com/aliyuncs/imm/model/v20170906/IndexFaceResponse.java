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
import com.aliyuncs.imm.transform.v20170906.IndexFaceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class IndexFaceResponse extends AcsResponse {

	private String requestId;

	private String setId;

	private List<SuccessDetailsItem> successDetails;

	private List<FailDetailsItem> failDetails;

	private List<String> srcUris;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getSetId() {
		return this.setId;
	}

	public void setSetId(String setId) {
		this.setId = setId;
	}

	public List<SuccessDetailsItem> getSuccessDetails() {
		return this.successDetails;
	}

	public void setSuccessDetails(List<SuccessDetailsItem> successDetails) {
		this.successDetails = successDetails;
	}

	public List<FailDetailsItem> getFailDetails() {
		return this.failDetails;
	}

	public void setFailDetails(List<FailDetailsItem> failDetails) {
		this.failDetails = failDetails;
	}

	public List<String> getSrcUris() {
		return this.srcUris;
	}

	public void setSrcUris(List<String> srcUris) {
		this.srcUris = srcUris;
	}

	public static class SuccessDetailsItem {

		private String srcUri;

		private String photoId;

		private List<FacesItem> faces;

		public String getSrcUri() {
			return this.srcUri;
		}

		public void setSrcUri(String srcUri) {
			this.srcUri = srcUri;
		}

		public String getPhotoId() {
			return this.photoId;
		}

		public void setPhotoId(String photoId) {
			this.photoId = photoId;
		}

		public List<FacesItem> getFaces() {
			return this.faces;
		}

		public void setFaces(List<FacesItem> faces) {
			this.faces = faces;
		}

		public static class FacesItem {

			private String faceId;

			private FaceRectangle faceRectangle;

			private FaceAttribute faceAttribute;

			public String getFaceId() {
				return this.faceId;
			}

			public void setFaceId(String faceId) {
				this.faceId = faceId;
			}

			public FaceRectangle getFaceRectangle() {
				return this.faceRectangle;
			}

			public void setFaceRectangle(FaceRectangle faceRectangle) {
				this.faceRectangle = faceRectangle;
			}

			public FaceAttribute getFaceAttribute() {
				return this.faceAttribute;
			}

			public void setFaceAttribute(FaceAttribute faceAttribute) {
				this.faceAttribute = faceAttribute;
			}

			public static class FaceRectangle {

				private String top;

				private String left;

				private String width;

				private String height;

				public String getTop() {
					return this.top;
				}

				public void setTop(String top) {
					this.top = top;
				}

				public String getLeft() {
					return this.left;
				}

				public void setLeft(String left) {
					this.left = left;
				}

				public String getWidth() {
					return this.width;
				}

				public void setWidth(String width) {
					this.width = width;
				}

				public String getHeight() {
					return this.height;
				}

				public void setHeight(String height) {
					this.height = height;
				}
			}

			public static class FaceAttribute {

				private Gender gender;

				private Age age;

				private HeadPose headPose;

				private EyeStatus eyeStatus;

				private Blur blur;

				private FaceQuality faceQuality;

				public Gender getGender() {
					return this.gender;
				}

				public void setGender(Gender gender) {
					this.gender = gender;
				}

				public Age getAge() {
					return this.age;
				}

				public void setAge(Age age) {
					this.age = age;
				}

				public HeadPose getHeadPose() {
					return this.headPose;
				}

				public void setHeadPose(HeadPose headPose) {
					this.headPose = headPose;
				}

				public EyeStatus getEyeStatus() {
					return this.eyeStatus;
				}

				public void setEyeStatus(EyeStatus eyeStatus) {
					this.eyeStatus = eyeStatus;
				}

				public Blur getBlur() {
					return this.blur;
				}

				public void setBlur(Blur blur) {
					this.blur = blur;
				}

				public FaceQuality getFaceQuality() {
					return this.faceQuality;
				}

				public void setFaceQuality(FaceQuality faceQuality) {
					this.faceQuality = faceQuality;
				}

				public static class Gender {

					private String value;

					public String getValue() {
						return this.value;
					}

					public void setValue(String value) {
						this.value = value;
					}
				}

				public static class Age {

					private Integer value;

					public Integer getValue() {
						return this.value;
					}

					public void setValue(Integer value) {
						this.value = value;
					}
				}

				public static class HeadPose {

					private Float pitchAngle;

					private Float rollAngle;

					private Float yawAngle;

					public Float getPitchAngle() {
						return this.pitchAngle;
					}

					public void setPitchAngle(Float pitchAngle) {
						this.pitchAngle = pitchAngle;
					}

					public Float getRollAngle() {
						return this.rollAngle;
					}

					public void setRollAngle(Float rollAngle) {
						this.rollAngle = rollAngle;
					}

					public Float getYawAngle() {
						return this.yawAngle;
					}

					public void setYawAngle(Float yawAngle) {
						this.yawAngle = yawAngle;
					}
				}

				public static class EyeStatus {

					private LeftEyeStatus leftEyeStatus;

					private RightEyeStatus rightEyeStatus;

					public LeftEyeStatus getLeftEyeStatus() {
						return this.leftEyeStatus;
					}

					public void setLeftEyeStatus(LeftEyeStatus leftEyeStatus) {
						this.leftEyeStatus = leftEyeStatus;
					}

					public RightEyeStatus getRightEyeStatus() {
						return this.rightEyeStatus;
					}

					public void setRightEyeStatus(RightEyeStatus rightEyeStatus) {
						this.rightEyeStatus = rightEyeStatus;
					}

					public static class LeftEyeStatus {

						private Float normalGlassEyeOpen;

						private Float noGlassEyeClose;

						private Float occlusion;

						private Float noGlassEyeOpen;

						private Float normalGlassEyeClose;

						private Float darkGlasses;

						public Float getNormalGlassEyeOpen() {
							return this.normalGlassEyeOpen;
						}

						public void setNormalGlassEyeOpen(Float normalGlassEyeOpen) {
							this.normalGlassEyeOpen = normalGlassEyeOpen;
						}

						public Float getNoGlassEyeClose() {
							return this.noGlassEyeClose;
						}

						public void setNoGlassEyeClose(Float noGlassEyeClose) {
							this.noGlassEyeClose = noGlassEyeClose;
						}

						public Float getOcclusion() {
							return this.occlusion;
						}

						public void setOcclusion(Float occlusion) {
							this.occlusion = occlusion;
						}

						public Float getNoGlassEyeOpen() {
							return this.noGlassEyeOpen;
						}

						public void setNoGlassEyeOpen(Float noGlassEyeOpen) {
							this.noGlassEyeOpen = noGlassEyeOpen;
						}

						public Float getNormalGlassEyeClose() {
							return this.normalGlassEyeClose;
						}

						public void setNormalGlassEyeClose(Float normalGlassEyeClose) {
							this.normalGlassEyeClose = normalGlassEyeClose;
						}

						public Float getDarkGlasses() {
							return this.darkGlasses;
						}

						public void setDarkGlasses(Float darkGlasses) {
							this.darkGlasses = darkGlasses;
						}
					}

					public static class RightEyeStatus {

						private Float normalGlassEyeOpen;

						private Float noGlassEyeClose;

						private Float occlusion;

						private Float noGlassEyeOpen;

						private Float normalGlassEyeClose;

						private Float darkGlasses;

						public Float getNormalGlassEyeOpen() {
							return this.normalGlassEyeOpen;
						}

						public void setNormalGlassEyeOpen(Float normalGlassEyeOpen) {
							this.normalGlassEyeOpen = normalGlassEyeOpen;
						}

						public Float getNoGlassEyeClose() {
							return this.noGlassEyeClose;
						}

						public void setNoGlassEyeClose(Float noGlassEyeClose) {
							this.noGlassEyeClose = noGlassEyeClose;
						}

						public Float getOcclusion() {
							return this.occlusion;
						}

						public void setOcclusion(Float occlusion) {
							this.occlusion = occlusion;
						}

						public Float getNoGlassEyeOpen() {
							return this.noGlassEyeOpen;
						}

						public void setNoGlassEyeOpen(Float noGlassEyeOpen) {
							this.noGlassEyeOpen = noGlassEyeOpen;
						}

						public Float getNormalGlassEyeClose() {
							return this.normalGlassEyeClose;
						}

						public void setNormalGlassEyeClose(Float normalGlassEyeClose) {
							this.normalGlassEyeClose = normalGlassEyeClose;
						}

						public Float getDarkGlasses() {
							return this.darkGlasses;
						}

						public void setDarkGlasses(Float darkGlasses) {
							this.darkGlasses = darkGlasses;
						}
					}
				}

				public static class Blur {

					private Blurness blurness;

					public Blurness getBlurness() {
						return this.blurness;
					}

					public void setBlurness(Blurness blurness) {
						this.blurness = blurness;
					}

					public static class Blurness {

						private Float value;

						private Float threshold;

						public Float getValue() {
							return this.value;
						}

						public void setValue(Float value) {
							this.value = value;
						}

						public Float getThreshold() {
							return this.threshold;
						}

						public void setThreshold(Float threshold) {
							this.threshold = threshold;
						}
					}
				}

				public static class FaceQuality {

					private Float value;

					private Float threshold;

					public Float getValue() {
						return this.value;
					}

					public void setValue(Float value) {
						this.value = value;
					}

					public Float getThreshold() {
						return this.threshold;
					}

					public void setThreshold(Float threshold) {
						this.threshold = threshold;
					}
				}
			}
		}
	}

	public static class FailDetailsItem {

		private String srcUri;

		private String reason;

		public String getSrcUri() {
			return this.srcUri;
		}

		public void setSrcUri(String srcUri) {
			this.srcUri = srcUri;
		}

		public String getReason() {
			return this.reason;
		}

		public void setReason(String reason) {
			this.reason = reason;
		}
	}

	@Override
	public IndexFaceResponse getInstance(UnmarshallerContext context) {
		return	IndexFaceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
