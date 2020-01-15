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

package com.aliyuncs.cs.model.v20151215;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DescribeWorkflowsRequest extends RoaAcsRequest<DescribeWorkflowsResponse> {
	   
	public DescribeWorkflowsRequest() {
		super("CS", "2015-12-15", "DescribeWorkflows", "csk");
		setUriPattern("/gs/workflows");
		setMethod(MethodType.GET);
	}

	@Override
	public Class<DescribeWorkflowsResponse> getResponseClass() {
		return DescribeWorkflowsResponse.class;
	}

}
