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

package com.aliyuncs.eduinterpreting.model.v20240828;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.eduinterpreting.transform.v20240828.RecognizeAudioResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class RecognizeAudioResponse extends AcsResponse {

	private String requestId;

	private String taskId;

	private List<ItemListItem> itemList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getTaskId() {
		return this.taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public List<ItemListItem> getItemList() {
		return this.itemList;
	}

	public void setItemList(List<ItemListItem> itemList) {
		this.itemList = itemList;
	}

	public static class ItemListItem {

		private String beginTime;

		private String endTime;

		private String text;

		public String getBeginTime() {
			return this.beginTime;
		}

		public void setBeginTime(String beginTime) {
			this.beginTime = beginTime;
		}

		public String getEndTime() {
			return this.endTime;
		}

		public void setEndTime(String endTime) {
			this.endTime = endTime;
		}

		public String getText() {
			return this.text;
		}

		public void setText(String text) {
			this.text = text;
		}
	}

	@Override
	public RecognizeAudioResponse getInstance(UnmarshallerContext context) {
		return	RecognizeAudioResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
