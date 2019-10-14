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

package com.aliyuncs.linkwan.model.v20190301;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.linkwan.transform.v20190301.ListOwnedJoinPermissionsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListOwnedJoinPermissionsResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Data data;

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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Long totalCount;

		private List<JoinPermission> list;

		public Long getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Long totalCount) {
			this.totalCount = totalCount;
		}

		public List<JoinPermission> getList() {
			return this.list;
		}

		public void setList(List<JoinPermission> list) {
			this.list = list;
		}

		public static class JoinPermission {

			private String joinPermissionId;

			private String renterAliyunId;

			private String joinEui;

			private Long freqBandPlanGroupId;

			private String classMode;

			private String authState;

			private Boolean enabled;

			private String joinPermissionName;

			private Long rxDelay;

			private Long dataRate;

			public String getJoinPermissionId() {
				return this.joinPermissionId;
			}

			public void setJoinPermissionId(String joinPermissionId) {
				this.joinPermissionId = joinPermissionId;
			}

			public String getRenterAliyunId() {
				return this.renterAliyunId;
			}

			public void setRenterAliyunId(String renterAliyunId) {
				this.renterAliyunId = renterAliyunId;
			}

			public String getJoinEui() {
				return this.joinEui;
			}

			public void setJoinEui(String joinEui) {
				this.joinEui = joinEui;
			}

			public Long getFreqBandPlanGroupId() {
				return this.freqBandPlanGroupId;
			}

			public void setFreqBandPlanGroupId(Long freqBandPlanGroupId) {
				this.freqBandPlanGroupId = freqBandPlanGroupId;
			}

			public String getClassMode() {
				return this.classMode;
			}

			public void setClassMode(String classMode) {
				this.classMode = classMode;
			}

			public String getAuthState() {
				return this.authState;
			}

			public void setAuthState(String authState) {
				this.authState = authState;
			}

			public Boolean getEnabled() {
				return this.enabled;
			}

			public void setEnabled(Boolean enabled) {
				this.enabled = enabled;
			}

			public String getJoinPermissionName() {
				return this.joinPermissionName;
			}

			public void setJoinPermissionName(String joinPermissionName) {
				this.joinPermissionName = joinPermissionName;
			}

			public Long getRxDelay() {
				return this.rxDelay;
			}

			public void setRxDelay(Long rxDelay) {
				this.rxDelay = rxDelay;
			}

			public Long getDataRate() {
				return this.dataRate;
			}

			public void setDataRate(Long dataRate) {
				this.dataRate = dataRate;
			}
		}
	}

	@Override
	public ListOwnedJoinPermissionsResponse getInstance(UnmarshallerContext context) {
		return	ListOwnedJoinPermissionsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
