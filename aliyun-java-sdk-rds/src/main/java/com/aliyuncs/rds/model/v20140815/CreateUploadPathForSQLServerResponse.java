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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.rds.transform.v20140815.CreateUploadPathForSQLServerResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateUploadPathForSQLServerResponse extends AcsResponse {

	private String requestId;

	private String internetFtpServer;

	private Integer internetPort;

	private String intranetFtpserver;

	private Integer intranetport;

	private String userName;

	private String password;

	private String fileName;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
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

	public String getFileName() {
		return this.fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public CreateUploadPathForSQLServerResponse getInstance(UnmarshallerContext context) {
		return	CreateUploadPathForSQLServerResponseUnmarshaller.unmarshall(this, context);
	}
}
