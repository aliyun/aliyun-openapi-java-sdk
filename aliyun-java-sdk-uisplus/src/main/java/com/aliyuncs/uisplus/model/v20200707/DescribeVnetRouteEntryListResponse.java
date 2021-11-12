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

package com.aliyuncs.uisplus.model.v20200707;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.uisplus.transform.v20200707.DescribeVnetRouteEntryListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeVnetRouteEntryListResponse extends AcsResponse {

	private String requestId;

	private Integer pageSize;

	private Integer pageNumber;

	private Integer totalCount;

	private List<VnetsItem> vnets;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<VnetsItem> getVnets() {
		return this.vnets;
	}

	public void setVnets(List<VnetsItem> vnets) {
		this.vnets = vnets;
	}

	public static class VnetsItem {

		private String uisId;

		private String nexthop;

		private String vnetId;

		private String destination;

		private String nexthopType;

		public String getUisId() {
			return this.uisId;
		}

		public void setUisId(String uisId) {
			this.uisId = uisId;
		}

		public String getNexthop() {
			return this.nexthop;
		}

		public void setNexthop(String nexthop) {
			this.nexthop = nexthop;
		}

		public String getVnetId() {
			return this.vnetId;
		}

		public void setVnetId(String vnetId) {
			this.vnetId = vnetId;
		}

		public String getDestination() {
			return this.destination;
		}

		public void setDestination(String destination) {
			this.destination = destination;
		}

		public String getNexthopType() {
			return this.nexthopType;
		}

		public void setNexthopType(String nexthopType) {
			this.nexthopType = nexthopType;
		}
	}

	@Override
	public DescribeVnetRouteEntryListResponse getInstance(UnmarshallerContext context) {
		return	DescribeVnetRouteEntryListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
