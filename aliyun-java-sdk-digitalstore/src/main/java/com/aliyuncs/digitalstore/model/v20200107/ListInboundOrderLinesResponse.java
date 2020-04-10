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

package com.aliyuncs.digitalstore.model.v20200107;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.digitalstore.transform.v20200107.ListInboundOrderLinesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListInboundOrderLinesResponse extends AcsResponse {

	private Integer totalCount;

	private Integer pageSize;

	private Integer pageNumber;

	private String requestId;

	private Boolean success;

	private List<InboundOrderLineBiz> inboundOrderLines;

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
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

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<InboundOrderLineBiz> getInboundOrderLines() {
		return this.inboundOrderLines;
	}

	public void setInboundOrderLines(List<InboundOrderLineBiz> inboundOrderLines) {
		this.inboundOrderLines = inboundOrderLines;
	}

	public static class InboundOrderLineBiz {

		private String barcode;

		private Integer operateQuantity;

		private Integer quantity;

		private Integer confirmQuantity;

		public String getBarcode() {
			return this.barcode;
		}

		public void setBarcode(String barcode) {
			this.barcode = barcode;
		}

		public Integer getOperateQuantity() {
			return this.operateQuantity;
		}

		public void setOperateQuantity(Integer operateQuantity) {
			this.operateQuantity = operateQuantity;
		}

		public Integer getQuantity() {
			return this.quantity;
		}

		public void setQuantity(Integer quantity) {
			this.quantity = quantity;
		}

		public Integer getConfirmQuantity() {
			return this.confirmQuantity;
		}

		public void setConfirmQuantity(Integer confirmQuantity) {
			this.confirmQuantity = confirmQuantity;
		}
	}

	@Override
	public ListInboundOrderLinesResponse getInstance(UnmarshallerContext context) {
		return	ListInboundOrderLinesResponseUnmarshaller.unmarshall(this, context);
	}
}
