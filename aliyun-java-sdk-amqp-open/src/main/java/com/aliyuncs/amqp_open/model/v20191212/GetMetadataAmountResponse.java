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

package com.aliyuncs.amqp_open.model.v20191212;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.amqp_open.transform.v20191212.GetMetadataAmountResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetMetadataAmountResponse extends AcsResponse {

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

		private Integer currentVirtualHosts;

		private Integer maxVirtualHosts;

		private Integer currentExchanges;

		private Integer maxExchanges;

		private Integer currentQueues;

		private Integer maxQueues;

		public Integer getCurrentVirtualHosts() {
			return this.currentVirtualHosts;
		}

		public void setCurrentVirtualHosts(Integer currentVirtualHosts) {
			this.currentVirtualHosts = currentVirtualHosts;
		}

		public Integer getMaxVirtualHosts() {
			return this.maxVirtualHosts;
		}

		public void setMaxVirtualHosts(Integer maxVirtualHosts) {
			this.maxVirtualHosts = maxVirtualHosts;
		}

		public Integer getCurrentExchanges() {
			return this.currentExchanges;
		}

		public void setCurrentExchanges(Integer currentExchanges) {
			this.currentExchanges = currentExchanges;
		}

		public Integer getMaxExchanges() {
			return this.maxExchanges;
		}

		public void setMaxExchanges(Integer maxExchanges) {
			this.maxExchanges = maxExchanges;
		}

		public Integer getCurrentQueues() {
			return this.currentQueues;
		}

		public void setCurrentQueues(Integer currentQueues) {
			this.currentQueues = currentQueues;
		}

		public Integer getMaxQueues() {
			return this.maxQueues;
		}

		public void setMaxQueues(Integer maxQueues) {
			this.maxQueues = maxQueues;
		}
	}

	@Override
	public GetMetadataAmountResponse getInstance(UnmarshallerContext context) {
		return	GetMetadataAmountResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
