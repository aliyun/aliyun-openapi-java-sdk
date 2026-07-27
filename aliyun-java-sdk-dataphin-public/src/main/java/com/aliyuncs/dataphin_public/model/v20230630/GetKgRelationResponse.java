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
import com.aliyuncs.dataphin_public.transform.v20230630.GetKgRelationResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetKgRelationResponse extends AcsResponse {

	private String requestId;

	private String message;

	private Integer httpStatusCode;

	private String code;

	private Boolean success;

	private RelationInfo relationInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
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

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public RelationInfo getRelationInfo() {
		return this.relationInfo;
	}

	public void setRelationInfo(RelationInfo relationInfo) {
		this.relationInfo = relationInfo;
	}

	public static class RelationInfo {

		private String relationType;

		private String relationId;

		private String targetEntityId;

		private String sourceEntityId;

		private List<Property> propertyList;

		public String getRelationType() {
			return this.relationType;
		}

		public void setRelationType(String relationType) {
			this.relationType = relationType;
		}

		public String getRelationId() {
			return this.relationId;
		}

		public void setRelationId(String relationId) {
			this.relationId = relationId;
		}

		public String getTargetEntityId() {
			return this.targetEntityId;
		}

		public void setTargetEntityId(String targetEntityId) {
			this.targetEntityId = targetEntityId;
		}

		public String getSourceEntityId() {
			return this.sourceEntityId;
		}

		public void setSourceEntityId(String sourceEntityId) {
			this.sourceEntityId = sourceEntityId;
		}

		public List<Property> getPropertyList() {
			return this.propertyList;
		}

		public void setPropertyList(List<Property> propertyList) {
			this.propertyList = propertyList;
		}

		public static class Property {

			private String value;

			private String dataType;

			private String code;

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}

			public String getDataType() {
				return this.dataType;
			}

			public void setDataType(String dataType) {
				this.dataType = dataType;
			}

			public String getCode() {
				return this.code;
			}

			public void setCode(String code) {
				this.code = code;
			}
		}
	}

	@Override
	public GetKgRelationResponse getInstance(UnmarshallerContext context) {
		return	GetKgRelationResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
