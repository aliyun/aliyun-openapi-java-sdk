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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.sofa.transform.v20190815.CountDTXAppStatsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CountDTXAppStatsResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private Boolean success;

	private Data data;

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

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private AppInfo appInfo;

		private Stats stats;

		public AppInfo getAppInfo() {
			return this.appInfo;
		}

		public void setAppInfo(AppInfo appInfo) {
			this.appInfo = appInfo;
		}

		public Stats getStats() {
			return this.stats;
		}

		public void setStats(Stats stats) {
			this.stats = stats;
		}

		public static class AppInfo {

			private String appName;

			private String creator;

			private String gmtCreate;

			private String gmtModified;

			private String instanceId;

			private String owner;

			public String getAppName() {
				return this.appName;
			}

			public void setAppName(String appName) {
				this.appName = appName;
			}

			public String getCreator() {
				return this.creator;
			}

			public void setCreator(String creator) {
				this.creator = creator;
			}

			public String getGmtCreate() {
				return this.gmtCreate;
			}

			public void setGmtCreate(String gmtCreate) {
				this.gmtCreate = gmtCreate;
			}

			public String getGmtModified() {
				return this.gmtModified;
			}

			public void setGmtModified(String gmtModified) {
				this.gmtModified = gmtModified;
			}

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public String getOwner() {
				return this.owner;
			}

			public void setOwner(String owner) {
				this.owner = owner;
			}
		}

		public static class Stats {

			private Exception exception;

			private Ongoing ongoing;

			private Today today;

			public Exception getException() {
				return this.exception;
			}

			public void setException(Exception exception) {
				this.exception = exception;
			}

			public Ongoing getOngoing() {
				return this.ongoing;
			}

			public void setOngoing(Ongoing ongoing) {
				this.ongoing = ongoing;
			}

			public Today getToday() {
				return this.today;
			}

			public void setToday(Today today) {
				this.today = today;
			}

			public static class Exception {

				private Long total;

				public Long getTotal() {
					return this.total;
				}

				public void setTotal(Long total) {
					this.total = total;
				}
			}

			public static class Ongoing {

				private Long actionNum;

				private Long activityNum;

				public Long getActionNum() {
					return this.actionNum;
				}

				public void setActionNum(Long actionNum) {
					this.actionNum = actionNum;
				}

				public Long getActivityNum() {
					return this.activityNum;
				}

				public void setActivityNum(Long activityNum) {
					this.activityNum = activityNum;
				}
			}

			public static class Today {

				private Long actionNum;

				private Long activityNum;

				public Long getActionNum() {
					return this.actionNum;
				}

				public void setActionNum(Long actionNum) {
					this.actionNum = actionNum;
				}

				public Long getActivityNum() {
					return this.activityNum;
				}

				public void setActivityNum(Long activityNum) {
					this.activityNum = activityNum;
				}
			}
		}
	}

	@Override
	public CountDTXAppStatsResponse getInstance(UnmarshallerContext context) {
		return	CountDTXAppStatsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
