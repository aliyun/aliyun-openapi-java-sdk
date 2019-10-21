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

package com.aliyuncs.baas.model.v20181221;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.baas.transform.v20181221.DescribeAntChainTransactionStatisticsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAntChainTransactionStatisticsResponse extends AcsResponse {

	private String requestId;

	private List<ResultItem> result;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ResultItem> getResult() {
		return this.result;
	}

	public void setResult(List<ResultItem> result) {
		this.result = result;
	}

	public static class ResultItem {

		private String antChainId;

		private String dt;

		private Long transCount;

		private Long lastSumBlockHeight;

		private Long creatTime;

		public String getAntChainId() {
			return this.antChainId;
		}

		public void setAntChainId(String antChainId) {
			this.antChainId = antChainId;
		}

		public String getDt() {
			return this.dt;
		}

		public void setDt(String dt) {
			this.dt = dt;
		}

		public Long getTransCount() {
			return this.transCount;
		}

		public void setTransCount(Long transCount) {
			this.transCount = transCount;
		}

		public Long getLastSumBlockHeight() {
			return this.lastSumBlockHeight;
		}

		public void setLastSumBlockHeight(Long lastSumBlockHeight) {
			this.lastSumBlockHeight = lastSumBlockHeight;
		}

		public Long getCreatTime() {
			return this.creatTime;
		}

		public void setCreatTime(Long creatTime) {
			this.creatTime = creatTime;
		}
	}

	@Override
	public DescribeAntChainTransactionStatisticsResponse getInstance(UnmarshallerContext context) {
		return	DescribeAntChainTransactionStatisticsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
