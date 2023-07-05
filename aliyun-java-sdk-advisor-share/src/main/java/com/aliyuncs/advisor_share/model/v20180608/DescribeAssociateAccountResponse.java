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

package com.aliyuncs.advisor_share.model.v20180608;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.advisor_share.transform.v20180608.DescribeAssociateAccountResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAssociateAccountResponse extends AcsResponse {

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

		private List<AssociateAccountListItem> associateAccountList;

		private MasterAccount masterAccount;

		public List<AssociateAccountListItem> getAssociateAccountList() {
			return this.associateAccountList;
		}

		public void setAssociateAccountList(List<AssociateAccountListItem> associateAccountList) {
			this.associateAccountList = associateAccountList;
		}

		public MasterAccount getMasterAccount() {
			return this.masterAccount;
		}

		public void setMasterAccount(MasterAccount masterAccount) {
			this.masterAccount = masterAccount;
		}

		public static class AssociateAccountListItem {

			private Long subAliyunId;

			private String subUserName;

			public Long getSubAliyunId() {
				return this.subAliyunId;
			}

			public void setSubAliyunId(Long subAliyunId) {
				this.subAliyunId = subAliyunId;
			}

			public String getSubUserName() {
				return this.subUserName;
			}

			public void setSubUserName(String subUserName) {
				this.subUserName = subUserName;
			}
		}

		public static class MasterAccount {

			private String userName;

			private Long aliyunId;

			public String getUserName() {
				return this.userName;
			}

			public void setUserName(String userName) {
				this.userName = userName;
			}

			public Long getAliyunId() {
				return this.aliyunId;
			}

			public void setAliyunId(Long aliyunId) {
				this.aliyunId = aliyunId;
			}
		}
	}

	@Override
	public DescribeAssociateAccountResponse getInstance(UnmarshallerContext context) {
		return	DescribeAssociateAccountResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
