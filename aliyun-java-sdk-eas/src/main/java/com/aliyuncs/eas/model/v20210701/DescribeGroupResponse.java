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

package com.aliyuncs.eas.model.v20210701;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.eas.transform.v20210701.DescribeGroupResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeGroupResponse extends AcsResponse {

	private String name;

	private String clusterId;

	private String createTime;

	private String updateTime;

	private String queueService;

	private String internetEndpoint;

	private String intranetEndpoint;

	private String accessToken;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
	}

	public String getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	public String getQueueService() {
		return this.queueService;
	}

	public void setQueueService(String queueService) {
		this.queueService = queueService;
	}

	public String getInternetEndpoint() {
		return this.internetEndpoint;
	}

	public void setInternetEndpoint(String internetEndpoint) {
		this.internetEndpoint = internetEndpoint;
	}

	public String getIntranetEndpoint() {
		return this.intranetEndpoint;
	}

	public void setIntranetEndpoint(String intranetEndpoint) {
		this.intranetEndpoint = intranetEndpoint;
	}

	public String getAccessToken() {
		return this.accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	@Override
	public DescribeGroupResponse getInstance(UnmarshallerContext context) {
		return	DescribeGroupResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
