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

package com.aliyuncs.dds.model.v20151201;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.dds.transform.v20151201.DescribeBackupStorageResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeBackupStorageResponse extends AcsResponse {

	private String requestId;

	private Long fullStorageSize;

	private Long logStorageSize;

	private Long freeSize;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getFullStorageSize() {
		return this.fullStorageSize;
	}

	public void setFullStorageSize(Long fullStorageSize) {
		this.fullStorageSize = fullStorageSize;
	}

	public Long getLogStorageSize() {
		return this.logStorageSize;
	}

	public void setLogStorageSize(Long logStorageSize) {
		this.logStorageSize = logStorageSize;
	}

	public Long getFreeSize() {
		return this.freeSize;
	}

	public void setFreeSize(Long freeSize) {
		this.freeSize = freeSize;
	}

	@Override
	public DescribeBackupStorageResponse getInstance(UnmarshallerContext context) {
		return	DescribeBackupStorageResponseUnmarshaller.unmarshall(this, context);
	}
}
