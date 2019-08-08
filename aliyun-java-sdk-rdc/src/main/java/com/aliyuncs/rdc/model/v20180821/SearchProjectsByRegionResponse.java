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

package com.aliyuncs.rdc.model.v20180821;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.rdc.transform.v20180821.SearchProjectsByRegionResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class SearchProjectsByRegionResponse extends AcsResponse {

	private Integer code;

	private Boolean success;

	private String requestId;

	private String message;

	private List<DataItem> data;

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

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

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private String fullName;

		private String name;

		private Integer id;

		private String description;

		private String mode;

		private String type;

		private String stamp;

		private String status;

		private Integer parentId;

		private String idPath;

		private String aoneType;

		private Integer aoneId;

		private List<String> icons;

		private List<String> customFieldMap;

		public String getFullName() {
			return this.fullName;
		}

		public void setFullName(String fullName) {
			this.fullName = fullName;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Integer getId() {
			return this.id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getMode() {
			return this.mode;
		}

		public void setMode(String mode) {
			this.mode = mode;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getStamp() {
			return this.stamp;
		}

		public void setStamp(String stamp) {
			this.stamp = stamp;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Integer getParentId() {
			return this.parentId;
		}

		public void setParentId(Integer parentId) {
			this.parentId = parentId;
		}

		public String getIdPath() {
			return this.idPath;
		}

		public void setIdPath(String idPath) {
			this.idPath = idPath;
		}

		public String getAoneType() {
			return this.aoneType;
		}

		public void setAoneType(String aoneType) {
			this.aoneType = aoneType;
		}

		public Integer getAoneId() {
			return this.aoneId;
		}

		public void setAoneId(Integer aoneId) {
			this.aoneId = aoneId;
		}

		public List<String> getIcons() {
			return this.icons;
		}

		public void setIcons(List<String> icons) {
			this.icons = icons;
		}

		public List<String> getCustomFieldMap() {
			return this.customFieldMap;
		}

		public void setCustomFieldMap(List<String> customFieldMap) {
			this.customFieldMap = customFieldMap;
		}
	}

	@Override
	public SearchProjectsByRegionResponse getInstance(UnmarshallerContext context) {
		return	SearchProjectsByRegionResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
