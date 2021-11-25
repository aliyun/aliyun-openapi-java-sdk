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

package com.aliyuncs.copyright.model.v20190123;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.copyright.transform.v20190123.GetPatentTimeStatisticsInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetPatentTimeStatisticsInfoResponse extends AcsResponse {

	private Integer pageNum;

	private String requestId;

	private Boolean success;

	private Integer totalItemNum;

	private Integer pageSize;

	private Integer totalPageNum;

	private List<DataItem> data;

	public Integer getPageNum() {
		return this.pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}

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

	public Integer getTotalItemNum() {
		return this.totalItemNum;
	}

	public void setTotalItemNum(Integer totalItemNum) {
		this.totalItemNum = totalItemNum;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getTotalPageNum() {
		return this.totalPageNum;
	}

	public void setTotalPageNum(Integer totalPageNum) {
		this.totalPageNum = totalPageNum;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private String type;

		private Long halfMonthCount;

		private Long monthCount;

		private Long twoMonthCount;

		private Long threeMonthCount;

		private Long expiredCount;

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public Long getHalfMonthCount() {
			return this.halfMonthCount;
		}

		public void setHalfMonthCount(Long halfMonthCount) {
			this.halfMonthCount = halfMonthCount;
		}

		public Long getMonthCount() {
			return this.monthCount;
		}

		public void setMonthCount(Long monthCount) {
			this.monthCount = monthCount;
		}

		public Long getTwoMonthCount() {
			return this.twoMonthCount;
		}

		public void setTwoMonthCount(Long twoMonthCount) {
			this.twoMonthCount = twoMonthCount;
		}

		public Long getThreeMonthCount() {
			return this.threeMonthCount;
		}

		public void setThreeMonthCount(Long threeMonthCount) {
			this.threeMonthCount = threeMonthCount;
		}

		public Long getExpiredCount() {
			return this.expiredCount;
		}

		public void setExpiredCount(Long expiredCount) {
			this.expiredCount = expiredCount;
		}
	}

	@Override
	public GetPatentTimeStatisticsInfoResponse getInstance(UnmarshallerContext context) {
		return	GetPatentTimeStatisticsInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
