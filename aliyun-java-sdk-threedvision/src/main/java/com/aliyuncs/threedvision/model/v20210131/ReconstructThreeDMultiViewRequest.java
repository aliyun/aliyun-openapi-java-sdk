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

package com.aliyuncs.threedvision.model.v20210131;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ReconstructThreeDMultiViewRequest extends RpcAcsRequest<ReconstructThreeDMultiViewResponse> {
	   

	private String mode;

	private String zipFileUrl;
	public ReconstructThreeDMultiViewRequest() {
		super("threedvision", "2021-01-31", "ReconstructThreeDMultiView");
		setMethod(MethodType.POST);
	}

	public String getMode() {
		return this.mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
		if(mode != null){
			putBodyParameter("Mode", mode);
		}
	}

	public String getZipFileUrl() {
		return this.zipFileUrl;
	}

	public void setZipFileUrl(String zipFileUrl) {
		this.zipFileUrl = zipFileUrl;
		if(zipFileUrl != null){
			putBodyParameter("ZipFileUrl", zipFileUrl);
		}
	}

	@Override
	public Class<ReconstructThreeDMultiViewResponse> getResponseClass() {
		return ReconstructThreeDMultiViewResponse.class;
	}

}
