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

package com.aliyuncs.cdrs.model.v20201101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class SearchObjectRequest extends RpcAcsRequest<SearchObjectResponse> {
	   

	private String shotTimeEnd;

	private String corpId;

	private Integer pageNumber;

	private String feature;

	private String vendor;

	private Integer pageSize;

	private String imageContent;

	private String objectType;

	private String deviceList;

	private String imageUrl;

	private String attributes;

	private String shotTimeStart;
	public SearchObjectRequest() {
		super("CDRS", "2020-11-01", "SearchObject");
		setMethod(MethodType.POST);
	}

	public String getShotTimeEnd() {
		return this.shotTimeEnd;
	}

	public void setShotTimeEnd(String shotTimeEnd) {
		this.shotTimeEnd = shotTimeEnd;
		if(shotTimeEnd != null){
			putBodyParameter("ShotTimeEnd", shotTimeEnd);
		}
	}

	public String getCorpId() {
		return this.corpId;
	}

	public void setCorpId(String corpId) {
		this.corpId = corpId;
		if(corpId != null){
			putBodyParameter("CorpId", corpId);
		}
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putBodyParameter("PageNumber", pageNumber.toString());
		}
	}

	public String getFeature() {
		return this.feature;
	}

	public void setFeature(String feature) {
		this.feature = feature;
		if(feature != null){
			putBodyParameter("Feature", feature);
		}
	}

	public String getVendor() {
		return this.vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
		if(vendor != null){
			putBodyParameter("Vendor", vendor);
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putBodyParameter("PageSize", pageSize.toString());
		}
	}

	public String getImageContent() {
		return this.imageContent;
	}

	public void setImageContent(String imageContent) {
		this.imageContent = imageContent;
		if(imageContent != null){
			putBodyParameter("ImageContent", imageContent);
		}
	}

	public String getObjectType() {
		return this.objectType;
	}

	public void setObjectType(String objectType) {
		this.objectType = objectType;
		if(objectType != null){
			putBodyParameter("ObjectType", objectType);
		}
	}

	public String getDeviceList() {
		return this.deviceList;
	}

	public void setDeviceList(String deviceList) {
		this.deviceList = deviceList;
		if(deviceList != null){
			putBodyParameter("DeviceList", deviceList);
		}
	}

	public String getImageUrl() {
		return this.imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
		if(imageUrl != null){
			putBodyParameter("ImageUrl", imageUrl);
		}
	}

	public String getAttributes() {
		return this.attributes;
	}

	public void setAttributes(String attributes) {
		this.attributes = attributes;
		if(attributes != null){
			putBodyParameter("Attributes", attributes);
		}
	}

	public String getShotTimeStart() {
		return this.shotTimeStart;
	}

	public void setShotTimeStart(String shotTimeStart) {
		this.shotTimeStart = shotTimeStart;
		if(shotTimeStart != null){
			putBodyParameter("ShotTimeStart", shotTimeStart);
		}
	}

	@Override
	public Class<SearchObjectResponse> getResponseClass() {
		return SearchObjectResponse.class;
	}

}
