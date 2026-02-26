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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloud_siem.transform.v20220616.DescribeProdCountResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeProdCountResponse extends AcsResponse {

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

		private Integer aliyunProdCount;

		private Integer hcloudProdCount;

		private Integer qcloudProdCount;

		private Integer idcProdCount;

		private Integer aliyunImportedCount;

		private Integer hcloudImportedCount;

		private Integer qcloudImportedCount;

		private Integer idcImportedCount;

		public Integer getAliyunProdCount() {
			return this.aliyunProdCount;
		}

		public void setAliyunProdCount(Integer aliyunProdCount) {
			this.aliyunProdCount = aliyunProdCount;
		}

		public Integer getHcloudProdCount() {
			return this.hcloudProdCount;
		}

		public void setHcloudProdCount(Integer hcloudProdCount) {
			this.hcloudProdCount = hcloudProdCount;
		}

		public Integer getQcloudProdCount() {
			return this.qcloudProdCount;
		}

		public void setQcloudProdCount(Integer qcloudProdCount) {
			this.qcloudProdCount = qcloudProdCount;
		}

		public Integer getIdcProdCount() {
			return this.idcProdCount;
		}

		public void setIdcProdCount(Integer idcProdCount) {
			this.idcProdCount = idcProdCount;
		}

		public Integer getAliyunImportedCount() {
			return this.aliyunImportedCount;
		}

		public void setAliyunImportedCount(Integer aliyunImportedCount) {
			this.aliyunImportedCount = aliyunImportedCount;
		}

		public Integer getHcloudImportedCount() {
			return this.hcloudImportedCount;
		}

		public void setHcloudImportedCount(Integer hcloudImportedCount) {
			this.hcloudImportedCount = hcloudImportedCount;
		}

		public Integer getQcloudImportedCount() {
			return this.qcloudImportedCount;
		}

		public void setQcloudImportedCount(Integer qcloudImportedCount) {
			this.qcloudImportedCount = qcloudImportedCount;
		}

		public Integer getIdcImportedCount() {
			return this.idcImportedCount;
		}

		public void setIdcImportedCount(Integer idcImportedCount) {
			this.idcImportedCount = idcImportedCount;
		}
	}

	@Override
	public DescribeProdCountResponse getInstance(UnmarshallerContext context) {
		return	DescribeProdCountResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
