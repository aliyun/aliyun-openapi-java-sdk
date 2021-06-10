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

package com.aliyuncs.dms_enterprise.model.v20181101;

import com.aliyuncs.RpcAcsRequest;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dms_enterprise.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListSQLReviewOriginSQLRequest extends RpcAcsRequest<ListSQLReviewOriginSQLResponse> {
	   

	private Long orderId;

	@SerializedName("orderActionDetail")
	private OrderActionDetail orderActionDetail;

	private Long tid;
	public ListSQLReviewOriginSQLRequest() {
		super("dms-enterprise", "2018-11-01", "ListSQLReviewOriginSQL", "dms-enterprise");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getOrderId() {
		return this.orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
		if(orderId != null){
			putQueryParameter("OrderId", orderId.toString());
		}
	}

	public OrderActionDetail getOrderActionDetail() {
		return this.orderActionDetail;
	}

	public void setOrderActionDetail(OrderActionDetail orderActionDetail) {
		this.orderActionDetail = orderActionDetail;	
		if (orderActionDetail != null) {
			putQueryParameter("OrderActionDetail" , new Gson().toJson(orderActionDetail));
		}	
	}

	public Long getTid() {
		return this.tid;
	}

	public void setTid(Long tid) {
		this.tid = tid;
		if(tid != null){
			putQueryParameter("Tid", tid.toString());
		}
	}

	public static class OrderActionDetail {

		@SerializedName("CheckStatusResult")
		private String checkStatusResult;

		@SerializedName("SQLReviewResult")
		private String sQLReviewResult;

		@SerializedName("Page")
		private Page page;

		@SerializedName("FileId")
		private Long fileId;

		public String getCheckStatusResult() {
			return this.checkStatusResult;
		}

		public void setCheckStatusResult(String checkStatusResult) {
			this.checkStatusResult = checkStatusResult;
		}

		public String getSQLReviewResult() {
			return this.sQLReviewResult;
		}

		public void setSQLReviewResult(String sQLReviewResult) {
			this.sQLReviewResult = sQLReviewResult;
		}

		public Page getPage() {
			return this.page;
		}

		public void setPage(Page page) {
			this.page = page;
		}

		public Long getFileId() {
			return this.fileId;
		}

		public void setFileId(Long fileId) {
			this.fileId = fileId;
		}

		public static class Page {

			@SerializedName("PageSize")
			private Integer pageSize;

			@SerializedName("PageNumber")
			private Integer pageNumber;

			public Integer getPageSize() {
				return this.pageSize;
			}

			public void setPageSize(Integer pageSize) {
				this.pageSize = pageSize;
			}

			public Integer getPageNumber() {
				return this.pageNumber;
			}

			public void setPageNumber(Integer pageNumber) {
				this.pageNumber = pageNumber;
			}
		}
	}

	@Override
	public Class<ListSQLReviewOriginSQLResponse> getResponseClass() {
		return ListSQLReviewOriginSQLResponse.class;
	}

}
