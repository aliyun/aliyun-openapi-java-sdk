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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.iovcc.transform.v20180501.DescribeVersionDeviceGroupResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeVersionDeviceGroupResponse extends AcsResponse {

	private String requestId;

	private DeviceGroup deviceGroup;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public DeviceGroup getDeviceGroup() {
		return this.deviceGroup;
	}

	public void setDeviceGroup(DeviceGroup deviceGroup) {
		this.deviceGroup = deviceGroup;
	}

	public static class DeviceGroup {

		private Long id;

		private String name;

		private String description;

		private String gmtCreate;

		private String gmtModify;

		private String maxCount;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getGmtModify() {
			return this.gmtModify;
		}

		public void setGmtModify(String gmtModify) {
			this.gmtModify = gmtModify;
		}

		public String getMaxCount() {
			return this.maxCount;
		}

		public void setMaxCount(String maxCount) {
			this.maxCount = maxCount;
		}
	}

	@Override
	public DescribeVersionDeviceGroupResponse getInstance(UnmarshallerContext context) {
		return	DescribeVersionDeviceGroupResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
