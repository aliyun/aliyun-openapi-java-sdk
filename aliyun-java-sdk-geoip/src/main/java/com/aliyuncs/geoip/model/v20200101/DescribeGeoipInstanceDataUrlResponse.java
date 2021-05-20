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

package com.aliyuncs.geoip.model.v20200101;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.geoip.transform.v20200101.DescribeGeoipInstanceDataUrlResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeGeoipInstanceDataUrlResponse extends AcsResponse {

	private String fixedDomainDownloadUrl;

	private String requestId;

	private String downloadUrl;

	public String getFixedDomainDownloadUrl() {
		return this.fixedDomainDownloadUrl;
	}

	public void setFixedDomainDownloadUrl(String fixedDomainDownloadUrl) {
		this.fixedDomainDownloadUrl = fixedDomainDownloadUrl;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getDownloadUrl() {
		return this.downloadUrl;
	}

	public void setDownloadUrl(String downloadUrl) {
		this.downloadUrl = downloadUrl;
	}

	@Override
	public DescribeGeoipInstanceDataUrlResponse getInstance(UnmarshallerContext context) {
		return	DescribeGeoipInstanceDataUrlResponseUnmarshaller.unmarshall(this, context);
	}
}
