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

package com.aliyuncs.ecs.model.v20140526;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecs.transform.v20140526.DescribeSnapshotsUsageResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSnapshotsUsageResponse extends AcsResponse {

	private String requestId;

	private Integer snapshotCount;

	private Long snapshotSize;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getSnapshotCount() {
		return this.snapshotCount;
	}

	public void setSnapshotCount(Integer snapshotCount) {
		this.snapshotCount = snapshotCount;
	}

	public Long getSnapshotSize() {
		return this.snapshotSize;
	}

	public void setSnapshotSize(Long snapshotSize) {
		this.snapshotSize = snapshotSize;
	}

	@Override
	public DescribeSnapshotsUsageResponse getInstance(UnmarshallerContext context) {
		return	DescribeSnapshotsUsageResponseUnmarshaller.unmarshall(this, context);
	}
}
