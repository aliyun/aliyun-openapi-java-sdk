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

package com.aliyuncs.ga.model.v20191120;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ga.transform.v20191120.GetAclResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetAclResponse extends AcsResponse {

	private String requestId;

	private String aclId;

	private String addressIPVersion;

	private String aclStatus;

	private String aclName;

	private List<AclEntriesItem> aclEntries;

	private List<RelatedListenersItem> relatedListeners;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getAclId() {
		return this.aclId;
	}

	public void setAclId(String aclId) {
		this.aclId = aclId;
	}

	public String getAddressIPVersion() {
		return this.addressIPVersion;
	}

	public void setAddressIPVersion(String addressIPVersion) {
		this.addressIPVersion = addressIPVersion;
	}

	public String getAclStatus() {
		return this.aclStatus;
	}

	public void setAclStatus(String aclStatus) {
		this.aclStatus = aclStatus;
	}

	public String getAclName() {
		return this.aclName;
	}

	public void setAclName(String aclName) {
		this.aclName = aclName;
	}

	public List<AclEntriesItem> getAclEntries() {
		return this.aclEntries;
	}

	public void setAclEntries(List<AclEntriesItem> aclEntries) {
		this.aclEntries = aclEntries;
	}

	public List<RelatedListenersItem> getRelatedListeners() {
		return this.relatedListeners;
	}

	public void setRelatedListeners(List<RelatedListenersItem> relatedListeners) {
		this.relatedListeners = relatedListeners;
	}

	public static class AclEntriesItem {

		private String entry;

		private String entryDescription;

		public String getEntry() {
			return this.entry;
		}

		public void setEntry(String entry) {
			this.entry = entry;
		}

		public String getEntryDescription() {
			return this.entryDescription;
		}

		public void setEntryDescription(String entryDescription) {
			this.entryDescription = entryDescription;
		}
	}

	public static class RelatedListenersItem {

		private String listenerId;

		private String aclType;

		private String acceleratorId;

		public String getListenerId() {
			return this.listenerId;
		}

		public void setListenerId(String listenerId) {
			this.listenerId = listenerId;
		}

		public String getAclType() {
			return this.aclType;
		}

		public void setAclType(String aclType) {
			this.aclType = aclType;
		}

		public String getAcceleratorId() {
			return this.acceleratorId;
		}

		public void setAcceleratorId(String acceleratorId) {
			this.acceleratorId = acceleratorId;
		}
	}

	@Override
	public GetAclResponse getInstance(UnmarshallerContext context) {
		return	GetAclResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
