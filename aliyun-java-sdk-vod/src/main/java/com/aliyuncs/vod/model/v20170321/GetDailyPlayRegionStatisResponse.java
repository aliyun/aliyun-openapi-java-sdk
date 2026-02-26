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

package com.aliyuncs.vod.model.v20170321;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vod.transform.v20170321.GetDailyPlayRegionStatisResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetDailyPlayRegionStatisResponse extends AcsResponse {

	private String requestId;

	private List<DailyPlayRegionStatisFileDO> dailyPlayRegionStatisList;

	private List<String> failDates;

	private List<String> emptyDates;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DailyPlayRegionStatisFileDO> getDailyPlayRegionStatisList() {
		return this.dailyPlayRegionStatisList;
	}

	public void setDailyPlayRegionStatisList(List<DailyPlayRegionStatisFileDO> dailyPlayRegionStatisList) {
		this.dailyPlayRegionStatisList = dailyPlayRegionStatisList;
	}

	public List<String> getFailDates() {
		return this.failDates;
	}

	public void setFailDates(List<String> failDates) {
		this.failDates = failDates;
	}

	public List<String> getEmptyDates() {
		return this.emptyDates;
	}

	public void setEmptyDates(List<String> emptyDates) {
		this.emptyDates = emptyDates;
	}

	public static class DailyPlayRegionStatisFileDO {

		private String date;

		private String fileUrl;

		public String getDate() {
			return this.date;
		}

		public void setDate(String date) {
			this.date = date;
		}

		public String getFileUrl() {
			return this.fileUrl;
		}

		public void setFileUrl(String fileUrl) {
			this.fileUrl = fileUrl;
		}
	}

	@Override
	public GetDailyPlayRegionStatisResponse getInstance(UnmarshallerContext context) {
		return	GetDailyPlayRegionStatisResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
