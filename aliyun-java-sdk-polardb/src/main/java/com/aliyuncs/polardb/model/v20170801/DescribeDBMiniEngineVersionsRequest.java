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

package com.aliyuncs.polardb.model.v20170801;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.polardb.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeDBMiniEngineVersionsRequest extends RpcAcsRequest<DescribeDBMiniEngineVersionsResponse> {
	   

	private String creationCategory;

	private String architecture;

	private String dBMinorVersion;

	private String dBType;

	private String dBVersion;

	private String zoneId;
	public DescribeDBMiniEngineVersionsRequest() {
		super("polardb", "2017-08-01", "DescribeDBMiniEngineVersions", "polardb");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getCreationCategory() {
		return this.creationCategory;
	}

	public void setCreationCategory(String creationCategory) {
		this.creationCategory = creationCategory;
		if(creationCategory != null){
			putQueryParameter("CreationCategory", creationCategory);
		}
	}

	public String getArchitecture() {
		return this.architecture;
	}

	public void setArchitecture(String architecture) {
		this.architecture = architecture;
		if(architecture != null){
			putQueryParameter("Architecture", architecture);
		}
	}

	public String getDBMinorVersion() {
		return this.dBMinorVersion;
	}

	public void setDBMinorVersion(String dBMinorVersion) {
		this.dBMinorVersion = dBMinorVersion;
		if(dBMinorVersion != null){
			putQueryParameter("DBMinorVersion", dBMinorVersion);
		}
	}

	public String getDBType() {
		return this.dBType;
	}

	public void setDBType(String dBType) {
		this.dBType = dBType;
		if(dBType != null){
			putQueryParameter("DBType", dBType);
		}
	}

	public String getDBVersion() {
		return this.dBVersion;
	}

	public void setDBVersion(String dBVersion) {
		this.dBVersion = dBVersion;
		if(dBVersion != null){
			putQueryParameter("DBVersion", dBVersion);
		}
	}

	public String getZoneId() {
		return this.zoneId;
	}

	public void setZoneId(String zoneId) {
		this.zoneId = zoneId;
		if(zoneId != null){
			putQueryParameter("ZoneId", zoneId);
		}
	}

	@Override
	public Class<DescribeDBMiniEngineVersionsResponse> getResponseClass() {
		return DescribeDBMiniEngineVersionsResponse.class;
	}

}
