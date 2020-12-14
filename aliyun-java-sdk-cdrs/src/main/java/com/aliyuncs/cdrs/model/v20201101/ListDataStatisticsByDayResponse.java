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

package com.aliyuncs.cdrs.model.v20201101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cdrs.transform.v20201101.ListDataStatisticsByDayResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListDataStatisticsByDayResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

	private Long pageNumber;

	private Long pageSize;

	private Long totalCount;

	private List<Datas> data;

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

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Long pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public List<Datas> getData() {
		return this.data;
	}

	public void setData(List<Datas> data) {
		this.data = data;
	}

	public static class Datas {

		private String date;

		private String corpId;

		private Integer faceNumber;

		private Integer bodyNumber;

		private Integer motorNumber;

		private Integer nonMotorNumber;

		private Integer totalNumber;

		public String getDate() {
			return this.date;
		}

		public void setDate(String date) {
			this.date = date;
		}

		public String getCorpId() {
			return this.corpId;
		}

		public void setCorpId(String corpId) {
			this.corpId = corpId;
		}

		public Integer getFaceNumber() {
			return this.faceNumber;
		}

		public void setFaceNumber(Integer faceNumber) {
			this.faceNumber = faceNumber;
		}

		public Integer getBodyNumber() {
			return this.bodyNumber;
		}

		public void setBodyNumber(Integer bodyNumber) {
			this.bodyNumber = bodyNumber;
		}

		public Integer getMotorNumber() {
			return this.motorNumber;
		}

		public void setMotorNumber(Integer motorNumber) {
			this.motorNumber = motorNumber;
		}

		public Integer getNonMotorNumber() {
			return this.nonMotorNumber;
		}

		public void setNonMotorNumber(Integer nonMotorNumber) {
			this.nonMotorNumber = nonMotorNumber;
		}

		public Integer getTotalNumber() {
			return this.totalNumber;
		}

		public void setTotalNumber(Integer totalNumber) {
			this.totalNumber = totalNumber;
		}
	}

	@Override
	public ListDataStatisticsByDayResponse getInstance(UnmarshallerContext context) {
		return	ListDataStatisticsByDayResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
