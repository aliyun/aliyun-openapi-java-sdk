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

package com.aliyuncs.sddp.model.v20190103;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.sddp.transform.v20190103.DescribeUseFlowResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeUseFlowResponse extends AcsResponse {

	private String requestId;

	private UseFlow useFlow;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public UseFlow getUseFlow() {
		return this.useFlow;
	}

	public void setUseFlow(UseFlow useFlow) {
		this.useFlow = useFlow;
	}

	public static class UseFlow {

		private Long tableNum;

		private Long ossSize;

		private Long dataMaskCells;

		private Long sddpCredits;

		private Integer saleFlowCountType;

		public Long getTableNum() {
			return this.tableNum;
		}

		public void setTableNum(Long tableNum) {
			this.tableNum = tableNum;
		}

		public Long getOssSize() {
			return this.ossSize;
		}

		public void setOssSize(Long ossSize) {
			this.ossSize = ossSize;
		}

		public Long getDataMaskCells() {
			return this.dataMaskCells;
		}

		public void setDataMaskCells(Long dataMaskCells) {
			this.dataMaskCells = dataMaskCells;
		}

		public Long getSddpCredits() {
			return this.sddpCredits;
		}

		public void setSddpCredits(Long sddpCredits) {
			this.sddpCredits = sddpCredits;
		}

		public Integer getSaleFlowCountType() {
			return this.saleFlowCountType;
		}

		public void setSaleFlowCountType(Integer saleFlowCountType) {
			this.saleFlowCountType = saleFlowCountType;
		}
	}

	@Override
	public DescribeUseFlowResponse getInstance(UnmarshallerContext context) {
		return	DescribeUseFlowResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
