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

package com.aliyuncs.sas.model.v20181203;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeImageSensitiveFileByKeyRequest extends RpcAcsRequest<DescribeImageSensitiveFileByKeyResponse> {
	   

	private String sensitiveFileKey;

	@SerializedName("scanRange")
	private List<String> scanRange;

	private Integer pageSize;

	private String lang;

	private String imageUuid;

	private Integer currentPage;
	public DescribeImageSensitiveFileByKeyRequest() {
		super("Sas", "2018-12-03", "DescribeImageSensitiveFileByKey");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getSensitiveFileKey() {
		return this.sensitiveFileKey;
	}

	public void setSensitiveFileKey(String sensitiveFileKey) {
		this.sensitiveFileKey = sensitiveFileKey;
		if(sensitiveFileKey != null){
			putQueryParameter("SensitiveFileKey", sensitiveFileKey);
		}
	}

	public List<String> getScanRange() {
		return this.scanRange;
	}

	public void setScanRange(List<String> scanRange) {
		this.scanRange = scanRange;	
		if (scanRange != null) {
			putQueryParameter("ScanRange" , new Gson().toJson(scanRange));
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

	public String getLang() {
		return this.lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
		if(lang != null){
			putQueryParameter("Lang", lang);
		}
	}

	public String getImageUuid() {
		return this.imageUuid;
	}

	public void setImageUuid(String imageUuid) {
		this.imageUuid = imageUuid;
		if(imageUuid != null){
			putQueryParameter("ImageUuid", imageUuid);
		}
	}

	public Integer getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
		if(currentPage != null){
			putQueryParameter("CurrentPage", currentPage.toString());
		}
	}

	@Override
	public Class<DescribeImageSensitiveFileByKeyResponse> getResponseClass() {
		return DescribeImageSensitiveFileByKeyResponse.class;
	}

}
