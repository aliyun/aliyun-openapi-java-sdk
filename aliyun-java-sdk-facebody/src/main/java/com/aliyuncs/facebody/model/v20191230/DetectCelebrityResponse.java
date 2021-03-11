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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.facebody.transform.v20191230.DetectCelebrityResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DetectCelebrityResponse extends AcsResponse {

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

		private Integer height;

		private Integer width;

		private List<FaceRecognizeResult> faceRecognizeResults;

		public Integer getHeight() {
			return this.height;
		}

		public void setHeight(Integer height) {
			this.height = height;
		}

		public Integer getWidth() {
			return this.width;
		}

		public void setWidth(Integer width) {
			this.width = width;
		}

		public List<FaceRecognizeResult> getFaceRecognizeResults() {
			return this.faceRecognizeResults;
		}

		public void setFaceRecognizeResults(List<FaceRecognizeResult> faceRecognizeResults) {
			this.faceRecognizeResults = faceRecognizeResults;
		}

		public static class FaceRecognizeResult {

			private String name;

			private List<Float> faceBoxes;

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public List<Float> getFaceBoxes() {
				return this.faceBoxes;
			}

			public void setFaceBoxes(List<Float> faceBoxes) {
				this.faceBoxes = faceBoxes;
			}
		}
	}

	@Override
	public DetectCelebrityResponse getInstance(UnmarshallerContext context) {
		return	DetectCelebrityResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
