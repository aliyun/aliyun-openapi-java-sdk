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

package com.aliyuncs.videorecog.model.v20200320;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.videorecog.transform.v20200320.EvaluateVideoQualityResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class EvaluateVideoQualityResponse extends AcsResponse {

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

		private String jsonUrl;

		private String pdfUrl;

		private VideoQualityInfo videoQualityInfo;

		public String getJsonUrl() {
			return this.jsonUrl;
		}

		public void setJsonUrl(String jsonUrl) {
			this.jsonUrl = jsonUrl;
		}

		public String getPdfUrl() {
			return this.pdfUrl;
		}

		public void setPdfUrl(String pdfUrl) {
			this.pdfUrl = pdfUrl;
		}

		public VideoQualityInfo getVideoQualityInfo() {
			return this.videoQualityInfo;
		}

		public void setVideoQualityInfo(VideoQualityInfo videoQualityInfo) {
			this.videoQualityInfo = videoQualityInfo;
		}

		public static class VideoQualityInfo {

			private Float compressiveStrength;

			private Float noiseIntensity;

			private Float blurriness;

			private Float colorContrast;

			private Float colorSaturation;

			private Float luminance;

			private Float colorfulness;

			private Float mosScore;

			public Float getCompressiveStrength() {
				return this.compressiveStrength;
			}

			public void setCompressiveStrength(Float compressiveStrength) {
				this.compressiveStrength = compressiveStrength;
			}

			public Float getNoiseIntensity() {
				return this.noiseIntensity;
			}

			public void setNoiseIntensity(Float noiseIntensity) {
				this.noiseIntensity = noiseIntensity;
			}

			public Float getBlurriness() {
				return this.blurriness;
			}

			public void setBlurriness(Float blurriness) {
				this.blurriness = blurriness;
			}

			public Float getColorContrast() {
				return this.colorContrast;
			}

			public void setColorContrast(Float colorContrast) {
				this.colorContrast = colorContrast;
			}

			public Float getColorSaturation() {
				return this.colorSaturation;
			}

			public void setColorSaturation(Float colorSaturation) {
				this.colorSaturation = colorSaturation;
			}

			public Float getLuminance() {
				return this.luminance;
			}

			public void setLuminance(Float luminance) {
				this.luminance = luminance;
			}

			public Float getColorfulness() {
				return this.colorfulness;
			}

			public void setColorfulness(Float colorfulness) {
				this.colorfulness = colorfulness;
			}

			public Float getMosScore() {
				return this.mosScore;
			}

			public void setMosScore(Float mosScore) {
				this.mosScore = mosScore;
			}
		}
	}

	@Override
	public EvaluateVideoQualityResponse getInstance(UnmarshallerContext context) {
		return	EvaluateVideoQualityResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
