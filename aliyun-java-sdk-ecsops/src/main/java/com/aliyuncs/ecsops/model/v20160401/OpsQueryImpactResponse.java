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
import com.aliyuncs.ecsops.transform.v20160401.OpsQueryImpactResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsQueryImpactResponse extends AcsResponse {

	private String requestId;

	private String aggegationKeys;

	private List<AggregationItem> aggregationItems;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getAggegationKeys() {
		return this.aggegationKeys;
	}

	public void setAggegationKeys(String aggegationKeys) {
		this.aggegationKeys = aggegationKeys;
	}

	public List<AggregationItem> getAggregationItems() {
		return this.aggregationItems;
	}

	public void setAggregationItems(List<AggregationItem> aggregationItems) {
		this.aggregationItems = aggregationItems;
	}

	public static class AggregationItem {

		private Integer vcpuCnt;

		private Integer vmCnt;

		private Integer ncCnt;

		private Integer userCnt;

		private Integer gc6Cnt;

		private Integer gc7Cnt;

		private String aggregationValue;

		private Integer storageNcCnt;

		private Float gocVcpuCnt;

		private Integer storageAffectVmCnt;

		public Integer getVcpuCnt() {
			return this.vcpuCnt;
		}

		public void setVcpuCnt(Integer vcpuCnt) {
			this.vcpuCnt = vcpuCnt;
		}

		public Integer getVmCnt() {
			return this.vmCnt;
		}

		public void setVmCnt(Integer vmCnt) {
			this.vmCnt = vmCnt;
		}

		public Integer getNcCnt() {
			return this.ncCnt;
		}

		public void setNcCnt(Integer ncCnt) {
			this.ncCnt = ncCnt;
		}

		public Integer getUserCnt() {
			return this.userCnt;
		}

		public void setUserCnt(Integer userCnt) {
			this.userCnt = userCnt;
		}

		public Integer getGc6Cnt() {
			return this.gc6Cnt;
		}

		public void setGc6Cnt(Integer gc6Cnt) {
			this.gc6Cnt = gc6Cnt;
		}

		public Integer getGc7Cnt() {
			return this.gc7Cnt;
		}

		public void setGc7Cnt(Integer gc7Cnt) {
			this.gc7Cnt = gc7Cnt;
		}

		public String getAggregationValue() {
			return this.aggregationValue;
		}

		public void setAggregationValue(String aggregationValue) {
			this.aggregationValue = aggregationValue;
		}

		public Integer getStorageNcCnt() {
			return this.storageNcCnt;
		}

		public void setStorageNcCnt(Integer storageNcCnt) {
			this.storageNcCnt = storageNcCnt;
		}

		public Float getGocVcpuCnt() {
			return this.gocVcpuCnt;
		}

		public void setGocVcpuCnt(Float gocVcpuCnt) {
			this.gocVcpuCnt = gocVcpuCnt;
		}

		public Integer getStorageAffectVmCnt() {
			return this.storageAffectVmCnt;
		}

		public void setStorageAffectVmCnt(Integer storageAffectVmCnt) {
			this.storageAffectVmCnt = storageAffectVmCnt;
		}
	}

	@Override
	public OpsQueryImpactResponse getInstance(UnmarshallerContext context) {
		return	OpsQueryImpactResponseUnmarshaller.unmarshall(this, context);
	}
}
