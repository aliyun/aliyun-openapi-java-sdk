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

package com.aliyuncs.iot.model.v20170420;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class CreateProductRequest extends RpcAcsRequest<CreateProductResponse> {
	
	public CreateProductRequest() {
		super("Iot", "2017-04-20", "CreateProduct");
	}

	private Long catId;

	private Integer nodeType;

	private Boolean id2;

	private String name;

	private String extProps;

	private String securityPolicy;

	private Integer payType;

	private String desc;

	public Long getCatId() {
		return this.catId;
	}

	public void setCatId(Long catId) {
		this.catId = catId;
		if(catId != null){
			putQueryParameter("CatId", catId.toString());
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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public String getExtProps() {
		return this.extProps;
	}

	public void setExtProps(String extProps) {
		this.extProps = extProps;
		if(extProps != null){
			putQueryParameter("ExtProps", extProps);
		}
	}

	public String getSecurityPolicy() {
		return this.securityPolicy;
	}

	public void setSecurityPolicy(String securityPolicy) {
		this.securityPolicy = securityPolicy;
		if(securityPolicy != null){
			putQueryParameter("SecurityPolicy", securityPolicy);
		}
	}

	public Integer getPayType() {
		return this.payType;
	}

	public void setPayType(Integer payType) {
		this.payType = payType;
		if(payType != null){
			putQueryParameter("PayType", payType.toString());
		}
	}

	public String getDesc() {
		return this.desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
		if(desc != null){
			putQueryParameter("Desc", desc);
		}
	}

	@Override
	public Class<CreateProductResponse> getResponseClass() {
		return CreateProductResponse.class;
	}

}
