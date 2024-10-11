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
import com.aliyuncs.dataphin_public.transform.v20230630.GetInstanceUpDownStreamResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetInstanceUpDownStreamResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Integer httpStatusCode;

	private String code;

	private String message;

	private InstanceDagInfo instanceDagInfo;

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

	public InstanceDagInfo getInstanceDagInfo() {
		return this.instanceDagInfo;
	}

	public void setInstanceDagInfo(InstanceDagInfo instanceDagInfo) {
		this.instanceDagInfo = instanceDagInfo;
	}

	public static class InstanceDagInfo {

		private List<InstanceInfo> startInstanceList;

		private List<InstanceInfo> upInstanceList;

		private List<InstanceInfo> downInstanceList;

		public List<InstanceInfo> getStartInstanceList() {
			return this.startInstanceList;
		}

		public void setStartInstanceList(List<InstanceInfo> startInstanceList) {
			this.startInstanceList = startInstanceList;
		}

		public List<InstanceInfo> getUpInstanceList() {
			return this.upInstanceList;
		}

		public void setUpInstanceList(List<InstanceInfo> upInstanceList) {
			this.upInstanceList = upInstanceList;
		}

		public List<InstanceInfo> getDownInstanceList() {
			return this.downInstanceList;
		}

		public void setDownInstanceList(List<InstanceInfo> downInstanceList) {
			this.downInstanceList = downInstanceList;
		}

		public static class InstanceInfo {

			private String id;

			private String name;

			private String nodeId;

			private String nodeType;

			private List<String> fieldInstanceIdList;

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

			public String getNodeId() {
				return this.nodeId;
			}

			public void setNodeId(String nodeId) {
				this.nodeId = nodeId;
			}

			public String getNodeType() {
				return this.nodeType;
			}

			public void setNodeType(String nodeType) {
				this.nodeType = nodeType;
			}

			public List<String> getFieldInstanceIdList() {
				return this.fieldInstanceIdList;
			}

			public void setFieldInstanceIdList(List<String> fieldInstanceIdList) {
				this.fieldInstanceIdList = fieldInstanceIdList;
			}
		}
	}

	@Override
	public GetInstanceUpDownStreamResponse getInstance(UnmarshallerContext context) {
		return	GetInstanceUpDownStreamResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
