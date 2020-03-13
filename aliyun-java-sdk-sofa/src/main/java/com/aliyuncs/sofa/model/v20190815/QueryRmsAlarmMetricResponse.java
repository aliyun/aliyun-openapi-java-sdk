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

package com.aliyuncs.sofa.model.v20190815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sofa.transform.v20190815.QueryRmsAlarmMetricResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryRmsAlarmMetricResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private List<ResponseItem> response;

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

	public List<ResponseItem> getResponse() {
		return this.response;
	}

	public void setResponse(List<ResponseItem> response) {
		this.response = response;
	}

	public static class ResponseItem {

		private Long alertLevel;

		private Boolean hasOne;

		private String id;

		private String magName;

		private Boolean open;

		private List<MasItem> mas;

		private List<SubersItem> subers;

		private At at;

		private Status status;

		public Long getAlertLevel() {
			return this.alertLevel;
		}

		public void setAlertLevel(Long alertLevel) {
			this.alertLevel = alertLevel;
		}

		public Boolean getHasOne() {
			return this.hasOne;
		}

		public void setHasOne(Boolean hasOne) {
			this.hasOne = hasOne;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getMagName() {
			return this.magName;
		}

		public void setMagName(String magName) {
			this.magName = magName;
		}

		public Boolean getOpen() {
			return this.open;
		}

		public void setOpen(Boolean open) {
			this.open = open;
		}

		public List<MasItem> getMas() {
			return this.mas;
		}

		public void setMas(List<MasItem> mas) {
			this.mas = mas;
		}

		public List<SubersItem> getSubers() {
			return this.subers;
		}

		public void setSubers(List<SubersItem> subers) {
			this.subers = subers;
		}

		public At getAt() {
			return this.at;
		}

		public void setAt(At at) {
			this.at = at;
		}

		public Status getStatus() {
			return this.status;
		}

		public void setStatus(Status status) {
			this.status = status;
		}

		public static class MasItem {

			private Boolean hasOne;

			private Long id;

			private String maName;

			private List<TriggersItem> triggers;

			private Am am;

			public Boolean getHasOne() {
				return this.hasOne;
			}

			public void setHasOne(Boolean hasOne) {
				this.hasOne = hasOne;
			}

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getMaName() {
				return this.maName;
			}

			public void setMaName(String maName) {
				this.maName = maName;
			}

			public List<TriggersItem> getTriggers() {
				return this.triggers;
			}

			public void setTriggers(List<TriggersItem> triggers) {
				this.triggers = triggers;
			}

			public Am getAm() {
				return this.am;
			}

			public void setAm(Am am) {
				this.am = am;
			}

			public static class TriggersItem {

				private String aggregator;

				private Long id;

				private String n;

				private String threshold;

				private String triggerOperator;

				private String triggerType;

				private Downsample downsample;

				public String getAggregator() {
					return this.aggregator;
				}

				public void setAggregator(String aggregator) {
					this.aggregator = aggregator;
				}

				public Long getId() {
					return this.id;
				}

				public void setId(Long id) {
					this.id = id;
				}

				public String getN() {
					return this.n;
				}

				public void setN(String n) {
					this.n = n;
				}

				public String getThreshold() {
					return this.threshold;
				}

				public void setThreshold(String threshold) {
					this.threshold = threshold;
				}

				public String getTriggerOperator() {
					return this.triggerOperator;
				}

				public void setTriggerOperator(String triggerOperator) {
					this.triggerOperator = triggerOperator;
				}

				public String getTriggerType() {
					return this.triggerType;
				}

				public void setTriggerType(String triggerType) {
					this.triggerType = triggerType;
				}

				public Downsample getDownsample() {
					return this.downsample;
				}

				public void setDownsample(Downsample downsample) {
					this.downsample = downsample;
				}

				public static class Downsample {

					private String aggregator;

					private String interval;

					private String units;

					public String getAggregator() {
						return this.aggregator;
					}

					public void setAggregator(String aggregator) {
						this.aggregator = aggregator;
					}

					public String getInterval() {
						return this.interval;
					}

					public void setInterval(String interval) {
						this.interval = interval;
					}

					public String getUnits() {
						return this.units;
					}

					public void setUnits(String units) {
						this.units = units;
					}
				}
			}

			public static class Am {

				private String metricName;

				private List<BlackListsItem> blackLists;

				private List<WhiteListsItem> whiteLists;

				public String getMetricName() {
					return this.metricName;
				}

				public void setMetricName(String metricName) {
					this.metricName = metricName;
				}

				public List<BlackListsItem> getBlackLists() {
					return this.blackLists;
				}

				public void setBlackLists(List<BlackListsItem> blackLists) {
					this.blackLists = blackLists;
				}

				public List<WhiteListsItem> getWhiteLists() {
					return this.whiteLists;
				}

				public void setWhiteLists(List<WhiteListsItem> whiteLists) {
					this.whiteLists = whiteLists;
				}

				public static class BlackListsItem {

					private String key;

					private List<String> values;

					public String getKey() {
						return this.key;
					}

					public void setKey(String key) {
						this.key = key;
					}

					public List<String> getValues() {
						return this.values;
					}

					public void setValues(List<String> values) {
						this.values = values;
					}
				}

				public static class WhiteListsItem {

					private String key;

					private List<String> values1;

					public String getKey() {
						return this.key;
					}

					public void setKey(String key) {
						this.key = key;
					}

					public List<String> getValues1() {
						return this.values1;
					}

					public void setValues1(List<String> values1) {
						this.values1 = values1;
					}
				}
			}
		}

		public static class SubersItem {

			private String suberId;

			private String suberType;

			public String getSuberId() {
				return this.suberId;
			}

			public void setSuberId(String suberId) {
				this.suberId = suberId;
			}

			public String getSuberType() {
				return this.suberType;
			}

			public void setSuberType(String suberType) {
				this.suberType = suberType;
			}
		}

		public static class At {

			private Long checkMinute;

			private Long endTime;

			private Long pauseEndTime;

			private Long pauseStartTime;

			private Long silentPeriod;

			private Long startTime;

			public Long getCheckMinute() {
				return this.checkMinute;
			}

			public void setCheckMinute(Long checkMinute) {
				this.checkMinute = checkMinute;
			}

			public Long getEndTime() {
				return this.endTime;
			}

			public void setEndTime(Long endTime) {
				this.endTime = endTime;
			}

			public Long getPauseEndTime() {
				return this.pauseEndTime;
			}

			public void setPauseEndTime(Long pauseEndTime) {
				this.pauseEndTime = pauseEndTime;
			}

			public Long getPauseStartTime() {
				return this.pauseStartTime;
			}

			public void setPauseStartTime(Long pauseStartTime) {
				this.pauseStartTime = pauseStartTime;
			}

			public Long getSilentPeriod() {
				return this.silentPeriod;
			}

			public void setSilentPeriod(Long silentPeriod) {
				this.silentPeriod = silentPeriod;
			}

			public Long getStartTime() {
				return this.startTime;
			}

			public void setStartTime(Long startTime) {
				this.startTime = startTime;
			}
		}

		public static class Status {

			private Boolean lastCheckResult;

			private Boolean lastCheckSuccess;

			private Long lastCheckTime;

			private Long lastNotifyTime;

			public Boolean getLastCheckResult() {
				return this.lastCheckResult;
			}

			public void setLastCheckResult(Boolean lastCheckResult) {
				this.lastCheckResult = lastCheckResult;
			}

			public Boolean getLastCheckSuccess() {
				return this.lastCheckSuccess;
			}

			public void setLastCheckSuccess(Boolean lastCheckSuccess) {
				this.lastCheckSuccess = lastCheckSuccess;
			}

			public Long getLastCheckTime() {
				return this.lastCheckTime;
			}

			public void setLastCheckTime(Long lastCheckTime) {
				this.lastCheckTime = lastCheckTime;
			}

			public Long getLastNotifyTime() {
				return this.lastNotifyTime;
			}

			public void setLastNotifyTime(Long lastNotifyTime) {
				this.lastNotifyTime = lastNotifyTime;
			}
		}
	}

	@Override
	public QueryRmsAlarmMetricResponse getInstance(UnmarshallerContext context) {
		return	QueryRmsAlarmMetricResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
