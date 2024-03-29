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

package com.aliyuncs.cdn.model.v20180510;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.cdn.transform.v20180510.DescribeIpInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeIpInfoResponse extends AcsResponse {

	private String cdnIp;

	private String requestId;

	private String regionEname;

	private String region;

	private String ispEname;

	private String iSP;

	public String getCdnIp() {
		return this.cdnIp;
	}

	public void setCdnIp(String cdnIp) {
		this.cdnIp = cdnIp;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getRegionEname() {
		return this.regionEname;
	}

	public void setRegionEname(String regionEname) {
		this.regionEname = regionEname;
	}

	public String getRegion() {
		return this.region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getIspEname() {
		return this.ispEname;
	}

	public void setIspEname(String ispEname) {
		this.ispEname = ispEname;
	}

	public String getISP() {
		return this.iSP;
	}

	public void setISP(String iSP) {
		this.iSP = iSP;
	}

	@Override
	public DescribeIpInfoResponse getInstance(UnmarshallerContext context) {
		return	DescribeIpInfoResponseUnmarshaller.unmarshall(this, context);
	}
}
