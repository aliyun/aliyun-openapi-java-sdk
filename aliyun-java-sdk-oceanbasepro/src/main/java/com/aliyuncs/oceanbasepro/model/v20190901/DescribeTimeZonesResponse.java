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

package com.aliyuncs.oceanbasepro.model.v20190901;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.oceanbasepro.transform.v20190901.DescribeTimeZonesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeTimeZonesResponse extends AcsResponse {

	private String requestId;

	private TimeZones timeZones;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public TimeZones getTimeZones() {
		return this.timeZones;
	}

	public void setTimeZones(TimeZones timeZones) {
		this.timeZones = timeZones;
	}

	public static class TimeZones {

		private String _default;

		private List<ListItem> list;

		public String get_Default() {
			return this._default;
		}

		public void set_Default(String _default) {
			this._default = _default;
		}

		public List<ListItem> getList() {
			return this.list;
		}

		public void setList(List<ListItem> list) {
			this.list = list;
		}

		public static class ListItem {

			private String timeZone;

			private String description;

			public String getTimeZone() {
				return this.timeZone;
			}

			public void setTimeZone(String timeZone) {
				this.timeZone = timeZone;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}
		}
	}

	@Override
	public DescribeTimeZonesResponse getInstance(UnmarshallerContext context) {
		return	DescribeTimeZonesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
