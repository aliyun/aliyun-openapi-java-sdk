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

package com.aliyuncs.quotas.model.v20200510;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.quotas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateTemplateQuotaItemRequest extends RpcAcsRequest<CreateTemplateQuotaItemResponse> {
	   

	private String productCode;

	private String quotaActionCode;

	private Float desireValue;

	private String effectiveTime;

	private String quotaCategory;

	private String expireTime;

	private String envLanguage;

	private Long noticeType;

	private List<Dimensions> dimensionss;
	public CreateTemplateQuotaItemRequest() {
		super("quotas", "2020-05-10", "CreateTemplateQuotaItem", "quotas");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getProductCode() {
		return this.productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
		if(productCode != null){
			putBodyParameter("ProductCode", productCode);
		}
	}

	public String getQuotaActionCode() {
		return this.quotaActionCode;
	}

	public void setQuotaActionCode(String quotaActionCode) {
		this.quotaActionCode = quotaActionCode;
		if(quotaActionCode != null){
			putBodyParameter("QuotaActionCode", quotaActionCode);
		}
	}

	public Float getDesireValue() {
		return this.desireValue;
	}

	public void setDesireValue(Float desireValue) {
		this.desireValue = desireValue;
		if(desireValue != null){
			putBodyParameter("DesireValue", desireValue.toString());
		}
	}

	public String getEffectiveTime() {
		return this.effectiveTime;
	}

	public void setEffectiveTime(String effectiveTime) {
		this.effectiveTime = effectiveTime;
		if(effectiveTime != null){
			putBodyParameter("EffectiveTime", effectiveTime);
		}
	}

	public String getQuotaCategory() {
		return this.quotaCategory;
	}

	public void setQuotaCategory(String quotaCategory) {
		this.quotaCategory = quotaCategory;
		if(quotaCategory != null){
			putBodyParameter("QuotaCategory", quotaCategory);
		}
	}

	public String getExpireTime() {
		return this.expireTime;
	}

	public void setExpireTime(String expireTime) {
		this.expireTime = expireTime;
		if(expireTime != null){
			putBodyParameter("ExpireTime", expireTime);
		}
	}

	public String getEnvLanguage() {
		return this.envLanguage;
	}

	public void setEnvLanguage(String envLanguage) {
		this.envLanguage = envLanguage;
		if(envLanguage != null){
			putBodyParameter("EnvLanguage", envLanguage);
		}
	}

	public Long getNoticeType() {
		return this.noticeType;
	}

	public void setNoticeType(Long noticeType) {
		this.noticeType = noticeType;
		if(noticeType != null){
			putBodyParameter("NoticeType", noticeType.toString());
		}
	}

	public List<Dimensions> getDimensionss() {
		return this.dimensionss;
	}

	public void setDimensionss(List<Dimensions> dimensionss) {
		this.dimensionss = dimensionss;	
		if (dimensionss != null) {
			for (int depth1 = 0; depth1 < dimensionss.size(); depth1++) {
				putBodyParameter("Dimensions." + (depth1 + 1) + ".Key" , dimensionss.get(depth1).getKey());
				putBodyParameter("Dimensions." + (depth1 + 1) + ".Value" , dimensionss.get(depth1).getValue());
			}
		}	
	}

	public static class Dimensions {

		private String key;

		private String value;

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}
	}

	@Override
	public Class<CreateTemplateQuotaItemResponse> getResponseClass() {
		return CreateTemplateQuotaItemResponse.class;
	}

}
