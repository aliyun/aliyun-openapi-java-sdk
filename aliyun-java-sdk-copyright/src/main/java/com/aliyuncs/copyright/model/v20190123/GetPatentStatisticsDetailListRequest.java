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

package com.aliyuncs.copyright.model.v20190123;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetPatentStatisticsDetailListRequest extends RpcAcsRequest<GetPatentStatisticsDetailListResponse> {
	   

	private String userType;

	private String discount;

	private Long startDate;

	private String type;

	private Long endDate;

	private Integer startYear;

	private String keyword;

	private Integer endYear;
	public GetPatentStatisticsDetailListRequest() {
		super("Copyright", "2019-01-23", "GetPatentStatisticsDetailList", "swcopyright");
		setMethod(MethodType.GET);
	}

	public String getUserType() {
		return this.userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
		if(userType != null){
			putQueryParameter("UserType", userType);
		}
	}

	public String getDiscount() {
		return this.discount;
	}

	public void setDiscount(String discount) {
		this.discount = discount;
		if(discount != null){
			putQueryParameter("Discount", discount);
		}
	}

	public Long getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Long startDate) {
		this.startDate = startDate;
		if(startDate != null){
			putQueryParameter("StartDate", startDate.toString());
		}
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putQueryParameter("Type", type);
		}
	}

	public Long getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Long endDate) {
		this.endDate = endDate;
		if(endDate != null){
			putQueryParameter("EndDate", endDate.toString());
		}
	}

	public Integer getStartYear() {
		return this.startYear;
	}

	public void setStartYear(Integer startYear) {
		this.startYear = startYear;
		if(startYear != null){
			putQueryParameter("StartYear", startYear.toString());
		}
	}

	public String getKeyword() {
		return this.keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
		if(keyword != null){
			putQueryParameter("Keyword", keyword);
		}
	}

	public Integer getEndYear() {
		return this.endYear;
	}

	public void setEndYear(Integer endYear) {
		this.endYear = endYear;
		if(endYear != null){
			putQueryParameter("EndYear", endYear.toString());
		}
	}

	@Override
	public Class<GetPatentStatisticsDetailListResponse> getResponseClass() {
		return GetPatentStatisticsDetailListResponse.class;
	}

}
