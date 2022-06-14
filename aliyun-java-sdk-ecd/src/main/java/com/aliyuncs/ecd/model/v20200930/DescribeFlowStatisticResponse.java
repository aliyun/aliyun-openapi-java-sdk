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

package com.aliyuncs.ecd.model.v20200930;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecd.transform.v20200930.DescribeFlowStatisticResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeFlowStatisticResponse extends AcsResponse {

	private Integer desktopCount;

	private String requestId;

	private List<FlowStatistic> desktopFlowStatistic;

	public Integer getDesktopCount() {
		return this.desktopCount;
	}

	public void setDesktopCount(Integer desktopCount) {
		this.desktopCount = desktopCount;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<FlowStatistic> getDesktopFlowStatistic() {
		return this.desktopFlowStatistic;
	}

	public void setDesktopFlowStatistic(List<FlowStatistic> desktopFlowStatistic) {
		this.desktopFlowStatistic = desktopFlowStatistic;
	}

	public static class FlowStatistic {

		private String desktopName;

		private String desktopId;

		private Integer flowRank;

		private String flowIn;

		public String getDesktopName() {
			return this.desktopName;
		}

		public void setDesktopName(String desktopName) {
			this.desktopName = desktopName;
		}

		public String getDesktopId() {
			return this.desktopId;
		}

		public void setDesktopId(String desktopId) {
			this.desktopId = desktopId;
		}

		public Integer getFlowRank() {
			return this.flowRank;
		}

		public void setFlowRank(Integer flowRank) {
			this.flowRank = flowRank;
		}

		public String getFlowIn() {
			return this.flowIn;
		}

		public void setFlowIn(String flowIn) {
			this.flowIn = flowIn;
		}
	}

	@Override
	public DescribeFlowStatisticResponse getInstance(UnmarshallerContext context) {
		return	DescribeFlowStatisticResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
