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

package com.aliyuncs.scdn.model.v20171115;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.scdn.transform.v20171115.DescribeScdnIpInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeScdnIpInfoResponse extends AcsResponse {

	private String requestId;

	private String ip;

	private String iSP;

	private String ispEname;

	private String region;

	private String regionEname;

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

	public String getISP() {
		return this.iSP;
	}

	public void setISP(String iSP) {
		this.iSP = iSP;
	}

	public String getIspEname() {
		return this.ispEname;
	}

	public void setIspEname(String ispEname) {
		this.ispEname = ispEname;
	}

	public String getRegion() {
		return this.region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getRegionEname() {
		return this.regionEname;
	}

	public void setRegionEname(String regionEname) {
		this.regionEname = regionEname;
	}

	@Override
	public DescribeScdnIpInfoResponse getInstance(UnmarshallerContext context) {
		return	DescribeScdnIpInfoResponseUnmarshaller.unmarshall(this, context);
	}
}
