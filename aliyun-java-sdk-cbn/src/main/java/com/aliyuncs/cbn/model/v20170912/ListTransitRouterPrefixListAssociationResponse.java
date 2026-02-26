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

package com.aliyuncs.cbn.model.v20170912;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cbn.transform.v20170912.ListTransitRouterPrefixListAssociationResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListTransitRouterPrefixListAssociationResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer pageSize;

	private Integer pageNumber;

	private List<PrefixList> prefixLists;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

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

	public List<PrefixList> getPrefixLists() {
		return this.prefixLists;
	}

	public void setPrefixLists(List<PrefixList> prefixLists) {
		this.prefixLists = prefixLists;
	}

	public static class PrefixList {

		private String prefixListId;

		private Long ownerUid;

		private String status;

		private String nextHop;

		private String nextHopInstanceId;

		private String nextHopType;

		private String transitRouterTableId;

		private String transitRouterId;

		public String getPrefixListId() {
			return this.prefixListId;
		}

		public void setPrefixListId(String prefixListId) {
			this.prefixListId = prefixListId;
		}

		public Long getOwnerUid() {
			return this.ownerUid;
		}

		public void setOwnerUid(Long ownerUid) {
			this.ownerUid = ownerUid;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getNextHop() {
			return this.nextHop;
		}

		public void setNextHop(String nextHop) {
			this.nextHop = nextHop;
		}

		public String getNextHopInstanceId() {
			return this.nextHopInstanceId;
		}

		public void setNextHopInstanceId(String nextHopInstanceId) {
			this.nextHopInstanceId = nextHopInstanceId;
		}

		public String getNextHopType() {
			return this.nextHopType;
		}

		public void setNextHopType(String nextHopType) {
			this.nextHopType = nextHopType;
		}

		public String getTransitRouterTableId() {
			return this.transitRouterTableId;
		}

		public void setTransitRouterTableId(String transitRouterTableId) {
			this.transitRouterTableId = transitRouterTableId;
		}

		public String getTransitRouterId() {
			return this.transitRouterId;
		}

		public void setTransitRouterId(String transitRouterId) {
			this.transitRouterId = transitRouterId;
		}
	}

	@Override
	public ListTransitRouterPrefixListAssociationResponse getInstance(UnmarshallerContext context) {
		return	ListTransitRouterPrefixListAssociationResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
