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

package com.aliyuncs.cloud_siem.model.v20220616;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloud_siem.transform.v20220616.ListImportedLogsByProdResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListImportedLogsByProdResponse extends AcsResponse {

	private String requestId;

	private List<DataItem> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private String prodCode;

		private String logCode;

		private String logMdsCode;

		private Integer importedUserCount;

		private Integer unImportedUserCount;

		private Integer totalUserCount;

		private String modifyTime;

		private Integer imported;

		private Integer autoImported;

		private String cloudCode;

		public String getProdCode() {
			return this.prodCode;
		}

		public void setProdCode(String prodCode) {
			this.prodCode = prodCode;
		}

		public String getLogCode() {
			return this.logCode;
		}

		public void setLogCode(String logCode) {
			this.logCode = logCode;
		}

		public String getLogMdsCode() {
			return this.logMdsCode;
		}

		public void setLogMdsCode(String logMdsCode) {
			this.logMdsCode = logMdsCode;
		}

		public Integer getImportedUserCount() {
			return this.importedUserCount;
		}

		public void setImportedUserCount(Integer importedUserCount) {
			this.importedUserCount = importedUserCount;
		}

		public Integer getUnImportedUserCount() {
			return this.unImportedUserCount;
		}

		public void setUnImportedUserCount(Integer unImportedUserCount) {
			this.unImportedUserCount = unImportedUserCount;
		}

		public Integer getTotalUserCount() {
			return this.totalUserCount;
		}

		public void setTotalUserCount(Integer totalUserCount) {
			this.totalUserCount = totalUserCount;
		}

		public String getModifyTime() {
			return this.modifyTime;
		}

		public void setModifyTime(String modifyTime) {
			this.modifyTime = modifyTime;
		}

		public Integer getImported() {
			return this.imported;
		}

		public void setImported(Integer imported) {
			this.imported = imported;
		}

		public Integer getAutoImported() {
			return this.autoImported;
		}

		public void setAutoImported(Integer autoImported) {
			this.autoImported = autoImported;
		}

		public String getCloudCode() {
			return this.cloudCode;
		}

		public void setCloudCode(String cloudCode) {
			this.cloudCode = cloudCode;
		}
	}

	@Override
	public ListImportedLogsByProdResponse getInstance(UnmarshallerContext context) {
		return	ListImportedLogsByProdResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
