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

package com.aliyuncs.smartag.model.v20180313;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.smartag.transform.v20180313.DescribeQosCarsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeQosCarsResponse extends AcsResponse {

	private Integer totalCount;

	private String requestId;

	private Integer pageSize;

	private Integer pageNumber;

	private List<QosCar> qosCars;

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

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

	public List<QosCar> getQosCars() {
		return this.qosCars;
	}

	public void setQosCars(List<QosCar> qosCars) {
		this.qosCars = qosCars;
	}

	public static class QosCar {

		private Integer minBandwidthAbs;

		private String description;

		private String qosCarId;

		private Integer priority;

		private Integer maxBandwidthPercent;

		private Integer maxBandwidthAbs;

		private String qosId;

		private String percentSourceType;

		private Integer minBandwidthPercent;

		private String limitType;

		private String name;

		public Integer getMinBandwidthAbs() {
			return this.minBandwidthAbs;
		}

		public void setMinBandwidthAbs(Integer minBandwidthAbs) {
			this.minBandwidthAbs = minBandwidthAbs;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getQosCarId() {
			return this.qosCarId;
		}

		public void setQosCarId(String qosCarId) {
			this.qosCarId = qosCarId;
		}

		public Integer getPriority() {
			return this.priority;
		}

		public void setPriority(Integer priority) {
			this.priority = priority;
		}

		public Integer getMaxBandwidthPercent() {
			return this.maxBandwidthPercent;
		}

		public void setMaxBandwidthPercent(Integer maxBandwidthPercent) {
			this.maxBandwidthPercent = maxBandwidthPercent;
		}

		public Integer getMaxBandwidthAbs() {
			return this.maxBandwidthAbs;
		}

		public void setMaxBandwidthAbs(Integer maxBandwidthAbs) {
			this.maxBandwidthAbs = maxBandwidthAbs;
		}

		public String getQosId() {
			return this.qosId;
		}

		public void setQosId(String qosId) {
			this.qosId = qosId;
		}

		public String getPercentSourceType() {
			return this.percentSourceType;
		}

		public void setPercentSourceType(String percentSourceType) {
			this.percentSourceType = percentSourceType;
		}

		public Integer getMinBandwidthPercent() {
			return this.minBandwidthPercent;
		}

		public void setMinBandwidthPercent(Integer minBandwidthPercent) {
			this.minBandwidthPercent = minBandwidthPercent;
		}

		public String getLimitType() {
			return this.limitType;
		}

		public void setLimitType(String limitType) {
			this.limitType = limitType;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}
	}

	@Override
	public DescribeQosCarsResponse getInstance(UnmarshallerContext context) {
		return	DescribeQosCarsResponseUnmarshaller.unmarshall(this, context);
	}
}
