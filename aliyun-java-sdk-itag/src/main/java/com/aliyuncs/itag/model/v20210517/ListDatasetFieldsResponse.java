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

package com.aliyuncs.itag.model.v20210517;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.itag.transform.v20210517.ListDatasetFieldsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListDatasetFieldsResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String errInfo;

	private String msg;

	private Boolean succ;

	private String errorCode;

	private List<ITagDatasetField> result;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getErrInfo() {
		return this.errInfo;
	}

	public void setErrInfo(String errInfo) {
		this.errInfo = errInfo;
	}

	public String getMsg() {
		return this.msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Boolean getSucc() {
		return this.succ;
	}

	public void setSucc(Boolean succ) {
		this.succ = succ;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public List<ITagDatasetField> getResult() {
		return this.result;
	}

	public void setResult(List<ITagDatasetField> result) {
		this.result = result;
	}

	public static class ITagDatasetField {

		private String fieldName;

		private String type;

		private Boolean sensitive;

		private String classify;

		private Map<Object,Object> exif;

		private Boolean sortKey;

		private String fieldDesc;

		private String fieldClassify;

		private Map<Object,Object> alias;

		private String fieldType;

		public String getFieldName() {
			return this.fieldName;
		}

		public void setFieldName(String fieldName) {
			this.fieldName = fieldName;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public Boolean getSensitive() {
			return this.sensitive;
		}

		public void setSensitive(Boolean sensitive) {
			this.sensitive = sensitive;
		}

		public String getClassify() {
			return this.classify;
		}

		public void setClassify(String classify) {
			this.classify = classify;
		}

		public Map<Object,Object> getExif() {
			return this.exif;
		}

		public void setExif(Map<Object,Object> exif) {
			this.exif = exif;
		}

		public Boolean getSortKey() {
			return this.sortKey;
		}

		public void setSortKey(Boolean sortKey) {
			this.sortKey = sortKey;
		}

		public String getFieldDesc() {
			return this.fieldDesc;
		}

		public void setFieldDesc(String fieldDesc) {
			this.fieldDesc = fieldDesc;
		}

		public String getFieldClassify() {
			return this.fieldClassify;
		}

		public void setFieldClassify(String fieldClassify) {
			this.fieldClassify = fieldClassify;
		}

		public Map<Object,Object> getAlias() {
			return this.alias;
		}

		public void setAlias(Map<Object,Object> alias) {
			this.alias = alias;
		}

		public String getFieldType() {
			return this.fieldType;
		}

		public void setFieldType(String fieldType) {
			this.fieldType = fieldType;
		}
	}

	@Override
	public ListDatasetFieldsResponse getInstance(UnmarshallerContext context) {
		return	ListDatasetFieldsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
