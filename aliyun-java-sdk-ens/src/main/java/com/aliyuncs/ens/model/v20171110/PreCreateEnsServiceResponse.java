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

package com.aliyuncs.ens.model.v20171110;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.ens.transform.v20171110.PreCreateEnsServiceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class PreCreateEnsServiceResponse extends AcsResponse {

	private String requestId;

	private Integer code;

	private String ensServiceId;

	private String netLevel;

	private String buyResourcesDetail;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getEnsServiceId() {
		return this.ensServiceId;
	}

	public void setEnsServiceId(String ensServiceId) {
		this.ensServiceId = ensServiceId;
	}

	public String getNetLevel() {
		return this.netLevel;
	}

	public void setNetLevel(String netLevel) {
		this.netLevel = netLevel;
	}

	public String getBuyResourcesDetail() {
		return this.buyResourcesDetail;
	}

	public void setBuyResourcesDetail(String buyResourcesDetail) {
		this.buyResourcesDetail = buyResourcesDetail;
	}

	@Override
	public PreCreateEnsServiceResponse getInstance(UnmarshallerContext context) {
		return	PreCreateEnsServiceResponseUnmarshaller.unmarshall(this, context);
	}
}
