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
public class DescribeCdsFileShareLinksRequest extends RpcAcsRequest<DescribeCdsFileShareLinksResponse> {
	   

	private List<String> creatorss;

	private String shareId;

	private String cdsId;

	private String shareName;

	private String nextToken;

	private Integer maxResults;

	private String status;
	public DescribeCdsFileShareLinksRequest() {
		super("ecd", "2020-09-30", "DescribeCdsFileShareLinks");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getCreatorss() {
		return this.creatorss;
	}

	public void setCreatorss(List<String> creatorss) {
		this.creatorss = creatorss;	
		if (creatorss != null) {
			for (int i = 0; i < creatorss.size(); i++) {
				putQueryParameter("Creators." + (i + 1) , creatorss.get(i));
			}
		}	
	}

	public String getShareId() {
		return this.shareId;
	}

	public void setShareId(String shareId) {
		this.shareId = shareId;
		if(shareId != null){
			putQueryParameter("ShareId", shareId);
		}
	}

	public String getCdsId() {
		return this.cdsId;
	}

	public void setCdsId(String cdsId) {
		this.cdsId = cdsId;
		if(cdsId != null){
			putQueryParameter("CdsId", cdsId);
		}
	}

	public String getShareName() {
		return this.shareName;
	}

	public void setShareName(String shareName) {
		this.shareName = shareName;
		if(shareName != null){
			putQueryParameter("ShareName", shareName);
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

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
		if(status != null){
			putQueryParameter("Status", status);
		}
	}

	@Override
	public Class<DescribeCdsFileShareLinksResponse> getResponseClass() {
		return DescribeCdsFileShareLinksResponse.class;
	}

}
