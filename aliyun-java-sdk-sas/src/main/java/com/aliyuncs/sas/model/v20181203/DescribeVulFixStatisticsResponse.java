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

package com.aliyuncs.sas.model.v20181203;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sas.transform.v20181203.DescribeVulFixStatisticsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeVulFixStatisticsResponse extends AcsResponse {

	private String requestId;

	private List<Fix> fixStat;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Fix> getFixStat() {
		return this.fixStat;
	}

	public void setFixStat(List<Fix> fixStat) {
		this.fixStat = fixStat;
	}

	public static class Fix {

		private Integer fixingNum;

		private String type;

		private Integer fixedTodayNum;

		private Integer fixedTotalNum;

		private Integer needFixNum;

		public Integer getFixingNum() {
			return this.fixingNum;
		}

		public void setFixingNum(Integer fixingNum) {
			this.fixingNum = fixingNum;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public Integer getFixedTodayNum() {
			return this.fixedTodayNum;
		}

		public void setFixedTodayNum(Integer fixedTodayNum) {
			this.fixedTodayNum = fixedTodayNum;
		}

		public Integer getFixedTotalNum() {
			return this.fixedTotalNum;
		}

		public void setFixedTotalNum(Integer fixedTotalNum) {
			this.fixedTotalNum = fixedTotalNum;
		}

		public Integer getNeedFixNum() {
			return this.needFixNum;
		}

		public void setNeedFixNum(Integer needFixNum) {
			this.needFixNum = needFixNum;
		}
	}

	@Override
	public DescribeVulFixStatisticsResponse getInstance(UnmarshallerContext context) {
		return	DescribeVulFixStatisticsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
