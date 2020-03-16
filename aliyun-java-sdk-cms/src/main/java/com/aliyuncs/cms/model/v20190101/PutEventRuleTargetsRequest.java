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

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class PutEventRuleTargetsRequest extends RpcAcsRequest<PutEventRuleTargetsResponse> {
	   

	private List<WebhookParameters> webhookParameterss;

	private List<ContactParameters> contactParameterss;

	private List<SlsParameters> slsParameterss;

	private String ruleName;

	private List<MnsParameters> mnsParameterss;

	private List<FcParameters> fcParameterss;
	public PutEventRuleTargetsRequest() {
		super("Cms", "2019-01-01", "PutEventRuleTargets", "cms");
		setMethod(MethodType.POST);
	}

	public List<WebhookParameters> getWebhookParameterss() {
		return this.webhookParameterss;
	}

	public void setWebhookParameterss(List<WebhookParameters> webhookParameterss) {
		this.webhookParameterss = webhookParameterss;	
		if (webhookParameterss != null) {
			for (int depth1 = 0; depth1 < webhookParameterss.size(); depth1++) {
				putQueryParameter("WebhookParameters." + (depth1 + 1) + ".Protocol" , webhookParameterss.get(depth1).getBizProtocol());
				putQueryParameter("WebhookParameters." + (depth1 + 1) + ".Method" , webhookParameterss.get(depth1).getBizMethod());
				putQueryParameter("WebhookParameters." + (depth1 + 1) + ".Id" , webhookParameterss.get(depth1).getId());
				putQueryParameter("WebhookParameters." + (depth1 + 1) + ".Url" , webhookParameterss.get(depth1).getUrl());
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
				putQueryParameter("ContactParameters." + (depth1 + 1) + ".Level" , contactParameterss.get(depth1).getLevel());
				putQueryParameter("ContactParameters." + (depth1 + 1) + ".Id" , contactParameterss.get(depth1).getId());
				putQueryParameter("ContactParameters." + (depth1 + 1) + ".ContactGroupName" , contactParameterss.get(depth1).getContactGroupName());
			}
		}	
	}

	public List<SlsParameters> getSlsParameterss() {
		return this.slsParameterss;
	}

	public void setSlsParameterss(List<SlsParameters> slsParameterss) {
		this.slsParameterss = slsParameterss;	
		if (slsParameterss != null) {
			for (int depth1 = 0; depth1 < slsParameterss.size(); depth1++) {
				putQueryParameter("SlsParameters." + (depth1 + 1) + ".Project" , slsParameterss.get(depth1).getProject());
				putQueryParameter("SlsParameters." + (depth1 + 1) + ".Id" , slsParameterss.get(depth1).getId());
				putQueryParameter("SlsParameters." + (depth1 + 1) + ".Region" , slsParameterss.get(depth1).getRegion());
				putQueryParameter("SlsParameters." + (depth1 + 1) + ".LogStore" , slsParameterss.get(depth1).getLogStore());
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

	public List<FcParameters> getFcParameterss() {
		return this.fcParameterss;
	}

	public void setFcParameterss(List<FcParameters> fcParameterss) {
		this.fcParameterss = fcParameterss;	
		if (fcParameterss != null) {
			for (int depth1 = 0; depth1 < fcParameterss.size(); depth1++) {
				putQueryParameter("FcParameters." + (depth1 + 1) + ".FunctionName" , fcParameterss.get(depth1).getFunctionName());
				putQueryParameter("FcParameters." + (depth1 + 1) + ".ServiceName" , fcParameterss.get(depth1).getServiceName());
				putQueryParameter("FcParameters." + (depth1 + 1) + ".Id" , fcParameterss.get(depth1).getId());
				putQueryParameter("FcParameters." + (depth1 + 1) + ".Region" , fcParameterss.get(depth1).getRegion());
			}
		}	
	}

	public static class WebhookParameters {

		private String protocol;

		private String method;

		private String id;

		private String url;

		public String getBizProtocol() {
			return this.protocol;
		}

		public void setBizProtocol(String protocol) {
			this.protocol = protocol;
		}

		public String getBizMethod() {
			return this.method;
		}

		public void setBizMethod(String method) {
			this.method = method;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getUrl() {
			return this.url;
		}

		public void setUrl(String url) {
			this.url = url;
		}
	}

	public static class ContactParameters {

		private String level;

		private String id;

		private String contactGroupName;

		public String getLevel() {
			return this.level;
		}

		public void setLevel(String level) {
			this.level = level;
		}

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
	}

	public static class SlsParameters {

		private String project;

		private String id;

		private String region;

		private String logStore;

		public String getProject() {
			return this.project;
		}

		public void setProject(String project) {
			this.project = project;
		}

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

		public String getLogStore() {
			return this.logStore;
		}

		public void setLogStore(String logStore) {
			this.logStore = logStore;
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

	public static class FcParameters {

		private String functionName;

		private String serviceName;

		private String id;

		private String region;

		public String getFunctionName() {
			return this.functionName;
		}

		public void setFunctionName(String functionName) {
			this.functionName = functionName;
		}

		public String getServiceName() {
			return this.serviceName;
		}

		public void setServiceName(String serviceName) {
			this.serviceName = serviceName;
		}

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
	}

	@Override
	public Class<PutEventRuleTargetsResponse> getResponseClass() {
		return PutEventRuleTargetsResponse.class;
	}

}
