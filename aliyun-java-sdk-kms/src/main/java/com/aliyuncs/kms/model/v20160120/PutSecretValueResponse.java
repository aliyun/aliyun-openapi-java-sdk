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

package com.aliyuncs.kms.model.v20160120;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.kms.transform.v20160120.PutSecretValueResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class PutSecretValueResponse extends AcsResponse {

	private String requestId;

	private String secretName;

	private String versionId;

	private List<String> versionStages;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getSecretName() {
		return this.secretName;
	}

	public void setSecretName(String secretName) {
		this.secretName = secretName;
	}

	public String getVersionId() {
		return this.versionId;
	}

	public void setVersionId(String versionId) {
		this.versionId = versionId;
	}

	public List<String> getVersionStages() {
		return this.versionStages;
	}

	public void setVersionStages(List<String> versionStages) {
		this.versionStages = versionStages;
	}

	@Override
	public PutSecretValueResponse getInstance(UnmarshallerContext context) {
		return	PutSecretValueResponseUnmarshaller.unmarshall(this, context);
	}
}
