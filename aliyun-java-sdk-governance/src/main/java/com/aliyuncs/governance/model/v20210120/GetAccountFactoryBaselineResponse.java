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

package com.aliyuncs.governance.model.v20210120;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.governance.transform.v20210120.GetAccountFactoryBaselineResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetAccountFactoryBaselineResponse extends AcsResponse {

	private String baselineId;

	private String baselineName;

	private String createTime;

	private String description;

	private String requestId;

	private String type;

	private String updateTime;

	private List<BaselineItem> baselineItems;

	public String getBaselineId() {
		return this.baselineId;
	}

	public void setBaselineId(String baselineId) {
		this.baselineId = baselineId;
	}

	public String getBaselineName() {
		return this.baselineName;
	}

	public void setBaselineName(String baselineName) {
		this.baselineName = baselineName;
	}

	public String getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	public List<BaselineItem> getBaselineItems() {
		return this.baselineItems;
	}

	public void setBaselineItems(List<BaselineItem> baselineItems) {
		this.baselineItems = baselineItems;
	}

	public static class BaselineItem {

		private String config;

		private String name;

		private String version;

		public String getConfig() {
			return this.config;
		}

		public void setConfig(String config) {
			this.config = config;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getVersion() {
			return this.version;
		}

		public void setVersion(String version) {
			this.version = version;
		}
	}

	@Override
	public GetAccountFactoryBaselineResponse getInstance(UnmarshallerContext context) {
		return	GetAccountFactoryBaselineResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
