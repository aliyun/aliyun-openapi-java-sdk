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

package com.aliyuncs.rsimganalys.model.v20190801;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateTaskRequest extends RpcAcsRequest<CreateTaskResponse> {
	   

	private Float confidence;

	private Long filterValue;

	private String description;

	private String productType;

	private String zoneList;

	private String srcImageId;

	private String appkey;

	private String dstImageId;
	public CreateTaskRequest() {
		super("rsimganalys", "2019-08-01", "CreateTask");
		setMethod(MethodType.POST);
	}

	public Float getConfidence() {
		return this.confidence;
	}

	public void setConfidence(Float confidence) {
		this.confidence = confidence;
		if(confidence != null){
			putQueryParameter("Confidence", confidence.toString());
		}
	}

	public Long getFilterValue() {
		return this.filterValue;
	}

	public void setFilterValue(Long filterValue) {
		this.filterValue = filterValue;
		if(filterValue != null){
			putQueryParameter("FilterValue", filterValue.toString());
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public String getProductType() {
		return this.productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
		if(productType != null){
			putQueryParameter("ProductType", productType);
		}
	}

	public String getZoneList() {
		return this.zoneList;
	}

	public void setZoneList(String zoneList) {
		this.zoneList = zoneList;
		if(zoneList != null){
			putQueryParameter("ZoneList", zoneList);
		}
	}

	public String getSrcImageId() {
		return this.srcImageId;
	}

	public void setSrcImageId(String srcImageId) {
		this.srcImageId = srcImageId;
		if(srcImageId != null){
			putQueryParameter("SrcImageId", srcImageId);
		}
	}

	public String getAppkey() {
		return this.appkey;
	}

	public void setAppkey(String appkey) {
		this.appkey = appkey;
		if(appkey != null){
			putQueryParameter("Appkey", appkey);
		}
	}

	public String getDstImageId() {
		return this.dstImageId;
	}

	public void setDstImageId(String dstImageId) {
		this.dstImageId = dstImageId;
		if(dstImageId != null){
			putQueryParameter("DstImageId", dstImageId);
		}
	}

	@Override
	public Class<CreateTaskResponse> getResponseClass() {
		return CreateTaskResponse.class;
	}

}
