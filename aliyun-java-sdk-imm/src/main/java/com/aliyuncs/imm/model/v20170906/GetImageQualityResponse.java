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

package com.aliyuncs.imm.model.v20170906;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.imm.transform.v20170906.GetImageQualityResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetImageQualityResponse extends AcsResponse {

	private String requestId;

	private String imageUri;

	private ImageQuality imageQuality;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getImageUri() {
		return this.imageUri;
	}

	public void setImageUri(String imageUri) {
		this.imageUri = imageUri;
	}

	public ImageQuality getImageQuality() {
		return this.imageQuality;
	}

	public void setImageQuality(ImageQuality imageQuality) {
		this.imageQuality = imageQuality;
	}

	public static class ImageQuality {

		private Float overallScore;

		private Float clarityScore;

		private Float clarity;

		private Float exposureScore;

		private Float exposure;

		private Float contrastScore;

		private Float contrast;

		private Float colorScore;

		private Float color;

		private Float compositionScore;

		public Float getOverallScore() {
			return this.overallScore;
		}

		public void setOverallScore(Float overallScore) {
			this.overallScore = overallScore;
		}

		public Float getClarityScore() {
			return this.clarityScore;
		}

		public void setClarityScore(Float clarityScore) {
			this.clarityScore = clarityScore;
		}

		public Float getClarity() {
			return this.clarity;
		}

		public void setClarity(Float clarity) {
			this.clarity = clarity;
		}

		public Float getExposureScore() {
			return this.exposureScore;
		}

		public void setExposureScore(Float exposureScore) {
			this.exposureScore = exposureScore;
		}

		public Float getExposure() {
			return this.exposure;
		}

		public void setExposure(Float exposure) {
			this.exposure = exposure;
		}

		public Float getContrastScore() {
			return this.contrastScore;
		}

		public void setContrastScore(Float contrastScore) {
			this.contrastScore = contrastScore;
		}

		public Float getContrast() {
			return this.contrast;
		}

		public void setContrast(Float contrast) {
			this.contrast = contrast;
		}

		public Float getColorScore() {
			return this.colorScore;
		}

		public void setColorScore(Float colorScore) {
			this.colorScore = colorScore;
		}

		public Float getColor() {
			return this.color;
		}

		public void setColor(Float color) {
			this.color = color;
		}

		public Float getCompositionScore() {
			return this.compositionScore;
		}

		public void setCompositionScore(Float compositionScore) {
			this.compositionScore = compositionScore;
		}
	}

	@Override
	public GetImageQualityResponse getInstance(UnmarshallerContext context) {
		return	GetImageQualityResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
