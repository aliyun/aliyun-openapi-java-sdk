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

package com.aliyuncs.snsuapi.model.v20180709;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.snsuapi.transform.v20180709.BandPrecheckResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class BandPrecheckResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private ResultModule resultModule;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public ResultModule getResultModule() {
		return this.resultModule;
	}

	public void setResultModule(ResultModule resultModule) {
		this.resultModule = resultModule;
	}

	public static class ResultModule {

		private Long bandId;

		private Integer uploadBandwidth;

		private Integer downloadBandwidth;

		private List<BandOfferListItem> bandOfferList;

		public Long getBandId() {
			return this.bandId;
		}

		public void setBandId(Long bandId) {
			this.bandId = bandId;
		}

		public Integer getUploadBandwidth() {
			return this.uploadBandwidth;
		}

		public void setUploadBandwidth(Integer uploadBandwidth) {
			this.uploadBandwidth = uploadBandwidth;
		}

		public Integer getDownloadBandwidth() {
			return this.downloadBandwidth;
		}

		public void setDownloadBandwidth(Integer downloadBandwidth) {
			this.downloadBandwidth = downloadBandwidth;
		}

		public List<BandOfferListItem> getBandOfferList() {
			return this.bandOfferList;
		}

		public void setBandOfferList(List<BandOfferListItem> bandOfferList) {
			this.bandOfferList = bandOfferList;
		}

		public static class BandOfferListItem {

			private Long offerId;

			private Integer bandwidth;

			private Long duration;

			private String direction;

			public Long getOfferId() {
				return this.offerId;
			}

			public void setOfferId(Long offerId) {
				this.offerId = offerId;
			}

			public Integer getBandwidth() {
				return this.bandwidth;
			}

			public void setBandwidth(Integer bandwidth) {
				this.bandwidth = bandwidth;
			}

			public Long getDuration() {
				return this.duration;
			}

			public void setDuration(Long duration) {
				this.duration = duration;
			}

			public String getDirection() {
				return this.direction;
			}

			public void setDirection(String direction) {
				this.direction = direction;
			}
		}
	}

	@Override
	public BandPrecheckResponse getInstance(UnmarshallerContext context) {
		return	BandPrecheckResponseUnmarshaller.unmarshall(this, context);
	}
}
