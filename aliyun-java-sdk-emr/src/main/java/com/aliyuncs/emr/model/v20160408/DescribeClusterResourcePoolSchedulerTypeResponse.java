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
import com.aliyuncs.emr.transform.v20160408.DescribeClusterResourcePoolSchedulerTypeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeClusterResourcePoolSchedulerTypeResponse extends AcsResponse {

	private String requestId;

	private String currentSchedulerType;

	private String supportSchedulerType;

	private String defaultSchedulerType;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCurrentSchedulerType() {
		return this.currentSchedulerType;
	}

	public void setCurrentSchedulerType(String currentSchedulerType) {
		this.currentSchedulerType = currentSchedulerType;
	}

	public String getSupportSchedulerType() {
		return this.supportSchedulerType;
	}

	public void setSupportSchedulerType(String supportSchedulerType) {
		this.supportSchedulerType = supportSchedulerType;
	}

	public String getDefaultSchedulerType() {
		return this.defaultSchedulerType;
	}

	public void setDefaultSchedulerType(String defaultSchedulerType) {
		this.defaultSchedulerType = defaultSchedulerType;
	}

	@Override
	public DescribeClusterResourcePoolSchedulerTypeResponse getInstance(UnmarshallerContext context) {
		return	DescribeClusterResourcePoolSchedulerTypeResponseUnmarshaller.unmarshall(this, context);
	}
}
