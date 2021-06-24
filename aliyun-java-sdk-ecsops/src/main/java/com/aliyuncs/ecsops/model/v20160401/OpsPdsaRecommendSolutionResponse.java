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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsPdsaRecommendSolutionResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsPdsaRecommendSolutionResponse extends AcsResponse {

	private String requestId;

	private List<PdsaSubSolutionResult> pdsaSubSolutionResults;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<PdsaSubSolutionResult> getPdsaSubSolutionResults() {
		return this.pdsaSubSolutionResults;
	}

	public void setPdsaSubSolutionResults(List<PdsaSubSolutionResult> pdsaSubSolutionResults) {
		this.pdsaSubSolutionResults = pdsaSubSolutionResults;
	}

	public static class PdsaSubSolutionResult {

		private String netWorkParam;

		private String endDate;

		private String solutionType;

		private String regionNo;

		private String beginDate;

		private String cpuModel;

		private Float linuxPrice;

		private String iops;

		private String instanceType;

		private Float windowsPrice;

		private Long mem;

		private Long amount;

		private Integer inventoryType;

		private Long cpu;

		private Float price;

		private String zoneId;

		private Long inventoryAmount;

		public String getNetWorkParam() {
			return this.netWorkParam;
		}

		public void setNetWorkParam(String netWorkParam) {
			this.netWorkParam = netWorkParam;
		}

		public String getEndDate() {
			return this.endDate;
		}

		public void setEndDate(String endDate) {
			this.endDate = endDate;
		}

		public String getSolutionType() {
			return this.solutionType;
		}

		public void setSolutionType(String solutionType) {
			this.solutionType = solutionType;
		}

		public String getRegionNo() {
			return this.regionNo;
		}

		public void setRegionNo(String regionNo) {
			this.regionNo = regionNo;
		}

		public String getBeginDate() {
			return this.beginDate;
		}

		public void setBeginDate(String beginDate) {
			this.beginDate = beginDate;
		}

		public String getCpuModel() {
			return this.cpuModel;
		}

		public void setCpuModel(String cpuModel) {
			this.cpuModel = cpuModel;
		}

		public Float getLinuxPrice() {
			return this.linuxPrice;
		}

		public void setLinuxPrice(Float linuxPrice) {
			this.linuxPrice = linuxPrice;
		}

		public String getIops() {
			return this.iops;
		}

		public void setIops(String iops) {
			this.iops = iops;
		}

		public String getInstanceType() {
			return this.instanceType;
		}

		public void setInstanceType(String instanceType) {
			this.instanceType = instanceType;
		}

		public Float getWindowsPrice() {
			return this.windowsPrice;
		}

		public void setWindowsPrice(Float windowsPrice) {
			this.windowsPrice = windowsPrice;
		}

		public Long getMem() {
			return this.mem;
		}

		public void setMem(Long mem) {
			this.mem = mem;
		}

		public Long getAmount() {
			return this.amount;
		}

		public void setAmount(Long amount) {
			this.amount = amount;
		}

		public Integer getInventoryType() {
			return this.inventoryType;
		}

		public void setInventoryType(Integer inventoryType) {
			this.inventoryType = inventoryType;
		}

		public Long getCpu() {
			return this.cpu;
		}

		public void setCpu(Long cpu) {
			this.cpu = cpu;
		}

		public Float getPrice() {
			return this.price;
		}

		public void setPrice(Float price) {
			this.price = price;
		}

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

		public Long getInventoryAmount() {
			return this.inventoryAmount;
		}

		public void setInventoryAmount(Long inventoryAmount) {
			this.inventoryAmount = inventoryAmount;
		}
	}

	@Override
	public OpsPdsaRecommendSolutionResponse getInstance(UnmarshallerContext context) {
		return	OpsPdsaRecommendSolutionResponseUnmarshaller.unmarshall(this, context);
	}
}
