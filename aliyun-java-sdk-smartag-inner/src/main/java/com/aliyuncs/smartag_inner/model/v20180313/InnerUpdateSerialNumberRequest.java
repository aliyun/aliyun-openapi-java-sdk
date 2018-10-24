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
public class InnerUpdateSerialNumberRequest extends RpcAcsRequest<InnerUpdateSerialNumberResponse> {
	
	public InnerUpdateSerialNumberRequest() {
		super("Smartag-inner", "2018-03-13", "InnerUpdateSerialNumber", "smartag", "innerAPI");
	}

	private String access_key_id;

	private String serialNumber;

	private Long resourceUid;

	private String smartAGId;

	private String resourceBid;

	public String getAccess_key_id() {
		return this.access_key_id;
	}

	public void setAccess_key_id(String access_key_id) {
		this.access_key_id = access_key_id;
		if(access_key_id != null){
			putQueryParameter("access_key_id", access_key_id);
		}
	}

	public String getSerialNumber() {
		return this.serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
		if(serialNumber != null){
			putQueryParameter("SerialNumber", serialNumber);
		}
	}

	public Long getResourceUid() {
		return this.resourceUid;
	}

	public void setResourceUid(Long resourceUid) {
		this.resourceUid = resourceUid;
		if(resourceUid != null){
			putQueryParameter("ResourceUid", resourceUid.toString());
		}
	}

	public String getSmartAGId() {
		return this.smartAGId;
	}

	public void setSmartAGId(String smartAGId) {
		this.smartAGId = smartAGId;
		if(smartAGId != null){
			putQueryParameter("SmartAGId", smartAGId);
		}
	}

	public String getResourceBid() {
		return this.resourceBid;
	}

	public void setResourceBid(String resourceBid) {
		this.resourceBid = resourceBid;
		if(resourceBid != null){
			putQueryParameter("ResourceBid", resourceBid);
		}
	}

	@Override
	public Class<InnerUpdateSerialNumberResponse> getResponseClass() {
		return InnerUpdateSerialNumberResponse.class;
	}

}
