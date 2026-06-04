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

package com.aliyuncs.websitebuild.model.v20250429;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class PushResourceMeasureRequest extends RpcAcsRequest<PushResourceMeasureResponse> {
	   

	private String metaData;

	private Long amount;

	private String resourceCode;

	private String measureData;

	private String useTime;

	private String bizId;

	private String belongId;

	private String useType;

	private String belongIdType;
	public PushResourceMeasureRequest() {
		super("WebsiteBuild", "2025-04-29", "PushResourceMeasure");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public String getMetaData() {
		return this.metaData;
	}

	public void setMetaData(String metaData) {
		this.metaData = metaData;
		if(metaData != null){
			putQueryParameter("MetaData", metaData);
		}
	}

	public Long getAmount() {
		return this.amount;
	}

	public void setAmount(Long amount) {
		this.amount = amount;
		if(amount != null){
			putQueryParameter("Amount", amount.toString());
		}
	}

	public String getResourceCode() {
		return this.resourceCode;
	}

	public void setResourceCode(String resourceCode) {
		this.resourceCode = resourceCode;
		if(resourceCode != null){
			putQueryParameter("ResourceCode", resourceCode);
		}
	}

	public String getMeasureData() {
		return this.measureData;
	}

	public void setMeasureData(String measureData) {
		this.measureData = measureData;
		if(measureData != null){
			putQueryParameter("MeasureData", measureData);
		}
	}

	public String getUseTime() {
		return this.useTime;
	}

	public void setUseTime(String useTime) {
		this.useTime = useTime;
		if(useTime != null){
			putQueryParameter("UseTime", useTime);
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

	public String getBelongId() {
		return this.belongId;
	}

	public void setBelongId(String belongId) {
		this.belongId = belongId;
		if(belongId != null){
			putQueryParameter("BelongId", belongId);
		}
	}

	public String getUseType() {
		return this.useType;
	}

	public void setUseType(String useType) {
		this.useType = useType;
		if(useType != null){
			putQueryParameter("UseType", useType);
		}
	}

	public String getBelongIdType() {
		return this.belongIdType;
	}

	public void setBelongIdType(String belongIdType) {
		this.belongIdType = belongIdType;
		if(belongIdType != null){
			putQueryParameter("BelongIdType", belongIdType);
		}
	}

	@Override
	public Class<PushResourceMeasureResponse> getResponseClass() {
		return PushResourceMeasureResponse.class;
	}

}
