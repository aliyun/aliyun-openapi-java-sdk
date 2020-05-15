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
import com.aliyuncs.ocr.transform.v20191230.RecognizePassportMRZResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class RecognizePassportMRZResponse extends AcsResponse {

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

		private List<Region> regions;

		public List<Region> getRegions() {
			return this.regions;
		}

		public void setRegions(List<Region> regions) {
			this.regions = regions;
		}

		public static class Region {

			private String name;

			private Float recognitionScore;

			private String content;

			private Float detectionScore;

			private List<Float> bandBoxes;

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public Float getRecognitionScore() {
				return this.recognitionScore;
			}

			public void setRecognitionScore(Float recognitionScore) {
				this.recognitionScore = recognitionScore;
			}

			public String getContent() {
				return this.content;
			}

			public void setContent(String content) {
				this.content = content;
			}

			public Float getDetectionScore() {
				return this.detectionScore;
			}

			public void setDetectionScore(Float detectionScore) {
				this.detectionScore = detectionScore;
			}

			public List<Float> getBandBoxes() {
				return this.bandBoxes;
			}

			public void setBandBoxes(List<Float> bandBoxes) {
				this.bandBoxes = bandBoxes;
			}
		}
	}

	@Override
	public RecognizePassportMRZResponse getInstance(UnmarshallerContext context) {
		return	RecognizePassportMRZResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
