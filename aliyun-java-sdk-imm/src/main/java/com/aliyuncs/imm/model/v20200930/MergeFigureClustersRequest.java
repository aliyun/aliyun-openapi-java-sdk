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

package com.aliyuncs.imm.model.v20200930;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.imm.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class MergeFigureClustersRequest extends RpcAcsRequest<MergeFigureClustersResponse> {
	   

	private String customMessage;

	private String clusterIdFrom;

	private String projectName;

	private String notifyTopicName;

	private String datasetName;

	private String figureType;

	private String clusterIdTo;

	private String notifyTopicEndpoint;
	public MergeFigureClustersRequest() {
		super("imm", "2020-09-30", "MergeFigureClusters", "imm");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getCustomMessage() {
		return this.customMessage;
	}

	public void setCustomMessage(String customMessage) {
		this.customMessage = customMessage;
		if(customMessage != null){
			putQueryParameter("CustomMessage", customMessage);
		}
	}

	public String getClusterIdFrom() {
		return this.clusterIdFrom;
	}

	public void setClusterIdFrom(String clusterIdFrom) {
		this.clusterIdFrom = clusterIdFrom;
		if(clusterIdFrom != null){
			putQueryParameter("ClusterIdFrom", clusterIdFrom);
		}
	}

	public String getProjectName() {
		return this.projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
		if(projectName != null){
			putQueryParameter("ProjectName", projectName);
		}
	}

	public String getNotifyTopicName() {
		return this.notifyTopicName;
	}

	public void setNotifyTopicName(String notifyTopicName) {
		this.notifyTopicName = notifyTopicName;
		if(notifyTopicName != null){
			putQueryParameter("NotifyTopicName", notifyTopicName);
		}
	}

	public String getDatasetName() {
		return this.datasetName;
	}

	public void setDatasetName(String datasetName) {
		this.datasetName = datasetName;
		if(datasetName != null){
			putQueryParameter("DatasetName", datasetName);
		}
	}

	public String getFigureType() {
		return this.figureType;
	}

	public void setFigureType(String figureType) {
		this.figureType = figureType;
		if(figureType != null){
			putQueryParameter("FigureType", figureType);
		}
	}

	public String getClusterIdTo() {
		return this.clusterIdTo;
	}

	public void setClusterIdTo(String clusterIdTo) {
		this.clusterIdTo = clusterIdTo;
		if(clusterIdTo != null){
			putQueryParameter("ClusterIdTo", clusterIdTo);
		}
	}

	public String getNotifyTopicEndpoint() {
		return this.notifyTopicEndpoint;
	}

	public void setNotifyTopicEndpoint(String notifyTopicEndpoint) {
		this.notifyTopicEndpoint = notifyTopicEndpoint;
		if(notifyTopicEndpoint != null){
			putQueryParameter("NotifyTopicEndpoint", notifyTopicEndpoint);
		}
	}

	@Override
	public Class<MergeFigureClustersResponse> getResponseClass() {
		return MergeFigureClustersResponse.class;
	}

}
