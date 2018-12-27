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
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.aegis.transform.v20161111.DescribeNsasSuspEventTypeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeNsasSuspEventTypeResponse extends AcsResponse {

	private String requestId;

	private List<Data> eventTypes;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Data> getEventTypes() {
		return this.eventTypes;
	}

	public void setEventTypes(List<Data> eventTypes) {
		this.eventTypes = eventTypes;
	}

	public static class Data {

		private String name;

		private String type;

		private Integer suspEventCount;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public Integer getSuspEventCount() {
			return this.suspEventCount;
		}

		public void setSuspEventCount(Integer suspEventCount) {
			this.suspEventCount = suspEventCount;
		}
	}

	@Override
	public DescribeNsasSuspEventTypeResponse getInstance(UnmarshallerContext context) {
		return	DescribeNsasSuspEventTypeResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
