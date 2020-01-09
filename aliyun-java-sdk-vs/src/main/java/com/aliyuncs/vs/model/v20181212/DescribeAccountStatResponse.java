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

package com.aliyuncs.vs.model.v20181212;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.vs.transform.v20181212.DescribeAccountStatResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAccountStatResponse extends AcsResponse {

	private String requestId;

	private String id;

	private Long groupNum;

	private Long groupLimit;

	private Long templateNum;

	private Long templateLimit;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Long getGroupNum() {
		return this.groupNum;
	}

	public void setGroupNum(Long groupNum) {
		this.groupNum = groupNum;
	}

	public Long getGroupLimit() {
		return this.groupLimit;
	}

	public void setGroupLimit(Long groupLimit) {
		this.groupLimit = groupLimit;
	}

	public Long getTemplateNum() {
		return this.templateNum;
	}

	public void setTemplateNum(Long templateNum) {
		this.templateNum = templateNum;
	}

	public Long getTemplateLimit() {
		return this.templateLimit;
	}

	public void setTemplateLimit(Long templateLimit) {
		this.templateLimit = templateLimit;
	}

	@Override
	public DescribeAccountStatResponse getInstance(UnmarshallerContext context) {
		return	DescribeAccountStatResponseUnmarshaller.unmarshall(this, context);
	}
}
