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

package com.aliyuncs.cms.model.v20190101;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateHybridMonitorSLSGroupRequest extends RpcAcsRequest<CreateHybridMonitorSLSGroupResponse> {
	   

	private String sLSGroupDescription;

	private List<SLSGroupConfig> sLSGroupConfigs;

	private String sLSGroupName;
	public CreateHybridMonitorSLSGroupRequest() {
		super("Cms", "2019-01-01", "CreateHybridMonitorSLSGroup", "cms");
		setMethod(MethodType.POST);
	}

	public String getSLSGroupDescription() {
		return this.sLSGroupDescription;
	}

	public void setSLSGroupDescription(String sLSGroupDescription) {
		this.sLSGroupDescription = sLSGroupDescription;
		if(sLSGroupDescription != null){
			putQueryParameter("SLSGroupDescription", sLSGroupDescription);
		}
	}

	public List<SLSGroupConfig> getSLSGroupConfigs() {
		return this.sLSGroupConfigs;
	}

	public void setSLSGroupConfigs(List<SLSGroupConfig> sLSGroupConfigs) {
		this.sLSGroupConfigs = sLSGroupConfigs;	
		if (sLSGroupConfigs != null) {
			for (int depth1 = 0; depth1 < sLSGroupConfigs.size(); depth1++) {
				putQueryParameter("SLSGroupConfig." + (depth1 + 1) + ".SLSLogstore" , sLSGroupConfigs.get(depth1).getSLSLogstore());
				putQueryParameter("SLSGroupConfig." + (depth1 + 1) + ".SLSUserId" , sLSGroupConfigs.get(depth1).getSLSUserId());
				putQueryParameter("SLSGroupConfig." + (depth1 + 1) + ".SLSProject" , sLSGroupConfigs.get(depth1).getSLSProject());
				putQueryParameter("SLSGroupConfig." + (depth1 + 1) + ".SLSRegion" , sLSGroupConfigs.get(depth1).getSLSRegion());
			}
		}	
	}

	public String getSLSGroupName() {
		return this.sLSGroupName;
	}

	public void setSLSGroupName(String sLSGroupName) {
		this.sLSGroupName = sLSGroupName;
		if(sLSGroupName != null){
			putQueryParameter("SLSGroupName", sLSGroupName);
		}
	}

	public static class SLSGroupConfig {

		private String sLSLogstore;

		private String sLSUserId;

		private String sLSProject;

		private String sLSRegion;

		public String getSLSLogstore() {
			return this.sLSLogstore;
		}

		public void setSLSLogstore(String sLSLogstore) {
			this.sLSLogstore = sLSLogstore;
		}

		public String getSLSUserId() {
			return this.sLSUserId;
		}

		public void setSLSUserId(String sLSUserId) {
			this.sLSUserId = sLSUserId;
		}

		public String getSLSProject() {
			return this.sLSProject;
		}

		public void setSLSProject(String sLSProject) {
			this.sLSProject = sLSProject;
		}

		public String getSLSRegion() {
			return this.sLSRegion;
		}

		public void setSLSRegion(String sLSRegion) {
			this.sLSRegion = sLSRegion;
		}
	}

	@Override
	public Class<CreateHybridMonitorSLSGroupResponse> getResponseClass() {
		return CreateHybridMonitorSLSGroupResponse.class;
	}

}
