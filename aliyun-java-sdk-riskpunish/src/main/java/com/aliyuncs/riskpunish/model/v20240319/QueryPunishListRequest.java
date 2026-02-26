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

package com.aliyuncs.riskpunish.model.v20240319;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class QueryPunishListRequest extends RpcAcsRequest<QueryPunishListResponse> {
	   

	private Long dateStart;

	private String punishIp;

	private String punishUrl;

	private Integer pageSize;

	private Long dateEnd;

	private Integer currentPage;
	public QueryPunishListRequest() {
		super("RiskPunish", "2024-03-19", "QueryPunishList");
		setMethod(MethodType.POST);
	}

	public Long getDateStart() {
		return this.dateStart;
	}

	public void setDateStart(Long dateStart) {
		this.dateStart = dateStart;
		if(dateStart != null){
			putQueryParameter("DateStart", dateStart.toString());
		}
	}

	public String getPunishIp() {
		return this.punishIp;
	}

	public void setPunishIp(String punishIp) {
		this.punishIp = punishIp;
		if(punishIp != null){
			putQueryParameter("PunishIp", punishIp);
		}
	}

	public String getPunishUrl() {
		return this.punishUrl;
	}

	public void setPunishUrl(String punishUrl) {
		this.punishUrl = punishUrl;
		if(punishUrl != null){
			putQueryParameter("PunishUrl", punishUrl);
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

	public Long getDateEnd() {
		return this.dateEnd;
	}

	public void setDateEnd(Long dateEnd) {
		this.dateEnd = dateEnd;
		if(dateEnd != null){
			putQueryParameter("DateEnd", dateEnd.toString());
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

	@Override
	public Class<QueryPunishListResponse> getResponseClass() {
		return QueryPunishListResponse.class;
	}

}
