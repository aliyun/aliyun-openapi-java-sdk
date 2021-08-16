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

package com.aliyuncs.das.model.v20200116;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.das.transform.v20200116.DescribeCloudbenchTaskConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeCloudbenchTaskConfigResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

	private String success;

	private Data data;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getSuccess() {
		return this.success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String workDir;

		private String archiveFolder;

		private String metaFilePath;

		private String metaFileName;

		private String metaFileOnOss;

		private String userId;

		private String benchCmd;

		private String sqlFileOnOss;

		private String loadCmd;

		private String rocksDbPath;

		private String parseCmd;

		private String sqlFileName;

		private String clientJarPath;

		private String sqlFilePath;

		private String parseFilePath;

		private String jarOnOss;

		private String taskId;

		public String getWorkDir() {
			return this.workDir;
		}

		public void setWorkDir(String workDir) {
			this.workDir = workDir;
		}

		public String getArchiveFolder() {
			return this.archiveFolder;
		}

		public void setArchiveFolder(String archiveFolder) {
			this.archiveFolder = archiveFolder;
		}

		public String getMetaFilePath() {
			return this.metaFilePath;
		}

		public void setMetaFilePath(String metaFilePath) {
			this.metaFilePath = metaFilePath;
		}

		public String getMetaFileName() {
			return this.metaFileName;
		}

		public void setMetaFileName(String metaFileName) {
			this.metaFileName = metaFileName;
		}

		public String getMetaFileOnOss() {
			return this.metaFileOnOss;
		}

		public void setMetaFileOnOss(String metaFileOnOss) {
			this.metaFileOnOss = metaFileOnOss;
		}

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public String getBenchCmd() {
			return this.benchCmd;
		}

		public void setBenchCmd(String benchCmd) {
			this.benchCmd = benchCmd;
		}

		public String getSqlFileOnOss() {
			return this.sqlFileOnOss;
		}

		public void setSqlFileOnOss(String sqlFileOnOss) {
			this.sqlFileOnOss = sqlFileOnOss;
		}

		public String getLoadCmd() {
			return this.loadCmd;
		}

		public void setLoadCmd(String loadCmd) {
			this.loadCmd = loadCmd;
		}

		public String getRocksDbPath() {
			return this.rocksDbPath;
		}

		public void setRocksDbPath(String rocksDbPath) {
			this.rocksDbPath = rocksDbPath;
		}

		public String getParseCmd() {
			return this.parseCmd;
		}

		public void setParseCmd(String parseCmd) {
			this.parseCmd = parseCmd;
		}

		public String getSqlFileName() {
			return this.sqlFileName;
		}

		public void setSqlFileName(String sqlFileName) {
			this.sqlFileName = sqlFileName;
		}

		public String getClientJarPath() {
			return this.clientJarPath;
		}

		public void setClientJarPath(String clientJarPath) {
			this.clientJarPath = clientJarPath;
		}

		public String getSqlFilePath() {
			return this.sqlFilePath;
		}

		public void setSqlFilePath(String sqlFilePath) {
			this.sqlFilePath = sqlFilePath;
		}

		public String getParseFilePath() {
			return this.parseFilePath;
		}

		public void setParseFilePath(String parseFilePath) {
			this.parseFilePath = parseFilePath;
		}

		public String getJarOnOss() {
			return this.jarOnOss;
		}

		public void setJarOnOss(String jarOnOss) {
			this.jarOnOss = jarOnOss;
		}

		public String getTaskId() {
			return this.taskId;
		}

		public void setTaskId(String taskId) {
			this.taskId = taskId;
		}
	}

	@Override
	public DescribeCloudbenchTaskConfigResponse getInstance(UnmarshallerContext context) {
		return	DescribeCloudbenchTaskConfigResponseUnmarshaller.unmarshall(this, context);
	}
}
