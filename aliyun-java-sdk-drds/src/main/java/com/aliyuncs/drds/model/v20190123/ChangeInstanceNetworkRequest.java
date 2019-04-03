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

package com.aliyuncs.drds.model.v20190123;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class ChangeInstanceNetworkRequest extends RpcAcsRequest<ChangeInstanceNetworkResponse> {
	
	public ChangeInstanceNetworkRequest() {
		super("Drds", "2019-01-23", "ChangeInstanceNetwork");
	}

	private String vswitchId;

	private Boolean retainClassic;

	private Integer classicExpiredDays;

	private String vpcId;

	private String srcInstanceNetworkType;

	private String drdsInstanceId;

	public String getVswitchId() {
		return this.vswitchId;
	}

	public void setVswitchId(String vswitchId) {
		this.vswitchId = vswitchId;
		if(vswitchId != null){
			putQueryParameter("VswitchId", vswitchId);
		}
	}

	public Boolean getRetainClassic() {
		return this.retainClassic;
	}

	public void setRetainClassic(Boolean retainClassic) {
		this.retainClassic = retainClassic;
		if(retainClassic != null){
			putQueryParameter("RetainClassic", retainClassic.toString());
		}
	}

	public Integer getClassicExpiredDays() {
		return this.classicExpiredDays;
	}

	public void setClassicExpiredDays(Integer classicExpiredDays) {
		this.classicExpiredDays = classicExpiredDays;
		if(classicExpiredDays != null){
			putQueryParameter("ClassicExpiredDays", classicExpiredDays.toString());
		}
	}

	public String getVpcId() {
		return this.vpcId;
	}

	public void setVpcId(String vpcId) {
		this.vpcId = vpcId;
		if(vpcId != null){
			putQueryParameter("VpcId", vpcId);
		}
	}

	public String getSrcInstanceNetworkType() {
		return this.srcInstanceNetworkType;
	}

	public void setSrcInstanceNetworkType(String srcInstanceNetworkType) {
		this.srcInstanceNetworkType = srcInstanceNetworkType;
		if(srcInstanceNetworkType != null){
			putQueryParameter("SrcInstanceNetworkType", srcInstanceNetworkType);
		}
	}

	public String getDrdsInstanceId() {
		return this.drdsInstanceId;
	}

	public void setDrdsInstanceId(String drdsInstanceId) {
		this.drdsInstanceId = drdsInstanceId;
		if(drdsInstanceId != null){
			putQueryParameter("DrdsInstanceId", drdsInstanceId);
		}
	}

	@Override
	public Class<ChangeInstanceNetworkResponse> getResponseClass() {
		return ChangeInstanceNetworkResponse.class;
	}

}
