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
import com.aliyuncs.digitalstore.transform.v20200107.ListBarcodesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListBarcodesResponse extends AcsResponse {

	private Integer pageSize;

	private Integer pageNumber;

	private String requestId;

	private Boolean success;

	private Integer totalCount;

	private List<BarcodeModel> barcodes;

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

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<BarcodeModel> getBarcodes() {
		return this.barcodes;
	}

	public void setBarcodes(List<BarcodeModel> barcodes) {
		this.barcodes = barcodes;
	}

	public static class BarcodeModel {

		private Integer disable;

		private String styleId;

		private String sizeName;

		private Float retailPrice;

		private String sizeCode;

		private String colorCode;

		private String name;

		private String colorId;

		private String code;

		private String updateDate;

		private String sizeId;

		private String colorName;

		private String createDate;

		private String styleCode;

		private String styleName;

		private String description;

		private Float currentPrice;

		private String barcodeId;

		public Integer getDisable() {
			return this.disable;
		}

		public void setDisable(Integer disable) {
			this.disable = disable;
		}

		public String getStyleId() {
			return this.styleId;
		}

		public void setStyleId(String styleId) {
			this.styleId = styleId;
		}

		public String getSizeName() {
			return this.sizeName;
		}

		public void setSizeName(String sizeName) {
			this.sizeName = sizeName;
		}

		public Float getRetailPrice() {
			return this.retailPrice;
		}

		public void setRetailPrice(Float retailPrice) {
			this.retailPrice = retailPrice;
		}

		public String getSizeCode() {
			return this.sizeCode;
		}

		public void setSizeCode(String sizeCode) {
			this.sizeCode = sizeCode;
		}

		public String getColorCode() {
			return this.colorCode;
		}

		public void setColorCode(String colorCode) {
			this.colorCode = colorCode;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getColorId() {
			return this.colorId;
		}

		public void setColorId(String colorId) {
			this.colorId = colorId;
		}

		public String getCode() {
			return this.code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getUpdateDate() {
			return this.updateDate;
		}

		public void setUpdateDate(String updateDate) {
			this.updateDate = updateDate;
		}

		public String getSizeId() {
			return this.sizeId;
		}

		public void setSizeId(String sizeId) {
			this.sizeId = sizeId;
		}

		public String getColorName() {
			return this.colorName;
		}

		public void setColorName(String colorName) {
			this.colorName = colorName;
		}

		public String getCreateDate() {
			return this.createDate;
		}

		public void setCreateDate(String createDate) {
			this.createDate = createDate;
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

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Float getCurrentPrice() {
			return this.currentPrice;
		}

		public void setCurrentPrice(Float currentPrice) {
			this.currentPrice = currentPrice;
		}

		public String getBarcodeId() {
			return this.barcodeId;
		}

		public void setBarcodeId(String barcodeId) {
			this.barcodeId = barcodeId;
		}
	}

	@Override
	public ListBarcodesResponse getInstance(UnmarshallerContext context) {
		return	ListBarcodesResponseUnmarshaller.unmarshall(this, context);
	}
}
