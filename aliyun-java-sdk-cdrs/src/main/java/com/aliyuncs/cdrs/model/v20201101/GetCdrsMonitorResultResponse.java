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

package com.aliyuncs.cdrs.model.v20201101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cdrs.transform.v20201101.GetCdrsMonitorResultResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetCdrsMonitorResultResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

	private Data data;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

			private String rightBottomY;

			private String rightBottomX;

			private String leftUpY;

			private String leftUpX;

			private String gbId;

			private String score;

			private String picUrl;

			private String shotTime;

			private String monitorPicUrl;

			private String targetPicUrl;

			public String getRightBottomY() {
				return this.rightBottomY;
			}

			public void setRightBottomY(String rightBottomY) {
				this.rightBottomY = rightBottomY;
			}

			public String getRightBottomX() {
				return this.rightBottomX;
			}

			public void setRightBottomX(String rightBottomX) {
				this.rightBottomX = rightBottomX;
			}

			public String getLeftUpY() {
				return this.leftUpY;
			}

			public void setLeftUpY(String leftUpY) {
				this.leftUpY = leftUpY;
			}

			public String getLeftUpX() {
				return this.leftUpX;
			}

			public void setLeftUpX(String leftUpX) {
				this.leftUpX = leftUpX;
			}

			public String getGbId() {
				return this.gbId;
			}

			public void setGbId(String gbId) {
				this.gbId = gbId;
			}

			public String getScore() {
				return this.score;
			}

			public void setScore(String score) {
				this.score = score;
			}

			public String getPicUrl() {
				return this.picUrl;
			}

			public void setPicUrl(String picUrl) {
				this.picUrl = picUrl;
			}

			public String getShotTime() {
				return this.shotTime;
			}

			public void setShotTime(String shotTime) {
				this.shotTime = shotTime;
			}

			public String getMonitorPicUrl() {
				return this.monitorPicUrl;
			}

			public void setMonitorPicUrl(String monitorPicUrl) {
				this.monitorPicUrl = monitorPicUrl;
			}

			public String getTargetPicUrl() {
				return this.targetPicUrl;
			}

			public void setTargetPicUrl(String targetPicUrl) {
				this.targetPicUrl = targetPicUrl;
			}
		}
	}

	@Override
	public GetCdrsMonitorResultResponse getInstance(UnmarshallerContext context) {
		return	GetCdrsMonitorResultResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
