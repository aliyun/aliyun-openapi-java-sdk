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

package com.aliyuncs.sas.model.v20181203;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.sas.transform.v20181203.PublicPreCheckImageScanTaskResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class PublicPreCheckImageScanTaskResponse extends AcsResponse {

	private String requestId;

	private Data data;

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

		private Integer scanImageCount;

		private Integer needAuthCount;

		public Integer getScanImageCount() {
			return this.scanImageCount;
		}

		public void setScanImageCount(Integer scanImageCount) {
			this.scanImageCount = scanImageCount;
		}

		public Integer getNeedAuthCount() {
			return this.needAuthCount;
		}

		public void setNeedAuthCount(Integer needAuthCount) {
			this.needAuthCount = needAuthCount;
		}
	}

	@Override
	public PublicPreCheckImageScanTaskResponse getInstance(UnmarshallerContext context) {
		return	PublicPreCheckImageScanTaskResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
