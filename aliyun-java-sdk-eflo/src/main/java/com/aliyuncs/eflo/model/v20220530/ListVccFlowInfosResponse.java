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

package com.aliyuncs.eflo.model.v20220530;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.eflo.transform.v20220530.ListVccFlowInfosResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListVccFlowInfosResponse extends AcsResponse {

	private Integer code;

	private String message;

	private String requestId;

	private Content content;

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Content getContent() {
		return this.content;
	}

	public void setContent(Content content) {
		this.content = content;
	}

	public static class Content {

		private Long total;

		private List<DataItem> data;

		public Long getTotal() {
			return this.total;
		}

		public void setTotal(Long total) {
			this.total = total;
		}

		public List<DataItem> getData() {
			return this.data;
		}

		public void setData(List<DataItem> data) {
			this.data = data;
		}

		public static class DataItem {

			private String regionId;

			private String vccId;

			private String metricName;

			private String direction;

			private Long timestamp;

			private Double value;

			public String getRegionId() {
				return this.regionId;
			}

			public void setRegionId(String regionId) {
				this.regionId = regionId;
			}

			public String getVccId() {
				return this.vccId;
			}

			public void setVccId(String vccId) {
				this.vccId = vccId;
			}

			public String getMetricName() {
				return this.metricName;
			}

			public void setMetricName(String metricName) {
				this.metricName = metricName;
			}

			public String getDirection() {
				return this.direction;
			}

			public void setDirection(String direction) {
				this.direction = direction;
			}

			public Long getTimestamp() {
				return this.timestamp;
			}

			public void setTimestamp(Long timestamp) {
				this.timestamp = timestamp;
			}

			public Double getValue() {
				return this.value;
			}

			public void setValue(Double value) {
				this.value = value;
			}
		}
	}

	@Override
	public ListVccFlowInfosResponse getInstance(UnmarshallerContext context) {
		return	ListVccFlowInfosResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
