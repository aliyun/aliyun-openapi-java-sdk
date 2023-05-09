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
import com.aliyuncs.http.MethodType;
import com.aliyuncs.iot.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ImportDTDataRequest extends RpcAcsRequest<ImportDTDataResponse> {
	   

	private String dTInstanceId;

	private String iotInstanceId;

	private String productKey;

	private List<Items> itemss;
	public ImportDTDataRequest() {
		super("Iot", "2018-01-20", "ImportDTData");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getDTInstanceId() {
		return this.dTInstanceId;
	}

	public void setDTInstanceId(String dTInstanceId) {
		this.dTInstanceId = dTInstanceId;
		if(dTInstanceId != null){
			putQueryParameter("DTInstanceId", dTInstanceId);
		}
	}

	public String getIotInstanceId() {
		return this.iotInstanceId;
	}

	public void setIotInstanceId(String iotInstanceId) {
		this.iotInstanceId = iotInstanceId;
		if(iotInstanceId != null){
			putBodyParameter("IotInstanceId", iotInstanceId);
		}
	}

	public String getProductKey() {
		return this.productKey;
	}

	public void setProductKey(String productKey) {
		this.productKey = productKey;
		if(productKey != null){
			putBodyParameter("ProductKey", productKey);
		}
	}

	public List<Items> getItemss() {
		return this.itemss;
	}

	public void setItemss(List<Items> itemss) {
		this.itemss = itemss;	
		if (itemss != null) {
			for (int depth1 = 0; depth1 < itemss.size(); depth1++) {
				putBodyParameter("Items." + (depth1 + 1) + ".DeviceName" , itemss.get(depth1).getDeviceName());
				putBodyParameter("Items." + (depth1 + 1) + ".Params" , itemss.get(depth1).getParams());
			}
		}	
	}

	public static class Items {

		private String deviceName;

		private String params;

		public String getDeviceName() {
			return this.deviceName;
		}

		public void setDeviceName(String deviceName) {
			this.deviceName = deviceName;
		}

		public String getParams() {
			return this.params;
		}

		public void setParams(String params) {
			this.params = params;
		}
	}

	@Override
	public Class<ImportDTDataResponse> getResponseClass() {
		return ImportDTDataResponse.class;
	}

}
