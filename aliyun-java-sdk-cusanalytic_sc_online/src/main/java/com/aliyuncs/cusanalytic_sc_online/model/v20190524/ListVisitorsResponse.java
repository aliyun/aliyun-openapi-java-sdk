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

package com.aliyuncs.cusanalytic_sc_online.model.v20190524;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cusanalytic_sc_online.transform.v20190524.ListVisitorsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListVisitorsResponse extends AcsResponse {

	private Long total;

	private Integer pageIndex;

	private Integer pageSize;

	private List<VisitorItem> visitorItems;

	public Long getTotal() {
		return this.total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public Integer getPageIndex() {
		return this.pageIndex;
	}

	public void setPageIndex(Integer pageIndex) {
		this.pageIndex = pageIndex;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public List<VisitorItem> getVisitorItems() {
		return this.visitorItems;
	}

	public void setVisitorItems(List<VisitorItem> visitorItems) {
		this.visitorItems = visitorItems;
	}

	public static class VisitorItem {

		private String img;

		private String pkId;

		private Long latelyTime;

		private String earliestPlace;

		private String ukId;

		private String gender;

		private Long earliestTime;

		private String latelyPlace;

		private Long age;

		private Long storeId;

		private Long enterCount;

		public String getImg() {
			return this.img;
		}

		public void setImg(String img) {
			this.img = img;
		}

		public String getPkId() {
			return this.pkId;
		}

		public void setPkId(String pkId) {
			this.pkId = pkId;
		}

		public Long getLatelyTime() {
			return this.latelyTime;
		}

		public void setLatelyTime(Long latelyTime) {
			this.latelyTime = latelyTime;
		}

		public String getEarliestPlace() {
			return this.earliestPlace;
		}

		public void setEarliestPlace(String earliestPlace) {
			this.earliestPlace = earliestPlace;
		}

		public String getUkId() {
			return this.ukId;
		}

		public void setUkId(String ukId) {
			this.ukId = ukId;
		}

		public String getGender() {
			return this.gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		public Long getEarliestTime() {
			return this.earliestTime;
		}

		public void setEarliestTime(Long earliestTime) {
			this.earliestTime = earliestTime;
		}

		public String getLatelyPlace() {
			return this.latelyPlace;
		}

		public void setLatelyPlace(String latelyPlace) {
			this.latelyPlace = latelyPlace;
		}

		public Long getAge() {
			return this.age;
		}

		public void setAge(Long age) {
			this.age = age;
		}

		public Long getStoreId() {
			return this.storeId;
		}

		public void setStoreId(Long storeId) {
			this.storeId = storeId;
		}

		public Long getEnterCount() {
			return this.enterCount;
		}

		public void setEnterCount(Long enterCount) {
			this.enterCount = enterCount;
		}
	}

	@Override
	public ListVisitorsResponse getInstance(UnmarshallerContext context) {
		return	ListVisitorsResponseUnmarshaller.unmarshall(this, context);
	}
}
