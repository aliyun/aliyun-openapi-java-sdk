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

package com.aliyuncs.ecsops.model.v20160401;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsDescribeAlertStatisticsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsDescribeAlertStatisticsResponse extends AcsResponse {

	private String requestId;

	private Integer waitTotal;

	private Integer processingTotal;

	private Integer fixedTotal;

	private Integer finishedTotal;

	private List<AlertInfoStatisticalModel> alertInfoStatisticalModels;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getWaitTotal() {
		return this.waitTotal;
	}

	public void setWaitTotal(Integer waitTotal) {
		this.waitTotal = waitTotal;
	}

	public Integer getProcessingTotal() {
		return this.processingTotal;
	}

	public void setProcessingTotal(Integer processingTotal) {
		this.processingTotal = processingTotal;
	}

	public Integer getFixedTotal() {
		return this.fixedTotal;
	}

	public void setFixedTotal(Integer fixedTotal) {
		this.fixedTotal = fixedTotal;
	}

	public Integer getFinishedTotal() {
		return this.finishedTotal;
	}

	public void setFinishedTotal(Integer finishedTotal) {
		this.finishedTotal = finishedTotal;
	}

	public List<AlertInfoStatisticalModel> getAlertInfoStatisticalModels() {
		return this.alertInfoStatisticalModels;
	}

	public void setAlertInfoStatisticalModels(List<AlertInfoStatisticalModel> alertInfoStatisticalModels) {
		this.alertInfoStatisticalModels = alertInfoStatisticalModels;
	}

	public static class AlertInfoStatisticalModel {

		private Integer alertWaitTotal;

		private Integer alertProcessingTotal;

		private Integer alertFixedTotal;

		private Integer alertFinishedTotal;

		private String alertLevel;

		public Integer getAlertWaitTotal() {
			return this.alertWaitTotal;
		}

		public void setAlertWaitTotal(Integer alertWaitTotal) {
			this.alertWaitTotal = alertWaitTotal;
		}

		public Integer getAlertProcessingTotal() {
			return this.alertProcessingTotal;
		}

		public void setAlertProcessingTotal(Integer alertProcessingTotal) {
			this.alertProcessingTotal = alertProcessingTotal;
		}

		public Integer getAlertFixedTotal() {
			return this.alertFixedTotal;
		}

		public void setAlertFixedTotal(Integer alertFixedTotal) {
			this.alertFixedTotal = alertFixedTotal;
		}

		public Integer getAlertFinishedTotal() {
			return this.alertFinishedTotal;
		}

		public void setAlertFinishedTotal(Integer alertFinishedTotal) {
			this.alertFinishedTotal = alertFinishedTotal;
		}

		public String getAlertLevel() {
			return this.alertLevel;
		}

		public void setAlertLevel(String alertLevel) {
			this.alertLevel = alertLevel;
		}
	}

	@Override
	public OpsDescribeAlertStatisticsResponse getInstance(UnmarshallerContext context) {
		return	OpsDescribeAlertStatisticsResponseUnmarshaller.unmarshall(this, context);
	}
}
