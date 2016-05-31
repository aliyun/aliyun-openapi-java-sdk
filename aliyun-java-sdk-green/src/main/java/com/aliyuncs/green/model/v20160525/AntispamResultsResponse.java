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
package com.aliyuncs.green.model.v20160525;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.green.transform.v20160525.AntispamResultsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class AntispamResultsResponse extends AcsResponse {

	private String code;

	private String msg;

	private List<AntispamResult> antispamResults;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMsg() {
		return this.msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public List<AntispamResult> getAntispamResults() {
		return this.antispamResults;
	}

	public void setAntispamResults(List<AntispamResult> antispamResults) {
		this.antispamResults = antispamResults;
	}

	public static class AntispamResult {

		private String code;

		private String msg;

		private String dataId;

		private String status;

		private Integer resultCode;

		private Integer label;

		public String getCode() {
			return this.code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getMsg() {
			return this.msg;
		}

		public void setMsg(String msg) {
			this.msg = msg;
		}

		public String getDataId() {
			return this.dataId;
		}

		public void setDataId(String dataId) {
			this.dataId = dataId;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Integer getResultCode() {
			return this.resultCode;
		}

		public void setResultCode(Integer resultCode) {
			this.resultCode = resultCode;
		}

		public Integer getLabel() {
			return this.label;
		}

		public void setLabel(Integer label) {
			this.label = label;
		}
	}

	@Override
	public AntispamResultsResponse getInstance(UnmarshallerContext context) {
		return	AntispamResultsResponseUnmarshaller.unmarshall(this, context);
	}
}
