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

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class GetUserSubmissionStatisticInfoRequest extends RpcAcsRequest<GetUserSubmissionStatisticInfoResponse> {
	
	public GetUserSubmissionStatisticInfoRequest() {
		super("Emr", "2016-04-08", "GetUserSubmissionStatisticInfo", "emr");
	}

	private String fromDatetime;

	private Long resourceOwnerId;

	private String clusterId;

	private String toDatetime;

	private String applicationType;

	private String finalStatus;

	public String getFromDatetime() {
		return this.fromDatetime;
	}

	public void setFromDatetime(String fromDatetime) {
		this.fromDatetime = fromDatetime;
		if(fromDatetime != null){
			putQueryParameter("FromDatetime", fromDatetime);
		}
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
		if(clusterId != null){
			putQueryParameter("ClusterId", clusterId);
		}
	}

	public String getToDatetime() {
		return this.toDatetime;
	}

	public void setToDatetime(String toDatetime) {
		this.toDatetime = toDatetime;
		if(toDatetime != null){
			putQueryParameter("ToDatetime", toDatetime);
		}
	}

	public String getApplicationType() {
		return this.applicationType;
	}

	public void setApplicationType(String applicationType) {
		this.applicationType = applicationType;
		if(applicationType != null){
			putQueryParameter("ApplicationType", applicationType);
		}
	}

	public String getFinalStatus() {
		return this.finalStatus;
	}

	public void setFinalStatus(String finalStatus) {
		this.finalStatus = finalStatus;
		if(finalStatus != null){
			putQueryParameter("FinalStatus", finalStatus);
		}
	}

	@Override
	public Class<GetUserSubmissionStatisticInfoResponse> getResponseClass() {
		return GetUserSubmissionStatisticInfoResponse.class;
	}

}
