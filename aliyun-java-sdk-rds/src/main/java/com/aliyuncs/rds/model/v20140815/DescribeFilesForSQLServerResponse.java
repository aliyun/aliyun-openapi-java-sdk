/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.rds.model.v20140815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.rds.transform.v20140815.DescribeFilesForSQLServerResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeFilesForSQLServerResponse extends AcsResponse {

	private String requestId;

	private String dBInstanceId;

	private Integer totalRecordCount;

	private Integer pageNumber;

	private Integer pageRecordCount;

	private List<SQLServerUploadFile> items;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getDBInstanceId() {
		return this.dBInstanceId;
	}

	public void setDBInstanceId(String dBInstanceId) {
		this.dBInstanceId = dBInstanceId;
	}

	public Integer getTotalRecordCount() {
		return this.totalRecordCount;
	}

	public void setTotalRecordCount(Integer totalRecordCount) {
		this.totalRecordCount = totalRecordCount;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getPageRecordCount() {
		return this.pageRecordCount;
	}

	public void setPageRecordCount(Integer pageRecordCount) {
		this.pageRecordCount = pageRecordCount;
	}

	public List<SQLServerUploadFile> getItems() {
		return this.items;
	}

	public void setItems(List<SQLServerUploadFile> items) {
		this.items = items;
	}

	public static class SQLServerUploadFile {

		private String dBName;

		private String fileName;

		private Long fileSize;

		private String internetFtpServer;

		private Integer internetPort;

		private String intranetFtpserver;

		private Integer intranetport;

		private String userName;

		private String password;

		private String fileStatus;

		private String description;

		private String creationTime;

		public String getDBName() {
			return this.dBName;
		}

		public void setDBName(String dBName) {
			this.dBName = dBName;
		}

		public String getFileName() {
			return this.fileName;
		}

		public void setFileName(String fileName) {
			this.fileName = fileName;
		}

		public Long getFileSize() {
			return this.fileSize;
		}

		public void setFileSize(Long fileSize) {
			this.fileSize = fileSize;
		}

		public String getInternetFtpServer() {
			return this.internetFtpServer;
		}

		public void setInternetFtpServer(String internetFtpServer) {
			this.internetFtpServer = internetFtpServer;
		}

		public Integer getInternetPort() {
			return this.internetPort;
		}

		public void setInternetPort(Integer internetPort) {
			this.internetPort = internetPort;
		}

		public String getIntranetFtpserver() {
			return this.intranetFtpserver;
		}

		public void setIntranetFtpserver(String intranetFtpserver) {
			this.intranetFtpserver = intranetFtpserver;
		}

		public Integer getIntranetport() {
			return this.intranetport;
		}

		public void setIntranetport(Integer intranetport) {
			this.intranetport = intranetport;
		}

		public String getUserName() {
			return this.userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public String getPassword() {
			return this.password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getFileStatus() {
			return this.fileStatus;
		}

		public void setFileStatus(String fileStatus) {
			this.fileStatus = fileStatus;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}
	}

	@Override
	public DescribeFilesForSQLServerResponse getInstance(UnmarshallerContext context) {
		return	DescribeFilesForSQLServerResponseUnmarshaller.unmarshall(this, context);
	}
}
