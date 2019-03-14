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

package com.aliyuncs.sas_api.model.v20170705;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.sas_api.transform.v20170705.DescribeAccountProfileByKeyWordResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAccountProfileByKeyWordResponse extends AcsResponse {

	private String requestId;

	private String ip;

	private String ipInfo;

	private String phone;

	private String phoneInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getIp() {
		return this.ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getIpInfo() {
		return this.ipInfo;
	}

	public void setIpInfo(String ipInfo) {
		this.ipInfo = ipInfo;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPhoneInfo() {
		return this.phoneInfo;
	}

	public void setPhoneInfo(String phoneInfo) {
		this.phoneInfo = phoneInfo;
	}

	@Override
	public DescribeAccountProfileByKeyWordResponse getInstance(UnmarshallerContext context) {
		return	DescribeAccountProfileByKeyWordResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
