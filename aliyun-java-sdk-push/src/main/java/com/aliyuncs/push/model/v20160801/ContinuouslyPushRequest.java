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

package com.aliyuncs.push.model.v20160801;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.push.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ContinuouslyPushRequest extends RpcAcsRequest<ContinuouslyPushResponse> {
	   

	private String messageId;

	private String target;

	private Long appKey;

	private String targetValue;
	public ContinuouslyPushRequest() {
		super("Push", "2016-08-01", "ContinuouslyPush");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getMessageId() {
		return this.messageId;
	}

	public void setMessageId(String messageId) {
		this.messageId = messageId;
		if(messageId != null){
			putQueryParameter("MessageId", messageId);
		}
	}

	public String getTarget() {
		return this.target;
	}

	public void setTarget(String target) {
		this.target = target;
		if(target != null){
			putQueryParameter("Target", target);
		}
	}

	public Long getAppKey() {
		return this.appKey;
	}

	public void setAppKey(Long appKey) {
		this.appKey = appKey;
		if(appKey != null){
			putQueryParameter("AppKey", appKey.toString());
		}
	}

	public String getTargetValue() {
		return this.targetValue;
	}

	public void setTargetValue(String targetValue) {
		this.targetValue = targetValue;
		if(targetValue != null){
			putQueryParameter("TargetValue", targetValue);
		}
	}

	@Override
	public Class<ContinuouslyPushResponse> getResponseClass() {
		return ContinuouslyPushResponse.class;
	}

}
