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

package com.aliyuncs.iot.model.v20180120;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.iot.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateProductRequest extends RpcAcsRequest<CreateProductResponse> {
	   

	private Integer nodeType;

	private String description;

	private String categoryKey;

	private String joinPermissionId;

	private String authType;

	private String resourceGroupId;

	private String iotInstanceId;

	private String productName;

	private String aliyunCommodityCode;

	private Boolean publishAuto;

	private Long categoryId;

	private Integer dataFormat;

	private Boolean id2;

	private String netType;

	private String protocolType;
	public CreateProductRequest() {
		super("Iot", "2018-01-20", "CreateProduct", "Iot");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Integer getNodeType() {
		return this.nodeType;
	}

	public void setNodeType(Integer nodeType) {
		this.nodeType = nodeType;
		if(nodeType != null){
			putQueryParameter("NodeType", nodeType.toString());
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

	public String getCategoryKey() {
		return this.categoryKey;
	}

	public void setCategoryKey(String categoryKey) {
		this.categoryKey = categoryKey;
		if(categoryKey != null){
			putQueryParameter("CategoryKey", categoryKey);
		}
	}

	public String getJoinPermissionId() {
		return this.joinPermissionId;
	}

	public void setJoinPermissionId(String joinPermissionId) {
		this.joinPermissionId = joinPermissionId;
		if(joinPermissionId != null){
			putQueryParameter("JoinPermissionId", joinPermissionId);
		}
	}

	public String getAuthType() {
		return this.authType;
	}

	public void setAuthType(String authType) {
		this.authType = authType;
		if(authType != null){
			putQueryParameter("AuthType", authType);
		}
	}

	public String getResourceGroupId() {
		return this.resourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
		if(resourceGroupId != null){
			putQueryParameter("ResourceGroupId", resourceGroupId);
		}
	}

	public String getIotInstanceId() {
		return this.iotInstanceId;
	}

	public void setIotInstanceId(String iotInstanceId) {
		this.iotInstanceId = iotInstanceId;
		if(iotInstanceId != null){
			putQueryParameter("IotInstanceId", iotInstanceId);
		}
	}

	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
		if(productName != null){
			putQueryParameter("ProductName", productName);
		}
	}

	public String getAliyunCommodityCode() {
		return this.aliyunCommodityCode;
	}

	public void setAliyunCommodityCode(String aliyunCommodityCode) {
		this.aliyunCommodityCode = aliyunCommodityCode;
		if(aliyunCommodityCode != null){
			putQueryParameter("AliyunCommodityCode", aliyunCommodityCode);
		}
	}

	public Boolean getPublishAuto() {
		return this.publishAuto;
	}

	public void setPublishAuto(Boolean publishAuto) {
		this.publishAuto = publishAuto;
		if(publishAuto != null){
			putQueryParameter("PublishAuto", publishAuto.toString());
		}
	}

	public Long getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
		if(categoryId != null){
			putQueryParameter("CategoryId", categoryId.toString());
		}
	}

	public Integer getDataFormat() {
		return this.dataFormat;
	}

	public void setDataFormat(Integer dataFormat) {
		this.dataFormat = dataFormat;
		if(dataFormat != null){
			putQueryParameter("DataFormat", dataFormat.toString());
		}
	}

	public Boolean getId2() {
		return this.id2;
	}

	public void setId2(Boolean id2) {
		this.id2 = id2;
		if(id2 != null){
			putQueryParameter("Id2", id2.toString());
		}
	}

	public String getNetType() {
		return this.netType;
	}

	public void setNetType(String netType) {
		this.netType = netType;
		if(netType != null){
			putQueryParameter("NetType", netType);
		}
	}

	public String getProtocolType() {
		return this.protocolType;
	}

	public void setProtocolType(String protocolType) {
		this.protocolType = protocolType;
		if(protocolType != null){
			putQueryParameter("ProtocolType", protocolType);
		}
	}

	@Override
	public Class<CreateProductResponse> getResponseClass() {
		return CreateProductResponse.class;
	}

}
