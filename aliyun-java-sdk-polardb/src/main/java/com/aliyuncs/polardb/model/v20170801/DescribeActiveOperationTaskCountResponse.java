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

package com.aliyuncs.polardb.model.v20170801;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.polardb.transform.v20170801.DescribeActiveOperationTaskCountResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeActiveOperationTaskCountResponse extends AcsResponse {

	private String requestId;

	private Integer taskCount;

	private Integer needPop;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTaskCount() {
		return this.taskCount;
	}

	public void setTaskCount(Integer taskCount) {
		this.taskCount = taskCount;
	}

	public Integer getNeedPop() {
		return this.needPop;
	}

	public void setNeedPop(Integer needPop) {
		this.needPop = needPop;
	}

	@Override
	public DescribeActiveOperationTaskCountResponse getInstance(UnmarshallerContext context) {
		return	DescribeActiveOperationTaskCountResponseUnmarshaller.unmarshall(this, context);
	}
}
