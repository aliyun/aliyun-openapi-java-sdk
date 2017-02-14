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
package com.aliyuncs.green.model.v20161216;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.green.transform.v20161216.TextAntispamDetectionResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class TextAntispamDetectionResponse extends AcsResponse {

	private String code;

	private String msg;

	private List<TextAntispamResult> textAntispamResults;

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

	public List<TextAntispamResult> getTextAntispamResults() {
		return this.textAntispamResults;
	}

	public void setTextAntispamResults(List<TextAntispamResult> textAntispamResults) {
		this.textAntispamResults = textAntispamResults;
	}

	public static class TextAntispamResult {

		private String text;

		private Boolean isSpam;

		private String taskId;

		private String label;

		private String subLabel;

		public String getText() {
			return this.text;
		}

		public void setText(String text) {
			this.text = text;
		}

		public Boolean getIsSpam() {
			return this.isSpam;
		}

		public void setIsSpam(Boolean isSpam) {
			this.isSpam = isSpam;
		}

		public String getTaskId() {
			return this.taskId;
		}

		public void setTaskId(String taskId) {
			this.taskId = taskId;
		}

		public String getLabel() {
			return this.label;
		}

		public void setLabel(String label) {
			this.label = label;
		}

		public String getSubLabel() {
			return this.subLabel;
		}

		public void setSubLabel(String subLabel) {
			this.subLabel = subLabel;
		}
	}

	@Override
	public TextAntispamDetectionResponse getInstance(UnmarshallerContext context) {
		return	TextAntispamDetectionResponseUnmarshaller.unmarshall(this, context);
	}
}
