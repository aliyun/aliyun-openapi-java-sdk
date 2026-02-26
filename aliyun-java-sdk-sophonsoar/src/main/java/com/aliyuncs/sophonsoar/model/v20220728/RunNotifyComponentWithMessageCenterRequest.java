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
public class RunNotifyComponentWithMessageCenterRequest extends RpcAcsRequest<RunNotifyComponentWithMessageCenterResponse> {
	   

	private String eventId;

	private Long roleFor;

	private String componentName;

	private String params;

	private String actionName;

	private String nodeName;

	private String playbookUuid;

	private Integer assetId;

	private String roleType;

	private String aliuid;

	private String lang;

	private List<String> channelTypeLists;
	public RunNotifyComponentWithMessageCenterRequest() {
		super("sophonsoar", "2022-07-28", "RunNotifyComponentWithMessageCenter");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public String getEventId() {
		return this.eventId;
	}

	public void setEventId(String eventId) {
		this.eventId = eventId;
		if(eventId != null){
			putQueryParameter("EventId", eventId);
		}
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

	public String getComponentName() {
		return this.componentName;
	}

	public void setComponentName(String componentName) {
		this.componentName = componentName;
		if(componentName != null){
			putQueryParameter("ComponentName", componentName);
		}
	}

	public String getParams() {
		return this.params;
	}

	public void setParams(String params) {
		this.params = params;
		if(params != null){
			putQueryParameter("Params", params);
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

	public String getAliuid() {
		return this.aliuid;
	}

	public void setAliuid(String aliuid) {
		this.aliuid = aliuid;
		if(aliuid != null){
			putQueryParameter("Aliuid", aliuid);
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

	public List<String> getChannelTypeLists() {
		return this.channelTypeLists;
	}

	public void setChannelTypeLists(List<String> channelTypeLists) {
		this.channelTypeLists = channelTypeLists;	
		if (channelTypeLists != null) {
			for (int i = 0; i < channelTypeLists.size(); i++) {
				putQueryParameter("ChannelTypeList." + (i + 1) , channelTypeLists.get(i));
			}
		}	
	}

	@Override
	public Class<RunNotifyComponentWithMessageCenterResponse> getResponseClass() {
		return RunNotifyComponentWithMessageCenterResponse.class;
	}

}
