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

package com.aliyuncs.vpc.model.v20160428;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vpc.transform.v20160428.DescribeEipSegmentResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeEipSegmentResponse extends AcsResponse {

	private Integer pageSize;

	private String requestId;

	private Integer pageNumber;

	private Integer totalCount;

	private List<EipSegment> eipSegments;

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

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

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<EipSegment> getEipSegments() {
		return this.eipSegments;
	}

	public void setEipSegments(List<EipSegment> eipSegments) {
		this.eipSegments = eipSegments;
	}

	public static class EipSegment {

		private String creationTime;

		private String status;

		private String descritpion;

		private String instanceId;

		private String ipCount;

		private String name;

		private String segment;

		private String regionId;

		private String zone;

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getDescritpion() {
			return this.descritpion;
		}

		public void setDescritpion(String descritpion) {
			this.descritpion = descritpion;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getIpCount() {
			return this.ipCount;
		}

		public void setIpCount(String ipCount) {
			this.ipCount = ipCount;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getSegment() {
			return this.segment;
		}

		public void setSegment(String segment) {
			this.segment = segment;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getZone() {
			return this.zone;
		}

		public void setZone(String zone) {
			this.zone = zone;
		}
	}

	@Override
	public DescribeEipSegmentResponse getInstance(UnmarshallerContext context) {
		return	DescribeEipSegmentResponseUnmarshaller.unmarshall(this, context);
	}
}
