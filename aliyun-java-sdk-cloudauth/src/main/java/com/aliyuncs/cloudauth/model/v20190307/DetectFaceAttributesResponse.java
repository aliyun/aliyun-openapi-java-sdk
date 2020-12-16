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

package com.aliyuncs.cloudauth.model.v20190307;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudauth.transform.v20190307.DetectFaceAttributesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DetectFaceAttributesResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Integer imgWidth;

		private Integer imgHeight;

		private List<FaceAttributesDetectInfo> faceInfos;

		public Integer getImgWidth() {
			return this.imgWidth;
		}

		public void setImgWidth(Integer imgWidth) {
			this.imgWidth = imgWidth;
		}

		public Integer getImgHeight() {
			return this.imgHeight;
		}

		public void setImgHeight(Integer imgHeight) {
			this.imgHeight = imgHeight;
		}

		public List<FaceAttributesDetectInfo> getFaceInfos() {
			return this.faceInfos;
		}

		public void setFaceInfos(List<FaceAttributesDetectInfo> faceInfos) {
			this.faceInfos = faceInfos;
		}

		public static class FaceAttributesDetectInfo {

			private FaceRect faceRect;

			private FaceAttributes faceAttributes;

			public FaceRect getFaceRect() {
				return this.faceRect;
			}

			public void setFaceRect(FaceRect faceRect) {
				this.faceRect = faceRect;
			}

			public FaceAttributes getFaceAttributes() {
				return this.faceAttributes;
			}

			public void setFaceAttributes(FaceAttributes faceAttributes) {
				this.faceAttributes = faceAttributes;
			}

			public static class FaceRect {

				private Integer top;

				private Integer left;

				private Integer width;

				private Integer height;

				public Integer getTop() {
					return this.top;
				}

				public void setTop(Integer top) {
					this.top = top;
				}

				public Integer getLeft() {
					return this.left;
				}

				public void setLeft(Integer left) {
					this.left = left;
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

			public static class FaceAttributes {

				private Integer age;

				private String glasses;

				private String facetype;

				private Float blur;

				private String ethnicity;

				private Float facequal;

				private Integer integrity;

				private String respirator;

				private Gender gender;

				private Smiling smiling;

				private Headpose headpose;

				public Integer getAge() {
					return this.age;
				}

				public void setAge(Integer age) {
					this.age = age;
				}

				public String getGlasses() {
					return this.glasses;
				}

				public void setGlasses(String glasses) {
					this.glasses = glasses;
				}

				public String getFacetype() {
					return this.facetype;
				}

				public void setFacetype(String facetype) {
					this.facetype = facetype;
				}

				public Float getBlur() {
					return this.blur;
				}

				public void setBlur(Float blur) {
					this.blur = blur;
				}

				public String getEthnicity() {
					return this.ethnicity;
				}

				public void setEthnicity(String ethnicity) {
					this.ethnicity = ethnicity;
				}

				public Float getFacequal() {
					return this.facequal;
				}

				public void setFacequal(Float facequal) {
					this.facequal = facequal;
				}

				public Integer getIntegrity() {
					return this.integrity;
				}

				public void setIntegrity(Integer integrity) {
					this.integrity = integrity;
				}

				public String getRespirator() {
					return this.respirator;
				}

				public void setRespirator(String respirator) {
					this.respirator = respirator;
				}

				public Gender getGender() {
					return this.gender;
				}

				public void setGender(Gender gender) {
					this.gender = gender;
				}

				public Smiling getSmiling() {
					return this.smiling;
				}

				public void setSmiling(Smiling smiling) {
					this.smiling = smiling;
				}

				public Headpose getHeadpose() {
					return this.headpose;
				}

				public void setHeadpose(Headpose headpose) {
					this.headpose = headpose;
				}

				public static class Gender {

					private Float score;

					private String value;

					public Float getScore() {
						return this.score;
					}

					public void setScore(Float score) {
						this.score = score;
					}

					public String getValue() {
						return this.value;
					}

					public void setValue(String value) {
						this.value = value;
					}
				}

				public static class Smiling {

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

				public static class Headpose {

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
			}
		}
	}

	@Override
	public DetectFaceAttributesResponse getInstance(UnmarshallerContext context) {
		return	DetectFaceAttributesResponseUnmarshaller.unmarshall(this, context);
	}
}
