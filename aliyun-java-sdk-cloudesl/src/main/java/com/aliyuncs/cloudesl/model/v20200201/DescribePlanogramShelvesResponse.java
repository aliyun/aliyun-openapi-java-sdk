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

package com.aliyuncs.cloudesl.model.v20200201;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudesl.transform.v20200201.DescribePlanogramShelvesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribePlanogramShelvesResponse extends AcsResponse {

	private String code;

	private String dynamicCode;

	private String dynamicMessage;

	private String errorCode;

	private String errorMessage;

	private String message;

	private String requestId;

	private String storeId;

	private Boolean success;

	private Integer pageNumber;

	private Integer pageSize;

	private Integer totalCount;

	private List<ShelfInfo> shelfInfos;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDynamicCode() {
		return this.dynamicCode;
	}

	public void setDynamicCode(String dynamicCode) {
		this.dynamicCode = dynamicCode;
	}

	public String getDynamicMessage() {
		return this.dynamicMessage;
	}

	public void setDynamicMessage(String dynamicMessage) {
		this.dynamicMessage = dynamicMessage;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getStoreId() {
		return this.storeId;
	}

	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

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

	public List<ShelfInfo> getShelfInfos() {
		return this.shelfInfos;
	}

	public void setShelfInfos(List<ShelfInfo> shelfInfos) {
		this.shelfInfos = shelfInfos;
	}

	public static class ShelfInfo {

		private String shelf;

		private Boolean beMatch;

		private String zone;

		private String category;

		private String shelfType;

		private List<LayerInfo> layerInfos;

		public String getShelf() {
			return this.shelf;
		}

		public void setShelf(String shelf) {
			this.shelf = shelf;
		}

		public Boolean getBeMatch() {
			return this.beMatch;
		}

		public void setBeMatch(Boolean beMatch) {
			this.beMatch = beMatch;
		}

		public String getZone() {
			return this.zone;
		}

		public void setZone(String zone) {
			this.zone = zone;
		}

		public String getCategory() {
			return this.category;
		}

		public void setCategory(String category) {
			this.category = category;
		}

		public String getShelfType() {
			return this.shelfType;
		}

		public void setShelfType(String shelfType) {
			this.shelfType = shelfType;
		}

		public List<LayerInfo> getLayerInfos() {
			return this.layerInfos;
		}

		public void setLayerInfos(List<LayerInfo> layerInfos) {
			this.layerInfos = layerInfos;
		}

		public static class LayerInfo {

			private Integer layer;

			public Integer getLayer() {
				return this.layer;
			}

			public void setLayer(Integer layer) {
				this.layer = layer;
			}
		}
	}

	@Override
	public DescribePlanogramShelvesResponse getInstance(UnmarshallerContext context) {
		return	DescribePlanogramShelvesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
