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

package com.aliyuncs.eds_aic.model.v20230930;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.eds_aic.transform.v20230930.DetachKeyPairResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DetachKeyPairResponse extends AcsResponse {

	private String requestId;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String keyPairId;

		private Integer totalCount;

		private Integer failCount;

		private List<String> detachedInstanceIds;

		private List<String> detachedInstanceGroupIds;

		public String getKeyPairId() {
			return this.keyPairId;
		}

		public void setKeyPairId(String keyPairId) {
			this.keyPairId = keyPairId;
		}

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public Integer getFailCount() {
			return this.failCount;
		}

		public void setFailCount(Integer failCount) {
			this.failCount = failCount;
		}

		public List<String> getDetachedInstanceIds() {
			return this.detachedInstanceIds;
		}

		public void setDetachedInstanceIds(List<String> detachedInstanceIds) {
			this.detachedInstanceIds = detachedInstanceIds;
		}

		public List<String> getDetachedInstanceGroupIds() {
			return this.detachedInstanceGroupIds;
		}

		public void setDetachedInstanceGroupIds(List<String> detachedInstanceGroupIds) {
			this.detachedInstanceGroupIds = detachedInstanceGroupIds;
		}
	}

	@Override
	public DetachKeyPairResponse getInstance(UnmarshallerContext context) {
		return	DetachKeyPairResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
