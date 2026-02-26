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

import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.imageprocess.transform.v20200320.DetectSkinDiseaseResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DetectSkinDiseaseResponse extends AcsResponse {

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

		private Map<Object,Object> results;

		private Map<Object,Object> resultsEnglish;

		private String bodyPart;

		private Float imageQuality;

		private String imageType;

		public Map<Object,Object> getResults() {
			return this.results;
		}

		public void setResults(Map<Object,Object> results) {
			this.results = results;
		}

		public Map<Object,Object> getResultsEnglish() {
			return this.resultsEnglish;
		}

		public void setResultsEnglish(Map<Object,Object> resultsEnglish) {
			this.resultsEnglish = resultsEnglish;
		}

		public String getBodyPart() {
			return this.bodyPart;
		}

		public void setBodyPart(String bodyPart) {
			this.bodyPart = bodyPart;
		}

		public Float getImageQuality() {
			return this.imageQuality;
		}

		public void setImageQuality(Float imageQuality) {
			this.imageQuality = imageQuality;
		}

		public String getImageType() {
			return this.imageType;
		}

		public void setImageType(String imageType) {
			this.imageType = imageType;
		}
	}

	@Override
	public DetectSkinDiseaseResponse getInstance(UnmarshallerContext context) {
		return	DetectSkinDiseaseResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
