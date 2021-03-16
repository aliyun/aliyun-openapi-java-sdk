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
import com.aliyuncs.ecsops.transform.v20160401.OpsDescribeFleetsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsDescribeFleetsResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private List<Fleet> fleets;

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

	public List<Fleet> getFleets() {
		return this.fleets;
	}

	public void setFleets(List<Fleet> fleets) {
		this.fleets = fleets;
	}

	public static class Fleet {

		private Long id;

		private Long aliUid;

		private String fleetId;

		private String fleetName;

		private String scalingId;

		private String status;

		private String result;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Long getAliUid() {
			return this.aliUid;
		}

		public void setAliUid(Long aliUid) {
			this.aliUid = aliUid;
		}

		public String getFleetId() {
			return this.fleetId;
		}

		public void setFleetId(String fleetId) {
			this.fleetId = fleetId;
		}

		public String getFleetName() {
			return this.fleetName;
		}

		public void setFleetName(String fleetName) {
			this.fleetName = fleetName;
		}

		public String getScalingId() {
			return this.scalingId;
		}

		public void setScalingId(String scalingId) {
			this.scalingId = scalingId;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getResult() {
			return this.result;
		}

		public void setResult(String result) {
			this.result = result;
		}
	}

	@Override
	public OpsDescribeFleetsResponse getInstance(UnmarshallerContext context) {
		return	OpsDescribeFleetsResponseUnmarshaller.unmarshall(this, context);
	}
}
