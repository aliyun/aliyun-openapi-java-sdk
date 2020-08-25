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

package com.aliyuncs.sofa.model.v20190815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sofa.transform.v20190815.QueryCasLoadbalanceImportResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryCasLoadbalanceImportResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private List<DataItem> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private String iaasId;

		private String name;

		private String networkType;

		private String utcCreate;

		private List<String> innerIpAddress;

		private List<String> publicIpAddress;

		private ImportInfo importInfo;

		public String getIaasId() {
			return this.iaasId;
		}

		public void setIaasId(String iaasId) {
			this.iaasId = iaasId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getNetworkType() {
			return this.networkType;
		}

		public void setNetworkType(String networkType) {
			this.networkType = networkType;
		}

		public String getUtcCreate() {
			return this.utcCreate;
		}

		public void setUtcCreate(String utcCreate) {
			this.utcCreate = utcCreate;
		}

		public List<String> getInnerIpAddress() {
			return this.innerIpAddress;
		}

		public void setInnerIpAddress(List<String> innerIpAddress) {
			this.innerIpAddress = innerIpAddress;
		}

		public List<String> getPublicIpAddress() {
			return this.publicIpAddress;
		}

		public void setPublicIpAddress(List<String> publicIpAddress) {
			this.publicIpAddress = publicIpAddress;
		}

		public ImportInfo getImportInfo() {
			return this.importInfo;
		}

		public void setImportInfo(ImportInfo importInfo) {
			this.importInfo = importInfo;
		}

		public static class ImportInfo {

			private String importedWorkspaceName;

			private Boolean isImported;

			private Boolean isUnimportable;

			private String unimportableReason;

			public String getImportedWorkspaceName() {
				return this.importedWorkspaceName;
			}

			public void setImportedWorkspaceName(String importedWorkspaceName) {
				this.importedWorkspaceName = importedWorkspaceName;
			}

			public Boolean getIsImported() {
				return this.isImported;
			}

			public void setIsImported(Boolean isImported) {
				this.isImported = isImported;
			}

			public Boolean getIsUnimportable() {
				return this.isUnimportable;
			}

			public void setIsUnimportable(Boolean isUnimportable) {
				this.isUnimportable = isUnimportable;
			}

			public String getUnimportableReason() {
				return this.unimportableReason;
			}

			public void setUnimportableReason(String unimportableReason) {
				this.unimportableReason = unimportableReason;
			}
		}
	}

	@Override
	public QueryCasLoadbalanceImportResponse getInstance(UnmarshallerContext context) {
		return	QueryCasLoadbalanceImportResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
