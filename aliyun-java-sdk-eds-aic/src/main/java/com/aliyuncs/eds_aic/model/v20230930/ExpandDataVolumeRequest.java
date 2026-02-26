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

package com.aliyuncs.eds_aic.model.v20230930;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ExpandDataVolumeRequest extends RpcAcsRequest<ExpandDataVolumeResponse> {
	   

	private String bizRegionId;

	private Boolean autoPay;

	private Integer shareDataVolume;

	private List<String> nodeIdss;
	public ExpandDataVolumeRequest() {
		super("eds-aic", "2023-09-30", "ExpandDataVolume");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public String getBizRegionId() {
		return this.bizRegionId;
	}

	public void setBizRegionId(String bizRegionId) {
		this.bizRegionId = bizRegionId;
		if(bizRegionId != null){
			putQueryParameter("BizRegionId", bizRegionId);
		}
	}

	public Boolean getAutoPay() {
		return this.autoPay;
	}

	public void setAutoPay(Boolean autoPay) {
		this.autoPay = autoPay;
		if(autoPay != null){
			putQueryParameter("AutoPay", autoPay.toString());
		}
	}

	public Integer getShareDataVolume() {
		return this.shareDataVolume;
	}

	public void setShareDataVolume(Integer shareDataVolume) {
		this.shareDataVolume = shareDataVolume;
		if(shareDataVolume != null){
			putQueryParameter("ShareDataVolume", shareDataVolume.toString());
		}
	}

	public List<String> getNodeIdss() {
		return this.nodeIdss;
	}

	public void setNodeIdss(List<String> nodeIdss) {
		this.nodeIdss = nodeIdss;	
		if (nodeIdss != null) {
			for (int i = 0; i < nodeIdss.size(); i++) {
				putQueryParameter("NodeIds." + (i + 1) , nodeIdss.get(i));
			}
		}	
	}

	@Override
	public Class<ExpandDataVolumeResponse> getResponseClass() {
		return ExpandDataVolumeResponse.class;
	}

}
