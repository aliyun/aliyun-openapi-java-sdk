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
import com.aliyuncs.cs.transform.v20151215.DescribeClusterAddonMetadataResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeClusterAddonMetadataResponse extends AcsResponse {

	private String name;

	private String version;

	private String config_schema;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVersion() {
		return this.version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getConfig_schema() {
		return this.config_schema;
	}

	public void setConfig_schema(String config_schema) {
		this.config_schema = config_schema;
	}

	@Override
	public DescribeClusterAddonMetadataResponse getInstance(UnmarshallerContext context) {
		return	DescribeClusterAddonMetadataResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
