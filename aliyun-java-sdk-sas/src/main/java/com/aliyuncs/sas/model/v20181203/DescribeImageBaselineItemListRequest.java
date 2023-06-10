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
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeImageBaselineItemListRequest extends RpcAcsRequest<DescribeImageBaselineItemListResponse> {
	   

	private String baselineClassKey;

	private List<String> scanRanges;

	private Integer pageSize;

	private String lang;

	private String imageUuid;

	private Integer currentPage;

	private String baselineNameKey;

	private String status;

	private List<String> uuidss;
	public DescribeImageBaselineItemListRequest() {
		super("Sas", "2018-12-03", "DescribeImageBaselineItemList", "sas");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getBaselineClassKey() {
		return this.baselineClassKey;
	}

	public void setBaselineClassKey(String baselineClassKey) {
		this.baselineClassKey = baselineClassKey;
		if(baselineClassKey != null){
			putQueryParameter("BaselineClassKey", baselineClassKey);
		}
	}

	public List<String> getScanRanges() {
		return this.scanRanges;
	}

	public void setScanRanges(List<String> scanRanges) {
		this.scanRanges = scanRanges;	
		if (scanRanges != null) {
			for (int i = 0; i < scanRanges.size(); i++) {
				putQueryParameter("ScanRange." + (i + 1) , scanRanges.get(i));
			}
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

	public String getBaselineNameKey() {
		return this.baselineNameKey;
	}

	public void setBaselineNameKey(String baselineNameKey) {
		this.baselineNameKey = baselineNameKey;
		if(baselineNameKey != null){
			putQueryParameter("BaselineNameKey", baselineNameKey);
		}
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
		if(status != null){
			putQueryParameter("Status", status);
		}
	}

	public List<String> getUuidss() {
		return this.uuidss;
	}

	public void setUuidss(List<String> uuidss) {
		this.uuidss = uuidss;	
		if (uuidss != null) {
			for (int i = 0; i < uuidss.size(); i++) {
				putQueryParameter("Uuids." + (i + 1) , uuidss.get(i));
			}
		}	
	}

	@Override
	public Class<DescribeImageBaselineItemListResponse> getResponseClass() {
		return DescribeImageBaselineItemListResponse.class;
	}

}
