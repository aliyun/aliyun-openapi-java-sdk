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

package com.aliyuncs.emr.model.v20160408;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.emr.transform.v20160408.CreateClusterWithTemplateResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateClusterWithTemplateResponse extends AcsResponse {

	private String requestId;

	private String clusterBizId;

	private Long clusterId;

	private Long workFlowId;

	private String emrOrderId;

	private String masterOrderId;

	private String coreOrderId;

	private String workFlowInstanceId;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getClusterBizId() {
		return this.clusterBizId;
	}

	public void setClusterBizId(String clusterBizId) {
		this.clusterBizId = clusterBizId;
	}

	public Long getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(Long clusterId) {
		this.clusterId = clusterId;
	}

	public Long getWorkFlowId() {
		return this.workFlowId;
	}

	public void setWorkFlowId(Long workFlowId) {
		this.workFlowId = workFlowId;
	}

	public String getEmrOrderId() {
		return this.emrOrderId;
	}

	public void setEmrOrderId(String emrOrderId) {
		this.emrOrderId = emrOrderId;
	}

	public String getMasterOrderId() {
		return this.masterOrderId;
	}

	public void setMasterOrderId(String masterOrderId) {
		this.masterOrderId = masterOrderId;
	}

	public String getCoreOrderId() {
		return this.coreOrderId;
	}

	public void setCoreOrderId(String coreOrderId) {
		this.coreOrderId = coreOrderId;
	}

	public String getWorkFlowInstanceId() {
		return this.workFlowInstanceId;
	}

	public void setWorkFlowInstanceId(String workFlowInstanceId) {
		this.workFlowInstanceId = workFlowInstanceId;
	}

	@Override
	public CreateClusterWithTemplateResponse getInstance(UnmarshallerContext context) {
		return	CreateClusterWithTemplateResponseUnmarshaller.unmarshall(this, context);
	}
}
