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

package com.aliyuncs.waf_openapi.model.v20180117;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.waf_openapi.transform.v20180117.DescribeProtectionModuleRulesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeProtectionModuleRulesResponse extends AcsResponse {

	private String requestId;

	private Integer taskStatus;

	private Integer total;

	private List<ModuleRulesItem> moduleRules;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTaskStatus() {
		return this.taskStatus;
	}

	public void setTaskStatus(Integer taskStatus) {
		this.taskStatus = taskStatus;
	}

	public Integer getTotal() {
		return this.total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public List<ModuleRulesItem> getModuleRules() {
		return this.moduleRules;
	}

	public void setModuleRules(List<ModuleRulesItem> moduleRules) {
		this.moduleRules = moduleRules;
	}

	public static class ModuleRulesItem {

		private Long id;

		private Long version;

		private String content;

		private Long time;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Long getVersion() {
			return this.version;
		}

		public void setVersion(Long version) {
			this.version = version;
		}

		public String getContent() {
			return this.content;
		}

		public void setContent(String content) {
			this.content = content;
		}

		public Long getTime() {
			return this.time;
		}

		public void setTime(Long time) {
			this.time = time;
		}
	}

	@Override
	public DescribeProtectionModuleRulesResponse getInstance(UnmarshallerContext context) {
		return	DescribeProtectionModuleRulesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
