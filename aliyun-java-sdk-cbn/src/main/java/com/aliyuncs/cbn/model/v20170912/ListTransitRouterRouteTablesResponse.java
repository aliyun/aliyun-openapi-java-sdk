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
import com.aliyuncs.cbn.transform.v20170912.ListTransitRouterRouteTablesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListTransitRouterRouteTablesResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer maxResults;

	private String nextToken;

	private List<TransitRouterRouteTable> transitRouterRouteTables;

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

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public List<TransitRouterRouteTable> getTransitRouterRouteTables() {
		return this.transitRouterRouteTables;
	}

	public void setTransitRouterRouteTables(List<TransitRouterRouteTable> transitRouterRouteTables) {
		this.transitRouterRouteTables = transitRouterRouteTables;
	}

	public static class TransitRouterRouteTable {

		private String transitRouterRouteTableStatus;

		private String transitRouterRouteTableName;

		private String transitRouterRouteTableId;

		private String transitRouterRouteTableDescription;

		private String transitRouterRouteTableType;

		private String createTime;

		public String getTransitRouterRouteTableStatus() {
			return this.transitRouterRouteTableStatus;
		}

		public void setTransitRouterRouteTableStatus(String transitRouterRouteTableStatus) {
			this.transitRouterRouteTableStatus = transitRouterRouteTableStatus;
		}

		public String getTransitRouterRouteTableName() {
			return this.transitRouterRouteTableName;
		}

		public void setTransitRouterRouteTableName(String transitRouterRouteTableName) {
			this.transitRouterRouteTableName = transitRouterRouteTableName;
		}

		public String getTransitRouterRouteTableId() {
			return this.transitRouterRouteTableId;
		}

		public void setTransitRouterRouteTableId(String transitRouterRouteTableId) {
			this.transitRouterRouteTableId = transitRouterRouteTableId;
		}

		public String getTransitRouterRouteTableDescription() {
			return this.transitRouterRouteTableDescription;
		}

		public void setTransitRouterRouteTableDescription(String transitRouterRouteTableDescription) {
			this.transitRouterRouteTableDescription = transitRouterRouteTableDescription;
		}

		public String getTransitRouterRouteTableType() {
			return this.transitRouterRouteTableType;
		}

		public void setTransitRouterRouteTableType(String transitRouterRouteTableType) {
			this.transitRouterRouteTableType = transitRouterRouteTableType;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}
	}

	@Override
	public ListTransitRouterRouteTablesResponse getInstance(UnmarshallerContext context) {
		return	ListTransitRouterRouteTablesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
