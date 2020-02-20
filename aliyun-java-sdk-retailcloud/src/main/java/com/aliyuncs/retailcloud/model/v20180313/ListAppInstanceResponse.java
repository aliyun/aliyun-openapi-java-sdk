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

package com.aliyuncs.retailcloud.model.v20180313;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.retailcloud.transform.v20180313.ListAppInstanceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListAppInstanceResponse extends AcsResponse {

	private String requestId;

	private Integer code;

	private Integer pageSize;

	private Integer pageNumber;

	private Long totalCount;

	private String errMsg;

	private List<AppInstanceDetail> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public String getErrMsg() {
		return this.errMsg;
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}

	public List<AppInstanceDetail> getData() {
		return this.data;
	}

	public void setData(List<AppInstanceDetail> data) {
		this.data = data;
	}

	public static class AppInstanceDetail {

		private String appInstanceId;

		private String createTime;

		private String spec;

		private Integer restartCount;

		private String hostIp;

		private String podIp;

		private String health;

		public String getAppInstanceId() {
			return this.appInstanceId;
		}

		public void setAppInstanceId(String appInstanceId) {
			this.appInstanceId = appInstanceId;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getSpec() {
			return this.spec;
		}

		public void setSpec(String spec) {
			this.spec = spec;
		}

		public Integer getRestartCount() {
			return this.restartCount;
		}

		public void setRestartCount(Integer restartCount) {
			this.restartCount = restartCount;
		}

		public String getHostIp() {
			return this.hostIp;
		}

		public void setHostIp(String hostIp) {
			this.hostIp = hostIp;
		}

		public String getPodIp() {
			return this.podIp;
		}

		public void setPodIp(String podIp) {
			this.podIp = podIp;
		}

		public String getHealth() {
			return this.health;
		}

		public void setHealth(String health) {
			this.health = health;
		}
	}

	@Override
	public ListAppInstanceResponse getInstance(UnmarshallerContext context) {
		return	ListAppInstanceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
