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

package com.aliyuncs.sas.model.v20181203;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sas.transform.v20181203.DescribeAlarmEventDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAlarmEventDetailResponse extends AcsResponse {

	private String requestId;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String internetIp;

		private String level;

		private String instanceName;

		private String alarmEventAliasName;

		private String type;

		private String uuid;

		private String solution;

		private Long startTime;

		private Long endTime;

		private String alarmEventDesc;

		private String intranetIp;

		private Boolean canBeDealOnLine;

		private String alarmUniqueInfo;

		private String dataSource;

		private Boolean canCancelFault;

		private List<CauseDetail> causeDetails;

		public String getInternetIp() {
			return this.internetIp;
		}

		public void setInternetIp(String internetIp) {
			this.internetIp = internetIp;
		}

		public String getLevel() {
			return this.level;
		}

		public void setLevel(String level) {
			this.level = level;
		}

		public String getInstanceName() {
			return this.instanceName;
		}

		public void setInstanceName(String instanceName) {
			this.instanceName = instanceName;
		}

		public String getAlarmEventAliasName() {
			return this.alarmEventAliasName;
		}

		public void setAlarmEventAliasName(String alarmEventAliasName) {
			this.alarmEventAliasName = alarmEventAliasName;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getUuid() {
			return this.uuid;
		}

		public void setUuid(String uuid) {
			this.uuid = uuid;
		}

		public String getSolution() {
			return this.solution;
		}

		public void setSolution(String solution) {
			this.solution = solution;
		}

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

		public String getAlarmEventDesc() {
			return this.alarmEventDesc;
		}

		public void setAlarmEventDesc(String alarmEventDesc) {
			this.alarmEventDesc = alarmEventDesc;
		}

		public String getIntranetIp() {
			return this.intranetIp;
		}

		public void setIntranetIp(String intranetIp) {
			this.intranetIp = intranetIp;
		}

		public Boolean getCanBeDealOnLine() {
			return this.canBeDealOnLine;
		}

		public void setCanBeDealOnLine(Boolean canBeDealOnLine) {
			this.canBeDealOnLine = canBeDealOnLine;
		}

		public String getAlarmUniqueInfo() {
			return this.alarmUniqueInfo;
		}

		public void setAlarmUniqueInfo(String alarmUniqueInfo) {
			this.alarmUniqueInfo = alarmUniqueInfo;
		}

		public String getDataSource() {
			return this.dataSource;
		}

		public void setDataSource(String dataSource) {
			this.dataSource = dataSource;
		}

		public Boolean getCanCancelFault() {
			return this.canCancelFault;
		}

		public void setCanCancelFault(Boolean canCancelFault) {
			this.canCancelFault = canCancelFault;
		}

		public List<CauseDetail> getCauseDetails() {
			return this.causeDetails;
		}

		public void setCauseDetails(List<CauseDetail> causeDetails) {
			this.causeDetails = causeDetails;
		}

		public static class CauseDetail {

			private String key;

			private List<ValueItem> value;

			public String getKey() {
				return this.key;
			}

			public void setKey(String key) {
				this.key = key;
			}

			public List<ValueItem> getValue() {
				return this.value;
			}

			public void setValue(List<ValueItem> value) {
				this.value = value;
			}

			public static class ValueItem {

				private String name;

				private String type;

				private String value;

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public String getType() {
					return this.type;
				}

				public void setType(String type) {
					this.type = type;
				}

				public String getValue() {
					return this.value;
				}

				public void setValue(String value) {
					this.value = value;
				}
			}
		}
	}

	@Override
	public DescribeAlarmEventDetailResponse getInstance(UnmarshallerContext context) {
		return	DescribeAlarmEventDetailResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
