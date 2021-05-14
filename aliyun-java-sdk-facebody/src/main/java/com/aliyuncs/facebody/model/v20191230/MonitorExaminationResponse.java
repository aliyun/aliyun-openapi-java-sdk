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

package com.aliyuncs.facebody.model.v20191230;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.facebody.transform.v20191230.MonitorExaminationResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class MonitorExaminationResponse extends AcsResponse {

	private String requestId;

	private String message;

	private String code;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Float chatScore;

		private Float threshold;

		private FaceInfo faceInfo;

		private PersonInfo personInfo;

		public Float getChatScore() {
			return this.chatScore;
		}

		public void setChatScore(Float chatScore) {
			this.chatScore = chatScore;
		}

		public Float getThreshold() {
			return this.threshold;
		}

		public void setThreshold(Float threshold) {
			this.threshold = threshold;
		}

		public FaceInfo getFaceInfo() {
			return this.faceInfo;
		}

		public void setFaceInfo(FaceInfo faceInfo) {
			this.faceInfo = faceInfo;
		}

		public PersonInfo getPersonInfo() {
			return this.personInfo;
		}

		public void setPersonInfo(PersonInfo personInfo) {
			this.personInfo = personInfo;
		}

		public static class FaceInfo {

			private Long completeness;

			private Long faceNumber;

			private Pose pose;

			public Long getCompleteness() {
				return this.completeness;
			}

			public void setCompleteness(Long completeness) {
				this.completeness = completeness;
			}

			public Long getFaceNumber() {
				return this.faceNumber;
			}

			public void setFaceNumber(Long faceNumber) {
				this.faceNumber = faceNumber;
			}

			public Pose getPose() {
				return this.pose;
			}

			public void setPose(Pose pose) {
				this.pose = pose;
			}

			public static class Pose {

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

		public static class PersonInfo {

			private Long personNumber;

			private CellPhone cellPhone;

			private EarPhone earPhone;

			public Long getPersonNumber() {
				return this.personNumber;
			}

			public void setPersonNumber(Long personNumber) {
				this.personNumber = personNumber;
			}

			public CellPhone getCellPhone() {
				return this.cellPhone;
			}

			public void setCellPhone(CellPhone cellPhone) {
				this.cellPhone = cellPhone;
			}

			public EarPhone getEarPhone() {
				return this.earPhone;
			}

			public void setEarPhone(EarPhone earPhone) {
				this.earPhone = earPhone;
			}

			public static class CellPhone {

				private Float score;

				private Float threshold;

				public Float getScore() {
					return this.score;
				}

				public void setScore(Float score) {
					this.score = score;
				}

				public Float getThreshold() {
					return this.threshold;
				}

				public void setThreshold(Float threshold) {
					this.threshold = threshold;
				}
			}

			public static class EarPhone {

				private Float score;

				private Float threshold;

				public Float getScore() {
					return this.score;
				}

				public void setScore(Float score) {
					this.score = score;
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

	@Override
	public MonitorExaminationResponse getInstance(UnmarshallerContext context) {
		return	MonitorExaminationResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
