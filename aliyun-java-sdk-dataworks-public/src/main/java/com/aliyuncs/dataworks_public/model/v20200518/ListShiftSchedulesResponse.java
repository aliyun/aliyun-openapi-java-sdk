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
import com.aliyuncs.dataworks_public.transform.v20200518.ListShiftSchedulesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListShiftSchedulesResponse extends AcsResponse {

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

		private List<ShiftSchedulesItem> shiftSchedules;

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

		public List<ShiftSchedulesItem> getShiftSchedules() {
			return this.shiftSchedules;
		}

		public void setShiftSchedules(List<ShiftSchedulesItem> shiftSchedules) {
			this.shiftSchedules = shiftSchedules;
		}

		public static class ShiftSchedulesItem {

			private String shiftScheduleIdentifier;

			private String shiftScheduleName;

			public String getShiftScheduleIdentifier() {
				return this.shiftScheduleIdentifier;
			}

			public void setShiftScheduleIdentifier(String shiftScheduleIdentifier) {
				this.shiftScheduleIdentifier = shiftScheduleIdentifier;
			}

			public String getShiftScheduleName() {
				return this.shiftScheduleName;
			}

			public void setShiftScheduleName(String shiftScheduleName) {
				this.shiftScheduleName = shiftScheduleName;
			}
		}
	}

	@Override
	public ListShiftSchedulesResponse getInstance(UnmarshallerContext context) {
		return	ListShiftSchedulesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
