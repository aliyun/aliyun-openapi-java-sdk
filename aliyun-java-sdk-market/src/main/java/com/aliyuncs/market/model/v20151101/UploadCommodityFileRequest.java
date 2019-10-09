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

package com.aliyuncs.market.model.v20151101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.market.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UploadCommodityFileRequest extends RpcAcsRequest<UploadCommodityFileResponse> {
	   

	private String fileResourceType;

	private String fileResource;

	private String fileContentType;
	public UploadCommodityFileRequest() {
		super("Market", "2015-11-01", "UploadCommodityFile", "yunmarket");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getFileResourceType() {
		return this.fileResourceType;
	}

	public void setFileResourceType(String fileResourceType) {
		this.fileResourceType = fileResourceType;
		if(fileResourceType != null){
			putQueryParameter("FileResourceType", fileResourceType);
		}
	}

	public String getFileResource() {
		return this.fileResource;
	}

	public void setFileResource(String fileResource) {
		this.fileResource = fileResource;
		if(fileResource != null){
			putQueryParameter("FileResource", fileResource);
		}
	}

	public String getFileContentType() {
		return this.fileContentType;
	}

	public void setFileContentType(String fileContentType) {
		this.fileContentType = fileContentType;
		if(fileContentType != null){
			putQueryParameter("FileContentType", fileContentType);
		}
	}

	@Override
	public Class<UploadCommodityFileResponse> getResponseClass() {
		return UploadCommodityFileResponse.class;
	}

}
