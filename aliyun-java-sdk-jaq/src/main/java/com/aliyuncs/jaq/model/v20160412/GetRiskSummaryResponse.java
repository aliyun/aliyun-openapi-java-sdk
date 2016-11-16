/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.jaq.model.v20160412;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.jaq.transform.v20160412.GetRiskSummaryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetRiskSummaryResponse extends AcsResponse {

	private Integer errorCode;

	private String errorMsg;

	private Data data;

	public Integer getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(Integer errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMsg() {
		return this.errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Integer taskStatus;

		private VulnInfo vulnInfo;

		private MalwareInfo malwareInfo;

		private FakeInfo fakeInfo;

		private PluginInfo pluginInfo;

		public Integer getTaskStatus() {
			return this.taskStatus;
		}

		public void setTaskStatus(Integer taskStatus) {
			this.taskStatus = taskStatus;
		}

		public VulnInfo getVulnInfo() {
			return this.vulnInfo;
		}

		public void setVulnInfo(VulnInfo vulnInfo) {
			this.vulnInfo = vulnInfo;
		}

		public MalwareInfo getMalwareInfo() {
			return this.malwareInfo;
		}

		public void setMalwareInfo(MalwareInfo malwareInfo) {
			this.malwareInfo = malwareInfo;
		}

		public FakeInfo getFakeInfo() {
			return this.fakeInfo;
		}

		public void setFakeInfo(FakeInfo fakeInfo) {
			this.fakeInfo = fakeInfo;
		}

		public PluginInfo getPluginInfo() {
			return this.pluginInfo;
		}

		public void setPluginInfo(PluginInfo pluginInfo) {
			this.pluginInfo = pluginInfo;
		}

		public static class VulnInfo {

			private Integer status;

			private VulnCount vulnCount;

			public Integer getStatus() {
				return this.status;
			}

			public void setStatus(Integer status) {
				this.status = status;
			}

			public VulnCount getVulnCount() {
				return this.vulnCount;
			}

			public void setVulnCount(VulnCount vulnCount) {
				this.vulnCount = vulnCount;
			}

			public static class VulnCount {

				private Long total;

				private Long redLine;

				private Long highLevel;

				private Long midLevel;

				private Long lowLevel;

				public Long getTotal() {
					return this.total;
				}

				public void setTotal(Long total) {
					this.total = total;
				}

				public Long getRedLine() {
					return this.redLine;
				}

				public void setRedLine(Long redLine) {
					this.redLine = redLine;
				}

				public Long getHighLevel() {
					return this.highLevel;
				}

				public void setHighLevel(Long highLevel) {
					this.highLevel = highLevel;
				}

				public Long getMidLevel() {
					return this.midLevel;
				}

				public void setMidLevel(Long midLevel) {
					this.midLevel = midLevel;
				}

				public Long getLowLevel() {
					return this.lowLevel;
				}

				public void setLowLevel(Long lowLevel) {
					this.lowLevel = lowLevel;
				}
			}
		}

		public static class MalwareInfo {

			private Integer status;

			private Integer detectResult;

			private MalwareCount malwareCount;

			public Integer getStatus() {
				return this.status;
			}

			public void setStatus(Integer status) {
				this.status = status;
			}

			public Integer getDetectResult() {
				return this.detectResult;
			}

			public void setDetectResult(Integer detectResult) {
				this.detectResult = detectResult;
			}

			public MalwareCount getMalwareCount() {
				return this.malwareCount;
			}

			public void setMalwareCount(MalwareCount malwareCount) {
				this.malwareCount = malwareCount;
			}

			public static class MalwareCount {

				private Long total;

				private Long highLevel;

				private Long lowLevel;

				private Long weakLevel;

				public Long getTotal() {
					return this.total;
				}

				public void setTotal(Long total) {
					this.total = total;
				}

				public Long getHighLevel() {
					return this.highLevel;
				}

				public void setHighLevel(Long highLevel) {
					this.highLevel = highLevel;
				}

				public Long getLowLevel() {
					return this.lowLevel;
				}

				public void setLowLevel(Long lowLevel) {
					this.lowLevel = lowLevel;
				}

				public Long getWeakLevel() {
					return this.weakLevel;
				}

				public void setWeakLevel(Long weakLevel) {
					this.weakLevel = weakLevel;
				}
			}
		}

		public static class FakeInfo {

			private Integer status;

			private Long fakeAppCount;

			private Long totalInfectedUsers;

			public Integer getStatus() {
				return this.status;
			}

			public void setStatus(Integer status) {
				this.status = status;
			}

			public Long getFakeAppCount() {
				return this.fakeAppCount;
			}

			public void setFakeAppCount(Long fakeAppCount) {
				this.fakeAppCount = fakeAppCount;
			}

			public Long getTotalInfectedUsers() {
				return this.totalInfectedUsers;
			}

			public void setTotalInfectedUsers(Long totalInfectedUsers) {
				this.totalInfectedUsers = totalInfectedUsers;
			}
		}

		public static class PluginInfo {

			private Long status;

			private Long pluginCount;

			public Long getStatus() {
				return this.status;
			}

			public void setStatus(Long status) {
				this.status = status;
			}

			public Long getPluginCount() {
				return this.pluginCount;
			}

			public void setPluginCount(Long pluginCount) {
				this.pluginCount = pluginCount;
			}
		}
	}

	@Override
	public GetRiskSummaryResponse getInstance(UnmarshallerContext context) {
		return	GetRiskSummaryResponseUnmarshaller.unmarshall(this, context);
	}
}
