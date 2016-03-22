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
package com.aliyuncs.alidns.model.v20150109;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.alidns.transform.v20150109.DescribeDnsProductAttributesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDnsProductAttributesResponse extends AcsResponse {

	private String requestId;

	private String ttlMinValue;

	private String ttlMaxValue;

	private List<RecordLine> recordLines;

	private List<String> recordTypes;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getTtlMinValue() {
		return this.ttlMinValue;
	}

	public void setTtlMinValue(String ttlMinValue) {
		this.ttlMinValue = ttlMinValue;
	}

	public String getTtlMaxValue() {
		return this.ttlMaxValue;
	}

	public void setTtlMaxValue(String ttlMaxValue) {
		this.ttlMaxValue = ttlMaxValue;
	}

	public List<RecordLine> getRecordLines() {
		return this.recordLines;
	}

	public void setRecordLines(List<RecordLine> recordLines) {
		this.recordLines = recordLines;
	}

	public List<String> getRecordTypes() {
		return this.recordTypes;
	}

	public void setRecordTypes(List<String> recordTypes) {
		this.recordTypes = recordTypes;
	}

	public static class RecordLine {

		private String lineCode;

		private String fatherCode;

		private String lineName;

		public String getLineCode() {
			return this.lineCode;
		}

		public void setLineCode(String lineCode) {
			this.lineCode = lineCode;
		}

		public String getFatherCode() {
			return this.fatherCode;
		}

		public void setFatherCode(String fatherCode) {
			this.fatherCode = fatherCode;
		}

		public String getLineName() {
			return this.lineName;
		}

		public void setLineName(String lineName) {
			this.lineName = lineName;
		}
	}

	@Override
	public DescribeDnsProductAttributesResponse getInstance(UnmarshallerContext context) {
		return	DescribeDnsProductAttributesResponseUnmarshaller.unmarshall(this, context);
	}
}
