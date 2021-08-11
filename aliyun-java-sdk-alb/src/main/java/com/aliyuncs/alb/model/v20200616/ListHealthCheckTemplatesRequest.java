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

package com.aliyuncs.alb.model.v20200616;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.alb.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListHealthCheckTemplatesRequest extends RpcAcsRequest<ListHealthCheckTemplatesResponse> {
	   

	private String nextToken;

	private List<String> healthCheckTemplateNames;

	private Integer maxResults;

	private List<String> healthCheckTemplateIds;
	public ListHealthCheckTemplatesRequest() {
		super("Alb", "2020-06-16", "ListHealthCheckTemplates", "alb");
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

	public List<String> getHealthCheckTemplateNames() {
		return this.healthCheckTemplateNames;
	}

	public void setHealthCheckTemplateNames(List<String> healthCheckTemplateNames) {
		this.healthCheckTemplateNames = healthCheckTemplateNames;	
		if (healthCheckTemplateNames != null) {
			for (int depth1 = 0; depth1 < healthCheckTemplateNames.size(); depth1++) {
				putQueryParameter("HealthCheckTemplateNames." + (depth1 + 1) , healthCheckTemplateNames.get(depth1));
			}
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

	public List<String> getHealthCheckTemplateIds() {
		return this.healthCheckTemplateIds;
	}

	public void setHealthCheckTemplateIds(List<String> healthCheckTemplateIds) {
		this.healthCheckTemplateIds = healthCheckTemplateIds;	
		if (healthCheckTemplateIds != null) {
			for (int depth1 = 0; depth1 < healthCheckTemplateIds.size(); depth1++) {
				putQueryParameter("HealthCheckTemplateIds." + (depth1 + 1) , healthCheckTemplateIds.get(depth1));
			}
		}	
	}

	@Override
	public Class<ListHealthCheckTemplatesResponse> getResponseClass() {
		return ListHealthCheckTemplatesResponse.class;
	}

}
