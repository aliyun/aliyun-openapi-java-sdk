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

package com.aliyuncs.pairecservice.model.v20221213;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.pairecservice.transform.v20221213.GetInstanceResourceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetInstanceResourceResponse extends AcsResponse {

	private String requestId;

	private String resourceId;

	private String category;

	private String group;

	private String type;

	private String uri;

	private String config;

	private String gmtCreateTime;

	private String gmtModifiedTime;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResourceId() {
		return this.resourceId;
	}

	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
	}

	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getGroup() {
		return this.group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getUri() {
		return this.uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	public String getConfig() {
		return this.config;
	}

	public void setConfig(String config) {
		this.config = config;
	}

	public String getGmtCreateTime() {
		return this.gmtCreateTime;
	}

	public void setGmtCreateTime(String gmtCreateTime) {
		this.gmtCreateTime = gmtCreateTime;
	}

	public String getGmtModifiedTime() {
		return this.gmtModifiedTime;
	}

	public void setGmtModifiedTime(String gmtModifiedTime) {
		this.gmtModifiedTime = gmtModifiedTime;
	}

	@Override
	public GetInstanceResourceResponse getInstance(UnmarshallerContext context) {
		return	GetInstanceResourceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
