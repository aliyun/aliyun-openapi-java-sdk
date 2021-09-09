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

package com.aliyuncs.companyreg.model.v20201022;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.companyreg.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class PhotoInvoiceRequest extends RpcAcsRequest<PhotoInvoiceResponse> {
	   

	private Integer uploadedNum;

	private String fileUrlList;

	private Long uploadedStamp;

	private String bizId;

	private String fileUrl;

	private Boolean isMobile;
	public PhotoInvoiceRequest() {
		super("companyreg", "2020-10-22", "PhotoInvoice", "companyreg");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Integer getUploadedNum() {
		return this.uploadedNum;
	}

	public void setUploadedNum(Integer uploadedNum) {
		this.uploadedNum = uploadedNum;
		if(uploadedNum != null){
			putQueryParameter("UploadedNum", uploadedNum.toString());
		}
	}

	public String getFileUrlList() {
		return this.fileUrlList;
	}

	public void setFileUrlList(String fileUrlList) {
		this.fileUrlList = fileUrlList;
		if(fileUrlList != null){
			putQueryParameter("FileUrlList", fileUrlList);
		}
	}

	public Long getUploadedStamp() {
		return this.uploadedStamp;
	}

	public void setUploadedStamp(Long uploadedStamp) {
		this.uploadedStamp = uploadedStamp;
		if(uploadedStamp != null){
			putQueryParameter("UploadedStamp", uploadedStamp.toString());
		}
	}

	public String getBizId() {
		return this.bizId;
	}

	public void setBizId(String bizId) {
		this.bizId = bizId;
		if(bizId != null){
			putQueryParameter("BizId", bizId);
		}
	}

	public String getFileUrl() {
		return this.fileUrl;
	}

	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
		if(fileUrl != null){
			putQueryParameter("FileUrl", fileUrl);
		}
	}

	public Boolean getIsMobile() {
		return this.isMobile;
	}

	public void setIsMobile(Boolean isMobile) {
		this.isMobile = isMobile;
		if(isMobile != null){
			putQueryParameter("IsMobile", isMobile.toString());
		}
	}

	@Override
	public Class<PhotoInvoiceResponse> getResponseClass() {
		return PhotoInvoiceResponse.class;
	}

}
