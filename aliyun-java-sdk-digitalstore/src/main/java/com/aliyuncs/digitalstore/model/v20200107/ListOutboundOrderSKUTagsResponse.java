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
import com.aliyuncs.digitalstore.transform.v20200107.ListOutboundOrderSKUTagsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListOutboundOrderSKUTagsResponse extends AcsResponse {

	private Integer pageSize;

	private Integer totalCount;

	private Integer pageNumber;

	private String requestId;

	private Boolean success;

	private List<OutboundOrderSkuTagBiz> skuTags;

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

	public List<OutboundOrderSkuTagBiz> getSkuTags() {
		return this.skuTags;
	}

	public void setSkuTags(List<OutboundOrderSkuTagBiz> skuTags) {
		this.skuTags = skuTags;
	}

	public static class OutboundOrderSkuTagBiz {

		private String barcode;

		private String caseId;

		private String tagValue;

		private String caseCode;

		private String sKUId;

		private String sKUName;

		private String styleId;

		private String styleCode;

		private String styleName;

		private String sizeId;

		private String sizeCode;

		private String sizeName;

		private String colorId;

		private String colorCode;

		private String colorName;

		public String getBarcode() {
			return this.barcode;
		}

		public void setBarcode(String barcode) {
			this.barcode = barcode;
		}

		public String getCaseId() {
			return this.caseId;
		}

		public void setCaseId(String caseId) {
			this.caseId = caseId;
		}

		public String getTagValue() {
			return this.tagValue;
		}

		public void setTagValue(String tagValue) {
			this.tagValue = tagValue;
		}

		public String getCaseCode() {
			return this.caseCode;
		}

		public void setCaseCode(String caseCode) {
			this.caseCode = caseCode;
		}

		public String getSKUId() {
			return this.sKUId;
		}

		public void setSKUId(String sKUId) {
			this.sKUId = sKUId;
		}

		public String getSKUName() {
			return this.sKUName;
		}

		public void setSKUName(String sKUName) {
			this.sKUName = sKUName;
		}

		public String getStyleId() {
			return this.styleId;
		}

		public void setStyleId(String styleId) {
			this.styleId = styleId;
		}

		public String getStyleCode() {
			return this.styleCode;
		}

		public void setStyleCode(String styleCode) {
			this.styleCode = styleCode;
		}

		public String getStyleName() {
			return this.styleName;
		}

		public void setStyleName(String styleName) {
			this.styleName = styleName;
		}

		public String getSizeId() {
			return this.sizeId;
		}

		public void setSizeId(String sizeId) {
			this.sizeId = sizeId;
		}

		public String getSizeCode() {
			return this.sizeCode;
		}

		public void setSizeCode(String sizeCode) {
			this.sizeCode = sizeCode;
		}

		public String getSizeName() {
			return this.sizeName;
		}

		public void setSizeName(String sizeName) {
			this.sizeName = sizeName;
		}

		public String getColorId() {
			return this.colorId;
		}

		public void setColorId(String colorId) {
			this.colorId = colorId;
		}

		public String getColorCode() {
			return this.colorCode;
		}

		public void setColorCode(String colorCode) {
			this.colorCode = colorCode;
		}

		public String getColorName() {
			return this.colorName;
		}

		public void setColorName(String colorName) {
			this.colorName = colorName;
		}
	}

	@Override
	public ListOutboundOrderSKUTagsResponse getInstance(UnmarshallerContext context) {
		return	ListOutboundOrderSKUTagsResponseUnmarshaller.unmarshall(this, context);
	}
}
