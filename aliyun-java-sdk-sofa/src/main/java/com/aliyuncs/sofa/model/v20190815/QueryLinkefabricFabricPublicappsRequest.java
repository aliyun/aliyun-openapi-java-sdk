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

package com.aliyuncs.sofa.model.v20190815;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class QueryLinkefabricFabricPublicappsRequest extends RpcAcsRequest<QueryLinkefabricFabricPublicappsResponse> {
	   

	private String operator;

	private String appName;

	private Boolean isPublic;

	private String originAppName;

	private Long tenantId;

	private String projectId;

	private String group;

	private String eventCode;

	private Long offset;

	private Long count;

	private String env;

	private String releaseId;

	private String devStage;

	private String topic;

	private List<String> envListRepeatLists;
	public QueryLinkefabricFabricPublicappsRequest() {
		super("SOFA", "2019-08-15", "QueryLinkefabricFabricPublicapps", "sofacafedeps");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getOperator() {
		return this.operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
		if(operator != null){
			putBodyParameter("Operator", operator);
		}
	}

	public String getAppName() {
		return this.appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
		if(appName != null){
			putBodyParameter("AppName", appName);
		}
	}

	public Boolean getIsPublic() {
		return this.isPublic;
	}

	public void setIsPublic(Boolean isPublic) {
		this.isPublic = isPublic;
		if(isPublic != null){
			putBodyParameter("IsPublic", isPublic.toString());
		}
	}

	public String getOriginAppName() {
		return this.originAppName;
	}

	public void setOriginAppName(String originAppName) {
		this.originAppName = originAppName;
		if(originAppName != null){
			putBodyParameter("OriginAppName", originAppName);
		}
	}

	public Long getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(Long tenantId) {
		this.tenantId = tenantId;
		if(tenantId != null){
			putBodyParameter("TenantId", tenantId.toString());
		}
	}

	public String getProjectId() {
		return this.projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
		if(projectId != null){
			putBodyParameter("ProjectId", projectId);
		}
	}

	public String getGroup() {
		return this.group;
	}

	public void setGroup(String group) {
		this.group = group;
		if(group != null){
			putBodyParameter("Group", group);
		}
	}

	public String getEventCode() {
		return this.eventCode;
	}

	public void setEventCode(String eventCode) {
		this.eventCode = eventCode;
		if(eventCode != null){
			putBodyParameter("EventCode", eventCode);
		}
	}

	public Long getOffset() {
		return this.offset;
	}

	public void setOffset(Long offset) {
		this.offset = offset;
		if(offset != null){
			putBodyParameter("Offset", offset.toString());
		}
	}

	public Long getCount() {
		return this.count;
	}

	public void setCount(Long count) {
		this.count = count;
		if(count != null){
			putBodyParameter("Count", count.toString());
		}
	}

	public String getEnv() {
		return this.env;
	}

	public void setEnv(String env) {
		this.env = env;
		if(env != null){
			putBodyParameter("Env", env);
		}
	}

	public String getReleaseId() {
		return this.releaseId;
	}

	public void setReleaseId(String releaseId) {
		this.releaseId = releaseId;
		if(releaseId != null){
			putBodyParameter("ReleaseId", releaseId);
		}
	}

	public String getDevStage() {
		return this.devStage;
	}

	public void setDevStage(String devStage) {
		this.devStage = devStage;
		if(devStage != null){
			putBodyParameter("DevStage", devStage);
		}
	}

	public String getTopic() {
		return this.topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
		if(topic != null){
			putBodyParameter("Topic", topic);
		}
	}

	public List<String> getEnvListRepeatLists() {
		return this.envListRepeatLists;
	}

	public void setEnvListRepeatLists(List<String> envListRepeatLists) {
		this.envListRepeatLists = envListRepeatLists;	
		if (envListRepeatLists != null) {
			for (int i = 0; i < envListRepeatLists.size(); i++) {
				putBodyParameter("EnvListRepeatList." + (i + 1) , envListRepeatLists.get(i));
			}
		}	
	}

	@Override
	public Class<QueryLinkefabricFabricPublicappsResponse> getResponseClass() {
		return QueryLinkefabricFabricPublicappsResponse.class;
	}

}
