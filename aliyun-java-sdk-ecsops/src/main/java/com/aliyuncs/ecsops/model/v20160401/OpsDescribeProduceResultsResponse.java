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
import com.aliyuncs.ecsops.transform.v20160401.OpsDescribeProduceResultsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsDescribeProduceResultsResponse extends AcsResponse {

	private String requestId;

	private List<ProduceResultSet> produceResultSets;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ProduceResultSet> getProduceResultSets() {
		return this.produceResultSets;
	}

	public void setProduceResultSets(List<ProduceResultSet> produceResultSets) {
		this.produceResultSets = produceResultSets;
	}

	public static class ProduceResultSet {

		private Long id;

		private Long orderId;

		private String instanceId;

		private Integer status;

		private String resourceType;

		private Integer chargeType;

		private Integer actionType;

		private String commodityCode;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Long getOrderId() {
			return this.orderId;
		}

		public void setOrderId(Long orderId) {
			this.orderId = orderId;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public String getResourceType() {
			return this.resourceType;
		}

		public void setResourceType(String resourceType) {
			this.resourceType = resourceType;
		}

		public Integer getChargeType() {
			return this.chargeType;
		}

		public void setChargeType(Integer chargeType) {
			this.chargeType = chargeType;
		}

		public Integer getActionType() {
			return this.actionType;
		}

		public void setActionType(Integer actionType) {
			this.actionType = actionType;
		}

		public String getCommodityCode() {
			return this.commodityCode;
		}

		public void setCommodityCode(String commodityCode) {
			this.commodityCode = commodityCode;
		}
	}

	@Override
	public OpsDescribeProduceResultsResponse getInstance(UnmarshallerContext context) {
		return	OpsDescribeProduceResultsResponseUnmarshaller.unmarshall(this, context);
	}
}
