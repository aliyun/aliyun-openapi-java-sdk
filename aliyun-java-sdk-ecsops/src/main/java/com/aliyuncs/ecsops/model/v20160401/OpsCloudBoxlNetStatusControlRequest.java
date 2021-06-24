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

package com.aliyuncs.ecsops.model.v20160401;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class OpsCloudBoxlNetStatusControlRequest extends RpcAcsRequest<OpsCloudBoxlNetStatusControlResponse> {
	   

	private String cloudBoxId;

	private Long aliUid;

	private String status;
	public OpsCloudBoxlNetStatusControlRequest() {
		super("Ecsops", "2016-04-01", "OpsCloudBoxlNetStatusControl", "ecsops");
		setMethod(MethodType.POST);
	}

	public String getCloudBoxId() {
		return this.cloudBoxId;
	}

	public void setCloudBoxId(String cloudBoxId) {
		this.cloudBoxId = cloudBoxId;
		if(cloudBoxId != null){
			putQueryParameter("CloudBoxId", cloudBoxId);
		}
	}

	public Long getAliUid() {
		return this.aliUid;
	}

	public void setAliUid(Long aliUid) {
		this.aliUid = aliUid;
		if(aliUid != null){
			putQueryParameter("AliUid", aliUid.toString());
		}
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
		if(status != null){
			putQueryParameter("Status", status);
		}
	}

	@Override
	public Class<OpsCloudBoxlNetStatusControlResponse> getResponseClass() {
		return OpsCloudBoxlNetStatusControlResponse.class;
	}

}
