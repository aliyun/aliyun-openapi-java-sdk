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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.cs.transform.v20151215.DescribeClusterAddonsVersionResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeClusterAddonsVersionResponse extends AcsResponse {

	private String template;

	private String next_version;

	private Boolean can_upgrade;

	private String component_name;

	private String version;

	private String changed;

	private String message;

	private Boolean required;

	public String getTemplate() {
		return this.template;
	}

	public void setTemplate(String template) {
		this.template = template;
	}

	public String getNext_version() {
		return this.next_version;
	}

	public void setNext_version(String next_version) {
		this.next_version = next_version;
	}

	public Boolean getCan_upgrade() {
		return this.can_upgrade;
	}

	public void setCan_upgrade(Boolean can_upgrade) {
		this.can_upgrade = can_upgrade;
	}

	public String getComponent_name() {
		return this.component_name;
	}

	public void setComponent_name(String component_name) {
		this.component_name = component_name;
	}

	public String getVersion() {
		return this.version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getChanged() {
		return this.changed;
	}

	public void setChanged(String changed) {
		this.changed = changed;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Boolean getRequired() {
		return this.required;
	}

	public void setRequired(Boolean required) {
		this.required = required;
	}

	@Override
	public DescribeClusterAddonsVersionResponse getInstance(UnmarshallerContext context) {
		return	DescribeClusterAddonsVersionResponseUnmarshaller.unmarshall(this, context);
	}
}
