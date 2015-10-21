/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.cms.model.v20150801;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class BatchCreateSqlMetricsRequest extends RpcAcsRequest<BatchCreateSqlMetricsResponse> {
	
	public BatchCreateSqlMetricsRequest() {
		super("Cms", "2015-08-01", "BatchCreateSqlMetrics");
		setMethod(MethodType.POST);
	}

	private String projectName;

	private String sqls;

	private Integer isPublic;

	public String getProjectName() {
		return this.projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
		putQueryParameter("ProjectName", projectName);
	}

	public String getSqls() {
		return this.sqls;
	}

	public void setSqls(String sqls) {
		this.sqls = sqls;
		}

	public Integer getIsPublic() {
		return this.isPublic;
	}

	public void setIsPublic(Integer isPublic) {
		this.isPublic = isPublic;
		putQueryParameter("IsPublic", String.valueOf(isPublic));
	}

	@Override
	public Class<BatchCreateSqlMetricsResponse> getResponseClass() {
		return BatchCreateSqlMetricsResponse.class;
	}

}
