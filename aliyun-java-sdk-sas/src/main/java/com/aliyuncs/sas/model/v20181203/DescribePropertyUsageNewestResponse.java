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

package com.aliyuncs.sas.model.v20181203;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sas.transform.v20181203.DescribePropertyUsageNewestResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribePropertyUsageNewestResponse extends AcsResponse {

	private String requestId;

	private Integer itemCount;

	private String type;

	private List<NewestStatisticItem> newestStatisticItems;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getItemCount() {
		return this.itemCount;
	}

	public void setItemCount(Integer itemCount) {
		this.itemCount = itemCount;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<NewestStatisticItem> getNewestStatisticItems() {
		return this.newestStatisticItems;
	}

	public void setNewestStatisticItems(List<NewestStatisticItem> newestStatisticItems) {
		this.newestStatisticItems = newestStatisticItems;
	}

	public static class NewestStatisticItem {

		private String name;

		private Long create;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Long getCreate() {
			return this.create;
		}

		public void setCreate(Long create) {
			this.create = create;
		}
	}

	@Override
	public DescribePropertyUsageNewestResponse getInstance(UnmarshallerContext context) {
		return	DescribePropertyUsageNewestResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
