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
import com.aliyuncs.ecsops.transform.v20160401.OpsDescribeExpireZonesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsDescribeExpireZonesResponse extends AcsResponse {

	private String requestId;

	private Integer pageSize;

	private Integer pageNumber;

	private Integer total;

	private List<ExpireZone> expireZoneSet;

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

	public Integer getTotal() {
		return this.total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public List<ExpireZone> getExpireZoneSet() {
		return this.expireZoneSet;
	}

	public void setExpireZoneSet(List<ExpireZone> expireZoneSet) {
		this.expireZoneSet = expireZoneSet;
	}

	public static class ExpireZone {

		private String expireTime;

		private String sourceIzNo;

		private Integer expireStrategy;

		private String targetZoneNo;

		private String targetIzNo;

		private String sourceZoneNo;

		private Long numericId;

		public String getExpireTime() {
			return this.expireTime;
		}

		public void setExpireTime(String expireTime) {
			this.expireTime = expireTime;
		}

		public String getSourceIzNo() {
			return this.sourceIzNo;
		}

		public void setSourceIzNo(String sourceIzNo) {
			this.sourceIzNo = sourceIzNo;
		}

		public Integer getExpireStrategy() {
			return this.expireStrategy;
		}

		public void setExpireStrategy(Integer expireStrategy) {
			this.expireStrategy = expireStrategy;
		}

		public String getTargetZoneNo() {
			return this.targetZoneNo;
		}

		public void setTargetZoneNo(String targetZoneNo) {
			this.targetZoneNo = targetZoneNo;
		}

		public String getTargetIzNo() {
			return this.targetIzNo;
		}

		public void setTargetIzNo(String targetIzNo) {
			this.targetIzNo = targetIzNo;
		}

		public String getSourceZoneNo() {
			return this.sourceZoneNo;
		}

		public void setSourceZoneNo(String sourceZoneNo) {
			this.sourceZoneNo = sourceZoneNo;
		}

		public Long getNumericId() {
			return this.numericId;
		}

		public void setNumericId(Long numericId) {
			this.numericId = numericId;
		}
	}

	@Override
	public OpsDescribeExpireZonesResponse getInstance(UnmarshallerContext context) {
		return	OpsDescribeExpireZonesResponseUnmarshaller.unmarshall(this, context);
	}
}
