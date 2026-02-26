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
public class CreateGlobalDataNetworkRequest extends RpcAcsRequest<CreateGlobalDataNetworkResponse> {
	   

	private String destinationType;

	private String description;

	private String sourceType;

	private String freezeSourceDuringSync;

	private String sourceId;

	private String destinationRegion;

	private String destinationId;

	private String sourceFileSystemPath;

	private String destinationFileSystemPath;

	private String sourceRegion;
	public CreateGlobalDataNetworkRequest() {
		super("polardb", "2017-08-01", "CreateGlobalDataNetwork", "polardb");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getDestinationType() {
		return this.destinationType;
	}

	public void setDestinationType(String destinationType) {
		this.destinationType = destinationType;
		if(destinationType != null){
			putQueryParameter("DestinationType", destinationType);
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public String getSourceType() {
		return this.sourceType;
	}

	public void setSourceType(String sourceType) {
		this.sourceType = sourceType;
		if(sourceType != null){
			putQueryParameter("SourceType", sourceType);
		}
	}

	public String getFreezeSourceDuringSync() {
		return this.freezeSourceDuringSync;
	}

	public void setFreezeSourceDuringSync(String freezeSourceDuringSync) {
		this.freezeSourceDuringSync = freezeSourceDuringSync;
		if(freezeSourceDuringSync != null){
			putQueryParameter("FreezeSourceDuringSync", freezeSourceDuringSync);
		}
	}

	public String getSourceId() {
		return this.sourceId;
	}

	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
		if(sourceId != null){
			putQueryParameter("SourceId", sourceId);
		}
	}

	public String getDestinationRegion() {
		return this.destinationRegion;
	}

	public void setDestinationRegion(String destinationRegion) {
		this.destinationRegion = destinationRegion;
		if(destinationRegion != null){
			putQueryParameter("DestinationRegion", destinationRegion);
		}
	}

	public String getDestinationId() {
		return this.destinationId;
	}

	public void setDestinationId(String destinationId) {
		this.destinationId = destinationId;
		if(destinationId != null){
			putQueryParameter("DestinationId", destinationId);
		}
	}

	public String getSourceFileSystemPath() {
		return this.sourceFileSystemPath;
	}

	public void setSourceFileSystemPath(String sourceFileSystemPath) {
		this.sourceFileSystemPath = sourceFileSystemPath;
		if(sourceFileSystemPath != null){
			putQueryParameter("SourceFileSystemPath", sourceFileSystemPath);
		}
	}

	public String getDestinationFileSystemPath() {
		return this.destinationFileSystemPath;
	}

	public void setDestinationFileSystemPath(String destinationFileSystemPath) {
		this.destinationFileSystemPath = destinationFileSystemPath;
		if(destinationFileSystemPath != null){
			putQueryParameter("DestinationFileSystemPath", destinationFileSystemPath);
		}
	}

	public String getSourceRegion() {
		return this.sourceRegion;
	}

	public void setSourceRegion(String sourceRegion) {
		this.sourceRegion = sourceRegion;
		if(sourceRegion != null){
			putQueryParameter("SourceRegion", sourceRegion);
		}
	}

	@Override
	public Class<CreateGlobalDataNetworkResponse> getResponseClass() {
		return CreateGlobalDataNetworkResponse.class;
	}

}
