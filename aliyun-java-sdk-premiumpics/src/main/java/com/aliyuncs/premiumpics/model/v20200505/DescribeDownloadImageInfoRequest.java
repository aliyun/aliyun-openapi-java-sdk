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

package com.aliyuncs.premiumpics.model.v20200505;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DescribeDownloadImageInfoRequest extends RpcAcsRequest<DescribeDownloadImageInfoResponse> {
	   

	private String imageId;

	private String downloadType;

	private Long imageUserBuyId;

	private String specificationName;

	private String bizId;
	public DescribeDownloadImageInfoRequest() {
		super("Premiumpics", "2020-05-05", "DescribeDownloadImageInfo");
		setMethod(MethodType.POST);
	}

	public String getImageId() {
		return this.imageId;
	}

	public void setImageId(String imageId) {
		this.imageId = imageId;
		if(imageId != null){
			putQueryParameter("ImageId", imageId);
		}
	}

	public String getDownloadType() {
		return this.downloadType;
	}

	public void setDownloadType(String downloadType) {
		this.downloadType = downloadType;
		if(downloadType != null){
			putQueryParameter("DownloadType", downloadType);
		}
	}

	public Long getImageUserBuyId() {
		return this.imageUserBuyId;
	}

	public void setImageUserBuyId(Long imageUserBuyId) {
		this.imageUserBuyId = imageUserBuyId;
		if(imageUserBuyId != null){
			putQueryParameter("ImageUserBuyId", imageUserBuyId.toString());
		}
	}

	public String getSpecificationName() {
		return this.specificationName;
	}

	public void setSpecificationName(String specificationName) {
		this.specificationName = specificationName;
		if(specificationName != null){
			putQueryParameter("SpecificationName", specificationName);
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

	@Override
	public Class<DescribeDownloadImageInfoResponse> getResponseClass() {
		return DescribeDownloadImageInfoResponse.class;
	}

}
