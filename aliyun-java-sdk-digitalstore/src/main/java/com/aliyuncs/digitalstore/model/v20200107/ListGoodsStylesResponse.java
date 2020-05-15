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
import com.aliyuncs.digitalstore.transform.v20200107.ListGoodsStylesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListGoodsStylesResponse extends AcsResponse {

	private Integer pageSize;

	private Integer pageNumber;

	private String requestId;

	private Boolean success;

	private Integer totalCount;

	private List<GoodsStyleModel> goodsStyles;

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

	public List<GoodsStyleModel> getGoodsStyles() {
		return this.goodsStyles;
	}

	public void setGoodsStyles(List<GoodsStyleModel> goodsStyles) {
		this.goodsStyles = goodsStyles;
	}

	public static class GoodsStyleModel {

		private String sizeGroupName;

		private Integer disable;

		private String name;

		private String sizeGroupCode;

		private Float retailPrice;

		private String sizeGroupId;

		private String code;

		private String updateDate;

		private Integer useSkuColor;

		private String description;

		private Float currentPrice;

		private Integer useSkuSize;

		private String createDate;

		private String styleId;

		public String getSizeGroupName() {
			return this.sizeGroupName;
		}

		public void setSizeGroupName(String sizeGroupName) {
			this.sizeGroupName = sizeGroupName;
		}

		public Integer getDisable() {
			return this.disable;
		}

		public void setDisable(Integer disable) {
			this.disable = disable;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getSizeGroupCode() {
			return this.sizeGroupCode;
		}

		public void setSizeGroupCode(String sizeGroupCode) {
			this.sizeGroupCode = sizeGroupCode;
		}

		public Float getRetailPrice() {
			return this.retailPrice;
		}

		public void setRetailPrice(Float retailPrice) {
			this.retailPrice = retailPrice;
		}

		public String getSizeGroupId() {
			return this.sizeGroupId;
		}

		public void setSizeGroupId(String sizeGroupId) {
			this.sizeGroupId = sizeGroupId;
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

		public Integer getUseSkuColor() {
			return this.useSkuColor;
		}

		public void setUseSkuColor(Integer useSkuColor) {
			this.useSkuColor = useSkuColor;
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

		public Integer getUseSkuSize() {
			return this.useSkuSize;
		}

		public void setUseSkuSize(Integer useSkuSize) {
			this.useSkuSize = useSkuSize;
		}

		public String getCreateDate() {
			return this.createDate;
		}

		public void setCreateDate(String createDate) {
			this.createDate = createDate;
		}

		public String getStyleId() {
			return this.styleId;
		}

		public void setStyleId(String styleId) {
			this.styleId = styleId;
		}
	}

	@Override
	public ListGoodsStylesResponse getInstance(UnmarshallerContext context) {
		return	ListGoodsStylesResponseUnmarshaller.unmarshall(this, context);
	}
}
