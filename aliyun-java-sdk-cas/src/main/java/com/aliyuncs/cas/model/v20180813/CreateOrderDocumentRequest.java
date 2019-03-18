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

package com.aliyuncs.cas.model.v20180813;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class CreateOrderDocumentRequest extends RpcAcsRequest<CreateOrderDocumentResponse> {
	
	public CreateOrderDocumentRequest() {
		super("cas", "2018-08-13", "CreateOrderDocument", "cas_esign_fdd");
	}

	private String ossKey;

	private String sourceIp;

	private Long orderId;

	private Integer documentType;

	private String lang;

	private String extName;

	public String getOssKey() {
		return this.ossKey;
	}

	public void setOssKey(String ossKey) {
		this.ossKey = ossKey;
		if(ossKey != null){
			putQueryParameter("OssKey", ossKey);
		}
	}

	public String getSourceIp() {
		return this.sourceIp;
	}

	public void setSourceIp(String sourceIp) {
		this.sourceIp = sourceIp;
		if(sourceIp != null){
			putQueryParameter("SourceIp", sourceIp);
		}
	}

	public Long getOrderId() {
		return this.orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
		if(orderId != null){
			putQueryParameter("OrderId", orderId.toString());
		}
	}

	public Integer getDocumentType() {
		return this.documentType;
	}

	public void setDocumentType(Integer documentType) {
		this.documentType = documentType;
		if(documentType != null){
			putQueryParameter("DocumentType", documentType.toString());
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

	public String getExtName() {
		return this.extName;
	}

	public void setExtName(String extName) {
		this.extName = extName;
		if(extName != null){
			putQueryParameter("ExtName", extName);
		}
	}

	@Override
	public Class<CreateOrderDocumentResponse> getResponseClass() {
		return CreateOrderDocumentResponse.class;
	}

}
