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

package com.aliyuncs.outboundbot.model.v20191226;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.outboundbot.transform.v20191226.DescribeJobGroupResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeJobGroupResponse extends AcsResponse {

	private String code;

	private Integer httpStatusCode;

	private String message;

	private String requestId;

	private Boolean success;

	private JobGroup jobGroup;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
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

	public JobGroup getJobGroup() {
		return this.jobGroup;
	}

	public void setJobGroup(JobGroup jobGroup) {
		this.jobGroup = jobGroup;
	}

	public static class JobGroup {

		private Long creationTime;

		private String jobDataParsingTaskId;

		private String jobFilePath;

		private String jobGroupDescription;

		private String jobGroupId;

		private String jobGroupName;

		private String modifyTime;

		private String scenarioId;

		private String scriptId;

		private String scriptName;

		private String scriptVersion;

		private String status;

		private List<String> callingNumbers;

		private ExportProgress exportProgress;

		private Progress progress;

		private Strategy strategy;

		private Result result;

		public Long getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(Long creationTime) {
			this.creationTime = creationTime;
		}

		public String getJobDataParsingTaskId() {
			return this.jobDataParsingTaskId;
		}

		public void setJobDataParsingTaskId(String jobDataParsingTaskId) {
			this.jobDataParsingTaskId = jobDataParsingTaskId;
		}

		public String getJobFilePath() {
			return this.jobFilePath;
		}

		public void setJobFilePath(String jobFilePath) {
			this.jobFilePath = jobFilePath;
		}

		public String getJobGroupDescription() {
			return this.jobGroupDescription;
		}

		public void setJobGroupDescription(String jobGroupDescription) {
			this.jobGroupDescription = jobGroupDescription;
		}

		public String getJobGroupId() {
			return this.jobGroupId;
		}

		public void setJobGroupId(String jobGroupId) {
			this.jobGroupId = jobGroupId;
		}

		public String getJobGroupName() {
			return this.jobGroupName;
		}

		public void setJobGroupName(String jobGroupName) {
			this.jobGroupName = jobGroupName;
		}

		public String getModifyTime() {
			return this.modifyTime;
		}

		public void setModifyTime(String modifyTime) {
			this.modifyTime = modifyTime;
		}

		public String getScenarioId() {
			return this.scenarioId;
		}

		public void setScenarioId(String scenarioId) {
			this.scenarioId = scenarioId;
		}

		public String getScriptId() {
			return this.scriptId;
		}

		public void setScriptId(String scriptId) {
			this.scriptId = scriptId;
		}

		public String getScriptName() {
			return this.scriptName;
		}

		public void setScriptName(String scriptName) {
			this.scriptName = scriptName;
		}

		public String getScriptVersion() {
			return this.scriptVersion;
		}

		public void setScriptVersion(String scriptVersion) {
			this.scriptVersion = scriptVersion;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public List<String> getCallingNumbers() {
			return this.callingNumbers;
		}

		public void setCallingNumbers(List<String> callingNumbers) {
			this.callingNumbers = callingNumbers;
		}

		public ExportProgress getExportProgress() {
			return this.exportProgress;
		}

		public void setExportProgress(ExportProgress exportProgress) {
			this.exportProgress = exportProgress;
		}

		public Progress getProgress() {
			return this.progress;
		}

		public void setProgress(Progress progress) {
			this.progress = progress;
		}

		public Strategy getStrategy() {
			return this.strategy;
		}

		public void setStrategy(Strategy strategy) {
			this.strategy = strategy;
		}

		public Result getResult() {
			return this.result;
		}

		public void setResult(Result result) {
			this.result = result;
		}

		public static class ExportProgress {

			private String fileHttpUrl;

			private String progress;

			private String status;

			public String getFileHttpUrl() {
				return this.fileHttpUrl;
			}

			public void setFileHttpUrl(String fileHttpUrl) {
				this.fileHttpUrl = fileHttpUrl;
			}

			public String getProgress() {
				return this.progress;
			}

			public void setProgress(String progress) {
				this.progress = progress;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}
		}

		public static class Progress {

			private Integer cancelled;

			private Integer duration;

			private Integer executing;

			private Integer failed;

			private Integer paused;

			private Integer scheduling;

			private Long startTime;

			private String status;

			private Integer totalCompleted;

			private Integer totalJobs;

			private Integer totalNotAnswered;

			private List<KeyValuePair> briefs;

			private List<KeyValuePair> categories;

			public Integer getCancelled() {
				return this.cancelled;
			}

			public void setCancelled(Integer cancelled) {
				this.cancelled = cancelled;
			}

			public Integer getDuration() {
				return this.duration;
			}

			public void setDuration(Integer duration) {
				this.duration = duration;
			}

			public Integer getExecuting() {
				return this.executing;
			}

			public void setExecuting(Integer executing) {
				this.executing = executing;
			}

			public Integer getFailed() {
				return this.failed;
			}

			public void setFailed(Integer failed) {
				this.failed = failed;
			}

			public Integer getPaused() {
				return this.paused;
			}

			public void setPaused(Integer paused) {
				this.paused = paused;
			}

			public Integer getScheduling() {
				return this.scheduling;
			}

			public void setScheduling(Integer scheduling) {
				this.scheduling = scheduling;
			}

			public Long getStartTime() {
				return this.startTime;
			}

			public void setStartTime(Long startTime) {
				this.startTime = startTime;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public Integer getTotalCompleted() {
				return this.totalCompleted;
			}

			public void setTotalCompleted(Integer totalCompleted) {
				this.totalCompleted = totalCompleted;
			}

			public Integer getTotalJobs() {
				return this.totalJobs;
			}

			public void setTotalJobs(Integer totalJobs) {
				this.totalJobs = totalJobs;
			}

			public Integer getTotalNotAnswered() {
				return this.totalNotAnswered;
			}

			public void setTotalNotAnswered(Integer totalNotAnswered) {
				this.totalNotAnswered = totalNotAnswered;
			}

			public List<KeyValuePair> getBriefs() {
				return this.briefs;
			}

			public void setBriefs(List<KeyValuePair> briefs) {
				this.briefs = briefs;
			}

			public List<KeyValuePair> getCategories() {
				return this.categories;
			}

			public void setCategories(List<KeyValuePair> categories) {
				this.categories = categories;
			}

			public static class KeyValuePair {

				private String key;

				private String value;

				public String getKey() {
					return this.key;
				}

				public void setKey(String key) {
					this.key = key;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}
		}

		public static class Strategy {

			private String customized;

			private Long endTime;

			private String followUpStrategy;

			private Boolean isTemplate;

			private Integer maxAttemptsPerDay;

			private Integer minAttemptInterval;

			private String repeatBy;

			private String routingStrategy;

			private Long startTime;

			private String strategyDescription;

			private String strategyId;

			private String strategyName;

			private String type;

			private List<TimeFrame> workingTime;

			private List<String> repeatDays;

			public String getCustomized() {
				return this.customized;
			}

			public void setCustomized(String customized) {
				this.customized = customized;
			}

			public Long getEndTime() {
				return this.endTime;
			}

			public void setEndTime(Long endTime) {
				this.endTime = endTime;
			}

			public String getFollowUpStrategy() {
				return this.followUpStrategy;
			}

			public void setFollowUpStrategy(String followUpStrategy) {
				this.followUpStrategy = followUpStrategy;
			}

			public Boolean getIsTemplate() {
				return this.isTemplate;
			}

			public void setIsTemplate(Boolean isTemplate) {
				this.isTemplate = isTemplate;
			}

			public Integer getMaxAttemptsPerDay() {
				return this.maxAttemptsPerDay;
			}

			public void setMaxAttemptsPerDay(Integer maxAttemptsPerDay) {
				this.maxAttemptsPerDay = maxAttemptsPerDay;
			}

			public Integer getMinAttemptInterval() {
				return this.minAttemptInterval;
			}

			public void setMinAttemptInterval(Integer minAttemptInterval) {
				this.minAttemptInterval = minAttemptInterval;
			}

			public String getRepeatBy() {
				return this.repeatBy;
			}

			public void setRepeatBy(String repeatBy) {
				this.repeatBy = repeatBy;
			}

			public String getRoutingStrategy() {
				return this.routingStrategy;
			}

			public void setRoutingStrategy(String routingStrategy) {
				this.routingStrategy = routingStrategy;
			}

			public Long getStartTime() {
				return this.startTime;
			}

			public void setStartTime(Long startTime) {
				this.startTime = startTime;
			}

			public String getStrategyDescription() {
				return this.strategyDescription;
			}

			public void setStrategyDescription(String strategyDescription) {
				this.strategyDescription = strategyDescription;
			}

			public String getStrategyId() {
				return this.strategyId;
			}

			public void setStrategyId(String strategyId) {
				this.strategyId = strategyId;
			}

			public String getStrategyName() {
				return this.strategyName;
			}

			public void setStrategyName(String strategyName) {
				this.strategyName = strategyName;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public List<TimeFrame> getWorkingTime() {
				return this.workingTime;
			}

			public void setWorkingTime(List<TimeFrame> workingTime) {
				this.workingTime = workingTime;
			}

			public List<String> getRepeatDays() {
				return this.repeatDays;
			}

			public void setRepeatDays(List<String> repeatDays) {
				this.repeatDays = repeatDays;
			}

			public static class TimeFrame {

				private String beginTime;

				private String endTime;

				public String getBeginTime() {
					return this.beginTime;
				}

				public void setBeginTime(String beginTime) {
					this.beginTime = beginTime;
				}

				public String getEndTime() {
					return this.endTime;
				}

				public void setEndTime(String endTime) {
					this.endTime = endTime;
				}
			}
		}

		public static class Result {

			private Integer noInteractNum;

			private Integer finishedNum;

			private Integer clientHangupNum;

			private Integer timeoutHangupNum;

			private Integer unrecognizedNum;

			public Integer getNoInteractNum() {
				return this.noInteractNum;
			}

			public void setNoInteractNum(Integer noInteractNum) {
				this.noInteractNum = noInteractNum;
			}

			public Integer getFinishedNum() {
				return this.finishedNum;
			}

			public void setFinishedNum(Integer finishedNum) {
				this.finishedNum = finishedNum;
			}

			public Integer getClientHangupNum() {
				return this.clientHangupNum;
			}

			public void setClientHangupNum(Integer clientHangupNum) {
				this.clientHangupNum = clientHangupNum;
			}

			public Integer getTimeoutHangupNum() {
				return this.timeoutHangupNum;
			}

			public void setTimeoutHangupNum(Integer timeoutHangupNum) {
				this.timeoutHangupNum = timeoutHangupNum;
			}

			public Integer getUnrecognizedNum() {
				return this.unrecognizedNum;
			}

			public void setUnrecognizedNum(Integer unrecognizedNum) {
				this.unrecognizedNum = unrecognizedNum;
			}
		}
	}

	@Override
	public DescribeJobGroupResponse getInstance(UnmarshallerContext context) {
		return	DescribeJobGroupResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
