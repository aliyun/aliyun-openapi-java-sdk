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

package com.aliyuncs.nas.model.v20170626;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.nas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateAccessRuleRequest extends RpcAcsRequest<CreateAccessRuleResponse> {
	
	public CreateAccessRuleRequest() {
		super("NAS", "2017-06-26", "CreateAccessRule", "nas");
		try {
			this.getClass().getDeclaredField("ProductEndpointMap").set(this, Endpoint.endpointMap);
			this.getClass().getDeclaredField("ProductEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private String rWAccessType;

	private String sourceCidrIp;

	private String userAccessType;

	private Integer priority;

	private String accessGroupName;

	private String fileSystemType;

	public String getRWAccessType() {
		return this.rWAccessType;
	}

	public void setRWAccessType(String rWAccessType) {
		this.rWAccessType = rWAccessType;
		if(rWAccessType != null){
			putQueryParameter("RWAccessType", rWAccessType);
		}
	}

	public String getSourceCidrIp() {
		return this.sourceCidrIp;
	}

	public void setSourceCidrIp(String sourceCidrIp) {
		this.sourceCidrIp = sourceCidrIp;
		if(sourceCidrIp != null){
			putQueryParameter("SourceCidrIp", sourceCidrIp);
		}
	}

	public String getUserAccessType() {
		return this.userAccessType;
	}

	public void setUserAccessType(String userAccessType) {
		this.userAccessType = userAccessType;
		if(userAccessType != null){
			putQueryParameter("UserAccessType", userAccessType);
		}
	}

	public Integer getPriority() {
		return this.priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
		if(priority != null){
			putQueryParameter("Priority", priority.toString());
		}
	}

	public String getAccessGroupName() {
		return this.accessGroupName;
	}

	public void setAccessGroupName(String accessGroupName) {
		this.accessGroupName = accessGroupName;
		if(accessGroupName != null){
			putQueryParameter("AccessGroupName", accessGroupName);
		}
	}

	public String getFileSystemType() {
		return this.fileSystemType;
	}

	public void setFileSystemType(String fileSystemType) {
		this.fileSystemType = fileSystemType;
		if(fileSystemType != null){
			putQueryParameter("FileSystemType", fileSystemType);
		}
	}

	@Override
	public Class<CreateAccessRuleResponse> getResponseClass() {
		return CreateAccessRuleResponse.class;
	}

}
