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

package com.aliyuncs.csb.model.v20171118;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.csb.transform.v20171118.FindAllLinkRuleResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class FindAllLinkRuleResponse extends AcsResponse {

	private Integer code;

	private String message;

	private String requestId;

	private Data data;

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private List<LinkRuleListItem> linkRuleList;

		public List<LinkRuleListItem> getLinkRuleList() {
			return this.linkRuleList;
		}

		public void setLinkRuleList(List<LinkRuleListItem> linkRuleList) {
			this.linkRuleList = linkRuleList;
		}

		public static class LinkRuleListItem {

			private Long csbId;

			private String ownerId;

			private Long gmtCreate;

			private Long gmtModified;

			private Long id;

			private Integer deleted;

			private String originName;

			private String targetName;

			public Long getCsbId() {
				return this.csbId;
			}

			public void setCsbId(Long csbId) {
				this.csbId = csbId;
			}

			public String getOwnerId() {
				return this.ownerId;
			}

			public void setOwnerId(String ownerId) {
				this.ownerId = ownerId;
			}

			public Long getGmtCreate() {
				return this.gmtCreate;
			}

			public void setGmtCreate(Long gmtCreate) {
				this.gmtCreate = gmtCreate;
			}

			public Long getGmtModified() {
				return this.gmtModified;
			}

			public void setGmtModified(Long gmtModified) {
				this.gmtModified = gmtModified;
			}

			public Long getId() {
				return this.id;
			}

			public void setId(Long id) {
				this.id = id;
			}

			public Integer getDeleted() {
				return this.deleted;
			}

			public void setDeleted(Integer deleted) {
				this.deleted = deleted;
			}

			public String getOriginName() {
				return this.originName;
			}

			public void setOriginName(String originName) {
				this.originName = originName;
			}

			public String getTargetName() {
				return this.targetName;
			}

			public void setTargetName(String targetName) {
				this.targetName = targetName;
			}
		}
	}

	@Override
	public FindAllLinkRuleResponse getInstance(UnmarshallerContext context) {
		return	FindAllLinkRuleResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
