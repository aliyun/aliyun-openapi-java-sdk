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

package com.aliyuncs.market_inner.model.v20160801;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class InnerSubmitImageSecurityAuditResultRequest extends RpcAcsRequest<InnerSubmitImageSecurityAuditResultResponse> {
	
	public InnerSubmitImageSecurityAuditResultRequest() {
		super("Market-Inner", "2016-08-01", "InnerSubmitImageSecurityAuditResult", "yunmarket", "innerAPI");
	}

	private String productCode;

	private Integer pass;

	private String imageVersion;

	private String channel;

	private String imageNo;

	private String remark;

	private String operator;

	private String regionNo;

	public String getProductCode() {
		return this.productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
		if(productCode != null){
			putQueryParameter("ProductCode", productCode);
		}
	}

	public Integer getPass() {
		return this.pass;
	}

	public void setPass(Integer pass) {
		this.pass = pass;
		if(pass != null){
			putQueryParameter("Pass", pass.toString());
		}
	}

	public String getImageVersion() {
		return this.imageVersion;
	}

	public void setImageVersion(String imageVersion) {
		this.imageVersion = imageVersion;
		if(imageVersion != null){
			putQueryParameter("ImageVersion", imageVersion);
		}
	}

	public String getChannel() {
		return this.channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
		if(channel != null){
			putQueryParameter("Channel", channel);
		}
	}

	public String getImageNo() {
		return this.imageNo;
	}

	public void setImageNo(String imageNo) {
		this.imageNo = imageNo;
		if(imageNo != null){
			putQueryParameter("ImageNo", imageNo);
		}
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
		if(remark != null){
			putQueryParameter("Remark", remark);
		}
	}

	public String getOperator() {
		return this.operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
		if(operator != null){
			putQueryParameter("Operator", operator);
		}
	}

	public String getRegionNo() {
		return this.regionNo;
	}

	public void setRegionNo(String regionNo) {
		this.regionNo = regionNo;
		if(regionNo != null){
			putQueryParameter("RegionNo", regionNo);
		}
	}

	@Override
	public Class<InnerSubmitImageSecurityAuditResultResponse> getResponseClass() {
		return InnerSubmitImageSecurityAuditResultResponse.class;
	}

}
