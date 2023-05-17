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
import com.aliyuncs.cs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeClusterAddonInstanceRequest extends RoaAcsRequest<DescribeClusterAddonInstanceResponse> {
	   

	private String addonName;

	private String clusterID;
	public DescribeClusterAddonInstanceRequest() {
		super("CS", "2015-12-15", "DescribeClusterAddonInstance");
		setUriPattern("/clusters/[ClusterID]/components/[AddonName]/instance");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getAddonName() {
		return this.addonName;
	}

	public void setAddonName(String addonName) {
		this.addonName = addonName;
		if(addonName != null){
			putPathParameter("AddonName", addonName);
		}
	}

	public String getClusterID() {
		return this.clusterID;
	}

	public void setClusterID(String clusterID) {
		this.clusterID = clusterID;
		if(clusterID != null){
			putPathParameter("ClusterID", clusterID);
		}
	}

	@Override
	public Class<DescribeClusterAddonInstanceResponse> getResponseClass() {
		return DescribeClusterAddonInstanceResponse.class;
	}

}
