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

/**
 * @author auto create
 * @version 
 */
public class CreateProductRequest extends RpcAcsRequest<CreateProductResponse> {
	
	public CreateProductRequest() {
		super("Iot", "2018-01-20", "CreateProduct");
	}

	private Integer dataFormat;

	private Integer nodeType;

	private Boolean id2;

	private String netType;

	private String productName;

	private String description;

	private String protocolType;

	private String aliyunCommodityCode;

	private Long categoryId;

	public Integer getDataFormat() {
		return this.dataFormat;
	}

	public void setDataFormat(Integer dataFormat) {
		this.dataFormat = dataFormat;
		if(dataFormat != null){
			putQueryParameter("DataFormat", dataFormat.toString());
		}
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

	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
		if(productName != null){
			putQueryParameter("ProductName", productName);
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

	public String getProtocolType() {
		return this.protocolType;
	}

	public void setProtocolType(String protocolType) {
		this.protocolType = protocolType;
		if(protocolType != null){
			putQueryParameter("ProtocolType", protocolType);
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

	public Long getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
		if(categoryId != null){
			putQueryParameter("CategoryId", categoryId.toString());
		}
	}

	@Override
	public Class<CreateProductResponse> getResponseClass() {
		return CreateProductResponse.class;
	}

}
