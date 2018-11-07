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

package com.aliyuncs.emr.model.v20160408;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.emr.transform.v20160408.DescribeJobMigrateInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeJobMigrateInfoResponse extends AcsResponse {

	private String id;

	private String name;

	private String type;

	private Integer maxRetry;

	private String failedAction;

	private String params;

	private String newId;

	private String premigratedDate;

	private String migratedDate;

	private String premigrateJson;

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getMaxRetry() {
		return this.maxRetry;
	}

	public void setMaxRetry(Integer maxRetry) {
		this.maxRetry = maxRetry;
	}

	public String getFailedAction() {
		return this.failedAction;
	}

	public void setFailedAction(String failedAction) {
		this.failedAction = failedAction;
	}

	public String getParams() {
		return this.params;
	}

	public void setParams(String params) {
		this.params = params;
	}

	public String getNewId() {
		return this.newId;
	}

	public void setNewId(String newId) {
		this.newId = newId;
	}

	public String getPremigratedDate() {
		return this.premigratedDate;
	}

	public void setPremigratedDate(String premigratedDate) {
		this.premigratedDate = premigratedDate;
	}

	public String getMigratedDate() {
		return this.migratedDate;
	}

	public void setMigratedDate(String migratedDate) {
		this.migratedDate = migratedDate;
	}

	public String getPremigrateJson() {
		return this.premigrateJson;
	}

	public void setPremigrateJson(String premigrateJson) {
		this.premigrateJson = premigrateJson;
	}

	@Override
	public DescribeJobMigrateInfoResponse getInstance(UnmarshallerContext context) {
		return	DescribeJobMigrateInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
