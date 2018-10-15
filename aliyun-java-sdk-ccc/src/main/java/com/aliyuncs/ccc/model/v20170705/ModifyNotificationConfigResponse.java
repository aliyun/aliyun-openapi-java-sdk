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

package com.aliyuncs.ccc.model.v20170705;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ccc.transform.v20170705.ModifyNotificationConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ModifyNotificationConfigResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer httpStatusCode;

	private String producerId;

	private String accessPoint;

	private String topic;

	private List<SubscriptionsItem> subscriptions;

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

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getProducerId() {
		return this.producerId;
	}

	public void setProducerId(String producerId) {
		this.producerId = producerId;
	}

	public String getAccessPoint() {
		return this.accessPoint;
	}

	public void setAccessPoint(String accessPoint) {
		this.accessPoint = accessPoint;
	}

	public String getTopic() {
		return this.topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public List<SubscriptionsItem> getSubscriptions() {
		return this.subscriptions;
	}

	public void setSubscriptions(List<SubscriptionsItem> subscriptions) {
		this.subscriptions = subscriptions;
	}

	public static class SubscriptionsItem {

		private String name;

		private Boolean selected;

		private String displayName;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Boolean getSelected() {
			return this.selected;
		}

		public void setSelected(Boolean selected) {
			this.selected = selected;
		}

		public String getDisplayName() {
			return this.displayName;
		}

		public void setDisplayName(String displayName) {
			this.displayName = displayName;
		}
	}

	@Override
	public ModifyNotificationConfigResponse getInstance(UnmarshallerContext context) {
		return	ModifyNotificationConfigResponseUnmarshaller.unmarshall(this, context);
	}
}
