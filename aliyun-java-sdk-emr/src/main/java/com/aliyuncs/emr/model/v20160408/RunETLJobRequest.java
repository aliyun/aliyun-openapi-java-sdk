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

package com.aliyuncs.emr.model.v20160408;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;

/**
 * @author auto create
 * @version 
 */
public class RunETLJobRequest extends RpcAcsRequest<RunETLJobResponse> {
	
	public RunETLJobRequest() {
		super("Emr", "2016-04-08", "RunETLJob", "emr");
	}

	private Long resourceOwnerId;

	private List<InstanceRunParam> instanceRunParams;

	private Boolean isDebug;

	private String id;

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public List<InstanceRunParam> getInstanceRunParams() {
		return this.instanceRunParams;
	}

	public void setInstanceRunParams(List<InstanceRunParam> instanceRunParams) {
		this.instanceRunParams = instanceRunParams;	
		if (instanceRunParams != null) {
			for (int depth1 = 0; depth1 < instanceRunParams.size(); depth1++) {
				putQueryParameter("InstanceRunParam." + (depth1 + 1) + ".Value" , instanceRunParams.get(depth1).getValue());
				putQueryParameter("InstanceRunParam." + (depth1 + 1) + ".Key" , instanceRunParams.get(depth1).getKey());
			}
		}	
	}

	public Boolean getIsDebug() {
		return this.isDebug;
	}

	public void setIsDebug(Boolean isDebug) {
		this.isDebug = isDebug;
		if(isDebug != null){
			putQueryParameter("IsDebug", isDebug.toString());
		}
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
		if(id != null){
			putQueryParameter("Id", id);
		}
	}

	public static class InstanceRunParam {

		private String value;

		private String key;

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}
	}

	@Override
	public Class<RunETLJobResponse> getResponseClass() {
		return RunETLJobResponse.class;
	}

}
