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

package com.aliyuncs.quickbi_public.model.v20200808;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.quickbi_public.transform.v20200808.ListPortalMenuAuthorizationResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListPortalMenuAuthorizationResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private List<Data> result;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<Data> getResult() {
		return this.result;
	}

	public void setResult(List<Data> result) {
		this.result = result;
	}

	public static class Data {

		private String menuId;

		private Boolean showOnlyWithAccess;

		private List<ReceiversItem> receivers;

		public String getMenuId() {
			return this.menuId;
		}

		public void setMenuId(String menuId) {
			this.menuId = menuId;
		}

		public Boolean getShowOnlyWithAccess() {
			return this.showOnlyWithAccess;
		}

		public void setShowOnlyWithAccess(Boolean showOnlyWithAccess) {
			this.showOnlyWithAccess = showOnlyWithAccess;
		}

		public List<ReceiversItem> getReceivers() {
			return this.receivers;
		}

		public void setReceivers(List<ReceiversItem> receivers) {
			this.receivers = receivers;
		}

		public static class ReceiversItem {

			private String receiverId;

			private Integer receiverType;

			public String getReceiverId() {
				return this.receiverId;
			}

			public void setReceiverId(String receiverId) {
				this.receiverId = receiverId;
			}

			public Integer getReceiverType() {
				return this.receiverType;
			}

			public void setReceiverType(Integer receiverType) {
				this.receiverType = receiverType;
			}
		}
	}

	@Override
	public ListPortalMenuAuthorizationResponse getInstance(UnmarshallerContext context) {
		return	ListPortalMenuAuthorizationResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
