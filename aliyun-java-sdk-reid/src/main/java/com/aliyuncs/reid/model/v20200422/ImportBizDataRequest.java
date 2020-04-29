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

package com.aliyuncs.reid.model.v20200422;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.reid.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ImportBizDataRequest extends RpcAcsRequest<ImportBizDataResponse> {
	   

	private List<BizData> bizDatas;
	public ImportBizDataRequest() {
		super("reid", "2020-04-22", "ImportBizData", "1.1.3");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<BizData> getBizDatas() {
		return this.bizDatas;
	}

	public void setBizDatas(List<BizData> bizDatas) {
		this.bizDatas = bizDatas;	
		if (bizDatas != null) {
			for (int depth1 = 0; depth1 < bizDatas.size(); depth1++) {
				putBodyParameter("BizData." + (depth1 + 1) + ".RecordId" , bizDatas.get(depth1).getRecordId());
				putBodyParameter("BizData." + (depth1 + 1) + ".EndTime" , bizDatas.get(depth1).getEndTime());
				putBodyParameter("BizData." + (depth1 + 1) + ".StartTime" , bizDatas.get(depth1).getStartTime());
				putBodyParameter("BizData." + (depth1 + 1) + ".Attribute" , bizDatas.get(depth1).getAttribute());
				putBodyParameter("BizData." + (depth1 + 1) + ".StoreId" , bizDatas.get(depth1).getStoreId());
				putBodyParameter("BizData." + (depth1 + 1) + ".BizDataType" , bizDatas.get(depth1).getBizDataType());
				putBodyParameter("BizData." + (depth1 + 1) + ".DeviceId" , bizDatas.get(depth1).getDeviceId());
				putBodyParameter("BizData." + (depth1 + 1) + ".DeviceType" , bizDatas.get(depth1).getDeviceType());
			}
		}	
	}

	public static class BizData {

		private String recordId;

		private Long endTime;

		private Long startTime;

		private String attribute;

		private Long storeId;

		private String bizDataType;

		private String deviceId;

		private String deviceType;

		public String getRecordId() {
			return this.recordId;
		}

		public void setRecordId(String recordId) {
			this.recordId = recordId;
		}

		public Long getEndTime() {
			return this.endTime;
		}

		public void setEndTime(Long endTime) {
			this.endTime = endTime;
		}

		public Long getStartTime() {
			return this.startTime;
		}

		public void setStartTime(Long startTime) {
			this.startTime = startTime;
		}

		public String getAttribute() {
			return this.attribute;
		}

		public void setAttribute(String attribute) {
			this.attribute = attribute;
		}

		public Long getStoreId() {
			return this.storeId;
		}

		public void setStoreId(Long storeId) {
			this.storeId = storeId;
		}

		public String getBizDataType() {
			return this.bizDataType;
		}

		public void setBizDataType(String bizDataType) {
			this.bizDataType = bizDataType;
		}

		public String getDeviceId() {
			return this.deviceId;
		}

		public void setDeviceId(String deviceId) {
			this.deviceId = deviceId;
		}

		public String getDeviceType() {
			return this.deviceType;
		}

		public void setDeviceType(String deviceType) {
			this.deviceType = deviceType;
		}
	}

	@Override
	public Class<ImportBizDataResponse> getResponseClass() {
		return ImportBizDataResponse.class;
	}

}
