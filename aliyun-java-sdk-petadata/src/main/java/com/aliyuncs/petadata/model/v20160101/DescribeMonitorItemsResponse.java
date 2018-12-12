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

package com.aliyuncs.petadata.model.v20160101;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.petadata.transform.v20160101.DescribeMonitorItemsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeMonitorItemsResponse extends AcsResponse {

	private String requestId;

	private List<MonitorItem> monitorItems;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<MonitorItem> getMonitorItems() {
		return this.monitorItems;
	}

	public void setMonitorItems(List<MonitorItem> monitorItems) {
		this.monitorItems = monitorItems;
	}

	public static class MonitorItem {

		private String displayName;

		private String key;

		private String unit;

		private String groupName;

		private String desc;

		private List<MonitorItemModel> groupValue;

		public String getDisplayName() {
			return this.displayName;
		}

		public void setDisplayName(String displayName) {
			this.displayName = displayName;
		}

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}

		public String getUnit() {
			return this.unit;
		}

		public void setUnit(String unit) {
			this.unit = unit;
		}

		public String getGroupName() {
			return this.groupName;
		}

		public void setGroupName(String groupName) {
			this.groupName = groupName;
		}

		public String getDesc() {
			return this.desc;
		}

		public void setDesc(String desc) {
			this.desc = desc;
		}

		public List<MonitorItemModel> getGroupValue() {
			return this.groupValue;
		}

		public void setGroupValue(List<MonitorItemModel> groupValue) {
			this.groupValue = groupValue;
		}

		public static class MonitorItemModel {

			private String displayName;

			private String key;

			private String unit;

			public String getDisplayName() {
				return this.displayName;
			}

			public void setDisplayName(String displayName) {
				this.displayName = displayName;
			}

			public String getKey() {
				return this.key;
			}

			public void setKey(String key) {
				this.key = key;
			}

			public String getUnit() {
				return this.unit;
			}

			public void setUnit(String unit) {
				this.unit = unit;
			}
		}
	}

	@Override
	public DescribeMonitorItemsResponse getInstance(UnmarshallerContext context) {
		return	DescribeMonitorItemsResponseUnmarshaller.unmarshall(this, context);
	}
}
