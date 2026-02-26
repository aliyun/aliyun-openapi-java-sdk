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

package com.aliyuncs.xrengine.model.v20221111;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.xrengine.transform.v20221111.QueryAreaMapResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryAreaMapResponse extends AcsResponse {

	private Boolean success;

	private String code;

	private String message;

	private String errorName;

	private String requestId;

	private Integer httpCode;

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

	public String getErrorName() {
		return this.errorName;
	}

	public void setErrorName(String errorName) {
		this.errorName = errorName;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getHttpCode() {
		return this.httpCode;
	}

	public void setHttpCode(Integer httpCode) {
		this.httpCode = httpCode;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Long id;

		private String name;

		private String mapType;

		private String extInfo;

		private String status;

		private String note;

		private String d3Oss;

		private String locationOss;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getMapType() {
			return this.mapType;
		}

		public void setMapType(String mapType) {
			this.mapType = mapType;
		}

		public String getExtInfo() {
			return this.extInfo;
		}

		public void setExtInfo(String extInfo) {
			this.extInfo = extInfo;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getNote() {
			return this.note;
		}

		public void setNote(String note) {
			this.note = note;
		}

		public String getD3Oss() {
			return this.d3Oss;
		}

		public void setD3Oss(String d3Oss) {
			this.d3Oss = d3Oss;
		}

		public String getLocationOss() {
			return this.locationOss;
		}

		public void setLocationOss(String locationOss) {
			this.locationOss = locationOss;
		}
	}

	@Override
	public QueryAreaMapResponse getInstance(UnmarshallerContext context) {
		return	QueryAreaMapResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
