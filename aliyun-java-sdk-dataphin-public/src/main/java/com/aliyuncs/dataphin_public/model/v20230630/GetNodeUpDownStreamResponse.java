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

package com.aliyuncs.dataphin_public.model.v20230630;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dataphin_public.transform.v20230630.GetNodeUpDownStreamResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetNodeUpDownStreamResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Integer httpStatusCode;

	private String code;

	private String message;

	private NodeDagInfo nodeDagInfo;

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

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public NodeDagInfo getNodeDagInfo() {
		return this.nodeDagInfo;
	}

	public void setNodeDagInfo(NodeDagInfo nodeDagInfo) {
		this.nodeDagInfo = nodeDagInfo;
	}

	public static class NodeDagInfo {

		private List<NodeInfo> startNodeList;

		private List<NodeInfo> upStreamNodeList;

		private List<NodeInfo> downStreamNodeList;

		public List<NodeInfo> getStartNodeList() {
			return this.startNodeList;
		}

		public void setStartNodeList(List<NodeInfo> startNodeList) {
			this.startNodeList = startNodeList;
		}

		public List<NodeInfo> getUpStreamNodeList() {
			return this.upStreamNodeList;
		}

		public void setUpStreamNodeList(List<NodeInfo> upStreamNodeList) {
			this.upStreamNodeList = upStreamNodeList;
		}

		public List<NodeInfo> getDownStreamNodeList() {
			return this.downStreamNodeList;
		}

		public void setDownStreamNodeList(List<NodeInfo> downStreamNodeList) {
			this.downStreamNodeList = downStreamNodeList;
		}

		public static class NodeInfo {

			private String id;

			private String name;

			private String type;

			private List<String> fieldIdList;

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public List<String> getFieldIdList() {
				return this.fieldIdList;
			}

			public void setFieldIdList(List<String> fieldIdList) {
				this.fieldIdList = fieldIdList;
			}
		}
	}

	@Override
	public GetNodeUpDownStreamResponse getInstance(UnmarshallerContext context) {
		return	GetNodeUpDownStreamResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
