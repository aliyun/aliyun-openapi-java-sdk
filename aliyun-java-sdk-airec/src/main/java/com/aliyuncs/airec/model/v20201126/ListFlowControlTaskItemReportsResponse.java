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

package com.aliyuncs.airec.model.v20201126;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.airec.transform.v20201126.ListFlowControlTaskItemReportsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListFlowControlTaskItemReportsResponse extends AcsResponse {

	private String requestId;

	private Result result;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private List<DetailItem> detail;

		public List<DetailItem> getDetail() {
			return this.detail;
		}

		public void setDetail(List<DetailItem> detail) {
			this.detail = detail;
		}

		public static class DetailItem {

			private String taskId;

			private String itemId;

			private String itemType;

			private String taskRank;

			private String itemPv;

			private String taskPv;

			private String pvPercent;

			private String itemClick;

			private String taskClick;

			private String clickPercent;

			private String itemCtr;

			private String taskCtr;

			private String accTaskRank;

			private String accItemPv;

			private String accTaskPv;

			private String accPvPercent;

			private String accItemClick;

			private String accTaskClick;

			private String accClickPercent;

			private String accItemCtr;

			private String accTaskCtr;

			public String getTaskId() {
				return this.taskId;
			}

			public void setTaskId(String taskId) {
				this.taskId = taskId;
			}

			public String getItemId() {
				return this.itemId;
			}

			public void setItemId(String itemId) {
				this.itemId = itemId;
			}

			public String getItemType() {
				return this.itemType;
			}

			public void setItemType(String itemType) {
				this.itemType = itemType;
			}

			public String getTaskRank() {
				return this.taskRank;
			}

			public void setTaskRank(String taskRank) {
				this.taskRank = taskRank;
			}

			public String getItemPv() {
				return this.itemPv;
			}

			public void setItemPv(String itemPv) {
				this.itemPv = itemPv;
			}

			public String getTaskPv() {
				return this.taskPv;
			}

			public void setTaskPv(String taskPv) {
				this.taskPv = taskPv;
			}

			public String getPvPercent() {
				return this.pvPercent;
			}

			public void setPvPercent(String pvPercent) {
				this.pvPercent = pvPercent;
			}

			public String getItemClick() {
				return this.itemClick;
			}

			public void setItemClick(String itemClick) {
				this.itemClick = itemClick;
			}

			public String getTaskClick() {
				return this.taskClick;
			}

			public void setTaskClick(String taskClick) {
				this.taskClick = taskClick;
			}

			public String getClickPercent() {
				return this.clickPercent;
			}

			public void setClickPercent(String clickPercent) {
				this.clickPercent = clickPercent;
			}

			public String getItemCtr() {
				return this.itemCtr;
			}

			public void setItemCtr(String itemCtr) {
				this.itemCtr = itemCtr;
			}

			public String getTaskCtr() {
				return this.taskCtr;
			}

			public void setTaskCtr(String taskCtr) {
				this.taskCtr = taskCtr;
			}

			public String getAccTaskRank() {
				return this.accTaskRank;
			}

			public void setAccTaskRank(String accTaskRank) {
				this.accTaskRank = accTaskRank;
			}

			public String getAccItemPv() {
				return this.accItemPv;
			}

			public void setAccItemPv(String accItemPv) {
				this.accItemPv = accItemPv;
			}

			public String getAccTaskPv() {
				return this.accTaskPv;
			}

			public void setAccTaskPv(String accTaskPv) {
				this.accTaskPv = accTaskPv;
			}

			public String getAccPvPercent() {
				return this.accPvPercent;
			}

			public void setAccPvPercent(String accPvPercent) {
				this.accPvPercent = accPvPercent;
			}

			public String getAccItemClick() {
				return this.accItemClick;
			}

			public void setAccItemClick(String accItemClick) {
				this.accItemClick = accItemClick;
			}

			public String getAccTaskClick() {
				return this.accTaskClick;
			}

			public void setAccTaskClick(String accTaskClick) {
				this.accTaskClick = accTaskClick;
			}

			public String getAccClickPercent() {
				return this.accClickPercent;
			}

			public void setAccClickPercent(String accClickPercent) {
				this.accClickPercent = accClickPercent;
			}

			public String getAccItemCtr() {
				return this.accItemCtr;
			}

			public void setAccItemCtr(String accItemCtr) {
				this.accItemCtr = accItemCtr;
			}

			public String getAccTaskCtr() {
				return this.accTaskCtr;
			}

			public void setAccTaskCtr(String accTaskCtr) {
				this.accTaskCtr = accTaskCtr;
			}
		}
	}

	@Override
	public ListFlowControlTaskItemReportsResponse getInstance(UnmarshallerContext context) {
		return	ListFlowControlTaskItemReportsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
