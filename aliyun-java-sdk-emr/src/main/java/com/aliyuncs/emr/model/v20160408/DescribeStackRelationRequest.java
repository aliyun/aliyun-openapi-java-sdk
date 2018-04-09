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
public class DescribeStackRelationRequest extends RpcAcsRequest<DescribeStackRelationResponse> {
	
	public DescribeStackRelationRequest() {
		super("Emr", "2016-04-08", "DescribeStackRelation");
	}

	private Long resourceOwnerId;

	private String emrVersion;

	private String clusterId;

	private String stackVersion;

	private List<String> stackVersionLists;

	private List<String> emrVersionLists;

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getEmrVersion() {
		return this.emrVersion;
	}

	public void setEmrVersion(String emrVersion) {
		this.emrVersion = emrVersion;
		if(emrVersion != null){
			putQueryParameter("EmrVersion", emrVersion);
		}
	}

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
		if(clusterId != null){
			putQueryParameter("ClusterId", clusterId);
		}
	}

	public String getStackVersion() {
		return this.stackVersion;
	}

	public void setStackVersion(String stackVersion) {
		this.stackVersion = stackVersion;
		if(stackVersion != null){
			putQueryParameter("StackVersion", stackVersion);
		}
	}

	public List<String> getStackVersionLists() {
		return this.stackVersionLists;
	}

	public void setStackVersionLists(List<String> stackVersionLists) {
		this.stackVersionLists = stackVersionLists;	
		if (stackVersionLists != null) {
			for (int i = 0; i < stackVersionLists.size(); i++) {
				putQueryParameter("StackVersionList." + (i + 1) , stackVersionLists.get(i));
			}
		}	
	}

	public List<String> getEmrVersionLists() {
		return this.emrVersionLists;
	}

	public void setEmrVersionLists(List<String> emrVersionLists) {
		this.emrVersionLists = emrVersionLists;	
		if (emrVersionLists != null) {
			for (int i = 0; i < emrVersionLists.size(); i++) {
				putQueryParameter("EmrVersionList." + (i + 1) , emrVersionLists.get(i));
			}
		}	
	}

	@Override
	public Class<DescribeStackRelationResponse> getResponseClass() {
		return DescribeStackRelationResponse.class;
	}

}
