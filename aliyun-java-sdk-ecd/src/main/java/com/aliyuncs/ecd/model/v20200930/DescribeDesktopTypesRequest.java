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
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecd.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeDesktopTypesRequest extends RpcAcsRequest<DescribeDesktopTypesResponse> {
	   

	private String appliedScope;

	private Float gpuCount;

	private String desktopTypeId;

	private String desktopIdForModify;

	private String desktopGroupIdForModify;

	private Integer memorySize;

	private String instanceTypeFamily;

	private Integer cpuCount;

	private String gpuDriverType;

	private String orderType;
	public DescribeDesktopTypesRequest() {
		super("ecd", "2020-09-30", "DescribeDesktopTypes", "gwsecd");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getAppliedScope() {
		return this.appliedScope;
	}

	public void setAppliedScope(String appliedScope) {
		this.appliedScope = appliedScope;
		if(appliedScope != null){
			putQueryParameter("AppliedScope", appliedScope);
		}
	}

	public Float getGpuCount() {
		return this.gpuCount;
	}

	public void setGpuCount(Float gpuCount) {
		this.gpuCount = gpuCount;
		if(gpuCount != null){
			putQueryParameter("GpuCount", gpuCount.toString());
		}
	}

	public String getDesktopTypeId() {
		return this.desktopTypeId;
	}

	public void setDesktopTypeId(String desktopTypeId) {
		this.desktopTypeId = desktopTypeId;
		if(desktopTypeId != null){
			putQueryParameter("DesktopTypeId", desktopTypeId);
		}
	}

	public String getDesktopIdForModify() {
		return this.desktopIdForModify;
	}

	public void setDesktopIdForModify(String desktopIdForModify) {
		this.desktopIdForModify = desktopIdForModify;
		if(desktopIdForModify != null){
			putQueryParameter("DesktopIdForModify", desktopIdForModify);
		}
	}

	public String getDesktopGroupIdForModify() {
		return this.desktopGroupIdForModify;
	}

	public void setDesktopGroupIdForModify(String desktopGroupIdForModify) {
		this.desktopGroupIdForModify = desktopGroupIdForModify;
		if(desktopGroupIdForModify != null){
			putQueryParameter("DesktopGroupIdForModify", desktopGroupIdForModify);
		}
	}

	public Integer getMemorySize() {
		return this.memorySize;
	}

	public void setMemorySize(Integer memorySize) {
		this.memorySize = memorySize;
		if(memorySize != null){
			putQueryParameter("MemorySize", memorySize.toString());
		}
	}

	public String getInstanceTypeFamily() {
		return this.instanceTypeFamily;
	}

	public void setInstanceTypeFamily(String instanceTypeFamily) {
		this.instanceTypeFamily = instanceTypeFamily;
		if(instanceTypeFamily != null){
			putQueryParameter("InstanceTypeFamily", instanceTypeFamily);
		}
	}

	public Integer getCpuCount() {
		return this.cpuCount;
	}

	public void setCpuCount(Integer cpuCount) {
		this.cpuCount = cpuCount;
		if(cpuCount != null){
			putQueryParameter("CpuCount", cpuCount.toString());
		}
	}

	public String getGpuDriverType() {
		return this.gpuDriverType;
	}

	public void setGpuDriverType(String gpuDriverType) {
		this.gpuDriverType = gpuDriverType;
		if(gpuDriverType != null){
			putQueryParameter("GpuDriverType", gpuDriverType);
		}
	}

	public String getOrderType() {
		return this.orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
		if(orderType != null){
			putQueryParameter("OrderType", orderType);
		}
	}

	@Override
	public Class<DescribeDesktopTypesResponse> getResponseClass() {
		return DescribeDesktopTypesResponse.class;
	}

}
