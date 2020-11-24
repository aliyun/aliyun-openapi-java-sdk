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

package com.aliyuncs.ddoscoo.model.v20200101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ddoscoo.transform.v20200101.DescribeDomainQPSListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDomainQPSListResponse extends AcsResponse {

	private String requestId;

	private List<DomainQPS> domainQPSList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DomainQPS> getDomainQPSList() {
		return this.domainQPSList;
	}

	public void setDomainQPSList(List<DomainQPS> domainQPSList) {
		this.domainQPSList = domainQPSList;
	}

	public static class DomainQPS {

		private Long maxQps;

		private Long maxAttackQps;

		private Long maxNormalQps;

		private Long attackQps;

		private Long totalQps;

		private Long cacheHits;

		private Long totalCount;

		private Long index;

		private Long time;

		public Long getMaxQps() {
			return this.maxQps;
		}

		public void setMaxQps(Long maxQps) {
			this.maxQps = maxQps;
		}

		public Long getMaxAttackQps() {
			return this.maxAttackQps;
		}

		public void setMaxAttackQps(Long maxAttackQps) {
			this.maxAttackQps = maxAttackQps;
		}

		public Long getMaxNormalQps() {
			return this.maxNormalQps;
		}

		public void setMaxNormalQps(Long maxNormalQps) {
			this.maxNormalQps = maxNormalQps;
		}

		public Long getAttackQps() {
			return this.attackQps;
		}

		public void setAttackQps(Long attackQps) {
			this.attackQps = attackQps;
		}

		public Long getTotalQps() {
			return this.totalQps;
		}

		public void setTotalQps(Long totalQps) {
			this.totalQps = totalQps;
		}

		public Long getCacheHits() {
			return this.cacheHits;
		}

		public void setCacheHits(Long cacheHits) {
			this.cacheHits = cacheHits;
		}

		public Long getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Long totalCount) {
			this.totalCount = totalCount;
		}

		public Long getIndex() {
			return this.index;
		}

		public void setIndex(Long index) {
			this.index = index;
		}

		public Long getTime() {
			return this.time;
		}

		public void setTime(Long time) {
			this.time = time;
		}
	}

	@Override
	public DescribeDomainQPSListResponse getInstance(UnmarshallerContext context) {
		return	DescribeDomainQPSListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
