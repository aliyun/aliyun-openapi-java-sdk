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

package com.aliyuncs.imm.model.v20200930;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.imm.transform.v20200930.DetectImageScoreResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DetectImageScoreResponse extends AcsResponse {

	private String requestId;

	private ImageScore imageScore;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public ImageScore getImageScore() {
		return this.imageScore;
	}

	public void setImageScore(ImageScore imageScore) {
		this.imageScore = imageScore;
	}

	public static class ImageScore {

		private Float overallQualityScore;

		public Float getOverallQualityScore() {
			return this.overallQualityScore;
		}

		public void setOverallQualityScore(Float overallQualityScore) {
			this.overallQualityScore = overallQualityScore;
		}
	}

	@Override
	public DetectImageScoreResponse getInstance(UnmarshallerContext context) {
		return	DetectImageScoreResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
