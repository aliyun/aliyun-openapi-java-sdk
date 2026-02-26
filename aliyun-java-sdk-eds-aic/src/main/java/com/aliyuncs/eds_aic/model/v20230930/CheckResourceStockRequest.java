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

package com.aliyuncs.eds_aic.model.v20230930;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CheckResourceStockRequest extends RpcAcsRequest<CheckResourceStockResponse> {
	   

	private String bizRegionId;

	private Integer amount;

	private Boolean gpuAcceleration;

	private String acpSpecId;

	private String zoneId;
	public CheckResourceStockRequest() {
		super("eds-aic", "2023-09-30", "CheckResourceStock");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public String getBizRegionId() {
		return this.bizRegionId;
	}

	public void setBizRegionId(String bizRegionId) {
		this.bizRegionId = bizRegionId;
		if(bizRegionId != null){
			putQueryParameter("BizRegionId", bizRegionId);
		}
	}

	public Integer getAmount() {
		return this.amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
		if(amount != null){
			putQueryParameter("Amount", amount.toString());
		}
	}

	public Boolean getGpuAcceleration() {
		return this.gpuAcceleration;
	}

	public void setGpuAcceleration(Boolean gpuAcceleration) {
		this.gpuAcceleration = gpuAcceleration;
		if(gpuAcceleration != null){
			putQueryParameter("GpuAcceleration", gpuAcceleration.toString());
		}
	}

	public String getAcpSpecId() {
		return this.acpSpecId;
	}

	public void setAcpSpecId(String acpSpecId) {
		this.acpSpecId = acpSpecId;
		if(acpSpecId != null){
			putQueryParameter("AcpSpecId", acpSpecId);
		}
	}

	public String getZoneId() {
		return this.zoneId;
	}

	public void setZoneId(String zoneId) {
		this.zoneId = zoneId;
		if(zoneId != null){
			putQueryParameter("ZoneId", zoneId);
		}
	}

	@Override
	public Class<CheckResourceStockResponse> getResponseClass() {
		return CheckResourceStockResponse.class;
	}

}
