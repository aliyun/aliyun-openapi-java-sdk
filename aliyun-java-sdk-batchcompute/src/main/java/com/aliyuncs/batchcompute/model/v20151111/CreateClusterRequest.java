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
package com.aliyuncs.batchcompute.model.v20151111;

import com.aliyuncs.batchcompute.main.v20151111.BatchComputeRequest;
import com.aliyuncs.batchcompute.pojo.v20151111.ClusterDescription;
import com.aliyuncs.batchcompute.transform.v20151111.CreateClusterRequestMarshaller;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateClusterRequest extends BatchComputeRequest<CreateClusterResponse> {
	
	public CreateClusterRequest() {
		super("BatchCompute", "2015-11-11", "CreateCluster");
		setUriPattern("/clusters");
		setMethod(MethodType.POST);
	}


	private ClusterDescription clusterDescription;

	public ClusterDescription getClusterDescription() {
		return clusterDescription;
	}

	public void setClusterDescription(ClusterDescription clusterDescription) throws ClientException {
		this.clusterDescription = clusterDescription;
		CreateClusterRequestMarshaller.marshall(this);
	}


	private String IdempotentToken;

	public String getIdempotentToken() {
		return IdempotentToken;
	}

	public void setIdempotentToken(String idempotentToken) {
		IdempotentToken = idempotentToken;
		this.putQueryParameter("IdempotentToken",idempotentToken);
	}

	@Override
	public Class<CreateClusterResponse> getResponseClass() {
		return CreateClusterResponse.class;
	}

}
