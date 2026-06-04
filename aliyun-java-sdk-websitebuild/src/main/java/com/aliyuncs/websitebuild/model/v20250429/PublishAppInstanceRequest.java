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

package com.aliyuncs.websitebuild.model.v20250429;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class PublishAppInstanceRequest extends RpcAcsRequest<PublishAppInstanceResponse> {
	   

	private Integer logicalNumber;

	private String deployChannel;

	private String description;

	private String weappAction;

	private String bizId;

	private String publishNumber;
	public PublishAppInstanceRequest() {
		super("WebsiteBuild", "2025-04-29", "PublishAppInstance");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public Integer getLogicalNumber() {
		return this.logicalNumber;
	}

	public void setLogicalNumber(Integer logicalNumber) {
		this.logicalNumber = logicalNumber;
		if(logicalNumber != null){
			putQueryParameter("LogicalNumber", logicalNumber.toString());
		}
	}

	public String getDeployChannel() {
		return this.deployChannel;
	}

	public void setDeployChannel(String deployChannel) {
		this.deployChannel = deployChannel;
		if(deployChannel != null){
			putQueryParameter("DeployChannel", deployChannel);
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public String getWeappAction() {
		return this.weappAction;
	}

	public void setWeappAction(String weappAction) {
		this.weappAction = weappAction;
		if(weappAction != null){
			putQueryParameter("WeappAction", weappAction);
		}
	}

	public String getBizId() {
		return this.bizId;
	}

	public void setBizId(String bizId) {
		this.bizId = bizId;
		if(bizId != null){
			putQueryParameter("BizId", bizId);
		}
	}

	public String getPublishNumber() {
		return this.publishNumber;
	}

	public void setPublishNumber(String publishNumber) {
		this.publishNumber = publishNumber;
		if(publishNumber != null){
			putQueryParameter("PublishNumber", publishNumber);
		}
	}

	@Override
	public Class<PublishAppInstanceResponse> getResponseClass() {
		return PublishAppInstanceResponse.class;
	}

}
