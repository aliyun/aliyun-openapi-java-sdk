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
import java.util.List;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.nas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateLifecyclePolicyRequest extends RpcAcsRequest<UpdateLifecyclePolicyResponse> {
	   

	private List<DeleteRules> deleteRuless;

	private String description;

	private String storageType;

	private List<TransitRules> transitRuless;

	private List<RetrieveRules> retrieveRuless;

	private String fileSystemId;

	private String lifecyclePolicyId;

	private List<String> pathss;
	public UpdateLifecyclePolicyRequest() {
		super("NAS", "2017-06-26", "UpdateLifecyclePolicy", "nas");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<DeleteRules> getDeleteRuless() {
		return this.deleteRuless;
	}

	public void setDeleteRuless(List<DeleteRules> deleteRuless) {
		this.deleteRuless = deleteRuless;	
		if (deleteRuless != null) {
			for (int depth1 = 0; depth1 < deleteRuless.size(); depth1++) {
				putQueryParameter("DeleteRules." + (depth1 + 1) + ".Threshold" , deleteRuless.get(depth1).getThreshold());
				putQueryParameter("DeleteRules." + (depth1 + 1) + ".Attribute" , deleteRuless.get(depth1).getAttribute());
			}
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

	public String getStorageType() {
		return this.storageType;
	}

	public void setStorageType(String storageType) {
		this.storageType = storageType;
		if(storageType != null){
			putQueryParameter("StorageType", storageType);
		}
	}

	public List<TransitRules> getTransitRuless() {
		return this.transitRuless;
	}

	public void setTransitRuless(List<TransitRules> transitRuless) {
		this.transitRuless = transitRuless;	
		if (transitRuless != null) {
			for (int depth1 = 0; depth1 < transitRuless.size(); depth1++) {
				putQueryParameter("TransitRules." + (depth1 + 1) + ".Threshold" , transitRuless.get(depth1).getThreshold());
				putQueryParameter("TransitRules." + (depth1 + 1) + ".Attribute" , transitRuless.get(depth1).getAttribute());
			}
		}	
	}

	public List<RetrieveRules> getRetrieveRuless() {
		return this.retrieveRuless;
	}

	public void setRetrieveRuless(List<RetrieveRules> retrieveRuless) {
		this.retrieveRuless = retrieveRuless;	
		if (retrieveRuless != null) {
			for (int depth1 = 0; depth1 < retrieveRuless.size(); depth1++) {
				putQueryParameter("RetrieveRules." + (depth1 + 1) + ".Threshold" , retrieveRuless.get(depth1).getThreshold());
				putQueryParameter("RetrieveRules." + (depth1 + 1) + ".Attribute" , retrieveRuless.get(depth1).getAttribute());
			}
		}	
	}

	public String getFileSystemId() {
		return this.fileSystemId;
	}

	public void setFileSystemId(String fileSystemId) {
		this.fileSystemId = fileSystemId;
		if(fileSystemId != null){
			putQueryParameter("FileSystemId", fileSystemId);
		}
	}

	public String getLifecyclePolicyId() {
		return this.lifecyclePolicyId;
	}

	public void setLifecyclePolicyId(String lifecyclePolicyId) {
		this.lifecyclePolicyId = lifecyclePolicyId;
		if(lifecyclePolicyId != null){
			putQueryParameter("LifecyclePolicyId", lifecyclePolicyId);
		}
	}

	public List<String> getPathss() {
		return this.pathss;
	}

	public void setPathss(List<String> pathss) {
		this.pathss = pathss;	
		if (pathss != null) {
			for (int i = 0; i < pathss.size(); i++) {
				putQueryParameter("Paths." + (i + 1) , pathss.get(i));
			}
		}	
	}

	public static class DeleteRules {

		private String threshold;

		private String attribute;

		public String getThreshold() {
			return this.threshold;
		}

		public void setThreshold(String threshold) {
			this.threshold = threshold;
		}

		public String getAttribute() {
			return this.attribute;
		}

		public void setAttribute(String attribute) {
			this.attribute = attribute;
		}
	}

	public static class TransitRules {

		private String threshold;

		private String attribute;

		public String getThreshold() {
			return this.threshold;
		}

		public void setThreshold(String threshold) {
			this.threshold = threshold;
		}

		public String getAttribute() {
			return this.attribute;
		}

		public void setAttribute(String attribute) {
			this.attribute = attribute;
		}
	}

	public static class RetrieveRules {

		private String threshold;

		private String attribute;

		public String getThreshold() {
			return this.threshold;
		}

		public void setThreshold(String threshold) {
			this.threshold = threshold;
		}

		public String getAttribute() {
			return this.attribute;
		}

		public void setAttribute(String attribute) {
			this.attribute = attribute;
		}
	}

	@Override
	public Class<UpdateLifecyclePolicyResponse> getResponseClass() {
		return UpdateLifecyclePolicyResponse.class;
	}

}
