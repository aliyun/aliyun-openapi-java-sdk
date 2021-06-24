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

package com.aliyuncs.ecsops.model.v20160401;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsQueryConfigDiffContentResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsQueryConfigDiffContentResponse extends AcsResponse {

	private String commitContent;

	private String requestId;

	private String currentContent;

	public String getCommitContent() {
		return this.commitContent;
	}

	public void setCommitContent(String commitContent) {
		this.commitContent = commitContent;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCurrentContent() {
		return this.currentContent;
	}

	public void setCurrentContent(String currentContent) {
		this.currentContent = currentContent;
	}

	@Override
	public OpsQueryConfigDiffContentResponse getInstance(UnmarshallerContext context) {
		return	OpsQueryConfigDiffContentResponseUnmarshaller.unmarshall(this, context);
	}
}
