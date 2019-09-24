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

package com.aliyuncs.hdr.model.v20170925;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.hdr.transform.v20170925.DescribeRecoveryPointsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeRecoveryPointsResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer totalCount;

	private List<RecoveryPoint> recoveryPoints;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

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

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<RecoveryPoint> getRecoveryPoints() {
		return this.recoveryPoints;
	}

	public void setRecoveryPoints(List<RecoveryPoint> recoveryPoints) {
		this.recoveryPoints = recoveryPoints;
	}

	public static class RecoveryPoint {

		private Long recoveryPointTime;

		private String recoveryPointId;

		private Boolean applicationConsistent;

		private Boolean used;

		public Long getRecoveryPointTime() {
			return this.recoveryPointTime;
		}

		public void setRecoveryPointTime(Long recoveryPointTime) {
			this.recoveryPointTime = recoveryPointTime;
		}

		public String getRecoveryPointId() {
			return this.recoveryPointId;
		}

		public void setRecoveryPointId(String recoveryPointId) {
			this.recoveryPointId = recoveryPointId;
		}

		public Boolean getApplicationConsistent() {
			return this.applicationConsistent;
		}

		public void setApplicationConsistent(Boolean applicationConsistent) {
			this.applicationConsistent = applicationConsistent;
		}

		public Boolean getUsed() {
			return this.used;
		}

		public void setUsed(Boolean used) {
			this.used = used;
		}
	}

	@Override
	public DescribeRecoveryPointsResponse getInstance(UnmarshallerContext context) {
		return	DescribeRecoveryPointsResponseUnmarshaller.unmarshall(this, context);
	}
}
