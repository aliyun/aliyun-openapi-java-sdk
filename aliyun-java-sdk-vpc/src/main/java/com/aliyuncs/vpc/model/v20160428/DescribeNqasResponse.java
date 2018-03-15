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
import com.aliyuncs.vpc.transform.v20160428.DescribeNqasResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeNqasResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private List<Nqa> nqas;

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

	public List<Nqa> getNqas() {
		return this.nqas;
	}

	public void setNqas(List<Nqa> nqas) {
		this.nqas = nqas;
	}

	public static class Nqa {

		private String nqaId;

		private String regionId;

		private String status;

		private String routerId;

		private String destinationIp;

		public String getNqaId() {
			return this.nqaId;
		}

		public void setNqaId(String nqaId) {
			this.nqaId = nqaId;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getRouterId() {
			return this.routerId;
		}

		public void setRouterId(String routerId) {
			this.routerId = routerId;
		}

		public String getDestinationIp() {
			return this.destinationIp;
		}

		public void setDestinationIp(String destinationIp) {
			this.destinationIp = destinationIp;
		}
	}

	@Override
	public DescribeNqasResponse getInstance(UnmarshallerContext context) {
		return	DescribeNqasResponseUnmarshaller.unmarshall(this, context);
	}
}
