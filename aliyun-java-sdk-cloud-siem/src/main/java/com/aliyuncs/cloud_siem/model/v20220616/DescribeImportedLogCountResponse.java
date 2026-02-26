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
import com.aliyuncs.cloud_siem.transform.v20220616.DescribeImportedLogCountResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeImportedLogCountResponse extends AcsResponse {

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

		private Integer totalLogCount;

		private Integer importedLogCount;

		private Integer unImportedLogCount;

		public Integer getTotalLogCount() {
			return this.totalLogCount;
		}

		public void setTotalLogCount(Integer totalLogCount) {
			this.totalLogCount = totalLogCount;
		}

		public Integer getImportedLogCount() {
			return this.importedLogCount;
		}

		public void setImportedLogCount(Integer importedLogCount) {
			this.importedLogCount = importedLogCount;
		}

		public Integer getUnImportedLogCount() {
			return this.unImportedLogCount;
		}

		public void setUnImportedLogCount(Integer unImportedLogCount) {
			this.unImportedLogCount = unImportedLogCount;
		}
	}

	@Override
	public DescribeImportedLogCountResponse getInstance(UnmarshallerContext context) {
		return	DescribeImportedLogCountResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
