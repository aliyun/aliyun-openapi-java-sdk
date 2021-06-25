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
import com.aliyuncs.premiumpics.transform.v20200505.ListLogosResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListLogosResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String version;

	private Integer nextPage;

	private Integer pageNumber;

	private String logoVersion;

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

	public String getVersion() {
		return this.version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public Integer getNextPage() {
		return this.nextPage;
	}

	public void setNextPage(Integer nextPage) {
		this.nextPage = nextPage;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public String getLogoVersion() {
		return this.logoVersion;
	}

	public void setLogoVersion(String logoVersion) {
		this.logoVersion = logoVersion;
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
	}

	@Override
	public ListLogosResponse getInstance(UnmarshallerContext context) {
		return	ListLogosResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
