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

package com.aliyuncs.swas.model.v20170810;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class UpdateContainerServiceRequest extends RpcAcsRequest<UpdateContainerServiceResponse> {
	   

	private Boolean isDisabled;

	private String containerServiceName;

	private String containerServiceId;

	private String site;
	public UpdateContainerServiceRequest() {
		super("SWAS", "2017-08-10", "UpdateContainerService", "SWAS");
		setMethod(MethodType.POST);
	}

	public Boolean getIsDisabled() {
		return this.isDisabled;
	}

	public void setIsDisabled(Boolean isDisabled) {
		this.isDisabled = isDisabled;
		if(isDisabled != null){
			putQueryParameter("IsDisabled", isDisabled.toString());
		}
	}

	public String getContainerServiceName() {
		return this.containerServiceName;
	}

	public void setContainerServiceName(String containerServiceName) {
		this.containerServiceName = containerServiceName;
		if(containerServiceName != null){
			putQueryParameter("ContainerServiceName", containerServiceName);
		}
	}

	public String getContainerServiceId() {
		return this.containerServiceId;
	}

	public void setContainerServiceId(String containerServiceId) {
		this.containerServiceId = containerServiceId;
		if(containerServiceId != null){
			putQueryParameter("ContainerServiceId", containerServiceId);
		}
	}

	public String getSite() {
		return this.site;
	}

	public void setSite(String site) {
		this.site = site;
		if(site != null){
			putQueryParameter("Site", site);
		}
	}

	@Override
	public Class<UpdateContainerServiceResponse> getResponseClass() {
		return UpdateContainerServiceResponse.class;
	}

}
