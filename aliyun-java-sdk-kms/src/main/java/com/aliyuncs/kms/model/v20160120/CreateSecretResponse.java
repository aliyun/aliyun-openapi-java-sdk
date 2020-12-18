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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.kms.transform.v20160120.CreateSecretResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateSecretResponse extends AcsResponse {

	private String requestId;

	private String arn;

	private String versionId;

	private String secretName;

	private String secretType;

	private String automaticRotation;

	private String rotationInterval;

	private String nextRotationDate;

	private String extendedConfig;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getArn() {
		return this.arn;
	}

	public void setArn(String arn) {
		this.arn = arn;
	}

	public String getVersionId() {
		return this.versionId;
	}

	public void setVersionId(String versionId) {
		this.versionId = versionId;
	}

	public String getSecretName() {
		return this.secretName;
	}

	public void setSecretName(String secretName) {
		this.secretName = secretName;
	}

	public String getSecretType() {
		return this.secretType;
	}

	public void setSecretType(String secretType) {
		this.secretType = secretType;
	}

	public String getAutomaticRotation() {
		return this.automaticRotation;
	}

	public void setAutomaticRotation(String automaticRotation) {
		this.automaticRotation = automaticRotation;
	}

	public String getRotationInterval() {
		return this.rotationInterval;
	}

	public void setRotationInterval(String rotationInterval) {
		this.rotationInterval = rotationInterval;
	}

	public String getNextRotationDate() {
		return this.nextRotationDate;
	}

	public void setNextRotationDate(String nextRotationDate) {
		this.nextRotationDate = nextRotationDate;
	}

	public String getExtendedConfig() {
		return this.extendedConfig;
	}

	public void setExtendedConfig(String extendedConfig) {
		this.extendedConfig = extendedConfig;
	}

	@Override
	public CreateSecretResponse getInstance(UnmarshallerContext context) {
		return	CreateSecretResponseUnmarshaller.unmarshall(this, context);
	}
}
