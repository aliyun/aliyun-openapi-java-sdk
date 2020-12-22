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
import com.aliyuncs.imageprocess.transform.v20200320.DetectRibFractureResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DetectRibFractureResponse extends AcsResponse {

	private String requestId;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String resultURL;

		private List<DetectionsItem> detections;

		private List<Float> spacing;

		private List<Float> origin;

		public String getResultURL() {
			return this.resultURL;
		}

		public void setResultURL(String resultURL) {
			this.resultURL = resultURL;
		}

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

			private Integer fractureId;

			private Float fractureConfidence;

			private String fractureCategory;

			private List<Integer> coordinates;

			private List<Integer> coordinateImage;

			public Integer getFractureId() {
				return this.fractureId;
			}

			public void setFractureId(Integer fractureId) {
				this.fractureId = fractureId;
			}

			public Float getFractureConfidence() {
				return this.fractureConfidence;
			}

			public void setFractureConfidence(Float fractureConfidence) {
				this.fractureConfidence = fractureConfidence;
			}

			public String getFractureCategory() {
				return this.fractureCategory;
			}

			public void setFractureCategory(String fractureCategory) {
				this.fractureCategory = fractureCategory;
			}

			public List<Integer> getCoordinates() {
				return this.coordinates;
			}

			public void setCoordinates(List<Integer> coordinates) {
				this.coordinates = coordinates;
			}

			public List<Integer> getCoordinateImage() {
				return this.coordinateImage;
			}

			public void setCoordinateImage(List<Integer> coordinateImage) {
				this.coordinateImage = coordinateImage;
			}
		}
	}

	@Override
	public DetectRibFractureResponse getInstance(UnmarshallerContext context) {
		return	DetectRibFractureResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
