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

package com.aliyuncs.rtc.model.v20180111;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.rtc.transform.v20180111.DescribeUserInfoInChannelResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeUserInfoInChannelResponse extends AcsResponse {

	private String requestId;

	private Integer timestamp;

	private Boolean isChannelExist;

	private Boolean isInChannel;

	private List<PropertyItem> property;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTimestamp() {
		return this.timestamp;
	}

	public void setTimestamp(Integer timestamp) {
		this.timestamp = timestamp;
	}

	public Boolean getIsChannelExist() {
		return this.isChannelExist;
	}

	public void setIsChannelExist(Boolean isChannelExist) {
		this.isChannelExist = isChannelExist;
	}

	public Boolean getIsInChannel() {
		return this.isInChannel;
	}

	public void setIsInChannel(Boolean isInChannel) {
		this.isInChannel = isInChannel;
	}

	public List<PropertyItem> getProperty() {
		return this.property;
	}

	public void setProperty(List<PropertyItem> property) {
		this.property = property;
	}

	public static class PropertyItem {

		private String session;

		private Integer join;

		private Integer role;

		public String getSession() {
			return this.session;
		}

		public void setSession(String session) {
			this.session = session;
		}

		public Integer getJoin() {
			return this.join;
		}

		public void setJoin(Integer join) {
			this.join = join;
		}

		public Integer getRole() {
			return this.role;
		}

		public void setRole(Integer role) {
			this.role = role;
		}
	}

	@Override
	public DescribeUserInfoInChannelResponse getInstance(UnmarshallerContext context) {
		return	DescribeUserInfoInChannelResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
