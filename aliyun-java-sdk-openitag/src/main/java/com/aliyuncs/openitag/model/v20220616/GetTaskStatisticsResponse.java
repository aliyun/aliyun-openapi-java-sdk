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

package com.aliyuncs.openitag.model.v20220616;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.openitag.transform.v20220616.GetTaskStatisticsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetTaskStatisticsResponse extends AcsResponse {

	private Integer code;

	private String message;

	private String requestId;

	private String details;

	private Boolean success;

	private String errorCode;

	private TaskStatistics taskStatistics;

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
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

	public String getDetails() {
		return this.details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public TaskStatistics getTaskStatistics() {
		return this.taskStatistics;
	}

	public void setTaskStatistics(TaskStatistics taskStatistics) {
		this.taskStatistics = taskStatistics;
	}

	public static class TaskStatistics {

		private Long totalItemCount;

		private Long totalSubtaskCount;

		private Long finishedItemCount;

		private Long finishedSubtaskCount;

		private Float finalAbandonCount;

		private Float preMarkFixedCount;

		private Float acceptItemCount;

		private Float totalCheckedCount;

		private Float checkedError;

		private Float checkAbandon;

		private Float checkedAccuracy;

		private Float checkedRejectCount;

		private Float totalSampledCount;

		private Float sampledErrorCount;

		private Float sampledRejectCount;

		private Float sampledAccuracy;

		private Float totalSamplingCount;

		private Float totalCheckCount;

		private Float totalWorkTime;

		private Float totalMarkTime;

		private Float markEfficiency;

		private Float totalCheckTime;

		private Float checkEfficiency;

		private Float samplingAccuracy;

		private Float checkAccuracy;

		public Long getTotalItemCount() {
			return this.totalItemCount;
		}

		public void setTotalItemCount(Long totalItemCount) {
			this.totalItemCount = totalItemCount;
		}

		public Long getTotalSubtaskCount() {
			return this.totalSubtaskCount;
		}

		public void setTotalSubtaskCount(Long totalSubtaskCount) {
			this.totalSubtaskCount = totalSubtaskCount;
		}

		public Long getFinishedItemCount() {
			return this.finishedItemCount;
		}

		public void setFinishedItemCount(Long finishedItemCount) {
			this.finishedItemCount = finishedItemCount;
		}

		public Long getFinishedSubtaskCount() {
			return this.finishedSubtaskCount;
		}

		public void setFinishedSubtaskCount(Long finishedSubtaskCount) {
			this.finishedSubtaskCount = finishedSubtaskCount;
		}

		public Float getFinalAbandonCount() {
			return this.finalAbandonCount;
		}

		public void setFinalAbandonCount(Float finalAbandonCount) {
			this.finalAbandonCount = finalAbandonCount;
		}

		public Float getPreMarkFixedCount() {
			return this.preMarkFixedCount;
		}

		public void setPreMarkFixedCount(Float preMarkFixedCount) {
			this.preMarkFixedCount = preMarkFixedCount;
		}

		public Float getAcceptItemCount() {
			return this.acceptItemCount;
		}

		public void setAcceptItemCount(Float acceptItemCount) {
			this.acceptItemCount = acceptItemCount;
		}

		public Float getTotalCheckedCount() {
			return this.totalCheckedCount;
		}

		public void setTotalCheckedCount(Float totalCheckedCount) {
			this.totalCheckedCount = totalCheckedCount;
		}

		public Float getCheckedError() {
			return this.checkedError;
		}

		public void setCheckedError(Float checkedError) {
			this.checkedError = checkedError;
		}

		public Float getCheckAbandon() {
			return this.checkAbandon;
		}

		public void setCheckAbandon(Float checkAbandon) {
			this.checkAbandon = checkAbandon;
		}

		public Float getCheckedAccuracy() {
			return this.checkedAccuracy;
		}

		public void setCheckedAccuracy(Float checkedAccuracy) {
			this.checkedAccuracy = checkedAccuracy;
		}

		public Float getCheckedRejectCount() {
			return this.checkedRejectCount;
		}

		public void setCheckedRejectCount(Float checkedRejectCount) {
			this.checkedRejectCount = checkedRejectCount;
		}

		public Float getTotalSampledCount() {
			return this.totalSampledCount;
		}

		public void setTotalSampledCount(Float totalSampledCount) {
			this.totalSampledCount = totalSampledCount;
		}

		public Float getSampledErrorCount() {
			return this.sampledErrorCount;
		}

		public void setSampledErrorCount(Float sampledErrorCount) {
			this.sampledErrorCount = sampledErrorCount;
		}

		public Float getSampledRejectCount() {
			return this.sampledRejectCount;
		}

		public void setSampledRejectCount(Float sampledRejectCount) {
			this.sampledRejectCount = sampledRejectCount;
		}

		public Float getSampledAccuracy() {
			return this.sampledAccuracy;
		}

		public void setSampledAccuracy(Float sampledAccuracy) {
			this.sampledAccuracy = sampledAccuracy;
		}

		public Float getTotalSamplingCount() {
			return this.totalSamplingCount;
		}

		public void setTotalSamplingCount(Float totalSamplingCount) {
			this.totalSamplingCount = totalSamplingCount;
		}

		public Float getTotalCheckCount() {
			return this.totalCheckCount;
		}

		public void setTotalCheckCount(Float totalCheckCount) {
			this.totalCheckCount = totalCheckCount;
		}

		public Float getTotalWorkTime() {
			return this.totalWorkTime;
		}

		public void setTotalWorkTime(Float totalWorkTime) {
			this.totalWorkTime = totalWorkTime;
		}

		public Float getTotalMarkTime() {
			return this.totalMarkTime;
		}

		public void setTotalMarkTime(Float totalMarkTime) {
			this.totalMarkTime = totalMarkTime;
		}

		public Float getMarkEfficiency() {
			return this.markEfficiency;
		}

		public void setMarkEfficiency(Float markEfficiency) {
			this.markEfficiency = markEfficiency;
		}

		public Float getTotalCheckTime() {
			return this.totalCheckTime;
		}

		public void setTotalCheckTime(Float totalCheckTime) {
			this.totalCheckTime = totalCheckTime;
		}

		public Float getCheckEfficiency() {
			return this.checkEfficiency;
		}

		public void setCheckEfficiency(Float checkEfficiency) {
			this.checkEfficiency = checkEfficiency;
		}

		public Float getSamplingAccuracy() {
			return this.samplingAccuracy;
		}

		public void setSamplingAccuracy(Float samplingAccuracy) {
			this.samplingAccuracy = samplingAccuracy;
		}

		public Float getCheckAccuracy() {
			return this.checkAccuracy;
		}

		public void setCheckAccuracy(Float checkAccuracy) {
			this.checkAccuracy = checkAccuracy;
		}
	}

	@Override
	public GetTaskStatisticsResponse getInstance(UnmarshallerContext context) {
		return	GetTaskStatisticsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
