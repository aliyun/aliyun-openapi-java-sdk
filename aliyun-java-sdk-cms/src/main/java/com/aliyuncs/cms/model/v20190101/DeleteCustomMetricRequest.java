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

package com.aliyuncs.cms.model.v20190101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DeleteCustomMetricRequest extends RpcAcsRequest<DeleteCustomMetricResponse> {
	   

	private String groupId;

	private String uUID;

	private String metricName;

	private String md5;
	public DeleteCustomMetricRequest() {
		super("Cms", "2019-01-01", "DeleteCustomMetric", "cms");
		setMethod(MethodType.POST);
	}

	public String getGroupId() {
		return this.groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
		if(groupId != null){
			putQueryParameter("GroupId", groupId);
		}
	}

	public String getUUID() {
		return this.uUID;
	}

	public void setUUID(String uUID) {
		this.uUID = uUID;
		if(uUID != null){
			putQueryParameter("UUID", uUID);
		}
	}

	public String getMetricName() {
		return this.metricName;
	}

	public void setMetricName(String metricName) {
		this.metricName = metricName;
		if(metricName != null){
			putQueryParameter("MetricName", metricName);
		}
	}

	public String getMd5() {
		return this.md5;
	}

	public void setMd5(String md5) {
		this.md5 = md5;
		if(md5 != null){
			putQueryParameter("Md5", md5);
		}
	}

	@Override
	public Class<DeleteCustomMetricResponse> getResponseClass() {
		return DeleteCustomMetricResponse.class;
	}

}
