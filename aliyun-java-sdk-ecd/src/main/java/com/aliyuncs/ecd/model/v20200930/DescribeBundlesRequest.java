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

package com.aliyuncs.ecd.model.v20200930;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecd.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeBundlesRequest extends RpcAcsRequest<DescribeBundlesResponse> {
	   

	private List<String> bundleIds;

	private String desktopTypeFamily;

	private String nextToken;

	private Integer maxResults;

	private String bundleType;
	public DescribeBundlesRequest() {
		super("ecd", "2020-09-30", "DescribeBundles", "gwsecd");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getBundleIds() {
		return this.bundleIds;
	}

	public void setBundleIds(List<String> bundleIds) {
		this.bundleIds = bundleIds;	
		if (bundleIds != null) {
			for (int i = 0; i < bundleIds.size(); i++) {
				putQueryParameter("BundleId." + (i + 1) , bundleIds.get(i));
			}
		}	
	}

	public String getDesktopTypeFamily() {
		return this.desktopTypeFamily;
	}

	public void setDesktopTypeFamily(String desktopTypeFamily) {
		this.desktopTypeFamily = desktopTypeFamily;
		if(desktopTypeFamily != null){
			putQueryParameter("DesktopTypeFamily", desktopTypeFamily);
		}
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

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
		if(maxResults != null){
			putQueryParameter("MaxResults", maxResults.toString());
		}
	}

	public String getBundleType() {
		return this.bundleType;
	}

	public void setBundleType(String bundleType) {
		this.bundleType = bundleType;
		if(bundleType != null){
			putQueryParameter("BundleType", bundleType);
		}
	}

	@Override
	public Class<DescribeBundlesResponse> getResponseClass() {
		return DescribeBundlesResponse.class;
	}

}
