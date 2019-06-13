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

package com.aliyuncs.rds.model.v20140815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.rds.transform.v20140815.DescribeOssDownloadsForSQLServerResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeOssDownloadsForSQLServerResponse extends AcsResponse {

	private String requestId;

	private String dBInstanceName;

	private String migrateIaskId;

	private List<OssDownload> items;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getDBInstanceName() {
		return this.dBInstanceName;
	}

	public void setDBInstanceName(String dBInstanceName) {
		this.dBInstanceName = dBInstanceName;
	}

	public String getMigrateIaskId() {
		return this.migrateIaskId;
	}

	public void setMigrateIaskId(String migrateIaskId) {
		this.migrateIaskId = migrateIaskId;
	}

	public List<OssDownload> getItems() {
		return this.items;
	}

	public void setItems(List<OssDownload> items) {
		this.items = items;
	}

	public static class OssDownload {

		private String fileName;

		private String createTime;

		private String createTime1;

		private String bakType;

		private String fileSize;

		private String status;

		private String isAvail;

		private String desc;

		public String getFileName() {
			return this.fileName;
		}

		public void setFileName(String fileName) {
			this.fileName = fileName;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getCreateTime1() {
			return this.createTime1;
		}

		public void setCreateTime1(String createTime1) {
			this.createTime1 = createTime1;
		}

		public String getBakType() {
			return this.bakType;
		}

		public void setBakType(String bakType) {
			this.bakType = bakType;
		}

		public String getFileSize() {
			return this.fileSize;
		}

		public void setFileSize(String fileSize) {
			this.fileSize = fileSize;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getIsAvail() {
			return this.isAvail;
		}

		public void setIsAvail(String isAvail) {
			this.isAvail = isAvail;
		}

		public String getDesc() {
			return this.desc;
		}

		public void setDesc(String desc) {
			this.desc = desc;
		}
	}

	@Override
	public DescribeOssDownloadsForSQLServerResponse getInstance(UnmarshallerContext context) {
		return	DescribeOssDownloadsForSQLServerResponseUnmarshaller.unmarshall(this, context);
	}
}
