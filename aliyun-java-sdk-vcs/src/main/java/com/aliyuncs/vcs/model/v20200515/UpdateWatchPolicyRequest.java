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

package com.aliyuncs.vcs.model.v20200515;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.vcs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateWatchPolicyRequest extends RpcAcsRequest<UpdateWatchPolicyResponse> {
	   

	private String watchMode;

	private String targetType;

	private String watchPolicyName;

	private String itemMatchType;

	private Double similarityThreshold;

	private String watchPolicyId;
	public UpdateWatchPolicyRequest() {
		super("Vcs", "2020-05-15", "UpdateWatchPolicy");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getWatchMode() {
		return this.watchMode;
	}

	public void setWatchMode(String watchMode) {
		this.watchMode = watchMode;
		if(watchMode != null){
			putBodyParameter("WatchMode", watchMode);
		}
	}

	public String getTargetType() {
		return this.targetType;
	}

	public void setTargetType(String targetType) {
		this.targetType = targetType;
		if(targetType != null){
			putBodyParameter("TargetType", targetType);
		}
	}

	public String getWatchPolicyName() {
		return this.watchPolicyName;
	}

	public void setWatchPolicyName(String watchPolicyName) {
		this.watchPolicyName = watchPolicyName;
		if(watchPolicyName != null){
			putBodyParameter("WatchPolicyName", watchPolicyName);
		}
	}

	public String getItemMatchType() {
		return this.itemMatchType;
	}

	public void setItemMatchType(String itemMatchType) {
		this.itemMatchType = itemMatchType;
		if(itemMatchType != null){
			putBodyParameter("ItemMatchType", itemMatchType);
		}
	}

	public Double getSimilarityThreshold() {
		return this.similarityThreshold;
	}

	public void setSimilarityThreshold(Double similarityThreshold) {
		this.similarityThreshold = similarityThreshold;
		if(similarityThreshold != null){
			putBodyParameter("SimilarityThreshold", similarityThreshold.toString());
		}
	}

	public String getWatchPolicyId() {
		return this.watchPolicyId;
	}

	public void setWatchPolicyId(String watchPolicyId) {
		this.watchPolicyId = watchPolicyId;
		if(watchPolicyId != null){
			putBodyParameter("WatchPolicyId", watchPolicyId);
		}
	}

	@Override
	public Class<UpdateWatchPolicyResponse> getResponseClass() {
		return UpdateWatchPolicyResponse.class;
	}

}
