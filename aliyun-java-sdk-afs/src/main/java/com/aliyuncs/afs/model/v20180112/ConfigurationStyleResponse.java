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
package com.aliyuncs.afs.model.v20180112;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.afs.transform.v20180112.ConfigurationStyleResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ConfigurationStyleResponse extends AcsResponse {

	private String requestId;

	private String bizCode;

	private CodeData codeData;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getBizCode() {
		return this.bizCode;
	}

	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public CodeData getCodeData() {
		return this.codeData;
	}

	public void setCodeData(CodeData codeData) {
		this.codeData = codeData;
	}

	public static class CodeData {

		private String html;

		private String net;

		private String php;

		private String python;

		private String java;

		private String nodeJs;

		public String getHtml() {
			return this.html;
		}

		public void setHtml(String html) {
			this.html = html;
		}

		public String getNet() {
			return this.net;
		}

		public void setNet(String net) {
			this.net = net;
		}

		public String getPhp() {
			return this.php;
		}

		public void setPhp(String php) {
			this.php = php;
		}

		public String getPython() {
			return this.python;
		}

		public void setPython(String python) {
			this.python = python;
		}

		public String getJava() {
			return this.java;
		}

		public void setJava(String java) {
			this.java = java;
		}

		public String getNodeJs() {
			return this.nodeJs;
		}

		public void setNodeJs(String nodeJs) {
			this.nodeJs = nodeJs;
		}
	}

	@Override
	public ConfigurationStyleResponse getInstance(UnmarshallerContext context) {
		return	ConfigurationStyleResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
