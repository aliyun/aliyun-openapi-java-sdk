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

package com.aliyuncs.ons.model.v20190214;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ons.transform.v20190214.OnsMqttQueryHistoryOnlineResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OnsMqttQueryHistoryOnlineResponse extends AcsResponse {

	private String requestId;

	private String helpUrl;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getHelpUrl() {
		return this.helpUrl;
	}

	public void setHelpUrl(String helpUrl) {
		this.helpUrl = helpUrl;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String title;

		private String xUnit;

		private String yUnit;

		private List<StatsDataDo> records;

		public String getTitle() {
			return this.title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getXUnit() {
			return this.xUnit;
		}

		public void setXUnit(String xUnit) {
			this.xUnit = xUnit;
		}

		public String getYUnit() {
			return this.yUnit;
		}

		public void setYUnit(String yUnit) {
			this.yUnit = yUnit;
		}

		public List<StatsDataDo> getRecords() {
			return this.records;
		}

		public void setRecords(List<StatsDataDo> records) {
			this.records = records;
		}

		public static class StatsDataDo {

			private Long x;

			private Float y;

			public Long getX() {
				return this.x;
			}

			public void setX(Long x) {
				this.x = x;
			}

			public Float getY() {
				return this.y;
			}

			public void setY(Float y) {
				this.y = y;
			}
		}
	}

	@Override
	public OnsMqttQueryHistoryOnlineResponse getInstance(UnmarshallerContext context) {
		return	OnsMqttQueryHistoryOnlineResponseUnmarshaller.unmarshall(this, context);
	}
}
