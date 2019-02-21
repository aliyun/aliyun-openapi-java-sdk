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

package com.aliyuncs.linkface.model.v20180720;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.linkface.transform.v20180720.QueryFaceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryFaceResponse extends AcsResponse {

	private String requestId;

	private Integer code;

	private String message;

	private Boolean success;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

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

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private List<UserFaceMetasItem> userFaceMetas;

		private List<String> groupIds;

		public List<UserFaceMetasItem> getUserFaceMetas() {
			return this.userFaceMetas;
		}

		public void setUserFaceMetas(List<UserFaceMetasItem> userFaceMetas) {
			this.userFaceMetas = userFaceMetas;
		}

		public List<String> getGroupIds() {
			return this.groupIds;
		}

		public void setGroupIds(List<String> groupIds) {
			this.groupIds = groupIds;
		}

		public static class UserFaceMetasItem {

			private String clientTag;

			private Integer index;

			private String faceUrl;

			private String userInfo;

			public String getClientTag() {
				return this.clientTag;
			}

			public void setClientTag(String clientTag) {
				this.clientTag = clientTag;
			}

			public Integer getIndex() {
				return this.index;
			}

			public void setIndex(Integer index) {
				this.index = index;
			}

			public String getFaceUrl() {
				return this.faceUrl;
			}

			public void setFaceUrl(String faceUrl) {
				this.faceUrl = faceUrl;
			}

			public String getUserInfo() {
				return this.userInfo;
			}

			public void setUserInfo(String userInfo) {
				this.userInfo = userInfo;
			}
		}
	}

	@Override
	public QueryFaceResponse getInstance(UnmarshallerContext context) {
		return	QueryFaceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
