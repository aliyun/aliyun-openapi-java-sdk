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

package com.aliyuncs.cdn.model.v20141111;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cdn.transform.v20141111.DescribeDomainSlowRatioResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDomainSlowRatioResponse extends AcsResponse {

	private String endTime;

	private Integer dataInterval;

	private Integer pageNumber;

	private Integer pageSize;

	private Integer totalCount;

	private String startTime;

	private List<SlowRatioData> slowRatioDataPerInterval;

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public Integer getDataInterval() {
		return this.dataInterval;
	}

	public void setDataInterval(Integer dataInterval) {
		this.dataInterval = dataInterval;
	}

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

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public List<SlowRatioData> getSlowRatioDataPerInterval() {
		return this.slowRatioDataPerInterval;
	}

	public void setSlowRatioDataPerInterval(List<SlowRatioData> slowRatioDataPerInterval) {
		this.slowRatioDataPerInterval = slowRatioDataPerInterval;
	}

	public static class SlowRatioData {

		private Integer totalUsers;

		private Integer slowUsers;

		private Float slowRatio;

		private String regionNameZh;

		private String regionNameEn;

		private String ispNameZh;

		private String ispNameEn;

		private String time;

		public Integer getTotalUsers() {
			return this.totalUsers;
		}

		public void setTotalUsers(Integer totalUsers) {
			this.totalUsers = totalUsers;
		}

		public Integer getSlowUsers() {
			return this.slowUsers;
		}

		public void setSlowUsers(Integer slowUsers) {
			this.slowUsers = slowUsers;
		}

		public Float getSlowRatio() {
			return this.slowRatio;
		}

		public void setSlowRatio(Float slowRatio) {
			this.slowRatio = slowRatio;
		}

		public String getRegionNameZh() {
			return this.regionNameZh;
		}

		public void setRegionNameZh(String regionNameZh) {
			this.regionNameZh = regionNameZh;
		}

		public String getRegionNameEn() {
			return this.regionNameEn;
		}

		public void setRegionNameEn(String regionNameEn) {
			this.regionNameEn = regionNameEn;
		}

		public String getIspNameZh() {
			return this.ispNameZh;
		}

		public void setIspNameZh(String ispNameZh) {
			this.ispNameZh = ispNameZh;
		}

		public String getIspNameEn() {
			return this.ispNameEn;
		}

		public void setIspNameEn(String ispNameEn) {
			this.ispNameEn = ispNameEn;
		}

		public String getTime() {
			return this.time;
		}

		public void setTime(String time) {
			this.time = time;
		}
	}

	@Override
	public DescribeDomainSlowRatioResponse getInstance(UnmarshallerContext context) {
		return	DescribeDomainSlowRatioResponseUnmarshaller.unmarshall(this, context);
	}
}
