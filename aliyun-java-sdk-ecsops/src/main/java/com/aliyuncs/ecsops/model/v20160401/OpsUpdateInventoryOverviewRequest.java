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

package com.aliyuncs.ecsops.model.v20160401;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class OpsUpdateInventoryOverviewRequest extends RpcAcsRequest<OpsUpdateInventoryOverviewResponse> {
	   

	private Long waterMem;

	private String izNo;

	private Long elasticCpu;

	private Long ds;

	private Long dailyIncreaseMem;

	private Long memCycleDays;

	private Long cycleMem;

	private Long cpuCycleDays;

	private Long elasticMem;

	private String flavorFamily;

	private Long cycleCpuSaleRate;

	private Long dailyIncreaseCpu;

	private Long cycleMemSaleRate;

	private Long fragmentCpu;

	private Long waterCpu;

	private Long cycleCpu;

	private Long fragmentMem;

	private String auditParamStr;
	public OpsUpdateInventoryOverviewRequest() {
		super("Ecsops", "2016-04-01", "OpsUpdateInventoryOverview", "ecsops");
		setMethod(MethodType.POST);
	}

	public Long getWaterMem() {
		return this.waterMem;
	}

	public void setWaterMem(Long waterMem) {
		this.waterMem = waterMem;
		if(waterMem != null){
			putQueryParameter("WaterMem", waterMem.toString());
		}
	}

	public String getIzNo() {
		return this.izNo;
	}

	public void setIzNo(String izNo) {
		this.izNo = izNo;
		if(izNo != null){
			putQueryParameter("IzNo", izNo);
		}
	}

	public Long getElasticCpu() {
		return this.elasticCpu;
	}

	public void setElasticCpu(Long elasticCpu) {
		this.elasticCpu = elasticCpu;
		if(elasticCpu != null){
			putQueryParameter("ElasticCpu", elasticCpu.toString());
		}
	}

	public Long getDs() {
		return this.ds;
	}

	public void setDs(Long ds) {
		this.ds = ds;
		if(ds != null){
			putQueryParameter("Ds", ds.toString());
		}
	}

	public Long getDailyIncreaseMem() {
		return this.dailyIncreaseMem;
	}

	public void setDailyIncreaseMem(Long dailyIncreaseMem) {
		this.dailyIncreaseMem = dailyIncreaseMem;
		if(dailyIncreaseMem != null){
			putQueryParameter("DailyIncreaseMem", dailyIncreaseMem.toString());
		}
	}

	public Long getMemCycleDays() {
		return this.memCycleDays;
	}

	public void setMemCycleDays(Long memCycleDays) {
		this.memCycleDays = memCycleDays;
		if(memCycleDays != null){
			putQueryParameter("MemCycleDays", memCycleDays.toString());
		}
	}

	public Long getCycleMem() {
		return this.cycleMem;
	}

	public void setCycleMem(Long cycleMem) {
		this.cycleMem = cycleMem;
		if(cycleMem != null){
			putQueryParameter("CycleMem", cycleMem.toString());
		}
	}

	public Long getCpuCycleDays() {
		return this.cpuCycleDays;
	}

	public void setCpuCycleDays(Long cpuCycleDays) {
		this.cpuCycleDays = cpuCycleDays;
		if(cpuCycleDays != null){
			putQueryParameter("CpuCycleDays", cpuCycleDays.toString());
		}
	}

	public Long getElasticMem() {
		return this.elasticMem;
	}

	public void setElasticMem(Long elasticMem) {
		this.elasticMem = elasticMem;
		if(elasticMem != null){
			putQueryParameter("ElasticMem", elasticMem.toString());
		}
	}

	public String getFlavorFamily() {
		return this.flavorFamily;
	}

	public void setFlavorFamily(String flavorFamily) {
		this.flavorFamily = flavorFamily;
		if(flavorFamily != null){
			putQueryParameter("FlavorFamily", flavorFamily);
		}
	}

	public Long getCycleCpuSaleRate() {
		return this.cycleCpuSaleRate;
	}

	public void setCycleCpuSaleRate(Long cycleCpuSaleRate) {
		this.cycleCpuSaleRate = cycleCpuSaleRate;
		if(cycleCpuSaleRate != null){
			putQueryParameter("CycleCpuSaleRate", cycleCpuSaleRate.toString());
		}
	}

	public Long getDailyIncreaseCpu() {
		return this.dailyIncreaseCpu;
	}

	public void setDailyIncreaseCpu(Long dailyIncreaseCpu) {
		this.dailyIncreaseCpu = dailyIncreaseCpu;
		if(dailyIncreaseCpu != null){
			putQueryParameter("DailyIncreaseCpu", dailyIncreaseCpu.toString());
		}
	}

	public Long getCycleMemSaleRate() {
		return this.cycleMemSaleRate;
	}

	public void setCycleMemSaleRate(Long cycleMemSaleRate) {
		this.cycleMemSaleRate = cycleMemSaleRate;
		if(cycleMemSaleRate != null){
			putQueryParameter("CycleMemSaleRate", cycleMemSaleRate.toString());
		}
	}

	public Long getFragmentCpu() {
		return this.fragmentCpu;
	}

	public void setFragmentCpu(Long fragmentCpu) {
		this.fragmentCpu = fragmentCpu;
		if(fragmentCpu != null){
			putQueryParameter("FragmentCpu", fragmentCpu.toString());
		}
	}

	public Long getWaterCpu() {
		return this.waterCpu;
	}

	public void setWaterCpu(Long waterCpu) {
		this.waterCpu = waterCpu;
		if(waterCpu != null){
			putQueryParameter("WaterCpu", waterCpu.toString());
		}
	}

	public Long getCycleCpu() {
		return this.cycleCpu;
	}

	public void setCycleCpu(Long cycleCpu) {
		this.cycleCpu = cycleCpu;
		if(cycleCpu != null){
			putQueryParameter("CycleCpu", cycleCpu.toString());
		}
	}

	public Long getFragmentMem() {
		return this.fragmentMem;
	}

	public void setFragmentMem(Long fragmentMem) {
		this.fragmentMem = fragmentMem;
		if(fragmentMem != null){
			putQueryParameter("FragmentMem", fragmentMem.toString());
		}
	}

	public String getAuditParamStr() {
		return this.auditParamStr;
	}

	public void setAuditParamStr(String auditParamStr) {
		this.auditParamStr = auditParamStr;
		if(auditParamStr != null){
			putQueryParameter("AuditParamStr", auditParamStr);
		}
	}

	@Override
	public Class<OpsUpdateInventoryOverviewResponse> getResponseClass() {
		return OpsUpdateInventoryOverviewResponse.class;
	}

}
