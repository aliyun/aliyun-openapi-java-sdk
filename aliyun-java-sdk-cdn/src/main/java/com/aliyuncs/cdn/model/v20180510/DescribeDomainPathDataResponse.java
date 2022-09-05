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

package com.aliyuncs.cdn.model.v20180510;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cdn.transform.v20180510.DescribeDomainPathDataResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDomainPathDataResponse extends AcsResponse {

	private String endTime;

	private String startTime;

	private Integer pageSize;

	private Integer pageNumber;

	private Integer totalCount;

	private String domainName;

	private String dataInterval;

	private List<UsageData> pathDataPerInterval;

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public String getDomainName() {
		return this.domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
	}

	public String getDataInterval() {
		return this.dataInterval;
	}

	public void setDataInterval(String dataInterval) {
		this.dataInterval = dataInterval;
	}

	public List<UsageData> getPathDataPerInterval() {
		return this.pathDataPerInterval;
	}

	public void setPathDataPerInterval(List<UsageData> pathDataPerInterval) {
		this.pathDataPerInterval = pathDataPerInterval;
	}

	public static class UsageData {

		private String path;

		private String time;

		private Integer acc;

		private Integer traffic;

		public String getPath() {
			return this.path;
		}

		public void setPath(String path) {
			this.path = path;
		}

		public String getTime() {
			return this.time;
		}

		public void setTime(String time) {
			this.time = time;
		}

		public Integer getAcc() {
			return this.acc;
		}

		public void setAcc(Integer acc) {
			this.acc = acc;
		}

		public Integer getTraffic() {
			return this.traffic;
		}

		public void setTraffic(Integer traffic) {
			this.traffic = traffic;
		}
	}

	@Override
	public DescribeDomainPathDataResponse getInstance(UnmarshallerContext context) {
		return	DescribeDomainPathDataResponseUnmarshaller.unmarshall(this, context);
	}
}
