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

package com.aliyuncs.vod.model.v20170321;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vod.transform.v20170321.DescribeVodPlayerCollectDataResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeVodPlayerCollectDataResponse extends AcsResponse {

	private String requestId;

	private List<Datas> dataList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Datas> getDataList() {
		return this.dataList;
	}

	public void setDataList(List<Datas> dataList) {
		this.dataList = dataList;
	}

	public static class Datas {

		private String metric;

		private Double value;

		private Double valueRefer;

		private Double valueRatio;

		public String getMetric() {
			return this.metric;
		}

		public void setMetric(String metric) {
			this.metric = metric;
		}

		public Double getValue() {
			return this.value;
		}

		public void setValue(Double value) {
			this.value = value;
		}

		public Double getValueRefer() {
			return this.valueRefer;
		}

		public void setValueRefer(Double valueRefer) {
			this.valueRefer = valueRefer;
		}

		public Double getValueRatio() {
			return this.valueRatio;
		}

		public void setValueRatio(Double valueRatio) {
			this.valueRatio = valueRatio;
		}
	}

	@Override
	public DescribeVodPlayerCollectDataResponse getInstance(UnmarshallerContext context) {
		return	DescribeVodPlayerCollectDataResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
