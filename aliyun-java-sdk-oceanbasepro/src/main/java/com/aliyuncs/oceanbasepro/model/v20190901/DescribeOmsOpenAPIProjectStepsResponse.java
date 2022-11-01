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

package com.aliyuncs.oceanbasepro.model.v20190901;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.oceanbasepro.transform.v20190901.DescribeOmsOpenAPIProjectStepsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeOmsOpenAPIProjectStepsResponse extends AcsResponse {

	private Boolean success;

	private String code;

	private String message;

	private String advice;

	private String requestId;

	private Integer pageNumber;

	private Integer pageSize;

	private Long totalCount;

	private String cost;

	private List<DataItem> data;

	private ErrorDetail1 errorDetail1;

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
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

	public String getAdvice() {
		return this.advice;
	}

	public void setAdvice(String advice) {
		this.advice = advice;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public String getCost() {
		return this.cost;
	}

	public void setCost(String cost) {
		this.cost = cost;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public ErrorDetail1 getErrorDetail1() {
		return this.errorDetail1;
	}

	public void setErrorDetail1(ErrorDetail1 errorDetail1) {
		this.errorDetail1 = errorDetail1;
	}

	public static class DataItem {

		private Integer stepOrder;

		private String stepName;

		private String stepDescription;

		private String stepStatus;

		private Integer stepProgress;

		private String startTime;

		private Long estimatedRemainingSeconds;

		private String finishTime;

		private Boolean interactive;

		private StepInfo stepInfo;

		private ExtraInfo extraInfo;

		public Integer getStepOrder() {
			return this.stepOrder;
		}

		public void setStepOrder(Integer stepOrder) {
			this.stepOrder = stepOrder;
		}

		public String getStepName() {
			return this.stepName;
		}

		public void setStepName(String stepName) {
			this.stepName = stepName;
		}

		public String getStepDescription() {
			return this.stepDescription;
		}

		public void setStepDescription(String stepDescription) {
			this.stepDescription = stepDescription;
		}

		public String getStepStatus() {
			return this.stepStatus;
		}

		public void setStepStatus(String stepStatus) {
			this.stepStatus = stepStatus;
		}

		public Integer getStepProgress() {
			return this.stepProgress;
		}

		public void setStepProgress(Integer stepProgress) {
			this.stepProgress = stepProgress;
		}

		public String getStartTime() {
			return this.startTime;
		}

		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}

		public Long getEstimatedRemainingSeconds() {
			return this.estimatedRemainingSeconds;
		}

		public void setEstimatedRemainingSeconds(Long estimatedRemainingSeconds) {
			this.estimatedRemainingSeconds = estimatedRemainingSeconds;
		}

		public String getFinishTime() {
			return this.finishTime;
		}

		public void setFinishTime(String finishTime) {
			this.finishTime = finishTime;
		}

		public Boolean getInteractive() {
			return this.interactive;
		}

		public void setInteractive(Boolean interactive) {
			this.interactive = interactive;
		}

		public StepInfo getStepInfo() {
			return this.stepInfo;
		}

		public void setStepInfo(StepInfo stepInfo) {
			this.stepInfo = stepInfo;
		}

		public ExtraInfo getExtraInfo() {
			return this.extraInfo;
		}

		public void setExtraInfo(ExtraInfo extraInfo) {
			this.extraInfo = extraInfo;
		}

		public static class StepInfo {

			private String jobId;

			private Long incrTimestampCheckpoint;

			private String checkpoint;

			private Long gmt;

			private Boolean validated;

			private Boolean skipped;

			private Long inconsistencies;

			private String deployId;

			private Long processedRecords;

			private Long capacity;

			private Long srcRps;

			private Long srcRt;

			private Long srcIops;

			private Long dstRps;

			private Long dstRt;

			private Long dstIops;

			private Long srcRpsRef;

			private Long srcRtRef;

			private Long dstRpsRef;

			private Long dstRtRef;

			private Long srcIopsRef;

			private ConnectorFullProgressOverview connectorFullProgressOverview;

			public String getJobId() {
				return this.jobId;
			}

			public void setJobId(String jobId) {
				this.jobId = jobId;
			}

			public Long getIncrTimestampCheckpoint() {
				return this.incrTimestampCheckpoint;
			}

			public void setIncrTimestampCheckpoint(Long incrTimestampCheckpoint) {
				this.incrTimestampCheckpoint = incrTimestampCheckpoint;
			}

			public String getCheckpoint() {
				return this.checkpoint;
			}

			public void setCheckpoint(String checkpoint) {
				this.checkpoint = checkpoint;
			}

			public Long getGmt() {
				return this.gmt;
			}

			public void setGmt(Long gmt) {
				this.gmt = gmt;
			}

			public Boolean getValidated() {
				return this.validated;
			}

			public void setValidated(Boolean validated) {
				this.validated = validated;
			}

			public Boolean getSkipped() {
				return this.skipped;
			}

			public void setSkipped(Boolean skipped) {
				this.skipped = skipped;
			}

			public Long getInconsistencies() {
				return this.inconsistencies;
			}

			public void setInconsistencies(Long inconsistencies) {
				this.inconsistencies = inconsistencies;
			}

			public String getDeployId() {
				return this.deployId;
			}

			public void setDeployId(String deployId) {
				this.deployId = deployId;
			}

			public Long getProcessedRecords() {
				return this.processedRecords;
			}

			public void setProcessedRecords(Long processedRecords) {
				this.processedRecords = processedRecords;
			}

			public Long getCapacity() {
				return this.capacity;
			}

			public void setCapacity(Long capacity) {
				this.capacity = capacity;
			}

			public Long getSrcRps() {
				return this.srcRps;
			}

			public void setSrcRps(Long srcRps) {
				this.srcRps = srcRps;
			}

			public Long getSrcRt() {
				return this.srcRt;
			}

			public void setSrcRt(Long srcRt) {
				this.srcRt = srcRt;
			}

			public Long getSrcIops() {
				return this.srcIops;
			}

			public void setSrcIops(Long srcIops) {
				this.srcIops = srcIops;
			}

			public Long getDstRps() {
				return this.dstRps;
			}

			public void setDstRps(Long dstRps) {
				this.dstRps = dstRps;
			}

			public Long getDstRt() {
				return this.dstRt;
			}

			public void setDstRt(Long dstRt) {
				this.dstRt = dstRt;
			}

			public Long getDstIops() {
				return this.dstIops;
			}

			public void setDstIops(Long dstIops) {
				this.dstIops = dstIops;
			}

			public Long getSrcRpsRef() {
				return this.srcRpsRef;
			}

			public void setSrcRpsRef(Long srcRpsRef) {
				this.srcRpsRef = srcRpsRef;
			}

			public Long getSrcRtRef() {
				return this.srcRtRef;
			}

			public void setSrcRtRef(Long srcRtRef) {
				this.srcRtRef = srcRtRef;
			}

			public Long getDstRpsRef() {
				return this.dstRpsRef;
			}

			public void setDstRpsRef(Long dstRpsRef) {
				this.dstRpsRef = dstRpsRef;
			}

			public Long getDstRtRef() {
				return this.dstRtRef;
			}

			public void setDstRtRef(Long dstRtRef) {
				this.dstRtRef = dstRtRef;
			}

			public Long getSrcIopsRef() {
				return this.srcIopsRef;
			}

			public void setSrcIopsRef(Long srcIopsRef) {
				this.srcIopsRef = srcIopsRef;
			}

			public ConnectorFullProgressOverview getConnectorFullProgressOverview() {
				return this.connectorFullProgressOverview;
			}

			public void setConnectorFullProgressOverview(ConnectorFullProgressOverview connectorFullProgressOverview) {
				this.connectorFullProgressOverview = connectorFullProgressOverview;
			}

			public static class ConnectorFullProgressOverview {

				private Long estimatedTotalCount;

				private Long finishedCount;

				private Integer progress;

				private Long estimatedRemainingTimeOfSec;

				public Long getEstimatedTotalCount() {
					return this.estimatedTotalCount;
				}

				public void setEstimatedTotalCount(Long estimatedTotalCount) {
					this.estimatedTotalCount = estimatedTotalCount;
				}

				public Long getFinishedCount() {
					return this.finishedCount;
				}

				public void setFinishedCount(Long finishedCount) {
					this.finishedCount = finishedCount;
				}

				public Integer getProgress() {
					return this.progress;
				}

				public void setProgress(Integer progress) {
					this.progress = progress;
				}

				public Long getEstimatedRemainingTimeOfSec() {
					return this.estimatedRemainingTimeOfSec;
				}

				public void setEstimatedRemainingTimeOfSec(Long estimatedRemainingTimeOfSec) {
					this.estimatedRemainingTimeOfSec = estimatedRemainingTimeOfSec;
				}
			}
		}

		public static class ExtraInfo {

			private String errorCode;

			private String errorMsg;

			private Map<Object,Object> errorParam;

			private String failedTime;

			private List<ErrorDetail> errorDetails;

			public String getErrorCode() {
				return this.errorCode;
			}

			public void setErrorCode(String errorCode) {
				this.errorCode = errorCode;
			}

			public String getErrorMsg() {
				return this.errorMsg;
			}

			public void setErrorMsg(String errorMsg) {
				this.errorMsg = errorMsg;
			}

			public Map<Object,Object> getErrorParam() {
				return this.errorParam;
			}

			public void setErrorParam(Map<Object,Object> errorParam) {
				this.errorParam = errorParam;
			}

			public String getFailedTime() {
				return this.failedTime;
			}

			public void setFailedTime(String failedTime) {
				this.failedTime = failedTime;
			}

			public List<ErrorDetail> getErrorDetails() {
				return this.errorDetails;
			}

			public void setErrorDetails(List<ErrorDetail> errorDetails) {
				this.errorDetails = errorDetails;
			}

			public static class ErrorDetail {

				private String code;

				private String level;

				private String message;

				private String proposal;

				public String getCode() {
					return this.code;
				}

				public void setCode(String code) {
					this.code = code;
				}

				public String getLevel() {
					return this.level;
				}

				public void setLevel(String level) {
					this.level = level;
				}

				public String getMessage() {
					return this.message;
				}

				public void setMessage(String message) {
					this.message = message;
				}

				public String getProposal() {
					return this.proposal;
				}

				public void setProposal(String proposal) {
					this.proposal = proposal;
				}
			}
		}
	}

	public static class ErrorDetail1 {

		private String code;

		private String level;

		private String message;

		private String proposal;

		public String getCode() {
			return this.code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getLevel() {
			return this.level;
		}

		public void setLevel(String level) {
			this.level = level;
		}

		public String getMessage() {
			return this.message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public String getProposal() {
			return this.proposal;
		}

		public void setProposal(String proposal) {
			this.proposal = proposal;
		}
	}

	@Override
	public DescribeOmsOpenAPIProjectStepsResponse getInstance(UnmarshallerContext context) {
		return	DescribeOmsOpenAPIProjectStepsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
