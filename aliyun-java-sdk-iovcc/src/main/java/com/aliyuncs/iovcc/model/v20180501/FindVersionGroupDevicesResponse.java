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

package com.aliyuncs.iovcc.model.v20180501;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.iovcc.transform.v20180501.FindVersionGroupDevicesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class FindVersionGroupDevicesResponse extends AcsResponse {

	private String requestId;

	private GroupDeviceList groupDeviceList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public GroupDeviceList getGroupDeviceList() {
		return this.groupDeviceList;
	}

	public void setGroupDeviceList(GroupDeviceList groupDeviceList) {
		this.groupDeviceList = groupDeviceList;
	}

	public static class GroupDeviceList {

		private Integer totalCount;

		private List<ItemsItem> items;

		public Integer getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Integer totalCount) {
			this.totalCount = totalCount;
		}

		public List<ItemsItem> getItems() {
			return this.items;
		}

		public void setItems(List<ItemsItem> items) {
			this.items = items;
		}

		public static class ItemsItem {

			private String id;

			private String deviceId;

			private String idType;

			private String originalId;

			private String gmtCreate;

			private Long gmtCreateTimestamp;

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public String getDeviceId() {
				return this.deviceId;
			}

			public void setDeviceId(String deviceId) {
				this.deviceId = deviceId;
			}

			public String getIdType() {
				return this.idType;
			}

			public void setIdType(String idType) {
				this.idType = idType;
			}

			public String getOriginalId() {
				return this.originalId;
			}

			public void setOriginalId(String originalId) {
				this.originalId = originalId;
			}

			public String getGmtCreate() {
				return this.gmtCreate;
			}

			public void setGmtCreate(String gmtCreate) {
				this.gmtCreate = gmtCreate;
			}

			public Long getGmtCreateTimestamp() {
				return this.gmtCreateTimestamp;
			}

			public void setGmtCreateTimestamp(Long gmtCreateTimestamp) {
				this.gmtCreateTimestamp = gmtCreateTimestamp;
			}
		}
	}

	@Override
	public FindVersionGroupDevicesResponse getInstance(UnmarshallerContext context) {
		return	FindVersionGroupDevicesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
