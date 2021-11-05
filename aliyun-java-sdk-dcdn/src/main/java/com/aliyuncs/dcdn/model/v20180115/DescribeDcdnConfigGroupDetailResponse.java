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

package com.aliyuncs.dcdn.model.v20180115;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.dcdn.transform.v20180115.DescribeDcdnConfigGroupDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDcdnConfigGroupDetailResponse extends AcsResponse {

	private String requestId;

	private String configGroupId;

	private String configGroupName;

	private String description;

	private String bizName;

	private String createTime;

	private String updateTime;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getConfigGroupId() {
		return this.configGroupId;
	}

	public void setConfigGroupId(String configGroupId) {
		this.configGroupId = configGroupId;
	}

	public String getConfigGroupName() {
		return this.configGroupName;
	}

	public void setConfigGroupName(String configGroupName) {
		this.configGroupName = configGroupName;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getBizName() {
		return this.bizName;
	}

	public void setBizName(String bizName) {
		this.bizName = bizName;
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
	public DescribeDcdnConfigGroupDetailResponse getInstance(UnmarshallerContext context) {
		return	DescribeDcdnConfigGroupDetailResponseUnmarshaller.unmarshall(this, context);
	}
}
