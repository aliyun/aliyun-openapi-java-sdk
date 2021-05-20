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

package com.aliyuncs.ocr.model.v20191230;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ocr.transform.v20191230.RecognizeLicensePlateResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class RecognizeLicensePlateResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

		private List<Plate> plates;

		public List<Plate> getPlates() {
			return this.plates;
		}

		public void setPlates(List<Plate> plates) {
			this.plates = plates;
		}

		public static class Plate {

			private Float plateTypeConfidence;

			private String plateType;

			private Float confidence;

			private String plateNumber;

			private List<PositionsItem> positions;

			private Roi roi;

			public Float getPlateTypeConfidence() {
				return this.plateTypeConfidence;
			}

			public void setPlateTypeConfidence(Float plateTypeConfidence) {
				this.plateTypeConfidence = plateTypeConfidence;
			}

			public String getPlateType() {
				return this.plateType;
			}

			public void setPlateType(String plateType) {
				this.plateType = plateType;
			}

			public Float getConfidence() {
				return this.confidence;
			}

			public void setConfidence(Float confidence) {
				this.confidence = confidence;
			}

			public String getPlateNumber() {
				return this.plateNumber;
			}

			public void setPlateNumber(String plateNumber) {
				this.plateNumber = plateNumber;
			}

			public List<PositionsItem> getPositions() {
				return this.positions;
			}

			public void setPositions(List<PositionsItem> positions) {
				this.positions = positions;
			}

			public Roi getRoi() {
				return this.roi;
			}

			public void setRoi(Roi roi) {
				this.roi = roi;
			}

			public static class PositionsItem {

				private Long x;

				private Long y;

				public Long getX() {
					return this.x;
				}

				public void setX(Long x) {
					this.x = x;
				}

				public Long getY() {
					return this.y;
				}

				public void setY(Long y) {
					this.y = y;
				}
			}

			public static class Roi {

				private Integer w;

				private Integer h;

				private Integer y;

				private Integer x;

				public Integer getW() {
					return this.w;
				}

				public void setW(Integer w) {
					this.w = w;
				}

				public Integer getH() {
					return this.h;
				}

				public void setH(Integer h) {
					this.h = h;
				}

				public Integer getY() {
					return this.y;
				}

				public void setY(Integer y) {
					this.y = y;
				}

				public Integer getX() {
					return this.x;
				}

				public void setX(Integer x) {
					this.x = x;
				}
			}
		}
	}

	@Override
	public RecognizeLicensePlateResponse getInstance(UnmarshallerContext context) {
		return	RecognizeLicensePlateResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
