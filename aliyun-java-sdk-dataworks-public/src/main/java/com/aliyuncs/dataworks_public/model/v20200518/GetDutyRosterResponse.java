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
import com.aliyuncs.dataworks_public.transform.v20200518.GetDutyRosterResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetDutyRosterResponse extends AcsResponse {

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

		private List<DutyRosterItem> dutyRoster;

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

		public List<DutyRosterItem> getDutyRoster() {
			return this.dutyRoster;
		}

		public void setDutyRoster(List<DutyRosterItem> dutyRoster) {
			this.dutyRoster = dutyRoster;
		}

		public static class DutyRosterItem {

			private String watchkeeper;

			private String watchkeeperName;

			private Long startLong;

			private Long endLong;

			public String getWatchkeeper() {
				return this.watchkeeper;
			}

			public void setWatchkeeper(String watchkeeper) {
				this.watchkeeper = watchkeeper;
			}

			public String getWatchkeeperName() {
				return this.watchkeeperName;
			}

			public void setWatchkeeperName(String watchkeeperName) {
				this.watchkeeperName = watchkeeperName;
			}

			public Long getStartLong() {
				return this.startLong;
			}

			public void setStartLong(Long startLong) {
				this.startLong = startLong;
			}

			public Long getEndLong() {
				return this.endLong;
			}

			public void setEndLong(Long endLong) {
				this.endLong = endLong;
			}
		}
	}

	@Override
	public GetDutyRosterResponse getInstance(UnmarshallerContext context) {
		return	GetDutyRosterResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
