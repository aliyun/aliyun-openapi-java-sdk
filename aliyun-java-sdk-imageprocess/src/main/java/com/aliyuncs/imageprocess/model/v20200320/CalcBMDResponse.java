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
import com.aliyuncs.imageprocess.transform.v20200320.CalcBMDResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CalcBMDResponse extends AcsResponse {

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

			private String vertId;

			private Float vertBMD;

			private Float vertTScore;

			private Float vertZScore;

			private Float vertCategory;

			public String getVertId() {
				return this.vertId;
			}

			public void setVertId(String vertId) {
				this.vertId = vertId;
			}

			public Float getVertBMD() {
				return this.vertBMD;
			}

			public void setVertBMD(Float vertBMD) {
				this.vertBMD = vertBMD;
			}

			public Float getVertTScore() {
				return this.vertTScore;
			}

			public void setVertTScore(Float vertTScore) {
				this.vertTScore = vertTScore;
			}

			public Float getVertZScore() {
				return this.vertZScore;
			}

			public void setVertZScore(Float vertZScore) {
				this.vertZScore = vertZScore;
			}

			public Float getVertCategory() {
				return this.vertCategory;
			}

			public void setVertCategory(Float vertCategory) {
				this.vertCategory = vertCategory;
			}
		}
	}

	@Override
	public CalcBMDResponse getInstance(UnmarshallerContext context) {
		return	CalcBMDResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
