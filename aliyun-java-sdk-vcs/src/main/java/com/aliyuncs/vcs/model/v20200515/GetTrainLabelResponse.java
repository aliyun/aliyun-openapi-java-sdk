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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.vcs.transform.v20200515.GetTrainLabelResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetTrainLabelResponse extends AcsResponse {

	private String message;

	private String requestId;

	private String code;

	private Data data;

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

		private Long trainMarkerCnt;

		private String algorithmId;

		private String gmtModified;

		private String labelName;

		private String gmtCreated;

		private String deleted;

		private String iD;

		private Long testMarkerCnt;

		public Long getTrainMarkerCnt() {
			return this.trainMarkerCnt;
		}

		public void setTrainMarkerCnt(Long trainMarkerCnt) {
			this.trainMarkerCnt = trainMarkerCnt;
		}

		public String getAlgorithmId() {
			return this.algorithmId;
		}

		public void setAlgorithmId(String algorithmId) {
			this.algorithmId = algorithmId;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}

		public String getLabelName() {
			return this.labelName;
		}

		public void setLabelName(String labelName) {
			this.labelName = labelName;
		}

		public String getGmtCreated() {
			return this.gmtCreated;
		}

		public void setGmtCreated(String gmtCreated) {
			this.gmtCreated = gmtCreated;
		}

		public String getDeleted() {
			return this.deleted;
		}

		public void setDeleted(String deleted) {
			this.deleted = deleted;
		}

		public String getID() {
			return this.iD;
		}

		public void setID(String iD) {
			this.iD = iD;
		}

		public Long getTestMarkerCnt() {
			return this.testMarkerCnt;
		}

		public void setTestMarkerCnt(Long testMarkerCnt) {
			this.testMarkerCnt = testMarkerCnt;
		}
	}

	@Override
	public GetTrainLabelResponse getInstance(UnmarshallerContext context) {
		return	GetTrainLabelResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
