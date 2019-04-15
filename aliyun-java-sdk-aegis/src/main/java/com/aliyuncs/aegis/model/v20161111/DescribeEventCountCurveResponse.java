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

package com.aliyuncs.aegis.model.v20161111;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.aegis.transform.v20161111.DescribeEventCountCurveResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeEventCountCurveResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private CurveData curveData;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public CurveData getCurveData() {
		return this.curveData;
	}

	public void setCurveData(CurveData curveData) {
		this.curveData = curveData;
	}

	public static class CurveData {

		private List<Item> items;

		private TimeScope timeScope;

		public List<Item> getItems() {
			return this.items;
		}

		public void setItems(List<Item> items) {
			this.items = items;
		}

		public TimeScope getTimeScope() {
			return this.timeScope;
		}

		public void setTimeScope(TimeScope timeScope) {
			this.timeScope = timeScope;
		}

		public static class Item {

			private String name;

			private List<DataItem> data;

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public List<DataItem> getData() {
				return this.data;
			}

			public void setData(List<DataItem> data) {
				this.data = data;
			}

			public static class DataItem {

				private Integer high;

				private Integer total;

				private Integer low;

				private Integer serious;

				private Integer suspicious;

				private Integer remind;

				private Integer medium;

				public Integer getHigh() {
					return this.high;
				}

				public void setHigh(Integer high) {
					this.high = high;
				}

				public Integer getTotal() {
					return this.total;
				}

				public void setTotal(Integer total) {
					this.total = total;
				}

				public Integer getLow() {
					return this.low;
				}

				public void setLow(Integer low) {
					this.low = low;
				}

				public Integer getSerious() {
					return this.serious;
				}

				public void setSerious(Integer serious) {
					this.serious = serious;
				}

				public Integer getSuspicious() {
					return this.suspicious;
				}

				public void setSuspicious(Integer suspicious) {
					this.suspicious = suspicious;
				}

				public Integer getRemind() {
					return this.remind;
				}

				public void setRemind(Integer remind) {
					this.remind = remind;
				}

				public Integer getMedium() {
					return this.medium;
				}

				public void setMedium(Integer medium) {
					this.medium = medium;
				}
			}
		}

		public static class TimeScope {

			private Long start;

			private Long end;

			private Integer interval;

			private Integer step;

			public Long getStart() {
				return this.start;
			}

			public void setStart(Long start) {
				this.start = start;
			}

			public Long getEnd() {
				return this.end;
			}

			public void setEnd(Long end) {
				this.end = end;
			}

			public Integer getInterval() {
				return this.interval;
			}

			public void setInterval(Integer interval) {
				this.interval = interval;
			}

			public Integer getStep() {
				return this.step;
			}

			public void setStep(Integer step) {
				this.step = step;
			}
		}
	}

	@Override
	public DescribeEventCountCurveResponse getInstance(UnmarshallerContext context) {
		return	DescribeEventCountCurveResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
