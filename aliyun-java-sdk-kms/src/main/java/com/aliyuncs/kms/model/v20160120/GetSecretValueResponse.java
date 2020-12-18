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
import com.aliyuncs.kms.transform.v20160120.GetSecretValueResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetSecretValueResponse extends AcsResponse {

	private String requestId;

	private String secretName;

	private String versionId;

	private String createTime;

	private String secretData;

	private String secretDataType;

	private String automaticRotation;

	private String rotationInterval;

	private String nextRotationDate;

	private String extendedConfig;

	private String lastRotationDate;

	private String secretType;

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

	public String getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getSecretData() {
		return this.secretData;
	}

	public void setSecretData(String secretData) {
		this.secretData = secretData;
	}

	public String getSecretDataType() {
		return this.secretDataType;
	}

	public void setSecretDataType(String secretDataType) {
		this.secretDataType = secretDataType;
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

	public String getLastRotationDate() {
		return this.lastRotationDate;
	}

	public void setLastRotationDate(String lastRotationDate) {
		this.lastRotationDate = lastRotationDate;
	}

	public String getSecretType() {
		return this.secretType;
	}

	public void setSecretType(String secretType) {
		this.secretType = secretType;
	}

	public List<String> getVersionStages() {
		return this.versionStages;
	}

	public void setVersionStages(List<String> versionStages) {
		this.versionStages = versionStages;
	}

	@Override
	public GetSecretValueResponse getInstance(UnmarshallerContext context) {
		return	GetSecretValueResponseUnmarshaller.unmarshall(this, context);
	}
}
