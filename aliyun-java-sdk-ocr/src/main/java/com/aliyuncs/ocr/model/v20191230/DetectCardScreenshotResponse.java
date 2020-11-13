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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.ocr.transform.v20191230.DetectCardScreenshotResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DetectCardScreenshotResponse extends AcsResponse {

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

		private Boolean isCard;

		private Boolean isBlur;

		private SpoofResult spoofResult;

		public Boolean getIsCard() {
			return this.isCard;
		}

		public void setIsCard(Boolean isCard) {
			this.isCard = isCard;
		}

		public Boolean getIsBlur() {
			return this.isBlur;
		}

		public void setIsBlur(Boolean isBlur) {
			this.isBlur = isBlur;
		}

		public SpoofResult getSpoofResult() {
			return this.spoofResult;
		}

		public void setSpoofResult(SpoofResult spoofResult) {
			this.spoofResult = spoofResult;
		}

		public static class SpoofResult {

			private Boolean isSpoof;

			private ResultMap resultMap;

			public Boolean getIsSpoof() {
				return this.isSpoof;
			}

			public void setIsSpoof(Boolean isSpoof) {
				this.isSpoof = isSpoof;
			}

			public ResultMap getResultMap() {
				return this.resultMap;
			}

			public void setResultMap(ResultMap resultMap) {
				this.resultMap = resultMap;
			}

			public static class ResultMap {

				private Float screenScore;

				private Float screenThreshold;

				public Float getScreenScore() {
					return this.screenScore;
				}

				public void setScreenScore(Float screenScore) {
					this.screenScore = screenScore;
				}

				public Float getScreenThreshold() {
					return this.screenThreshold;
				}

				public void setScreenThreshold(Float screenThreshold) {
					this.screenThreshold = screenThreshold;
				}
			}
		}
	}

	@Override
	public DetectCardScreenshotResponse getInstance(UnmarshallerContext context) {
		return	DetectCardScreenshotResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
