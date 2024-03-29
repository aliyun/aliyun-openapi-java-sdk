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
import com.aliyuncs.scdn.transform.v20171115.DescribeScdnDDoSInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeScdnDDoSInfoResponse extends AcsResponse {

	private Integer secBandwidth;

	private String requestId;

	private Integer elasticBandwidth;

	public Integer getSecBandwidth() {
		return this.secBandwidth;
	}

	public void setSecBandwidth(Integer secBandwidth) {
		this.secBandwidth = secBandwidth;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getElasticBandwidth() {
		return this.elasticBandwidth;
	}

	public void setElasticBandwidth(Integer elasticBandwidth) {
		this.elasticBandwidth = elasticBandwidth;
	}

	@Override
	public DescribeScdnDDoSInfoResponse getInstance(UnmarshallerContext context) {
		return	DescribeScdnDDoSInfoResponseUnmarshaller.unmarshall(this, context);
	}
}
