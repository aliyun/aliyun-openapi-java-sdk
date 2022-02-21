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
import com.aliyuncs.cms.transform.v20190101.DescribeEventRuleAttributeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeEventRuleAttributeResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

	private Boolean success;

	private Result result;

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

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private String eventType;

		private String groupId;

		private String name;

		private String description;

		private String state;

		private EventPattern eventPattern;

		public String getEventType() {
			return this.eventType;
		}

		public void setEventType(String eventType) {
			this.eventType = eventType;
		}

		public String getGroupId() {
			return this.groupId;
		}

		public void setGroupId(String groupId) {
			this.groupId = groupId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public EventPattern getEventPattern() {
			return this.eventPattern;
		}

		public void setEventPattern(EventPattern eventPattern) {
			this.eventPattern = eventPattern;
		}

		public static class EventPattern {

			private String product;

			private List<String> levelList;

			private List<String> statusList;

			private List<String> nameList;

			public String getProduct() {
				return this.product;
			}

			public void setProduct(String product) {
				this.product = product;
			}

			public List<String> getLevelList() {
				return this.levelList;
			}

			public void setLevelList(List<String> levelList) {
				this.levelList = levelList;
			}

			public List<String> getStatusList() {
				return this.statusList;
			}

			public void setStatusList(List<String> statusList) {
				this.statusList = statusList;
			}

			public List<String> getNameList() {
				return this.nameList;
			}

			public void setNameList(List<String> nameList) {
				this.nameList = nameList;
			}
		}
	}

	@Override
	public DescribeEventRuleAttributeResponse getInstance(UnmarshallerContext context) {
		return	DescribeEventRuleAttributeResponseUnmarshaller.unmarshall(this, context);
	}
}
