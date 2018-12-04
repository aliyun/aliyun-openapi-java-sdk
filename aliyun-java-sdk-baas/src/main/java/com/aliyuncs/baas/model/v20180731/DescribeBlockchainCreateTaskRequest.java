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

package com.aliyuncs.baas.model.v20180731;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class DescribeBlockchainCreateTaskRequest extends RpcAcsRequest<DescribeBlockchainCreateTaskResponse> {
	
	public DescribeBlockchainCreateTaskRequest() {
		super("Baas", "2018-07-31", "DescribeBlockchainCreateTask");
	}

	private Integer current;

	private Integer pageSize;

	public Integer getCurrent() {
		return this.current;
	}

	public void setCurrent(Integer current) {
		this.current = current;
		if(current != null){
			putBodyParameter("Current", current.toString());
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putBodyParameter("PageSize", pageSize.toString());
		}
	}

	@Override
	public Class<DescribeBlockchainCreateTaskResponse> getResponseClass() {
		return DescribeBlockchainCreateTaskResponse.class;
	}

}
