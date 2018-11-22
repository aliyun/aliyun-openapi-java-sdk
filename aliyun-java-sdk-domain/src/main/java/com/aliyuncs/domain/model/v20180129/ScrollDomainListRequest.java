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

/**
 * @author auto create
 * @version 
 */
public class ScrollDomainListRequest extends RpcAcsRequest<ScrollDomainListResponse> {
	
	public ScrollDomainListRequest() {
		super("Domain", "2018-01-29", "ScrollDomainList");
	}

	private Long endExpirationDate;

	private String productDomainType;

	private String suffixs;

	private Long startExpirationDate;

	private Integer domainStatus;

	private Long domainGroupId;

	private Boolean keyWordSuffix;

	private String scrollId;

	private String excluded;

	private Boolean keyWordPrefix;

	private Integer startLength;

	private Integer tradeType;

	private Boolean excludedSuffix;

	private Long endRegistrationDate;

	private Integer form;

	private String userClientIp;

	private Integer pageSize;

	private String lang;

	private Boolean excludedPrefix;

	private String keyWord;

	private Long startRegistrationDate;

	private Integer endLength;

	public Long getEndExpirationDate() {
		return this.endExpirationDate;
	}

	public void setEndExpirationDate(Long endExpirationDate) {
		this.endExpirationDate = endExpirationDate;
		if(endExpirationDate != null){
			putQueryParameter("EndExpirationDate", endExpirationDate.toString());
		}
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

	public String getSuffixs() {
		return this.suffixs;
	}

	public void setSuffixs(String suffixs) {
		this.suffixs = suffixs;
		if(suffixs != null){
			putQueryParameter("Suffixs", suffixs);
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

	public String getScrollId() {
		return this.scrollId;
	}

	public void setScrollId(String scrollId) {
		this.scrollId = scrollId;
		if(scrollId != null){
			putQueryParameter("ScrollId", scrollId);
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

	public Boolean getKeyWordPrefix() {
		return this.keyWordPrefix;
	}

	public void setKeyWordPrefix(Boolean keyWordPrefix) {
		this.keyWordPrefix = keyWordPrefix;
		if(keyWordPrefix != null){
			putQueryParameter("KeyWordPrefix", keyWordPrefix.toString());
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

	public Integer getTradeType() {
		return this.tradeType;
	}

	public void setTradeType(Integer tradeType) {
		this.tradeType = tradeType;
		if(tradeType != null){
			putQueryParameter("TradeType", tradeType.toString());
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

	public String getUserClientIp() {
		return this.userClientIp;
	}

	public void setUserClientIp(String userClientIp) {
		this.userClientIp = userClientIp;
		if(userClientIp != null){
			putQueryParameter("UserClientIp", userClientIp);
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

	@Override
	public Class<ScrollDomainListResponse> getResponseClass() {
		return ScrollDomainListResponse.class;
	}

}
