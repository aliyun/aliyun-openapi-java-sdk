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
import com.aliyuncs.sas.transform.v20181203.ListHoneypotResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListHoneypotResponse extends AcsResponse {

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

		private String honeypotId;

		private String honeypotName;

		private String controlNodeName;

		private String honeypotImageName;

		private String presetId;

		private String honeypotImageDisplayName;

		private String nodeId;

		private List<String> state;

		public String getHoneypotId() {
			return this.honeypotId;
		}

		public void setHoneypotId(String honeypotId) {
			this.honeypotId = honeypotId;
		}

		public String getHoneypotName() {
			return this.honeypotName;
		}

		public void setHoneypotName(String honeypotName) {
			this.honeypotName = honeypotName;
		}

		public String getControlNodeName() {
			return this.controlNodeName;
		}

		public void setControlNodeName(String controlNodeName) {
			this.controlNodeName = controlNodeName;
		}

		public String getHoneypotImageName() {
			return this.honeypotImageName;
		}

		public void setHoneypotImageName(String honeypotImageName) {
			this.honeypotImageName = honeypotImageName;
		}

		public String getPresetId() {
			return this.presetId;
		}

		public void setPresetId(String presetId) {
			this.presetId = presetId;
		}

		public String getHoneypotImageDisplayName() {
			return this.honeypotImageDisplayName;
		}

		public void setHoneypotImageDisplayName(String honeypotImageDisplayName) {
			this.honeypotImageDisplayName = honeypotImageDisplayName;
		}

		public String getNodeId() {
			return this.nodeId;
		}

		public void setNodeId(String nodeId) {
			this.nodeId = nodeId;
		}

		public List<String> getState() {
			return this.state;
		}

		public void setState(List<String> state) {
			this.state = state;
		}
	}

	public static class PageInfo {

		private Integer currentPage;

		private Integer pageSize;

		private Integer totalCount;

		private Integer count;

		private String lastRowKey;

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

		public String getLastRowKey() {
			return this.lastRowKey;
		}

		public void setLastRowKey(String lastRowKey) {
			this.lastRowKey = lastRowKey;
		}
	}

	@Override
	public ListHoneypotResponse getInstance(UnmarshallerContext context) {
		return	ListHoneypotResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
