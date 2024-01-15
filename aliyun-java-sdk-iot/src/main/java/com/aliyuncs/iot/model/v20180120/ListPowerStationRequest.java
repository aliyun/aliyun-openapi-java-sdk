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

package com.aliyuncs.iot.model.v20180120;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.iot.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListPowerStationRequest extends RpcAcsRequest<ListPowerStationResponse> {
	   

	private String iotInstanceId;

	private Integer pageSize;

	private String algorithmInstanceUid;

	private Integer pageNo;

	private String powerStationName;
	public ListPowerStationRequest() {
		super("Iot", "2018-01-20", "ListPowerStation", "iot");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getIotInstanceId() {
		return this.iotInstanceId;
	}

	public void setIotInstanceId(String iotInstanceId) {
		this.iotInstanceId = iotInstanceId;
		if(iotInstanceId != null){
			putQueryParameter("IotInstanceId", iotInstanceId);
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public String getAlgorithmInstanceUid() {
		return this.algorithmInstanceUid;
	}

	public void setAlgorithmInstanceUid(String algorithmInstanceUid) {
		this.algorithmInstanceUid = algorithmInstanceUid;
		if(algorithmInstanceUid != null){
			putQueryParameter("AlgorithmInstanceUid", algorithmInstanceUid);
		}
	}

	public Integer getPageNo() {
		return this.pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
		if(pageNo != null){
			putQueryParameter("PageNo", pageNo.toString());
		}
	}

	public String getPowerStationName() {
		return this.powerStationName;
	}

	public void setPowerStationName(String powerStationName) {
		this.powerStationName = powerStationName;
		if(powerStationName != null){
			putQueryParameter("PowerStationName", powerStationName);
		}
	}

	@Override
	public Class<ListPowerStationResponse> getResponseClass() {
		return ListPowerStationResponse.class;
	}

}
