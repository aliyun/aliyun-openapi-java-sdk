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

package com.aliyuncs.cs.model.v20151215;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeClusterNodesRequest extends RoaAcsRequest<DescribeClusterNodesResponse> {
	   

	private String pageSize;

	private String clusterId;

	private String state;

	private String nodepool_id;

	private String pageNumber;
	public DescribeClusterNodesRequest() {
		super("CS", "2015-12-15", "DescribeClusterNodes");
		setUriPattern("/clusters/[ClusterId]/nodes");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("pageSize", pageSize);
		}
	}

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
		if(clusterId != null){
			putPathParameter("ClusterId", clusterId);
		}
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
		if(state != null){
			putQueryParameter("state", state);
		}
	}

	public String getNodepool_id() {
		return this.nodepool_id;
	}

	public void setNodepool_id(String nodepool_id) {
		this.nodepool_id = nodepool_id;
		if(nodepool_id != null){
			putQueryParameter("nodepool_id", nodepool_id);
		}
	}

	public String getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(String pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("pageNumber", pageNumber);
		}
	}

	@Override
	public Class<DescribeClusterNodesResponse> getResponseClass() {
		return DescribeClusterNodesResponse.class;
	}

}
