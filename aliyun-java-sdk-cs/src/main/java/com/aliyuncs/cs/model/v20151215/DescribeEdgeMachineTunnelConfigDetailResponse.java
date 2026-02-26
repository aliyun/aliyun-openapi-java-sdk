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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.cs.transform.v20151215.DescribeEdgeMachineTunnelConfigDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeEdgeMachineTunnelConfigDetailResponse extends AcsResponse {

	private String model;

	private String sn;

	private String tunnel_endpoint;

	private String token;

	private String product_key;

	private String device_name;

	private String request_id;

	public String getModel() {
		return this.model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getSn() {
		return this.sn;
	}

	public void setSn(String sn) {
		this.sn = sn;
	}

	public String getTunnel_endpoint() {
		return this.tunnel_endpoint;
	}

	public void setTunnel_endpoint(String tunnel_endpoint) {
		this.tunnel_endpoint = tunnel_endpoint;
	}

	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getProduct_key() {
		return this.product_key;
	}

	public void setProduct_key(String product_key) {
		this.product_key = product_key;
	}

	public String getDevice_name() {
		return this.device_name;
	}

	public void setDevice_name(String device_name) {
		this.device_name = device_name;
	}

	public String getRequest_id() {
		return this.request_id;
	}

	public void setRequest_id(String request_id) {
		this.request_id = request_id;
	}

	@Override
	public DescribeEdgeMachineTunnelConfigDetailResponse getInstance(UnmarshallerContext context) {
		return	DescribeEdgeMachineTunnelConfigDetailResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
