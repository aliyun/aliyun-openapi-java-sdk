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

package com.aliyuncs.smartag_inner.model.v20180313;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class InnerScanSmartAccessGatewayEventsRequest extends RpcAcsRequest<InnerScanSmartAccessGatewayEventsResponse> {
	
	public InnerScanSmartAccessGatewayEventsRequest() {
		super("Smartag-inner", "2018-03-13", "InnerScanSmartAccessGatewayEvents", "smartag", "innerAPI");
	}

	private String access_key_id;

	private Long handledTimes;

	private String smartAccessGatewayId;

	private String regionNo;

	public String getAccess_key_id() {
		return this.access_key_id;
	}

	public void setAccess_key_id(String access_key_id) {
		this.access_key_id = access_key_id;
		if(access_key_id != null){
			putQueryParameter("access_key_id", access_key_id);
		}
	}

	public Long getHandledTimes() {
		return this.handledTimes;
	}

	public void setHandledTimes(Long handledTimes) {
		this.handledTimes = handledTimes;
		if(handledTimes != null){
			putQueryParameter("HandledTimes", handledTimes.toString());
		}
	}

	public String getSmartAccessGatewayId() {
		return this.smartAccessGatewayId;
	}

	public void setSmartAccessGatewayId(String smartAccessGatewayId) {
		this.smartAccessGatewayId = smartAccessGatewayId;
		if(smartAccessGatewayId != null){
			putQueryParameter("SmartAccessGatewayId", smartAccessGatewayId);
		}
	}

	public String getRegionNo() {
		return this.regionNo;
	}

	public void setRegionNo(String regionNo) {
		this.regionNo = regionNo;
		if(regionNo != null){
			putQueryParameter("RegionNo", regionNo);
		}
	}

	@Override
	public Class<InnerScanSmartAccessGatewayEventsResponse> getResponseClass() {
		return InnerScanSmartAccessGatewayEventsResponse.class;
	}

}
