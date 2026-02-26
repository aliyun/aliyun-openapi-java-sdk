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

package com.aliyuncs.outboundbot.model.v20191226;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.outboundbot.transform.v20191226.GetAnnotationMissionTagInfoListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetAnnotationMissionTagInfoListResponse extends AcsResponse {

	private Boolean success;

	private String code;

	private String message;

	private Integer httpStatusCode;

	private String requestId;

	private Data data;

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
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

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

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

		private Boolean success;

		private String message;

		private List<AnnotationMissionTagInfoListItem> annotationMissionTagInfoList;

		public Boolean getSuccess() {
			return this.success;
		}

		public void setSuccess(Boolean success) {
			this.success = success;
		}

		public String getMessage() {
			return this.message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public List<AnnotationMissionTagInfoListItem> getAnnotationMissionTagInfoList() {
			return this.annotationMissionTagInfoList;
		}

		public void setAnnotationMissionTagInfoList(List<AnnotationMissionTagInfoListItem> annotationMissionTagInfoList) {
			this.annotationMissionTagInfoList = annotationMissionTagInfoList;
		}

		public static class AnnotationMissionTagInfoListItem {

			private String annotationMissionTagInfoId;

			private String instanceId;

			private String tenantId;

			private String annotationMissionTagInfoName;

			private String annotationMissionTagInfoDescription;

			private Boolean delete;

			public String getAnnotationMissionTagInfoId() {
				return this.annotationMissionTagInfoId;
			}

			public void setAnnotationMissionTagInfoId(String annotationMissionTagInfoId) {
				this.annotationMissionTagInfoId = annotationMissionTagInfoId;
			}

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public String getTenantId() {
				return this.tenantId;
			}

			public void setTenantId(String tenantId) {
				this.tenantId = tenantId;
			}

			public String getAnnotationMissionTagInfoName() {
				return this.annotationMissionTagInfoName;
			}

			public void setAnnotationMissionTagInfoName(String annotationMissionTagInfoName) {
				this.annotationMissionTagInfoName = annotationMissionTagInfoName;
			}

			public String getAnnotationMissionTagInfoDescription() {
				return this.annotationMissionTagInfoDescription;
			}

			public void setAnnotationMissionTagInfoDescription(String annotationMissionTagInfoDescription) {
				this.annotationMissionTagInfoDescription = annotationMissionTagInfoDescription;
			}

			public Boolean getDelete() {
				return this.delete;
			}

			public void setDelete(Boolean delete) {
				this.delete = delete;
			}
		}
	}

	@Override
	public GetAnnotationMissionTagInfoListResponse getInstance(UnmarshallerContext context) {
		return	GetAnnotationMissionTagInfoListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
