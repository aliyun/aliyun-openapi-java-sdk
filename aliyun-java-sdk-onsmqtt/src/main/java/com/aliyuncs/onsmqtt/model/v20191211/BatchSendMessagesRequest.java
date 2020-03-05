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

package com.aliyuncs.onsmqtt.model.v20191211;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class BatchSendMessagesRequest extends RpcAcsRequest<BatchSendMessagesResponse> {
	   

	private String instanceId;

	private List<Messages> messagess;
	public BatchSendMessagesRequest() {
		super("OnsMqtt", "2019-12-11", "BatchSendMessages", "onsmqtt");
		setMethod(MethodType.POST);
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

	public List<Messages> getMessagess() {
		return this.messagess;
	}

	public void setMessagess(List<Messages> messagess) {
		this.messagess = messagess;	
		if (messagess != null) {
			for (int depth1 = 0; depth1 < messagess.size(); depth1++) {
				putQueryParameter("Messages." + (depth1 + 1) + ".Payload" , messagess.get(depth1).getPayload());
				if (messagess.get(depth1).getTopicss() != null) {
					for (int i = 0; i < messagess.get(depth1).getTopicss().size(); i++) {
						putQueryParameter("Messages." + (depth1 + 1) + ".Topics." + (i + 1) , messagess.get(depth1).getTopicss().get(i));
					}
				}
				putQueryParameter("Messages." + (depth1 + 1) + ".Id" , messagess.get(depth1).getId());
				putQueryParameter("Messages." + (depth1 + 1) + ".ReceiptId" , messagess.get(depth1).getReceiptId());
			}
		}	
	}

	public static class Messages {

		private String payload;

		private List<String> topicss;

		private Integer id;

		private String receiptId;

		public String getPayload() {
			return this.payload;
		}

		public void setPayload(String payload) {
			this.payload = payload;
		}

		public List<String> getTopicss() {
			return this.topicss;
		}

		public void setTopicss(List<String> topicss) {
			this.topicss = topicss;
		}

		public Integer getId() {
			return this.id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getReceiptId() {
			return this.receiptId;
		}

		public void setReceiptId(String receiptId) {
			this.receiptId = receiptId;
		}
	}

	@Override
	public Class<BatchSendMessagesResponse> getResponseClass() {
		return BatchSendMessagesResponse.class;
	}

}
