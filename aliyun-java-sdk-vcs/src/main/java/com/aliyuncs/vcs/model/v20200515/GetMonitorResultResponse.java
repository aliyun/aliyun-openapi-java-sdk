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

	private String code;

	private String message;

	private String requestId;

	private String score;

	private String leftTopX;

	private String leftTopY;

	private String rightBottomX;

	private String rightBottomY;

	private List<RecordsItem> records;

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

	public String getScore() {
		return this.score;
	}

	public void setScore(String score) {
		this.score = score;
	}

	public String getLeftTopX() {
		return this.leftTopX;
	}

	public void setLeftTopX(String leftTopX) {
		this.leftTopX = leftTopX;
	}

	public String getLeftTopY() {
		return this.leftTopY;
	}

	public void setLeftTopY(String leftTopY) {
		this.leftTopY = leftTopY;
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

	public List<RecordsItem> getRecords() {
		return this.records;
	}

	public void setRecords(List<RecordsItem> records) {
		this.records = records;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class RecordsItem {

		private String gbId;

		private String shotTime;

		private String monitorPicUrl;

		private String shotPicUrl;

		public String getGbId() {
			return this.gbId;
		}

		public void setGbId(String gbId) {
			this.gbId = gbId;
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

		public String getShotPicUrl() {
			return this.shotPicUrl;
		}

		public void setShotPicUrl(String shotPicUrl) {
			this.shotPicUrl = shotPicUrl;
		}
	}

	public static class Data {

		private String maxRecordId;

		public String getMaxRecordId() {
			return this.maxRecordId;
		}

		public void setMaxRecordId(String maxRecordId) {
			this.maxRecordId = maxRecordId;
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
