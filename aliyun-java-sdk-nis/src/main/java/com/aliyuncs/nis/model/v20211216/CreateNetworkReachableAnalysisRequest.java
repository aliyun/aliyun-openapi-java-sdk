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

package com.aliyuncs.nis.model.v20211216;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateNetworkReachableAnalysisRequest extends RpcAcsRequest<CreateNetworkReachableAnalysisResponse> {
	   

	private String networkPathId;

	private List<Tag> tags;
	public CreateNetworkReachableAnalysisRequest() {
		super("nis", "2021-12-16", "CreateNetworkReachableAnalysis", "networkana");
		setMethod(MethodType.POST);
	}

	public String getNetworkPathId() {
		return this.networkPathId;
	}

	public void setNetworkPathId(String networkPathId) {
		this.networkPathId = networkPathId;
		if(networkPathId != null){
			putQueryParameter("NetworkPathId", networkPathId);
		}
	}

	public List<Tag> getTags() {
		return this.tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;	
		if (tags != null) {
			for (int depth1 = 0; depth1 < tags.size(); depth1++) {
				putQueryParameter("Tag." + (depth1 + 1) + ".Key" , tags.get(depth1).getKey());
				putQueryParameter("Tag." + (depth1 + 1) + ".Value" , tags.get(depth1).getValue());
			}
		}	
	}

	public static class Tag {

		private String key;

		private String value;

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}
	}

	@Override
	public Class<CreateNetworkReachableAnalysisResponse> getResponseClass() {
		return CreateNetworkReachableAnalysisResponse.class;
	}

}
