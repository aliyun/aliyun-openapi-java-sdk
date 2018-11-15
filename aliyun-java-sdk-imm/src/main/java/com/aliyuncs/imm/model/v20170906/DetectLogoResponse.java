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

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.imm.transform.v20170906.DetectLogoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DetectLogoResponse extends AcsResponse {

	private String requestId;

	private List<SuccessDetailsItem> successDetails;

	private List<FailDetailsItem> failDetails;

	private List<String> srcUris;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<SuccessDetailsItem> getSuccessDetails() {
		return this.successDetails;
	}

	public void setSuccessDetails(List<SuccessDetailsItem> successDetails) {
		this.successDetails = successDetails;
	}

	public List<FailDetailsItem> getFailDetails() {
		return this.failDetails;
	}

	public void setFailDetails(List<FailDetailsItem> failDetails) {
		this.failDetails = failDetails;
	}

	public List<String> getSrcUris() {
		return this.srcUris;
	}

	public void setSrcUris(List<String> srcUris) {
		this.srcUris = srcUris;
	}

	public static class SuccessDetailsItem {

		private String srcUri;

		private String time;

		private String getImageTime;

		private String detectTime;

		private List<LogoBoxDetailItem> logoBoxDetail;

		public String getSrcUri() {
			return this.srcUri;
		}

		public void setSrcUri(String srcUri) {
			this.srcUri = srcUri;
		}

		public String getTime() {
			return this.time;
		}

		public void setTime(String time) {
			this.time = time;
		}

		public String getGetImageTime() {
			return this.getImageTime;
		}

		public void setGetImageTime(String getImageTime) {
			this.getImageTime = getImageTime;
		}

		public String getDetectTime() {
			return this.detectTime;
		}

		public void setDetectTime(String detectTime) {
			this.detectTime = detectTime;
		}

		public List<LogoBoxDetailItem> getLogoBoxDetail() {
			return this.logoBoxDetail;
		}

		public void setLogoBoxDetail(List<LogoBoxDetailItem> logoBoxDetail) {
			this.logoBoxDetail = logoBoxDetail;
		}

		public static class LogoBoxDetailItem {

			private String pUID;

			private String type;

			private Float score;

			private List<String> box;

			public String getPUID() {
				return this.pUID;
			}

			public void setPUID(String pUID) {
				this.pUID = pUID;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public Float getScore() {
				return this.score;
			}

			public void setScore(Float score) {
				this.score = score;
			}

			public List<String> getBox() {
				return this.box;
			}

			public void setBox(List<String> box) {
				this.box = box;
			}
		}
	}

	public static class FailDetailsItem {

		private String srcUri;

		private String reason;

		public String getSrcUri() {
			return this.srcUri;
		}

		public void setSrcUri(String srcUri) {
			this.srcUri = srcUri;
		}

		public String getReason() {
			return this.reason;
		}

		public void setReason(String reason) {
			this.reason = reason;
		}
	}

	@Override
	public DetectLogoResponse getInstance(UnmarshallerContext context) {
		return	DetectLogoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
