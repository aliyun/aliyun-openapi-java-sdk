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

package com.aliyuncs.lto.model.v20210707;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class UploadIoTDataToBlockchainRequest extends RpcAcsRequest<UploadIoTDataToBlockchainResponse> {
	   

	private String iotIdSource;

	private String iotDataToken;

	private String privacyData;

	private String iotId;

	private String iotDataDigest;

	private String iotDataDID;

	private String plainData;

	private String iotAuthType;

	private String iotIdServiceProvider;
	public UploadIoTDataToBlockchainRequest() {
		super("lto", "2021-07-07", "UploadIoTDataToBlockchain");
		setMethod(MethodType.POST);
	}

	public String getIotIdSource() {
		return this.iotIdSource;
	}

	public void setIotIdSource(String iotIdSource) {
		this.iotIdSource = iotIdSource;
		if(iotIdSource != null){
			putQueryParameter("IotIdSource", iotIdSource);
		}
	}

	public String getIotDataToken() {
		return this.iotDataToken;
	}

	public void setIotDataToken(String iotDataToken) {
		this.iotDataToken = iotDataToken;
		if(iotDataToken != null){
			putQueryParameter("IotDataToken", iotDataToken);
		}
	}

	public String getPrivacyData() {
		return this.privacyData;
	}

	public void setPrivacyData(String privacyData) {
		this.privacyData = privacyData;
		if(privacyData != null){
			putQueryParameter("PrivacyData", privacyData);
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

	public String getIotDataDigest() {
		return this.iotDataDigest;
	}

	public void setIotDataDigest(String iotDataDigest) {
		this.iotDataDigest = iotDataDigest;
		if(iotDataDigest != null){
			putQueryParameter("IotDataDigest", iotDataDigest);
		}
	}

	public String getIotDataDID() {
		return this.iotDataDID;
	}

	public void setIotDataDID(String iotDataDID) {
		this.iotDataDID = iotDataDID;
		if(iotDataDID != null){
			putQueryParameter("IotDataDID", iotDataDID);
		}
	}

	public String getPlainData() {
		return this.plainData;
	}

	public void setPlainData(String plainData) {
		this.plainData = plainData;
		if(plainData != null){
			putQueryParameter("PlainData", plainData);
		}
	}

	public String getIotAuthType() {
		return this.iotAuthType;
	}

	public void setIotAuthType(String iotAuthType) {
		this.iotAuthType = iotAuthType;
		if(iotAuthType != null){
			putQueryParameter("IotAuthType", iotAuthType);
		}
	}

	public String getIotIdServiceProvider() {
		return this.iotIdServiceProvider;
	}

	public void setIotIdServiceProvider(String iotIdServiceProvider) {
		this.iotIdServiceProvider = iotIdServiceProvider;
		if(iotIdServiceProvider != null){
			putQueryParameter("IotIdServiceProvider", iotIdServiceProvider);
		}
	}

	@Override
	public Class<UploadIoTDataToBlockchainResponse> getResponseClass() {
		return UploadIoTDataToBlockchainResponse.class;
	}

}
