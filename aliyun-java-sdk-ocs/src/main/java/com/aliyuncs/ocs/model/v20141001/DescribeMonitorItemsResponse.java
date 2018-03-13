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
package com.aliyuncs.ocs.model.v20141001;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ocs.transform.v20141001.DescribeMonitorItemsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeMonitorItemsResponse extends AcsResponse {

	private String requestId;

	private List<OcsMonitorItem> monitorItems;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<OcsMonitorItem> getMonitorItems() {
		return this.monitorItems;
	}

	public void setMonitorItems(List<OcsMonitorItem> monitorItems) {
		this.monitorItems = monitorItems;
	}

	public static class OcsMonitorItem {

		private String monitorKey;

		private String unit;

		public String getMonitorKey() {
			return this.monitorKey;
		}

		public void setMonitorKey(String monitorKey) {
			this.monitorKey = monitorKey;
		}

		public String getUnit() {
			return this.unit;
		}

		public void setUnit(String unit) {
			this.unit = unit;
		}
	}

	@Override
	public DescribeMonitorItemsResponse getInstance(UnmarshallerContext context) {
		return	DescribeMonitorItemsResponseUnmarshaller.unmarshall(this, context);
	}
}
