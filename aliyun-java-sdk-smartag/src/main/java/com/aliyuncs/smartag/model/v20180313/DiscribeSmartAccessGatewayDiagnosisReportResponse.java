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

package com.aliyuncs.smartag.model.v20180313;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.smartag.transform.v20180313.DiscribeSmartAccessGatewayDiagnosisReportResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DiscribeSmartAccessGatewayDiagnosisReportResponse extends AcsResponse {

	private String requestId;

	private DiagnoseResult diagnoseResult;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public DiagnoseResult getDiagnoseResult() {
		return this.diagnoseResult;
	}

	public void setDiagnoseResult(DiagnoseResult diagnoseResult) {
		this.diagnoseResult = diagnoseResult;
	}

	public static class DiagnoseResult {

		private Integer percent;

		private String sN;

		private String diagnoseId;

		private String state;

		private String userLevel;

		private String boxVersion;

		private String instanceId;

		private String boxType;

		private String monitorVersion;

		private Integer finishedNumber;

		private String uId;

		private Integer endTime;

		private Integer startTime;

		private String parameters;

		private String storeType;

		private Integer reportSLSSuccess;

		private Integer totalNumber;

		private List<Detail> details;

		private Level level;

		private Statistics statistics;

		public Integer getPercent() {
			return this.percent;
		}

		public void setPercent(Integer percent) {
			this.percent = percent;
		}

		public String getSN() {
			return this.sN;
		}

		public void setSN(String sN) {
			this.sN = sN;
		}

		public String getDiagnoseId() {
			return this.diagnoseId;
		}

		public void setDiagnoseId(String diagnoseId) {
			this.diagnoseId = diagnoseId;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getUserLevel() {
			return this.userLevel;
		}

		public void setUserLevel(String userLevel) {
			this.userLevel = userLevel;
		}

		public String getBoxVersion() {
			return this.boxVersion;
		}

		public void setBoxVersion(String boxVersion) {
			this.boxVersion = boxVersion;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getBoxType() {
			return this.boxType;
		}

		public void setBoxType(String boxType) {
			this.boxType = boxType;
		}

		public String getMonitorVersion() {
			return this.monitorVersion;
		}

		public void setMonitorVersion(String monitorVersion) {
			this.monitorVersion = monitorVersion;
		}

		public Integer getFinishedNumber() {
			return this.finishedNumber;
		}

		public void setFinishedNumber(Integer finishedNumber) {
			this.finishedNumber = finishedNumber;
		}

		public String getUId() {
			return this.uId;
		}

		public void setUId(String uId) {
			this.uId = uId;
		}

		public Integer getEndTime() {
			return this.endTime;
		}

		public void setEndTime(Integer endTime) {
			this.endTime = endTime;
		}

		public Integer getStartTime() {
			return this.startTime;
		}

		public void setStartTime(Integer startTime) {
			this.startTime = startTime;
		}

		public String getParameters() {
			return this.parameters;
		}

		public void setParameters(String parameters) {
			this.parameters = parameters;
		}

		public String getStoreType() {
			return this.storeType;
		}

		public void setStoreType(String storeType) {
			this.storeType = storeType;
		}

		public Integer getReportSLSSuccess() {
			return this.reportSLSSuccess;
		}

		public void setReportSLSSuccess(Integer reportSLSSuccess) {
			this.reportSLSSuccess = reportSLSSuccess;
		}

		public Integer getTotalNumber() {
			return this.totalNumber;
		}

		public void setTotalNumber(Integer totalNumber) {
			this.totalNumber = totalNumber;
		}

		public List<Detail> getDetails() {
			return this.details;
		}

		public void setDetails(List<Detail> details) {
			this.details = details;
		}

		public Level getLevel() {
			return this.level;
		}

		public void setLevel(Level level) {
			this.level = level;
		}

		public Statistics getStatistics() {
			return this.statistics;
		}

		public void setStatistics(Statistics statistics) {
			this.statistics = statistics;
		}

		public static class Detail {

			private String type;

			private List<Item> items;

			private Statistics1 statistics1;

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public List<Item> getItems() {
				return this.items;
			}

			public void setItems(List<Item> items) {
				this.items = items;
			}

			public Statistics1 getStatistics1() {
				return this.statistics1;
			}

			public void setStatistics1(Statistics1 statistics1) {
				this.statistics1 = statistics1;
			}

			public static class Item {

				private String type;

				private Long endTime;

				private Long startTime;

				private String itemName;

				private String level;

				private CN cN;

				private EN eN;

				public String getType() {
					return this.type;
				}

				public void setType(String type) {
					this.type = type;
				}

				public Long getEndTime() {
					return this.endTime;
				}

				public void setEndTime(Long endTime) {
					this.endTime = endTime;
				}

				public Long getStartTime() {
					return this.startTime;
				}

				public void setStartTime(Long startTime) {
					this.startTime = startTime;
				}

				public String getItemName() {
					return this.itemName;
				}

				public void setItemName(String itemName) {
					this.itemName = itemName;
				}

				public String getLevel() {
					return this.level;
				}

				public void setLevel(String level) {
					this.level = level;
				}

				public CN getCN() {
					return this.cN;
				}

				public void setCN(CN cN) {
					this.cN = cN;
				}

				public EN getEN() {
					return this.eN;
				}

				public void setEN(EN eN) {
					this.eN = eN;
				}

				public static class CN {

					private String itemName;

					private String itemLevel;

					private String itemType;

					private List<String> advice;

					private List<String> details2;

					public String getItemName() {
						return this.itemName;
					}

					public void setItemName(String itemName) {
						this.itemName = itemName;
					}

					public String getItemLevel() {
						return this.itemLevel;
					}

					public void setItemLevel(String itemLevel) {
						this.itemLevel = itemLevel;
					}

					public String getItemType() {
						return this.itemType;
					}

					public void setItemType(String itemType) {
						this.itemType = itemType;
					}

					public List<String> getAdvice() {
						return this.advice;
					}

					public void setAdvice(List<String> advice) {
						this.advice = advice;
					}

					public List<String> getDetails2() {
						return this.details2;
					}

					public void setDetails2(List<String> details2) {
						this.details2 = details2;
					}
				}

				public static class EN {

					private String itemName;

					private String itemLevel;

					private String itemType;

					private List<String> advice3;

					private List<String> details4;

					public String getItemName() {
						return this.itemName;
					}

					public void setItemName(String itemName) {
						this.itemName = itemName;
					}

					public String getItemLevel() {
						return this.itemLevel;
					}

					public void setItemLevel(String itemLevel) {
						this.itemLevel = itemLevel;
					}

					public String getItemType() {
						return this.itemType;
					}

					public void setItemType(String itemType) {
						this.itemType = itemType;
					}

					public List<String> getAdvice3() {
						return this.advice3;
					}

					public void setAdvice3(List<String> advice3) {
						this.advice3 = advice3;
					}

					public List<String> getDetails4() {
						return this.details4;
					}

					public void setDetails4(List<String> details4) {
						this.details4 = details4;
					}
				}
			}

			public static class Statistics1 {

				private Integer warning;

				private Integer error;

				private Integer total;

				private Integer info;

				public Integer getWarning() {
					return this.warning;
				}

				public void setWarning(Integer warning) {
					this.warning = warning;
				}

				public Integer getError() {
					return this.error;
				}

				public void setError(Integer error) {
					this.error = error;
				}

				public Integer getTotal() {
					return this.total;
				}

				public void setTotal(Integer total) {
					this.total = total;
				}

				public Integer getInfo() {
					return this.info;
				}

				public void setInfo(Integer info) {
					this.info = info;
				}
			}
		}

		public static class Level {

			private String configuration;

			private String total;

			private String biz;

			public String getConfiguration() {
				return this.configuration;
			}

			public void setConfiguration(String configuration) {
				this.configuration = configuration;
			}

			public String getTotal() {
				return this.total;
			}

			public void setTotal(String total) {
				this.total = total;
			}

			public String getBiz() {
				return this.biz;
			}

			public void setBiz(String biz) {
				this.biz = biz;
			}
		}

		public static class Statistics {

			private Integer warning;

			private Integer error;

			private Integer total;

			private Integer info;

			public Integer getWarning() {
				return this.warning;
			}

			public void setWarning(Integer warning) {
				this.warning = warning;
			}

			public Integer getError() {
				return this.error;
			}

			public void setError(Integer error) {
				this.error = error;
			}

			public Integer getTotal() {
				return this.total;
			}

			public void setTotal(Integer total) {
				this.total = total;
			}

			public Integer getInfo() {
				return this.info;
			}

			public void setInfo(Integer info) {
				this.info = info;
			}
		}
	}

	@Override
	public DiscribeSmartAccessGatewayDiagnosisReportResponse getInstance(UnmarshallerContext context) {
		return	DiscribeSmartAccessGatewayDiagnosisReportResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
