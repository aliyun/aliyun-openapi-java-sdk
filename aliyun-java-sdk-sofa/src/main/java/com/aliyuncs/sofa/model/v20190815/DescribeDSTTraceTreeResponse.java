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

package com.aliyuncs.sofa.model.v20190815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sofa.transform.v20190815.DescribeDSTTraceTreeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDSTTraceTreeResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private List<TreeItemsItem> treeItems;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public List<TreeItemsItem> getTreeItems() {
		return this.treeItems;
	}

	public void setTreeItems(List<TreeItemsItem> treeItems) {
		this.treeItems = treeItems;
	}

	public static class TreeItemsItem {

		private String app;

		private String basicInfo;

		private Long duration;

		private Boolean hasLog;

		private String ip;

		private String itemId;

		private String itemParentId;

		private String result;

		private String spanId;

		private Long startTime;

		private String type;

		private List<DetailsItem> details;

		public String getApp() {
			return this.app;
		}

		public void setApp(String app) {
			this.app = app;
		}

		public String getBasicInfo() {
			return this.basicInfo;
		}

		public void setBasicInfo(String basicInfo) {
			this.basicInfo = basicInfo;
		}

		public Long getDuration() {
			return this.duration;
		}

		public void setDuration(Long duration) {
			this.duration = duration;
		}

		public Boolean getHasLog() {
			return this.hasLog;
		}

		public void setHasLog(Boolean hasLog) {
			this.hasLog = hasLog;
		}

		public String getIp() {
			return this.ip;
		}

		public void setIp(String ip) {
			this.ip = ip;
		}

		public String getItemId() {
			return this.itemId;
		}

		public void setItemId(String itemId) {
			this.itemId = itemId;
		}

		public String getItemParentId() {
			return this.itemParentId;
		}

		public void setItemParentId(String itemParentId) {
			this.itemParentId = itemParentId;
		}

		public String getResult() {
			return this.result;
		}

		public void setResult(String result) {
			this.result = result;
		}

		public String getSpanId() {
			return this.spanId;
		}

		public void setSpanId(String spanId) {
			this.spanId = spanId;
		}

		public Long getStartTime() {
			return this.startTime;
		}

		public void setStartTime(Long startTime) {
			this.startTime = startTime;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public List<DetailsItem> getDetails() {
			return this.details;
		}

		public void setDetails(List<DetailsItem> details) {
			this.details = details;
		}

		public static class DetailsItem {

			private String key;

			private String value;

			public String getKey() {
				return this.key;
			}

			public void setKey(String key) {
				this.key = key;
			}

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}
		}
	}

	@Override
	public DescribeDSTTraceTreeResponse getInstance(UnmarshallerContext context) {
		return	DescribeDSTTraceTreeResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
