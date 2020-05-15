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
import com.aliyuncs.cloudesl.transform.v20200201.DescribePlanogramPositionsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribePlanogramPositionsResponse extends AcsResponse {

	private String code;

	private String dynamicCode;

	private String dynamicMessage;

	private String errorCode;

	private String errorMessage;

	private String message;

	private String requestId;

	private String shelf;

	private String storeId;

	private Boolean success;

	private List<LayerInfo> layerInfos;

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

	public String getShelf() {
		return this.shelf;
	}

	public void setShelf(String shelf) {
		this.shelf = shelf;
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

	public List<LayerInfo> getLayerInfos() {
		return this.layerInfos;
	}

	public void setLayerInfos(List<LayerInfo> layerInfos) {
		this.layerInfos = layerInfos;
	}

	public static class LayerInfo {

		private Integer layer;

		private String layerOrigin;

		private List<ShelfPositionInfo> shelfPositionInfos;

		public Integer getLayer() {
			return this.layer;
		}

		public void setLayer(Integer layer) {
			this.layer = layer;
		}

		public String getLayerOrigin() {
			return this.layerOrigin;
		}

		public void setLayerOrigin(String layerOrigin) {
			this.layerOrigin = layerOrigin;
		}

		public List<ShelfPositionInfo> getShelfPositionInfos() {
			return this.shelfPositionInfos;
		}

		public void setShelfPositionInfos(List<ShelfPositionInfo> shelfPositionInfos) {
			this.shelfPositionInfos = shelfPositionInfos;
		}

		public static class ShelfPositionInfo {

			private String column;

			private Float depth;

			private Integer facing;

			private String itemBarCode;

			private String itemTitle;

			private Float offsetFrom;

			private Float offsetTo;

			public String getColumn() {
				return this.column;
			}

			public void setColumn(String column) {
				this.column = column;
			}

			public Float getDepth() {
				return this.depth;
			}

			public void setDepth(Float depth) {
				this.depth = depth;
			}

			public Integer getFacing() {
				return this.facing;
			}

			public void setFacing(Integer facing) {
				this.facing = facing;
			}

			public String getItemBarCode() {
				return this.itemBarCode;
			}

			public void setItemBarCode(String itemBarCode) {
				this.itemBarCode = itemBarCode;
			}

			public String getItemTitle() {
				return this.itemTitle;
			}

			public void setItemTitle(String itemTitle) {
				this.itemTitle = itemTitle;
			}

			public Float getOffsetFrom() {
				return this.offsetFrom;
			}

			public void setOffsetFrom(Float offsetFrom) {
				this.offsetFrom = offsetFrom;
			}

			public Float getOffsetTo() {
				return this.offsetTo;
			}

			public void setOffsetTo(Float offsetTo) {
				this.offsetTo = offsetTo;
			}
		}
	}

	@Override
	public DescribePlanogramPositionsResponse getInstance(UnmarshallerContext context) {
		return	DescribePlanogramPositionsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
