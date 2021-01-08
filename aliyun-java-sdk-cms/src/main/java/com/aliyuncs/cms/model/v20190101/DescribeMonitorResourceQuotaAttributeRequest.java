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

package com.aliyuncs.cms.model.v20190101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DescribeMonitorResourceQuotaAttributeRequest extends RpcAcsRequest<DescribeMonitorResourceQuotaAttributeResponse> {
	   

	private Boolean showUsed;
	public DescribeMonitorResourceQuotaAttributeRequest() {
		super("Cms", "2019-01-01", "DescribeMonitorResourceQuotaAttribute", "cms");
		setMethod(MethodType.POST);
	}

	public Boolean getShowUsed() {
		return this.showUsed;
	}

	public void setShowUsed(Boolean showUsed) {
		this.showUsed = showUsed;
		if(showUsed != null){
			putQueryParameter("ShowUsed", showUsed.toString());
		}
	}

	@Override
	public Class<DescribeMonitorResourceQuotaAttributeResponse> getResponseClass() {
		return DescribeMonitorResourceQuotaAttributeResponse.class;
	}

}
