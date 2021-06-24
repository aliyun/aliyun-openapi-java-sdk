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

package com.aliyuncs.ecsops.model.v20160401;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsDescribeSystemEventMetaResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsDescribeSystemEventMetaResponse extends AcsResponse {

	private Integer totalCount;

	private String requestId;

	private List<EventMeta> eventMetas;

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<EventMeta> getEventMetas() {
		return this.eventMetas;
	}

	public void setEventMetas(List<EventMeta> eventMetas) {
		this.eventMetas = eventMetas;
	}

	public static class EventMeta {

		private Boolean reportCms;

		private String openStatus;

		private String resourceType;

		private Boolean onlyNotification;

		private Integer code;

		private Boolean supportSimulate;

		private String name;

		private String level;

		public Boolean getReportCms() {
			return this.reportCms;
		}

		public void setReportCms(Boolean reportCms) {
			this.reportCms = reportCms;
		}

		public String getOpenStatus() {
			return this.openStatus;
		}

		public void setOpenStatus(String openStatus) {
			this.openStatus = openStatus;
		}

		public String getResourceType() {
			return this.resourceType;
		}

		public void setResourceType(String resourceType) {
			this.resourceType = resourceType;
		}

		public Boolean getOnlyNotification() {
			return this.onlyNotification;
		}

		public void setOnlyNotification(Boolean onlyNotification) {
			this.onlyNotification = onlyNotification;
		}

		public Integer getCode() {
			return this.code;
		}

		public void setCode(Integer code) {
			this.code = code;
		}

		public Boolean getSupportSimulate() {
			return this.supportSimulate;
		}

		public void setSupportSimulate(Boolean supportSimulate) {
			this.supportSimulate = supportSimulate;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getLevel() {
			return this.level;
		}

		public void setLevel(String level) {
			this.level = level;
		}
	}

	@Override
	public OpsDescribeSystemEventMetaResponse getInstance(UnmarshallerContext context) {
		return	OpsDescribeSystemEventMetaResponseUnmarshaller.unmarshall(this, context);
	}
}
