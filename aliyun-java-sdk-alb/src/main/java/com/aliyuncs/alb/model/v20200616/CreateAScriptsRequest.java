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

package com.aliyuncs.alb.model.v20200616;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.alb.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateAScriptsRequest extends RpcAcsRequest<CreateAScriptsResponse> {
	   

	private String clientToken;

	private String listenerId;

	private List<AScripts> aScripts;

	private Boolean dryRun;
	public CreateAScriptsRequest() {
		super("Alb", "2020-06-16", "CreateAScripts", "alb");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public String getListenerId() {
		return this.listenerId;
	}

	public void setListenerId(String listenerId) {
		this.listenerId = listenerId;
		if(listenerId != null){
			putQueryParameter("ListenerId", listenerId);
		}
	}

	public List<AScripts> getAScripts() {
		return this.aScripts;
	}

	public void setAScripts(List<AScripts> aScripts) {
		this.aScripts = aScripts;	
		if (aScripts != null) {
			for (int depth1 = 0; depth1 < aScripts.size(); depth1++) {
				if (aScripts.get(depth1) != null) {
					
						putQueryParameter("AScripts." + (depth1 + 1) + ".AScriptName" , aScripts.get(depth1).getAScriptName());
						putQueryParameter("AScripts." + (depth1 + 1) + ".ExtAttributeEnabled" , aScripts.get(depth1).getExtAttributeEnabled());
						putQueryParameter("AScripts." + (depth1 + 1) + ".Position" , aScripts.get(depth1).getPosition());
						putQueryParameter("AScripts." + (depth1 + 1) + ".ScriptContent" , aScripts.get(depth1).getScriptContent());
						if (aScripts.get(depth1).getExtAttributes() != null) {
							for (int depth2 = 0; depth2 < aScripts.get(depth1).getExtAttributes().size(); depth2++) {
								if (aScripts.get(depth1).getExtAttributes().get(depth2) != null) {
									
										putQueryParameter("AScripts." + (depth1 + 1) + ".ExtAttributes." + (depth2 + 1) + ".AttributeValue" , aScripts.get(depth1).getExtAttributes().get(depth2).getAttributeValue());
										putQueryParameter("AScripts." + (depth1 + 1) + ".ExtAttributes." + (depth2 + 1) + ".AttributeKey" , aScripts.get(depth1).getExtAttributes().get(depth2).getAttributeKey());
								}
							}
						}
						putQueryParameter("AScripts." + (depth1 + 1) + ".Enabled" , aScripts.get(depth1).getEnabled());
				}
			}
		}	
	}

	public Boolean getDryRun() {
		return this.dryRun;
	}

	public void setDryRun(Boolean dryRun) {
		this.dryRun = dryRun;
		if(dryRun != null){
			putQueryParameter("DryRun", dryRun.toString());
		}
	}

	public static class AScripts {

		private String aScriptName;

		private Boolean extAttributeEnabled;

		private String position;

		private String scriptContent;

		private List<ExtAttributesItem> extAttributes;

		private Boolean enabled;

		public String getAScriptName() {
			return this.aScriptName;
		}

		public void setAScriptName(String aScriptName) {
			this.aScriptName = aScriptName;
		}

		public Boolean getExtAttributeEnabled() {
			return this.extAttributeEnabled;
		}

		public void setExtAttributeEnabled(Boolean extAttributeEnabled) {
			this.extAttributeEnabled = extAttributeEnabled;
		}

		public String getPosition() {
			return this.position;
		}

		public void setPosition(String position) {
			this.position = position;
		}

		public String getScriptContent() {
			return this.scriptContent;
		}

		public void setScriptContent(String scriptContent) {
			this.scriptContent = scriptContent;
		}

		public List<ExtAttributesItem> getExtAttributes() {
			return this.extAttributes;
		}

		public void setExtAttributes(List<ExtAttributesItem> extAttributes) {
			this.extAttributes = extAttributes;
		}

		public Boolean getEnabled() {
			return this.enabled;
		}

		public void setEnabled(Boolean enabled) {
			this.enabled = enabled;
		}

		public static class ExtAttributesItem {

			private String attributeValue;

			private String attributeKey;

			public String getAttributeValue() {
				return this.attributeValue;
			}

			public void setAttributeValue(String attributeValue) {
				this.attributeValue = attributeValue;
			}

			public String getAttributeKey() {
				return this.attributeKey;
			}

			public void setAttributeKey(String attributeKey) {
				this.attributeKey = attributeKey;
			}
		}
	}

	@Override
	public Class<CreateAScriptsResponse> getResponseClass() {
		return CreateAScriptsResponse.class;
	}

}
