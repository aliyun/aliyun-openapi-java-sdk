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

package com.aliyuncs.mindlive_biz.model.v20210214;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.mindlive_biz.transform.v20210214.QueryVirtualItemResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryVirtualItemResponse extends AcsResponse {

	private String errorMessage;

	private String requestId;

	private Boolean success;

	private String errorCode;

	private List<NoviceGuideModeItemDTO> data;

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
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

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public List<NoviceGuideModeItemDTO> getData() {
		return this.data;
	}

	public void setData(List<NoviceGuideModeItemDTO> data) {
		this.data = data;
	}

	public static class NoviceGuideModeItemDTO {

		private Integer goodsIndex;

		private LiveItem liveItem;

		public Integer getGoodsIndex() {
			return this.goodsIndex;
		}

		public void setGoodsIndex(Integer goodsIndex) {
			this.goodsIndex = goodsIndex;
		}

		public LiveItem getLiveItem() {
			return this.liveItem;
		}

		public void setLiveItem(LiveItem liveItem) {
			this.liveItem = liveItem;
		}

		public static class LiveItem {

			private String itemPic;

			private Long itemId;

			private String itemName;

			private String itemPrice;

			private ExtendVal extendVal;

			public String getItemPic() {
				return this.itemPic;
			}

			public void setItemPic(String itemPic) {
				this.itemPic = itemPic;
			}

			public Long getItemId() {
				return this.itemId;
			}

			public void setItemId(Long itemId) {
				this.itemId = itemId;
			}

			public String getItemName() {
				return this.itemName;
			}

			public void setItemName(String itemName) {
				this.itemName = itemName;
			}

			public String getItemPrice() {
				return this.itemPrice;
			}

			public void setItemPrice(String itemPrice) {
				this.itemPrice = itemPrice;
			}

			public ExtendVal getExtendVal() {
				return this.extendVal;
			}

			public void setExtendVal(ExtendVal extendVal) {
				this.extendVal = extendVal;
			}

			public static class ExtendVal {

				private List<Map<Object,Object>> atmosphere;

				public List<Map<Object,Object>> getAtmosphere() {
					return this.atmosphere;
				}

				public void setAtmosphere(List<Map<Object,Object>> atmosphere) {
					this.atmosphere = atmosphere;
				}
			}
		}
	}

	@Override
	public QueryVirtualItemResponse getInstance(UnmarshallerContext context) {
		return	QueryVirtualItemResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
