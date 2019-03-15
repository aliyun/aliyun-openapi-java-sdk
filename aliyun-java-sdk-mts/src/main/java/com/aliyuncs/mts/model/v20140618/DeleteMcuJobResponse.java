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

package com.aliyuncs.mts.model.v20140618;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.mts.transform.v20140618.DeleteMcuJobResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DeleteMcuJobResponse extends AcsResponse {

	private String requestId;

	private List<String> nonExistJobIds;

	private List<String> deletedJobIds;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<String> getNonExistJobIds() {
		return this.nonExistJobIds;
	}

	public void setNonExistJobIds(List<String> nonExistJobIds) {
		this.nonExistJobIds = nonExistJobIds;
	}

	public List<String> getDeletedJobIds() {
		return this.deletedJobIds;
	}

	public void setDeletedJobIds(List<String> deletedJobIds) {
		this.deletedJobIds = deletedJobIds;
	}

	@Override
	public DeleteMcuJobResponse getInstance(UnmarshallerContext context) {
		return	DeleteMcuJobResponseUnmarshaller.unmarshall(this, context);
	}
}
