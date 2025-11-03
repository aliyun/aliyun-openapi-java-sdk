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

package com.aliyuncs.sophonsoar.model.v20220728;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DescribePlaybooksRequest extends RpcAcsRequest<DescribePlaybooksResponse> {
	   

	private Long endMillis;

	private Long pageNumber;

	private String playbookUuids;

	private Integer pageSize;

	private String lang;

	private String order;

	private String paramTypes;

	private Integer active;

	private String ownType;

	private Integer sort;

	private Long startMillis;

	private String playbookUuid;

	private String name;
	public DescribePlaybooksRequest() {
		super("sophonsoar", "2022-07-28", "DescribePlaybooks");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.GET);
	}

	public Long getEndMillis() {
		return this.endMillis;
	}

	public void setEndMillis(Long endMillis) {
		this.endMillis = endMillis;
		if(endMillis != null){
			putQueryParameter("EndMillis", endMillis.toString());
		}
	}

	public Long getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Long pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
		}
	}

	public String getPlaybookUuids() {
		return this.playbookUuids;
	}

	public void setPlaybookUuids(String playbookUuids) {
		this.playbookUuids = playbookUuids;
		if(playbookUuids != null){
			putQueryParameter("PlaybookUuids", playbookUuids);
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

	public String getOrder() {
		return this.order;
	}

	public void setOrder(String order) {
		this.order = order;
		if(order != null){
			putQueryParameter("Order", order);
		}
	}

	public String getParamTypes() {
		return this.paramTypes;
	}

	public void setParamTypes(String paramTypes) {
		this.paramTypes = paramTypes;
		if(paramTypes != null){
			putQueryParameter("ParamTypes", paramTypes);
		}
	}

	public Integer getActive() {
		return this.active;
	}

	public void setActive(Integer active) {
		this.active = active;
		if(active != null){
			putQueryParameter("Active", active.toString());
		}
	}

	public String getOwnType() {
		return this.ownType;
	}

	public void setOwnType(String ownType) {
		this.ownType = ownType;
		if(ownType != null){
			putQueryParameter("OwnType", ownType);
		}
	}

	public Integer getSort() {
		return this.sort;
	}

	public void setSort(Integer sort) {
		this.sort = sort;
		if(sort != null){
			putQueryParameter("Sort", sort.toString());
		}
	}

	public Long getStartMillis() {
		return this.startMillis;
	}

	public void setStartMillis(Long startMillis) {
		this.startMillis = startMillis;
		if(startMillis != null){
			putQueryParameter("StartMillis", startMillis.toString());
		}
	}

	public String getPlaybookUuid() {
		return this.playbookUuid;
	}

	public void setPlaybookUuid(String playbookUuid) {
		this.playbookUuid = playbookUuid;
		if(playbookUuid != null){
			putQueryParameter("PlaybookUuid", playbookUuid);
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

	@Override
	public Class<DescribePlaybooksResponse> getResponseClass() {
		return DescribePlaybooksResponse.class;
	}

}
