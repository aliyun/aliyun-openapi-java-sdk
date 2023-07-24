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

package com.aliyuncs.sasti.model.v20200512;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.sasti.transform.v20200512.DescribeFileReportResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeFileReportResponse extends AcsResponse {

	private String intelligences;

	private String requestId;

	private String fileHash;

	private String threatTypes;

	private String basic;

	private String threatLevel;

	private String sandbox;

	public String getIntelligences() {
		return this.intelligences;
	}

	public void setIntelligences(String intelligences) {
		this.intelligences = intelligences;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getFileHash() {
		return this.fileHash;
	}

	public void setFileHash(String fileHash) {
		this.fileHash = fileHash;
	}

	public String getThreatTypes() {
		return this.threatTypes;
	}

	public void setThreatTypes(String threatTypes) {
		this.threatTypes = threatTypes;
	}

	public String getBasic() {
		return this.basic;
	}

	public void setBasic(String basic) {
		this.basic = basic;
	}

	public String getThreatLevel() {
		return this.threatLevel;
	}

	public void setThreatLevel(String threatLevel) {
		this.threatLevel = threatLevel;
	}

	public String getSandbox() {
		return this.sandbox;
	}

	public void setSandbox(String sandbox) {
		this.sandbox = sandbox;
	}

	@Override
	public DescribeFileReportResponse getInstance(UnmarshallerContext context) {
		return	DescribeFileReportResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
