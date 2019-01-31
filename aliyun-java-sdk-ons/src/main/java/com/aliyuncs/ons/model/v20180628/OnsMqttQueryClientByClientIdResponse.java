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

package com.aliyuncs.ons.model.v20180628;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ons.transform.v20180628.OnsMqttQueryClientByClientIdResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OnsMqttQueryClientByClientIdResponse extends AcsResponse {

	private String requestId;

	private String helpUrl;

	private MqttClientInfoDo mqttClientInfoDo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getHelpUrl() {
		return this.helpUrl;
	}

	public void setHelpUrl(String helpUrl) {
		this.helpUrl = helpUrl;
	}

	public MqttClientInfoDo getMqttClientInfoDo() {
		return this.mqttClientInfoDo;
	}

	public void setMqttClientInfoDo(MqttClientInfoDo mqttClientInfoDo) {
		this.mqttClientInfoDo = mqttClientInfoDo;
	}

	public static class MqttClientInfoDo {

		private Boolean online;

		private String clientId;

		private String socketChannel;

		private Long lastTouch;

		private List<SubscriptionDo> subScriptonData;

		public Boolean getOnline() {
			return this.online;
		}

		public void setOnline(Boolean online) {
			this.online = online;
		}

		public String getClientId() {
			return this.clientId;
		}

		public void setClientId(String clientId) {
			this.clientId = clientId;
		}

		public String getSocketChannel() {
			return this.socketChannel;
		}

		public void setSocketChannel(String socketChannel) {
			this.socketChannel = socketChannel;
		}

		public Long getLastTouch() {
			return this.lastTouch;
		}

		public void setLastTouch(Long lastTouch) {
			this.lastTouch = lastTouch;
		}

		public List<SubscriptionDo> getSubScriptonData() {
			return this.subScriptonData;
		}

		public void setSubScriptonData(List<SubscriptionDo> subScriptonData) {
			this.subScriptonData = subScriptonData;
		}

		public static class SubscriptionDo {

			private String parentTopic;

			private String subTopic;

			private Integer qos;

			public String getParentTopic() {
				return this.parentTopic;
			}

			public void setParentTopic(String parentTopic) {
				this.parentTopic = parentTopic;
			}

			public String getSubTopic() {
				return this.subTopic;
			}

			public void setSubTopic(String subTopic) {
				this.subTopic = subTopic;
			}

			public Integer getQos() {
				return this.qos;
			}

			public void setQos(Integer qos) {
				this.qos = qos;
			}
		}
	}

	@Override
	public OnsMqttQueryClientByClientIdResponse getInstance(UnmarshallerContext context) {
		return	OnsMqttQueryClientByClientIdResponseUnmarshaller.unmarshall(this, context);
	}
}
