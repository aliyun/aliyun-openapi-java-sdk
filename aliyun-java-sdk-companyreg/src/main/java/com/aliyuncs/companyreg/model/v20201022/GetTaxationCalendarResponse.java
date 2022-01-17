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

package com.aliyuncs.companyreg.model.v20201022;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.companyreg.transform.v20201022.GetTaxationCalendarResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetTaxationCalendarResponse extends AcsResponse {

	private String requestId;

	private List<CalendarListItem> calendarList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<CalendarListItem> getCalendarList() {
		return this.calendarList;
	}

	public void setCalendarList(List<CalendarListItem> calendarList) {
		this.calendarList = calendarList;
	}

	public static class CalendarListItem {

		private String declareEndDate;

		private Boolean isCanBookkeeping;

		private String bookkeepingStartDate;

		private String declareProgress;

		private String bookkeepingEndDate;

		private String userTaxStartDate;

		private String declareStartDate;

		private String userTaxEndDate;

		private String period;

		private String errorMessage;

		public String getDeclareEndDate() {
			return this.declareEndDate;
		}

		public void setDeclareEndDate(String declareEndDate) {
			this.declareEndDate = declareEndDate;
		}

		public Boolean getIsCanBookkeeping() {
			return this.isCanBookkeeping;
		}

		public void setIsCanBookkeeping(Boolean isCanBookkeeping) {
			this.isCanBookkeeping = isCanBookkeeping;
		}

		public String getBookkeepingStartDate() {
			return this.bookkeepingStartDate;
		}

		public void setBookkeepingStartDate(String bookkeepingStartDate) {
			this.bookkeepingStartDate = bookkeepingStartDate;
		}

		public String getDeclareProgress() {
			return this.declareProgress;
		}

		public void setDeclareProgress(String declareProgress) {
			this.declareProgress = declareProgress;
		}

		public String getBookkeepingEndDate() {
			return this.bookkeepingEndDate;
		}

		public void setBookkeepingEndDate(String bookkeepingEndDate) {
			this.bookkeepingEndDate = bookkeepingEndDate;
		}

		public String getUserTaxStartDate() {
			return this.userTaxStartDate;
		}

		public void setUserTaxStartDate(String userTaxStartDate) {
			this.userTaxStartDate = userTaxStartDate;
		}

		public String getDeclareStartDate() {
			return this.declareStartDate;
		}

		public void setDeclareStartDate(String declareStartDate) {
			this.declareStartDate = declareStartDate;
		}

		public String getUserTaxEndDate() {
			return this.userTaxEndDate;
		}

		public void setUserTaxEndDate(String userTaxEndDate) {
			this.userTaxEndDate = userTaxEndDate;
		}

		public String getPeriod() {
			return this.period;
		}

		public void setPeriod(String period) {
			this.period = period;
		}

		public String getErrorMessage() {
			return this.errorMessage;
		}

		public void setErrorMessage(String errorMessage) {
			this.errorMessage = errorMessage;
		}
	}

	@Override
	public GetTaxationCalendarResponse getInstance(UnmarshallerContext context) {
		return	GetTaxationCalendarResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
