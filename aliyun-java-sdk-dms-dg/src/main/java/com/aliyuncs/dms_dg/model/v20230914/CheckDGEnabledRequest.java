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

package com.aliyuncs.dms_dg.model.v20230914;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CheckDGEnabledRequest extends RpcAcsRequest<CheckDGEnabledResponse> {
	   
	public CheckDGEnabledRequest() {
		super("dms-dg", "2023-09-14", "CheckDGEnabled");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	@Override
	public Class<CheckDGEnabledResponse> getResponseClass() {
		return CheckDGEnabledResponse.class;
	}

}
