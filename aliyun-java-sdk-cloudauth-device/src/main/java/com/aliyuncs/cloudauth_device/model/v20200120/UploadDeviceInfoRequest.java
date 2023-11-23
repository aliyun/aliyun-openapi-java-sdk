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

package com.aliyuncs.cloudauth_device.model.v20200120;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class UploadDeviceInfoRequest extends RpcAcsRequest<UploadDeviceInfoResponse> {
	   

	private List<String> uploadInfoss;

	private String flag;

	private String appVersion;

	private String bizType;
	public UploadDeviceInfoRequest() {
		super("Cloudauth-device", "2020-01-20", "UploadDeviceInfo");
		setMethod(MethodType.POST);
	}

	public List<String> getUploadInfoss() {
		return this.uploadInfoss;
	}

	public void setUploadInfoss(List<String> uploadInfoss) {
		this.uploadInfoss = uploadInfoss;	
		if (uploadInfoss != null) {
			for (int i = 0; i < uploadInfoss.size(); i++) {
				putQueryParameter("UploadInfos." + (i + 1) , uploadInfoss.get(i));
			}
		}	
	}

	public String getFlag() {
		return this.flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
		if(flag != null){
			putQueryParameter("Flag", flag);
		}
	}

	public String getAppVersion() {
		return this.appVersion;
	}

	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
		if(appVersion != null){
			putQueryParameter("AppVersion", appVersion);
		}
	}

	public String getBizType() {
		return this.bizType;
	}

	public void setBizType(String bizType) {
		this.bizType = bizType;
		if(bizType != null){
			putQueryParameter("BizType", bizType);
		}
	}

	@Override
	public Class<UploadDeviceInfoResponse> getResponseClass() {
		return UploadDeviceInfoResponse.class;
	}

}
