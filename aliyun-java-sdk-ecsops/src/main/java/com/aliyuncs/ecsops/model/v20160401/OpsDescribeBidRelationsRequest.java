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

package com.aliyuncs.ecsops.model.v20160401;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class OpsDescribeBidRelationsRequest extends RpcAcsRequest<OpsDescribeBidRelationsResponse> {
	   

	private Boolean isSite;

	private Integer pageNumber;

	private Integer pageSize;

	private String regionNo;

	private Long parentBid;

	private Boolean isService;

	private String bid;

	private String auditParamStr;
	public OpsDescribeBidRelationsRequest() {
		super("Ecsops", "2016-04-01", "OpsDescribeBidRelations", "ecsops");
		setMethod(MethodType.POST);
	}

	public Boolean getIsSite() {
		return this.isSite;
	}

	public void setIsSite(Boolean isSite) {
		this.isSite = isSite;
		if(isSite != null){
			putQueryParameter("IsSite", isSite.toString());
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

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public String getRegionNo() {
		return this.regionNo;
	}

	public void setRegionNo(String regionNo) {
		this.regionNo = regionNo;
		if(regionNo != null){
			putQueryParameter("RegionNo", regionNo);
		}
	}

	public Long getParentBid() {
		return this.parentBid;
	}

	public void setParentBid(Long parentBid) {
		this.parentBid = parentBid;
		if(parentBid != null){
			putQueryParameter("ParentBid", parentBid.toString());
		}
	}

	public Boolean getIsService() {
		return this.isService;
	}

	public void setIsService(Boolean isService) {
		this.isService = isService;
		if(isService != null){
			putQueryParameter("IsService", isService.toString());
		}
	}

	public String getBid() {
		return this.bid;
	}

	public void setBid(String bid) {
		this.bid = bid;
		if(bid != null){
			putQueryParameter("Bid", bid);
		}
	}

	public String getAuditParamStr() {
		return this.auditParamStr;
	}

	public void setAuditParamStr(String auditParamStr) {
		this.auditParamStr = auditParamStr;
		if(auditParamStr != null){
			putQueryParameter("AuditParamStr", auditParamStr);
		}
	}

	@Override
	public Class<OpsDescribeBidRelationsResponse> getResponseClass() {
		return OpsDescribeBidRelationsResponse.class;
	}

}
