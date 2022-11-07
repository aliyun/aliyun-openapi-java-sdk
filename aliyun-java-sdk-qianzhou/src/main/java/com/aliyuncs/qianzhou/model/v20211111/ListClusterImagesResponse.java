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

package com.aliyuncs.qianzhou.model.v20211111;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.qianzhou.transform.v20211111.ListClusterImagesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListClusterImagesResponse extends AcsResponse {

	private String requestId;

	private Integer code;

	private String msg;

	private Datas datas;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMsg() {
		return this.msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Datas getDatas() {
		return this.datas;
	}

	public void setDatas(Datas datas) {
		this.datas = datas;
	}

	public static class Datas {

		private Integer total;

		private Integer pageSize;

		private Integer current;

		private List<DataItem> data;

		public Integer getTotal() {
			return this.total;
		}

		public void setTotal(Integer total) {
			this.total = total;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public Integer getCurrent() {
			return this.current;
		}

		public void setCurrent(Integer current) {
			this.current = current;
		}

		public List<DataItem> getData() {
			return this.data;
		}

		public void setData(List<DataItem> data) {
			this.data = data;
		}

		public static class DataItem {

			private String cluster_id;

			private String namespace;

			private String image_name;

			private String image_hash;

			private String controller_type;

			private String controller_name;

			private String created;

			private String updated;

			public String getCluster_id() {
				return this.cluster_id;
			}

			public void setCluster_id(String cluster_id) {
				this.cluster_id = cluster_id;
			}

			public String getNamespace() {
				return this.namespace;
			}

			public void setNamespace(String namespace) {
				this.namespace = namespace;
			}

			public String getImage_name() {
				return this.image_name;
			}

			public void setImage_name(String image_name) {
				this.image_name = image_name;
			}

			public String getImage_hash() {
				return this.image_hash;
			}

			public void setImage_hash(String image_hash) {
				this.image_hash = image_hash;
			}

			public String getController_type() {
				return this.controller_type;
			}

			public void setController_type(String controller_type) {
				this.controller_type = controller_type;
			}

			public String getController_name() {
				return this.controller_name;
			}

			public void setController_name(String controller_name) {
				this.controller_name = controller_name;
			}

			public String getCreated() {
				return this.created;
			}

			public void setCreated(String created) {
				this.created = created;
			}

			public String getUpdated() {
				return this.updated;
			}

			public void setUpdated(String updated) {
				this.updated = updated;
			}
		}
	}

	@Override
	public ListClusterImagesResponse getInstance(UnmarshallerContext context) {
		return	ListClusterImagesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
