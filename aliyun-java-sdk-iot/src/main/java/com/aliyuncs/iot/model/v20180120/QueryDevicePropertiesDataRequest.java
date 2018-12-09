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

package com.aliyuncs.iot.model.v20180120;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;

/**
 * @author auto create
 * @version 
 */
public class QueryDevicePropertiesDataRequest extends RpcAcsRequest<QueryDevicePropertiesDataResponse> {
	
	public QueryDevicePropertiesDataRequest() {
		super("Iot", "2018-01-20", "QueryDevicePropertiesData");
	}

	private Integer asc;

	private List<String> identifiers;

	private String iotId;

	private Integer pageSize;

	private Long endTime;

	private String deviceName;

	private Long startTime;

	private String productKey;

	public Integer getAsc() {
		return this.asc;
	}

	public void setAsc(Integer asc) {
		this.asc = asc;
		if(asc != null){
			putQueryParameter("Asc", asc.toString());
		}
	}

	public List<String> getIdentifiers() {
		return this.identifiers;
	}

	public void setIdentifiers(List<String> identifiers) {
		this.identifiers = identifiers;	
		if (identifiers != null) {
			for (int i = 0; i < identifiers.size(); i++) {
				putQueryParameter("Identifier." + (i + 1) , identifiers.get(i));
			}
		}	
	}

	public String getIotId() {
		return this.iotId;
	}

	public void setIotId(String iotId) {
		this.iotId = iotId;
		if(iotId != null){
			putQueryParameter("IotId", iotId);
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public Long getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Long endTime) {
		this.endTime = endTime;
		if(endTime != null){
			putQueryParameter("EndTime", endTime.toString());
		}
	}

	public String getDeviceName() {
		return this.deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
		if(deviceName != null){
			putQueryParameter("DeviceName", deviceName);
		}
	}

	public Long getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Long startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putQueryParameter("StartTime", startTime.toString());
		}
	}

	public String getProductKey() {
		return this.productKey;
	}

	public void setProductKey(String productKey) {
		this.productKey = productKey;
		if(productKey != null){
			putQueryParameter("ProductKey", productKey);
		}
	}

	@Override
	public Class<QueryDevicePropertiesDataResponse> getResponseClass() {
		return QueryDevicePropertiesDataResponse.class;
	}

}
