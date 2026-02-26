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

package com.aliyuncs.resourcesharing.model.v20200110;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.resourcesharing.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListResourceShareAssociationsRequest extends RpcAcsRequest<ListResourceShareAssociationsResponse> {
	   

	private String nextToken;

	private List<String> resourceShareIdss;

	private String resourceId;

	private String target;

	private String associationType;

	private String associationStatus;

	private Integer maxResults;
	public ListResourceShareAssociationsRequest() {
		super("ResourceSharing", "2020-01-10", "ListResourceShareAssociations", "ressharing");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
		if(nextToken != null){
			putQueryParameter("NextToken", nextToken);
		}
	}

	public List<String> getResourceShareIdss() {
		return this.resourceShareIdss;
	}

	public void setResourceShareIdss(List<String> resourceShareIdss) {
		this.resourceShareIdss = resourceShareIdss;	
		if (resourceShareIdss != null) {
			for (int i = 0; i < resourceShareIdss.size(); i++) {
				putQueryParameter("ResourceShareIds." + (i + 1) , resourceShareIdss.get(i));
			}
		}	
	}

	public String getResourceId() {
		return this.resourceId;
	}

	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
		if(resourceId != null){
			putQueryParameter("ResourceId", resourceId);
		}
	}

	public String getTarget() {
		return this.target;
	}

	public void setTarget(String target) {
		this.target = target;
		if(target != null){
			putQueryParameter("Target", target);
		}
	}

	public String getAssociationType() {
		return this.associationType;
	}

	public void setAssociationType(String associationType) {
		this.associationType = associationType;
		if(associationType != null){
			putQueryParameter("AssociationType", associationType);
		}
	}

	public String getAssociationStatus() {
		return this.associationStatus;
	}

	public void setAssociationStatus(String associationStatus) {
		this.associationStatus = associationStatus;
		if(associationStatus != null){
			putQueryParameter("AssociationStatus", associationStatus);
		}
	}

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
		if(maxResults != null){
			putQueryParameter("MaxResults", maxResults.toString());
		}
	}

	@Override
	public Class<ListResourceShareAssociationsResponse> getResponseClass() {
		return ListResourceShareAssociationsResponse.class;
	}

}
