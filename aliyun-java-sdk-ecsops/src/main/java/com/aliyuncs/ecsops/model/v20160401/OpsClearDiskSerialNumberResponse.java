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

package com.aliyuncs.ecsops.model.v20160401;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsClearDiskSerialNumberResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsClearDiskSerialNumberResponse extends AcsResponse {

	private Integer totalCount;

	private String requestId;

	private List<FailedDisk> failedDiskList;

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<FailedDisk> getFailedDiskList() {
		return this.failedDiskList;
	}

	public void setFailedDiskList(List<FailedDisk> failedDiskList) {
		this.failedDiskList = failedDiskList;
	}

	public static class FailedDisk {

		private String code;

		private String message;

		private String diskId;

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

		public String getDiskId() {
			return this.diskId;
		}

		public void setDiskId(String diskId) {
			this.diskId = diskId;
		}
	}

	@Override
	public OpsClearDiskSerialNumberResponse getInstance(UnmarshallerContext context) {
		return	OpsClearDiskSerialNumberResponseUnmarshaller.unmarshall(this, context);
	}
}
