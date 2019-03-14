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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.emr.transform.v20160408.GetOpsCommandResultResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetOpsCommandResultResponse extends AcsResponse {

	private String requestId;

	private String content;

	private Long cursor;

	private Boolean finished;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Long getCursor() {
		return this.cursor;
	}

	public void setCursor(Long cursor) {
		this.cursor = cursor;
	}

	public Boolean getFinished() {
		return this.finished;
	}

	public void setFinished(Boolean finished) {
		this.finished = finished;
	}

	@Override
	public GetOpsCommandResultResponse getInstance(UnmarshallerContext context) {
		return	GetOpsCommandResultResponseUnmarshaller.unmarshall(this, context);
	}
}
