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

package com.aliyuncs.resourcemanager.model.v20200331;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.resourcemanager.transform.v20200331.AcceptHandshakeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class AcceptHandshakeResponse extends AcsResponse {

	private String requestId;

	private Handshake handshake;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Handshake getHandshake() {
		return this.handshake;
	}

	public void setHandshake(Handshake handshake) {
		this.handshake = handshake;
	}

	public static class Handshake {

		private String handshakeId;

		private String resourceDirectoryId;

		private String masterAccountId;

		private String masterAccountName;

		private String targetEntity;

		private String targetType;

		private String note;

		private String status;

		private String createTime;

		private String modifyTime;

		private String expireTime;

		public String getHandshakeId() {
			return this.handshakeId;
		}

		public void setHandshakeId(String handshakeId) {
			this.handshakeId = handshakeId;
		}

		public String getResourceDirectoryId() {
			return this.resourceDirectoryId;
		}

		public void setResourceDirectoryId(String resourceDirectoryId) {
			this.resourceDirectoryId = resourceDirectoryId;
		}

		public String getMasterAccountId() {
			return this.masterAccountId;
		}

		public void setMasterAccountId(String masterAccountId) {
			this.masterAccountId = masterAccountId;
		}

		public String getMasterAccountName() {
			return this.masterAccountName;
		}

		public void setMasterAccountName(String masterAccountName) {
			this.masterAccountName = masterAccountName;
		}

		public String getTargetEntity() {
			return this.targetEntity;
		}

		public void setTargetEntity(String targetEntity) {
			this.targetEntity = targetEntity;
		}

		public String getTargetType() {
			return this.targetType;
		}

		public void setTargetType(String targetType) {
			this.targetType = targetType;
		}

		public String getNote() {
			return this.note;
		}

		public void setNote(String note) {
			this.note = note;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getModifyTime() {
			return this.modifyTime;
		}

		public void setModifyTime(String modifyTime) {
			this.modifyTime = modifyTime;
		}

		public String getExpireTime() {
			return this.expireTime;
		}

		public void setExpireTime(String expireTime) {
			this.expireTime = expireTime;
		}
	}

	@Override
	public AcceptHandshakeResponse getInstance(UnmarshallerContext context) {
		return	AcceptHandshakeResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
