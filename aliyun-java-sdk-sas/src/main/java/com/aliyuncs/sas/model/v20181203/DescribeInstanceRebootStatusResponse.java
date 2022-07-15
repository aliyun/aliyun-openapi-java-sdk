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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sas.transform.v20181203.DescribeInstanceRebootStatusResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeInstanceRebootStatusResponse extends AcsResponse {

	private Integer totalCount;

	private String requestId;

	private List<RebootStatus> rebootStatuses;

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

	public List<RebootStatus> getRebootStatuses() {
		return this.rebootStatuses;
	}

	public void setRebootStatuses(List<RebootStatus> rebootStatuses) {
		this.rebootStatuses = rebootStatuses;
	}

	public static class RebootStatus {

		private String uuid;

		private Integer rebootStatus;

		private String code;

		private String msg;

		public String getUuid() {
			return this.uuid;
		}

		public void setUuid(String uuid) {
			this.uuid = uuid;
		}

		public Integer getRebootStatus() {
			return this.rebootStatus;
		}

		public void setRebootStatus(Integer rebootStatus) {
			this.rebootStatus = rebootStatus;
		}

		public String getCode() {
			return this.code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getMsg() {
			return this.msg;
		}

		public void setMsg(String msg) {
			this.msg = msg;
		}
	}

	@Override
	public DescribeInstanceRebootStatusResponse getInstance(UnmarshallerContext context) {
		return	DescribeInstanceRebootStatusResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
