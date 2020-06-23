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
import com.aliyuncs.cs.transform.v20151215.DescribeApiVersionResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeApiVersionResponse extends AcsResponse {

	private String version;

	private String build;

	private String docker_version;

	private String docker_region_versions;

	public String getVersion() {
		return this.version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getBuild() {
		return this.build;
	}

	public void setBuild(String build) {
		this.build = build;
	}

	public String getDocker_version() {
		return this.docker_version;
	}

	public void setDocker_version(String docker_version) {
		this.docker_version = docker_version;
	}

	public String getDocker_region_versions() {
		return this.docker_region_versions;
	}

	public void setDocker_region_versions(String docker_region_versions) {
		this.docker_region_versions = docker_region_versions;
	}

	@Override
	public DescribeApiVersionResponse getInstance(UnmarshallerContext context) {
		return	DescribeApiVersionResponseUnmarshaller.unmarshall(this, context);
	}
}
