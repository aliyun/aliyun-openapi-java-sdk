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

package com.aliyuncs.nas.model.v20170626;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.nas.transform.v20170626.GetRecycleBinAttributeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetRecycleBinAttributeResponse extends AcsResponse {

	private String requestId;

	private RecycleBinAttribute recycleBinAttribute;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public RecycleBinAttribute getRecycleBinAttribute() {
		return this.recycleBinAttribute;
	}

	public void setRecycleBinAttribute(RecycleBinAttribute recycleBinAttribute) {
		this.recycleBinAttribute = recycleBinAttribute;
	}

	public static class RecycleBinAttribute {

		private Long size;

		private String status;

		private Long reservedDays;

		private String enableTime;

		public Long getSize() {
			return this.size;
		}

		public void setSize(Long size) {
			this.size = size;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Long getReservedDays() {
			return this.reservedDays;
		}

		public void setReservedDays(Long reservedDays) {
			this.reservedDays = reservedDays;
		}

		public String getEnableTime() {
			return this.enableTime;
		}

		public void setEnableTime(String enableTime) {
			this.enableTime = enableTime;
		}
	}

	@Override
	public GetRecycleBinAttributeResponse getInstance(UnmarshallerContext context) {
		return	GetRecycleBinAttributeResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
