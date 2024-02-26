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
public class DescribePriceForCreateDesktopOversoldGroupRequest extends RpcAcsRequest<DescribePriceForCreateDesktopOversoldGroupResponse> {
	   

	private Integer period;

	private Integer oversoldUserCount;

	private String periodUnit;

	private Integer dataDiskSize;

	private Integer systemDiskSize;

	private Integer concurrenceCount;

	private String desktopType;
	public DescribePriceForCreateDesktopOversoldGroupRequest() {
		super("ecd", "2020-09-30", "DescribePriceForCreateDesktopOversoldGroup", "gwsecd");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Integer getPeriod() {
		return this.period;
	}

	public void setPeriod(Integer period) {
		this.period = period;
		if(period != null){
			putQueryParameter("Period", period.toString());
		}
	}

	public Integer getOversoldUserCount() {
		return this.oversoldUserCount;
	}

	public void setOversoldUserCount(Integer oversoldUserCount) {
		this.oversoldUserCount = oversoldUserCount;
		if(oversoldUserCount != null){
			putQueryParameter("OversoldUserCount", oversoldUserCount.toString());
		}
	}

	public String getPeriodUnit() {
		return this.periodUnit;
	}

	public void setPeriodUnit(String periodUnit) {
		this.periodUnit = periodUnit;
		if(periodUnit != null){
			putQueryParameter("PeriodUnit", periodUnit);
		}
	}

	public Integer getDataDiskSize() {
		return this.dataDiskSize;
	}

	public void setDataDiskSize(Integer dataDiskSize) {
		this.dataDiskSize = dataDiskSize;
		if(dataDiskSize != null){
			putQueryParameter("DataDiskSize", dataDiskSize.toString());
		}
	}

	public Integer getSystemDiskSize() {
		return this.systemDiskSize;
	}

	public void setSystemDiskSize(Integer systemDiskSize) {
		this.systemDiskSize = systemDiskSize;
		if(systemDiskSize != null){
			putQueryParameter("SystemDiskSize", systemDiskSize.toString());
		}
	}

	public Integer getConcurrenceCount() {
		return this.concurrenceCount;
	}

	public void setConcurrenceCount(Integer concurrenceCount) {
		this.concurrenceCount = concurrenceCount;
		if(concurrenceCount != null){
			putQueryParameter("ConcurrenceCount", concurrenceCount.toString());
		}
	}

	public String getDesktopType() {
		return this.desktopType;
	}

	public void setDesktopType(String desktopType) {
		this.desktopType = desktopType;
		if(desktopType != null){
			putQueryParameter("DesktopType", desktopType);
		}
	}

	@Override
	public Class<DescribePriceForCreateDesktopOversoldGroupResponse> getResponseClass() {
		return DescribePriceForCreateDesktopOversoldGroupResponse.class;
	}

}
