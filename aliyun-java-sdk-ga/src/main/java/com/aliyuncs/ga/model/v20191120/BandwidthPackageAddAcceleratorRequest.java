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

package com.aliyuncs.ga.model.v20191120;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ga.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class BandwidthPackageAddAcceleratorRequest extends RpcAcsRequest<BandwidthPackageAddAcceleratorResponse> {
	   

	private String bandwidthPackageId;

	private String acceleratorId;
	public BandwidthPackageAddAcceleratorRequest() {
		super("Ga", "2019-11-20", "BandwidthPackageAddAccelerator", "gaplus");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getBandwidthPackageId() {
		return this.bandwidthPackageId;
	}

	public void setBandwidthPackageId(String bandwidthPackageId) {
		this.bandwidthPackageId = bandwidthPackageId;
		if(bandwidthPackageId != null){
			putQueryParameter("BandwidthPackageId", bandwidthPackageId);
		}
	}

	public String getAcceleratorId() {
		return this.acceleratorId;
	}

	public void setAcceleratorId(String acceleratorId) {
		this.acceleratorId = acceleratorId;
		if(acceleratorId != null){
			putQueryParameter("AcceleratorId", acceleratorId);
		}
	}

	@Override
	public Class<BandwidthPackageAddAcceleratorResponse> getResponseClass() {
		return BandwidthPackageAddAcceleratorResponse.class;
	}

}
