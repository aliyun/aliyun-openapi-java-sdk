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

package com.aliyuncs.domain.model.v20180129;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.domain.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class QueryAdvancedDomainListRequest extends RpcAcsRequest<QueryAdvancedDomainListResponse> {
	   

	private String productDomainType;

	private Integer pageNum;

	private String excluded;

	private Integer startLength;

	private String resourceGroupId;

	private Boolean excludedSuffix;

	private Integer pageSize;

	private List<Tag> tags;

	private String lang;

	private Boolean excludedPrefix;

	private String keyWord;

	private Boolean productDomainTypeSort;

	private Long endExpirationDate;

	private String suffixs;

	private Boolean domainNameSort;

	private Boolean expirationDateSort;

	private Long startExpirationDate;

	private Integer domainStatus;

	private Long domainGroupId;

	private Boolean keyWordSuffix;

	private Boolean keyWordPrefix;

	private Integer tradeType;

	private Long endRegistrationDate;

	private Integer form;

	private Boolean isPremiumDomain;

	private String userClientIp;

	private Boolean registrationDateSort;

	private Long startRegistrationDate;

	private Integer endLength;
	public QueryAdvancedDomainListRequest() {
		super("Domain", "2018-01-29", "QueryAdvancedDomainList", "domain");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getProductDomainType() {
		return this.productDomainType;
	}

	public void setProductDomainType(String productDomainType) {
		this.productDomainType = productDomainType;
		if(productDomainType != null){
			putQueryParameter("ProductDomainType", productDomainType);
		}
	}

	public Integer getPageNum() {
		return this.pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
		if(pageNum != null){
			putQueryParameter("PageNum", pageNum.toString());
		}
	}

	public String getExcluded() {
		return this.excluded;
	}

	public void setExcluded(String excluded) {
		this.excluded = excluded;
		if(excluded != null){
			putQueryParameter("Excluded", excluded);
		}
	}

	public Integer getStartLength() {
		return this.startLength;
	}

	public void setStartLength(Integer startLength) {
		this.startLength = startLength;
		if(startLength != null){
			putQueryParameter("StartLength", startLength.toString());
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

	public Boolean getExcludedSuffix() {
		return this.excludedSuffix;
	}

	public void setExcludedSuffix(Boolean excludedSuffix) {
		this.excludedSuffix = excludedSuffix;
		if(excludedSuffix != null){
			putQueryParameter("ExcludedSuffix", excludedSuffix.toString());
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

	public List<Tag> getTags() {
		return this.tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;	
		if (tags != null) {
			for (int depth1 = 0; depth1 < tags.size(); depth1++) {
				putQueryParameter("Tag." + (depth1 + 1) + ".Value" , tags.get(depth1).getValue());
				putQueryParameter("Tag." + (depth1 + 1) + ".Key" , tags.get(depth1).getKey());
			}
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

	public Boolean getExcludedPrefix() {
		return this.excludedPrefix;
	}

	public void setExcludedPrefix(Boolean excludedPrefix) {
		this.excludedPrefix = excludedPrefix;
		if(excludedPrefix != null){
			putQueryParameter("ExcludedPrefix", excludedPrefix.toString());
		}
	}

	public String getKeyWord() {
		return this.keyWord;
	}

	public void setKeyWord(String keyWord) {
		this.keyWord = keyWord;
		if(keyWord != null){
			putQueryParameter("KeyWord", keyWord);
		}
	}

	public Boolean getProductDomainTypeSort() {
		return this.productDomainTypeSort;
	}

	public void setProductDomainTypeSort(Boolean productDomainTypeSort) {
		this.productDomainTypeSort = productDomainTypeSort;
		if(productDomainTypeSort != null){
			putQueryParameter("ProductDomainTypeSort", productDomainTypeSort.toString());
		}
	}

	public Long getEndExpirationDate() {
		return this.endExpirationDate;
	}

	public void setEndExpirationDate(Long endExpirationDate) {
		this.endExpirationDate = endExpirationDate;
		if(endExpirationDate != null){
			putQueryParameter("EndExpirationDate", endExpirationDate.toString());
		}
	}

	public String getSuffixs() {
		return this.suffixs;
	}

	public void setSuffixs(String suffixs) {
		this.suffixs = suffixs;
		if(suffixs != null){
			putQueryParameter("Suffixs", suffixs);
		}
	}

	public Boolean getDomainNameSort() {
		return this.domainNameSort;
	}

	public void setDomainNameSort(Boolean domainNameSort) {
		this.domainNameSort = domainNameSort;
		if(domainNameSort != null){
			putQueryParameter("DomainNameSort", domainNameSort.toString());
		}
	}

	public Boolean getExpirationDateSort() {
		return this.expirationDateSort;
	}

	public void setExpirationDateSort(Boolean expirationDateSort) {
		this.expirationDateSort = expirationDateSort;
		if(expirationDateSort != null){
			putQueryParameter("ExpirationDateSort", expirationDateSort.toString());
		}
	}

	public Long getStartExpirationDate() {
		return this.startExpirationDate;
	}

	public void setStartExpirationDate(Long startExpirationDate) {
		this.startExpirationDate = startExpirationDate;
		if(startExpirationDate != null){
			putQueryParameter("StartExpirationDate", startExpirationDate.toString());
		}
	}

	public Integer getDomainStatus() {
		return this.domainStatus;
	}

	public void setDomainStatus(Integer domainStatus) {
		this.domainStatus = domainStatus;
		if(domainStatus != null){
			putQueryParameter("DomainStatus", domainStatus.toString());
		}
	}

	public Long getDomainGroupId() {
		return this.domainGroupId;
	}

	public void setDomainGroupId(Long domainGroupId) {
		this.domainGroupId = domainGroupId;
		if(domainGroupId != null){
			putQueryParameter("DomainGroupId", domainGroupId.toString());
		}
	}

	public Boolean getKeyWordSuffix() {
		return this.keyWordSuffix;
	}

	public void setKeyWordSuffix(Boolean keyWordSuffix) {
		this.keyWordSuffix = keyWordSuffix;
		if(keyWordSuffix != null){
			putQueryParameter("KeyWordSuffix", keyWordSuffix.toString());
		}
	}

	public Boolean getKeyWordPrefix() {
		return this.keyWordPrefix;
	}

	public void setKeyWordPrefix(Boolean keyWordPrefix) {
		this.keyWordPrefix = keyWordPrefix;
		if(keyWordPrefix != null){
			putQueryParameter("KeyWordPrefix", keyWordPrefix.toString());
		}
	}

	public Integer getTradeType() {
		return this.tradeType;
	}

	public void setTradeType(Integer tradeType) {
		this.tradeType = tradeType;
		if(tradeType != null){
			putQueryParameter("TradeType", tradeType.toString());
		}
	}

	public Long getEndRegistrationDate() {
		return this.endRegistrationDate;
	}

	public void setEndRegistrationDate(Long endRegistrationDate) {
		this.endRegistrationDate = endRegistrationDate;
		if(endRegistrationDate != null){
			putQueryParameter("EndRegistrationDate", endRegistrationDate.toString());
		}
	}

	public Integer getForm() {
		return this.form;
	}

	public void setForm(Integer form) {
		this.form = form;
		if(form != null){
			putQueryParameter("Form", form.toString());
		}
	}

	public Boolean getIsPremiumDomain() {
		return this.isPremiumDomain;
	}

	public void setIsPremiumDomain(Boolean isPremiumDomain) {
		this.isPremiumDomain = isPremiumDomain;
		if(isPremiumDomain != null){
			putQueryParameter("IsPremiumDomain", isPremiumDomain.toString());
		}
	}

	public String getUserClientIp() {
		return this.userClientIp;
	}

	public void setUserClientIp(String userClientIp) {
		this.userClientIp = userClientIp;
		if(userClientIp != null){
			putQueryParameter("UserClientIp", userClientIp);
		}
	}

	public Boolean getRegistrationDateSort() {
		return this.registrationDateSort;
	}

	public void setRegistrationDateSort(Boolean registrationDateSort) {
		this.registrationDateSort = registrationDateSort;
		if(registrationDateSort != null){
			putQueryParameter("RegistrationDateSort", registrationDateSort.toString());
		}
	}

	public Long getStartRegistrationDate() {
		return this.startRegistrationDate;
	}

	public void setStartRegistrationDate(Long startRegistrationDate) {
		this.startRegistrationDate = startRegistrationDate;
		if(startRegistrationDate != null){
			putQueryParameter("StartRegistrationDate", startRegistrationDate.toString());
		}
	}

	public Integer getEndLength() {
		return this.endLength;
	}

	public void setEndLength(Integer endLength) {
		this.endLength = endLength;
		if(endLength != null){
			putQueryParameter("EndLength", endLength.toString());
		}
	}

	public static class Tag {

		private String value;

		private String key;

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}
	}

	@Override
	public Class<QueryAdvancedDomainListResponse> getResponseClass() {
		return QueryAdvancedDomainListResponse.class;
	}

}
