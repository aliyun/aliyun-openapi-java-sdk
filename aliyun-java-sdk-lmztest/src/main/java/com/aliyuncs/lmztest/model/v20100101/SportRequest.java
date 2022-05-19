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

package com.aliyuncs.lmztest.model.v20100101;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class SportRequest extends RoaAcsRequest<SportResponse> {
	   
	public SportRequest() {
		super("LmzTest", "2010-01-01", "Sport");
		setUriPattern("/sport");
		setMethod(MethodType.GET);
	}

	@Override
	public Class<SportResponse> getResponseClass() {
		return SportResponse.class;
	}

}
