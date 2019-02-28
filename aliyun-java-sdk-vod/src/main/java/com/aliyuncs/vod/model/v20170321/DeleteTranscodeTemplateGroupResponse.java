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

package com.aliyuncs.vod.model.v20170321;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vod.transform.v20170321.DeleteTranscodeTemplateGroupResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DeleteTranscodeTemplateGroupResponse extends AcsResponse {

	private String requestId;

	private List<String> nonExistTranscodeTemplateIds;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<String> getNonExistTranscodeTemplateIds() {
		return this.nonExistTranscodeTemplateIds;
	}

	public void setNonExistTranscodeTemplateIds(List<String> nonExistTranscodeTemplateIds) {
		this.nonExistTranscodeTemplateIds = nonExistTranscodeTemplateIds;
	}

	@Override
	public DeleteTranscodeTemplateGroupResponse getInstance(UnmarshallerContext context) {
		return	DeleteTranscodeTemplateGroupResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
