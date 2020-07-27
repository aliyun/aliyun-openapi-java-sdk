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

package com.aliyuncs.cdn.model.v20180510;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.cdn.transform.v20180510.DescribeActiveVersionOfConfigGroupResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeActiveVersionOfConfigGroupResponse extends AcsResponse {

	private String requestId;

	private String versionId;

	private String configGroupId;

	private String baseVersionId;

	private String description;

	private Long seqId;

	private String status;

	private String operator;

	private String createTime;

	private String updateTime;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getVersionId() {
		return this.versionId;
	}

	public void setVersionId(String versionId) {
		this.versionId = versionId;
	}

	public String getConfigGroupId() {
		return this.configGroupId;
	}

	public void setConfigGroupId(String configGroupId) {
		this.configGroupId = configGroupId;
	}

	public String getBaseVersionId() {
		return this.baseVersionId;
	}

	public void setBaseVersionId(String baseVersionId) {
		this.baseVersionId = baseVersionId;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long getSeqId() {
		return this.seqId;
	}

	public void setSeqId(Long seqId) {
		this.seqId = seqId;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getOperator() {
		return this.operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	@Override
	public DescribeActiveVersionOfConfigGroupResponse getInstance(UnmarshallerContext context) {
		return	DescribeActiveVersionOfConfigGroupResponseUnmarshaller.unmarshall(this, context);
	}
}
