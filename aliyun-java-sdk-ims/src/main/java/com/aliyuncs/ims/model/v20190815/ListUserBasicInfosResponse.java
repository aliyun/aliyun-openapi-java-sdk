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

package com.aliyuncs.ims.model.v20190815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ims.transform.v20190815.ListUserBasicInfosResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListUserBasicInfosResponse extends AcsResponse {

	private String requestId;

	private Boolean isTruncated;

	private String marker;

	private List<UserBasicInfo> userBasicInfos;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getIsTruncated() {
		return this.isTruncated;
	}

	public void setIsTruncated(Boolean isTruncated) {
		this.isTruncated = isTruncated;
	}

	public String getMarker() {
		return this.marker;
	}

	public void setMarker(String marker) {
		this.marker = marker;
	}

	public List<UserBasicInfo> getUserBasicInfos() {
		return this.userBasicInfos;
	}

	public void setUserBasicInfos(List<UserBasicInfo> userBasicInfos) {
		this.userBasicInfos = userBasicInfos;
	}

	public static class UserBasicInfo {

		private String userPrincipalName;

		private String displayName;

		private String userId;

		private String status;

		public String getUserPrincipalName() {
			return this.userPrincipalName;
		}

		public void setUserPrincipalName(String userPrincipalName) {
			this.userPrincipalName = userPrincipalName;
		}

		public String getDisplayName() {
			return this.displayName;
		}

		public void setDisplayName(String displayName) {
			this.displayName = displayName;
		}

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}
	}

	@Override
	public ListUserBasicInfosResponse getInstance(UnmarshallerContext context) {
		return	ListUserBasicInfosResponseUnmarshaller.unmarshall(this, context);
	}
}
