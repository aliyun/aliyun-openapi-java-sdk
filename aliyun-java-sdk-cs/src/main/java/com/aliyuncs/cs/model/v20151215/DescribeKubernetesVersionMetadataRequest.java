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

package com.aliyuncs.cs.model.v20151215;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DescribeKubernetesVersionMetadataRequest extends RoaAcsRequest<DescribeKubernetesVersionMetadataResponse> {
	
	public DescribeKubernetesVersionMetadataRequest() {
		super("CS", "2015-12-15", "DescribeKubernetesVersionMetadata");
		setUriPattern("/api/v1/metadata/versions");
		setMethod(MethodType.GET);
	}

	private String clusterType;

	private Boolean multiAZ;

	private String kubernetesVersion;

	private String region;

	public String getClusterType() {
		return this.clusterType;
	}

	public void setClusterType(String clusterType) {
		this.clusterType = clusterType;
		if(clusterType != null){
			putQueryParameter("ClusterType", clusterType);
		}
	}

	public Boolean getMultiAZ() {
		return this.multiAZ;
	}

	public void setMultiAZ(Boolean multiAZ) {
		this.multiAZ = multiAZ;
		if(multiAZ != null){
			putQueryParameter("MultiAZ", multiAZ.toString());
		}
	}

	public String getKubernetesVersion() {
		return this.kubernetesVersion;
	}

	public void setKubernetesVersion(String kubernetesVersion) {
		this.kubernetesVersion = kubernetesVersion;
		if(kubernetesVersion != null){
			putQueryParameter("KubernetesVersion", kubernetesVersion);
		}
	}

	public String getRegion() {
		return this.region;
	}

	public void setRegion(String region) {
		this.region = region;
		if(region != null){
			putQueryParameter("Region", region);
		}
	}

	@Override
	public Class<DescribeKubernetesVersionMetadataResponse> getResponseClass() {
		return DescribeKubernetesVersionMetadataResponse.class;
	}

}
