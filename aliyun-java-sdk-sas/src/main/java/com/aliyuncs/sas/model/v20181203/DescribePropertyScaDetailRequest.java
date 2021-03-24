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

package com.aliyuncs.sas.model.v20181203;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DescribePropertyScaDetailRequest extends RpcAcsRequest<DescribePropertyScaDetailResponse> {
	   

	private String searchItemSub;

	private String remark;

	private String searchItem;

	private String uuid;

	private Integer pageSize;

	private String lang;

	private String searchInfoSub;

	private String searchInfo;

	private Integer currentPage;

	private String bizType;

	private Long name;

	private String scaName;
	public DescribePropertyScaDetailRequest() {
		super("Sas", "2018-12-03", "DescribePropertyScaDetail", "sas");
		setMethod(MethodType.POST);
	}

	public String getSearchItemSub() {
		return this.searchItemSub;
	}

	public void setSearchItemSub(String searchItemSub) {
		this.searchItemSub = searchItemSub;
		if(searchItemSub != null){
			putQueryParameter("SearchItemSub", searchItemSub);
		}
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
		if(remark != null){
			putQueryParameter("Remark", remark);
		}
	}

	public String getSearchItem() {
		return this.searchItem;
	}

	public void setSearchItem(String searchItem) {
		this.searchItem = searchItem;
		if(searchItem != null){
			putQueryParameter("SearchItem", searchItem);
		}
	}

	public String getUuid() {
		return this.uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
		if(uuid != null){
			putQueryParameter("Uuid", uuid);
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

	public String getSearchInfoSub() {
		return this.searchInfoSub;
	}

	public void setSearchInfoSub(String searchInfoSub) {
		this.searchInfoSub = searchInfoSub;
		if(searchInfoSub != null){
			putQueryParameter("SearchInfoSub", searchInfoSub);
		}
	}

	public String getSearchInfo() {
		return this.searchInfo;
	}

	public void setSearchInfo(String searchInfo) {
		this.searchInfo = searchInfo;
		if(searchInfo != null){
			putQueryParameter("SearchInfo", searchInfo);
		}
	}

	public Integer getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
		if(currentPage != null){
			putQueryParameter("CurrentPage", currentPage.toString());
		}
	}

	public String getBizType() {
		return this.bizType;
	}

	public void setBizType(String bizType) {
		this.bizType = bizType;
		if(bizType != null){
			putQueryParameter("BizType", bizType);
		}
	}

	public Long getName() {
		return this.name;
	}

	public void setName(Long name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name.toString());
		}
	}

	public String getScaName() {
		return this.scaName;
	}

	public void setScaName(String scaName) {
		this.scaName = scaName;
		if(scaName != null){
			putQueryParameter("ScaName", scaName);
		}
	}

	@Override
	public Class<DescribePropertyScaDetailResponse> getResponseClass() {
		return DescribePropertyScaDetailResponse.class;
	}

}
