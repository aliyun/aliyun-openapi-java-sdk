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

	private Boolean success;

	private String message;

	private String requestId;

	private Model model;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
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

	public Model getModel() {
		return this.model;
	}

	public void setModel(Model model) {
		this.model = model;
	}

	public static class Model {

		private Long startTime;

		private Long endTime;

		private String mediaId;

		private String mediaName;

		private String adSlotType;

		private String adSlotId;

		private String adSlotName;

		private Long estimatedIncome;

		private Long adSlotRequests;

		private Long accessStatus;

		private Long adSlotHitTimes;

		private Long showTimes;

		private Long clickTimes;

		private Long lastDayEstimatedIncome;

		private Long thisMonEstimatedIncome;

		private Long thisYearIncome;

		private Long accumulatedIncome;

		private String channelId;

		private String channelName;

		private Long thisDaysEstIncome;

		private String adSlotHitRate;

		private String adSlotShowRate;

		private String adSlotClickRate;

		private Long ecpm;

		private String ecpmRate;

		private String thisDaysEstIncomeRate;

		private String thisMonEstIncomeRate;

		private String thisYearEstIncomeRate;

		private String accEstIncomeRate;

		public Long getStartTime() {
			return this.startTime;
		}

		public void setStartTime(Long startTime) {
			this.startTime = startTime;
		}

		public Long getEndTime() {
			return this.endTime;
		}

		public void setEndTime(Long endTime) {
			this.endTime = endTime;
		}

		public String getMediaId() {
			return this.mediaId;
		}

		public void setMediaId(String mediaId) {
			this.mediaId = mediaId;
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

		public String getAdSlotId() {
			return this.adSlotId;
		}

		public void setAdSlotId(String adSlotId) {
			this.adSlotId = adSlotId;
		}

		public String getAdSlotName() {
			return this.adSlotName;
		}

		public void setAdSlotName(String adSlotName) {
			this.adSlotName = adSlotName;
		}

		public Long getEstimatedIncome() {
			return this.estimatedIncome;
		}

		public void setEstimatedIncome(Long estimatedIncome) {
			this.estimatedIncome = estimatedIncome;
		}

		public Long getAdSlotRequests() {
			return this.adSlotRequests;
		}

		public void setAdSlotRequests(Long adSlotRequests) {
			this.adSlotRequests = adSlotRequests;
		}

		public Long getAccessStatus() {
			return this.accessStatus;
		}

		public void setAccessStatus(Long accessStatus) {
			this.accessStatus = accessStatus;
		}

		public Long getAdSlotHitTimes() {
			return this.adSlotHitTimes;
		}

		public void setAdSlotHitTimes(Long adSlotHitTimes) {
			this.adSlotHitTimes = adSlotHitTimes;
		}

		public Long getShowTimes() {
			return this.showTimes;
		}

		public void setShowTimes(Long showTimes) {
			this.showTimes = showTimes;
		}

		public Long getClickTimes() {
			return this.clickTimes;
		}

		public void setClickTimes(Long clickTimes) {
			this.clickTimes = clickTimes;
		}

		public Long getLastDayEstimatedIncome() {
			return this.lastDayEstimatedIncome;
		}

		public void setLastDayEstimatedIncome(Long lastDayEstimatedIncome) {
			this.lastDayEstimatedIncome = lastDayEstimatedIncome;
		}

		public Long getThisMonEstimatedIncome() {
			return this.thisMonEstimatedIncome;
		}

		public void setThisMonEstimatedIncome(Long thisMonEstimatedIncome) {
			this.thisMonEstimatedIncome = thisMonEstimatedIncome;
		}

		public Long getThisYearIncome() {
			return this.thisYearIncome;
		}

		public void setThisYearIncome(Long thisYearIncome) {
			this.thisYearIncome = thisYearIncome;
		}

		public Long getAccumulatedIncome() {
			return this.accumulatedIncome;
		}

		public void setAccumulatedIncome(Long accumulatedIncome) {
			this.accumulatedIncome = accumulatedIncome;
		}

		public String getChannelId() {
			return this.channelId;
		}

		public void setChannelId(String channelId) {
			this.channelId = channelId;
		}

		public String getChannelName() {
			return this.channelName;
		}

		public void setChannelName(String channelName) {
			this.channelName = channelName;
		}

		public Long getThisDaysEstIncome() {
			return this.thisDaysEstIncome;
		}

		public void setThisDaysEstIncome(Long thisDaysEstIncome) {
			this.thisDaysEstIncome = thisDaysEstIncome;
		}

		public String getAdSlotHitRate() {
			return this.adSlotHitRate;
		}

		public void setAdSlotHitRate(String adSlotHitRate) {
			this.adSlotHitRate = adSlotHitRate;
		}

		public String getAdSlotShowRate() {
			return this.adSlotShowRate;
		}

		public void setAdSlotShowRate(String adSlotShowRate) {
			this.adSlotShowRate = adSlotShowRate;
		}

		public String getAdSlotClickRate() {
			return this.adSlotClickRate;
		}

		public void setAdSlotClickRate(String adSlotClickRate) {
			this.adSlotClickRate = adSlotClickRate;
		}

		public Long getEcpm() {
			return this.ecpm;
		}

		public void setEcpm(Long ecpm) {
			this.ecpm = ecpm;
		}

		public String getEcpmRate() {
			return this.ecpmRate;
		}

		public void setEcpmRate(String ecpmRate) {
			this.ecpmRate = ecpmRate;
		}

		public String getThisDaysEstIncomeRate() {
			return this.thisDaysEstIncomeRate;
		}

		public void setThisDaysEstIncomeRate(String thisDaysEstIncomeRate) {
			this.thisDaysEstIncomeRate = thisDaysEstIncomeRate;
		}

		public String getThisMonEstIncomeRate() {
			return this.thisMonEstIncomeRate;
		}

		public void setThisMonEstIncomeRate(String thisMonEstIncomeRate) {
			this.thisMonEstIncomeRate = thisMonEstIncomeRate;
		}

		public String getThisYearEstIncomeRate() {
			return this.thisYearEstIncomeRate;
		}

		public void setThisYearEstIncomeRate(String thisYearEstIncomeRate) {
			this.thisYearEstIncomeRate = thisYearEstIncomeRate;
		}

		public String getAccEstIncomeRate() {
			return this.accEstIncomeRate;
		}

		public void setAccEstIncomeRate(String accEstIncomeRate) {
			this.accEstIncomeRate = accEstIncomeRate;
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
