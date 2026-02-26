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

package com.aliyuncs.premiumpics.model.v20200505;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.premiumpics.transform.v20200505.ChangeLogoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ChangeLogoResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Integer httpStatusCode;

	private List<Goods> data;

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

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public List<Goods> getData() {
		return this.data;
	}

	public void setData(List<Goods> data) {
		this.data = data;
	}

	public static class Goods {

		private String goodsId;

		private String url;

		private Integer collect;

		private Integer tagId;

		private Boolean enableChangeColor;

		private Boolean enableChangeFont;

		private Boolean enableChangeIcon;

		private Boolean enableChangeLayout;

		public String getGoodsId() {
			return this.goodsId;
		}

		public void setGoodsId(String goodsId) {
			this.goodsId = goodsId;
		}

		public String getUrl() {
			return this.url;
		}

		public void setUrl(String url) {
			this.url = url;
		}

		public Integer getCollect() {
			return this.collect;
		}

		public void setCollect(Integer collect) {
			this.collect = collect;
		}

		public Integer getTagId() {
			return this.tagId;
		}

		public void setTagId(Integer tagId) {
			this.tagId = tagId;
		}

		public Boolean getEnableChangeColor() {
			return this.enableChangeColor;
		}

		public void setEnableChangeColor(Boolean enableChangeColor) {
			this.enableChangeColor = enableChangeColor;
		}

		public Boolean getEnableChangeFont() {
			return this.enableChangeFont;
		}

		public void setEnableChangeFont(Boolean enableChangeFont) {
			this.enableChangeFont = enableChangeFont;
		}

		public Boolean getEnableChangeIcon() {
			return this.enableChangeIcon;
		}

		public void setEnableChangeIcon(Boolean enableChangeIcon) {
			this.enableChangeIcon = enableChangeIcon;
		}

		public Boolean getEnableChangeLayout() {
			return this.enableChangeLayout;
		}

		public void setEnableChangeLayout(Boolean enableChangeLayout) {
			this.enableChangeLayout = enableChangeLayout;
		}
	}

	@Override
	public ChangeLogoResponse getInstance(UnmarshallerContext context) {
		return	ChangeLogoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
