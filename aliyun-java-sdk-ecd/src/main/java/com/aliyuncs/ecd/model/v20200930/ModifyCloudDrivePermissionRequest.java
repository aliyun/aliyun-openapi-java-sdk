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

package com.aliyuncs.ecd.model.v20200930;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecd.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyCloudDrivePermissionRequest extends RpcAcsRequest<ModifyCloudDrivePermissionResponse> {
	   

	private List<String> downloadEndUserIdss;

	private String cdsId;

	private List<String> downloadUploadEndUserIdss;
	public ModifyCloudDrivePermissionRequest() {
		super("ecd", "2020-09-30", "ModifyCloudDrivePermission");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getDownloadEndUserIdss() {
		return this.downloadEndUserIdss;
	}

	public void setDownloadEndUserIdss(List<String> downloadEndUserIdss) {
		this.downloadEndUserIdss = downloadEndUserIdss;	
		if (downloadEndUserIdss != null) {
			for (int i = 0; i < downloadEndUserIdss.size(); i++) {
				putQueryParameter("DownloadEndUserIds." + (i + 1) , downloadEndUserIdss.get(i));
			}
		}	
	}

	public String getCdsId() {
		return this.cdsId;
	}

	public void setCdsId(String cdsId) {
		this.cdsId = cdsId;
		if(cdsId != null){
			putQueryParameter("CdsId", cdsId);
		}
	}

	public List<String> getDownloadUploadEndUserIdss() {
		return this.downloadUploadEndUserIdss;
	}

	public void setDownloadUploadEndUserIdss(List<String> downloadUploadEndUserIdss) {
		this.downloadUploadEndUserIdss = downloadUploadEndUserIdss;	
		if (downloadUploadEndUserIdss != null) {
			for (int i = 0; i < downloadUploadEndUserIdss.size(); i++) {
				putQueryParameter("DownloadUploadEndUserIds." + (i + 1) , downloadUploadEndUserIdss.get(i));
			}
		}	
	}

	@Override
	public Class<ModifyCloudDrivePermissionResponse> getResponseClass() {
		return ModifyCloudDrivePermissionResponse.class;
	}

}
