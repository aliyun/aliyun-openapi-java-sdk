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

package com.aliyuncs.itag.model.v20210517;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.itag.transform.v20210517.GetMarkUserSummaryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetMarkUserSummaryResponse extends AcsResponse {

	private String requestId;

	private Integer code;

	private String msg;

	private String errInfo;

	private Boolean succ;

	private String errorCode;

	private Result result;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMsg() {
		return this.msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getErrInfo() {
		return this.errInfo;
	}

	public void setErrInfo(String errInfo) {
		this.errInfo = errInfo;
	}

	public Boolean getSucc() {
		return this.succ;
	}

	public void setSucc(Boolean succ) {
		this.succ = succ;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private Integer totalDisable;

		private String updateTime;

		private Integer sample;

		private Integer totalMark;

		private Integer noRejectMark;

		private Integer totalChecked;

		private Integer checkedError;

		private Float checkedAccuracy;

		private Integer checkedReject;

		private Integer checkedFix;

		private Integer totalSampled;

		private Integer sampledError;

		private Integer sampledReject;

		private Integer sampledFix;

		private Float sampledAccuracy;

		private Integer totalSampling;

		private Integer samplingError;

		private Integer samplingReject;

		private Integer samplingFix;

		private Float samplingAccuracy;

		private Integer totalCheck;

		private Integer noRejectCheck;

		private Integer checkError;

		private Float checkAccuracy;

		private Integer checkReject;

		private Integer checkFix;

		private String userName;

		private String userId;

		private String taskId;

		private String taskName;

		private String bizClassify;

		private String workflow;

		private String workTime;

		private Long totalPDF;

		private Long noRejectPDF;

		private Long totalAudio;

		private Long noRejectAudio;

		private Long totalVideo;

		private Long noRejectVideo;

		private Float markTime;

		private Float markEfficiency;

		private Float checkTime;

		private Float checkEfficiency;

		public Integer getTotalDisable() {
			return this.totalDisable;
		}

		public void setTotalDisable(Integer totalDisable) {
			this.totalDisable = totalDisable;
		}

		public String getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(String updateTime) {
			this.updateTime = updateTime;
		}

		public Integer getSample() {
			return this.sample;
		}

		public void setSample(Integer sample) {
			this.sample = sample;
		}

		public Integer getTotalMark() {
			return this.totalMark;
		}

		public void setTotalMark(Integer totalMark) {
			this.totalMark = totalMark;
		}

		public Integer getNoRejectMark() {
			return this.noRejectMark;
		}

		public void setNoRejectMark(Integer noRejectMark) {
			this.noRejectMark = noRejectMark;
		}

		public Integer getTotalChecked() {
			return this.totalChecked;
		}

		public void setTotalChecked(Integer totalChecked) {
			this.totalChecked = totalChecked;
		}

		public Integer getCheckedError() {
			return this.checkedError;
		}

		public void setCheckedError(Integer checkedError) {
			this.checkedError = checkedError;
		}

		public Float getCheckedAccuracy() {
			return this.checkedAccuracy;
		}

		public void setCheckedAccuracy(Float checkedAccuracy) {
			this.checkedAccuracy = checkedAccuracy;
		}

		public Integer getCheckedReject() {
			return this.checkedReject;
		}

		public void setCheckedReject(Integer checkedReject) {
			this.checkedReject = checkedReject;
		}

		public Integer getCheckedFix() {
			return this.checkedFix;
		}

		public void setCheckedFix(Integer checkedFix) {
			this.checkedFix = checkedFix;
		}

		public Integer getTotalSampled() {
			return this.totalSampled;
		}

		public void setTotalSampled(Integer totalSampled) {
			this.totalSampled = totalSampled;
		}

		public Integer getSampledError() {
			return this.sampledError;
		}

		public void setSampledError(Integer sampledError) {
			this.sampledError = sampledError;
		}

		public Integer getSampledReject() {
			return this.sampledReject;
		}

		public void setSampledReject(Integer sampledReject) {
			this.sampledReject = sampledReject;
		}

		public Integer getSampledFix() {
			return this.sampledFix;
		}

		public void setSampledFix(Integer sampledFix) {
			this.sampledFix = sampledFix;
		}

		public Float getSampledAccuracy() {
			return this.sampledAccuracy;
		}

		public void setSampledAccuracy(Float sampledAccuracy) {
			this.sampledAccuracy = sampledAccuracy;
		}

		public Integer getTotalSampling() {
			return this.totalSampling;
		}

		public void setTotalSampling(Integer totalSampling) {
			this.totalSampling = totalSampling;
		}

		public Integer getSamplingError() {
			return this.samplingError;
		}

		public void setSamplingError(Integer samplingError) {
			this.samplingError = samplingError;
		}

		public Integer getSamplingReject() {
			return this.samplingReject;
		}

		public void setSamplingReject(Integer samplingReject) {
			this.samplingReject = samplingReject;
		}

		public Integer getSamplingFix() {
			return this.samplingFix;
		}

		public void setSamplingFix(Integer samplingFix) {
			this.samplingFix = samplingFix;
		}

		public Float getSamplingAccuracy() {
			return this.samplingAccuracy;
		}

		public void setSamplingAccuracy(Float samplingAccuracy) {
			this.samplingAccuracy = samplingAccuracy;
		}

		public Integer getTotalCheck() {
			return this.totalCheck;
		}

		public void setTotalCheck(Integer totalCheck) {
			this.totalCheck = totalCheck;
		}

		public Integer getNoRejectCheck() {
			return this.noRejectCheck;
		}

		public void setNoRejectCheck(Integer noRejectCheck) {
			this.noRejectCheck = noRejectCheck;
		}

		public Integer getCheckError() {
			return this.checkError;
		}

		public void setCheckError(Integer checkError) {
			this.checkError = checkError;
		}

		public Float getCheckAccuracy() {
			return this.checkAccuracy;
		}

		public void setCheckAccuracy(Float checkAccuracy) {
			this.checkAccuracy = checkAccuracy;
		}

		public Integer getCheckReject() {
			return this.checkReject;
		}

		public void setCheckReject(Integer checkReject) {
			this.checkReject = checkReject;
		}

		public Integer getCheckFix() {
			return this.checkFix;
		}

		public void setCheckFix(Integer checkFix) {
			this.checkFix = checkFix;
		}

		public String getUserName() {
			return this.userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public String getTaskId() {
			return this.taskId;
		}

		public void setTaskId(String taskId) {
			this.taskId = taskId;
		}

		public String getTaskName() {
			return this.taskName;
		}

		public void setTaskName(String taskName) {
			this.taskName = taskName;
		}

		public String getBizClassify() {
			return this.bizClassify;
		}

		public void setBizClassify(String bizClassify) {
			this.bizClassify = bizClassify;
		}

		public String getWorkflow() {
			return this.workflow;
		}

		public void setWorkflow(String workflow) {
			this.workflow = workflow;
		}

		public String getWorkTime() {
			return this.workTime;
		}

		public void setWorkTime(String workTime) {
			this.workTime = workTime;
		}

		public Long getTotalPDF() {
			return this.totalPDF;
		}

		public void setTotalPDF(Long totalPDF) {
			this.totalPDF = totalPDF;
		}

		public Long getNoRejectPDF() {
			return this.noRejectPDF;
		}

		public void setNoRejectPDF(Long noRejectPDF) {
			this.noRejectPDF = noRejectPDF;
		}

		public Long getTotalAudio() {
			return this.totalAudio;
		}

		public void setTotalAudio(Long totalAudio) {
			this.totalAudio = totalAudio;
		}

		public Long getNoRejectAudio() {
			return this.noRejectAudio;
		}

		public void setNoRejectAudio(Long noRejectAudio) {
			this.noRejectAudio = noRejectAudio;
		}

		public Long getTotalVideo() {
			return this.totalVideo;
		}

		public void setTotalVideo(Long totalVideo) {
			this.totalVideo = totalVideo;
		}

		public Long getNoRejectVideo() {
			return this.noRejectVideo;
		}

		public void setNoRejectVideo(Long noRejectVideo) {
			this.noRejectVideo = noRejectVideo;
		}

		public Float getMarkTime() {
			return this.markTime;
		}

		public void setMarkTime(Float markTime) {
			this.markTime = markTime;
		}

		public Float getMarkEfficiency() {
			return this.markEfficiency;
		}

		public void setMarkEfficiency(Float markEfficiency) {
			this.markEfficiency = markEfficiency;
		}

		public Float getCheckTime() {
			return this.checkTime;
		}

		public void setCheckTime(Float checkTime) {
			this.checkTime = checkTime;
		}

		public Float getCheckEfficiency() {
			return this.checkEfficiency;
		}

		public void setCheckEfficiency(Float checkEfficiency) {
			this.checkEfficiency = checkEfficiency;
		}
	}

	@Override
	public GetMarkUserSummaryResponse getInstance(UnmarshallerContext context) {
		return	GetMarkUserSummaryResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
