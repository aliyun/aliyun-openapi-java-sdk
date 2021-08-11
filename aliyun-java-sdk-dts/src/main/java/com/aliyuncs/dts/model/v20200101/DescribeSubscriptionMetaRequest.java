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

package com.aliyuncs.dts.model.v20200101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dts.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeSubscriptionMetaRequest extends RpcAcsRequest<DescribeSubscriptionMetaResponse> {
	   

	private String topics;

	private String sid;

	private String subMigrationJobIds;

	private String dtsInstanceId;
	public DescribeSubscriptionMetaRequest() {
		super("Dts", "2020-01-01", "DescribeSubscriptionMeta", "dts");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getTopics() {
		return this.topics;
	}

	public void setTopics(String topics) {
		this.topics = topics;
		if(topics != null){
			putQueryParameter("Topics", topics);
		}
	}

	public String getSid() {
		return this.sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
		if(sid != null){
			putQueryParameter("Sid", sid);
		}
	}

	public String getSubMigrationJobIds() {
		return this.subMigrationJobIds;
	}

	public void setSubMigrationJobIds(String subMigrationJobIds) {
		this.subMigrationJobIds = subMigrationJobIds;
		if(subMigrationJobIds != null){
			putQueryParameter("SubMigrationJobIds", subMigrationJobIds);
		}
	}

	public String getDtsInstanceId() {
		return this.dtsInstanceId;
	}

	public void setDtsInstanceId(String dtsInstanceId) {
		this.dtsInstanceId = dtsInstanceId;
		if(dtsInstanceId != null){
			putQueryParameter("DtsInstanceId", dtsInstanceId);
		}
	}

	@Override
	public Class<DescribeSubscriptionMetaResponse> getResponseClass() {
		return DescribeSubscriptionMetaResponse.class;
	}

}
