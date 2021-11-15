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

package com.aliyuncs.unimkt.model.v20181212;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.unimkt.transform.v20181212.QueryIncomeDataResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryIncomeDataResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

	private Boolean success;

	private Model model;

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

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Model getModel() {
		return this.model;
	}

	public void setModel(Model model) {
		this.model = model;
	}

	public static class Model {

		private Long lastDayEstimatedIncome;

		private Long thisYearIncome;

		private String adSlotName;

		private String adSlotId;

		private Long clickTimes;

		private Long showTimes;

		private Long adSlotHitTimes;

		private Long accumulatedIncome;

		private String thisMonEstIncomeRate;

		private Long thisMonEstimatedIncome;

		private String accEstIncomeRate;

		private String thisYearEstIncomeRate;

		private Long adSlotRequests;

		private String mediaName;

		private String adSlotType;

		private String thisDaysEstIncomeRate;

		private String mediaId;

		private Long endTime;

		private String ecpmRate;

		private Long startTime;

		private String adSlotShowRate;

		private Long thisDaysEstIncome;

		private String channelName;

		private String adSlotClickRate;

		private Long estimatedIncome;

		private Long accessStatus;

		private String channelId;

		private Long ecpm;

		private String adSlotHitRate;

		public Long getLastDayEstimatedIncome() {
			return this.lastDayEstimatedIncome;
		}

		public void setLastDayEstimatedIncome(Long lastDayEstimatedIncome) {
			this.lastDayEstimatedIncome = lastDayEstimatedIncome;
		}

		public Long getThisYearIncome() {
			return this.thisYearIncome;
		}

		public void setThisYearIncome(Long thisYearIncome) {
			this.thisYearIncome = thisYearIncome;
		}

		public String getAdSlotName() {
			return this.adSlotName;
		}

		public void setAdSlotName(String adSlotName) {
			this.adSlotName = adSlotName;
		}

		public String getAdSlotId() {
			return this.adSlotId;
		}

		public void setAdSlotId(String adSlotId) {
			this.adSlotId = adSlotId;
		}

		public Long getClickTimes() {
			return this.clickTimes;
		}

		public void setClickTimes(Long clickTimes) {
			this.clickTimes = clickTimes;
		}

		public Long getShowTimes() {
			return this.showTimes;
		}

		public void setShowTimes(Long showTimes) {
			this.showTimes = showTimes;
		}

		public Long getAdSlotHitTimes() {
			return this.adSlotHitTimes;
		}

		public void setAdSlotHitTimes(Long adSlotHitTimes) {
			this.adSlotHitTimes = adSlotHitTimes;
		}

		public Long getAccumulatedIncome() {
			return this.accumulatedIncome;
		}

		public void setAccumulatedIncome(Long accumulatedIncome) {
			this.accumulatedIncome = accumulatedIncome;
		}

		public String getThisMonEstIncomeRate() {
			return this.thisMonEstIncomeRate;
		}

		public void setThisMonEstIncomeRate(String thisMonEstIncomeRate) {
			this.thisMonEstIncomeRate = thisMonEstIncomeRate;
		}

		public Long getThisMonEstimatedIncome() {
			return this.thisMonEstimatedIncome;
		}

		public void setThisMonEstimatedIncome(Long thisMonEstimatedIncome) {
			this.thisMonEstimatedIncome = thisMonEstimatedIncome;
		}

		public String getAccEstIncomeRate() {
			return this.accEstIncomeRate;
		}

		public void setAccEstIncomeRate(String accEstIncomeRate) {
			this.accEstIncomeRate = accEstIncomeRate;
		}

		public String getThisYearEstIncomeRate() {
			return this.thisYearEstIncomeRate;
		}

		public void setThisYearEstIncomeRate(String thisYearEstIncomeRate) {
			this.thisYearEstIncomeRate = thisYearEstIncomeRate;
		}

		public Long getAdSlotRequests() {
			return this.adSlotRequests;
		}

		public void setAdSlotRequests(Long adSlotRequests) {
			this.adSlotRequests = adSlotRequests;
		}

		public String getMediaName() {
			return this.mediaName;
		}

		public void setMediaName(String mediaName) {
			this.mediaName = mediaName;
		}

		public String getAdSlotType() {
			return this.adSlotType;
		}

		public void setAdSlotType(String adSlotType) {
			this.adSlotType = adSlotType;
		}

		public String getThisDaysEstIncomeRate() {
			return this.thisDaysEstIncomeRate;
		}

		public void setThisDaysEstIncomeRate(String thisDaysEstIncomeRate) {
			this.thisDaysEstIncomeRate = thisDaysEstIncomeRate;
		}

		public String getMediaId() {
			return this.mediaId;
		}

		public void setMediaId(String mediaId) {
			this.mediaId = mediaId;
		}

		public Long getEndTime() {
			return this.endTime;
		}

		public void setEndTime(Long endTime) {
			this.endTime = endTime;
		}

		public String getEcpmRate() {
			return this.ecpmRate;
		}

		public void setEcpmRate(String ecpmRate) {
			this.ecpmRate = ecpmRate;
		}

		public Long getStartTime() {
			return this.startTime;
		}

		public void setStartTime(Long startTime) {
			this.startTime = startTime;
		}

		public String getAdSlotShowRate() {
			return this.adSlotShowRate;
		}

		public void setAdSlotShowRate(String adSlotShowRate) {
			this.adSlotShowRate = adSlotShowRate;
		}

		public Long getThisDaysEstIncome() {
			return this.thisDaysEstIncome;
		}

		public void setThisDaysEstIncome(Long thisDaysEstIncome) {
			this.thisDaysEstIncome = thisDaysEstIncome;
		}

		public String getChannelName() {
			return this.channelName;
		}

		public void setChannelName(String channelName) {
			this.channelName = channelName;
		}

		public String getAdSlotClickRate() {
			return this.adSlotClickRate;
		}

		public void setAdSlotClickRate(String adSlotClickRate) {
			this.adSlotClickRate = adSlotClickRate;
		}

		public Long getEstimatedIncome() {
			return this.estimatedIncome;
		}

		public void setEstimatedIncome(Long estimatedIncome) {
			this.estimatedIncome = estimatedIncome;
		}

		public Long getAccessStatus() {
			return this.accessStatus;
		}

		public void setAccessStatus(Long accessStatus) {
			this.accessStatus = accessStatus;
		}

		public String getChannelId() {
			return this.channelId;
		}

		public void setChannelId(String channelId) {
			this.channelId = channelId;
		}

		public Long getEcpm() {
			return this.ecpm;
		}

		public void setEcpm(Long ecpm) {
			this.ecpm = ecpm;
		}

		public String getAdSlotHitRate() {
			return this.adSlotHitRate;
		}

		public void setAdSlotHitRate(String adSlotHitRate) {
			this.adSlotHitRate = adSlotHitRate;
		}
	}

	@Override
	public QueryIncomeDataResponse getInstance(UnmarshallerContext context) {
		return	QueryIncomeDataResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
