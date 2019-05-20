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

package com.aliyuncs.cloudcallcenter.model.v20170705;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;

/**
 * @author auto create
 * @version 
 */
public class ModifyNotificationConfigRequest extends RpcAcsRequest<ModifyNotificationConfigResponse> {
	
	public ModifyNotificationConfigRequest() {
		super("CloudCallCenter", "2017-07-05", "ModifyNotificationConfig", "CloudCallCenter", "innerAPI");
	}

	private List<Subscriptions> subscriptionss;

	private String instanceId;

	private String accessPoint;

	private String topic;

	private String producerId;

	public List<Subscriptions> getSubscriptionss() {
		return this.subscriptionss;
	}

	public void setSubscriptionss(List<Subscriptions> subscriptionss) {
		this.subscriptionss = subscriptionss;	
		if (subscriptionss != null) {
			for (int depth1 = 0; depth1 < subscriptionss.size(); depth1++) {
				putQueryParameter("Subscriptions." + (depth1 + 1) + ".DisplayName" , subscriptionss.get(depth1).getDisplayName());
				putQueryParameter("Subscriptions." + (depth1 + 1) + ".Name" , subscriptionss.get(depth1).getName());
				putQueryParameter("Subscriptions." + (depth1 + 1) + ".Selected" , subscriptionss.get(depth1).getSelected());
			}
		}	
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public String getAccessPoint() {
		return this.accessPoint;
	}

	public void setAccessPoint(String accessPoint) {
		this.accessPoint = accessPoint;
		if(accessPoint != null){
			putQueryParameter("AccessPoint", accessPoint);
		}
	}

	public String getTopic() {
		return this.topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
		if(topic != null){
			putQueryParameter("Topic", topic);
		}
	}

	public String getProducerId() {
		return this.producerId;
	}

	public void setProducerId(String producerId) {
		this.producerId = producerId;
		if(producerId != null){
			putQueryParameter("ProducerId", producerId);
		}
	}

	public static class Subscriptions {

		private String displayName;

		private String name;

		private Boolean selected;

		public String getDisplayName() {
			return this.displayName;
		}

		public void setDisplayName(String displayName) {
			this.displayName = displayName;
		}

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
	}

	@Override
	public Class<ModifyNotificationConfigResponse> getResponseClass() {
		return ModifyNotificationConfigResponse.class;
	}

}
