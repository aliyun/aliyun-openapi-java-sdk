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

package com.aliyuncs.lrg.model.v20191010;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateNodeRequest extends RoaAcsRequest<CreateNodeResponse> {
	   
	public CreateNodeRequest() {
		super("LRG", "2019-10-10", "CreateNode");
		setUriPattern("/api/v2/tianji/node");
		setMethod(MethodType.POST);
	}

	@Override
	public Class<CreateNodeResponse> getResponseClass() {
		return CreateNodeResponse.class;
	}

}
