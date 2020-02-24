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

package com.aliyuncs.hbase.model.v20190101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.hbase.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateHbaseHaSlbRequest extends RpcAcsRequest<CreateHbaseHaSlbResponse> {
	   

	private String haTypes;

	private String hbaseType;

	private String bdsId;

	private String haId;
	public CreateHbaseHaSlbRequest() {
		super("HBase", "2019-01-01", "CreateHbaseHaSlb");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getHaTypes() {
		return this.haTypes;
	}

	public void setHaTypes(String haTypes) {
		this.haTypes = haTypes;
		if(haTypes != null){
			putQueryParameter("HaTypes", haTypes);
		}
	}

	public String getHbaseType() {
		return this.hbaseType;
	}

	public void setHbaseType(String hbaseType) {
		this.hbaseType = hbaseType;
		if(hbaseType != null){
			putQueryParameter("HbaseType", hbaseType);
		}
	}

	public String getBdsId() {
		return this.bdsId;
	}

	public void setBdsId(String bdsId) {
		this.bdsId = bdsId;
		if(bdsId != null){
			putQueryParameter("BdsId", bdsId);
		}
	}

	public String getHaId() {
		return this.haId;
	}

	public void setHaId(String haId) {
		this.haId = haId;
		if(haId != null){
			putQueryParameter("HaId", haId);
		}
	}

	@Override
	public Class<CreateHbaseHaSlbResponse> getResponseClass() {
		return CreateHbaseHaSlbResponse.class;
	}

}
