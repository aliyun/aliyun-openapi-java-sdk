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

package com.aliyuncs.arms.model.v20190808;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.arms.transform.v20190808.ListCmsInstancesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListCmsInstancesResponse extends AcsResponse {

	private String requestId;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Boolean enableTag;

		private List<ProductsItem> products;

		public Boolean getEnableTag() {
			return this.enableTag;
		}

		public void setEnableTag(Boolean enableTag) {
			this.enableTag = enableTag;
		}

		public List<ProductsItem> getProducts() {
			return this.products;
		}

		public void setProducts(List<ProductsItem> products) {
			this.products = products;
		}

		public static class ProductsItem {

			private String descr;

			private String instance;

			private String prod;

			private String name;

			private String id;

			private String state;

			private String time;

			private String type;

			private String url;

			private String source;

			public String getDescr() {
				return this.descr;
			}

			public void setDescr(String descr) {
				this.descr = descr;
			}

			public String getInstance() {
				return this.instance;
			}

			public void setInstance(String instance) {
				this.instance = instance;
			}

			public String getProd() {
				return this.prod;
			}

			public void setProd(String prod) {
				this.prod = prod;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public String getState() {
				return this.state;
			}

			public void setState(String state) {
				this.state = state;
			}

			public String getTime() {
				return this.time;
			}

			public void setTime(String time) {
				this.time = time;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getUrl() {
				return this.url;
			}

			public void setUrl(String url) {
				this.url = url;
			}

			public String getSource() {
				return this.source;
			}

			public void setSource(String source) {
				this.source = source;
			}
		}
	}

	@Override
	public ListCmsInstancesResponse getInstance(UnmarshallerContext context) {
		return	ListCmsInstancesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
