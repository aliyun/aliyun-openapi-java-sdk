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

package com.aliyuncs.cloudesl.model.v20190801;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cloudesl.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeEslDevicesRequest extends RpcAcsRequest<DescribeEslDevicesResponse> {
	   

	private String type;

	private String storeId;

	private Integer pageNumber;

	private String mac;

	private String vendor;

	private String eslBarCode;

	private Integer pageSize;

	private String itemBarCode;

	private String eslStatus;

	private Integer toBatteryLevel;

	private Integer fromBatteryLevel;

	private String shelfCode;

	private Boolean beBind;
	public DescribeEslDevicesRequest() {
		super("cloudesl", "2019-08-01", "DescribeEslDevices", "cloudesl");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putBodyParameter("Type", type);
		}
	}

	public String getStoreId() {
		return this.storeId;
	}

	public void setStoreId(String storeId) {
		this.storeId = storeId;
		if(storeId != null){
			putBodyParameter("StoreId", storeId);
		}
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putBodyParameter("PageNumber", pageNumber.toString());
		}
	}

	public String getMac() {
		return this.mac;
	}

	public void setMac(String mac) {
		this.mac = mac;
		if(mac != null){
			putBodyParameter("Mac", mac);
		}
	}

	public String getVendor() {
		return this.vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
		if(vendor != null){
			putBodyParameter("Vendor", vendor);
		}
	}

	public String getEslBarCode() {
		return this.eslBarCode;
	}

	public void setEslBarCode(String eslBarCode) {
		this.eslBarCode = eslBarCode;
		if(eslBarCode != null){
			putBodyParameter("EslBarCode", eslBarCode);
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putBodyParameter("PageSize", pageSize.toString());
		}
	}

	public String getItemBarCode() {
		return this.itemBarCode;
	}

	public void setItemBarCode(String itemBarCode) {
		this.itemBarCode = itemBarCode;
		if(itemBarCode != null){
			putBodyParameter("ItemBarCode", itemBarCode);
		}
	}

	public String getEslStatus() {
		return this.eslStatus;
	}

	public void setEslStatus(String eslStatus) {
		this.eslStatus = eslStatus;
		if(eslStatus != null){
			putBodyParameter("EslStatus", eslStatus);
		}
	}

	public Integer getToBatteryLevel() {
		return this.toBatteryLevel;
	}

	public void setToBatteryLevel(Integer toBatteryLevel) {
		this.toBatteryLevel = toBatteryLevel;
		if(toBatteryLevel != null){
			putBodyParameter("ToBatteryLevel", toBatteryLevel.toString());
		}
	}

	public Integer getFromBatteryLevel() {
		return this.fromBatteryLevel;
	}

	public void setFromBatteryLevel(Integer fromBatteryLevel) {
		this.fromBatteryLevel = fromBatteryLevel;
		if(fromBatteryLevel != null){
			putBodyParameter("FromBatteryLevel", fromBatteryLevel.toString());
		}
	}

	public String getShelfCode() {
		return this.shelfCode;
	}

	public void setShelfCode(String shelfCode) {
		this.shelfCode = shelfCode;
		if(shelfCode != null){
			putBodyParameter("ShelfCode", shelfCode);
		}
	}

	public Boolean getBeBind() {
		return this.beBind;
	}

	public void setBeBind(Boolean beBind) {
		this.beBind = beBind;
		if(beBind != null){
			putBodyParameter("BeBind", beBind.toString());
		}
	}

	@Override
	public Class<DescribeEslDevicesResponse> getResponseClass() {
		return DescribeEslDevicesResponse.class;
	}

}
