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

package com.aliyuncs.sophonsoar.model.v20220728;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class RunNotifyComponentWithEmailRequest extends RpcAcsRequest<RunNotifyComponentWithEmailResponse> {
	   

	private Long roleFor;

	private String subject;

	private String componentName;

	private String actionName;

	private String content;

	private String nodeName;

	private String playbookUuid;

	private List<String> receiverss;

	private Integer assetId;

	private String roleType;

	private String lang;
	public RunNotifyComponentWithEmailRequest() {
		super("sophonsoar", "2022-07-28", "RunNotifyComponentWithEmail");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public Long getRoleFor() {
		return this.roleFor;
	}

	public void setRoleFor(Long roleFor) {
		this.roleFor = roleFor;
		if(roleFor != null){
			putQueryParameter("RoleFor", roleFor.toString());
		}
	}

	public String getSubject() {
		return this.subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
		if(subject != null){
			putQueryParameter("Subject", subject);
		}
	}

	public String getComponentName() {
		return this.componentName;
	}

	public void setComponentName(String componentName) {
		this.componentName = componentName;
		if(componentName != null){
			putQueryParameter("ComponentName", componentName);
		}
	}

	public String getActionName() {
		return this.actionName;
	}

	public void setActionName(String actionName) {
		this.actionName = actionName;
		if(actionName != null){
			putQueryParameter("ActionName", actionName);
		}
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
		if(content != null){
			putQueryParameter("Content", content);
		}
	}

	public String getNodeName() {
		return this.nodeName;
	}

	public void setNodeName(String nodeName) {
		this.nodeName = nodeName;
		if(nodeName != null){
			putQueryParameter("NodeName", nodeName);
		}
	}

	public String getPlaybookUuid() {
		return this.playbookUuid;
	}

	public void setPlaybookUuid(String playbookUuid) {
		this.playbookUuid = playbookUuid;
		if(playbookUuid != null){
			putQueryParameter("PlaybookUuid", playbookUuid);
		}
	}

	public List<String> getReceiverss() {
		return this.receiverss;
	}

	public void setReceiverss(List<String> receiverss) {
		this.receiverss = receiverss;	
		if (receiverss != null) {
			for (int i = 0; i < receiverss.size(); i++) {
				putQueryParameter("Receivers." + (i + 1) , receiverss.get(i));
			}
		}	
	}

	public Integer getAssetId() {
		return this.assetId;
	}

	public void setAssetId(Integer assetId) {
		this.assetId = assetId;
		if(assetId != null){
			putQueryParameter("AssetId", assetId.toString());
		}
	}

	public String getRoleType() {
		return this.roleType;
	}

	public void setRoleType(String roleType) {
		this.roleType = roleType;
		if(roleType != null){
			putQueryParameter("RoleType", roleType);
		}
	}

	public String getLang() {
		return this.lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
		if(lang != null){
			putQueryParameter("Lang", lang);
		}
	}

	@Override
	public Class<RunNotifyComponentWithEmailResponse> getResponseClass() {
		return RunNotifyComponentWithEmailResponse.class;
	}

}
