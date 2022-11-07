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
import com.aliyuncs.oceanbasepro.transform.v20190901.DescribeOutlineBindingResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeOutlineBindingResponse extends AcsResponse {

	private String requestId;

	private OutlineBinding outlineBinding;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public OutlineBinding getOutlineBinding() {
		return this.outlineBinding;
	}

	public void setOutlineBinding(OutlineBinding outlineBinding) {
		this.outlineBinding = outlineBinding;
	}

	public static class OutlineBinding {

		private String bindPlan;

		private Long outlineId;

		private String bindIndex;

		private Integer maxConcurrent;

		public String getBindPlan() {
			return this.bindPlan;
		}

		public void setBindPlan(String bindPlan) {
			this.bindPlan = bindPlan;
		}

		public Long getOutlineId() {
			return this.outlineId;
		}

		public void setOutlineId(Long outlineId) {
			this.outlineId = outlineId;
		}

		public String getBindIndex() {
			return this.bindIndex;
		}

		public void setBindIndex(String bindIndex) {
			this.bindIndex = bindIndex;
		}

		public Integer getMaxConcurrent() {
			return this.maxConcurrent;
		}

		public void setMaxConcurrent(Integer maxConcurrent) {
			this.maxConcurrent = maxConcurrent;
		}
	}

	@Override
	public DescribeOutlineBindingResponse getInstance(UnmarshallerContext context) {
		return	DescribeOutlineBindingResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
