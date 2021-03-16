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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsDescribeBidRelationsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsDescribeBidRelationsResponse extends AcsResponse {

	private String requestId;

	private Integer pageNumber;

	private Integer pageSize;

	private Integer total;

	private List<BidRelation> bidRelations;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getTotal() {
		return this.total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public List<BidRelation> getBidRelations() {
		return this.bidRelations;
	}

	public void setBidRelations(List<BidRelation> bidRelations) {
		this.bidRelations = bidRelations;
	}

	public static class BidRelation {

		private Long id;

		private String bid;

		private String parentBid;

		private Boolean isService;

		private String remark;

		private String serviceCode;

		private Boolean isSite;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getBid() {
			return this.bid;
		}

		public void setBid(String bid) {
			this.bid = bid;
		}

		public String getParentBid() {
			return this.parentBid;
		}

		public void setParentBid(String parentBid) {
			this.parentBid = parentBid;
		}

		public Boolean getIsService() {
			return this.isService;
		}

		public void setIsService(Boolean isService) {
			this.isService = isService;
		}

		public String getRemark() {
			return this.remark;
		}

		public void setRemark(String remark) {
			this.remark = remark;
		}

		public String getServiceCode() {
			return this.serviceCode;
		}

		public void setServiceCode(String serviceCode) {
			this.serviceCode = serviceCode;
		}

		public Boolean getIsSite() {
			return this.isSite;
		}

		public void setIsSite(Boolean isSite) {
			this.isSite = isSite;
		}
	}

	@Override
	public OpsDescribeBidRelationsResponse getInstance(UnmarshallerContext context) {
		return	OpsDescribeBidRelationsResponseUnmarshaller.unmarshall(this, context);
	}
}
