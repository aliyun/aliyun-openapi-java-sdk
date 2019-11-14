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

package com.aliyuncs.fss.model.v20190125;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.fss.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ScanFirmwareRequest extends RpcAcsRequest<ScanFirmwareResponse> {
	   

	private String fssSign;

	private String fssAccessKey;

	private String fssNotifyInterface;

	private String fssVersion;

	private String fssUrl;

	private String fssRescan;

	private String fssNotifyType;

	private String fssVendor;

	private String fssProduct;
	public ScanFirmwareRequest() {
		super("Fss", "2019-01-25", "ScanFirmware");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getFssSign() {
		return this.fssSign;
	}

	public void setFssSign(String fssSign) {
		this.fssSign = fssSign;
		if(fssSign != null){
			putBodyParameter("FssSign", fssSign);
		}
	}

	public String getFssAccessKey() {
		return this.fssAccessKey;
	}

	public void setFssAccessKey(String fssAccessKey) {
		this.fssAccessKey = fssAccessKey;
		if(fssAccessKey != null){
			putBodyParameter("FssAccessKey", fssAccessKey);
		}
	}

	public String getFssNotifyInterface() {
		return this.fssNotifyInterface;
	}

	public void setFssNotifyInterface(String fssNotifyInterface) {
		this.fssNotifyInterface = fssNotifyInterface;
		if(fssNotifyInterface != null){
			putBodyParameter("FssNotifyInterface", fssNotifyInterface);
		}
	}

	public String getFssVersion() {
		return this.fssVersion;
	}

	public void setFssVersion(String fssVersion) {
		this.fssVersion = fssVersion;
		if(fssVersion != null){
			putBodyParameter("FssVersion", fssVersion);
		}
	}

	public String getFssUrl() {
		return this.fssUrl;
	}

	public void setFssUrl(String fssUrl) {
		this.fssUrl = fssUrl;
		if(fssUrl != null){
			putBodyParameter("FssUrl", fssUrl);
		}
	}

	public String getFssRescan() {
		return this.fssRescan;
	}

	public void setFssRescan(String fssRescan) {
		this.fssRescan = fssRescan;
		if(fssRescan != null){
			putBodyParameter("FssRescan", fssRescan);
		}
	}

	public String getFssNotifyType() {
		return this.fssNotifyType;
	}

	public void setFssNotifyType(String fssNotifyType) {
		this.fssNotifyType = fssNotifyType;
		if(fssNotifyType != null){
			putBodyParameter("FssNotifyType", fssNotifyType);
		}
	}

	public String getFssVendor() {
		return this.fssVendor;
	}

	public void setFssVendor(String fssVendor) {
		this.fssVendor = fssVendor;
		if(fssVendor != null){
			putBodyParameter("FssVendor", fssVendor);
		}
	}

	public String getFssProduct() {
		return this.fssProduct;
	}

	public void setFssProduct(String fssProduct) {
		this.fssProduct = fssProduct;
		if(fssProduct != null){
			putBodyParameter("FssProduct", fssProduct);
		}
	}

	@Override
	public Class<ScanFirmwareResponse> getResponseClass() {
		return ScanFirmwareResponse.class;
	}

}
