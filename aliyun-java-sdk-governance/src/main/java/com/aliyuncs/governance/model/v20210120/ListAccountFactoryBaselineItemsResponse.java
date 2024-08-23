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
import com.aliyuncs.governance.transform.v20210120.ListAccountFactoryBaselineItemsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListAccountFactoryBaselineItemsResponse extends AcsResponse {

	private String nextToken;

	private String requestId;

	private List<BaselineItem> baselineItems;

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<BaselineItem> getBaselineItems() {
		return this.baselineItems;
	}

	public void setBaselineItems(List<BaselineItem> baselineItems) {
		this.baselineItems = baselineItems;
	}

	public static class BaselineItem {

		private String description;

		private String name;

		private String type;

		private String version;

		private List<DependsOnItem> dependsOn;

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getVersion() {
			return this.version;
		}

		public void setVersion(String version) {
			this.version = version;
		}

		public List<DependsOnItem> getDependsOn() {
			return this.dependsOn;
		}

		public void setDependsOn(List<DependsOnItem> dependsOn) {
			this.dependsOn = dependsOn;
		}

		public static class DependsOnItem {

			private String name;

			private String type;

			private String version;

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getVersion() {
				return this.version;
			}

			public void setVersion(String version) {
				this.version = version;
			}
		}
	}

	@Override
	public ListAccountFactoryBaselineItemsResponse getInstance(UnmarshallerContext context) {
		return	ListAccountFactoryBaselineItemsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
