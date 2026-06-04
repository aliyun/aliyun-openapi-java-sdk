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
public class RollbackAppInstancePublishRequest extends RpcAcsRequest<RollbackAppInstancePublishResponse> {
	   

	private String deployChannel;

	private String quickRollback;

	private String bizId;

	private String publishNumber;
	public RollbackAppInstancePublishRequest() {
		super("WebsiteBuild", "2025-04-29", "RollbackAppInstancePublish");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
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

	public String getQuickRollback() {
		return this.quickRollback;
	}

	public void setQuickRollback(String quickRollback) {
		this.quickRollback = quickRollback;
		if(quickRollback != null){
			putQueryParameter("QuickRollback", quickRollback);
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
	public Class<RollbackAppInstancePublishResponse> getResponseClass() {
		return RollbackAppInstancePublishResponse.class;
	}

}
