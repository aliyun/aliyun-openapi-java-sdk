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
import com.aliyuncs.sas.transform.v20181203.DescribeWebLockFileEventsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeWebLockFileEventsResponse extends AcsResponse {

	private Integer currentPage;

	private String requestId;

	private Integer pageSize;

	private Integer totalCount;

	private List<Info> list;

	public Integer getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

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

	public List<Info> getList() {
		return this.list;
	}

	public void setList(List<Info> list) {
		this.list = list;
	}

	public static class Info {

		private String status;

		private String eventName;

		private Long ds;

		private String internetIp;

		private String processPath;

		private String ip;

		private Long gmtEvent;

		private Long count;

		private String intranetIp;

		private String processName;

		private String uuid;

		private String eventType;

		private String instanceName;

		private String eventStatus;

		private String path;

		private String solution;

		private String level;

		private Long id;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getEventName() {
			return this.eventName;
		}

		public void setEventName(String eventName) {
			this.eventName = eventName;
		}

		public Long getDs() {
			return this.ds;
		}

		public void setDs(Long ds) {
			this.ds = ds;
		}

		public String getInternetIp() {
			return this.internetIp;
		}

		public void setInternetIp(String internetIp) {
			this.internetIp = internetIp;
		}

		public String getProcessPath() {
			return this.processPath;
		}

		public void setProcessPath(String processPath) {
			this.processPath = processPath;
		}

		public String getIp() {
			return this.ip;
		}

		public void setIp(String ip) {
			this.ip = ip;
		}

		public Long getGmtEvent() {
			return this.gmtEvent;
		}

		public void setGmtEvent(Long gmtEvent) {
			this.gmtEvent = gmtEvent;
		}

		public Long getCount() {
			return this.count;
		}

		public void setCount(Long count) {
			this.count = count;
		}

		public String getIntranetIp() {
			return this.intranetIp;
		}

		public void setIntranetIp(String intranetIp) {
			this.intranetIp = intranetIp;
		}

		public String getProcessName() {
			return this.processName;
		}

		public void setProcessName(String processName) {
			this.processName = processName;
		}

		public String getUuid() {
			return this.uuid;
		}

		public void setUuid(String uuid) {
			this.uuid = uuid;
		}

		public String getEventType() {
			return this.eventType;
		}

		public void setEventType(String eventType) {
			this.eventType = eventType;
		}

		public String getInstanceName() {
			return this.instanceName;
		}

		public void setInstanceName(String instanceName) {
			this.instanceName = instanceName;
		}

		public String getEventStatus() {
			return this.eventStatus;
		}

		public void setEventStatus(String eventStatus) {
			this.eventStatus = eventStatus;
		}

		public String getPath() {
			return this.path;
		}

		public void setPath(String path) {
			this.path = path;
		}

		public String getSolution() {
			return this.solution;
		}

		public void setSolution(String solution) {
			this.solution = solution;
		}

		public String getLevel() {
			return this.level;
		}

		public void setLevel(String level) {
			this.level = level;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}
	}

	@Override
	public DescribeWebLockFileEventsResponse getInstance(UnmarshallerContext context) {
		return	DescribeWebLockFileEventsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
