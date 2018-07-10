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

package com.aliyuncs.cms.model.v20180308;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;

/**
 * @author auto create
 * @version 
 */
public class PutEventTargetsRequest extends RpcAcsRequest<PutEventTargetsResponse> {
	
	public PutEventTargetsRequest() {
		super("Cms", "2018-03-08", "PutEventTargets", "cms");
	}

	private List<WebhookParameters> webhookParameterss;

	private List<ContactParameters> contactParameterss;

	private List<FcParameters> fcParameterss;

	private String ruleName;

	private List<MnsParameters> mnsParameterss;

	public List<WebhookParameters> getWebhookParameterss() {
		return this.webhookParameterss;
	}

	public void setWebhookParameterss(List<WebhookParameters> webhookParameterss) {
		this.webhookParameterss = webhookParameterss;	
		if (webhookParameterss != null) {
			for (int depth1 = 0; depth1 < webhookParameterss.size(); depth1++) {
				putQueryParameter("WebhookParameters." + (depth1 + 1) + ".Id" , webhookParameterss.get(depth1).getId());
				putQueryParameter("WebhookParameters." + (depth1 + 1) + ".Protocol" , webhookParameterss.get(depth1).getProtocol());
				putQueryParameter("WebhookParameters." + (depth1 + 1) + ".Url" , webhookParameterss.get(depth1).getUrl());
				putQueryParameter("WebhookParameters." + (depth1 + 1) + ".Method" , webhookParameterss.get(depth1).getMethod());
			}
		}	
	}

	public List<ContactParameters> getContactParameterss() {
		return this.contactParameterss;
	}

	public void setContactParameterss(List<ContactParameters> contactParameterss) {
		this.contactParameterss = contactParameterss;	
		if (contactParameterss != null) {
			for (int depth1 = 0; depth1 < contactParameterss.size(); depth1++) {
				putQueryParameter("ContactParameters." + (depth1 + 1) + ".Id" , contactParameterss.get(depth1).getId());
				putQueryParameter("ContactParameters." + (depth1 + 1) + ".ContactGroupName" , contactParameterss.get(depth1).getContactGroupName());
				putQueryParameter("ContactParameters." + (depth1 + 1) + ".Level" , contactParameterss.get(depth1).getLevel());
			}
		}	
	}

	public List<FcParameters> getFcParameterss() {
		return this.fcParameterss;
	}

	public void setFcParameterss(List<FcParameters> fcParameterss) {
		this.fcParameterss = fcParameterss;	
		if (fcParameterss != null) {
			for (int depth1 = 0; depth1 < fcParameterss.size(); depth1++) {
				putQueryParameter("FcParameters." + (depth1 + 1) + ".Id" , fcParameterss.get(depth1).getId());
				putQueryParameter("FcParameters." + (depth1 + 1) + ".Region" , fcParameterss.get(depth1).getRegion());
				putQueryParameter("FcParameters." + (depth1 + 1) + ".ServiceName" , fcParameterss.get(depth1).getServiceName());
				putQueryParameter("FcParameters." + (depth1 + 1) + ".FunctionName" , fcParameterss.get(depth1).getFunctionName());
			}
		}	
	}

	public String getRuleName() {
		return this.ruleName;
	}

	public void setRuleName(String ruleName) {
		this.ruleName = ruleName;
		if(ruleName != null){
			putQueryParameter("RuleName", ruleName);
		}
	}

	public List<MnsParameters> getMnsParameterss() {
		return this.mnsParameterss;
	}

	public void setMnsParameterss(List<MnsParameters> mnsParameterss) {
		this.mnsParameterss = mnsParameterss;	
		if (mnsParameterss != null) {
			for (int depth1 = 0; depth1 < mnsParameterss.size(); depth1++) {
				putQueryParameter("MnsParameters." + (depth1 + 1) + ".Id" , mnsParameterss.get(depth1).getId());
				putQueryParameter("MnsParameters." + (depth1 + 1) + ".Region" , mnsParameterss.get(depth1).getRegion());
				putQueryParameter("MnsParameters." + (depth1 + 1) + ".Queue" , mnsParameterss.get(depth1).getQueue());
			}
		}	
	}

	public static class WebhookParameters {

		private String id;

		private String protocol;

		private String url;

		private String method;

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getProtocol() {
			return this.protocol;
		}

		public void setProtocol(String protocol) {
			this.protocol = protocol;
		}

		public String getUrl() {
			return this.url;
		}

		public void setUrl(String url) {
			this.url = url;
		}

		public String getMethod() {
			return this.method;
		}

		public void setMethod(String method) {
			this.method = method;
		}
	}

	public static class ContactParameters {

		private String id;

		private String contactGroupName;

		private String level;

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getContactGroupName() {
			return this.contactGroupName;
		}

		public void setContactGroupName(String contactGroupName) {
			this.contactGroupName = contactGroupName;
		}

		public String getLevel() {
			return this.level;
		}

		public void setLevel(String level) {
			this.level = level;
		}
	}

	public static class FcParameters {

		private String id;

		private String region;

		private String serviceName;

		private String functionName;

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getRegion() {
			return this.region;
		}

		public void setRegion(String region) {
			this.region = region;
		}

		public String getServiceName() {
			return this.serviceName;
		}

		public void setServiceName(String serviceName) {
			this.serviceName = serviceName;
		}

		public String getFunctionName() {
			return this.functionName;
		}

		public void setFunctionName(String functionName) {
			this.functionName = functionName;
		}
	}

	public static class MnsParameters {

		private String id;

		private String region;

		private String queue;

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getRegion() {
			return this.region;
		}

		public void setRegion(String region) {
			this.region = region;
		}

		public String getQueue() {
			return this.queue;
		}

		public void setQueue(String queue) {
			this.queue = queue;
		}
	}

	@Override
	public Class<PutEventTargetsResponse> getResponseClass() {
		return PutEventTargetsResponse.class;
	}

}
