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

package com.aliyuncs.cloudesl.model.v20180801;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class DescribeEslDevicesRequest extends RpcAcsRequest<DescribeEslDevicesResponse> {
	
	public DescribeEslDevicesRequest() {
		super("cloudesl", "2018-08-01", "DescribeEslDevices");
	}

	private Integer toBatteryLevel;

	private String storeId;

	private String type;

	private String mac;

	private Integer pageNumber;

	private Integer fromBatteryLevel;

	private String shelfCode;

	private String eslBarCode;

	private String vendor;

	private Integer pageSize;

	private Boolean beBind;

	private String itemBarCode;

	public Integer getToBatteryLevel() {
		return this.toBatteryLevel;
	}

	public void setToBatteryLevel(Integer toBatteryLevel) {
		this.toBatteryLevel = toBatteryLevel;
		if(toBatteryLevel != null){
			putQueryParameter("ToBatteryLevel", toBatteryLevel.toString());
		}
	}

	public String getStoreId() {
		return this.storeId;
	}

	public void setStoreId(String storeId) {
		this.storeId = storeId;
		if(storeId != null){
			putQueryParameter("StoreId", storeId);
		}
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putQueryParameter("Type", type);
		}
	}

	public String getMac() {
		return this.mac;
	}

	public void setMac(String mac) {
		this.mac = mac;
		if(mac != null){
			putQueryParameter("Mac", mac);
		}
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
		}
	}

	public Integer getFromBatteryLevel() {
		return this.fromBatteryLevel;
	}

	public void setFromBatteryLevel(Integer fromBatteryLevel) {
		this.fromBatteryLevel = fromBatteryLevel;
		if(fromBatteryLevel != null){
			putQueryParameter("FromBatteryLevel", fromBatteryLevel.toString());
		}
	}

	public String getShelfCode() {
		return this.shelfCode;
	}

	public void setShelfCode(String shelfCode) {
		this.shelfCode = shelfCode;
		if(shelfCode != null){
			putQueryParameter("ShelfCode", shelfCode);
		}
	}

	public String getEslBarCode() {
		return this.eslBarCode;
	}

	public void setEslBarCode(String eslBarCode) {
		this.eslBarCode = eslBarCode;
		if(eslBarCode != null){
			putQueryParameter("EslBarCode", eslBarCode);
		}
	}

	public String getVendor() {
		return this.vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
		if(vendor != null){
			putQueryParameter("Vendor", vendor);
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

	public Boolean getBeBind() {
		return this.beBind;
	}

	public void setBeBind(Boolean beBind) {
		this.beBind = beBind;
		if(beBind != null){
			putQueryParameter("BeBind", beBind.toString());
		}
	}

	public String getItemBarCode() {
		return this.itemBarCode;
	}

	public void setItemBarCode(String itemBarCode) {
		this.itemBarCode = itemBarCode;
		if(itemBarCode != null){
			putQueryParameter("ItemBarCode", itemBarCode);
		}
	}

	@Override
	public Class<DescribeEslDevicesResponse> getResponseClass() {
		return DescribeEslDevicesResponse.class;
	}

}
