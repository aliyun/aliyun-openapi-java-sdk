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

package com.aliyuncs.dataworks_public.model.v20200518;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dataworks_public.transform.v20200518.ListShiftPersonnelsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListShiftPersonnelsResponse extends AcsResponse {

	private String requestId;

	private Paging paging;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Paging getPaging() {
		return this.paging;
	}

	public void setPaging(Paging paging) {
		this.paging = paging;
	}

	public static class Paging {

		private Integer pageNumber;

		private Integer pageSize;

		private Integer totalCount;

		private List<ShiftPersonsItem> shiftPersons;

		public Integer getPageNumber() {
			return this.pageNumber;
		}

		public void setPageNumber(Integer pageNumber) {
			this.pageNumber = pageNumber;
		}

		public Integer getPageSize() {
			return this.pageSize;
		}

		public void setPageSize(Integer pageSize) {
			this.pageSize = pageSize;
		}

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public List<ShiftPersonsItem> getShiftPersons() {
			return this.shiftPersons;
		}

		public void setShiftPersons(List<ShiftPersonsItem> shiftPersons) {
			this.shiftPersons = shiftPersons;
		}

		public static class ShiftPersonsItem {

			private String shiftPersonUID;

			private String shiftPersonName;

			private Long beginTime;

			private Long endTime;

			public String getShiftPersonUID() {
				return this.shiftPersonUID;
			}

			public void setShiftPersonUID(String shiftPersonUID) {
				this.shiftPersonUID = shiftPersonUID;
			}

			public String getShiftPersonName() {
				return this.shiftPersonName;
			}

			public void setShiftPersonName(String shiftPersonName) {
				this.shiftPersonName = shiftPersonName;
			}

			public Long getBeginTime() {
				return this.beginTime;
			}

			public void setBeginTime(Long beginTime) {
				this.beginTime = beginTime;
			}

			public Long getEndTime() {
				return this.endTime;
			}

			public void setEndTime(Long endTime) {
				this.endTime = endTime;
			}
		}
	}

	@Override
	public ListShiftPersonnelsResponse getInstance(UnmarshallerContext context) {
		return	ListShiftPersonnelsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
