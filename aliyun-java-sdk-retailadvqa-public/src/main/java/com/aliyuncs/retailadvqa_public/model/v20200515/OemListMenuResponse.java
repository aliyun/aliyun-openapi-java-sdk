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

package com.aliyuncs.retailadvqa_public.model.v20200515;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.retailadvqa_public.transform.v20200515.OemListMenuResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OemListMenuResponse extends AcsResponse {

	private String requestId;

	private String errorDesc;

	private String traceId;

	private String errorCode;

	private Boolean success;

	private List<DataItem> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getErrorDesc() {
		return this.errorDesc;
	}

	public void setErrorDesc(String errorDesc) {
		this.errorDesc = errorDesc;
	}

	public String getTraceId() {
		return this.traceId;
	}

	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private String key;

		private String url;

		private String name;

		private String order;

		private String parentKey;

		private String sourceType;

		private Boolean permission;

		private Boolean purchasePackage;

		private List<Map<Object,Object>> children;

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}

		public String getUrl() {
			return this.url;
		}

		public void setUrl(String url) {
			this.url = url;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getOrder() {
			return this.order;
		}

		public void setOrder(String order) {
			this.order = order;
		}

		public String getParentKey() {
			return this.parentKey;
		}

		public void setParentKey(String parentKey) {
			this.parentKey = parentKey;
		}

		public String getSourceType() {
			return this.sourceType;
		}

		public void setSourceType(String sourceType) {
			this.sourceType = sourceType;
		}

		public Boolean getPermission() {
			return this.permission;
		}

		public void setPermission(Boolean permission) {
			this.permission = permission;
		}

		public Boolean getPurchasePackage() {
			return this.purchasePackage;
		}

		public void setPurchasePackage(Boolean purchasePackage) {
			this.purchasePackage = purchasePackage;
		}

		public List<Map<Object,Object>> getChildren() {
			return this.children;
		}

		public void setChildren(List<Map<Object,Object>> children) {
			this.children = children;
		}
	}

	@Override
	public OemListMenuResponse getInstance(UnmarshallerContext context) {
		return	OemListMenuResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
