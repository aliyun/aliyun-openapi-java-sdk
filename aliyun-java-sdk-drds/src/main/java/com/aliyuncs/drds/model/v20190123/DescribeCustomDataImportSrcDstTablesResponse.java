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

package com.aliyuncs.drds.model.v20190123;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.drds.transform.v20190123.DescribeCustomDataImportSrcDstTablesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeCustomDataImportSrcDstTablesResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private DataImportSrcDstTables dataImportSrcDstTables;

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

	public DataImportSrcDstTables getDataImportSrcDstTables() {
		return this.dataImportSrcDstTables;
	}

	public void setDataImportSrcDstTables(DataImportSrcDstTables dataImportSrcDstTables) {
		this.dataImportSrcDstTables = dataImportSrcDstTables;
	}

	public static class DataImportSrcDstTables {

		private List<String> srcTables;

		private List<String> dstTables;

		public List<String> getSrcTables() {
			return this.srcTables;
		}

		public void setSrcTables(List<String> srcTables) {
			this.srcTables = srcTables;
		}

		public List<String> getDstTables() {
			return this.dstTables;
		}

		public void setDstTables(List<String> dstTables) {
			this.dstTables = dstTables;
		}
	}

	@Override
	public DescribeCustomDataImportSrcDstTablesResponse getInstance(UnmarshallerContext context) {
		return	DescribeCustomDataImportSrcDstTablesResponseUnmarshaller.unmarshall(this, context);
	}
}
