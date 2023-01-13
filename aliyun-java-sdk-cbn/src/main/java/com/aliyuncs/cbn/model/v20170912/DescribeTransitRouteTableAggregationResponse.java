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
import com.aliyuncs.cbn.transform.v20170912.DescribeTransitRouteTableAggregationResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeTransitRouteTableAggregationResponse extends AcsResponse {

	private Integer count;

	private String nextToken;

	private Integer total;

	private String requestId;

	private List<DataItem> data;

	public Integer getCount() {
		return this.count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public Integer getTotal() {
		return this.total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private String name;

		private String transitRouteTableAggregationCidr;

		private String scop;

		private String nexthop;

		private String routeType;

		private String description;

		private String trRouteTableId;

		private String status;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getTransitRouteTableAggregationCidr() {
			return this.transitRouteTableAggregationCidr;
		}

		public void setTransitRouteTableAggregationCidr(String transitRouteTableAggregationCidr) {
			this.transitRouteTableAggregationCidr = transitRouteTableAggregationCidr;
		}

		public String getScop() {
			return this.scop;
		}

		public void setScop(String scop) {
			this.scop = scop;
		}

		public String getNexthop() {
			return this.nexthop;
		}

		public void setNexthop(String nexthop) {
			this.nexthop = nexthop;
		}

		public String getRouteType() {
			return this.routeType;
		}

		public void setRouteType(String routeType) {
			this.routeType = routeType;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getTrRouteTableId() {
			return this.trRouteTableId;
		}

		public void setTrRouteTableId(String trRouteTableId) {
			this.trRouteTableId = trRouteTableId;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}
	}

	@Override
	public DescribeTransitRouteTableAggregationResponse getInstance(UnmarshallerContext context) {
		return	DescribeTransitRouteTableAggregationResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
