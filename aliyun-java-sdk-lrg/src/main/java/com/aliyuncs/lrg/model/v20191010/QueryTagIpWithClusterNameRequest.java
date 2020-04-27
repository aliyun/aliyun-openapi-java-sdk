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

package com.aliyuncs.lrg.model.v20191010;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class QueryTagIpWithClusterNameRequest extends RoaAcsRequest<QueryTagIpWithClusterNameResponse> {
	   

	private String hostNames;

	private Long taskId;
	public QueryTagIpWithClusterNameRequest() {
		super("LRG", "2019-10-10", "QueryTagIpWithClusterName");
		setUriPattern("/api/v2/querytagipwithclustername");
		setMethod(MethodType.POST);
	}

	public String getHostNames() {
		return this.hostNames;
	}

	public void setHostNames(String hostNames) {
		this.hostNames = hostNames;
		if(hostNames != null){
			putBodyParameter("HostNames", hostNames);
		}
	}

	public Long getTaskId() {
		return this.taskId;
	}

	public void setTaskId(Long taskId) {
		this.taskId = taskId;
		if(taskId != null){
			putBodyParameter("TaskId", taskId.toString());
		}
	}

	@Override
	public Class<QueryTagIpWithClusterNameResponse> getResponseClass() {
		return QueryTagIpWithClusterNameResponse.class;
	}

}
