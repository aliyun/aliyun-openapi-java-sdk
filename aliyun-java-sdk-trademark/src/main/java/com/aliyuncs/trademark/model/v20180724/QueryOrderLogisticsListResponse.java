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

package com.aliyuncs.trademark.model.v20180724;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.trademark.transform.v20180724.QueryOrderLogisticsListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryOrderLogisticsListResponse extends AcsResponse {

	private Integer currentPageNum;

	private Integer totalPageNum;

	private String requestId;

	private Integer pageSize;

	private Integer totalItemNum;

	private List<LogisticsRecords> data;

	public Integer getCurrentPageNum() {
		return this.currentPageNum;
	}

	public void setCurrentPageNum(Integer currentPageNum) {
		this.currentPageNum = currentPageNum;
	}

	public Integer getTotalPageNum() {
		return this.totalPageNum;
	}

	public void setTotalPageNum(Integer totalPageNum) {
		this.totalPageNum = totalPageNum;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getTotalItemNum() {
		return this.totalItemNum;
	}

	public void setTotalItemNum(Integer totalItemNum) {
		this.totalItemNum = totalItemNum;
	}

	public List<LogisticsRecords> getData() {
		return this.data;
	}

	public void setData(List<LogisticsRecords> data) {
		this.data = data;
	}

	public static class LogisticsRecords {

		private String fileType;

		private String fileIdentifier;

		private String produceOrderId;

		private String bizId;

		private String tmIcon;

		private String tmName;

		private String tmNumber;

		private String logisticsNo;

		public String getFileType() {
			return this.fileType;
		}

		public void setFileType(String fileType) {
			this.fileType = fileType;
		}

		public String getFileIdentifier() {
			return this.fileIdentifier;
		}

		public void setFileIdentifier(String fileIdentifier) {
			this.fileIdentifier = fileIdentifier;
		}

		public String getProduceOrderId() {
			return this.produceOrderId;
		}

		public void setProduceOrderId(String produceOrderId) {
			this.produceOrderId = produceOrderId;
		}

		public String getBizId() {
			return this.bizId;
		}

		public void setBizId(String bizId) {
			this.bizId = bizId;
		}

		public String getTmIcon() {
			return this.tmIcon;
		}

		public void setTmIcon(String tmIcon) {
			this.tmIcon = tmIcon;
		}

		public String getTmName() {
			return this.tmName;
		}

		public void setTmName(String tmName) {
			this.tmName = tmName;
		}

		public String getTmNumber() {
			return this.tmNumber;
		}

		public void setTmNumber(String tmNumber) {
			this.tmNumber = tmNumber;
		}

		public String getLogisticsNo() {
			return this.logisticsNo;
		}

		public void setLogisticsNo(String logisticsNo) {
			this.logisticsNo = logisticsNo;
		}
	}

	@Override
	public QueryOrderLogisticsListResponse getInstance(UnmarshallerContext context) {
		return	QueryOrderLogisticsListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
