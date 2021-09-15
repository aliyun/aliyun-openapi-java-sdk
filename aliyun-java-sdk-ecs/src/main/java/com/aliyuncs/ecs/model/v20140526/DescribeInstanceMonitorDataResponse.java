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

package com.aliyuncs.ecs.model.v20140526;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecs.transform.v20140526.DescribeInstanceMonitorDataResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeInstanceMonitorDataResponse extends AcsResponse {

	private String requestId;

	private List<InstanceMonitorData> monitorData;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<InstanceMonitorData> getMonitorData() {
		return this.monitorData;
	}

	public void setMonitorData(List<InstanceMonitorData> monitorData) {
		this.monitorData = monitorData;
	}

	public static class InstanceMonitorData {

		private Float cPUCreditBalance;

		private Integer bPSRead;

		private Integer internetTX;

		private Integer cPU;

		private Float cPUCreditUsage;

		private Integer iOPSWrite;

		private Integer intranetTX;

		private String instanceId;

		private Integer bPSWrite;

		private Float cPUNotpaidSurplusCreditUsage;

		private Float cPUAdvanceCreditBalance;

		private Integer iOPSRead;

		private Integer internetBandwidth;

		private Integer internetRX;

		private String timeStamp;

		private Integer intranetRX;

		private Integer intranetBandwidth;

		public Float getCPUCreditBalance() {
			return this.cPUCreditBalance;
		}

		public void setCPUCreditBalance(Float cPUCreditBalance) {
			this.cPUCreditBalance = cPUCreditBalance;
		}

		public Integer getBPSRead() {
			return this.bPSRead;
		}

		public void setBPSRead(Integer bPSRead) {
			this.bPSRead = bPSRead;
		}

		public Integer getInternetTX() {
			return this.internetTX;
		}

		public void setInternetTX(Integer internetTX) {
			this.internetTX = internetTX;
		}

		public Integer getCPU() {
			return this.cPU;
		}

		public void setCPU(Integer cPU) {
			this.cPU = cPU;
		}

		public Float getCPUCreditUsage() {
			return this.cPUCreditUsage;
		}

		public void setCPUCreditUsage(Float cPUCreditUsage) {
			this.cPUCreditUsage = cPUCreditUsage;
		}

		public Integer getIOPSWrite() {
			return this.iOPSWrite;
		}

		public void setIOPSWrite(Integer iOPSWrite) {
			this.iOPSWrite = iOPSWrite;
		}

		public Integer getIntranetTX() {
			return this.intranetTX;
		}

		public void setIntranetTX(Integer intranetTX) {
			this.intranetTX = intranetTX;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public Integer getBPSWrite() {
			return this.bPSWrite;
		}

		public void setBPSWrite(Integer bPSWrite) {
			this.bPSWrite = bPSWrite;
		}

		public Float getCPUNotpaidSurplusCreditUsage() {
			return this.cPUNotpaidSurplusCreditUsage;
		}

		public void setCPUNotpaidSurplusCreditUsage(Float cPUNotpaidSurplusCreditUsage) {
			this.cPUNotpaidSurplusCreditUsage = cPUNotpaidSurplusCreditUsage;
		}

		public Float getCPUAdvanceCreditBalance() {
			return this.cPUAdvanceCreditBalance;
		}

		public void setCPUAdvanceCreditBalance(Float cPUAdvanceCreditBalance) {
			this.cPUAdvanceCreditBalance = cPUAdvanceCreditBalance;
		}

		public Integer getIOPSRead() {
			return this.iOPSRead;
		}

		public void setIOPSRead(Integer iOPSRead) {
			this.iOPSRead = iOPSRead;
		}

		public Integer getInternetBandwidth() {
			return this.internetBandwidth;
		}

		public void setInternetBandwidth(Integer internetBandwidth) {
			this.internetBandwidth = internetBandwidth;
		}

		public Integer getInternetRX() {
			return this.internetRX;
		}

		public void setInternetRX(Integer internetRX) {
			this.internetRX = internetRX;
		}

		public String getTimeStamp() {
			return this.timeStamp;
		}

		public void setTimeStamp(String timeStamp) {
			this.timeStamp = timeStamp;
		}

		public Integer getIntranetRX() {
			return this.intranetRX;
		}

		public void setIntranetRX(Integer intranetRX) {
			this.intranetRX = intranetRX;
		}

		public Integer getIntranetBandwidth() {
			return this.intranetBandwidth;
		}

		public void setIntranetBandwidth(Integer intranetBandwidth) {
			this.intranetBandwidth = intranetBandwidth;
		}
	}

	@Override
	public DescribeInstanceMonitorDataResponse getInstance(UnmarshallerContext context) {
		return	DescribeInstanceMonitorDataResponseUnmarshaller.unmarshall(this, context);
	}
}
