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

package com.aliyuncs.live.model.v20161101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.live.transform.v20161101.DescribeUpBpsPeakOfLineResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeUpBpsPeakOfLineResponse extends AcsResponse {

	private String requestId;

	private List<DescribeUpBpsPeakOfLine> describeUpBpsPeakOfLines;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DescribeUpBpsPeakOfLine> getDescribeUpBpsPeakOfLines() {
		return this.describeUpBpsPeakOfLines;
	}

	public void setDescribeUpBpsPeakOfLines(List<DescribeUpBpsPeakOfLine> describeUpBpsPeakOfLines) {
		this.describeUpBpsPeakOfLines = describeUpBpsPeakOfLines;
	}

	public static class DescribeUpBpsPeakOfLine {

		private String queryTime;

		private String statName;

		private Float bandWidth;

		private String peakTime;

		public String getQueryTime() {
			return this.queryTime;
		}

		public void setQueryTime(String queryTime) {
			this.queryTime = queryTime;
		}

		public String getStatName() {
			return this.statName;
		}

		public void setStatName(String statName) {
			this.statName = statName;
		}

		public Float getBandWidth() {
			return this.bandWidth;
		}

		public void setBandWidth(Float bandWidth) {
			this.bandWidth = bandWidth;
		}

		public String getPeakTime() {
			return this.peakTime;
		}

		public void setPeakTime(String peakTime) {
			this.peakTime = peakTime;
		}
	}

	@Override
	public DescribeUpBpsPeakOfLineResponse getInstance(UnmarshallerContext context) {
		return	DescribeUpBpsPeakOfLineResponseUnmarshaller.unmarshall(this, context);
	}
}
