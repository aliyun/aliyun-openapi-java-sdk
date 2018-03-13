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
package com.aliyuncs.batchcompute.model.v20151111;

import com.aliyuncs.batchcompute.main.v20151111.BatchComputeRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version
 */
public class GetAppDetailRequest extends BatchComputeRequest<GetAppDetailResponse> {

	public GetAppDetailRequest() {
		super("BatchCompute", "2015-11-11", "GetAppDetail");
		setUriPattern("/apps/[ResourceName]?Detail=True");
		setMethod(MethodType.GET);
	}

	private String appName;

	public String getAppName() {
		return this.appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
		putPathParameter("ResourceName", appName);
	}

	public String getQualifier() {
		return qualifier;
	}

	public void setQualifier(String qualifier) {
		this.qualifier = qualifier;
		putQueryParameter("Qualifier", qualifier);
	}

	private String qualifier;


	@Override
	public Class<GetAppDetailResponse> getResponseClass() {
		return GetAppDetailResponse.class;
	}

}
