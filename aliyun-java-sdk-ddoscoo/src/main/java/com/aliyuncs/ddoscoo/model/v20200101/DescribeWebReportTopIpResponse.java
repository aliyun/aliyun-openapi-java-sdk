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

package com.aliyuncs.ddoscoo.model.v20200101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ddoscoo.transform.v20200101.DescribeWebReportTopIpResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeWebReportTopIpResponse extends AcsResponse {

	private String requestId;

	private List<DataItem> dataList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DataItem> getDataList() {
		return this.dataList;
	}

	public void setDataList(List<DataItem> dataList) {
		this.dataList = dataList;
	}

	public static class DataItem {

		private String sourceIp;

		private String areaId;

		private String isp;

		private Long count;

		public String getSourceIp() {
			return this.sourceIp;
		}

		public void setSourceIp(String sourceIp) {
			this.sourceIp = sourceIp;
		}

		public String getAreaId() {
			return this.areaId;
		}

		public void setAreaId(String areaId) {
			this.areaId = areaId;
		}

		public String getIsp() {
			return this.isp;
		}

		public void setIsp(String isp) {
			this.isp = isp;
		}

		public Long getCount() {
			return this.count;
		}

		public void setCount(Long count) {
			this.count = count;
		}
	}

	@Override
	public DescribeWebReportTopIpResponse getInstance(UnmarshallerContext context) {
		return	DescribeWebReportTopIpResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
