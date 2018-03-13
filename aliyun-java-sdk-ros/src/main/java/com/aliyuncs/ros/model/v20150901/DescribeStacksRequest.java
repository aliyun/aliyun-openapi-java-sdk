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
package com.aliyuncs.ros.model.v20150901;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DescribeStacksRequest extends RoaAcsRequest<DescribeStacksResponse> {
	
	public DescribeStacksRequest() {
		super("ROS", "2015-09-01", "DescribeStacks");
		setUriPattern("/stacks");
		setMethod(MethodType.GET);
	}

	private String status;

	private String name;

	private String stackId;

	private Integer pageSize;

	private Integer pageNumber;

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
		putQueryParameter("Status", status);
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		putQueryParameter("Name", name);
	}

	public String getStackId() {
		return this.stackId;
	}

	public void setStackId(String stackId) {
		this.stackId = stackId;
		putQueryParameter("StackId", stackId);
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		putQueryParameter("PageSize", pageSize);
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		putQueryParameter("PageNumber", pageNumber);
	}

	@Override
	public Class<DescribeStacksResponse> getResponseClass() {
		return DescribeStacksResponse.class;
	}

}
