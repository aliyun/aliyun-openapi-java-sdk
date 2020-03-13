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

package com.aliyuncs.sofa.model.v20190815;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class AddMsRcSyncBucketRequest extends RpcAcsRequest<AddMsRcSyncBucketResponse> {
	   

	private Boolean autoStart;

	private String sourceCluster;

	private Boolean twoWaySync;

	private String targetCluster;

	private String clusterTaskUniqueKey;

	private String instanceId;
	public AddMsRcSyncBucketRequest() {
		super("SOFA", "2019-08-15", "AddMsRcSyncBucket", "ApplySidecarCert");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Boolean getAutoStart() {
		return this.autoStart;
	}

	public void setAutoStart(Boolean autoStart) {
		this.autoStart = autoStart;
		if(autoStart != null){
			putBodyParameter("AutoStart", autoStart.toString());
		}
	}

	public String getSourceCluster() {
		return this.sourceCluster;
	}

	public void setSourceCluster(String sourceCluster) {
		this.sourceCluster = sourceCluster;
		if(sourceCluster != null){
			putBodyParameter("SourceCluster", sourceCluster);
		}
	}

	public Boolean getTwoWaySync() {
		return this.twoWaySync;
	}

	public void setTwoWaySync(Boolean twoWaySync) {
		this.twoWaySync = twoWaySync;
		if(twoWaySync != null){
			putBodyParameter("TwoWaySync", twoWaySync.toString());
		}
	}

	public String getTargetCluster() {
		return this.targetCluster;
	}

	public void setTargetCluster(String targetCluster) {
		this.targetCluster = targetCluster;
		if(targetCluster != null){
			putBodyParameter("TargetCluster", targetCluster);
		}
	}

	public String getClusterTaskUniqueKey() {
		return this.clusterTaskUniqueKey;
	}

	public void setClusterTaskUniqueKey(String clusterTaskUniqueKey) {
		this.clusterTaskUniqueKey = clusterTaskUniqueKey;
		if(clusterTaskUniqueKey != null){
			putBodyParameter("ClusterTaskUniqueKey", clusterTaskUniqueKey);
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putBodyParameter("InstanceId", instanceId);
		}
	}

	@Override
	public Class<AddMsRcSyncBucketResponse> getResponseClass() {
		return AddMsRcSyncBucketResponse.class;
	}

}
