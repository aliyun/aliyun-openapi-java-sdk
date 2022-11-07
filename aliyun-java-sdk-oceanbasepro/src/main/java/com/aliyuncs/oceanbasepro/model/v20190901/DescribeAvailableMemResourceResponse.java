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

package com.aliyuncs.oceanbasepro.model.v20190901;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.oceanbasepro.transform.v20190901.DescribeAvailableMemResourceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAvailableMemResourceResponse extends AcsResponse {

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

		private Long minMem;

		private Long maxMem;

		private Long usedMem;

		public Long getMinMem() {
			return this.minMem;
		}

		public void setMinMem(Long minMem) {
			this.minMem = minMem;
		}

		public Long getMaxMem() {
			return this.maxMem;
		}

		public void setMaxMem(Long maxMem) {
			this.maxMem = maxMem;
		}

		public Long getUsedMem() {
			return this.usedMem;
		}

		public void setUsedMem(Long usedMem) {
			this.usedMem = usedMem;
		}
	}

	@Override
	public DescribeAvailableMemResourceResponse getInstance(UnmarshallerContext context) {
		return	DescribeAvailableMemResourceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
