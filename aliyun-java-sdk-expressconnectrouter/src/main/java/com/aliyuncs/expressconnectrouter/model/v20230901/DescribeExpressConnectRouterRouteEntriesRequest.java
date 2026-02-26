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

package com.aliyuncs.expressconnectrouter.model.v20230901;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.expressconnectrouter.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeExpressConnectRouterRouteEntriesRequest extends RpcAcsRequest<DescribeExpressConnectRouterRouteEntriesResponse> {
	   

	private String clientToken;

	private String nexthopInstanceId;

	private String ecrId;

	private String nextToken;

	private String asPath;

	private Boolean dryRun;

	private String destinationCidrBlock;

	private String community;

	private Integer maxResults;

	private String queryRegionId;
	public DescribeExpressConnectRouterRouteEntriesRequest() {
		super("ExpressConnectRouter", "2023-09-01", "DescribeExpressConnectRouterRouteEntries", "ecr");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putBodyParameter("ClientToken", clientToken);
		}
	}

	public String getNexthopInstanceId() {
		return this.nexthopInstanceId;
	}

	public void setNexthopInstanceId(String nexthopInstanceId) {
		this.nexthopInstanceId = nexthopInstanceId;
		if(nexthopInstanceId != null){
			putBodyParameter("NexthopInstanceId", nexthopInstanceId);
		}
	}

	public String getEcrId() {
		return this.ecrId;
	}

	public void setEcrId(String ecrId) {
		this.ecrId = ecrId;
		if(ecrId != null){
			putBodyParameter("EcrId", ecrId);
		}
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
		if(nextToken != null){
			putBodyParameter("NextToken", nextToken);
		}
	}

	public String getAsPath() {
		return this.asPath;
	}

	public void setAsPath(String asPath) {
		this.asPath = asPath;
		if(asPath != null){
			putBodyParameter("AsPath", asPath);
		}
	}

	public Boolean getDryRun() {
		return this.dryRun;
	}

	public void setDryRun(Boolean dryRun) {
		this.dryRun = dryRun;
		if(dryRun != null){
			putBodyParameter("DryRun", dryRun.toString());
		}
	}

	public String getDestinationCidrBlock() {
		return this.destinationCidrBlock;
	}

	public void setDestinationCidrBlock(String destinationCidrBlock) {
		this.destinationCidrBlock = destinationCidrBlock;
		if(destinationCidrBlock != null){
			putBodyParameter("DestinationCidrBlock", destinationCidrBlock);
		}
	}

	public String getCommunity() {
		return this.community;
	}

	public void setCommunity(String community) {
		this.community = community;
		if(community != null){
			putBodyParameter("Community", community);
		}
	}

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
		if(maxResults != null){
			putBodyParameter("MaxResults", maxResults.toString());
		}
	}

	public String getQueryRegionId() {
		return this.queryRegionId;
	}

	public void setQueryRegionId(String queryRegionId) {
		this.queryRegionId = queryRegionId;
		if(queryRegionId != null){
			putBodyParameter("QueryRegionId", queryRegionId);
		}
	}

	@Override
	public Class<DescribeExpressConnectRouterRouteEntriesResponse> getResponseClass() {
		return DescribeExpressConnectRouterRouteEntriesResponse.class;
	}

}
