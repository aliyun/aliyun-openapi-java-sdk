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

package com.aliyuncs.cs.model.v20151215;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cs.transform.v20151215.CheckControlPlaneLogEnableResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CheckControlPlaneLogEnableResponse extends AcsResponse {

	private String log_project;

	private String log_ttl;

	private String aliuid;

	private List<String> components;

	public String getLog_project() {
		return this.log_project;
	}

	public void setLog_project(String log_project) {
		this.log_project = log_project;
	}

	public String getLog_ttl() {
		return this.log_ttl;
	}

	public void setLog_ttl(String log_ttl) {
		this.log_ttl = log_ttl;
	}

	public String getAliuid() {
		return this.aliuid;
	}

	public void setAliuid(String aliuid) {
		this.aliuid = aliuid;
	}

	public List<String> getComponents() {
		return this.components;
	}

	public void setComponents(List<String> components) {
		this.components = components;
	}

	@Override
	public CheckControlPlaneLogEnableResponse getInstance(UnmarshallerContext context) {
		return	CheckControlPlaneLogEnableResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
