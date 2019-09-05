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

package com.aliyuncs.market.model.v20151101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.market.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeCommoditiesRequest extends RpcAcsRequest<DescribeCommoditiesResponse> {
	
	public DescribeCommoditiesRequest() {
		super("Market", "2015-11-01", "DescribeCommodities", "yunmarket");
		setSysMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private String commodityGmtModifiedTo;

	private String commodityGmtModifiedFrom;

	private String commodityId;

	private String commodityGmtPublishFrom;

	private String commodityStatuses;

	private Integer pageNumber;

	private String commodityGmtCreatedFrom;

	private String commodityIds;

	private String commodityGmtCreatedTo;

	private Integer pageSize;

	private String commodityGmtPublishTo;

	private String commodityAuditStatuses;

	private String properties;

	private String commodityCategoryIds;

	public String getCommodityGmtModifiedTo() {
		return this.commodityGmtModifiedTo;
	}

	public void setCommodityGmtModifiedTo(String commodityGmtModifiedTo) {
		this.commodityGmtModifiedTo = commodityGmtModifiedTo;
		if(commodityGmtModifiedTo != null){
			putQueryParameter("CommodityGmtModifiedTo", commodityGmtModifiedTo);
		}
	}

	public String getCommodityGmtModifiedFrom() {
		return this.commodityGmtModifiedFrom;
	}

	public void setCommodityGmtModifiedFrom(String commodityGmtModifiedFrom) {
		this.commodityGmtModifiedFrom = commodityGmtModifiedFrom;
		if(commodityGmtModifiedFrom != null){
			putQueryParameter("CommodityGmtModifiedFrom", commodityGmtModifiedFrom);
		}
	}

	public String getCommodityId() {
		return this.commodityId;
	}

	public void setCommodityId(String commodityId) {
		this.commodityId = commodityId;
		if(commodityId != null){
			putQueryParameter("CommodityId", commodityId);
		}
	}

	public String getCommodityGmtPublishFrom() {
		return this.commodityGmtPublishFrom;
	}

	public void setCommodityGmtPublishFrom(String commodityGmtPublishFrom) {
		this.commodityGmtPublishFrom = commodityGmtPublishFrom;
		if(commodityGmtPublishFrom != null){
			putQueryParameter("CommodityGmtPublishFrom", commodityGmtPublishFrom);
		}
	}

	public String getCommodityStatuses() {
		return this.commodityStatuses;
	}

	public void setCommodityStatuses(String commodityStatuses) {
		this.commodityStatuses = commodityStatuses;
		if(commodityStatuses != null){
			putQueryParameter("CommodityStatuses", commodityStatuses);
		}
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
		}
	}

	public String getCommodityGmtCreatedFrom() {
		return this.commodityGmtCreatedFrom;
	}

	public void setCommodityGmtCreatedFrom(String commodityGmtCreatedFrom) {
		this.commodityGmtCreatedFrom = commodityGmtCreatedFrom;
		if(commodityGmtCreatedFrom != null){
			putQueryParameter("CommodityGmtCreatedFrom", commodityGmtCreatedFrom);
		}
	}

	public String getCommodityIds() {
		return this.commodityIds;
	}

	public void setCommodityIds(String commodityIds) {
		this.commodityIds = commodityIds;
		if(commodityIds != null){
			putQueryParameter("CommodityIds", commodityIds);
		}
	}

	public String getCommodityGmtCreatedTo() {
		return this.commodityGmtCreatedTo;
	}

	public void setCommodityGmtCreatedTo(String commodityGmtCreatedTo) {
		this.commodityGmtCreatedTo = commodityGmtCreatedTo;
		if(commodityGmtCreatedTo != null){
			putQueryParameter("CommodityGmtCreatedTo", commodityGmtCreatedTo);
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

	public String getCommodityGmtPublishTo() {
		return this.commodityGmtPublishTo;
	}

	public void setCommodityGmtPublishTo(String commodityGmtPublishTo) {
		this.commodityGmtPublishTo = commodityGmtPublishTo;
		if(commodityGmtPublishTo != null){
			putQueryParameter("CommodityGmtPublishTo", commodityGmtPublishTo);
		}
	}

	public String getCommodityAuditStatuses() {
		return this.commodityAuditStatuses;
	}

	public void setCommodityAuditStatuses(String commodityAuditStatuses) {
		this.commodityAuditStatuses = commodityAuditStatuses;
		if(commodityAuditStatuses != null){
			putQueryParameter("CommodityAuditStatuses", commodityAuditStatuses);
		}
	}

	public String getProperties() {
		return this.properties;
	}

	public void setProperties(String properties) {
		this.properties = properties;
		if(properties != null){
			putQueryParameter("Properties", properties);
		}
	}

	public String getCommodityCategoryIds() {
		return this.commodityCategoryIds;
	}

	public void setCommodityCategoryIds(String commodityCategoryIds) {
		this.commodityCategoryIds = commodityCategoryIds;
		if(commodityCategoryIds != null){
			putQueryParameter("CommodityCategoryIds", commodityCategoryIds);
		}
	}

	@Override
	public Class<DescribeCommoditiesResponse> getResponseClass() {
		return DescribeCommoditiesResponse.class;
	}

}
