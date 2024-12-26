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

package com.aliyuncs.schedulerx3.model.v20240624;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class OperateDesignateExecutorsRequest extends RpcAcsRequest<OperateDesignateExecutorsResponse> {
	   

	private Boolean transferable;

	private Integer designateType;

	private Long jobId;

	private String appName;

	@SerializedName("addressList")
	private List<String> addressList;

	private String clusterId;
	public OperateDesignateExecutorsRequest() {
		super("SchedulerX3", "2024-06-24", "OperateDesignateExecutors");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public Boolean getTransferable() {
		return this.transferable;
	}

	public void setTransferable(Boolean transferable) {
		this.transferable = transferable;
		if(transferable != null){
			putBodyParameter("Transferable", transferable.toString());
		}
	}

	public Integer getDesignateType() {
		return this.designateType;
	}

	public void setDesignateType(Integer designateType) {
		this.designateType = designateType;
		if(designateType != null){
			putBodyParameter("DesignateType", designateType.toString());
		}
	}

	public Long getJobId() {
		return this.jobId;
	}

	public void setJobId(Long jobId) {
		this.jobId = jobId;
		if(jobId != null){
			putBodyParameter("JobId", jobId.toString());
		}
	}

	public String getAppName() {
		return this.appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
		if(appName != null){
			putBodyParameter("AppName", appName);
		}
	}

	public List<String> getAddressList() {
		return this.addressList;
	}

	public void setAddressList(List<String> addressList) {
		this.addressList = addressList;	
		if (addressList != null) {
			putBodyParameter("AddressList" , new Gson().toJson(addressList));
		}	
	}

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
		if(clusterId != null){
			putBodyParameter("ClusterId", clusterId);
		}
	}

	@Override
	public Class<OperateDesignateExecutorsResponse> getResponseClass() {
		return OperateDesignateExecutorsResponse.class;
	}

}
