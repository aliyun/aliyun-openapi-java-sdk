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
public class OpsActionTrailRequest extends RpcAcsRequest<OpsActionTrailResponse> {
	   

	private String endTime;

	private String queryRequestId;

	private String startTime;

	private Integer pageNumber;

	private String queryResourceId;

	private Integer pageSize;

	private String queryProduct;

	private String queryAccessKeyId;

	private Long queryAliUid;

	private String auditParamStr;
	public OpsActionTrailRequest() {
		super("Ecsops", "2016-04-01", "OpsActionTrail", "ecsops");
		setMethod(MethodType.POST);
	}

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
		if(endTime != null){
			putQueryParameter("EndTime", endTime);
		}
	}

	public String getQueryRequestId() {
		return this.queryRequestId;
	}

	public void setQueryRequestId(String queryRequestId) {
		this.queryRequestId = queryRequestId;
		if(queryRequestId != null){
			putQueryParameter("QueryRequestId", queryRequestId);
		}
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putQueryParameter("StartTime", startTime);
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

	public String getQueryResourceId() {
		return this.queryResourceId;
	}

	public void setQueryResourceId(String queryResourceId) {
		this.queryResourceId = queryResourceId;
		if(queryResourceId != null){
			putQueryParameter("QueryResourceId", queryResourceId);
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

	public String getQueryProduct() {
		return this.queryProduct;
	}

	public void setQueryProduct(String queryProduct) {
		this.queryProduct = queryProduct;
		if(queryProduct != null){
			putQueryParameter("QueryProduct", queryProduct);
		}
	}

	public String getQueryAccessKeyId() {
		return this.queryAccessKeyId;
	}

	public void setQueryAccessKeyId(String queryAccessKeyId) {
		this.queryAccessKeyId = queryAccessKeyId;
		if(queryAccessKeyId != null){
			putQueryParameter("QueryAccessKeyId", queryAccessKeyId);
		}
	}

	public Long getQueryAliUid() {
		return this.queryAliUid;
	}

	public void setQueryAliUid(Long queryAliUid) {
		this.queryAliUid = queryAliUid;
		if(queryAliUid != null){
			putQueryParameter("QueryAliUid", queryAliUid.toString());
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
	public Class<OpsActionTrailResponse> getResponseClass() {
		return OpsActionTrailResponse.class;
	}

}
