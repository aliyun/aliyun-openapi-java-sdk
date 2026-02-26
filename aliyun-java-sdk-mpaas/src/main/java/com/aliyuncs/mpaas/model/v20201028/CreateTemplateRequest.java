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

package com.aliyuncs.mpaas.model.v20201028;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.mpaas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateTemplateRequest extends RpcAcsRequest<CreateTemplateResponse> {
	   

	private String imageUrls;

	private String title;

	private String content;

	private String iconUrls;

	private String descInfo;

	private String tenantId;

	private String templateName;

	private Integer jumpAction;

	private Integer pushStyle;

	private String variables;

	private String uri;

	private Long showStyle;

	private String appId;

	private String workspaceId;
	public CreateTemplateRequest() {
		super("mPaaS", "2020-10-28", "CreateTemplate", "mpaas");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getImageUrls() {
		return this.imageUrls;
	}

	public void setImageUrls(String imageUrls) {
		this.imageUrls = imageUrls;
		if(imageUrls != null){
			putBodyParameter("ImageUrls", imageUrls);
		}
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
		if(title != null){
			putBodyParameter("Title", title);
		}
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
		if(content != null){
			putBodyParameter("Content", content);
		}
	}

	public String getIconUrls() {
		return this.iconUrls;
	}

	public void setIconUrls(String iconUrls) {
		this.iconUrls = iconUrls;
		if(iconUrls != null){
			putBodyParameter("IconUrls", iconUrls);
		}
	}

	public String getDescInfo() {
		return this.descInfo;
	}

	public void setDescInfo(String descInfo) {
		this.descInfo = descInfo;
		if(descInfo != null){
			putBodyParameter("DescInfo", descInfo);
		}
	}

	public String getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
		if(tenantId != null){
			putBodyParameter("TenantId", tenantId);
		}
	}

	public String getTemplateName() {
		return this.templateName;
	}

	public void setTemplateName(String templateName) {
		this.templateName = templateName;
		if(templateName != null){
			putBodyParameter("TemplateName", templateName);
		}
	}

	public Integer getJumpAction() {
		return this.jumpAction;
	}

	public void setJumpAction(Integer jumpAction) {
		this.jumpAction = jumpAction;
		if(jumpAction != null){
			putBodyParameter("JumpAction", jumpAction.toString());
		}
	}

	public Integer getPushStyle() {
		return this.pushStyle;
	}

	public void setPushStyle(Integer pushStyle) {
		this.pushStyle = pushStyle;
		if(pushStyle != null){
			putBodyParameter("PushStyle", pushStyle.toString());
		}
	}

	public String getVariables() {
		return this.variables;
	}

	public void setVariables(String variables) {
		this.variables = variables;
		if(variables != null){
			putBodyParameter("Variables", variables);
		}
	}

	public String getUri() {
		return this.uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
		if(uri != null){
			putBodyParameter("Uri", uri);
		}
	}

	public Long getShowStyle() {
		return this.showStyle;
	}

	public void setShowStyle(Long showStyle) {
		this.showStyle = showStyle;
		if(showStyle != null){
			putBodyParameter("ShowStyle", showStyle.toString());
		}
	}

	public String getAppId() {
		return this.appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
		if(appId != null){
			putBodyParameter("AppId", appId);
		}
	}

	public String getWorkspaceId() {
		return this.workspaceId;
	}

	public void setWorkspaceId(String workspaceId) {
		this.workspaceId = workspaceId;
		if(workspaceId != null){
			putBodyParameter("WorkspaceId", workspaceId);
		}
	}

	@Override
	public Class<CreateTemplateResponse> getResponseClass() {
		return CreateTemplateResponse.class;
	}

}
