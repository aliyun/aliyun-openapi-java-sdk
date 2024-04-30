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

package com.aliyuncs.rds.model.v20140815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.rds.transform.v20140815.DescribeCustinsResourceInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeCustinsResourceInfoResponse extends AcsResponse {

	private String requestId;

	private List<DataItem> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private String maxIopsIncreaseRatio;

		private String maxConnIncreaseRatioValue;

		private String memoryAdjustDeadline;

		private String memAdjustableMaxValue;

		private String iopsAdjustableMaxValue;

		private String cpuIncreaseRatio;

		private String maxIopsIncreaseRatioValue;

		private String originMaxConn;

		private String memoryIncreaseRatioValue;

		private String maxConnIncreaseRatio;

		private String cpuIncreaseRatioValue;

		private String originMaxIops;

		private String maxConnAdjustableMaxValue;

		private String maxConnAdjustDeadline;

		private String maxIopsAdjustDeadline;

		private String originMemory;

		private String memAdjustableMaxRatio;

		private String cpuAdjustableMaxValue;

		private String cpuAdjustableMaxRatio;

		private String cpuAdjustDeadline;

		private String memoryIncreaseRatio;

		private String originCpu;

		private String dBInstanceId;

		public String getMaxIopsIncreaseRatio() {
			return this.maxIopsIncreaseRatio;
		}

		public void setMaxIopsIncreaseRatio(String maxIopsIncreaseRatio) {
			this.maxIopsIncreaseRatio = maxIopsIncreaseRatio;
		}

		public String getMaxConnIncreaseRatioValue() {
			return this.maxConnIncreaseRatioValue;
		}

		public void setMaxConnIncreaseRatioValue(String maxConnIncreaseRatioValue) {
			this.maxConnIncreaseRatioValue = maxConnIncreaseRatioValue;
		}

		public String getMemoryAdjustDeadline() {
			return this.memoryAdjustDeadline;
		}

		public void setMemoryAdjustDeadline(String memoryAdjustDeadline) {
			this.memoryAdjustDeadline = memoryAdjustDeadline;
		}

		public String getMemAdjustableMaxValue() {
			return this.memAdjustableMaxValue;
		}

		public void setMemAdjustableMaxValue(String memAdjustableMaxValue) {
			this.memAdjustableMaxValue = memAdjustableMaxValue;
		}

		public String getIopsAdjustableMaxValue() {
			return this.iopsAdjustableMaxValue;
		}

		public void setIopsAdjustableMaxValue(String iopsAdjustableMaxValue) {
			this.iopsAdjustableMaxValue = iopsAdjustableMaxValue;
		}

		public String getCpuIncreaseRatio() {
			return this.cpuIncreaseRatio;
		}

		public void setCpuIncreaseRatio(String cpuIncreaseRatio) {
			this.cpuIncreaseRatio = cpuIncreaseRatio;
		}

		public String getMaxIopsIncreaseRatioValue() {
			return this.maxIopsIncreaseRatioValue;
		}

		public void setMaxIopsIncreaseRatioValue(String maxIopsIncreaseRatioValue) {
			this.maxIopsIncreaseRatioValue = maxIopsIncreaseRatioValue;
		}

		public String getOriginMaxConn() {
			return this.originMaxConn;
		}

		public void setOriginMaxConn(String originMaxConn) {
			this.originMaxConn = originMaxConn;
		}

		public String getMemoryIncreaseRatioValue() {
			return this.memoryIncreaseRatioValue;
		}

		public void setMemoryIncreaseRatioValue(String memoryIncreaseRatioValue) {
			this.memoryIncreaseRatioValue = memoryIncreaseRatioValue;
		}

		public String getMaxConnIncreaseRatio() {
			return this.maxConnIncreaseRatio;
		}

		public void setMaxConnIncreaseRatio(String maxConnIncreaseRatio) {
			this.maxConnIncreaseRatio = maxConnIncreaseRatio;
		}

		public String getCpuIncreaseRatioValue() {
			return this.cpuIncreaseRatioValue;
		}

		public void setCpuIncreaseRatioValue(String cpuIncreaseRatioValue) {
			this.cpuIncreaseRatioValue = cpuIncreaseRatioValue;
		}

		public String getOriginMaxIops() {
			return this.originMaxIops;
		}

		public void setOriginMaxIops(String originMaxIops) {
			this.originMaxIops = originMaxIops;
		}

		public String getMaxConnAdjustableMaxValue() {
			return this.maxConnAdjustableMaxValue;
		}

		public void setMaxConnAdjustableMaxValue(String maxConnAdjustableMaxValue) {
			this.maxConnAdjustableMaxValue = maxConnAdjustableMaxValue;
		}

		public String getMaxConnAdjustDeadline() {
			return this.maxConnAdjustDeadline;
		}

		public void setMaxConnAdjustDeadline(String maxConnAdjustDeadline) {
			this.maxConnAdjustDeadline = maxConnAdjustDeadline;
		}

		public String getMaxIopsAdjustDeadline() {
			return this.maxIopsAdjustDeadline;
		}

		public void setMaxIopsAdjustDeadline(String maxIopsAdjustDeadline) {
			this.maxIopsAdjustDeadline = maxIopsAdjustDeadline;
		}

		public String getOriginMemory() {
			return this.originMemory;
		}

		public void setOriginMemory(String originMemory) {
			this.originMemory = originMemory;
		}

		public String getMemAdjustableMaxRatio() {
			return this.memAdjustableMaxRatio;
		}

		public void setMemAdjustableMaxRatio(String memAdjustableMaxRatio) {
			this.memAdjustableMaxRatio = memAdjustableMaxRatio;
		}

		public String getCpuAdjustableMaxValue() {
			return this.cpuAdjustableMaxValue;
		}

		public void setCpuAdjustableMaxValue(String cpuAdjustableMaxValue) {
			this.cpuAdjustableMaxValue = cpuAdjustableMaxValue;
		}

		public String getCpuAdjustableMaxRatio() {
			return this.cpuAdjustableMaxRatio;
		}

		public void setCpuAdjustableMaxRatio(String cpuAdjustableMaxRatio) {
			this.cpuAdjustableMaxRatio = cpuAdjustableMaxRatio;
		}

		public String getCpuAdjustDeadline() {
			return this.cpuAdjustDeadline;
		}

		public void setCpuAdjustDeadline(String cpuAdjustDeadline) {
			this.cpuAdjustDeadline = cpuAdjustDeadline;
		}

		public String getMemoryIncreaseRatio() {
			return this.memoryIncreaseRatio;
		}

		public void setMemoryIncreaseRatio(String memoryIncreaseRatio) {
			this.memoryIncreaseRatio = memoryIncreaseRatio;
		}

		public String getOriginCpu() {
			return this.originCpu;
		}

		public void setOriginCpu(String originCpu) {
			this.originCpu = originCpu;
		}

		public String getDBInstanceId() {
			return this.dBInstanceId;
		}

		public void setDBInstanceId(String dBInstanceId) {
			this.dBInstanceId = dBInstanceId;
		}
	}

	@Override
	public DescribeCustinsResourceInfoResponse getInstance(UnmarshallerContext context) {
		return	DescribeCustinsResourceInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
