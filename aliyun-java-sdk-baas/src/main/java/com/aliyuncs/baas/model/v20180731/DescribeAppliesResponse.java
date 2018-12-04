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

package com.aliyuncs.baas.model.v20180731;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.baas.transform.v20180731.DescribeAppliesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAppliesResponse extends AcsResponse {

	private String requestId;

	private Result result;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private List<ApplyHistoryListItem> applyHistoryList;

		private Pagination pagination;

		public List<ApplyHistoryListItem> getApplyHistoryList() {
			return this.applyHistoryList;
		}

		public void setApplyHistoryList(List<ApplyHistoryListItem> applyHistoryList) {
			this.applyHistoryList = applyHistoryList;
		}

		public Pagination getPagination() {
			return this.pagination;
		}

		public void setPagination(Pagination pagination) {
			this.pagination = pagination;
		}

		public static class ApplyHistoryListItem {

			private Integer id;

			private String bizid;

			private String username;

			private String reqAddr;

			private String signedAddr;

			private Integer status;

			private String rejectReason;

			private Long createtime;

			private Long updatetime;

			public Integer getId() {
				return this.id;
			}

			public void setId(Integer id) {
				this.id = id;
			}

			public String getBizid() {
				return this.bizid;
			}

			public void setBizid(String bizid) {
				this.bizid = bizid;
			}

			public String getUsername() {
				return this.username;
			}

			public void setUsername(String username) {
				this.username = username;
			}

			public String getReqAddr() {
				return this.reqAddr;
			}

			public void setReqAddr(String reqAddr) {
				this.reqAddr = reqAddr;
			}

			public String getSignedAddr() {
				return this.signedAddr;
			}

			public void setSignedAddr(String signedAddr) {
				this.signedAddr = signedAddr;
			}

			public Integer getStatus() {
				return this.status;
			}

			public void setStatus(Integer status) {
				this.status = status;
			}

			public String getRejectReason() {
				return this.rejectReason;
			}

			public void setRejectReason(String rejectReason) {
				this.rejectReason = rejectReason;
			}

			public Long getCreatetime() {
				return this.createtime;
			}

			public void setCreatetime(Long createtime) {
				this.createtime = createtime;
			}

			public Long getUpdatetime() {
				return this.updatetime;
			}

			public void setUpdatetime(Long updatetime) {
				this.updatetime = updatetime;
			}
		}

		public static class Pagination {

			private Integer pageSize;

			private Integer current;

			private Integer total;

			public Integer getPageSize() {
				return this.pageSize;
			}

			public void setPageSize(Integer pageSize) {
				this.pageSize = pageSize;
			}

			public Integer getCurrent() {
				return this.current;
			}

			public void setCurrent(Integer current) {
				this.current = current;
			}

			public Integer getTotal() {
				return this.total;
			}

			public void setTotal(Integer total) {
				this.total = total;
			}
		}
	}

	@Override
	public DescribeAppliesResponse getInstance(UnmarshallerContext context) {
		return	DescribeAppliesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
