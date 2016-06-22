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
package com.aliyuncs.green.model.v20160616;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.green.transform.v20160616.TextKeywordFilterResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class TextKeywordFilterResponse extends AcsResponse {

	private String code;

	private String msg;

	private Boolean hit;

	private String taskId;

	private List<KeywordResult> keywordResults;

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

	public Boolean getHit() {
		return this.hit;
	}

	public void setHit(Boolean hit) {
		this.hit = hit;
	}

	public String getTaskId() {
		return this.taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public List<KeywordResult> getKeywordResults() {
		return this.keywordResults;
	}

	public void setKeywordResults(List<KeywordResult> keywordResults) {
		this.keywordResults = keywordResults;
	}

	public static class KeywordResult {

		private String keywordCtx;

		private String keywordType;

		public String getKeywordCtx() {
			return this.keywordCtx;
		}

		public void setKeywordCtx(String keywordCtx) {
			this.keywordCtx = keywordCtx;
		}

		public String getKeywordType() {
			return this.keywordType;
		}

		public void setKeywordType(String keywordType) {
			this.keywordType = keywordType;
		}
	}

	@Override
	public TextKeywordFilterResponse getInstance(UnmarshallerContext context) {
		return	TextKeywordFilterResponseUnmarshaller.unmarshall(this, context);
	}
}
