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

package com.aliyuncs.aegis.model.v20161111;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.aegis.transform.v20161111.DescribeSuspiciousEventsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSuspiciousEventsResponse extends AcsResponse {

	private String requestId;

	private Integer pageSize;

	private Integer totalCount;

	private Integer currentPage;

	private List<LogListItem> logList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public List<LogListItem> getLogList() {
		return this.logList;
	}

	public void setLogList(List<LogListItem> logList) {
		this.logList = logList;
	}

	public static class LogListItem {

		private String aliasEventType;

		private Long lastTime;

		private String level;

		private String instanceName;

		private Long groupId;

		private String ip;

		private String eventType;

		private String uuid;

		private Long firstTime;

		private String instanceId;

		private String tag;

		private String aliasEventName;

		private String osVersion;

		private String clientIp;

		private String eventName;

		private List<DetailListItem> detailList;

		public String getAliasEventType() {
			return this.aliasEventType;
		}

		public void setAliasEventType(String aliasEventType) {
			this.aliasEventType = aliasEventType;
		}

		public Long getLastTime() {
			return this.lastTime;
		}

		public void setLastTime(Long lastTime) {
			this.lastTime = lastTime;
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

		public Long getGroupId() {
			return this.groupId;
		}

		public void setGroupId(Long groupId) {
			this.groupId = groupId;
		}

		public String getIp() {
			return this.ip;
		}

		public void setIp(String ip) {
			this.ip = ip;
		}

		public String getEventType() {
			return this.eventType;
		}

		public void setEventType(String eventType) {
			this.eventType = eventType;
		}

		public String getUuid() {
			return this.uuid;
		}

		public void setUuid(String uuid) {
			this.uuid = uuid;
		}

		public Long getFirstTime() {
			return this.firstTime;
		}

		public void setFirstTime(Long firstTime) {
			this.firstTime = firstTime;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getTag() {
			return this.tag;
		}

		public void setTag(String tag) {
			this.tag = tag;
		}

		public String getAliasEventName() {
			return this.aliasEventName;
		}

		public void setAliasEventName(String aliasEventName) {
			this.aliasEventName = aliasEventName;
		}

		public String getOsVersion() {
			return this.osVersion;
		}

		public void setOsVersion(String osVersion) {
			this.osVersion = osVersion;
		}

		public String getClientIp() {
			return this.clientIp;
		}

		public void setClientIp(String clientIp) {
			this.clientIp = clientIp;
		}

		public String getEventName() {
			return this.eventName;
		}

		public void setEventName(String eventName) {
			this.eventName = eventName;
		}

		public List<DetailListItem> getDetailList() {
			return this.detailList;
		}

		public void setDetailList(List<DetailListItem> detailList) {
			this.detailList = detailList;
		}

		public static class DetailListItem {

			private String name;

			private String type;

			private String value;

			private String infoType;

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

			public String getInfoType() {
				return this.infoType;
			}

			public void setInfoType(String infoType) {
				this.infoType = infoType;
			}
		}
	}

	@Override
	public DescribeSuspiciousEventsResponse getInstance(UnmarshallerContext context) {
		return	DescribeSuspiciousEventsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
