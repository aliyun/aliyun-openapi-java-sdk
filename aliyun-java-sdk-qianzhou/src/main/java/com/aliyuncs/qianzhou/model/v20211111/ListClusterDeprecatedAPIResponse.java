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
import com.aliyuncs.qianzhou.transform.v20211111.ListClusterDeprecatedAPIResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListClusterDeprecatedAPIResponse extends AcsResponse {

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

			private String current_version;

			private String target_version;

			private String request_uri;

			private String user_agent;

			private String label;

			private Integer count;

			private String content;

			public String getCluster_id() {
				return this.cluster_id;
			}

			public void setCluster_id(String cluster_id) {
				this.cluster_id = cluster_id;
			}

			public String getCurrent_version() {
				return this.current_version;
			}

			public void setCurrent_version(String current_version) {
				this.current_version = current_version;
			}

			public String getTarget_version() {
				return this.target_version;
			}

			public void setTarget_version(String target_version) {
				this.target_version = target_version;
			}

			public String getRequest_uri() {
				return this.request_uri;
			}

			public void setRequest_uri(String request_uri) {
				this.request_uri = request_uri;
			}

			public String getUser_agent() {
				return this.user_agent;
			}

			public void setUser_agent(String user_agent) {
				this.user_agent = user_agent;
			}

			public String getLabel() {
				return this.label;
			}

			public void setLabel(String label) {
				this.label = label;
			}

			public Integer getCount() {
				return this.count;
			}

			public void setCount(Integer count) {
				this.count = count;
			}

			public String getContent() {
				return this.content;
			}

			public void setContent(String content) {
				this.content = content;
			}
		}
	}

	@Override
	public ListClusterDeprecatedAPIResponse getInstance(UnmarshallerContext context) {
		return	ListClusterDeprecatedAPIResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
