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
public class DescribeConnectionStatusRequest extends RpcAcsRequest<DescribeConnectionStatusResponse> {
	   

	private String sourceEndpointRegion;

	private String sourceEndpointArchitecture;

	private String destinationEndpointInstanceType;

	private String sourceEndpointInstanceID;

	private String sourceEndpointUserName;

	private String sourceEndpointDatabaseName;

	private String destinationEndpointRegion;

	private String sourceEndpointIP;

	private String destinationEndpointUserName;

	private String destinationEndpointArchitecture;

	private String destinationEndpointOracleSID;

	private String destinationEndpointEngineName;

	private String destinationEndpointInstanceID;

	private String destinationEndpointPort;

	private String sourceEndpointPassword;

	private String sourceEndpointPort;

	private String destinationEndpointIP;

	private String sourceEndpointInstanceType;

	private String sourceEndpointOracleSID;

	private String destinationEndpointDatabaseName;

	private String destinationEndpointPassword;

	private String sourceEndpointEngineName;
	public DescribeConnectionStatusRequest() {
		super("Dts", "2020-01-01", "DescribeConnectionStatus", "dts");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getSourceEndpointRegion() {
		return this.sourceEndpointRegion;
	}

	public void setSourceEndpointRegion(String sourceEndpointRegion) {
		this.sourceEndpointRegion = sourceEndpointRegion;
		if(sourceEndpointRegion != null){
			putQueryParameter("SourceEndpointRegion", sourceEndpointRegion);
		}
	}

	public String getSourceEndpointArchitecture() {
		return this.sourceEndpointArchitecture;
	}

	public void setSourceEndpointArchitecture(String sourceEndpointArchitecture) {
		this.sourceEndpointArchitecture = sourceEndpointArchitecture;
		if(sourceEndpointArchitecture != null){
			putQueryParameter("SourceEndpointArchitecture", sourceEndpointArchitecture);
		}
	}

	public String getDestinationEndpointInstanceType() {
		return this.destinationEndpointInstanceType;
	}

	public void setDestinationEndpointInstanceType(String destinationEndpointInstanceType) {
		this.destinationEndpointInstanceType = destinationEndpointInstanceType;
		if(destinationEndpointInstanceType != null){
			putQueryParameter("DestinationEndpointInstanceType", destinationEndpointInstanceType);
		}
	}

	public String getSourceEndpointInstanceID() {
		return this.sourceEndpointInstanceID;
	}

	public void setSourceEndpointInstanceID(String sourceEndpointInstanceID) {
		this.sourceEndpointInstanceID = sourceEndpointInstanceID;
		if(sourceEndpointInstanceID != null){
			putQueryParameter("SourceEndpointInstanceID", sourceEndpointInstanceID);
		}
	}

	public String getSourceEndpointUserName() {
		return this.sourceEndpointUserName;
	}

	public void setSourceEndpointUserName(String sourceEndpointUserName) {
		this.sourceEndpointUserName = sourceEndpointUserName;
		if(sourceEndpointUserName != null){
			putQueryParameter("SourceEndpointUserName", sourceEndpointUserName);
		}
	}

	public String getSourceEndpointDatabaseName() {
		return this.sourceEndpointDatabaseName;
	}

	public void setSourceEndpointDatabaseName(String sourceEndpointDatabaseName) {
		this.sourceEndpointDatabaseName = sourceEndpointDatabaseName;
		if(sourceEndpointDatabaseName != null){
			putQueryParameter("SourceEndpointDatabaseName", sourceEndpointDatabaseName);
		}
	}

	public String getDestinationEndpointRegion() {
		return this.destinationEndpointRegion;
	}

	public void setDestinationEndpointRegion(String destinationEndpointRegion) {
		this.destinationEndpointRegion = destinationEndpointRegion;
		if(destinationEndpointRegion != null){
			putQueryParameter("DestinationEndpointRegion", destinationEndpointRegion);
		}
	}

	public String getSourceEndpointIP() {
		return this.sourceEndpointIP;
	}

	public void setSourceEndpointIP(String sourceEndpointIP) {
		this.sourceEndpointIP = sourceEndpointIP;
		if(sourceEndpointIP != null){
			putQueryParameter("SourceEndpointIP", sourceEndpointIP);
		}
	}

	public String getDestinationEndpointUserName() {
		return this.destinationEndpointUserName;
	}

	public void setDestinationEndpointUserName(String destinationEndpointUserName) {
		this.destinationEndpointUserName = destinationEndpointUserName;
		if(destinationEndpointUserName != null){
			putQueryParameter("DestinationEndpointUserName", destinationEndpointUserName);
		}
	}

	public String getDestinationEndpointArchitecture() {
		return this.destinationEndpointArchitecture;
	}

	public void setDestinationEndpointArchitecture(String destinationEndpointArchitecture) {
		this.destinationEndpointArchitecture = destinationEndpointArchitecture;
		if(destinationEndpointArchitecture != null){
			putQueryParameter("DestinationEndpointArchitecture", destinationEndpointArchitecture);
		}
	}

	public String getDestinationEndpointOracleSID() {
		return this.destinationEndpointOracleSID;
	}

	public void setDestinationEndpointOracleSID(String destinationEndpointOracleSID) {
		this.destinationEndpointOracleSID = destinationEndpointOracleSID;
		if(destinationEndpointOracleSID != null){
			putQueryParameter("DestinationEndpointOracleSID", destinationEndpointOracleSID);
		}
	}

	public String getDestinationEndpointEngineName() {
		return this.destinationEndpointEngineName;
	}

	public void setDestinationEndpointEngineName(String destinationEndpointEngineName) {
		this.destinationEndpointEngineName = destinationEndpointEngineName;
		if(destinationEndpointEngineName != null){
			putQueryParameter("DestinationEndpointEngineName", destinationEndpointEngineName);
		}
	}

	public String getDestinationEndpointInstanceID() {
		return this.destinationEndpointInstanceID;
	}

	public void setDestinationEndpointInstanceID(String destinationEndpointInstanceID) {
		this.destinationEndpointInstanceID = destinationEndpointInstanceID;
		if(destinationEndpointInstanceID != null){
			putQueryParameter("DestinationEndpointInstanceID", destinationEndpointInstanceID);
		}
	}

	public String getDestinationEndpointPort() {
		return this.destinationEndpointPort;
	}

	public void setDestinationEndpointPort(String destinationEndpointPort) {
		this.destinationEndpointPort = destinationEndpointPort;
		if(destinationEndpointPort != null){
			putQueryParameter("DestinationEndpointPort", destinationEndpointPort);
		}
	}

	public String getSourceEndpointPassword() {
		return this.sourceEndpointPassword;
	}

	public void setSourceEndpointPassword(String sourceEndpointPassword) {
		this.sourceEndpointPassword = sourceEndpointPassword;
		if(sourceEndpointPassword != null){
			putQueryParameter("SourceEndpointPassword", sourceEndpointPassword);
		}
	}

	public String getSourceEndpointPort() {
		return this.sourceEndpointPort;
	}

	public void setSourceEndpointPort(String sourceEndpointPort) {
		this.sourceEndpointPort = sourceEndpointPort;
		if(sourceEndpointPort != null){
			putQueryParameter("SourceEndpointPort", sourceEndpointPort);
		}
	}

	public String getDestinationEndpointIP() {
		return this.destinationEndpointIP;
	}

	public void setDestinationEndpointIP(String destinationEndpointIP) {
		this.destinationEndpointIP = destinationEndpointIP;
		if(destinationEndpointIP != null){
			putQueryParameter("DestinationEndpointIP", destinationEndpointIP);
		}
	}

	public String getSourceEndpointInstanceType() {
		return this.sourceEndpointInstanceType;
	}

	public void setSourceEndpointInstanceType(String sourceEndpointInstanceType) {
		this.sourceEndpointInstanceType = sourceEndpointInstanceType;
		if(sourceEndpointInstanceType != null){
			putQueryParameter("SourceEndpointInstanceType", sourceEndpointInstanceType);
		}
	}

	public String getSourceEndpointOracleSID() {
		return this.sourceEndpointOracleSID;
	}

	public void setSourceEndpointOracleSID(String sourceEndpointOracleSID) {
		this.sourceEndpointOracleSID = sourceEndpointOracleSID;
		if(sourceEndpointOracleSID != null){
			putQueryParameter("SourceEndpointOracleSID", sourceEndpointOracleSID);
		}
	}

	public String getDestinationEndpointDatabaseName() {
		return this.destinationEndpointDatabaseName;
	}

	public void setDestinationEndpointDatabaseName(String destinationEndpointDatabaseName) {
		this.destinationEndpointDatabaseName = destinationEndpointDatabaseName;
		if(destinationEndpointDatabaseName != null){
			putQueryParameter("DestinationEndpointDatabaseName", destinationEndpointDatabaseName);
		}
	}

	public String getDestinationEndpointPassword() {
		return this.destinationEndpointPassword;
	}

	public void setDestinationEndpointPassword(String destinationEndpointPassword) {
		this.destinationEndpointPassword = destinationEndpointPassword;
		if(destinationEndpointPassword != null){
			putQueryParameter("DestinationEndpointPassword", destinationEndpointPassword);
		}
	}

	public String getSourceEndpointEngineName() {
		return this.sourceEndpointEngineName;
	}

	public void setSourceEndpointEngineName(String sourceEndpointEngineName) {
		this.sourceEndpointEngineName = sourceEndpointEngineName;
		if(sourceEndpointEngineName != null){
			putQueryParameter("SourceEndpointEngineName", sourceEndpointEngineName);
		}
	}

	@Override
	public Class<DescribeConnectionStatusResponse> getResponseClass() {
		return DescribeConnectionStatusResponse.class;
	}

}
