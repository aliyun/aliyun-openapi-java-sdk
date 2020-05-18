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

package com.aliyuncs.iotsoc.model.v20190815;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.iotsoc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetNodeConnectionRequest extends RpcAcsRequest<GetNodeConnectionResponse> {
	   

	private String ipList;

	private String deviceUuid;

	private Integer pageIndex;

	private Integer count;
	public GetNodeConnectionRequest() {
		super("Iotsoc", "2019-08-15", "GetNodeConnection", "Iotsoc");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getIpList() {
		return this.ipList;
	}

	public void setIpList(String ipList) {
		this.ipList = ipList;
		if(ipList != null){
			putBodyParameter("IpList", ipList);
		}
	}

	public String getDeviceUuid() {
		return this.deviceUuid;
	}

	public void setDeviceUuid(String deviceUuid) {
		this.deviceUuid = deviceUuid;
		if(deviceUuid != null){
			putBodyParameter("DeviceUuid", deviceUuid);
		}
	}

	public Integer getPageIndex() {
		return this.pageIndex;
	}

	public void setPageIndex(Integer pageIndex) {
		this.pageIndex = pageIndex;
		if(pageIndex != null){
			putBodyParameter("PageIndex", pageIndex.toString());
		}
	}

	public Integer getCount() {
		return this.count;
	}

	public void setCount(Integer count) {
		this.count = count;
		if(count != null){
			putBodyParameter("Count", count.toString());
		}
	}

	@Override
	public Class<GetNodeConnectionResponse> getResponseClass() {
		return GetNodeConnectionResponse.class;
	}

}
