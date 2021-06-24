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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsQuerySpotAdvisorSummaryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsQuerySpotAdvisorSummaryResponse extends AcsResponse {

	private String message;

	private String requestId;

	private String code;

	private String success;

	private Data data;

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getSuccess() {
		return this.success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Float inventoryReleaseRateStddev;

		private Integer userReleaseVcpu;

		private Float userReleaseRate;

		private Float inventoryReleaseRate;

		private Float opsReleaseRate;

		private Integer opsReleaseVcpu;

		private String networkType;

		private String instanceTypeName;

		private String gmtModified;

		private Float passiveReleaseRate;

		private Float priceReleaseRate;

		private Float discountStddev;

		private Integer ioOptimized;

		private Float opsReleaseRateStddev;

		private Integer passiveReleaseVcpu;

		private Float userReleaseRateStddev;

		private Float discountAvg;

		private Float passiveReleaseRateStddev;

		private String gmtCreate;

		private Integer priceReleaseVcpu;

		private String izNo;

		private Integer inventoryReleaseVcpu;

		private Float priceReleaseRateStddev;

		public Float getInventoryReleaseRateStddev() {
			return this.inventoryReleaseRateStddev;
		}

		public void setInventoryReleaseRateStddev(Float inventoryReleaseRateStddev) {
			this.inventoryReleaseRateStddev = inventoryReleaseRateStddev;
		}

		public Integer getUserReleaseVcpu() {
			return this.userReleaseVcpu;
		}

		public void setUserReleaseVcpu(Integer userReleaseVcpu) {
			this.userReleaseVcpu = userReleaseVcpu;
		}

		public Float getUserReleaseRate() {
			return this.userReleaseRate;
		}

		public void setUserReleaseRate(Float userReleaseRate) {
			this.userReleaseRate = userReleaseRate;
		}

		public Float getInventoryReleaseRate() {
			return this.inventoryReleaseRate;
		}

		public void setInventoryReleaseRate(Float inventoryReleaseRate) {
			this.inventoryReleaseRate = inventoryReleaseRate;
		}

		public Float getOpsReleaseRate() {
			return this.opsReleaseRate;
		}

		public void setOpsReleaseRate(Float opsReleaseRate) {
			this.opsReleaseRate = opsReleaseRate;
		}

		public Integer getOpsReleaseVcpu() {
			return this.opsReleaseVcpu;
		}

		public void setOpsReleaseVcpu(Integer opsReleaseVcpu) {
			this.opsReleaseVcpu = opsReleaseVcpu;
		}

		public String getNetworkType() {
			return this.networkType;
		}

		public void setNetworkType(String networkType) {
			this.networkType = networkType;
		}

		public String getInstanceTypeName() {
			return this.instanceTypeName;
		}

		public void setInstanceTypeName(String instanceTypeName) {
			this.instanceTypeName = instanceTypeName;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}

		public Float getPassiveReleaseRate() {
			return this.passiveReleaseRate;
		}

		public void setPassiveReleaseRate(Float passiveReleaseRate) {
			this.passiveReleaseRate = passiveReleaseRate;
		}

		public Float getPriceReleaseRate() {
			return this.priceReleaseRate;
		}

		public void setPriceReleaseRate(Float priceReleaseRate) {
			this.priceReleaseRate = priceReleaseRate;
		}

		public Float getDiscountStddev() {
			return this.discountStddev;
		}

		public void setDiscountStddev(Float discountStddev) {
			this.discountStddev = discountStddev;
		}

		public Integer getIoOptimized() {
			return this.ioOptimized;
		}

		public void setIoOptimized(Integer ioOptimized) {
			this.ioOptimized = ioOptimized;
		}

		public Float getOpsReleaseRateStddev() {
			return this.opsReleaseRateStddev;
		}

		public void setOpsReleaseRateStddev(Float opsReleaseRateStddev) {
			this.opsReleaseRateStddev = opsReleaseRateStddev;
		}

		public Integer getPassiveReleaseVcpu() {
			return this.passiveReleaseVcpu;
		}

		public void setPassiveReleaseVcpu(Integer passiveReleaseVcpu) {
			this.passiveReleaseVcpu = passiveReleaseVcpu;
		}

		public Float getUserReleaseRateStddev() {
			return this.userReleaseRateStddev;
		}

		public void setUserReleaseRateStddev(Float userReleaseRateStddev) {
			this.userReleaseRateStddev = userReleaseRateStddev;
		}

		public Float getDiscountAvg() {
			return this.discountAvg;
		}

		public void setDiscountAvg(Float discountAvg) {
			this.discountAvg = discountAvg;
		}

		public Float getPassiveReleaseRateStddev() {
			return this.passiveReleaseRateStddev;
		}

		public void setPassiveReleaseRateStddev(Float passiveReleaseRateStddev) {
			this.passiveReleaseRateStddev = passiveReleaseRateStddev;
		}

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public Integer getPriceReleaseVcpu() {
			return this.priceReleaseVcpu;
		}

		public void setPriceReleaseVcpu(Integer priceReleaseVcpu) {
			this.priceReleaseVcpu = priceReleaseVcpu;
		}

		public String getIzNo() {
			return this.izNo;
		}

		public void setIzNo(String izNo) {
			this.izNo = izNo;
		}

		public Integer getInventoryReleaseVcpu() {
			return this.inventoryReleaseVcpu;
		}

		public void setInventoryReleaseVcpu(Integer inventoryReleaseVcpu) {
			this.inventoryReleaseVcpu = inventoryReleaseVcpu;
		}

		public Float getPriceReleaseRateStddev() {
			return this.priceReleaseRateStddev;
		}

		public void setPriceReleaseRateStddev(Float priceReleaseRateStddev) {
			this.priceReleaseRateStddev = priceReleaseRateStddev;
		}
	}

	@Override
	public OpsQuerySpotAdvisorSummaryResponse getInstance(UnmarshallerContext context) {
		return	OpsQuerySpotAdvisorSummaryResponseUnmarshaller.unmarshall(this, context);
	}
}
