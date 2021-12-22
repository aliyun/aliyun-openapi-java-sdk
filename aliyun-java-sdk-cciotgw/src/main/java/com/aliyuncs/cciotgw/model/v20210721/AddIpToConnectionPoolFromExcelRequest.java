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

package com.aliyuncs.cciotgw.model.v20210721;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class AddIpToConnectionPoolFromExcelRequest extends RpcAcsRequest<AddIpToConnectionPoolFromExcelResponse> {
	   

	private String ipOssExcelName;

	private String isp;

	private String cciotGwId;

	private String connectionPoolId;

	private String cciotId;

	private String apn;

	private String status;
	public AddIpToConnectionPoolFromExcelRequest() {
		super("CCIoTGW", "2021-07-21", "AddIpToConnectionPoolFromExcel");
		setMethod(MethodType.GET);
	}

	public String getIpOssExcelName() {
		return this.ipOssExcelName;
	}

	public void setIpOssExcelName(String ipOssExcelName) {
		this.ipOssExcelName = ipOssExcelName;
		if(ipOssExcelName != null){
			putQueryParameter("IpOssExcelName", ipOssExcelName);
		}
	}

	public String getIsp() {
		return this.isp;
	}

	public void setIsp(String isp) {
		this.isp = isp;
		if(isp != null){
			putQueryParameter("Isp", isp);
		}
	}

	public String getCciotGwId() {
		return this.cciotGwId;
	}

	public void setCciotGwId(String cciotGwId) {
		this.cciotGwId = cciotGwId;
		if(cciotGwId != null){
			putQueryParameter("CciotGwId", cciotGwId);
		}
	}

	public String getConnectionPoolId() {
		return this.connectionPoolId;
	}

	public void setConnectionPoolId(String connectionPoolId) {
		this.connectionPoolId = connectionPoolId;
		if(connectionPoolId != null){
			putQueryParameter("ConnectionPoolId", connectionPoolId);
		}
	}

	public String getCciotId() {
		return this.cciotId;
	}

	public void setCciotId(String cciotId) {
		this.cciotId = cciotId;
		if(cciotId != null){
			putQueryParameter("CciotId", cciotId);
		}
	}

	public String getApn() {
		return this.apn;
	}

	public void setApn(String apn) {
		this.apn = apn;
		if(apn != null){
			putQueryParameter("Apn", apn);
		}
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
		if(status != null){
			putQueryParameter("Status", status);
		}
	}

	@Override
	public Class<AddIpToConnectionPoolFromExcelResponse> getResponseClass() {
		return AddIpToConnectionPoolFromExcelResponse.class;
	}

}
