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

package com.aliyuncs.emr.model.v20160408;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.emr.transform.v20160408.PreMigrateJobsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class PreMigrateJobsResponse extends AcsResponse {

	private List<String> succeedIds;

	private List<String> failedIds;

	public List<String> getSucceedIds() {
		return this.succeedIds;
	}

	public void setSucceedIds(List<String> succeedIds) {
		this.succeedIds = succeedIds;
	}

	public List<String> getFailedIds() {
		return this.failedIds;
	}

	public void setFailedIds(List<String> failedIds) {
		this.failedIds = failedIds;
	}

	@Override
	public PreMigrateJobsResponse getInstance(UnmarshallerContext context) {
		return	PreMigrateJobsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
