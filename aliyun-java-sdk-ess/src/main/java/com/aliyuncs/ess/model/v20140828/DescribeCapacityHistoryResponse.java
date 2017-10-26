/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.ess.model.v20140828;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ess.transform.v20140828.DescribeCapacityHistoryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeCapacityHistoryResponse extends AcsResponse {

	private Integer totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private List<CapacityHistoryModel> capacityHistoryItems;

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
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

	public List<CapacityHistoryModel> getCapacityHistoryItems() {
		return this.capacityHistoryItems;
	}

	public void setCapacityHistoryItems(List<CapacityHistoryModel> capacityHistoryItems) {
		this.capacityHistoryItems = capacityHistoryItems;
	}

	public static class CapacityHistoryModel {

		private String scalingGroupId;

		private Integer totalCapacity;

		private Integer attachedCapacity;

		private Integer autoCreatedCapacity;

		private String timestamp;

		public String getScalingGroupId() {
			return this.scalingGroupId;
		}

		public void setScalingGroupId(String scalingGroupId) {
			this.scalingGroupId = scalingGroupId;
		}

		public Integer getTotalCapacity() {
			return this.totalCapacity;
		}

		public void setTotalCapacity(Integer totalCapacity) {
			this.totalCapacity = totalCapacity;
		}

		public Integer getAttachedCapacity() {
			return this.attachedCapacity;
		}

		public void setAttachedCapacity(Integer attachedCapacity) {
			this.attachedCapacity = attachedCapacity;
		}

		public Integer getAutoCreatedCapacity() {
			return this.autoCreatedCapacity;
		}

		public void setAutoCreatedCapacity(Integer autoCreatedCapacity) {
			this.autoCreatedCapacity = autoCreatedCapacity;
		}

		public String getTimestamp() {
			return this.timestamp;
		}

		public void setTimestamp(String timestamp) {
			this.timestamp = timestamp;
		}
	}

	@Override
	public DescribeCapacityHistoryResponse getInstance(UnmarshallerContext context) {
		return	DescribeCapacityHistoryResponseUnmarshaller.unmarshall(this, context);
	}
}
