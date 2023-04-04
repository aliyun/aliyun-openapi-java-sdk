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
import com.aliyuncs.imm.transform.v20200930.DetectImageCarsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DetectImageCarsResponse extends AcsResponse {

	private String requestId;

	private List<CarsItem> cars;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<CarsItem> getCars() {
		return this.cars;
	}

	public void setCars(List<CarsItem> cars) {
		this.cars = cars;
	}

	public static class CarsItem {

		private String carType;

		private Double carTypeConfidence;

		private String carColor;

		private Double carColorConfidence;

		private Double confidence;

		private List<LicensePlatesItem> licensePlates;

		private Boundary boundary;

		public String getCarType() {
			return this.carType;
		}

		public void setCarType(String carType) {
			this.carType = carType;
		}

		public Double getCarTypeConfidence() {
			return this.carTypeConfidence;
		}

		public void setCarTypeConfidence(Double carTypeConfidence) {
			this.carTypeConfidence = carTypeConfidence;
		}

		public String getCarColor() {
			return this.carColor;
		}

		public void setCarColor(String carColor) {
			this.carColor = carColor;
		}

		public Double getCarColorConfidence() {
			return this.carColorConfidence;
		}

		public void setCarColorConfidence(Double carColorConfidence) {
			this.carColorConfidence = carColorConfidence;
		}

		public Double getConfidence() {
			return this.confidence;
		}

		public void setConfidence(Double confidence) {
			this.confidence = confidence;
		}

		public List<LicensePlatesItem> getLicensePlates() {
			return this.licensePlates;
		}

		public void setLicensePlates(List<LicensePlatesItem> licensePlates) {
			this.licensePlates = licensePlates;
		}

		public Boundary getBoundary() {
			return this.boundary;
		}

		public void setBoundary(Boundary boundary) {
			this.boundary = boundary;
		}

		public static class LicensePlatesItem {

			private String content;

			private Double confidence;

			private Boundary1 boundary1;

			public String getContent() {
				return this.content;
			}

			public void setContent(String content) {
				this.content = content;
			}

			public Double getConfidence() {
				return this.confidence;
			}

			public void setConfidence(Double confidence) {
				this.confidence = confidence;
			}

			public Boundary1 getBoundary1() {
				return this.boundary1;
			}

			public void setBoundary1(Boundary1 boundary1) {
				this.boundary1 = boundary1;
			}

			public static class Boundary1 {

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
	}

	@Override
	public DetectImageCarsResponse getInstance(UnmarshallerContext context) {
		return	DetectImageCarsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
