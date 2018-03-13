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
package com.aliyuncs.idst.model.v20180108;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class InstanceDetailRequest extends RoaAcsRequest<InstanceDetailResponse> {
	
	public InstanceDetailRequest() {
		super("IDST", "2018-01-08", "InstanceDetail");
		setUriPattern("/console/instance/detail");
		setMethod(MethodType.POST);
	}

	@Override
	public Class<InstanceDetailResponse> getResponseClass() {
		return InstanceDetailResponse.class;
	}

}
