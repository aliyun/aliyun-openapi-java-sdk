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

package com.aliyuncs.yundun_ds.model.v20190103;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.yundun_ds.transform.v20190103.DescribeDepartTotalCountResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDepartTotalCountResponse extends AcsResponse {

	private String requestId;

	private DepartCount departCount;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public DepartCount getDepartCount() {
		return this.departCount;
	}

	public void setDepartCount(DepartCount departCount) {
		this.departCount = departCount;
	}

	public static class DepartCount {

		private Long departCount;

		private Long count;

		private Long userCount;

		private Long dtCount;

		private Long subCount;

		private Long sensitiveCount;

		public Long getDepartCount() {
			return this.departCount;
		}

		public void setDepartCount(Long departCount) {
			this.departCount = departCount;
		}

		public Long getCount() {
			return this.count;
		}

		public void setCount(Long count) {
			this.count = count;
		}

		public Long getUserCount() {
			return this.userCount;
		}

		public void setUserCount(Long userCount) {
			this.userCount = userCount;
		}

		public Long getDtCount() {
			return this.dtCount;
		}

		public void setDtCount(Long dtCount) {
			this.dtCount = dtCount;
		}

		public Long getSubCount() {
			return this.subCount;
		}

		public void setSubCount(Long subCount) {
			this.subCount = subCount;
		}

		public Long getSensitiveCount() {
			return this.sensitiveCount;
		}

		public void setSensitiveCount(Long sensitiveCount) {
			this.sensitiveCount = sensitiveCount;
		}
	}

	@Override
	public DescribeDepartTotalCountResponse getInstance(UnmarshallerContext context) {
		return	DescribeDepartTotalCountResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
