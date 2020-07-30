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

package com.aliyuncs.opensearch.model.v20171225;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.opensearch.transform.v20171225.ListABTestMetricsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListABTestMetricsResponse extends AcsResponse {

	private String requestId;

	private List<ResultItem> result;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ResultItem> getResult() {
		return this.result;
	}

	public void setResult(List<ResultItem> result) {
		this.result = result;
	}

	public static class ResultItem {

		private String experimentName;

		private String date;

		private Integer pv;

		private Integer ipv;

		private Integer uv;

		private Integer ipvUv;

		private Float ctr;

		private Float zeroHitRate;

		public String getExperimentName() {
			return this.experimentName;
		}

		public void setExperimentName(String experimentName) {
			this.experimentName = experimentName;
		}

		public String getDate() {
			return this.date;
		}

		public void setDate(String date) {
			this.date = date;
		}

		public Integer getPv() {
			return this.pv;
		}

		public void setPv(Integer pv) {
			this.pv = pv;
		}

		public Integer getIpv() {
			return this.ipv;
		}

		public void setIpv(Integer ipv) {
			this.ipv = ipv;
		}

		public Integer getUv() {
			return this.uv;
		}

		public void setUv(Integer uv) {
			this.uv = uv;
		}

		public Integer getIpvUv() {
			return this.ipvUv;
		}

		public void setIpvUv(Integer ipvUv) {
			this.ipvUv = ipvUv;
		}

		public Float getCtr() {
			return this.ctr;
		}

		public void setCtr(Float ctr) {
			this.ctr = ctr;
		}

		public Float getZeroHitRate() {
			return this.zeroHitRate;
		}

		public void setZeroHitRate(Float zeroHitRate) {
			this.zeroHitRate = zeroHitRate;
		}
	}

	@Override
	public ListABTestMetricsResponse getInstance(UnmarshallerContext context) {
		return	ListABTestMetricsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
