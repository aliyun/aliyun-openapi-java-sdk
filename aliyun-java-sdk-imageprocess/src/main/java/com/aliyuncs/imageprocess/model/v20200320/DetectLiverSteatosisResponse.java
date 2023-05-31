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
import com.aliyuncs.imageprocess.transform.v20200320.DetectLiverSteatosisResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DetectLiverSteatosisResponse extends AcsResponse {

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

		private List<DetectionsItem> detections;

		private List<Float> spacing;

		private List<Float> origin;

		public List<DetectionsItem> getDetections() {
			return this.detections;
		}

		public void setDetections(List<DetectionsItem> detections) {
			this.detections = detections;
		}

		public List<Float> getSpacing() {
			return this.spacing;
		}

		public void setSpacing(List<Float> spacing) {
			this.spacing = spacing;
		}

		public List<Float> getOrigin() {
			return this.origin;
		}

		public void setOrigin(List<Float> origin) {
			this.origin = origin;
		}

		public static class DetectionsItem {

			private Long radius;

			private Float liverSlice;

			private Float spleenSlice;

			private Float liverVolume;

			private Float spleenVolume;

			private Float liverHU;

			private Float spleenHU;

			private Float liverROI1;

			private Float liverROI2;

			private Float liverROI3;

			private Float spleenROI;

			private Float liverSpleenDifference;

			private Float liverSpleenRatio;

			private String prediction;

			private Float probability;

			private List<Long> rOI1Center;

			private List<Long> rOI2Center;

			private List<Long> rOI3Center;

			private List<Long> spleenCenter;

			public Long getRadius() {
				return this.radius;
			}

			public void setRadius(Long radius) {
				this.radius = radius;
			}

			public Float getLiverSlice() {
				return this.liverSlice;
			}

			public void setLiverSlice(Float liverSlice) {
				this.liverSlice = liverSlice;
			}

			public Float getSpleenSlice() {
				return this.spleenSlice;
			}

			public void setSpleenSlice(Float spleenSlice) {
				this.spleenSlice = spleenSlice;
			}

			public Float getLiverVolume() {
				return this.liverVolume;
			}

			public void setLiverVolume(Float liverVolume) {
				this.liverVolume = liverVolume;
			}

			public Float getSpleenVolume() {
				return this.spleenVolume;
			}

			public void setSpleenVolume(Float spleenVolume) {
				this.spleenVolume = spleenVolume;
			}

			public Float getLiverHU() {
				return this.liverHU;
			}

			public void setLiverHU(Float liverHU) {
				this.liverHU = liverHU;
			}

			public Float getSpleenHU() {
				return this.spleenHU;
			}

			public void setSpleenHU(Float spleenHU) {
				this.spleenHU = spleenHU;
			}

			public Float getLiverROI1() {
				return this.liverROI1;
			}

			public void setLiverROI1(Float liverROI1) {
				this.liverROI1 = liverROI1;
			}

			public Float getLiverROI2() {
				return this.liverROI2;
			}

			public void setLiverROI2(Float liverROI2) {
				this.liverROI2 = liverROI2;
			}

			public Float getLiverROI3() {
				return this.liverROI3;
			}

			public void setLiverROI3(Float liverROI3) {
				this.liverROI3 = liverROI3;
			}

			public Float getSpleenROI() {
				return this.spleenROI;
			}

			public void setSpleenROI(Float spleenROI) {
				this.spleenROI = spleenROI;
			}

			public Float getLiverSpleenDifference() {
				return this.liverSpleenDifference;
			}

			public void setLiverSpleenDifference(Float liverSpleenDifference) {
				this.liverSpleenDifference = liverSpleenDifference;
			}

			public Float getLiverSpleenRatio() {
				return this.liverSpleenRatio;
			}

			public void setLiverSpleenRatio(Float liverSpleenRatio) {
				this.liverSpleenRatio = liverSpleenRatio;
			}

			public String getPrediction() {
				return this.prediction;
			}

			public void setPrediction(String prediction) {
				this.prediction = prediction;
			}

			public Float getProbability() {
				return this.probability;
			}

			public void setProbability(Float probability) {
				this.probability = probability;
			}

			public List<Long> getROI1Center() {
				return this.rOI1Center;
			}

			public void setROI1Center(List<Long> rOI1Center) {
				this.rOI1Center = rOI1Center;
			}

			public List<Long> getROI2Center() {
				return this.rOI2Center;
			}

			public void setROI2Center(List<Long> rOI2Center) {
				this.rOI2Center = rOI2Center;
			}

			public List<Long> getROI3Center() {
				return this.rOI3Center;
			}

			public void setROI3Center(List<Long> rOI3Center) {
				this.rOI3Center = rOI3Center;
			}

			public List<Long> getSpleenCenter() {
				return this.spleenCenter;
			}

			public void setSpleenCenter(List<Long> spleenCenter) {
				this.spleenCenter = spleenCenter;
			}
		}
	}

	@Override
	public DetectLiverSteatosisResponse getInstance(UnmarshallerContext context) {
		return	DetectLiverSteatosisResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
