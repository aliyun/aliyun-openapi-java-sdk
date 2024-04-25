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

package com.aliyuncs.csas.model.v20230120;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.csas.transform.v20230120.ListIdpConfigsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListIdpConfigsResponse extends AcsResponse {

	private String requestId;

	private Data data;

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

		private Long totalNum;

		private List<DataListItem> dataList;

		public Long getTotalNum() {
			return this.totalNum;
		}

		public void setTotalNum(Long totalNum) {
			this.totalNum = totalNum;
		}

		public List<DataListItem> getDataList() {
			return this.dataList;
		}

		public void setDataList(List<DataListItem> dataList) {
			this.dataList = dataList;
		}

		public static class DataListItem {

			private String id;

			private String name;

			private String type;

			private String description;

			private String mfa;

			private String mobileLoginType;

			private String mobileMfaConfigType;

			private String multiIdpInfo;

			private String pcLoginType;

			private String status;

			private String updateTime;

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getMfa() {
				return this.mfa;
			}

			public void setMfa(String mfa) {
				this.mfa = mfa;
			}

			public String getMobileLoginType() {
				return this.mobileLoginType;
			}

			public void setMobileLoginType(String mobileLoginType) {
				this.mobileLoginType = mobileLoginType;
			}

			public String getMobileMfaConfigType() {
				return this.mobileMfaConfigType;
			}

			public void setMobileMfaConfigType(String mobileMfaConfigType) {
				this.mobileMfaConfigType = mobileMfaConfigType;
			}

			public String getMultiIdpInfo() {
				return this.multiIdpInfo;
			}

			public void setMultiIdpInfo(String multiIdpInfo) {
				this.multiIdpInfo = multiIdpInfo;
			}

			public String getPcLoginType() {
				return this.pcLoginType;
			}

			public void setPcLoginType(String pcLoginType) {
				this.pcLoginType = pcLoginType;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getUpdateTime() {
				return this.updateTime;
			}

			public void setUpdateTime(String updateTime) {
				this.updateTime = updateTime;
			}
		}
	}

	@Override
	public ListIdpConfigsResponse getInstance(UnmarshallerContext context) {
		return	ListIdpConfigsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
