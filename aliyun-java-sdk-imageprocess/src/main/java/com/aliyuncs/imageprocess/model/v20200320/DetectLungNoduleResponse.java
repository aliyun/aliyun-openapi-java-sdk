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

package com.aliyuncs.imageprocess.model.v20200320;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.imageprocess.transform.v20200320.DetectLungNoduleResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DetectLungNoduleResponse extends AcsResponse {

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

		private List<Serie> series;

		public List<Serie> getSeries() {
			return this.series;
		}

		public void setSeries(List<Serie> series) {
			this.series = series;
		}

		public static class Serie {

			private String seriesInstanceUid;

			private String report;

			private List<Element> elements;

			private List<Float> origin;

			private List<Float> spacing;

			public String getSeriesInstanceUid() {
				return this.seriesInstanceUid;
			}

			public void setSeriesInstanceUid(String seriesInstanceUid) {
				this.seriesInstanceUid = seriesInstanceUid;
			}

			public String getReport() {
				return this.report;
			}

			public void setReport(String report) {
				this.report = report;
			}

			public List<Element> getElements() {
				return this.elements;
			}

			public void setElements(List<Element> elements) {
				this.elements = elements;
			}

			public List<Float> getOrigin() {
				return this.origin;
			}

			public void setOrigin(List<Float> origin) {
				this.origin = origin;
			}

			public List<Float> getSpacing() {
				return this.spacing;
			}

			public void setSpacing(List<Float> spacing) {
				this.spacing = spacing;
			}

			public static class Element {

				private Float z;

				private String lobe;

				private Float meanValue;

				private Float imageZ;

				private String lung;

				private Float confidence;

				private String sOPInstanceUID;

				private Float imageX;

				private Float y;

				private String category;

				private Float volume;

				private Float imageY;

				private Float diameter;

				private Float x;

				private String recistSOPInstanceUID;

				private Float risk;

				private List<Float> majorAxis;

				private List<Float> minorAxis;

				public Float getZ() {
					return this.z;
				}

				public void setZ(Float z) {
					this.z = z;
				}

				public String getLobe() {
					return this.lobe;
				}

				public void setLobe(String lobe) {
					this.lobe = lobe;
				}

				public Float getMeanValue() {
					return this.meanValue;
				}

				public void setMeanValue(Float meanValue) {
					this.meanValue = meanValue;
				}

				public Float getImageZ() {
					return this.imageZ;
				}

				public void setImageZ(Float imageZ) {
					this.imageZ = imageZ;
				}

				public String getLung() {
					return this.lung;
				}

				public void setLung(String lung) {
					this.lung = lung;
				}

				public Float getConfidence() {
					return this.confidence;
				}

				public void setConfidence(Float confidence) {
					this.confidence = confidence;
				}

				public String getSOPInstanceUID() {
					return this.sOPInstanceUID;
				}

				public void setSOPInstanceUID(String sOPInstanceUID) {
					this.sOPInstanceUID = sOPInstanceUID;
				}

				public Float getImageX() {
					return this.imageX;
				}

				public void setImageX(Float imageX) {
					this.imageX = imageX;
				}

				public Float getY() {
					return this.y;
				}

				public void setY(Float y) {
					this.y = y;
				}

				public String getCategory() {
					return this.category;
				}

				public void setCategory(String category) {
					this.category = category;
				}

				public Float getVolume() {
					return this.volume;
				}

				public void setVolume(Float volume) {
					this.volume = volume;
				}

				public Float getImageY() {
					return this.imageY;
				}

				public void setImageY(Float imageY) {
					this.imageY = imageY;
				}

				public Float getDiameter() {
					return this.diameter;
				}

				public void setDiameter(Float diameter) {
					this.diameter = diameter;
				}

				public Float getX() {
					return this.x;
				}

				public void setX(Float x) {
					this.x = x;
				}

				public String getRecistSOPInstanceUID() {
					return this.recistSOPInstanceUID;
				}

				public void setRecistSOPInstanceUID(String recistSOPInstanceUID) {
					this.recistSOPInstanceUID = recistSOPInstanceUID;
				}

				public Float getRisk() {
					return this.risk;
				}

				public void setRisk(Float risk) {
					this.risk = risk;
				}

				public List<Float> getMajorAxis() {
					return this.majorAxis;
				}

				public void setMajorAxis(List<Float> majorAxis) {
					this.majorAxis = majorAxis;
				}

				public List<Float> getMinorAxis() {
					return this.minorAxis;
				}

				public void setMinorAxis(List<Float> minorAxis) {
					this.minorAxis = minorAxis;
				}
			}
		}
	}

	@Override
	public DetectLungNoduleResponse getInstance(UnmarshallerContext context) {
		return	DetectLungNoduleResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
