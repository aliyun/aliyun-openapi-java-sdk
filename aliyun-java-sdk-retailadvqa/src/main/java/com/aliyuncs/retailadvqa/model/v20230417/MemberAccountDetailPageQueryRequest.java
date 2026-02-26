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

package com.aliyuncs.retailadvqa.model.v20230417;

import com.aliyuncs.RpcAcsRequest;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class MemberAccountDetailPageQueryRequest extends RpcAcsRequest<MemberAccountDetailPageQueryResponse> {
	   

	@SerializedName("body")
	private Body body;
	public MemberAccountDetailPageQueryRequest() {
		super("retailadvqa", "2023-04-17", "MemberAccountDetailPageQuery", "qucikmember");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public Body getBody() {
		return this.body;
	}

	public void setBody(Body body) {
		this.body = body;	
		if (body != null) {
			putQueryParameter("body" , new Gson().toJson(body));
		}	
	}

	public static class Body {

		@SerializedName("OpenMerchantId")
		private String openMerchantId;

		@SerializedName("AccountType")
		private Integer accountType;

		@SerializedName("PageSize")
		private Integer pageSize;

		@SerializedName("PlatFormType")
		private String platFormType;

		@SerializedName("EndTime")
		private String endTime;

		@SerializedName("StartTime")
		private String startTime;

		@SerializedName("Page")
		private Integer page;

		@SerializedName("OuterMemberId")
		private String outerMemberId;

		public String getOpenMerchantId() {
			return this.openMerchantId;
		}

		public void setOpenMerchantId(String openMerchantId) {
			this.openMerchantId = openMerchantId;
		}

		public Integer getAccountType() {
			return this.accountType;
		}

		public void setAccountType(Integer accountType) {
			this.accountType = accountType;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public String getPlatFormType() {
			return this.platFormType;
		}

		public void setPlatFormType(String platFormType) {
			this.platFormType = platFormType;
		}

		public String getEndTime() {
			return this.endTime;
		}

		public void setEndTime(String endTime) {
			this.endTime = endTime;
		}

		public String getStartTime() {
			return this.startTime;
		}

		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}

		public Integer getPage() {
			return this.page;
		}

		public void setPage(Integer page) {
			this.page = page;
		}

		public String getOuterMemberId() {
			return this.outerMemberId;
		}

		public void setOuterMemberId(String outerMemberId) {
			this.outerMemberId = outerMemberId;
		}
	}

	@Override
	public Class<MemberAccountDetailPageQueryResponse> getResponseClass() {
		return MemberAccountDetailPageQueryResponse.class;
	}

}
