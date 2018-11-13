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

package com.aliyuncs.domain_intl.model.v20171218;

import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.domain_intl.transform.v20171218.SaveSingleTaskForDisassociatingEnsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class SaveSingleTaskForDisassociatingEnsResponse extends AcsResponse {

	private String requestId;

	private String taskNo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getTaskNo() {
		return this.taskNo;
	}

	public void setTaskNo(String taskNo) {
		this.taskNo = taskNo;
	}

	@Override
	public SaveSingleTaskForDisassociatingEnsResponse getInstance(UnmarshallerContext context) {
		return	SaveSingleTaskForDisassociatingEnsResponseUnmarshaller.unmarshall(this, context);
	}
}
