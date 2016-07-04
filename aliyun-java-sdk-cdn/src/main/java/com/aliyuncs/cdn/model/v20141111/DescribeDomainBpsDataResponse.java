/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.cdn.model.v20141111;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cdn.transform.v20141111.DescribeDomainBpsDataResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDomainBpsDataResponse extends AcsResponse {

	private String requestId;

	private String domainName;

	private String dataInterval;

	private String startTime;

	private String endTime;

	private String locationNameEn;

	private String ispNameEn;

	private String locationName;

	private String ispName;

	private List<DataModule> bpsDataPerInterval;

	private List<DataModule> supplyBpsDatas;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getDomainName() {
		return this.domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
	}

	public String getDataInterval() {
		return this.dataInterval;
	}

	public void setDataInterval(String dataInterval) {
		this.dataInterval = dataInterval;
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getLocationNameEn() {
		return this.locationNameEn;
	}

	public void setLocationNameEn(String locationNameEn) {
		this.locationNameEn = locationNameEn;
	}

	public String getIspNameEn() {
		return this.ispNameEn;
	}

	public void setIspNameEn(String ispNameEn) {
		this.ispNameEn = ispNameEn;
	}

	public String getLocationName() {
		return this.locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	public String getIspName() {
		return this.ispName;
	}

	public void setIspName(String ispName) {
		this.ispName = ispName;
	}

	public List<DataModule> getBpsDataPerInterval() {
		return this.bpsDataPerInterval;
	}

	public void setBpsDataPerInterval(List<DataModule> bpsDataPerInterval) {
		this.bpsDataPerInterval = bpsDataPerInterval;
	}

	public List<DataModule> getSupplyBpsDatas() {
		return this.supplyBpsDatas;
	}

	public void setSupplyBpsDatas(List<DataModule> supplyBpsDatas) {
		this.supplyBpsDatas = supplyBpsDatas;
	}

	public static class DataModule {

		private String timeStamp;

		private String value;

		private String domesticValue;

		private String overseasValue;

		public String getTimeStamp() {
			return this.timeStamp;
		}

		public void setTimeStamp(String timeStamp) {
			this.timeStamp = timeStamp;
		}

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getDomesticValue() {
			return this.domesticValue;
		}

		public void setDomesticValue(String domesticValue) {
			this.domesticValue = domesticValue;
		}

		public String getOverseasValue() {
			return this.overseasValue;
		}

		public void setOverseasValue(String overseasValue) {
			this.overseasValue = overseasValue;
		}
	}

	@Override
	public DescribeDomainBpsDataResponse getInstance(UnmarshallerContext context) {
		return	DescribeDomainBpsDataResponseUnmarshaller.unmarshall(this, context);
	}
}
