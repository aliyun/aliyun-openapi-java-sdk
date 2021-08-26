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
import com.aliyuncs.ecd.transform.v20200930.DescribeScaleStrategysResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeScaleStrategysResponse extends AcsResponse {

	private String requestId;

	private String nextToken;

	private List<ScaleStrategy> scaleStrategys;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public List<ScaleStrategy> getScaleStrategys() {
		return this.scaleStrategys;
	}

	public void setScaleStrategys(List<ScaleStrategy> scaleStrategys) {
		this.scaleStrategys = scaleStrategys;
	}

	public static class ScaleStrategy {

		private String scaleStrategyId;

		private String scaleStrategyName;

		private String scaleStrategyType;

		private Integer minDesktopsCount;

		private Integer maxDesktopsCount;

		private Integer minAvailableDesktopsCount;

		private Integer maxAvailableDesktopsCount;

		private Integer scaleStep;

		public String getScaleStrategyId() {
			return this.scaleStrategyId;
		}

		public void setScaleStrategyId(String scaleStrategyId) {
			this.scaleStrategyId = scaleStrategyId;
		}

		public String getScaleStrategyName() {
			return this.scaleStrategyName;
		}

		public void setScaleStrategyName(String scaleStrategyName) {
			this.scaleStrategyName = scaleStrategyName;
		}

		public String getScaleStrategyType() {
			return this.scaleStrategyType;
		}

		public void setScaleStrategyType(String scaleStrategyType) {
			this.scaleStrategyType = scaleStrategyType;
		}

		public Integer getMinDesktopsCount() {
			return this.minDesktopsCount;
		}

		public void setMinDesktopsCount(Integer minDesktopsCount) {
			this.minDesktopsCount = minDesktopsCount;
		}

		public Integer getMaxDesktopsCount() {
			return this.maxDesktopsCount;
		}

		public void setMaxDesktopsCount(Integer maxDesktopsCount) {
			this.maxDesktopsCount = maxDesktopsCount;
		}

		public Integer getMinAvailableDesktopsCount() {
			return this.minAvailableDesktopsCount;
		}

		public void setMinAvailableDesktopsCount(Integer minAvailableDesktopsCount) {
			this.minAvailableDesktopsCount = minAvailableDesktopsCount;
		}

		public Integer getMaxAvailableDesktopsCount() {
			return this.maxAvailableDesktopsCount;
		}

		public void setMaxAvailableDesktopsCount(Integer maxAvailableDesktopsCount) {
			this.maxAvailableDesktopsCount = maxAvailableDesktopsCount;
		}

		public Integer getScaleStep() {
			return this.scaleStep;
		}

		public void setScaleStep(Integer scaleStep) {
			this.scaleStep = scaleStep;
		}
	}

	@Override
	public DescribeScaleStrategysResponse getInstance(UnmarshallerContext context) {
		return	DescribeScaleStrategysResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
