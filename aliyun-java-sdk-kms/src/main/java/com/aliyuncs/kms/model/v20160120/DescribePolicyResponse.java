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
import com.aliyuncs.kms.transform.v20160120.DescribePolicyResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribePolicyResponse extends AcsResponse {

	private String requestId;

	private String arn;

	private String name;

	private String description;

	private String kmsInstance;

	private String accessControlRules;

	private List<String> permissions;

	private List<String> resources;

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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getKmsInstance() {
		return this.kmsInstance;
	}

	public void setKmsInstance(String kmsInstance) {
		this.kmsInstance = kmsInstance;
	}

	public String getAccessControlRules() {
		return this.accessControlRules;
	}

	public void setAccessControlRules(String accessControlRules) {
		this.accessControlRules = accessControlRules;
	}

	public List<String> getPermissions() {
		return this.permissions;
	}

	public void setPermissions(List<String> permissions) {
		this.permissions = permissions;
	}

	public List<String> getResources() {
		return this.resources;
	}

	public void setResources(List<String> resources) {
		this.resources = resources;
	}

	@Override
	public DescribePolicyResponse getInstance(UnmarshallerContext context) {
		return	DescribePolicyResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
