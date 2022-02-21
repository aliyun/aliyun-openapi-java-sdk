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

package com.aliyuncs.cms.model.v20190101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cms.transform.v20190101.DescribeSystemEventAttributeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSystemEventAttributeResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

	private String success;

	private List<SystemEvent> systemEvents;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
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

	public String getSuccess() {
		return this.success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public List<SystemEvent> getSystemEvents() {
		return this.systemEvents;
	}

	public void setSystemEvents(List<SystemEvent> systemEvents) {
		this.systemEvents = systemEvents;
	}

	public static class SystemEvent {

		private String status;

		private Long time;

		private String groupId;

		private String product;

		private String instanceName;

		private String resourceId;

		private String name;

		private String content;

		private String level;

		private String regionId;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Long getTime() {
			return this.time;
		}

		public void setTime(Long time) {
			this.time = time;
		}

		public String getGroupId() {
			return this.groupId;
		}

		public void setGroupId(String groupId) {
			this.groupId = groupId;
		}

		public String getProduct() {
			return this.product;
		}

		public void setProduct(String product) {
			this.product = product;
		}

		public String getInstanceName() {
			return this.instanceName;
		}

		public void setInstanceName(String instanceName) {
			this.instanceName = instanceName;
		}

		public String getResourceId() {
			return this.resourceId;
		}

		public void setResourceId(String resourceId) {
			this.resourceId = resourceId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getContent() {
			return this.content;
		}

		public void setContent(String content) {
			this.content = content;
		}

		public String getLevel() {
			return this.level;
		}

		public void setLevel(String level) {
			this.level = level;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}
	}

	@Override
	public DescribeSystemEventAttributeResponse getInstance(UnmarshallerContext context) {
		return	DescribeSystemEventAttributeResponseUnmarshaller.unmarshall(this, context);
	}
}
