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
public class UpgradeContainerServiceRequest extends RpcAcsRequest<UpgradeContainerServiceResponse> {
	   

	private Integer scale;

	private String containerServiceId;

	private String containerServiceEdition;

	private String site;
	public UpgradeContainerServiceRequest() {
		super("SWAS", "2017-08-10", "UpgradeContainerService", "SWAS");
		setMethod(MethodType.POST);
	}

	public Integer getScale() {
		return this.scale;
	}

	public void setScale(Integer scale) {
		this.scale = scale;
		if(scale != null){
			putQueryParameter("Scale", scale.toString());
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

	public String getContainerServiceEdition() {
		return this.containerServiceEdition;
	}

	public void setContainerServiceEdition(String containerServiceEdition) {
		this.containerServiceEdition = containerServiceEdition;
		if(containerServiceEdition != null){
			putQueryParameter("ContainerServiceEdition", containerServiceEdition);
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
	public Class<UpgradeContainerServiceResponse> getResponseClass() {
		return UpgradeContainerServiceResponse.class;
	}

}
