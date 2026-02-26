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

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.xrengine.transform.v20221111.ListClothesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListClothesResponse extends AcsResponse {

	private Integer current;

	private Integer size;

	private Integer total;

	private Integer pages;

	private Boolean success;

	private String code;

	private String message;

	private String errorName;

	private String requestId;

	private Integer httpCode;

	private List<DataItem> data;

	public Integer getCurrent() {
		return this.current;
	}

	public void setCurrent(Integer current) {
		this.current = current;
	}

	public Integer getSize() {
		return this.size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	public Integer getTotal() {
		return this.total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Integer getPages() {
		return this.pages;
	}

	public void setPages(Integer pages) {
		this.pages = pages;
	}

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

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private String ossKey;

		private String type;

		private String name;

		private String coverUrl;

		private String id;

		private String createTime;

		private String modifiedTime;

		private String size;

		private Map<Object,Object> status;

		private String part;

		public String getOssKey() {
			return this.ossKey;
		}

		public void setOssKey(String ossKey) {
			this.ossKey = ossKey;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getCoverUrl() {
			return this.coverUrl;
		}

		public void setCoverUrl(String coverUrl) {
			this.coverUrl = coverUrl;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getModifiedTime() {
			return this.modifiedTime;
		}

		public void setModifiedTime(String modifiedTime) {
			this.modifiedTime = modifiedTime;
		}

		public String getSize() {
			return this.size;
		}

		public void setSize(String size) {
			this.size = size;
		}

		public Map<Object,Object> getStatus() {
			return this.status;
		}

		public void setStatus(Map<Object,Object> status) {
			this.status = status;
		}

		public String getPart() {
			return this.part;
		}

		public void setPart(String part) {
			this.part = part;
		}
	}

	@Override
	public ListClothesResponse getInstance(UnmarshallerContext context) {
		return	ListClothesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
