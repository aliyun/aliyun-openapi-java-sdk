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

package com.aliyuncs.sas.model.v20181203;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sas.transform.v20181203.ListHoneypotPresetResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListHoneypotPresetResponse extends AcsResponse {

	private Boolean success;

	private String code;

	private String message;

	private String requestId;

	private Integer httpStatusCode;

	private List<ListItem> list;

	private PageInfo pageInfo;

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

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public List<ListItem> getList() {
		return this.list;
	}

	public void setList(List<ListItem> list) {
		this.list = list;
	}

	public PageInfo getPageInfo() {
		return this.pageInfo;
	}

	public void setPageInfo(PageInfo pageInfo) {
		this.pageInfo = pageInfo;
	}

	public static class ListItem {

		private String honeypotImageName;

		private String presetName;

		private String honeypotPresetId;

		private String nodeId;

		private String controlNodeName;

		private String honeypotImageDisplayName;

		private String presetType;

		public String getHoneypotImageName() {
			return this.honeypotImageName;
		}

		public void setHoneypotImageName(String honeypotImageName) {
			this.honeypotImageName = honeypotImageName;
		}

		public String getPresetName() {
			return this.presetName;
		}

		public void setPresetName(String presetName) {
			this.presetName = presetName;
		}

		public String getHoneypotPresetId() {
			return this.honeypotPresetId;
		}

		public void setHoneypotPresetId(String honeypotPresetId) {
			this.honeypotPresetId = honeypotPresetId;
		}

		public String getNodeId() {
			return this.nodeId;
		}

		public void setNodeId(String nodeId) {
			this.nodeId = nodeId;
		}

		public String getControlNodeName() {
			return this.controlNodeName;
		}

		public void setControlNodeName(String controlNodeName) {
			this.controlNodeName = controlNodeName;
		}

		public String getHoneypotImageDisplayName() {
			return this.honeypotImageDisplayName;
		}

		public void setHoneypotImageDisplayName(String honeypotImageDisplayName) {
			this.honeypotImageDisplayName = honeypotImageDisplayName;
		}

		public String getPresetType() {
			return this.presetType;
		}

		public void setPresetType(String presetType) {
			this.presetType = presetType;
		}
	}

	public static class PageInfo {

		private Integer currentPage;

		private Integer pageSize;

		private Integer totalCount;

		private Integer count;

		public Integer getCurrentPage() {
			return this.currentPage;
		}

		public void setCurrentPage(Integer currentPage) {
			this.currentPage = currentPage;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public Integer getCount() {
			return this.count;
		}

		public void setCount(Integer count) {
			this.count = count;
		}
	}

	@Override
	public ListHoneypotPresetResponse getInstance(UnmarshallerContext context) {
		return	ListHoneypotPresetResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
