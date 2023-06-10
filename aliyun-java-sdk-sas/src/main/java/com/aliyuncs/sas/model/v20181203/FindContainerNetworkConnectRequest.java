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

package com.aliyuncs.sas.model.v20181203;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class FindContainerNetworkConnectRequest extends RpcAcsRequest<FindContainerNetworkConnectResponse> {
	   

	@SerializedName("dstNode")
	private DstNode dstNode;

	private Long startTime;

	private Long pageSize;

	private String criteriaType;

	private Long endTime;

	private Long currentPage;

	@SerializedName("srcNode")
	private SrcNode srcNode;
	public FindContainerNetworkConnectRequest() {
		super("Sas", "2018-12-03", "FindContainerNetworkConnect", "sas");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public DstNode getDstNode() {
		return this.dstNode;
	}

	public void setDstNode(DstNode dstNode) {
		this.dstNode = dstNode;	
		if (dstNode != null) {
			putQueryParameter("DstNode" , new Gson().toJson(dstNode));
		}	
	}

	public Long getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Long startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putQueryParameter("StartTime", startTime.toString());
		}
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public String getCriteriaType() {
		return this.criteriaType;
	}

	public void setCriteriaType(String criteriaType) {
		this.criteriaType = criteriaType;
		if(criteriaType != null){
			putQueryParameter("CriteriaType", criteriaType);
		}
	}

	public Long getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Long endTime) {
		this.endTime = endTime;
		if(endTime != null){
			putQueryParameter("EndTime", endTime.toString());
		}
	}

	public Long getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Long currentPage) {
		this.currentPage = currentPage;
		if(currentPage != null){
			putQueryParameter("CurrentPage", currentPage.toString());
		}
	}

	public SrcNode getSrcNode() {
		return this.srcNode;
	}

	public void setSrcNode(SrcNode srcNode) {
		this.srcNode = srcNode;	
		if (srcNode != null) {
			putQueryParameter("SrcNode" , new Gson().toJson(srcNode));
		}	
	}

	public static class DstNode {

		@SerializedName("NodeType")
		private String nodeType;

		@SerializedName("AppName")
		private String appName;

		@SerializedName("Namespace")
		private String namespace;

		@SerializedName("PodName")
		private String podName;

		@SerializedName("ClusterId")
		private String clusterId;

		@SerializedName("NodeIds")
		private List<String> nodeIds;

		public String getNodeType() {
			return this.nodeType;
		}

		public void setNodeType(String nodeType) {
			this.nodeType = nodeType;
		}

		public String getAppName() {
			return this.appName;
		}

		public void setAppName(String appName) {
			this.appName = appName;
		}

		public String getNamespace() {
			return this.namespace;
		}

		public void setNamespace(String namespace) {
			this.namespace = namespace;
		}

		public String getPodName() {
			return this.podName;
		}

		public void setPodName(String podName) {
			this.podName = podName;
		}

		public String getClusterId() {
			return this.clusterId;
		}

		public void setClusterId(String clusterId) {
			this.clusterId = clusterId;
		}

		public List<String> getNodeIds() {
			return this.nodeIds;
		}

		public void setNodeIds(List<String> nodeIds) {
			this.nodeIds = nodeIds;
		}
	}

	public static class SrcNode {

		@SerializedName("NodeType")
		private String nodeType;

		@SerializedName("AppName")
		private String appName;

		@SerializedName("Namespace")
		private String namespace;

		@SerializedName("PodName")
		private String podName;

		@SerializedName("ClusterId")
		private String clusterId;

		@SerializedName("NodeIds")
		private List<String> nodeIds;

		public String getNodeType() {
			return this.nodeType;
		}

		public void setNodeType(String nodeType) {
			this.nodeType = nodeType;
		}

		public String getAppName() {
			return this.appName;
		}

		public void setAppName(String appName) {
			this.appName = appName;
		}

		public String getNamespace() {
			return this.namespace;
		}

		public void setNamespace(String namespace) {
			this.namespace = namespace;
		}

		public String getPodName() {
			return this.podName;
		}

		public void setPodName(String podName) {
			this.podName = podName;
		}

		public String getClusterId() {
			return this.clusterId;
		}

		public void setClusterId(String clusterId) {
			this.clusterId = clusterId;
		}

		public List<String> getNodeIds() {
			return this.nodeIds;
		}

		public void setNodeIds(List<String> nodeIds) {
			this.nodeIds = nodeIds;
		}
	}

	@Override
	public Class<FindContainerNetworkConnectResponse> getResponseClass() {
		return FindContainerNetworkConnectResponse.class;
	}

}
