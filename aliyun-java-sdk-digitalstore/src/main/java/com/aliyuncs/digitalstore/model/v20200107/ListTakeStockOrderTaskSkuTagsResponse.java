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
import com.aliyuncs.digitalstore.transform.v20200107.ListTakeStockOrderTaskSkuTagsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListTakeStockOrderTaskSkuTagsResponse extends AcsResponse {

	private Integer pageSize;

	private Integer totalCount;

	private Integer pageNumber;

	private String requestId;

	private Boolean success;

	private List<TakeStockOrderTaskSkuTagModel> takeStockOrderTaskSkuTags;

	private List<TaskSkuTagSummaryModel> taskSkuTagSummarys;

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
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

	public List<TakeStockOrderTaskSkuTagModel> getTakeStockOrderTaskSkuTags() {
		return this.takeStockOrderTaskSkuTags;
	}

	public void setTakeStockOrderTaskSkuTags(List<TakeStockOrderTaskSkuTagModel> takeStockOrderTaskSkuTags) {
		this.takeStockOrderTaskSkuTags = takeStockOrderTaskSkuTags;
	}

	public List<TaskSkuTagSummaryModel> getTaskSkuTagSummarys() {
		return this.taskSkuTagSummarys;
	}

	public void setTaskSkuTagSummarys(List<TaskSkuTagSummaryModel> taskSkuTagSummarys) {
		this.taskSkuTagSummarys = taskSkuTagSummarys;
	}

	public static class TakeStockOrderTaskSkuTagModel {

		private Integer bError;

		private String epc;

		private Integer operateQuantity;

		private String barcodeId;

		private String barcode;

		private String takeStockOrderId;

		private String takeStockTaskId;

		public Integer getBError() {
			return this.bError;
		}

		public void setBError(Integer bError) {
			this.bError = bError;
		}

		public String getEpc() {
			return this.epc;
		}

		public void setEpc(String epc) {
			this.epc = epc;
		}

		public Integer getOperateQuantity() {
			return this.operateQuantity;
		}

		public void setOperateQuantity(Integer operateQuantity) {
			this.operateQuantity = operateQuantity;
		}

		public String getBarcodeId() {
			return this.barcodeId;
		}

		public void setBarcodeId(String barcodeId) {
			this.barcodeId = barcodeId;
		}

		public String getBarcode() {
			return this.barcode;
		}

		public void setBarcode(String barcode) {
			this.barcode = barcode;
		}

		public String getTakeStockOrderId() {
			return this.takeStockOrderId;
		}

		public void setTakeStockOrderId(String takeStockOrderId) {
			this.takeStockOrderId = takeStockOrderId;
		}

		public String getTakeStockTaskId() {
			return this.takeStockTaskId;
		}

		public void setTakeStockTaskId(String takeStockTaskId) {
			this.takeStockTaskId = takeStockTaskId;
		}
	}

	public static class TaskSkuTagSummaryModel {

		private Integer scanQuantity;

		private Integer rfidQuantity;

		private Integer totalQuantity;

		public Integer getScanQuantity() {
			return this.scanQuantity;
		}

		public void setScanQuantity(Integer scanQuantity) {
			this.scanQuantity = scanQuantity;
		}

		public Integer getRfidQuantity() {
			return this.rfidQuantity;
		}

		public void setRfidQuantity(Integer rfidQuantity) {
			this.rfidQuantity = rfidQuantity;
		}

		public Integer getTotalQuantity() {
			return this.totalQuantity;
		}

		public void setTotalQuantity(Integer totalQuantity) {
			this.totalQuantity = totalQuantity;
		}
	}

	@Override
	public ListTakeStockOrderTaskSkuTagsResponse getInstance(UnmarshallerContext context) {
		return	ListTakeStockOrderTaskSkuTagsResponseUnmarshaller.unmarshall(this, context);
	}
}
