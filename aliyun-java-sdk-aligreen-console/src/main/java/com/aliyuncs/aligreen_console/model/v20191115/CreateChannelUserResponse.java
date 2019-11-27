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

package com.aliyuncs.aligreen_console.model.v20191115;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.aligreen_console.transform.v20191115.CreateChannelUserResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateChannelUserResponse extends AcsResponse {

	private String requestId;

	private String uid;

	private String notes;

	private String aligreenUid;

	private ChannelInfo channelInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getUid() {
		return this.uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getAligreenUid() {
		return this.aligreenUid;
	}

	public void setAligreenUid(String aligreenUid) {
		this.aligreenUid = aligreenUid;
	}

	public ChannelInfo getChannelInfo() {
		return this.channelInfo;
	}

	public void setChannelInfo(ChannelInfo channelInfo) {
		this.channelInfo = channelInfo;
	}

	public static class ChannelInfo {

		private String name;

		private String owners;

		private String notes;

		private String channel;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getOwners() {
			return this.owners;
		}

		public void setOwners(String owners) {
			this.owners = owners;
		}

		public String getNotes() {
			return this.notes;
		}

		public void setNotes(String notes) {
			this.notes = notes;
		}

		public String getChannel() {
			return this.channel;
		}

		public void setChannel(String channel) {
			this.channel = channel;
		}
	}

	@Override
	public CreateChannelUserResponse getInstance(UnmarshallerContext context) {
		return	CreateChannelUserResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
