/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
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

			private List<FaceRectangleItem> faceRectangle;

			private List<FaceAttributeItem> faceAttribute;

			public String getFaceId() {
				return this.faceId;
			}

			public void setFaceId(String faceId) {
				this.faceId = faceId;
			}

			public List<FaceRectangleItem> getFaceRectangle() {
				return this.faceRectangle;
			}

			public void setFaceRectangle(List<FaceRectangleItem> faceRectangle) {
				this.faceRectangle = faceRectangle;
			}

			public List<FaceAttributeItem> getFaceAttribute() {
				return this.faceAttribute;
			}

			public void setFaceAttribute(List<FaceAttributeItem> faceAttribute) {
				this.faceAttribute = faceAttribute;
			}

			public static class FaceRectangleItem {

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

			public static class FaceAttributeItem {

				private List<GenderItem> gender;

				private List<AgeItem> age;

				private List<HeadposeItem> headpose;

				private List<EyestatusItem> eyestatus;

				private List<BlurItem> blur;

				private List<FacequalityItem> facequality;

				public List<GenderItem> getGender() {
					return this.gender;
				}

				public void setGender(List<GenderItem> gender) {
					this.gender = gender;
				}

				public List<AgeItem> getAge() {
					return this.age;
				}

				public void setAge(List<AgeItem> age) {
					this.age = age;
				}

				public List<HeadposeItem> getHeadpose() {
					return this.headpose;
				}

				public void setHeadpose(List<HeadposeItem> headpose) {
					this.headpose = headpose;
				}

				public List<EyestatusItem> getEyestatus() {
					return this.eyestatus;
				}

				public void setEyestatus(List<EyestatusItem> eyestatus) {
					this.eyestatus = eyestatus;
				}

				public List<BlurItem> getBlur() {
					return this.blur;
				}

				public void setBlur(List<BlurItem> blur) {
					this.blur = blur;
				}

				public List<FacequalityItem> getFacequality() {
					return this.facequality;
				}

				public void setFacequality(List<FacequalityItem> facequality) {
					this.facequality = facequality;
				}

				public static class GenderItem {

					private String value;

					public String getValue() {
						return this.value;
					}

					public void setValue(String value) {
						this.value = value;
					}
				}

				public static class AgeItem {

					private Integer value;

					public Integer getValue() {
						return this.value;
					}

					public void setValue(Integer value) {
						this.value = value;
					}
				}

				public static class HeadposeItem {

					private Float pitch_angle;

					private Float roll_angle;

					private Float yaw_angle;

					public Float getPitch_angle() {
						return this.pitch_angle;
					}

					public void setPitch_angle(Float pitch_angle) {
						this.pitch_angle = pitch_angle;
					}

					public Float getRoll_angle() {
						return this.roll_angle;
					}

					public void setRoll_angle(Float roll_angle) {
						this.roll_angle = roll_angle;
					}

					public Float getYaw_angle() {
						return this.yaw_angle;
					}

					public void setYaw_angle(Float yaw_angle) {
						this.yaw_angle = yaw_angle;
					}
				}

				public static class EyestatusItem {

					private List<Left_eye_statusItem> left_eye_status;

					private List<Right_eye_statusItem> right_eye_status;

					public List<Left_eye_statusItem> getLeft_eye_status() {
						return this.left_eye_status;
					}

					public void setLeft_eye_status(List<Left_eye_statusItem> left_eye_status) {
						this.left_eye_status = left_eye_status;
					}

					public List<Right_eye_statusItem> getRight_eye_status() {
						return this.right_eye_status;
					}

					public void setRight_eye_status(List<Right_eye_statusItem> right_eye_status) {
						this.right_eye_status = right_eye_status;
					}

					public static class Left_eye_statusItem {

						private Float normal_glass_eye_open;

						private Float no_glass_eye_close;

						private Float occlusion;

						private Float no_glass_eye_open;

						private Float normal_glass_eye_close;

						private Float dark_glasses;

						public Float getNormal_glass_eye_open() {
							return this.normal_glass_eye_open;
						}

						public void setNormal_glass_eye_open(Float normal_glass_eye_open) {
							this.normal_glass_eye_open = normal_glass_eye_open;
						}

						public Float getNo_glass_eye_close() {
							return this.no_glass_eye_close;
						}

						public void setNo_glass_eye_close(Float no_glass_eye_close) {
							this.no_glass_eye_close = no_glass_eye_close;
						}

						public Float getOcclusion() {
							return this.occlusion;
						}

						public void setOcclusion(Float occlusion) {
							this.occlusion = occlusion;
						}

						public Float getNo_glass_eye_open() {
							return this.no_glass_eye_open;
						}

						public void setNo_glass_eye_open(Float no_glass_eye_open) {
							this.no_glass_eye_open = no_glass_eye_open;
						}

						public Float getNormal_glass_eye_close() {
							return this.normal_glass_eye_close;
						}

						public void setNormal_glass_eye_close(Float normal_glass_eye_close) {
							this.normal_glass_eye_close = normal_glass_eye_close;
						}

						public Float getDark_glasses() {
							return this.dark_glasses;
						}

						public void setDark_glasses(Float dark_glasses) {
							this.dark_glasses = dark_glasses;
						}
					}

					public static class Right_eye_statusItem {

						private Float normal_glass_eye_open;

						private Float no_glass_eye_close;

						private Float occlusion;

						private Float no_glass_eye_open;

						private Float normal_glass_eye_close;

						private Float dark_glasses;

						public Float getNormal_glass_eye_open() {
							return this.normal_glass_eye_open;
						}

						public void setNormal_glass_eye_open(Float normal_glass_eye_open) {
							this.normal_glass_eye_open = normal_glass_eye_open;
						}

						public Float getNo_glass_eye_close() {
							return this.no_glass_eye_close;
						}

						public void setNo_glass_eye_close(Float no_glass_eye_close) {
							this.no_glass_eye_close = no_glass_eye_close;
						}

						public Float getOcclusion() {
							return this.occlusion;
						}

						public void setOcclusion(Float occlusion) {
							this.occlusion = occlusion;
						}

						public Float getNo_glass_eye_open() {
							return this.no_glass_eye_open;
						}

						public void setNo_glass_eye_open(Float no_glass_eye_open) {
							this.no_glass_eye_open = no_glass_eye_open;
						}

						public Float getNormal_glass_eye_close() {
							return this.normal_glass_eye_close;
						}

						public void setNormal_glass_eye_close(Float normal_glass_eye_close) {
							this.normal_glass_eye_close = normal_glass_eye_close;
						}

						public Float getDark_glasses() {
							return this.dark_glasses;
						}

						public void setDark_glasses(Float dark_glasses) {
							this.dark_glasses = dark_glasses;
						}
					}
				}

				public static class BlurItem {

					private List<BlurnessItem> blurness;

					public List<BlurnessItem> getBlurness() {
						return this.blurness;
					}

					public void setBlurness(List<BlurnessItem> blurness) {
						this.blurness = blurness;
					}

					public static class BlurnessItem {

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

				public static class FacequalityItem {

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
