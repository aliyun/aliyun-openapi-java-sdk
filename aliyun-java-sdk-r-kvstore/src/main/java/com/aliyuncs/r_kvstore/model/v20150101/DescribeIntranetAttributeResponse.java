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

package com.aliyuncs.r_kvstore.model.v20150101;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.r_kvstore.transform.v20150101.DescribeIntranetAttributeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeIntranetAttributeResponse extends AcsResponse {

	private String requestId;

	private Integer intranetBandwidth;

	private String expireTime;

	private String bandwidthExpireTime;

	private Boolean autoRenewal;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getIntranetBandwidth() {
		return this.intranetBandwidth;
	}

	public void setIntranetBandwidth(Integer intranetBandwidth) {
		this.intranetBandwidth = intranetBandwidth;
	}

	public String getExpireTime() {
		return this.expireTime;
	}

	public void setExpireTime(String expireTime) {
		this.expireTime = expireTime;
	}

	public String getBandwidthExpireTime() {
		return this.bandwidthExpireTime;
	}

	public void setBandwidthExpireTime(String bandwidthExpireTime) {
		this.bandwidthExpireTime = bandwidthExpireTime;
	}

	public Boolean getAutoRenewal() {
		return this.autoRenewal;
	}

	public void setAutoRenewal(Boolean autoRenewal) {
		this.autoRenewal = autoRenewal;
	}

	@Override
	public DescribeIntranetAttributeResponse getInstance(UnmarshallerContext context) {
		return	DescribeIntranetAttributeResponseUnmarshaller.unmarshall(this, context);
	}
}
