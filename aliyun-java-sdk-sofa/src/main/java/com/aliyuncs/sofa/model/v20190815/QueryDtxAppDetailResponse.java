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
import com.aliyuncs.sofa.transform.v20190815.QueryDtxAppDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryDtxAppDetailResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Long actionCount;

		private Long activityCount;

		private Long activityMode;

		private String appName;

		private String dbRuleName;

		private String dbRuleTemplate;

		private String desc;

		private Long id;

		private Long spliteMode;

		private String tableRuleName;

		private String tableRuleTemplate;

		private Boolean used;

		private List<ActionArrayItem> actionArray;

		private List<RecoveryArrayItem> recoveryArray;

		public Long getActionCount() {
			return this.actionCount;
		}

		public void setActionCount(Long actionCount) {
			this.actionCount = actionCount;
		}

		public Long getActivityCount() {
			return this.activityCount;
		}

		public void setActivityCount(Long activityCount) {
			this.activityCount = activityCount;
		}

		public Long getActivityMode() {
			return this.activityMode;
		}

		public void setActivityMode(Long activityMode) {
			this.activityMode = activityMode;
		}

		public String getAppName() {
			return this.appName;
		}

		public void setAppName(String appName) {
			this.appName = appName;
		}

		public String getDbRuleName() {
			return this.dbRuleName;
		}

		public void setDbRuleName(String dbRuleName) {
			this.dbRuleName = dbRuleName;
		}

		public String getDbRuleTemplate() {
			return this.dbRuleTemplate;
		}

		public void setDbRuleTemplate(String dbRuleTemplate) {
			this.dbRuleTemplate = dbRuleTemplate;
		}

		public String getDesc() {
			return this.desc;
		}

		public void setDesc(String desc) {
			this.desc = desc;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Long getSpliteMode() {
			return this.spliteMode;
		}

		public void setSpliteMode(Long spliteMode) {
			this.spliteMode = spliteMode;
		}

		public String getTableRuleName() {
			return this.tableRuleName;
		}

		public void setTableRuleName(String tableRuleName) {
			this.tableRuleName = tableRuleName;
		}

		public String getTableRuleTemplate() {
			return this.tableRuleTemplate;
		}

		public void setTableRuleTemplate(String tableRuleTemplate) {
			this.tableRuleTemplate = tableRuleTemplate;
		}

		public Boolean getUsed() {
			return this.used;
		}

		public void setUsed(Boolean used) {
			this.used = used;
		}

		public List<ActionArrayItem> getActionArray() {
			return this.actionArray;
		}

		public void setActionArray(List<ActionArrayItem> actionArray) {
			this.actionArray = actionArray;
		}

		public List<RecoveryArrayItem> getRecoveryArray() {
			return this.recoveryArray;
		}

		public void setRecoveryArray(List<RecoveryArrayItem> recoveryArray) {
			this.recoveryArray = recoveryArray;
		}

		public static class ActionArrayItem {

			private String actionName;

			private String appName;

			private String className;

			private String commitMethodName;

			private Long commitMethodParamsType;

			private String elasticKey;

			private String elasticRouteRule;

			private Long id;

			private String instanceId;

			private Boolean isZoneRoute;

			private String rollbackMethodName;

			private Long rollbackMethodParamsType;

			private String testUrl;

			private String uniqueId;

			private Boolean used;

			private String wsTr;

			public String getActionName() {
				return this.actionName;
			}

			public void setActionName(String actionName) {
				this.actionName = actionName;
			}

			public String getAppName() {
				return this.appName;
			}

			public void setAppName(String appName) {
				this.appName = appName;
			}

			public String getClassName() {
				return this.className;
			}

			public void setClassName(String className) {
				this.className = className;
			}

			public String getCommitMethodName() {
				return this.commitMethodName;
			}

			public void setCommitMethodName(String commitMethodName) {
				this.commitMethodName = commitMethodName;
			}

			public Long getCommitMethodParamsType() {
				return this.commitMethodParamsType;
			}

			public void setCommitMethodParamsType(Long commitMethodParamsType) {
				this.commitMethodParamsType = commitMethodParamsType;
			}

			public String getElasticKey() {
				return this.elasticKey;
			}

			public void setElasticKey(String elasticKey) {
				this.elasticKey = elasticKey;
			}

			public String getElasticRouteRule() {
				return this.elasticRouteRule;
			}

			public void setElasticRouteRule(String elasticRouteRule) {
				this.elasticRouteRule = elasticRouteRule;
			}

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public Boolean getIsZoneRoute() {
				return this.isZoneRoute;
			}

			public void setIsZoneRoute(Boolean isZoneRoute) {
				this.isZoneRoute = isZoneRoute;
			}

			public String getRollbackMethodName() {
				return this.rollbackMethodName;
			}

			public void setRollbackMethodName(String rollbackMethodName) {
				this.rollbackMethodName = rollbackMethodName;
			}

			public Long getRollbackMethodParamsType() {
				return this.rollbackMethodParamsType;
			}

			public void setRollbackMethodParamsType(Long rollbackMethodParamsType) {
				this.rollbackMethodParamsType = rollbackMethodParamsType;
			}

			public String getTestUrl() {
				return this.testUrl;
			}

			public void setTestUrl(String testUrl) {
				this.testUrl = testUrl;
			}

			public String getUniqueId() {
				return this.uniqueId;
			}

			public void setUniqueId(String uniqueId) {
				this.uniqueId = uniqueId;
			}

			public Boolean getUsed() {
				return this.used;
			}

			public void setUsed(Boolean used) {
				this.used = used;
			}

			public String getWsTr() {
				return this.wsTr;
			}

			public void setWsTr(String wsTr) {
				this.wsTr = wsTr;
			}
		}

		public static class RecoveryArrayItem {

			private String appName;

			private String clientVersion;

			private Long id;

			private Boolean isAsyn;

			private Boolean isDds;

			private Boolean isLoadTest;

			private Boolean isMix;

			private Long recoveryLimit;

			private Long recoveryThreadNum;

			private Boolean used;

			private List<DsArrayItem> dsArray;

			public String getAppName() {
				return this.appName;
			}

			public void setAppName(String appName) {
				this.appName = appName;
			}

			public String getClientVersion() {
				return this.clientVersion;
			}

			public void setClientVersion(String clientVersion) {
				this.clientVersion = clientVersion;
			}

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public Boolean getIsAsyn() {
				return this.isAsyn;
			}

			public void setIsAsyn(Boolean isAsyn) {
				this.isAsyn = isAsyn;
			}

			public Boolean getIsDds() {
				return this.isDds;
			}

			public void setIsDds(Boolean isDds) {
				this.isDds = isDds;
			}

			public Boolean getIsLoadTest() {
				return this.isLoadTest;
			}

			public void setIsLoadTest(Boolean isLoadTest) {
				this.isLoadTest = isLoadTest;
			}

			public Boolean getIsMix() {
				return this.isMix;
			}

			public void setIsMix(Boolean isMix) {
				this.isMix = isMix;
			}

			public Long getRecoveryLimit() {
				return this.recoveryLimit;
			}

			public void setRecoveryLimit(Long recoveryLimit) {
				this.recoveryLimit = recoveryLimit;
			}

			public Long getRecoveryThreadNum() {
				return this.recoveryThreadNum;
			}

			public void setRecoveryThreadNum(Long recoveryThreadNum) {
				this.recoveryThreadNum = recoveryThreadNum;
			}

			public Boolean getUsed() {
				return this.used;
			}

			public void setUsed(Boolean used) {
				this.used = used;
			}

			public List<DsArrayItem> getDsArray() {
				return this.dsArray;
			}

			public void setDsArray(List<DsArrayItem> dsArray) {
				this.dsArray = dsArray;
			}

			public static class DsArrayItem {

				private Long actionTableIndexEnd;

				private Long actionTableIndexStart;

				private String actionTableNameFormat;

				private Long activityTableIndexEnd;

				private Long activityTableIndexStart;

				private String activityTableNameFormat;

				private Long dbConnectMin;

				private Long dbConnMax;

				private Long dbType;

				private Long dsIndexEnd;

				private Long dsIndexStart;

				private String dsNameFormat;

				private Long id;

				private Boolean isLdc;

				private Boolean isLocalDs;

				private Long taskIndexEnd;

				private Long taskIndexStart;

				private String taskNameFormat;

				private String zone;

				public Long getActionTableIndexEnd() {
					return this.actionTableIndexEnd;
				}

				public void setActionTableIndexEnd(Long actionTableIndexEnd) {
					this.actionTableIndexEnd = actionTableIndexEnd;
				}

				public Long getActionTableIndexStart() {
					return this.actionTableIndexStart;
				}

				public void setActionTableIndexStart(Long actionTableIndexStart) {
					this.actionTableIndexStart = actionTableIndexStart;
				}

				public String getActionTableNameFormat() {
					return this.actionTableNameFormat;
				}

				public void setActionTableNameFormat(String actionTableNameFormat) {
					this.actionTableNameFormat = actionTableNameFormat;
				}

				public Long getActivityTableIndexEnd() {
					return this.activityTableIndexEnd;
				}

				public void setActivityTableIndexEnd(Long activityTableIndexEnd) {
					this.activityTableIndexEnd = activityTableIndexEnd;
				}

				public Long getActivityTableIndexStart() {
					return this.activityTableIndexStart;
				}

				public void setActivityTableIndexStart(Long activityTableIndexStart) {
					this.activityTableIndexStart = activityTableIndexStart;
				}

				public String getActivityTableNameFormat() {
					return this.activityTableNameFormat;
				}

				public void setActivityTableNameFormat(String activityTableNameFormat) {
					this.activityTableNameFormat = activityTableNameFormat;
				}

				public Long getDbConnectMin() {
					return this.dbConnectMin;
				}

				public void setDbConnectMin(Long dbConnectMin) {
					this.dbConnectMin = dbConnectMin;
				}

				public Long getDbConnMax() {
					return this.dbConnMax;
				}

				public void setDbConnMax(Long dbConnMax) {
					this.dbConnMax = dbConnMax;
				}

				public Long getDbType() {
					return this.dbType;
				}

				public void setDbType(Long dbType) {
					this.dbType = dbType;
				}

				public Long getDsIndexEnd() {
					return this.dsIndexEnd;
				}

				public void setDsIndexEnd(Long dsIndexEnd) {
					this.dsIndexEnd = dsIndexEnd;
				}

				public Long getDsIndexStart() {
					return this.dsIndexStart;
				}

				public void setDsIndexStart(Long dsIndexStart) {
					this.dsIndexStart = dsIndexStart;
				}

				public String getDsNameFormat() {
					return this.dsNameFormat;
				}

				public void setDsNameFormat(String dsNameFormat) {
					this.dsNameFormat = dsNameFormat;
				}

				public Long getId() {
					return this.id;
				}

				public void setId(Long id) {
					this.id = id;
				}

				public Boolean getIsLdc() {
					return this.isLdc;
				}

				public void setIsLdc(Boolean isLdc) {
					this.isLdc = isLdc;
				}

				public Boolean getIsLocalDs() {
					return this.isLocalDs;
				}

				public void setIsLocalDs(Boolean isLocalDs) {
					this.isLocalDs = isLocalDs;
				}

				public Long getTaskIndexEnd() {
					return this.taskIndexEnd;
				}

				public void setTaskIndexEnd(Long taskIndexEnd) {
					this.taskIndexEnd = taskIndexEnd;
				}

				public Long getTaskIndexStart() {
					return this.taskIndexStart;
				}

				public void setTaskIndexStart(Long taskIndexStart) {
					this.taskIndexStart = taskIndexStart;
				}

				public String getTaskNameFormat() {
					return this.taskNameFormat;
				}

				public void setTaskNameFormat(String taskNameFormat) {
					this.taskNameFormat = taskNameFormat;
				}

				public String getZone() {
					return this.zone;
				}

				public void setZone(String zone) {
					this.zone = zone;
				}
			}
		}
	}

	@Override
	public QueryDtxAppDetailResponse getInstance(UnmarshallerContext context) {
		return	QueryDtxAppDetailResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
