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
package com.aliyuncs.cdn.model.v20141111;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cdn.transform.v20141111.DescribeDomainTopFileTypeVisitResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDomainTopFileTypeVisitResponse extends AcsResponse {

	private String requestId;

	private String domainName;

	private String startTime;

	private List<FileTypeList> topFileTypeList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getDomainName() {
		return this.domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public List<FileTypeList> getTopFileTypeList() {
		return this.topFileTypeList;
	}

	public void setTopFileTypeList(List<FileTypeList> topFileTypeList) {
		this.topFileTypeList = topFileTypeList;
	}

	public static class FileTypeList {

		private String fileTypeDetail;

		private String visitData;

		public String getFileTypeDetail() {
			return this.fileTypeDetail;
		}

		public void setFileTypeDetail(String fileTypeDetail) {
			this.fileTypeDetail = fileTypeDetail;
		}

		public String getVisitData() {
			return this.visitData;
		}

		public void setVisitData(String visitData) {
			this.visitData = visitData;
		}
	}

	@Override
	public DescribeDomainTopFileTypeVisitResponse getInstance(UnmarshallerContext context) {
		return	DescribeDomainTopFileTypeVisitResponseUnmarshaller.unmarshall(this, context);
	}
}
