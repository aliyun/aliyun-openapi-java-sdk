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

package com.aliyuncs.vcs.model.v20200515;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vcs.transform.v20200515.GetMonitorResultResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetMonitorResultResponse extends AcsResponse {

	private String requestId;

	private String message;

	private String code;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String maxId;

		private List<RecordsItem> records;

		public String getMaxId() {
			return this.maxId;
		}

		public void setMaxId(String maxId) {
			this.maxId = maxId;
		}

		public List<RecordsItem> getRecords() {
			return this.records;
		}

		public void setRecords(List<RecordsItem> records) {
			this.records = records;
		}

		public static class RecordsItem {

			private String leftUpX;

			private String leftUpY;

			private String score;

			private String taskId;

			private String targetPicUrl;

			private String rightBottomX;

			private String rightBottomY;

			private String gbId;

			private String monitorPicUrl;

			private String shotTime;

			private String picUrl;

			private ExtendInfo extendInfo;

			public String getLeftUpX() {
				return this.leftUpX;
			}

			public void setLeftUpX(String leftUpX) {
				this.leftUpX = leftUpX;
			}

			public String getLeftUpY() {
				return this.leftUpY;
			}

			public void setLeftUpY(String leftUpY) {
				this.leftUpY = leftUpY;
			}

			public String getScore() {
				return this.score;
			}

			public void setScore(String score) {
				this.score = score;
			}

			public String getTaskId() {
				return this.taskId;
			}

			public void setTaskId(String taskId) {
				this.taskId = taskId;
			}

			public String getTargetPicUrl() {
				return this.targetPicUrl;
			}

			public void setTargetPicUrl(String targetPicUrl) {
				this.targetPicUrl = targetPicUrl;
			}

			public String getRightBottomX() {
				return this.rightBottomX;
			}

			public void setRightBottomX(String rightBottomX) {
				this.rightBottomX = rightBottomX;
			}

			public String getRightBottomY() {
				return this.rightBottomY;
			}

			public void setRightBottomY(String rightBottomY) {
				this.rightBottomY = rightBottomY;
			}

			public String getGbId() {
				return this.gbId;
			}

			public void setGbId(String gbId) {
				this.gbId = gbId;
			}

			public String getMonitorPicUrl() {
				return this.monitorPicUrl;
			}

			public void setMonitorPicUrl(String monitorPicUrl) {
				this.monitorPicUrl = monitorPicUrl;
			}

			public String getShotTime() {
				return this.shotTime;
			}

			public void setShotTime(String shotTime) {
				this.shotTime = shotTime;
			}

			public String getPicUrl() {
				return this.picUrl;
			}

			public void setPicUrl(String picUrl) {
				this.picUrl = picUrl;
			}

			public ExtendInfo getExtendInfo() {
				return this.extendInfo;
			}

			public void setExtendInfo(ExtendInfo extendInfo) {
				this.extendInfo = extendInfo;
			}

			public static class ExtendInfo {

				private String plateNo;

				public String getPlateNo() {
					return this.plateNo;
				}

				public void setPlateNo(String plateNo) {
					this.plateNo = plateNo;
				}
			}
		}
	}

	@Override
	public GetMonitorResultResponse getInstance(UnmarshallerContext context) {
		return	GetMonitorResultResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
