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

package com.aliyuncs.ecs_workbench.model.v20220220;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecs_workbench.transform.v20220220.ListTerminalCommandsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListTerminalCommandsResponse extends AcsResponse {

	private Integer totalCount;

	private Integer pageSize;

	private Integer pageNumber;

	private String requestId;

	private List<TerminalCommandListItem> terminalCommandList;

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<TerminalCommandListItem> getTerminalCommandList() {
		return this.terminalCommandList;
	}

	public void setTerminalCommandList(List<TerminalCommandListItem> terminalCommandList) {
		this.terminalCommandList = terminalCommandList;
	}

	public static class TerminalCommandListItem {

		private String createTime;

		private String commandLine;

		private String loginUser;

		private String executePath;

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getCommandLine() {
			return this.commandLine;
		}

		public void setCommandLine(String commandLine) {
			this.commandLine = commandLine;
		}

		public String getLoginUser() {
			return this.loginUser;
		}

		public void setLoginUser(String loginUser) {
			this.loginUser = loginUser;
		}

		public String getExecutePath() {
			return this.executePath;
		}

		public void setExecutePath(String executePath) {
			this.executePath = executePath;
		}
	}

	@Override
	public ListTerminalCommandsResponse getInstance(UnmarshallerContext context) {
		return	ListTerminalCommandsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
