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
import com.aliyuncs.dataphin_public.transform.v20230630.GetInstanceDownStreamResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetInstanceDownStreamResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Integer httpStatusCode;

	private String code;

	private String message;

	private List<InstanceRelation> instanceRelationList;

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

	public List<InstanceRelation> getInstanceRelationList() {
		return this.instanceRelationList;
	}

	public void setInstanceRelationList(List<InstanceRelation> instanceRelationList) {
		this.instanceRelationList = instanceRelationList;
	}

	public static class InstanceRelation {

		private String selectStatus;

		private String selectStatusCause;

		private String runStatus;

		private Integer downStreamDepth;

		private String extendInfo;

		private List<FieldInstance> fieldInstanceList;

		private InstanceInfo instanceInfo;

		public String getSelectStatus() {
			return this.selectStatus;
		}

		public void setSelectStatus(String selectStatus) {
			this.selectStatus = selectStatus;
		}

		public String getSelectStatusCause() {
			return this.selectStatusCause;
		}

		public void setSelectStatusCause(String selectStatusCause) {
			this.selectStatusCause = selectStatusCause;
		}

		public String getRunStatus() {
			return this.runStatus;
		}

		public void setRunStatus(String runStatus) {
			this.runStatus = runStatus;
		}

		public Integer getDownStreamDepth() {
			return this.downStreamDepth;
		}

		public void setDownStreamDepth(Integer downStreamDepth) {
			this.downStreamDepth = downStreamDepth;
		}

		public String getExtendInfo() {
			return this.extendInfo;
		}

		public void setExtendInfo(String extendInfo) {
			this.extendInfo = extendInfo;
		}

		public List<FieldInstance> getFieldInstanceList() {
			return this.fieldInstanceList;
		}

		public void setFieldInstanceList(List<FieldInstance> fieldInstanceList) {
			this.fieldInstanceList = fieldInstanceList;
		}

		public InstanceInfo getInstanceInfo() {
			return this.instanceInfo;
		}

		public void setInstanceInfo(InstanceInfo instanceInfo) {
			this.instanceInfo = instanceInfo;
		}

		public static class FieldInstance {

			private String selectStatus;

			private String fieldInstanceId;

			private String runStatus;

			public String getSelectStatus() {
				return this.selectStatus;
			}

			public void setSelectStatus(String selectStatus) {
				this.selectStatus = selectStatus;
			}

			public String getFieldInstanceId() {
				return this.fieldInstanceId;
			}

			public void setFieldInstanceId(String fieldInstanceId) {
				this.fieldInstanceId = fieldInstanceId;
			}

			public String getRunStatus() {
				return this.runStatus;
			}

			public void setRunStatus(String runStatus) {
				this.runStatus = runStatus;
			}
		}

		public static class InstanceInfo {

			private String id;

			private String name;

			private String type;

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
		}
	}

	@Override
	public GetInstanceDownStreamResponse getInstance(UnmarshallerContext context) {
		return	GetInstanceDownStreamResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
